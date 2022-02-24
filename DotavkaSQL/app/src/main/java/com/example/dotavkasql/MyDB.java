package com.example.dotavkasql;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyDB {
    private static String DATABASE_NAME = "simple.db";
    private static String TABLE_NAME = "days";
    private static int DATABASE_VERSION = 11;

    private String COLUMN_ID = "_id";
    private String COLUMN_KoleT = "KoleT";
    private String COLUMN_LongT = "LongT";
    private String COLUMN_KprD = "KprD";
    private String COLUMN_KoleF= "KoleF";
    private String COLUMN_KprF = "KprF";
    private String COLUMN_ProfinTD= "ProfinTD";
    private String COLUMN_town= "Town";
    private String COLUM_DATE="Date";

    private int NUM_COLUMN_ID = 0;
    private int NUM_COLUMN_KoleT = 1;
    private int NUM_COLUMN_LongT = 2;
    private int NUM_COLUMN_KprD = 3;
    private int NUM_COLUMN_KoleF = 4;
    private int NUM_COLUMN_KprF = 5;
    private int NUM_COLUMN_ProfinTD = 6;
    private int NUM_COLUMN_town=7;
    private int NUM_COLUM_DATE=8;

    private SQLiteDatabase database;

    public MyDB(Context context) {
        OpenHelper mOpenHelper = new OpenHelper(context);
        database = mOpenHelper.getWritableDatabase();
    }

    public Output select(String town, Integer a){
        Cursor cursor = database.query(TABLE_NAME, null, COLUMN_town+"="+"'"+town+"' AND "+COLUM_DATE+"="+a, null, null, null, null);
        Output output;
        if (cursor.moveToFirst()) {
            output = new Output();
            output.KoleT = cursor.getInt(NUM_COLUMN_KoleT);
            output.LongT = cursor.getInt(NUM_COLUMN_LongT);
            output.KprD = cursor.getInt(NUM_COLUMN_KprD);
            output.KoleF = cursor.getInt(NUM_COLUMN_KoleF);
            output.KprF = cursor.getInt(NUM_COLUMN_KprF);
            output.ProfinTD = cursor.getInt(NUM_COLUMN_ProfinTD);
            cursor.close();
            return output;
        }
        cursor.close();
        Log.d("Ny","null");
        return null;
    }
    public long insertM(Output output){
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_KoleT, output.KoleT);
        contentValues.put(COLUMN_LongT, output.LongT);
        contentValues.put(COLUMN_KprD, output.KprD);
        contentValues.put(COLUMN_KoleF, output.KoleF);
        contentValues.put(COLUMN_KprF, output.KprF);
        contentValues.put(COLUMN_ProfinTD, output.ProfinTD);
        contentValues.put(COLUMN_town, output.town);
        contentValues.put(COLUM_DATE, output.date);
        return database.insert(TABLE_NAME, null, contentValues);
    }

    class OpenHelper extends SQLiteOpenHelper {

        public OpenHelper(@Nullable Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String query = "create table " + TABLE_NAME + " (" +
                    COLUMN_ID + " integer primary key autoincrement not null, " +
                    COLUMN_KoleT + " integer not null, " +
                    COLUMN_LongT + " integer not null, " +
                    COLUMN_KprD + " integer not null, " +
                    COLUMN_KoleF + " integer not null, " +
                    COLUMN_KprF + " integer not null, " +
                    COLUMN_ProfinTD + " integer not null,"+
                    COLUMN_town + " text not null, "+
                    COLUM_DATE + "integer not null);";

            db.execSQL(query);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("drop table if exists " + TABLE_NAME);
            onCreate(db);
        }
    }

    public static void setDatabaseVersion(int databaseVersion) {
        DATABASE_VERSION = databaseVersion;
    }

    public static int getDatabaseVersion() {
        return DATABASE_VERSION;
    }
}
