package org.techtown.instagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import Utils.BottomNavigationViewHelper;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "HOMEACTIVITY";

    private Context mContext = MainActivity.this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate: starting");

        setupBottomNavigationView();
        setupViewPager();
    }
    //3개의 탭 추가 가능 카메라,홈, 메세지
    private  void setupViewPager(){
        SectionsPagerAdapter adapter =new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CameraFragment());
        adapter.addFragment(new MainFragment());
        adapter.addFragment(new MessageFragment());
        ViewPager viewPager = (ViewPager) findViewById(R.id.container);
    }
    //BOTTOM NAVIGATION VIEW 설정하기
    private void setupBottomNavigationView(){
        Log.d(TAG, "BottomNavigationView 세팅");
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomnavviewbar);
        BottomNavigationViewHelper.enableNavigation(mContext,bottomNavigationView);
    }
}