package com.example.lab03;

import java.util.Date;

public class User {

    String NameOfnote;
    String tages;
    String color;
    boolean pinned;

    void getSummary(){

        System.out.println(NameOfnote+":"+tages+"("+color+")");
    }
}
