package com.example.icecreamadviser;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.icecreamadviser.logic.IceCreamExpert;

public class FindIcecreamActivity extends AppCompatActivity {

    IceCreamExpert iceCreamExpert = new IceCreamExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_icecream);
    }

    public void onClickFindIcecream(View view) {

        TextView flavours = findViewById(R.id.iceCreamFlavours);
        Spinner typesSpinner = findViewById(R.id.iceCreamTypes);
        String type = String.valueOf(typesSpinner.getSelectedItem());

        StringBuilder flavoursList = new StringBuilder();
        for (String flavour : iceCreamExpert.getIceCreamFlavours(type)) {
            flavoursList.append(flavour).append("\n");
        }

        flavours.setText(flavoursList);
    }
}
