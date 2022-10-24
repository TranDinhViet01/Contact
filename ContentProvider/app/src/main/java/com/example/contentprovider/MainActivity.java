package com.example.contentprovider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CONTACTS_ASK_PERMISSION = 1001;
    private static final int REQUEST_SMS_ASK_PERMISSION = 1002;

    Button bt1, bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        addEvents();
    }

    private void addEvents(){
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyMoDanhBa();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyMoTinNhan();
            }
        });
    }
    private void xuLyMoDanhBa(){
        Intent intent = new Intent(MainActivity.this, DanhBa.class);
        intent.setClassName("com.example.contentprovider","com.example.contentprovider.DanhBa");
        startActivity(intent);
    }
    private void xuLyMoTinNhan(){

    }
    private void addControl(){
        bt1 =  findViewById(R.id.bt1);
        bt2 =  findViewById(R.id.bt2);
    }



}