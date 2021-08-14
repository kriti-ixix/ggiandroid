package com.kriti.ggiandroid;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper
{
    public static final String dbname = "students";
    public static final int dbver = 1;
    public static final String tablename = "exams";
    public static final String rollno = "rollno";
    public static final String sname = "sname";
    public static final String subject = "subject";
    public static final String marks = "marks";

    public DBHelper(Context context) {
        //Creates the database
        super(context, dbname, null, dbver);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //Creates the table
        sqLiteDatabase.execSQL("create table " + tablename + " (" + rollno + " integer, " + sname + " text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }

    long addData(int rn, String n)
    {
        SQLiteDatabase sq = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(rollno, rn);
        cv.put(sname, n);
        long res = sq.insert(tablename, null, cv);
        return res;
        //If the res = -1, no rows were affected
    }

    String getData(int rn)
    {
        SQLiteDatabase sq = this.getReadableDatabase();
        //select * from tablename where <condition>
        Cursor c = sq.rawQuery("select * from " + tablename + " where " + rollno + "=" + rn, null);
        String name = "";

        if (c.moveToNext())
        {
            name = c.getString(2);
        }

        return name;
    }
}
