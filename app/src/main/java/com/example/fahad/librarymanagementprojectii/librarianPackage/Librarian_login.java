package com.example.fahad.librarymanagementprojectii.librarianPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fahad.librarymanagementprojectii.R;

public class Librarian_login extends AppCompatActivity {
    EditText UserId,Pass;
    Button login;
    private  String u = "admin";
    private String p = "admin786";
    String u1;
    String pa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_librarian_login);
        UserId = findViewById(R.id.userId);
        Pass  = findViewById(R.id.pass);
        login = findViewById(R.id.login);
        LoginPress();
    }
    public  void LoginPress()
    {
        u1 = UserId.getText().toString();
        pa = Pass.getText().toString();
        if(u1.equals(u) && pa.equals(p))
        {

        }
        else
        {
            Toast.makeText(getApplicationContext(),"Wrong user id or pass ",Toast.LENGTH_LONG).show();
        }

    }
}
