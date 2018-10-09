package com.example.michelle.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private enum Operator{ none,add,minus,multiply,divide}
    private double data1=0,data2=0;
    private Operator optr = Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bth00Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"0");
    }

    public void bth01Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"1");
    }

    public void bth02Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"2");
    }

    public void bth03Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"3");
    }

    public void bth04Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"4");
    }

    public void bth05Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"5");
    }

    public void bth06Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"6");
    }

    public void bth07Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"7");
    }

    public void bth08Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"8");
    }

    public void bth09Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"9");
    }

    public void bthAddClick(View view){
        optr = Operator.add;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void bthMinusClick(View view){
        optr = Operator.minus;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void bthMultiplyClick(View view){
        optr = Operator.multiply;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void bthDivideClick(View view){
        optr = Operator.divide;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void bthClearClick(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText("");
    }

    public void bthDotClick(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+".");
    }

    public void btnResultClick(View view){
        if (optr != Operator.none){
            EditText eText =(EditText)findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(eText.getText().toString());
            double result =0;

            if(optr == Operator.add){
                result =data1+data2;
            }else if (optr == Operator.minus) {
                result = data1 - data2;
            }else if (optr ==Operator.multiply) {
                result = data1 * data2;
            }else if (optr==Operator.divide){
                result = data1/data2;
            }
            optr = Operator.none;
            data1 = result;
            if ((result-(int)result)!=0)
                eText.setText(String.valueOf(result));
            else
                eText.setText(String.valueOf((int)result));
        }

    }





}
