package com.example.musicos;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;


public class ProfileSingerActiviy extends AppCompatActivity {
    TextView nameTexView, ageTextView, countryTextView, famousSongTextView;
    String name, age, country, famousSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profilesinger);
        nameTexView =findViewById(R.id.nameTexView);
        ageTextView =findViewById(R.id.tv_singerAge);
        countryTextView =findViewById(R.id.tv_country);
        famousSongTextView =findViewById(R.id.tv_famoussong);


        name = "name no set";
        Bundle extras  = getIntent().getExtras();
        if (extras != null){
            name = extras.getString("name");
            age = extras.getString("singerAge");
            country = extras.getString("country");
            famousSong = extras.getString("famousSong");

        }
        nameTexView.setText(name);

    }
}
