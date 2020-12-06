package com.nevin.didem.bilgihan.team3_project;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Log;

import java.util.ArrayList;

public class BookDB {
    public static String TABLE_NAME="books";
    public static String FIELD_ID = "id";
    public static String FIELD_NAME = "name";
    public static String FIELD_AUTHOR = "author";
    public static String FIELD_DETAILS = "details";
    public static String FIELD_CATEGORY = "category";
    public static String FIELD_IMAGE = "image";

    public static String CREATE_TABLE_SQL="CREATE TABLE TABLE_NAME ( "+FIELD_ID+" INTEGER, "+FIELD_NAME+" TEXT, "+FIELD_AUTHOR+" TEXT, "+FIELD_DETAILS+" TEXT, "+FIELD_CATEGORY+" TEXT, "+FIELD_IMAGE+" TEXT, PRIMARY KEY("+FIELD_ID+" AUTOINCREMENT))";
    public static String DROP_TABLE_SQL = "DROP TABLE if exists "+TABLE_NAME;

    public static ArrayList<Book>  getAllBook(DatabaseHelper dbHelper){
        Book anItem;
        ArrayList<Book> data = new ArrayList<>();
        Cursor cursor = dbHelper.getAllRecords(TABLE_NAME, null);
        Log.d("DATABASE OPERATIONS", cursor.getCount()+",  "+cursor.getColumnCount());
        while(cursor.moveToNext()){
            int id=cursor.getInt(0);
            String name = cursor.getString(1);
            String author= cursor.getString(2);
            String detail= cursor.getString(3);
            String category= cursor.getString(4);
            String image= cursor.getString(5);
            anItem = new Book(id, name, author, detail, category, image);
            data.add(anItem);

        }
        Log.d("DATABASE OPERATIONS",data.toString());
        return data;
    }
}
