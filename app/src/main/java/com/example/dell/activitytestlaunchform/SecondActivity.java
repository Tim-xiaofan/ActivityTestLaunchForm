package com.example.dell.activitytestlaunchform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

    public  static  final String TAG="SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("SecondActivity","Task id is"+getTaskId());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button button2=(Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}
