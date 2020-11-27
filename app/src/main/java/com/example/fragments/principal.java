package com.example.fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_conteiner,
                new CalculadoraFragment()).commit();
    }
    private  BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.calculadora_basica:
                            selectedFragment = new CalculadoraFragment();
                            break;
                        case R.id.sonido:
                            selectedFragment = new SonidoFragment();
                            break;
                        case R.id.sitio_web:
                            selectedFragment = new SitioFragment();
                            break;
                        case R.id.aplicaciones:
                            selectedFragment = new APKFragment();
                            break;
                        case R.id.propuesta:
                            selectedFragment = new FotoFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_conteiner,
                            selectedFragment).commit();
                    return true;
                }
            };
}
