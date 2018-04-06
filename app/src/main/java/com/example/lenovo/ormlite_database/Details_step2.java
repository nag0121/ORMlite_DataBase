package com.example.lenovo.ormlite_database;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by LENOVO on 27-03-2018.
 */

public class Details_step2 implements Parcelable {

    String name;
    String email;
    int mobile;
    String pwd;
    String cfpwd;
    String firstname;
    String lastname;
    String address;
    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        dest.writeString(this.firstname);
        dest.writeString(this.lastname);
        dest.writeString(this.address);
        dest.writeString(this.state);
    }

    public Details_step2() {
    }

    protected Details_step2(Parcel in) {
        this.name = in.readString();
        this.email = in.readString();
        this.mobile = in.readInt();
        this.pwd = in.readString();
        this.cfpwd = in.readString();
        this.firstname = in.readString();
        this.lastname = in.readString();
        this.address = in.readString();
        this.state = in.readString();
    }

    public static final Creator<Details_step2> CREATOR = new Creator<Details_step2>() {
        @Override
        public Details_step2 createFromParcel(Parcel source) {
            return new Details_step2(source);
        }

        @Override
        public Details_step2[] newArray(int size) {
            return new Details_step2[size];
        }
    };
}
