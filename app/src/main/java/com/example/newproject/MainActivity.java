package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText etLogin;
    EditText etPassword;

    String strLogin = "qwerty";
    String strPassword = "777";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.res);
        etLogin = findViewById(R.id.etLog);
        etLogin = findViewById(R.id.etPas);
    }

    public void SIGN(View view) {
        String resLogin = etLogin.getText().toString();
        String resPassword = etPassword.getText().toString();


        if (strLogin.equals(resLogin) && strPassword.equals(resPassword))
            tv.setText("Вы вошли в аккаунт");
        else
            tv.setText("Неправильный логин или пароль");

    }
}