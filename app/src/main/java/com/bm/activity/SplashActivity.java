package com.bm.activity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.bm.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class SplashActivity extends AppCompatActivity {
    SimpleDateFormat dateFormat;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
//        android.support.v7.app.ActionBar bar = getSupportActionBar();
//        bar.hide();

//        Calendar cal = Calendar.getInstance ();
//        dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
//        cal.add(Calendar.DATE, -1);
//        String str= dateFormat.format(cal.getTime());
//        Log.e("Day is----------",dateFormat.format(cal.getTime()));


        Button btn=(Button)findViewById(R.id.buttonStart);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),OtpActivity.class);
                startActivity(intent);
            }
        });

    }




}
