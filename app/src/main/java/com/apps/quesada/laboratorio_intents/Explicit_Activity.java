package com.apps.quesada.laboratorio_intents;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Explicit_Activity extends AppCompatActivity {

    private static final int REQUEST_PHONE_CALL = 1;

    ImageView Img;
    TextView Nom;
    TextView Car;
    TextView Cel;
    TextView Correo;
    TextView Page;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_);
        getSupportActionBar().hide();

        ImageView foto = (ImageView) findViewById(R.id.datos_foto);
        Bitmap bitmap = ((BitmapDrawable)foto.getDrawable()).getBitmap();

        Nom = (TextView) findViewById(R.id.datos_nombre);
        Car = (TextView) findViewById(R.id.label_empleo);
        Cel = (TextView) findViewById(R.id.label_telefono);
        Correo = (TextView) findViewById(R.id.label_email);
        Page = (TextView) findViewById(R.id.label_web);

        Bundle Dato=this.getIntent().getExtras();



        String a=Dato.getString("nombre");
        Nom.setText(a);
        String b=Dato.getString("cargo");
        Car.setText(b);
        String c=Dato.getString("telefono");
        Cel.setText(c);
        String d=Dato.getString("email");
        Correo.setText(d);
        String e=Dato.getString("web");
        Page.setText(e);



    }


    public void onClickLlamada(View v) {
        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:"+Cel.getText().toString()));
        if (ContextCompat.checkSelfPermission(Explicit_Activity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(Explicit_Activity.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
        }
        else
        {
            startActivity(i);
        }

    }

    public void sendEmail(View v){
        Intent intent = new Intent(Intent.ACTION_SEND);
        String email = Correo.getText().toString();
        intent.putExtra(Intent.EXTRA_TEXT, "email: "+email);
        intent.setType("text/plain");
        startActivity(intent);
    }

    public void openBrowser(String url){
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }


    public void onclick_Regresar(View view) {
        finish();
    }
}
