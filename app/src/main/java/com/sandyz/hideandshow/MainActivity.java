package com.sandyz.hideandshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    Button bt_dispaly;
    Button bt_display2;
    ImageView im_ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_dispaly = (Button)findViewById(R.id.btn1);
        im_ImageView = (ImageView)findViewById(R.id.img);
        bt_display2 = (Button)findViewById(R.id.btn2);
        bt_display2.setVisibility(View.INVISIBLE);
        bt_dispaly.setOnClickListener(this);
        bt_display2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

            if(v.getId()== R.id.btn1){
                bt_dispaly.setVisibility(View.GONE);
                im_ImageView.setVisibility(View.GONE);
                bt_display2.setVisibility(View.VISIBLE);
            }
        if(v.getId()==R.id.btn2){

            bt_dispaly.setVisibility(View.VISIBLE);
            im_ImageView.setVisibility(View.VISIBLE);
            bt_display2.setVisibility(View.INVISIBLE);

        }



    }
}
