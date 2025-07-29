package com.example.lab03;

public abstract class Note {
    String title;
    String content;
    int createdDate;

    public Note() {
    }

    void getSummary(){

        System.out.println(title+":"+content+"("+createdDate+")");
    }

    public abstract void display();
}
