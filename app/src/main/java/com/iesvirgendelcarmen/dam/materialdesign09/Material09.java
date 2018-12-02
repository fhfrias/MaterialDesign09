package com.iesvirgendelcarmen.dam.materialdesign09;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Material09 extends AppCompatActivity {

    private static final int DURACION = 250;

    Toolbar toolbar;
    Context context;
    boolean giro;
    ImageView icono;
    LinearLayout linear3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material09);
        toolbar = findViewById(R.id.toolbar);
        linear3 = findViewById(R.id.linear3);
        context = getBaseContext();
        giro = false;

        toolbar.inflateMenu(R.menu.menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.opcion1 :
                        Toast.makeText(context,"PULSADO OPCION 1", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.opcion2 :
                        Toast.makeText(context,"PULSADO OPCION 2", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.opcion3 :
                        Toast.makeText(context,"PULSADO OPCION 3", Toast.LENGTH_SHORT).show();
                        return true;
                    default: return false;
                }
            }
        });

        icono = findViewById(R.id.imagen2);

    }

    public void tocado(View view) {
        if(giro){
            icono.setImageResource(R.mipmap.menos);
            rotate(-180.0f);
            Dinamizador.contrae(linear3, DURACION);
            giro = false;
        } else {
            icono.setImageResource(R.mipmap.mas);
            rotate(180.0f);
            Dinamizador.expande(linear3, DURACION);
            giro = true;
        }

    }

    private void rotate(float angulo){
        Animation animation = new RotateAnimation(0.0f, angulo, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setFillAfter(true);
        animation.setDuration(DURACION);
        icono.startAnimation(animation);
    }
}
