package com.example.animaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView IVImagen;
    private Button BTNAnimar;
    private Animation leftRight;
    private Animation escalado;
    private Animation parpadeo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        BTNAnimar.setOnClickListener(view -> {
            //activarMovimiento();
            //activarEscalado();
            activarParpadeo();
        });
    }

    private void activarParpadeo() {
        parpadeo = AnimationUtils.loadAnimation(this, R.anim.parpadeo);
        parpadeo.setDuration(500);
        // Comienza de 0 a su limite o al infinito
        parpadeo.setRepeatCount(Animation.INFINITE);
        parpadeo.setRepeatMode(Animation.REVERSE);

        IVImagen.startAnimation(parpadeo);
    }

    private void activarEscalado() {
        escalado = AnimationUtils.loadAnimation(this, R.anim.scale);
        escalado.setDuration(1000);

        IVImagen.startAnimation(escalado);
    }
    private void activarMovimiento() {
        leftRight = AnimationUtils.loadAnimation(this, R.anim.left_right);
        leftRight.setDuration(5000);

        IVImagen.startAnimation(leftRight);
    }
    private void inicializarVistas() {
        IVImagen = findViewById(R.id.IVImagen);
        BTNAnimar = findViewById(R.id.BTNAnimar);
    }
}