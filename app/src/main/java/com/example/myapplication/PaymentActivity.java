package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_payment);
        Intent intent = getIntent();
        String action = intent.getAction();
        Uri data = intent.getData();
        String id = data.getQueryParameter("id");
        if(data != null) {
            Log.d(action, "id from Data " + id + " data " + data);
        }
    }
}