package com.example.lenovo.ormlite_database;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by LENOVO on 27-03-2018.
 */

public class Details_step1 implements Parcelable {

    String name;
    String email;
    int mobile;
    String pwd;
    String cfpwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCfpwd() {
        return cfpwd;
    }

    public void setCfpwd(String cfpwd) {
        this.cfpwd = cfpwd;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.email);
        dest.writeInt(this.mobile);
        dest.writeString(this.pwd);
        dest.writeString(this.cfpwd);
    }

    public Details_step1() {
    }

    protected Details_step1(Parcel in) {
        this.name = in.readString();
        this.email = in.readString();
        this.mobile = in.readInt();
        this.pwd = in.readString();
        this.cfpwd = in.readString();
    }

    public static final Parcelable.Creator<Details_step1> CREATOR = new Parcelable.Creator<Details_step1>() {
        @Override
        public Details_step1 createFromParcel(Parcel source) {
            return new Details_step1(source);
        }

        @Override
        public Details_step1[] newArray(int size) {
            return new Details_step1[size];
        }
    };
}
