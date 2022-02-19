package org.techtown.instagram;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import Utils.BottomNavigationViewHelper;

public class SearchActivity extends AppCompatActivity {
    private static final String TAG = "SEARCHACTIVITY";
    private Context mContext = SearchActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate: starting");

        setupBottomNavigationView();
    }
    //BOTTOM NAVIGATION VIEW 설정하기
    private void setupBottomNavigationView(){
        Log.d(TAG, "BottomNavigationView 세팅");
        BottomNavigationView bottomNavigationView= (BottomNavigationView) findViewById(R.id.bottomnavviewbar);
        BottomNavigationViewHelper.enableNavigation(mContext,bottomNavigationView);
    }
}