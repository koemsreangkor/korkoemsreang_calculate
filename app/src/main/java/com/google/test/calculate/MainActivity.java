package com.google.test.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button add,sub,multi,divi;
    EditText first,second;
    TextView Result;
    EditText t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=(EditText) findViewById(R.id.etfirst);
        second=(EditText) findViewById(R.id.etsecond);
        add=(Button) findViewById(R.id.btnAdd);
        sub=(Button) findViewById(R.id.btnSub);
        multi=(Button) findViewById(R.id.btnMulti);
        divi=(Button) findViewById(R.id.btnDevi);
        Result=(TextView) findViewById(R.id.tvresult);
        t=(EditText) findViewById(R.id.txtshow);


        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String num1= first.getText().toString();
                String num2= second.getText().toString();
                float a= Float.parseFloat(num1);
                float b = Float.parseFloat(num2);
                float c = a+b;

                t.setText(Float.toString(c));

                //Toast.makeText(v.getContext(),Integer.toString(c) , Toast.LENGTH_LONG).show();

            }

        });
        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String num1=first.getText().toString();
                String num2=second.getText().toString();
                int a=Integer.parseInt(num1);
                int b=Integer.parseInt(num2);
                int c=a-b;
                t.setText(Integer.toString(c));
               // Toast.makeText(v.getContext(),Integer.toString(c), Toast.LENGTH_LONG).show();
            }
        });
        multi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String num1=first.getText().toString();
                String num2=second.getText().toString();
                int a=Integer.parseInt(num1);
                int b=Integer.parseInt(num2);
                int c=a*b;
                t.setText(Integer.toString(c));
                //Toast.makeText(v.getContext(),Integer.toString(c), Toast.LENGTH_LONG).show();
            }
        });
        divi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String num1 = first.getText().toString();
                String num2 = second.getText().toString();
                float a = Float.parseFloat(num1);
                float b = Float.parseFloat(num2);
                float c = a / b;
                t.setText(Float.toString(c));
               // Toast.makeText(v.getContext(), Integer.toString(c), Toast.LENGTH_LONG).show();


            }
    });
        }
}
