package com.exam.lapi_monini_politano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText textNome, textCognome, textEmail, textPassword;
    private Button btnregistra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textNome = findViewById(R.id.text_nome);
        textCognome= findViewById(R.id.text_cognome);
        textEmail = findViewById(R.id.text_email);
        textPassword = findViewById(R.id.text_password);
        btnregistra = findViewById(R.id.btn_registra);
        btnregistra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("nome", textNome.getText().toString());
                intent.putExtra("cognome", textCognome.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        getSupportActionBar().setTitle(getString(R.string.registra));

    }
}