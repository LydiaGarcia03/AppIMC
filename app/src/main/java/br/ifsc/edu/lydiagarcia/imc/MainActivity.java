package br.ifsc.edu.lydiagarcia.imc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularIMC(View view){

        double peso = Double.parseDouble((findViewById(R.id.editPeso)).toString());
        double altura = Double.parseDouble((findViewById(R.id.editAltura)).toString());

        double imc = peso / Math.pow(altura, 2);

        TextView imcDisplay = findViewById(R.id.imcEstado);

        String estado;

        if(imc <= 18.5){
            estado = "Abaixo do peso";
        } else if(imc >= 18.6 && imc <= 24.9){
            estado = "Normal";
        } else if(imc >= 25 && imc <= 29.9) {
            estado = "Levemente acima do peso";
        } else if(imc >= 30 && imc <= 34.9){
            estado = "Obesidade I";
        } else if(imc >= 35 && imc < 39.9){
            estado = "Obesidade II";
        } else{
            estado = "Obesidade III";
        }
        imcDisplay.setText((int) imc + " - " + estado);

    }
}
