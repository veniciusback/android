package br.edu.unoesc.webmob.offtrail.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.WindowFeature;

import br.edu.unoesc.webmob.offtrail.R;

@EActivity(R.layout.activity_login)
@Fullscreen
@WindowFeature(Window.FEATURE_NO_TITLE)

public class LoginActivity extends AppCompatActivity {

    @ViewById
    EditText txtLogin;
    @ViewById
    EditText txtSenha;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btnSair(View v) {
        finish();
        System.exit(0);
    }

    public void btnEntrar(View v) {


        String strLogin = txtLogin.getText().toString();
        String strSenha = txtSenha.getText().toString();

        if (strLogin != null && strSenha != null && !strLogin.trim().equals("") && strLogin.equals("vini") && strSenha.equals("vini"))

        {
            Intent itPrincipal = new Intent(
                    LoginActivity.this,
                    PrincipalActivity.class

            );
            startActivity(itPrincipal);

        } else {
            Toast.makeText(this, "Usuário e/ou senha inválidos", Toast.LENGTH_LONG).show();
            txtLogin.setText("");
            txtSenha.setText("");
            txtLogin.requestFocus();
        }


    }
}
