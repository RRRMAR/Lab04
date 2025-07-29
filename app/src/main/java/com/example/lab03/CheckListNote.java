package com.example.lab03;

import java.util.List;

public class CheckListNote extends com.example.lab03.Note {

    private List<String> items;

    public CheckListNote(String title, String createdDate,List<String> items) {
        super();
        this.items = items;
    }
    @Override
    public void display() {
        System.out.println(title+":("+createdDate+")");
        System.out.println(items);
    }
}

