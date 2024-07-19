package com.example.intership1unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e1,e2,e3,e4;
        Button convert;
        e1=findViewById(R.id.editTextText);
        e2=findViewById(R.id.editTextText2);
        e3=findViewById(R.id.editTextText3);
        e4=findViewById(R.id.editTextText4);
        convert=findViewById(R.id.button);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=e1.getText().toString();
                double inputvalue=Double.parseDouble(input);
                double result ;
                String inputunit=e2.getText().toString();
                inputunit=inputunit.toUpperCase();
                String outputunit=e3.getText().toString();
                outputunit=outputunit.toUpperCase();

                if(input.isEmpty())
                {
                    e4.setText("enter  a value");
                }
                else
                {
                    if(inputunit.equals("CENTIMETERS")&&outputunit.equals("METERS"))
                    {   
                        result=inputvalue/100;
                        e4.setText(Double.toString(result));
                    }
                    else if(inputunit.equals("METERS")&&outputunit.equals("CENTIMETERS"))
                    {
                        result=inputvalue*100;
                        e4.setText(Double.toString(result));

                    }
                    else if(inputunit.equals("GRAMS")&&outputunit.equals("KILOGRAMS"))
                    {
                        result=inputvalue/1000;
                        e4.setText(Double.toString(result));

                    }
                    else if(inputunit.equals("KILOGRAMS")&&outputunit.equals("GRAMS"))
                    {
                        result=inputvalue*1000;
                        e4.setText(Double.toString(result));

                    }

                }
                
            }
        });
    }
}