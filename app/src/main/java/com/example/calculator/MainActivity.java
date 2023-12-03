package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butt1 = findViewById(R.id.button);
        Button butt2 =findViewById(R.id.button2);
        Button butt3 = findViewById(R.id.button3);
        Button butt4 =findViewById(R.id.button4);
        TextView tv3 =  findViewById(R.id.textView3);
        EditText et1 = findViewById(R.id.editText);
        EditText et2 =  findViewById(R.id.editText2);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hi! it is on process", Toast.LENGTH_SHORT).show();
                String s =et1.getText().toString();
                String a = et2.getText().toString();
                int b=Integer.parseInt(s);
                int c=Integer.parseInt(a);
                int d=b-c;
                tv3.setText("the substraction is "+d);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hi! it is on process", Toast.LENGTH_SHORT).show();
                String s =et1.getText().toString();
                String a = et2.getText().toString();
                int b=Integer.parseInt(s);
                int c=Integer.parseInt(a);
                int d=b+c;
                tv3.setText("the addition is "+d);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hi! it is on process", Toast.LENGTH_SHORT).show();
                String s =et1.getText().toString();
                String a = et2.getText().toString();
                double b=Integer.parseInt(s);
                double c=Integer.parseInt(a);
                double d=b/c;
                tv3.setText("the division is "+d);
            }
        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hi! it is on process", Toast.LENGTH_SHORT).show();
                String s =et1.getText().toString();
                String a = et2.getText().toString();
                int b=Integer.parseInt(s);
                int c=Integer.parseInt(a);
                int d=b*c;
                tv3.setText("the multiplication is "+d);
            }
        });

    }
}