package com.camilo.prueba1;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Interfaz2 extends AppCompatActivity {

    private EditText emailInput, passwordInput, confirmPasswordInput;
    private Button createAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz2);

        emailInput = findViewById(R.id.email_input);
        passwordInput = findViewById(R.id.password_input);
        confirmPasswordInput = findViewById(R.id.confirm_password_input);
        createAccountButton = findViewById(R.id.create_account_button);

        setDrawableIcons();

        createAccountButton.setOnClickListener(v -> validateAndProceed());
    }

    private void setDrawableIcons() {
        setDrawable(emailInput, R.drawable.a);
        setDrawable(passwordInput, R.drawable.b);
        setDrawable(confirmPasswordInput, R.drawable.b);
    }

    private void setDrawable(EditText editText, int drawableRes) {
        Drawable icon = ContextCompat.getDrawable(this, drawableRes);
        if (icon != null) {
            icon.setBounds(0, 0, 48, 48);
            editText.setCompoundDrawables(icon, null, null, null);
        }
    }

    private void validateAndProceed() {
        String email = emailInput.getText().toString().trim();
        String password = passwordInput.getText().toString();
        String confirmPassword = confirmPasswordInput.getText().toString();

        if (email.isEmpty()) {
            emailInput.setError("Ingrese un correo");
            return;
        }
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailInput.setError("Correo no válido");
            return;
        }
        if (password.isEmpty()) {
            passwordInput.setError("Ingrese una contraseña");
            return;
        }
        if (password.length() < 8) {
            passwordInput.setError("Debe tener al menos 8 caracteres");
            return;
        }
        if (!password.equals(confirmPassword)) {
            confirmPasswordInput.setError("Las contraseñas no coinciden");
            return;
        }


    }
}
