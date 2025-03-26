package com.camilo.prueba1;

import android.content.Intent; // Import necesario para redirigir a otra actividad
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Interfaz2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz2);

        // Referencias de los campos de entrada y el botón
        EditText emailInput = findViewById(R.id.email_input);
        EditText passwordInput = findViewById(R.id.password_input);
        EditText confirmPasswordInput = findViewById(R.id.confirm_password_input);

        // Configurar íconos para los campos de entrada
        Drawable emailIcon = getResources().getDrawable(R.drawable.a);
        if (emailIcon != null) {
            emailIcon.setBounds(0, 0, 48, 48);
            emailInput.setCompoundDrawables(emailIcon, null, null, null);
        }

        Drawable passwordIcon = getResources().getDrawable(R.drawable.b);
        if (passwordIcon != null) {
            passwordIcon.setBounds(0, 0, 48, 48);
            passwordInput.setCompoundDrawables(passwordIcon, null, null, null);
        }

        Drawable confirmPasswordIcon = getResources().getDrawable(R.drawable.b);
        if (confirmPasswordIcon != null) {
            confirmPasswordIcon.setBounds(0, 0, 48, 48);
            confirmPasswordInput.setCompoundDrawables(confirmPasswordIcon, null, null, null);
        }

        // Validación y redirección al hacer clic en el botón
        findViewById(R.id.create_account_button).setOnClickListener(v -> {
            String email = emailInput.getText().toString().trim();
            String password = passwordInput.getText().toString();
            String confirmPassword = confirmPasswordInput.getText().toString();

            if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(Interfaz2.this, "Por favor, ingrese un correo válido", Toast.LENGTH_SHORT).show();
            } else if (password.length() < 8) {
                Toast.makeText(Interfaz2.this, "La contraseña debe tener al menos 8 caracteres", Toast.LENGTH_SHORT).show();
            } else if (!password.equals(confirmPassword)) {
                Toast.makeText(Interfaz2.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
            } else {
                // Mensaje de éxito
                Toast.makeText(Interfaz2.this, "Cuenta creada con éxito", Toast.LENGTH_SHORT).show();

                // Redirigir a la nueva actividad
                //Intent intent = new Intent(MainActivity.this, NextActivity.class);
                //startActivity(intent);//
            }
        });
    }
}