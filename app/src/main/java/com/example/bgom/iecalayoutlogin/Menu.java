package com.example.bgom.iecalayoutlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    String usuarioRecuperado;
    String passRecuperada;

    Intent intentRecuperado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        intentRecuperado=getIntent();

        usuarioRecuperado=intentRecuperado.getStringExtra("myUser");
        passRecuperada=intentRecuperado.getStringExtra("myPassword");

        Toast.makeText(getApplicationContext(),usuarioRecuperado,Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),passRecuperada,Toast.LENGTH_SHORT).show();
    }
}
