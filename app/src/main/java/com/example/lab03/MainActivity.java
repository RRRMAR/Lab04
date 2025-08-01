package com.example.lab03;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public static void main(String[] args) {

        com.example.lab03.Note note1 = new com.example.lab03.Note() {
            @Override
            public void display() {

            }
        };
            note1.title = "Homework";
            note1.content = "DO lab3 and summit";
            note1.getSummary();

            com.example.lab03.User userA = new com.example.lab03.User();

            userA.firstName = "SUKRIT";
            userA.lastName = "TAING";
            userA.age = 24;
            userA.getSummary();
    }

}