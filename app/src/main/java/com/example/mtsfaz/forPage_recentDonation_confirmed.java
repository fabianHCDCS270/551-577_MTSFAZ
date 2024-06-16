package com.example.mtsfaz;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class forPage_recentDonation_confirmed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recentdonation_confirmed);

        List<String> months = Arrays.asList(
                "January", "February", "March", "April",
                "May", "June", "July", "August", "September",
                "October", "November", "December");

        Spinner spinner = findViewById(R.id.dropdown_recentDonation2);

        ArrayAdapter adapter = new ArrayAdapter<>(
                getApplicationContext(),
                R.layout.spinner_txtview_selected_item,
                months);

        adapter.setDropDownViewResource(R.layout.spinner_txtview_dropdown_item);

        spinner.setAdapter(adapter);
    }
}