package com.rehash.utility.screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rehash.utility.R;
import com.rehash.utility.adapter.RegisterScreenAdapter;
import com.rehash.utility.user.RegisterScreenUser;

import java.util.ArrayList;

public class RegisterScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);

        //findViewById's
        RecyclerView allRegisterScreens = findViewById(R.id.rv_screen_list);
        ArrayList<RegisterScreenUser> listOfRegisterScreens = new ArrayList<>();
        allRegisterScreens.setHasFixedSize(true);
        allRegisterScreens.setItemAnimator(new DefaultItemAnimator());

        //setting values
        RegisterScreenUser SimpleLoginScreen = new RegisterScreenUser(R.drawable.ic_baseline_radio_button_checked_24,"Simple Register Screen","This login screen contains only two Input TextInputEditors");
        listOfRegisterScreens.add(SimpleLoginScreen);

        //Setting layout Manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        allRegisterScreens.setLayoutManager(linearLayoutManager);

        //Setting array adapter
        RegisterScreenAdapter adapter = new RegisterScreenAdapter(this, listOfRegisterScreens);
        allRegisterScreens.setAdapter(adapter);
    }
}