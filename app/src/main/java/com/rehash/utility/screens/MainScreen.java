package com.rehash.utility.screens;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rehash.utility.R;
import com.rehash.utility.adapter.MainScreenAdapter;
import com.rehash.utility.user.MainScreenUser;

import java.util.ArrayList;

public class MainScreen extends AppCompatActivity {

    RecyclerView rvScreensList;
    MainScreenAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        //findViewById's
        rvScreensList = findViewById(R.id.rv_screen_list);
        ArrayList<MainScreenUser> screensArray = new ArrayList<>();
        rvScreensList.setHasFixedSize(true);
        rvScreensList.setItemAnimator(new DefaultItemAnimator());

        //setting values
        MainScreenUser login = new MainScreenUser("Login Screens", R.drawable.ic_baseline_data_usage_24);
        screensArray.add(login);
        MainScreenUser register = new MainScreenUser("Register Screens", R.drawable.ic_baseline_data_usage_24);
        screensArray.add(register);
        MainScreenUser buttons = new MainScreenUser("Different Buttons", R.drawable.ic_baseline_data_usage_24);
        screensArray.add(buttons);
        MainScreenUser editText = new MainScreenUser("Different EditText", R.drawable.ic_baseline_data_usage_24);
        screensArray.add(editText);
        MainScreenUser splash = new MainScreenUser("Splash Screens", R.drawable.ic_baseline_data_usage_24);
        screensArray.add(splash);
        MainScreenUser screens = new MainScreenUser("Different Screens", R.drawable.ic_baseline_data_usage_24);
        screensArray.add(screens);

        //Setting layout Manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvScreensList.setLayoutManager(linearLayoutManager);

        //Setting array adapter
        adapter = new MainScreenAdapter(this, screensArray);
        rvScreensList.setAdapter(adapter);



    }

}
