package com.artesano.joselo.artesanohack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class TipCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_tip_calculator);

        final EditText amt = (EditText) findViewById(R.id.bill_amt);
        final EditText tip = (EditText) findViewById(R.id.bill_per);
        final TextView result = (TextView) findViewById(R.id.res);

        Button calc = (Button) findViewById(R.id.button1);
        calc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                double amount = Double.parseDouble(amt.toString());
                double tip_per = Double.parseDouble(tip.toString());
                double tip_cal = (amount * tip_per) / 100;
                result.setText("Result : " + Double.toString(tip_cal));
            }
        });

    }

}
