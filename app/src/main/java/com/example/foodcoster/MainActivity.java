package com.example.foodcoster;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.foodcoster.Category.RecyclerViewCategory;
import com.example.foodcoster.Dishesh.RecyclerViewDishesh;
import com.example.foodcoster.Network.ApiClass;
import com.example.foodcoster.Network.ApiInterface;
import com.example.foodcoster.Restaurant.RecyclerViewRestaurant;
import com.example.foodcoster.Testimonials.recyclerVieOurTestimonials;
import com.example.foodcoster.model.PremiumMemberModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerViewCategory,recyclerViewBestSellerDishesh,recyclerVieFavouriteRestaurants,recyclerVieOurTestimonials;
Toolbar toolbar;
DrawerLayout dl;
SearchView search;

ApiInterface apiInterface ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        apiInterface = ApiClass.getclient().create(ApiInterface.class);
        search =findViewById(R.id.searh);
        search.setIconifiedByDefault(false);

        recyclerViewCategory=findViewById (R.id.recyclerViewCategory);
        recyclerViewBestSellerDishesh=findViewById (R.id.recyclerViewBestSellerDishesh);
        recyclerVieFavouriteRestaurants=findViewById (R.id.recyclerVieFavouriteRestaurants);
        recyclerVieOurTestimonials=findViewById(R.id.recyclerVieOurTestimonials);
        toolbar=findViewById (R.id.toolbar);
        dl=findViewById (R.id.dl);
        initToolbar();
        initRecyclerView();
        //gepPremiumData();
    }

    /*private void gepPremiumData() {
        Call<PremiumMemberModel> call = apiInterface.getPremiummember();
        call.enqueue(new Callback<PremiumMemberModel>() {
            @Override
            public void onResponse(Call<PremiumMemberModel> call, Response<PremiumMemberModel> response) {

                if (response.body() != null)
                {
                    PremiumMemberModel premiumMemberModel = response.body();
                    Toast.makeText(MainActivity.this, ""+premiumMemberModel.toString(), Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<PremiumMemberModel> call, Throwable t) {

            }
        });
    }*/

    private void initToolbar() {
        setSupportActionBar (toolbar);
        ActionBarDrawerToggle abdt=new ActionBarDrawerToggle (this,dl,toolbar,R.string.app_name,R.string.app_name);
        dl.addDrawerListener(abdt);
        abdt.syncState();
    }


    private void initRecyclerView() {
        recyclerViewCategory.setLayoutManager (new LinearLayoutManager(MainActivity.this,RecyclerView.HORIZONTAL,false));
        recyclerViewBestSellerDishesh.setLayoutManager (new LinearLayoutManager(MainActivity.this,RecyclerView.HORIZONTAL,false));
        recyclerVieFavouriteRestaurants.setLayoutManager (new LinearLayoutManager(MainActivity.this,RecyclerView.HORIZONTAL,false));
        recyclerVieOurTestimonials.setLayoutManager(new LinearLayoutManager(MainActivity.this,RecyclerView.HORIZONTAL,false));
        recyclerViewCategory.setAdapter (new RecyclerViewCategory (MainActivity.this));
        recyclerViewBestSellerDishesh.setAdapter (new RecyclerViewDishesh (MainActivity.this));
        recyclerVieFavouriteRestaurants.setAdapter (new RecyclerViewRestaurant (MainActivity.this));
        recyclerVieOurTestimonials.setAdapter(new recyclerVieOurTestimonials(MainActivity.this));
    }
}