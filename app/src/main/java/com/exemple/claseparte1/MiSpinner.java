package com.exemple.claseparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MiSpinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_spinner);
    }

    public void Mispinner1(View view) {
            startActivity(new Intent(this,Activity3.class));
        }
    }

