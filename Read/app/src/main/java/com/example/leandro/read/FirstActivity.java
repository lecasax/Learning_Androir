package com.example.leandro.read;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by leandro on 22/03/2015.
 */
public class FirstActivity  extends ActionBarActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_layout);
    }

    public void cliqueBotaoOK(View v) {

        EditText res = (EditText) findViewById(R.id.texto_nome_id);
        TextView nome = (TextView) findViewById(R.id.resposta_id);
        String msg = "Resposta: " + res.getText().toString();
        nome.setText(msg);

    }

}
