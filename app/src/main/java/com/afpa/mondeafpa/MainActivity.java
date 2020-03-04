package com.afpa.mondeafpa;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import static java.lang.Integer.valueOf;

public class MainActivity extends AppCompatActivity {
    // déclaration des éléments du layout
    private Button button;
    public static final String EXTRA_NBFACES = "com.afpa.myapplication.NBFACES";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lancer(View view){
        Intent intent = new Intent(this, ResultatActivity.class);
        EditText nbFacesChoix = (EditText) findViewById(R.id.nbFaces);
        int nbFaces = (int) Integer.parseInt(nbFacesChoix.getText().toString());

        intent.putExtra(EXTRA_NBFACES,nbFaces);
        startActivity(intent);

    }
}
