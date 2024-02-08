package com.ddt.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //Variable declaration
    public boolean ban = true;
    protected int n = 12;
    protected string textChanged1 = "Suspicius soup";
    protected string textChanged2 = "Suspicius soup";



    //There, we can do a 'spiritual DOM with the interface elements'
    private TextView userName;
    private Button btn1;
    private Button btn2;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //GetElementById
        userName = (TextView) findViewById(R.id.username);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        
        btn1.setOnCLickListener(new View.setOnCLickListener(){

            @Override
            public void OnClick(View view){
                userName.setText(textChanged1);
            }
        
        });
    }
}




