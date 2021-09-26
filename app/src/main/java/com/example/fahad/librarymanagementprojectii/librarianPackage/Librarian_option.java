package com.example.fahad.librarymanagementprojectii.librarianPackage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fahad.librarymanagementprojectii.R;
import com.example.fahad.librarymanagementprojectii.dataBaseRelatedPackage.insert_book;

public class Librarian_option extends AppCompatActivity {
    Button insert,provide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_librarian_option);
        insert = findViewById(R.id.insert);
        provide = findViewById(R.id.providedBook);
        PressInsert();
    }
    void PressInsert()//if librarian press insert button , this function will execute
    {
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),insert_book.class);
                startActivity(intent);
            }
        });

    }
}
