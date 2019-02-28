package com.nadeveloper.nola.Utils;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

import com.nadeveloper.nola.DB.RestaurantDatabase;
import com.nadeveloper.nola.Model.Restaurant_;

public class RestaurantsViewModel extends AndroidViewModel {

    private LiveData<List<Restaurant_>> restaurants;

    public RestaurantsViewModel(@NonNull Application application) {
        super(application);
        RestaurantDatabase restaurantDatabase = RestaurantDatabase.getInstance(getApplication());
        restaurants = restaurantDatabase.restaurantDao().loadFavoriteRestaurants();
    }

    public LiveData<List<Restaurant_>> getRestaurants() {
        return restaurants;
    }
}