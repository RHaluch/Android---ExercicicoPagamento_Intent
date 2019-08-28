package com.example.exercicicopagamento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tipoPGTO, valorOriginal, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tipoPGTO = findViewById(R.id.tipoPGTO);
        valorOriginal = findViewById(R.id.valorOriginal);
        resultado = findViewById(R.id.resultado);

        Bundle bundle = getIntent().getExtras();
        tipoPGTO.setText(bundle.getString("tipo").toString());
        String tipo = tipoPGTO.getText().toString();
        valorOriginal.setText(String.valueOf(bundle.getFloat("valor")));
        float original = Float.parseFloat(valorOriginal.getText().toString());

        if(tipo.contains("Dinheiro")){
            String saida = "Valor: " + String.valueOf(original-(original*0.1));
            resultado.setText(saida);
        }else if(tipo.contains("Crédito")){
            String saida = "3X: " + String.valueOf(original/3);
            saida+="\n6X: "+ String.valueOf(original/6);
            resultado.setText(saida);
        }else{
            String saida = "Com acresimo: "+ String.valueOf(original+2.50);
            resultado.setText(saida);
        }
    }
}
