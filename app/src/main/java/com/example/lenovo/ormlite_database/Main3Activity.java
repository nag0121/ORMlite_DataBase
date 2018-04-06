package com.example.lenovo.ormlite_database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

public class Main3Activity extends AppCompatActivity {

    Details_step2 details_step2;
    MyDataBase dataBase = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView tv_data = (TextView) findViewById(R.id.tv_data_main3);

        Intent intent = getIntent();

        details_step2 = new Details_step2();

        details_step2=getIntent().getParcelableExtra("data1");

        String name = details_step2.getName();
        String email = details_step2.getEmail();
        int mobile = details_step2.getMobile();
        String pwd = details_step2.getPwd();
        String cfpwd = details_step2.getCfpwd();
        String first = details_step2.getFirstname();
        String last = details_step2.getLastname();
        String address = details_step2.getAddress();
        String state = details_step2.getState();

        tv_data.setText("name :"+name+"\n"+"email :"+email+"\n"+"mobileno :"+mobile+"\n"+"password :"+pwd+"\n"+"first name :"+first+"\n"+"last name :"+last+"\n"+"city :"+address+"\n"+"state :"+state+"\n");


        User user = new User();

        user.name = name;
        user.email = email;


        try {
            final Dao<User,Integer> users = getHelper().getUserDao();

            users.create(user);


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    private MyDataBase getHelper() {
        if (dataBase == null){
            dataBase= OpenHelperManager.getHelper(this,MyDataBase.class);

        }

    return dataBase;
    }
}
