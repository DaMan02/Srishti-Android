package com.srishti;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.srishti.databinding.ActivityHomeBinding;
import com.srishti.home.HomeFragment;
import com.srishti.profile.ProfileFragment;
import com.srishti.search.SearchFragment;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding bind;
    public FragmentManager fm;
    private HomeFragment homeFragment;
    private SearchFragment searchFragment;
    private ProfileFragment profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.activity_home);
        bind.bottomNav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        homeFragment = new HomeFragment();
        searchFragment = new SearchFragment();
        profileFragment = new ProfileFragment();
        fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.fragContainer, searchFragment).hide(searchFragment).commit();
        fm.beginTransaction().add(R.id.fragContainer, homeFragment).commit();
        fm.beginTransaction().add(R.id.fragContainer, profileFragment).commit();
        bind.bottomNav.setSelectedItemId(R.id.navigation_home);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_search:
                    fm.beginTransaction()
                            .show(searchFragment)
                            .hide(homeFragment)
                            .hide(profileFragment)
                            .commit();
                    return true;

                case R.id.navigation_home:
                    fm.beginTransaction()
                            .show(homeFragment)
                            .hide(searchFragment)
                            .hide(profileFragment)
                            .commit();
                    return true;

                case R.id.navigation_profile:
                    fm.beginTransaction()
                            .show(profileFragment)
                            .hide(searchFragment)
                            .hide(homeFragment)
                            .commit();
            }
                     return true;
        }
    };

}
