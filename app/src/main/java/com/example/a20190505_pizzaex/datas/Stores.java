package com.example.a20190505_pizzaex.datas;

import android.net.Uri;

import java.net.URI;

public class Stores {

    String name;
    String openTime;
    String logoUri;
    String phoneNumber;

    public Stores(String name, String openTime, String logoUri, String phoneNumber) {
        this.name = name;
        this.openTime = openTime;
        this.logoUri = logoUri;
        this.phoneNumber = phoneNumber;
    }
}
