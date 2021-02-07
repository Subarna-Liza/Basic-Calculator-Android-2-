package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityViewCommand;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView FirstTextView, SecondTextView;
    String SecondValue;
    String FirstValue;
    String Operator;
    Double Number1, Number2;
    Double Result;
    int i, str, count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstTextView = findViewById(R.id.FirstTextViewID);
        SecondTextView = findViewById(R.id.SecondTextViewID);
    }

    public void DigitFunction(View view) {

        SecondValue = SecondTextView.getText().toString();

        if (view.getId() == R.id.ZeroButtonID) {
            if (SecondValue.equals("0")) {
                SecondTextView.setText("0");
            } else {
                SecondTextView.setText(SecondValue + "0");
            }
        } else if (view.getId() == R.id.OneButtonID) {
            if (SecondValue.equals("0")) {
                SecondTextView.setText("1");
            } else {
                SecondTextView.setText(SecondValue + "1");
            }
        } else if (view.getId() == R.id.TwoButtonID) {
            if (SecondValue.equals("0")) {
                SecondTextView.setText("2");
            } else {
                SecondTextView.setText(SecondValue + "2");
            }
        } else if (view.getId() == R.id.ThreeButtonID) {
            if (SecondValue.equals("0")) {
                SecondTextView.setText("3");
            } else {
                SecondTextView.setText(SecondValue + "3");
            }

        } else if (view.getId() == R.id.FourButtonID) {
            if (SecondValue.equals("0")) {
                SecondTextView.setText("4");
            } else {
                SecondTextView.setText(SecondValue + "4");
            }

        } else if (view.getId() == R.id.FiveButtonID) {
            if (SecondValue.equals("0")) {
                SecondTextView.setText("5");
            } else {
                SecondTextView.setText(SecondValue + "5");
            }
        } else if (view.getId() == R.id.SixButtonID) {
            if (SecondValue.equals("0")) {
                SecondTextView.setText("6");
            } else {
                SecondTextView.setText(SecondValue + "6");
            }

        } else if (view.getId() == R.id.SevenButtonID) {
            if (SecondValue.equals("0")) {
                SecondTextView.setText("7");
            } else {
                SecondTextView.setText(SecondValue + "7");
            }
        } else if (view.getId() == R.id.EightButtonID) {
            if (SecondValue.equals("0")) {
                SecondTextView.setText("8");
            } else {
                SecondTextView.setText(SecondValue + "8");
            }

        } else {
            if (SecondValue.equals("0")) {
                SecondTextView.setText("9");
            } else {
                SecondTextView.setText(SecondValue + "9");
            }
        }


    }

    public void OperatorFunction(View view) {
        SecondValue = SecondTextView.getText().toString();
        Number1 = Double.parseDouble(SecondValue);
        if (view.getId() == R.id.PlusButtonID) {
            Operator = "+";

        }

        if (view.getId() == R.id.MinusButtonID) {
            Operator = "-";

        }

        if (view.getId() == R.id.multiplyButtonID) {
            Operator = "*";

        }

        if (view.getId() == R.id.DivisionButtonID) {
            Operator = "/";

        }
        FirstTextView.setText(SecondValue + "" + Operator);
        SecondTextView.setText("0");

    }

    public void ResultFunction(View view) {
        Number2 = Double.parseDouble(SecondTextView.getText().toString());

        if (Operator.equals("+")) {
            Result = Number1 + Number2;
        } else if (Operator.equals("-")) {
            Result = Number1 - Number2;
        } else if (Operator.equals("*")) {
            Result = Number1 * Number2;
        } else {
            Result = Number1 / Number2;
        }
        FirstTextView.setText("" + Number1 + "" + Operator + "" + Number2 + " =");
        SecondTextView.setText("" + Result);
    }

    public void PercentFunction(View view) {
        SecondValue = SecondTextView.getText().toString();
        Number1 = Double.parseDouble(SecondValue);
        Result = Number1 / 100;
        FirstTextView.setText(Number1 + " % =");
        SecondTextView.setText("" + Result);
    }

    public void CEFunction(View view) {

        SecondTextView.setText("0");
    }

    public void ClearFunction(View view) {
        SecondTextView.setText(" ");
        FirstTextView.setText(" ");
        Number1 = Double.parseDouble("0");
        Number2 = Double.parseDouble("0");

    }


    public void DFunction(View view) {
        String str = SecondTextView.getText().toString();
        String str2 = str.substring(0,str.length()-1);
        SecondTextView.setText(""+str2);


    }


    public void PointFunction(View view) {



        String digit = SecondTextView.getText().toString();
        Boolean Cheak = digit.contains(".");
        if(Cheak){
            SecondTextView.setText(digit+"");

        }else{
            SecondTextView.setText(digit+".");

        }



    }

}

