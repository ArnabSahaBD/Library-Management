package com.example.fahad.librarymanagementprojectii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fahad.librarymanagementprojectii.librarianPackage.Librarian_login;

public class MainActivity extends AppCompatActivity {
    Button stdn , librn;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stdn = findViewById(R.id.student);
        librn = findViewById(R.id.librarian);
    }
    public  void pressLibrarian()
    {
        librn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Librarian_login.class);
                startActivity(intent);
            }
        });
    }
}
