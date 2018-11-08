package br.edu.unoesc.webmob.offtrail.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.androidannotations.annotations.ViewById;

import br.edu.unoesc.webmob.offtrail.R;

public class CadastroActivity extends AppCompatActivity {


    @ViewById
    EditText txtNome;
    @ViewById
    EditText txtIdade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void btnCancelar(View v) {
        finish();

    }

    public void btnSalvar(View v) {


        String strNome = txtNome.getText().toString();
        String strIdade = txtIdade.getText().toString();

        if (strNome != null && strIdade != null && !strNome.trim().equals(""))

        {


        } else {
            Toast.makeText(this, "Preencha os dasdos corretamente!", Toast.LENGTH_LONG).show();
            txtNome.setText("");
            txtIdade.setText("");
            txtNome.requestFocus();
        }


    }
}
