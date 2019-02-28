package com.nadeveloper.nola.Utils;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.nadeveloper.nola.DB.RestaurantDatabase;
import com.nadeveloper.nola.Model.Restaurant_;

public class RestaurantViewModel extends ViewModel {

    private LiveData<Restaurant_> restaurantLiveData;

    public LiveData<Restaurant_> getRestaurantLiveData() {
        return restaurantLiveData;
    }

    public RestaurantViewModel(RestaurantDatabase restaurantDatabase, String id) {
        restaurantLiveData = restaurantDatabase.restaurantDao().loadSingleRestaurant(id);
    }
}