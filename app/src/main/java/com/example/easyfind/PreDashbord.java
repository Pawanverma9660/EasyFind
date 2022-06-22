package com.example.easyfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.easyfind.databinding.ActivityPreDashbordBinding;

public class PreDashbord extends AppCompatActivity {
    ActivityPreDashbordBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityPreDashbordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(PreDashbord.this,Dashboard.class);
                startActivity(intent);
            }
        });








    }
}