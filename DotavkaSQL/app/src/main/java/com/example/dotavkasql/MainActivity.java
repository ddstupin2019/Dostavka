package com.example.dotavkasql;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
MyDB database;
TextView e1,e2,e3,e4;
Root root;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        ins();
        sd();
    }
    public void ins(){
        InputStream inputStream = getResources().openRawResource(R.raw.dt);
        GsonParser gsonParser = new GsonParser();
        root = gsonParser.parce(inputStream);

        Log.d("Ny",root.EkbObject.getNumberOfCompletedOrdersTheDay());
        Output e=Support.ekb(root),p=Support.tum(root),k=Support.kur(root),c=Support.chel(root);
        database.insertM(e,"ed");
        database.insertM(p,"pd");
        database.insertM(k,"kd");
        database.insertM(c,"cd");
    }
    public void init(){
        database = new MyDB(this);

        e1=findViewById(R.id.textView2);
        e2=findViewById(R.id.textView3);
        e3=findViewById(R.id.textView4);
        e4=findViewById(R.id.textView5);
    }
    public  void sd(){

       Output e=database.select("ed");
       e1.setText(e.KoleT);
       e2.setText(e.ProfinTD);
       e3.setText(e.LongT+" "+e.KprD);
       e4.setText(e.KoleF+" "+e.KprF);

    }
}