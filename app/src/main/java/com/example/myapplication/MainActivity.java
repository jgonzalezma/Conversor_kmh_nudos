package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_a_nudos = (Button) findViewById(R.id.btn_a_nudos);
        Button btn_a_kmh = (Button) findViewById(R.id.btn_a_kmh);

        final EditText edit_kmh = (EditText) findViewById(R.id.edit_kmh);
        final EditText edit_nudos = (EditText) findViewById(R.id.edit_nudos);

        btn_a_nudos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String skmh = edit_kmh.getText().toString();
                float kmh = Float.parseFloat(skmh);
                float nudos = kmh / 1.852f;
                String snudos = String.format("%f", nudos);
                edit_nudos.setText(snudos);
            }
        });

        btn_a_kmh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snudos = edit_nudos.getText().toString();
                float nudos = Float.parseFloat(snudos);
                float kmh = nudos * 1.852f;
                String skmh = String.format("%f", kmh);
                edit_kmh.setText(skmh);
            }
        });
    }
}
