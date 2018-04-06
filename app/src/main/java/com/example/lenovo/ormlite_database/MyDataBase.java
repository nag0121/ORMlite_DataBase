package com.example.lenovo.ormlite_database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

public class MyDataBase extends OrmLiteSqliteOpenHelper {

    SQLiteDatabase database;

    private static final String DATA_BASE_NAME = "MyDatabase";
    private static final int DATA_BASE_VERSON = 101;

    private Dao<User, Integer> mUserDao = null;


    public MyDataBase(Context context) {
        super(context, DATA_BASE_NAME, null, DATA_BASE_VERSON);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {

        try {

            TableUtils.clearTable(connectionSource,User.class);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

        try {

            TableUtils.dropTable(connectionSource,User.class,true);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public Dao<User, Integer> getUserDao() throws SQLException {
        if (mUserDao == null) {
            mUserDao = getDao(User.class);
        }

        return mUserDao;
    }

    @Override
    public void close() {
        mUserDao = null;

        super.close();
    }
}
