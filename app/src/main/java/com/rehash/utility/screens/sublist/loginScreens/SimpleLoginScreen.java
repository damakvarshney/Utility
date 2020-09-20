package com.rehash.utility.screens.sublist.loginScreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;
import com.rehash.utility.R;
import com.rehash.utility.screens.HomeScreen;

public class SimpleLoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_login_screen);

        Button submitButton = findViewById(R.id.submit_button);
        EditText mobileNumber = findViewById(R.id.et_mobile_no);

        mobileNumber.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SimpleLoginScreen.this, HomeScreen.class);
                startActivity(intent);
            }
        });
    }
}