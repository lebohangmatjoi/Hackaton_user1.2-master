package com.example.khutsomatlala.hackaton_user11;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.CollapsingToolbarLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

@RequiresApi(api = Build.VERSION_CODES.N)
public class DetailActivity extends Activity {


//        try {


    String call;
    String lat;
    String lon;
    String PlaceName;
    String infor;
    String address;
    String hours;
    String pic;



    //rating
    RatingBar ratingRatingBar;
    TextView ratingDisplayTextView;
    String rateMessage;

    ImageView middlePic;
    TextView   txtInformation, txtAddress, txtCell, txtHours;

    private CollapsingToolbarLayout collapsingToolbarLayout = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent i = getIntent();

        lat = i.getStringExtra("lat");
        lon = i.getStringExtra("lon");
        call = i.getStringExtra("call");
        PlaceName = i.getStringExtra("name");
        infor = i.getStringExtra("infor");
        address = i.getStringExtra("address");
        hours = i.getStringExtra("hours");
        pic = i.getStringExtra("pic");


        txtInformation =  findViewById(R.id.txtInformation);
        txtAddress =   findViewById(R.id.txtAddress);
        txtCell =   findViewById(R.id.txtCell);
        txtHours =  findViewById(R.id.txtHours);

        middlePic =  findViewById(R.id.middlePic);

        Glide.with(this)
                .load(pic)
                 .override(300, 200)
              //  .centerCrop()
                .into(middlePic);


        collapsingToolbarLayout =  findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle(PlaceName);

        txtInformation.setText("Description - " + infor);
        txtAddress.setText("Address - " + address);
        txtCell.setText("Cell - " + call);
        txtHours.setText("operating hours - " + hours);


        //rating bar

        ratingRatingBar = findViewById(R.id.rating_rating_bar);
        ratingDisplayTextView = findViewById(R.id.rating_display_text_View);
        ratingRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                if( ratingRatingBar.getRating() == 1){
                    rateMessage = "Hated it";

                }
                else if(  (int)v == 2)
                {
                    rateMessage = "Disliked it";
                }
                else if( (int)v == 3)
                {
                    rateMessage = "It's OK";
                }
                else if( (int)v == 4)
                {
                    rateMessage = "Liked it";
                }
                else {
                    rateMessage = "Loved it";
                }

                ratingDisplayTextView.setText( "" + rateMessage);
            }


        });

    }


    public void Call(View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + call));
        startActivity(intent);
    }

    public void direction(View view) {
        Intent intent = new Intent(getApplicationContext(), MapsActivity.class);

        intent.putExtra("lat", lat);
        intent.putExtra("lon", lon);
        intent.putExtra("name", PlaceName);
        startActivity(intent);
    }

    public void GoToBook(View view){

         Intent i = new Intent(getApplicationContext(),book_new.class);
         i.putExtra("pic",pic);
         startActivity(i);

    }




}

