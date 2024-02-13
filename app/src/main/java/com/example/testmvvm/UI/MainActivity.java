package com.example.testmvvm.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.testmvvm.R;

public class MainActivity extends AppCompatActivity {
    private TextView textViewCountry;
    private Button buttonChangeCountry;
    private CountryViewModel countryViewModel;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    // Initialisation des vues
            textViewCountry = findViewById(R.id.textViewCountry);
            buttonChangeCountry = findViewById(R.id.buttonChangeCountry);
    // Initialisation du ViewModel
            countryViewModel = new ViewModelProvider(this).get(CountryViewModel.class);
    // Observer pour mettre à jour l'UI en fonction des changements dans le ViewModel
            countryViewModel.countryNameLiveData.observe(this, new Observer<String>() {
                        @Override
                        public void onChanged(String s) {
    // Met à jour le texte de textViewCountry avec le nouveau nom du pays
                            textViewCountry.setText(s);
                        }
                    });
    // Gestionnaire de clic pour mettre à jour les données du ViewModel
            buttonChangeCountry.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
    // Appelle la méthode pour mettre à jour le nom du pays dans le ViewModel
                    countryViewModel.updateCountryName();
                }
            });
        }
    }