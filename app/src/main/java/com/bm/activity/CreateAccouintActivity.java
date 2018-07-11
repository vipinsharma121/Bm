package com.bm.activity;

import android.content.AsyncTaskLoader;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.bm.R;

public class CreateAccouintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_accouint);
//        android.support.v7.app.ActionBar bar = getSupportActionBar();
//        bar.hide();

        Button btn=(Button)findViewById(R.id.buttonAccount);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),IconTextTabsActivity.class);
                startActivity(intent);
            }
        });


    }

}
