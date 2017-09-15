package com.example.khutsomatlala.hackaton_user11;

import java.io.Serializable;

/**
 * Created by khutsomatlala on 2017/08/29.
 */

public class ImageUpload  implements Serializable{

    //Data members
    public String placeName;
    public  String placeInfo;
    public String placeAddress;
    public   String placeCell;
    public   String placeHours;
    public String placeWebsite;
    public  String placeLongitude;
    public String placeLatitude;
    private String urI;


    //For user

    public ImageUpload() {

    }


    public ImageUpload(String comment,String rate) {

    }

    public ImageUpload(String placeName,
                       String placeInfo,
                       String placeAddress,
                       String placeCell,
                       String placeHours,
                       String placeWebsite,
                       String placeLongitude,
                       String placeLatitude,
                       String urI) {

        this.placeName = placeName;
        this.placeInfo = placeInfo;
        this.placeAddress = placeAddress;
        this.placeCell = placeCell;
        this.placeHours = placeHours;
        this.placeWebsite = placeWebsite;
        this.placeLongitude = placeLongitude;
        this.placeLatitude = placeLatitude;
        this.urI = urI;
    }

    //getters
    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceInfo(){
        return placeInfo;
    }

    public String getPlaceAddress(){
        return placeAddress;
    }

    public String getPlaceCell(){
        return placeCell;
    }

    public String getPlaceHours(){
        return placeHours;
    }


    public String getPlaceWebsite(){
        return placeWebsite;
    }

    public   String getPlaceLongitude(){
        return placeLongitude;
    }

    public   String getPlaceLatitude(){
        return placeLatitude;
    }
    public String getUrI() {
        return urI;
    }


}
