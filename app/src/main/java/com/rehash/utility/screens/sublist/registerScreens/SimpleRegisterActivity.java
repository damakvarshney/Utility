package com.rehash.utility.screens.sublist.registerScreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rehash.utility.R;
import com.rehash.utility.screens.HomeScreen;
import com.rehash.utility.screens.sublist.loginScreens.SimpleLoginScreen;

public class SimpleRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_register);




    }

    public void to_SimpleLogin(View view) {
        Intent intent = new Intent(this, SimpleLoginScreen.class);
        startActivity(intent);
    }

    public void to_Sample_Screen(View view) {
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }
}