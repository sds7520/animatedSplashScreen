package com.example.openup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread td=new Thread(){
          @Override
          public void run() {
              try{
                  sleep(5000);
              }catch (Exception ex) {
                  ex.printStackTrace();
              }finally {
                  Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                  startActivity(intent);
                  finish();
              }
          }
        };td.start();
    }
}