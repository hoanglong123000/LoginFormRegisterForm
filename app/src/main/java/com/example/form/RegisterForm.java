package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.os.Bundle;
import android.content.Intent;

public class RegisterForm extends AppCompatActivity {

    private TextView btm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_form);

        btm = (TextView) findViewById(R.id.BacktoLoginFormlink);
        btm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                     backtoLoginForm();
            }
        });
    }

    public void backtoLoginForm()
    {
        Intent LoginFormfunc = new Intent(this, MainActivity.class);
        startActivity(LoginFormfunc);
    }

}