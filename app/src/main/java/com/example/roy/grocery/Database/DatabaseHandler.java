package com.example.roy.grocery.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.roy.grocery.Util.DbDetails;

public class DatabaseHandler extends SQLiteOpenHelper {

    private Context ctx;

    public DatabaseHandler(Context context) {
        super(context, DbDetails.DB_NAME, null, DbDetails.DB_VERSION);

        this.ctx = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_GROCERY_TABLE = "CREATE TABLE " +DbDetails.TABLE_NAME + "("
                +DbDetails.KEY_ID + " INTEGER PRIMARY KEY," +DbDetails.KEY_ITEM + " TEXT,"
                +DbDetails.KEY_QUANTITY + " TEXT,"
                +DbDetails.KEY_DATE + " LONG);";
        db.execSQL(CREATE_GROCERY_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS"+DbDetails.TABLE_NAME);
        onCreate(db);

    }
}
