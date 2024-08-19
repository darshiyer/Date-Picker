package com.example.datrepickerpractice14thaugust;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    DatePicker simpleDatePicker;
    Button submit;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleDatePicker = (DatePicker) findViewById(R.id.date);
        submit = (Button) findViewById(R.id.submitButton);
        WebView webView = findViewById(R.id.WebView);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String day = "Day = " + simpleDatePicker.getDayOfMonth();
                String month = "Month = " + (simpleDatePicker.getMonth()+1);
                String year = "Year = " + simpleDatePicker.getYear();

                Toast.makeText(getApplicationContext(),day + "\n" + month + "\n" + year,Toast.LENGTH_LONG).show();
            }
        });
        webView.loadUrl("https://www.apple.com/in/");

    }
}