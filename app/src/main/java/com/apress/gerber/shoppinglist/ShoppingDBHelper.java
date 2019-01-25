package com.apress.gerber.shoppinglist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.apress.gerber.shoppinglist.ShoppingContract.ShoppingEntry;


public class ShoppingDBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "shoplist.db";
    private static final int DATABASE_VERSION = 1;

    ShoppingDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_SHOPPING_TABLE = "CREATE TABLE " +
                ShoppingEntry.TABLE_NAME + " (" +
                ShoppingEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ShoppingEntry.COLUMN_NAME + " TEXT NOT NULL, " +
                ShoppingEntry.COLUMN_AMOUNT + " INTEGER NOT NULL, " +
                ShoppingEntry.COLUMN_TIMESTAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                ");";

        db.execSQL(SQL_CREATE_SHOPPING_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + ShoppingEntry.TABLE_NAME);
        onCreate(db);
    }
}