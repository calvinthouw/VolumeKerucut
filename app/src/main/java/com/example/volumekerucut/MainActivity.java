package com.example.volumekerucut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText edtJari,edtTinggi;
    public Button btnHitung;
    public TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Menghitung Volume Kerucut");

        edtJari=(EditText)findViewById(R.id.jj);
        edtTinggi=(EditText)findViewById(R.id.tinggi);
        btnHitung=(Button)findViewById(R.id.hitung);
        txthasil=(TextView)findViewById(R.id.hasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jj = edtJari.getText().toString().trim();
                String tinggi = edtTinggi.getText().toString().trim();

                double j = Double.parseDouble(jj);
                double t = Double.parseDouble(tinggi);

                double volume = (3.14*j*j*t)/3;
                txthasil.setText("Volume = "+volume);


            }
        });

    }
}


