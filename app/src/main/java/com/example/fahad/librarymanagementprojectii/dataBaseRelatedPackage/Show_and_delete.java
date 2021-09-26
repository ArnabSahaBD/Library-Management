package com.example.fahad.librarymanagementprojectii.dataBaseRelatedPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.fahad.librarymanagementprojectii.R;

public class Show_and_delete extends AppCompatActivity {
    Button show,delete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_and_delete);
        show = findViewById(R.id.show);
        delete = findViewById(R.id.delete);
    }
}
