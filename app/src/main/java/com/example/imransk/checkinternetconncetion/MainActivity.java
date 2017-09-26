package com.example.imransk.checkinternetconncetion;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Check(View view) {
        ConnectivityManager connectivityManagerObj = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfoObj =connectivityManagerObj.getActiveNetworkInfo();
        if (networkInfoObj == null){
            Toast.makeText(this,"Internet Connection is not available",Toast.LENGTH_LONG).show();

        }else {

            Toast.makeText(this,"Internet Connection is available",Toast.LENGTH_LONG).show();
        }
    }
}
