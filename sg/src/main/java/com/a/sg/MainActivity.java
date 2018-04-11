package com.a.sg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"The seventh group.",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"CK修改",Toast.LENGTH_SHORT).show();
        Log.e("123","345");
        Log.e("123123123","123123123");

    }
}
