package com.artesano.joselo.artesanohack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText monto;
    RadioButton porcentajeBajo, porcentajeMedio, porcentajeAlto;
    Button btnCal;
    TextView resultado;
    float porcentaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        porcentaje      = 5;
        monto           = (EditText) findViewById(R.id.bill_amt2);
        btnCal          = (Button) findViewById(R.id.buttonCal);
        resultado       = (TextView) findViewById(R.id.resultado);
        porcentajeBajo  = (RadioButton) findViewById(R.id.radioButton1);
        porcentajeMedio = (RadioButton) findViewById(R.id.radioButton2);
        porcentajeAlto  = (RadioButton) findViewById(R.id.radioButton3);

        btnCal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if( monto.getText().length() > 0 ){

                    float amount     = Float.parseFloat(monto.getText().toString());
                    //double amount     = 5.0;
                    float tip_cal    = (amount * porcentaje) / 100;
                    resultado.setText("$" + String.format("%.2f", tip_cal));
                }
                else
                    Toast.makeText(getApplicationContext(), "Ingrese el total del consumo", Toast.LENGTH_LONG).show();

            }
        });

    }

    public void radioButtonClicked(View v){
        boolean checked = ((RadioButton) v).isChecked();

        switch (v.getId()){
            case R.id.radioButton1:
                if(checked)
                    porcentaje = 5;
                break;
            case R.id.radioButton2:
                if(checked)
                    porcentaje = 10;
                break;
            case R.id.radioButton3:
                if(checked)
                    porcentaje = 15;
                break;
        }
    }

}
