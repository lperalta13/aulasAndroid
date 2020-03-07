package com.example.leandro3710;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    CheckBox c1, c2, c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        c1 = findViewById(R.id.checkBox);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
    }

    public void func_check (View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        if (c1.isChecked()) {
            Toast.makeText(getApplicationContext(),"Check 1", Toast.LENGTH_SHORT).show();
//            c2.setChecked(false);
//            c3.setChecked(false);
        }

        if (c2.isChecked()) {
            Toast.makeText(getApplicationContext(),"Check 2", Toast.LENGTH_SHORT).show();
//            c1.setChecked(false);
//            c3.setChecked(false);

        }

        if (c3.isChecked()) {
            Toast.makeText(getApplicationContext(),"Check 3", Toast.LENGTH_SHORT).show();
//            c2.setChecked(false);
//            c1.setChecked(false);

        }

        builder.show();

    }
}
