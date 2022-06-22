package com.example.easyfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.easyfind.databinding.ActivitySignupBinding;
import com.example.easyfind.databinding.ActivityWelcomeBinding;


public class welcome extends AppCompatActivity {
    ActivityWelcomeBinding binding;
    private static int SPLASH_TIME_OUT = 5000 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityWelcomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent homeIntent = new Intent(welcome.this, MainActivity.class);
                startActivity(homeIntent);
                finish();
            }

        },SPLASH_TIME_OUT ) ;




    }
}