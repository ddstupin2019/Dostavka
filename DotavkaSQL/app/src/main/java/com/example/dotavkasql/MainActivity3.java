package com.example.dotavkasql;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
Button b1;
TextView e1,e2,e3,e4,c1,c2,c3,c4,t1,t2,t3,t4,k1,k2,k3,k4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        init();
//        ins();
//        print();

    }
    public void init(){

        e1=findViewById(R.id.TextView1);
        e2=findViewById(R.id.TextView2);
        e3=findViewById(R.id.TextView3);
        e4=findViewById(R.id.TextView4);

        c1=findViewById(R.id.TextView5);
        c2=findViewById(R.id.TextView6);
        c3=findViewById(R.id.TextView7);
        c4=findViewById(R.id.TextView8);

        t1=findViewById(R.id.TextView9);
        t2=findViewById(R.id.TextView10);
        t3=findViewById(R.id.TextView11);
        t4=findViewById(R.id.TextView12);

        k1=findViewById(R.id.TextView13);
        k2=findViewById(R.id.TextView14);
        k3=findViewById(R.id.TextView15);
        k4=findViewById(R.id.TextView16);

        b1=findViewById(R.id.button1);
        b1.setOnClickListener(this);

    }
    public void ins(){
        Root root=MainActivity.root;
        Support.chel(root);
        Support.ekbM(root);
        Support.kurM(root);
        Support.tumM(root);
    }
    @SuppressLint("SetTextI18n")
    public void print(){

        DateFormat dateFormat = new SimpleDateFormat("MMyyyy");
        Date date = new Date();
        int d = Integer.parseInt(dateFormat.format(date));

        Output e=MainActivity.database.select("ed",d);
        e1.setText(e.KoleT+"");
        e2.setText(e.ProfinTD+"");
        e3.setText(e.LongT+" "+e.KprD+"%");
        e4.setText(e.KoleF+" "+e.KprF+"%");

        Output c=MainActivity.database.select("cd", d);
        c1.setText(c.KoleT+"");
        c2.setText(c.ProfinTD+"");
        c3.setText(c.LongT+" "+c.KprD+"%");
        c4.setText(c.KoleF+" "+c.KprF+"%");

        Output t=MainActivity.database.select("td", d);
        t1.setText(t.KoleT+"");
        t2.setText(t.ProfinTD+"");
        t3.setText(t.LongT+" "+t.KprD+"%");
        t4.setText(t.KoleF+" "+t.KprF+"%");

        Output k=MainActivity.database.select("kd", d);
        k1.setText(k.KoleT+"");
        k2.setText(k.ProfinTD+"");
        k3.setText(k.LongT+" "+k.KprD+"%");
        k4.setText(k.KoleF+" "+k.KprF+"%");
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}