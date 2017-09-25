package com.example.usuario.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HolaMundoActivity extends AppCompatActivity {

    /**
     * Mi primera aplicación de Android
     * @author Alfonso Chamorro Valle
     * @version 1.0
     * @see android.app.Activity
     */

    private TextView txvMessage;
    private Button btn;

    @Override
    //Comentari ode una línea, lol
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);

        txvMessage = (TextView)findViewById(R.id.txvMessage);
        btn = (Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txvMessage.setText(R.string.rip);
            }
        });
    }
}
