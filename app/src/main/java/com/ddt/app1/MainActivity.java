package com.ddt.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //Variable declaration
    public boolean ban = true;
    protected int n = 12;
    protected string textChanged1 = "Suspicius soup";
    protected string textChanged2 = "Not a good stuff";



    //There, we can do a 'spiritual DOM with the interface elements'
    private TextView userName;
    private Button btn1;
    private Button btn2;
    

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //GetElementById
        userName = (TextView) findViewById(R.id.username);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        btn1.setOnCLickListener(new View.setOnCLickListener(){
            public void OnClick(View view){
                userName.setText(textChanged1);
                //Toast
            }
        
        });


        btn2.setOnCLickListener(new View.setOnCLickListener(){
            @Override
            public void OnClick(View view){
                userName.setText(textChanged2);
            }

        });
    }

    public double calculateArea(int l1, int l2){
        return l1*l2;
    }
}

// To do: Set the mobile develop mode

/* Ciclo de vida
*   OnCreate(); => Siempre se ejecuta por defecto cuando se crea la aplicacion
*   OnStart();  => Se ejecuta cuando se abre la aplicación
*   OnRestart(); =>
*   OnResume(); => Cuando se abre desde segundo plano
*   OnPause(); => Cuando la aplicación está en segundo plano
*   OnStop(); => Actividad no visible para el usuario
*   OnDestroy(); => Cuando se destruye la aplicacion
* */




