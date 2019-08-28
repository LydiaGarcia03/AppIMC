package br.ifsc.edu.lydiagarcia.imc;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URI;

public class IMCRelativeLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcrelative_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void calcularIMC(){

        double peso = Integer.parseInt((findViewById(R.id.editPeso)).toString());
        double altura = Integer.parseInt((findViewById(R.id.editAltura)).toString());

        double imc = peso / Math.pow(altura, 2);

        TextView imcDisplay = findViewById(R.id.editPeso);
        imcDisplay.setText((int) imc);

        ImageView img = findViewById(R.id.img);

        String estado;

       if(imc < 17){
           estado = "Muito Abaixo";
           img.setImageURI(R.drawable.abaixopeso);
       } else if(imc >= 17 && imc <= 18.49){
           estado = "Abaixo";
           img.setImageURI(R.drawable.abaixopeso);
       } else if(imc >= 18.5 && imc <= 24.99){
           estado = "Normal";
           img.setImageURI(R.drawable.normal);
       } else if(imc >= 25 && imc <= 29.99){
           estado = "Obesidade I";
           img.setImageURI(R.drawable.obesidade1);
       } else if(imc >= 35 && imc < 39.99){
           estado = "Obesidade II";
           img.setImageURI(R.drawable.obesidade2);
       } else{
           estado = "Obesidade III";
           img.setImageURI(R.drawable.obesidade3);
       }

    }

}
