package com.nadeveloper.nola;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import com.nadeveloper.nola.Fragments.RestaurantDetailFragment;


public class DetailActivity extends AppCompatActivity {

    private boolean isTablet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
        isTablet = this.getResources().getBoolean(R.bool.isTablet);
        if(isTablet) {
            finish();
        }
        setFragment();
    }

    private void setFragment() {
        RestaurantDetailFragment fragment = new RestaurantDetailFragment();
        if(getIntent()!=null)
            fragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(R.id.restaurantDetailContainer, fragment).commit();
    }

}