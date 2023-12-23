package com.example.efimenko_v_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;
    private String username;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonBr);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputUsername = editTextUsername.getText().toString();
                String inputPassword = editTextPassword.getText().toString();

                boolean isUserValid = checkUser(inputUsername, inputPassword);

                if (isUserValid) {
                    showToast("Логин и пароль вырный");
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("username", inputUsername);
                    startActivity(intent);
                } else {
                    showToast("Логин или пароль неверный");
                }
            }
        });

        createUser("Egor", "pr21101");
        createUser("q", "1");
    }

    private void createUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private boolean checkUser(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}