package com.example.stutijain.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Result;
    EditText etVar1, etVar2;
    Button btnAdd,btnSub,btnMul,btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView Result = findViewById(R.id.Result);
        final EditText etVar1 = findViewById(R.id.etVar1);
        final EditText etVar2 = findViewById(R.id.etVar2);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSub = findViewById(R.id.btnSub);
        Button btnMul = findViewById(R.id.btnMul);
        Button btnDiv = findViewById(R.id.btnDiv);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int var1 = Integer.valueOf(etVar1.getText().toString());
                int var2 = Integer.valueOf(etVar2.getText().toString());
                int var3 = var1 + var2;
                Result.setText(String.valueOf(var3));
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int var1 = Integer.valueOf(etVar1.getText().toString());
                int var2 = Integer.valueOf(etVar2.getText().toString());
                int var3 = var1 + var2;
                Result.setText(String.valueOf(var3));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int var1 = Integer.valueOf(etVar1.getText().toString());
                int var2 = Integer.valueOf(etVar2.getText().toString());
                int var3 = var1 - var2;
                Result.setText(String.valueOf(var3));
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int var1 = Integer.valueOf(etVar1.getText().toString());
                int var2 = Integer.valueOf(etVar2.getText().toString());
                int var3 = var1 * var2;
                Result.setText(String.valueOf(var3));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int var1 = Integer.valueOf(etVar1.getText().toString());
                int var2 = Integer.valueOf(etVar2.getText().toString());
                int var3 = var1 / var2;
                Result.setText(String.valueOf(var3));
            }
        });
    }
}
