package com.nadeveloper.nola.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cuisine_ {

    @SerializedName("cuisine_id")
    @Expose
    private Integer cuisineId;
    @SerializedName("cuisine_name")
    @Expose
    private String cuisineName;

    public Integer getCuisineId() {
        return cuisineId;
    }


    public String getCuisineName() {
        return cuisineName;
    }


}