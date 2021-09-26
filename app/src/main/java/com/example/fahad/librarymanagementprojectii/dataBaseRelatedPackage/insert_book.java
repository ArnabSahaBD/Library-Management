package com.example.fahad.librarymanagementprojectii.dataBaseRelatedPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.fahad.librarymanagementprojectii.R;

public class insert_book extends AppCompatActivity {
    EditText bookNam, categry, witerNam, selfno, serialno;
    Button sav,updat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_book);
        sav = findViewById(R.id.save);
        updat = findViewById(R.id.update);
        bookNam = findViewById(R.id.bookName);
        categry = findViewById(R.id.category);
        witerNam = findViewById(R.id.writer);
        selfno = findViewById(R.id.shelf);
        serialno = findViewById(R.id.serial);
    }
}
