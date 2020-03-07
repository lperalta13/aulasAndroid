package com.example.leandro3710;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.KeyStore;


public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    ImageView im1;
    int i=0;

    @Override //significa sobrepor nesse
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);



        Configuration config = getResources().getConfiguration();

        if(config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.tela2);
        }else {
            setContentView(R.layout.activity_main);
        }


        tv1 = findViewById(R.id.editText);
        tv2 = findViewById(R.id.editText2);
        tv3 = findViewById(R.id.textView3);
        im1 = findViewById(R.id.imageView);

    }
    public void funcao1(View view){
        tv3.setText(tv2.getText());
    }

    public void funcao2(View view) {
        if (i == 0) {
            im1.setImageResource(R.drawable.dragao);
            i = 1;
        }else{
            im1.setImageResource(R.drawable.drag);
            i = 0;
        }
    }
    public void funcao3(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Alerta");
        alert.setMessage("Nome: " + tv1.getText() + "\nSenha: " + tv2.getText());
        alert.setPositiveButton("OK", null);
        alert.show();
    }
    public void func (View v) {
        Intent i = new Intent(
                MainActivity.this, Main2Activity.class
        );
        startActivity(i);
    }
}
