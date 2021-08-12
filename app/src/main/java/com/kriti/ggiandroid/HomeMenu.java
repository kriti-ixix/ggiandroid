package com.kriti.ggiandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeMenu extends AppCompatActivity {

    BottomNavigationView bottomNav;
    FragmentManager fragmentManager = getSupportFragmentManager();
    HomeFragment homeFragment = new HomeFragment();
    FriendsFragment friendsFragment = new FriendsFragment();
    SettingsFragment settingsFragment = new SettingsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu);

        bottomNav = findViewById(R.id.bottomNavView);
        fragmentManager.beginTransaction().replace(R.id.frameLayout, homeFragment).commit();

        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.mHome)
                {
                    fragmentManager.beginTransaction().replace(R.id.frameLayout, homeFragment).commit();
                }
                else if (id == R.id.mFriends)
                {
                    fragmentManager.beginTransaction().replace(R.id.frameLayout, friendsFragment).commit();
                }
                else if (id == R.id.mSettings)
                {
                    fragmentManager.beginTransaction().replace(R.id.frameLayout, settingsFragment).commit();
                }
                return true;
            }
        });
    }
}