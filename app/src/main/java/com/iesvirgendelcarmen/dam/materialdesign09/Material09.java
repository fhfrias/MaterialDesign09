package com.iesvirgendelcarmen.dam.materialdesign09;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Material09 extends AppCompatActivity {

    Toolbar toolbar;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material09);
        toolbar = findViewById(R.id.toolbar);
        context = getBaseContext();

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
    }

    public void tocado(View view) {
    }
}
