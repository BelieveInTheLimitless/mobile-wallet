package com.mifos.mobilewallet.model.entity.templates.account;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Rajan Maurya on 10/03/17.
 */

public class AccountType implements Parcelable {

    public static final Creator<AccountType> CREATOR =
            new Creator<AccountType>() {
                @Override
                public AccountType createFromParcel(Parcel source) {
                    return new AccountType(source);
                }

                @Override
                public AccountType[] newArray(int size) {
                    return new AccountType[size];
                }
            };
    @SerializedName("id")
    Integer id;
    @SerializedName("code")
    String code;
    @SerializedName("value")
    String value;

    public AccountType() {
    }

    protected AccountType(Parcel in) {
        this.id = (Integer) in.readValue(Integer.class.getClassLoader());
        this.code = in.readString();
        this.value = in.readString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.code);
        dest.writeString(this.value);
    }
}
