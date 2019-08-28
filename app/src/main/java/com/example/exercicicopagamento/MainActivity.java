package com.example.exercicicopagamento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText valor;
    Spinner spinner;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor=findViewById(R.id.editValor);
        spinner=findViewById(R.id.spinner);
        calcular = findViewById(R.id.calcular);
    }

    public void calcular(View view) {
        float val = Float.parseFloat(valor.getText().toString());
        String tipo = spinner.getSelectedItem().toString();

        Bundle bundle = new Bundle();
        bundle.putFloat("valor", val);
        bundle.putString("tipo", tipo);

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtras(bundle);

        startActivity(intent);
    }
}
