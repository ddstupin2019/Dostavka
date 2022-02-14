package com.example.dotavkasql;

import android.util.Log;

import com.google.gson.Gson;

import java.io.InputStream;
import java.util.Scanner;

public class GsonParser {
    public Root parce(InputStream inputStream){
        Gson gson = new Gson();
        Scanner in = new Scanner(inputStream);
        String rez = "";
        while ( (in.hasNext())){
            rez+=in.nextLine();
        }
        Log.d("My", rez);
        Root root = gson.fromJson(rez, Root.class);
        return root;
    }
}
