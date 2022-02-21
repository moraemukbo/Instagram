package Utils;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import home.MainActivity;
import profile.ProfileActivity;
import org.techtown.instagram.R;
import org.techtown.instagram.ReelsActivity;
import org.techtown.instagram.SearchActivity;
import org.techtown.instagram.ShopActivity;

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHelper";


    public static void enableNavigation(final Context context, BottomNavigationView view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.house:
                        Intent intent1 = new Intent(context, MainActivity.class);
                        context.startActivity(intent1);
                        break;
                    case R.id.search:
                        Intent intent2 = new Intent(context, SearchActivity.class);
                        context.startActivity(intent2);
                        break;
                    case R.id.reels:
                        Intent intent3 = new Intent(context, ReelsActivity.class);
                        context.startActivity(intent3);
                        break;
                    case R.id.basket:
                        Intent intent4 = new Intent(context, ShopActivity.class);
                        context.startActivity(intent4);
                        break;
                    case R.id.profile:
                        Intent intent5 = new Intent(context, ProfileActivity.class);
                        context.startActivity(intent5);
                        break;

                }
                return false;
            }
        });
    }
}
