package org.techtown.instagram;

import android.content.Context;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

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

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.profileMenu:
                        Log.d(TAG,"ABCDE");
                }
                return false;
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