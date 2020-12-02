package com.zaaach.citypickerdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.zaaach.tabel.Model;


public class SentExpActivity extends AppCompatActivity implements View.OnClickListener {
   TextView City_name;

    @Override
    protected void onCreate(Bundle savedInstanceState ) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.chengdu);
        System.out.println(getIntent().getStringExtra("name"));
        City_name = findViewById(R.id.tv_current_1);
//        Model model =new  Model();
//        City_name.setText(model.getcity_name());
        //获取传递过来的姓名
        City_name.setText(getIntent().getStringExtra("name"));
        System.out.println(new Model().getcity_name());


        findViewById(R.id.goback).setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.goback:
                Intent intent=new Intent();
                intent.putExtra("order_distribut_type","bigexp");
                intent.setClass(SentExpActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}