package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String temp;
    int op;
    float result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s;

        a=findViewById(R.id.button);
        b=findViewById(R.id.button2);
        c=findViewById(R.id.button3);
        d=findViewById(R.id.button4);
        e=findViewById(R.id.button5);
        f=findViewById(R.id.button6);
        g=findViewById(R.id.button7);
        h=findViewById(R.id.button8);
        i=findViewById(R.id.button9);
        j=findViewById(R.id.button10);
        k=findViewById(R.id.button11);
        l=findViewById(R.id.button12);
        m=findViewById(R.id.button13);
        n=findViewById(R.id.button14);
        o=findViewById(R.id.button15);
        p=findViewById(R.id.button16);
        EditText edit;
        edit=findViewById(R.id.editTextText);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"1");
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"2");
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"3");
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"4");
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"5");
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"6");
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"7");
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"8");
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"9");
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"0");
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(" ");
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp=edit.getText().toString();
                edit.setText(" ");
                op=1;
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                temp=edit.getText().toString();
                edit.setText(" ");
                op=2;
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                temp=edit.getText().toString();
                edit.setText(" ");
                op=3;
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                temp=edit.getText().toString();
                edit.setText(" ");
                op=4;
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (op)
                {

                    case 1:
                       result=Float.parseFloat(temp)+Float.parseFloat(edit.getText().toString());
                       edit.setText(" ");
                       edit.setText(Float.toString(result));
                        break;
                    case 2:
                        result=Float.parseFloat(temp)-Float.parseFloat(edit.getText().toString());
                        edit.setText(" ");
                        edit.setText(Float.toString(result));
                        break;
                    case 3:
                        result=Float.parseFloat(temp)*Float.parseFloat(edit.getText().toString());
                        edit.setText(" ");
                        edit.setText(Float.toString(result));
                        break;
                    case 4:
                        result=Float.parseFloat(temp)/Float.parseFloat(edit.getText().toString());
                        edit.setText(" ");
                        edit.setText(Float.toString(result));
                        break;
                }

            }
        });






    }
}