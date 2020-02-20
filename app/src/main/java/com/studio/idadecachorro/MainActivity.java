package com.studio.idadecachorro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.idadeHumano =  findViewById(R.id.idadeHumano);
        this.mViewHolder.descobrirIdade =  findViewById(R.id.descobrirIdade);
        this.mViewHolder.idadeCachorro =  findViewById(R.id.idadeCachorro);

        this.mViewHolder.descobrirIdade.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String textoDigitado = this.mViewHolder.idadeHumano.getText().toString();

        if(textoDigitado.isEmpty()){
            Toast.makeText(this,this.getString(R.string.informeValor), Toast.LENGTH_LONG).show();

        } else {
            int valorDigitado = Integer.parseInt(textoDigitado);
            int resultaFinal = valorDigitado * 7;

            this.mViewHolder.idadeCachorro.setText("Anos de cachorro = " + resultaFinal);
        }
    }

    private static class ViewHolder {
        EditText idadeHumano;
        Button descobrirIdade;
        TextView idadeCachorro;
    }
}
