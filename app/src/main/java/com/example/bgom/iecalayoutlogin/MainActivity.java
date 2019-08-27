package com.example.bgom.iecalayoutlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtUser, txtPassword;
    Button btnLogin, btnAddU;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ASIGNARCONTROLES A LAS VARIABLES
        //casteo convierte la instancia de los tipos de datos
        txtUser=findViewById(R.id.txtUser);
        txtPassword=findViewById(R.id.txtPassword);

        btnLogin=findViewById(R.id.btnLog);
        btnAddU=findViewById(R.id.btnAdd);
//agregar comportamiento al boton
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ir a la siguiente actividad
                Intent intent=new Intent(getApplicationContext(),Menu.class);
                //sacar el contenido de la caja de texto para enviarlos
                //trim quita espacios
                intent.putExtra("myUser",txtUser.getText().toString().trim());

                intent.putExtra("myPassword",txtPassword.getText().toString().trim());

                startActivity(intent);
            }
        });
    }



}
