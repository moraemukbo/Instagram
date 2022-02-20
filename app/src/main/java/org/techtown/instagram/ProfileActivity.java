package org.techtown.instagram;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import Utils.BottomNavigationViewHelper;

public class ProfileActivity extends AppCompatActivity {
    private static final String TAG = "PROFILEACTIVITY";

    private Context mContext = ProfileActivity.this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d(TAG,"onCreate: starting");
       // setupBottomNavigationView();
        setupToolbar();
    }
    private void setupToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.profileToolBar);

        setSupportActionBar(toolbar);

        ImageView profileMenu = (ImageView) findViewById(R.id.profileMenu);
        profileMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext,AccountSettingActivity.class);
                startActivity(intent);
            }
        });
    }

    //BOTTOM NAVIGATION VIEW 설정하기
    private void setupBottomNavigationView(){
        Log.d(TAG, "BottomNavigationView 세팅");
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomnavviewbar);
        BottomNavigationViewHelper.enableNavigation(mContext,bottomNavigationView);
    }


}