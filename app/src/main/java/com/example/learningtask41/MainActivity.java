package com.example.learningtask41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    double n1, n2, n3, result;
    String resultMessage;
    EditText et1, et2, et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View v) {
        et1 = (EditText) findViewById(R.id.editTextNumber1);
        et2 = (EditText) findViewById(R.id.editTextNumber2);
        et3 = (EditText) findViewById(R.id.editTextNumber3);


        if (et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty() || et3.getText().toString().isEmpty()) {
            n1 = 0;
            n2 = 0;
            n3 = 0;
        } else {
            n1 = Double.parseDouble(et1.getText().toString());
            n2 = Double.parseDouble(et2.getText().toString());
            n3 = Double.parseDouble(et3.getText().toString());
        }

        result = n1 + n2 + n3;
        resultMessage = result + " = " + n1 + " + " + n2 + " + " + n3;

        Bundle args = new Bundle();
        args.putString("result", resultMessage);

        // Create a dialog instance
        DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
        // Pass on dialog argument(args), the result
        dialogFragmentImp.setArguments(args);
        // Display the Dialog
        dialogFragmentImp.show(getSupportFragmentManager(), "Display Result");
        // Reset EditTexts
        clearEditText();
    }

    public void Subtract(View v) {
        et1 = (EditText) findViewById(R.id.editTextNumber1);
        et2 = (EditText) findViewById(R.id.editTextNumber2);
        et3 = (EditText) findViewById(R.id.editTextNumber3);


        if (et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty() || et3.getText().toString().isEmpty()) {
            n1 = 0;
            n2 = 0;
            n3 = 0;
        } else {
            n1 = Double.parseDouble(et1.getText().toString());
            n2 = Double.parseDouble(et2.getText().toString());
            n3 = Double.parseDouble(et3.getText().toString());
        }

        result = n1 - n2 - n3;

        resultMessage = result + " = " + n1 + " - " + n2 + " - " + n3;

        Bundle args = new Bundle();
        args.putString("result", resultMessage);

        // Create a dialog instance
        DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
        // Pass on dialog argument(args), the result
        dialogFragmentImp.setArguments(args);
        // Display the Dialog
        dialogFragmentImp.show(getSupportFragmentManager(), "Display Result");
        // Reset EditTexts
        clearEditText();
    }

    public void Multiply(View v) {
        et1 = (EditText) findViewById(R.id.editTextNumber1);
        et2 = (EditText) findViewById(R.id.editTextNumber2);
        et3 = (EditText) findViewById(R.id.editTextNumber3);

        if (et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty() || et3.getText().toString().isEmpty()) {
            n1 = 0;
            n2 = 0;
            n3 = 0;
        } else {
            n1 = Double.parseDouble(et1.getText().toString());
            n2 = Double.parseDouble(et2.getText().toString());
            n3 = Double.parseDouble(et3.getText().toString());
        }

        result = n1 * n2 * n3;

        resultMessage = result + " is " + n1 + " * " + n2 + " * " + n3;

        Bundle args = new Bundle();
        args.putString("result", resultMessage);

        // Create a dialog instance
        DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
        // Pass on dialog argument(args), the result
        dialogFragmentImp.setArguments(args);
        // Display the Dialog
        dialogFragmentImp.show(getSupportFragmentManager(), "Display Result");
        // Reset EditTexts
        clearEditText();
    }

    public void Divide(View v) {
        et1 = (EditText) findViewById(R.id.editTextNumber1);
        et2 = (EditText) findViewById(R.id.editTextNumber2);
        et3 = (EditText) findViewById(R.id.editTextNumber3);

        if (et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty() || et3.getText().toString().isEmpty()) {
            n1 = 0;
            n2 = 0;
            n3 = 0;
        } else {
            n1 = Double.parseDouble(et1.getText().toString());
            n2 = Double.parseDouble(et2.getText().toString());
            n3 = Double.parseDouble(et3.getText().toString());
        }

        result = n1 / n2 / n3;

        resultMessage = result + " is " + n1 + " / " + n2 + " / " + n3;

        Bundle args = new Bundle();
        args.putString("result", resultMessage);

        // Create a dialog instance
        DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
        // Pass on dialog argument(args), the result
        dialogFragmentImp.setArguments(args);
        // Display the Dialog
        dialogFragmentImp.show(getSupportFragmentManager(), "Display Result");
        // Reset EditTexts
        clearEditText();
    }
    public void clearEditText(){
        et1.getText().clear();
        et2.getText().clear();
        et3.getText().clear();
    }
}