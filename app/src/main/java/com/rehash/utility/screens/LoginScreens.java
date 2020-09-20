package com.rehash.utility.screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.rehash.utility.R;
import com.rehash.utility.adapter.LoginScreenAdapter;
import com.rehash.utility.user.LoginScreenUser;

import java.util.ArrayList;

public class LoginScreens extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screens);

        //findViewById's
        RecyclerView allLoginScreens = findViewById(R.id.rv_screen_list);
        ArrayList<LoginScreenUser> listOfLoginScreens = new ArrayList<>();
        allLoginScreens.setHasFixedSize(true);
        allLoginScreens.setItemAnimator(new DefaultItemAnimator());

        //setting values
        LoginScreenUser SimpleLoginScreen = new LoginScreenUser(R.drawable.ic_baseline_offline_bolt_24,"Simple Login Screen","This login screen contains only two Input TextInputEditors");
        listOfLoginScreens.add(SimpleLoginScreen);
        LoginScreenUser register = new LoginScreenUser(R.drawable.ic_baseline_offline_bolt_24,"LogInBox Screen","This login screen contains a box with two Input TextInputEditors and Image.");
        listOfLoginScreens.add(register);

        //Setting layout Manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        allLoginScreens.setLayoutManager(linearLayoutManager);

        //Setting array adapter
        LoginScreenAdapter adapter = new LoginScreenAdapter(this, listOfLoginScreens);
        allLoginScreens.setAdapter(adapter);
    }
}