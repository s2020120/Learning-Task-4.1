package com.example.learningtask41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    double n1, n2, n3, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber1);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);
        EditText et4 = (EditText)findViewById(R.id.editTextNumber4);


        if(et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty() || et3.getText().toString().isEmpty()){
            n1 = 0;
            n2 = 0;
            n3 = 0;
        }else{
            n1 = Double.parseDouble(et1.getText().toString());
            n2 = Double.parseDouble(et2.getText().toString());
            n3 = Double.parseDouble(et3.getText().toString());
        }

        result = n1+n2+n3;

        et4.setText("Total Value: "+result);
    }
    public void Subtract(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber1);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);
        EditText et4 = (EditText)findViewById(R.id.editTextNumber4);


        if(et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty() || et3.getText().toString().isEmpty()){
            n1 = 0;
            n2 = 0;
            n3 = 0;
        }else{
            n1 = Double.parseDouble(et1.getText().toString());
            n2 = Double.parseDouble(et2.getText().toString());
            n3 = Double.parseDouble(et3.getText().toString());
        }

        result = n1-n2-n3;

        et4.setText("Remaining Value: "+result);
    }
    public void Multiply(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber1);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);
        EditText et4 = (EditText)findViewById(R.id.editTextNumber4);

        if(et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty() || et3.getText().toString().isEmpty()){
            n1 = 0;
            n2 = 0;
            n3 = 0;
        }else{
            n1 = Double.parseDouble(et1.getText().toString());
            n2 = Double.parseDouble(et2.getText().toString());
            n3 = Double.parseDouble(et3.getText().toString());
        }

        result = n1*n2*n3;

        et4.setText("Product Value: "+result);
    }
    public void Divide(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber1);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);
        EditText et4 = (EditText)findViewById(R.id.editTextNumber4);

        if(et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty() || et3.getText().toString().isEmpty()){
            n1 = 0;
            n2 = 0;
            n3 = 0;
        }else{
            n1 = Double.parseDouble(et1.getText().toString());
            n2 = Double.parseDouble(et2.getText().toString());
            n3 = Double.parseDouble(et3.getText().toString());
        }

        result = n1/n2/n3;

        et4.setText("Quotient Value: "+result);
    }
}