package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.textview);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputText  = editText.getText().toString();

                // Convert String to double
                double kilos = Double.parseDouble(inputText);

                // Converting the kilos to pounds
                double pounds = makeConversion(kilos);

                // Displaying the conversion result
                textView.setText(""+pounds+" pounds");
            }
        });
    }

    public double makeConversion(double kilos) {
        // 1 kilo = 2.20462 pounds

        return kilos * 2.20462;
    }
}