package com.samniya.jamal.jamaltaskmanger2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    private EditText firstNameET, lastNameET, phoneET, passwordET, emailET;
    private Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        firstNameET=findViewById(R.id.firstNameET);
        lastNameET=findViewById(R.id.lastNameET);
        phoneET=findViewById(R.id.phoneET);
        passwordET=findViewById(R.id.passwordET);
        emailET=findViewById(R.id.emailET);
        saveBtn=findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
