package com.inam.app;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    MedicalID firstFragment = new MedicalID();
    HealthRecords secondFragment = new HealthRecords();
    Measure thirdFragment = new Measure();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        //Initialize the bottom navigation view
        //create bottom navigation view objec
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigatin_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.homeFragment);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.homeFragment:
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_fragment, firstFragment).commit();
                return true;

            case R.id.profileFragment:
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_fragment, secondFragment).commit();
                return true;

            case R.id.settingsFragment:
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_fragment, thirdFragment).commit();
                return true;
        }
        return false;
    }
}


