package com.example.leandro3710;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class Main2Activity extends AppCompatActivity {

    RadioGroup radio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        radio = findViewById(R.id.radioGroup);
    }

    public void func (View v) {
        Intent i = new Intent(
                Main2Activity.this, MainActivity.class
        );
        startActivity(i);
    }
    public void func2 (View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Mensagem!!");
        switch (radio.getCheckedRadioButtonId()) {
            case R.id.radioButton3: builder.setMessage("Radio 1"); break;
            case R.id.radioButton2: builder.setMessage("Radio 2"); break;
            case R.id.radioButton: builder.setMessage("Radio 3"); break;
        }
        builder.show();
    }
}
