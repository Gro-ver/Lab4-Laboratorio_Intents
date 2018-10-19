package com.apps.quesada.laboratorio_intents;

import android.content.Intent;
import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void operacion(View view) {

        Intent intent = new Intent(MainActivity.this, Explicit_Activity.class);
        Bundle Dato = new Bundle();

        switch (view.getId()) {

            case R.id.Primero:



                Dato.putString("nombre","Carla Fernandez");
                Dato.putString("cargo","Doctora");
                Dato.putString("telefono","940466209");
                Dato.putString("email","carla.fernandez@gmail.com");
                Dato.putString("web","www.medicollege.com");

                intent.putExtras(Dato);

                startActivity(intent);
                break;

            case R.id.Segundo:


                Dato.putString("nombre","Carlos Ayala");
                Dato.putString("cargo","DBAdmin");
                Dato.putString("telefono","935654765");
                Dato.putString("email","carlos.ayala@gmail.com");
                Dato.putString("web","www.appsolution.com");

                intent.putExtras(Dato);

                startActivity(intent);
                break;

            case R.id.Tercero:


                Dato.putString("nombre","Karolina Bustamante");
                Dato.putString("cargo","Software Development");
                Dato.putString("telefono","966356654");
                Dato.putString("email","karolina.bustamante98@gmail.com");
                Dato.putString("web","www.androiddev.com");

                intent.putExtras(Dato);

                startActivity(intent);
                break;

            case R.id.Cuarto:


                Dato.putString("nombre","Lana Rain");
                Dato.putString("cargo","Streamer");
                Dato.putString("telefono","954322345");
                Dato.putString("email","lana.rain34@gmail.com");
                Dato.putString("web","www.streanm.com");

                intent.putExtras(Dato);

                startActivity(intent);
                break;
        }


    }
}
