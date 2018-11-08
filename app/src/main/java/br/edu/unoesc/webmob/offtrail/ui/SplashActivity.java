package br.edu.unoesc.webmob.offtrail.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.WindowFeature;

import br.edu.unoesc.webmob.offtrail.R;


@EActivity(R.layout.activity_splash)
@Fullscreen
@WindowFeature(Window.FEATURE_NO_TITLE)
public class SplashActivity extends AppCompatActivity {
    @AfterViews
    @Background(delay = 3000)
    public void run() {
        Intent itLogin = new Intent(
                this,
                LoginActivity_.class

        );
        startActivity(itLogin);
        finish();


    }

}

/*

    Sem pacote Anotation
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler h = new Handler();

        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent itLogin = new Intent(
                        SplashActivity.this,
                        LoginActivity.class

                );
                startActivity(itLogin);
                finish();


            }
        }, 3000);
    }

*/

