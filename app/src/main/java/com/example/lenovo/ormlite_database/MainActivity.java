package com.example.lenovo.ormlite_database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.EmptyStackException;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    Details_step1 detailsStep1 = new Details_step1();

    private EditText et_name,et_email,et_mbl,et_pwd,et_con_pwd;
    private LinearLayout btn_previous,btn_advance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name=(EditText)findViewById(R.id.et_name_main);
        et_email=(EditText)findViewById(R.id.et_email_main);
        et_mbl=(EditText)findViewById(R.id.et_mbl_main);
        et_pwd=(EditText)findViewById(R.id.et_pwd_main);
        et_con_pwd=(EditText)findViewById(R.id.et_cfm_pwd_main);

        btn_advance=(LinearLayout)findViewById(R.id.btn_adv_main);


        try {

        btn_advance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et_name.getText().toString();
                String email = et_email.getText().toString();
                int mobile = Integer.parseInt(String.valueOf(et_mbl.getText()));
                final String pwd = et_pwd.getText().toString();
                final String cfpwd = et_con_pwd.getText().toString();

                detailsStep1=new Details_step1();
                detailsStep1.setName(name);
                detailsStep1.setEmail(email);
                detailsStep1.setMobile(mobile);
                detailsStep1.setPwd(pwd);
                detailsStep1.setCfpwd(cfpwd);

                if (pwd.equals(cfpwd)){
                    Toast.makeText(getApplicationContext(),"login sucess..",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra("data",detailsStep1);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);

                    et_name.setText("");
                    et_email.setText("");
                    et_mbl.setText("");
                    et_pwd.setText("");
                    et_con_pwd.setText("");

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"pwds are not matching...",Toast.LENGTH_SHORT).show();
                }


            }
        });

        }
        catch (EmptyStackException ignored){

        }

    }
}
