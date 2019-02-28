package com.nadeveloper.nola.API;

import com.nadeveloper.nola.BuildConfig;
import com.nadeveloper.nola.Model.CuisineSearch;
import com.nadeveloper.nola.Model.RestaurantSearch;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface RestaurantAPIService {

    String apiKey = BuildConfig.API_KEY;

    @Headers({
            "Accept: application/json",
            "user-key: " + apiKey
    })
    @GET("search")
    Call<RestaurantSearch> getRestaurants(@Query("lat") String lat, @Query("lon") String lon, @Query("radius") String radius, @Query("cuisines") String cuisineIds, @Query("sort") String sortBy, @Query("order") String sortOrder);

    @Headers({
            "Accept: application/json",
            "user-key: " + apiKey
    })
    @GET("cuisines")
    Call<CuisineSearch> getCuisines(@Query("lat") String lat, @Query("lon") String lon);
}