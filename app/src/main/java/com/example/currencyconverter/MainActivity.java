package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    Button btnCalc, btnCl;
    RadioButton rdBDT, rdUSD, rdIND;
    EditText edtIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCl = findViewById(R.id.btnClear);
        btnCalc = findViewById(R.id.btnCalculate);
        edtIN = findViewById(R.id.edtInput);
        rdBDT = findViewById(R.id.rd1);
        rdUSD = findViewById(R.id.rd2);
        rdIND = findViewById(R.id.rd3);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double input = new Double(edtIN.getText().toString());

                if (rdBDT.isChecked()) {
                    double result = ConvertCurrency.bdtUSD(input);
                    edtIN.setText(new Double(result).toString());
                }

                else if (rdUSD.isChecked()) {
                    double result = ConvertCurrency.usdBDT(input);
                    edtIN.setText(new Double(result).toString());
                }

                else if(rdIND.isChecked()) {
                    double result = ConvertCurrency.bdtIND(input);
                    edtIN.setText(new Double(result).toString());
                }
            }
        });
        btnCl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIN.setText(null);
            }
        });

    }
}