package chl.ancud.m4_individual9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setClickListeners();
    }

    private void setClickListeners() {
        ImageButton btn_imagen1 = findViewById(R.id.btn_imagen1);
        ImageButton btn_imagen2 = findViewById(R.id.btn_imagen2);
        ImageButton btn_imagen3 = findViewById(R.id.btn_imagen3);
        ImageButton btn_imagen4 = findViewById(R.id.btn_imagen4);

        int imagen1 = android.R.drawable.ic_dialog_map;
        int imagen2 = android.R.drawable.ic_dialog_dialer;
        int imagen3 = android.R.drawable.ic_dialog_email;
        int imagen4 = android.R.drawable.btn_star_big_on;
        btn_imagen1.setImageResource(imagen1);
        btn_imagen2.setImageResource(imagen2);
        btn_imagen3.setImageResource(imagen3);
        btn_imagen4.setImageResource(imagen4);


        btn_imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //iniciaSegundaActividad();
                Log.d("getTaG", this.toString());
                Drawable imagencita = btn_imagen1.getDrawable().getCurrent();
                ///Log.d("getTaG", imagencita.);
            }
        });

        btn_imagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irSegunda = new Intent(MainActivity.this, SegundaActivity.class);
            }
        });
    }

    protected void iniciaSegundaActividad(Drawable imagen) {
        Intent irSegunda = new Intent(MainActivity.this, SegundaActivity.class);
        // irSegunda.putExtra("imagen", imagen);
        startActivity(irSegunda);
    }
}