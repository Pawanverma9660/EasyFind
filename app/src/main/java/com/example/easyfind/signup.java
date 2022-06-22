package com.example.easyfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.easyfind.databinding.ActivitySignupBinding;

public class signup extends AppCompatActivity {
    ActivitySignupBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


       /* binding.signbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(signup.this,MainActivity.class);
                startActivity(intent);
            }
        });*/


        binding.alredyaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup.this, MainActivity.class);
                startActivity(intent);
            }
        });

        binding.signbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup.this, thanksregister.class);
                startActivity(intent);
            }
        });



    }
}

/*

    internal fun showBottomSheetForPay_alert() {
    try {
        val view = layoutInflater.inflate(
                R.layout.w3_pay_alert_popup,
                null
        )
        val dialog = BottomSheetDialog(this)
        dialog.setContentView(view)
        view.confirm_pay_btn.setOnClickListener {
            dialog.dismiss()
            clickedOnPay()
            W3Utilities.setStringValue(this, W3Utilities.SHARED_FirstCollectReq,"true")*/
