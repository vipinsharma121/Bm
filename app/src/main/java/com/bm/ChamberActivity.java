package com.bm;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
public class ChamberActivity extends AppCompatActivity {
    Button btn1;

    Button b;
    ScrollView scrollview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chamber);

//        LinearLayout root=(LinearLayout)findViewById(R.id.master);
//        for (int i = 1; i <= 20; i++) {
//            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
//                    LinearLayout.LayoutParams.MATCH_PARENT,
//                    LinearLayout.LayoutParams.WRAP_CONTENT);
//            params.setMargins(50, 20, 50, 0);
//            Button btn = new Button(this);
//            btn.setId(i);
//            final int id_ = btn.getId();
//            btn.setText("button " + id_);
//            btn.setBackgroundColor(Color.parseColor("#EC7063"));
//            root.addView(btn, params);
//            btn1 = ((Button) findViewById(id_));
//            btn1.setOnClickListener(new View.OnClickListener() {
//                public void onClick(View view) {
//                    Toast.makeText(view.getContext(),
//                            "Button clicked index = " + id_, Toast.LENGTH_SHORT)
//                            .show();
//                }
//            });
//        }
        different();


//
    }
    public void genrate()
    {
        ScrollView scrollView= new ScrollView(this);
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        for (int i=0; i<5; i++){
            LinearLayout ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.HORIZONTAL);

            ll.setTag(i);
            Button btn=new Button(this);
            btn.setText("Chamber " + i);
            btn.setPadding(10,5,5,5);
            btn.setBackgroundColor(Color.parseColor("#EC7063"));
            ll.addView(btn);


            Button b = new Button(this);
            b.setTag(i);
            b.setText("Chamber " + i);
            b.setPadding(10,5,5,5);

            ll.addView(b);



            Button c = new Button(this);
            c.setTag(i);
            c.setText("Chamber " + i);

            c.setBackgroundColor(Color.parseColor("#EC7063"));
            btn.setPadding(10,5,5,5);
            ll.addView(c);
            mainLayout.addView(ll);



        }
        scrollView.addView(mainLayout);
        setContentView(scrollView);
    }

public void different()
{
    scrollview = new ScrollView(this);
    LinearLayout linearlayout = new LinearLayout(this);
    linearlayout.setOrientation(LinearLayout.VERTICAL);
    scrollview.addView(linearlayout);

    for(int i = 1; i<15;i++)
    {
        LinearLayout linear1 = new LinearLayout(this);
        linear1.setOrientation(LinearLayout.HORIZONTAL);

        linearlayout.addView(linear1);
        b = new Button(this);
        b.setText("Chamber"+i);
        b.setId(i);
        b.setTextSize(10);
        b.setPadding(10, 3, 8, 3);
        b.setTypeface(Typeface.SERIF,Typeface.BOLD_ITALIC);
        b.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));

        linear1.addView(b);

        CheckBox checkbox = new CheckBox(this);
        checkbox.setId(i);
        checkbox.setText("Dou You want to check");
        linear1.addView(checkbox);

        checkbox.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), "Checked.."+ arg0.getId(), Toast.LENGTH_SHORT).show();
            }
        });

        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), "Chamber.."+ v.getId(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    this.setContentView(scrollview);
}



}
