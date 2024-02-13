package com.example.testmvvm.UI;

import static android.icu.util.ULocale.getCountry;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.testmvvm.Model.CountryModel;

public class CountryViewModel extends ViewModel {
    MutableLiveData<String> countryNameLiveData = new
            MutableLiveData<>();
    // Méthode pour mettre à jour le nom du pays
    public void updateCountryName() {
        String name = getCountry().getName();
        countryNameLiveData.setValue(name);
    }
    private CountryModel getCountry() {
        return new CountryModel("Palestine", "Al-Qods", 2000);
    }
}
