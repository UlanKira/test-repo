package com.example.startandroid;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "contactdb";
    public static final String TABLE_CONTACTS = "contacts";
    public static final String KEY_ID="id";
    public static final String KEY_NAME="name";
    public static final String KEY_MAIL="mail";

    public DBHelper(@Nullable Context context, @Nullable String name, int version, @NonNull SQLiteDatabase.OpenParams openParams) {
        super(context, name, version, openParams);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_CONTACTS + " ( "+ KEY_ID + " integer primary key," +KEY_NAME + "text,"+KEY_MAIL + "text"+ ")" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+ TABLE_CONTACTS);

        onCreate(db);

    }
}
