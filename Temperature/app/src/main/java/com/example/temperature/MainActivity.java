package com.example.temperature;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int now = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Button_Trig(View view) {
        double Temp_Input;
        double Temp_Ouput;
        EditText editText = findViewById(R.id.editTextNumber);
        TextView textView = findViewById(R.id.textView);

        if(String.valueOf(editText.getText()).equals(""))
            Temp_Input = 0;
        else
            Temp_Input = Double.parseDouble(String.valueOf(editText.getText()));

        if(now == 0)
        {
            now = 1;
            Temp_Ouput = (Temp_Input * 1.8) + 32;
            editText.setText(String.valueOf(Temp_Ouput));
            textView.setText(R.string.Tempture_F);
        }
        else if(now == 1)
        {
            now = 0;
            Temp_Ouput = (Temp_Input - 32) / 1.8;
            editText.setText(String.valueOf(Temp_Ouput));
            textView.setText(R.string.Tempture_C);
        }



    }
}