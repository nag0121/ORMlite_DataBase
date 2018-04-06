package com.example.lenovo.ormlite_database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {

    String name_,email_,pwd_,con_pwd;
    int mbl;
    Details_step1 details_step1;

    EditText first,last,address,state;
    LinearLayout btn_pre,btn_adv;

    Details_step2 detailsStep2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        first = (EditText)findViewById(R.id.et_first_main);
        last = (EditText)findViewById(R.id.et_last_main);
        address = (EditText)findViewById(R.id.et_vl_main);
        btn_adv = (LinearLayout)findViewById(R.id.btn_adv_main2);
        btn_pre = (LinearLayout)findViewById(R.id.btn_pre_main2);
        state = (EditText)findViewById(R.id.et_state_main);



            btn_adv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = getIntent();

                    detailsStep2=new Details_step2();

                    details_step1=getIntent().getParcelableExtra("data");

                    name_=details_step1.getName();
                    email_=details_step1.getEmail();
                    mbl=details_step1.getMobile();
                    pwd_=details_step1.getPwd();
                    con_pwd=details_step1.getCfpwd();

                    String first_name_ = first.getText().toString();
                    String last_name_ = last.getText().toString();
                    String address_ = address.getText().toString();
                    String state_=state.getText().toString();

                    detailsStep2.setName(name_);
                    detailsStep2.setEmail(email_);
                    detailsStep2.setMobile(mbl);
                    detailsStep2.setPwd(pwd_);
                    detailsStep2.setCfpwd(con_pwd);
                    detailsStep2.setFirstname(first_name_);
                    detailsStep2.setLastname(last_name_);
                    detailsStep2.setAddress(address_);
                    detailsStep2.setState(state_);

                    Intent intent1 = new Intent(Main2Activity.this,Main3Activity.class);
                    intent1.putExtra("data1",detailsStep2);
                    startActivity(intent1);

                    first.setText("");
                    last.setText("");
                    address.setText("");
                    state.setText("");

                }
            });

            btn_pre.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                    startActivity(intent);

                }
            });
    }
}
