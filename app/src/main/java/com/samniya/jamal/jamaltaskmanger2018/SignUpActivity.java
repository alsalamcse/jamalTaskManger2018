package com.samniya.jamal.jamaltaskmanger2018;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpActivity extends AppCompatActivity {

    private EditText firstNameET, lastNameET, phoneET, passwordET, emailET;
    private Button saveBtn;

    private FirebaseAuth auth;
    private FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        auth=FirebaseAuth.getInstance();
        user=auth.getCurrentUser();
        firstNameET=findViewById(R.id.firstNameET);
        lastNameET=findViewById(R.id.lastNameET);
        phoneET=findViewById(R.id.phoneET);
        passwordET=findViewById(R.id.passwordET);
        emailET=findViewById(R.id.emailET);
        saveBtn=findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataHandler();
            }
        });


    }

    /**
     * get email and password from the field and try to creat a new user
     */
    private void dataHandler()
    {
        boolean isOk=true;//if all the fields filled well
        String email=emailET.getText().toString();
        String pass1=passwordET.getText().toString();
        String fname=firstNameET.getText().toString();
        String lname=lastNameET.getText().toString();
        String phone=phoneET.getText().toString();
        if(email.length()<4||email.indexOf('@')<0||email.indexOf('.')<0)
        {
            emailET.setError("WRONG EMAIL");
            isOk=false;

        }
        if (pass1.length()<8)
        {
            passwordET.setError("HAVE TO BE AT LEAST 8 CHAR");
            isOk=false;
        }
        if (isOk)
        {
            creatAcount(email,pass1);
        }

    }

    /**
     * creat firebase user using email and password
     * @param email user email
     * @param passw user password
     */
    private void creatAcount(String email, String passw) {
        auth.createUserWithEmailAndPassword(email,passw).addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(SignUpActivity.this, "Authentication Successful.", Toast.LENGTH_SHORT).show();
                    //updateUserProfile(task.getResult().getUser());
                    finish();
                }
                else
                {
                    Toast.makeText(SignUpActivity.this, "Authentication failed."+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    task.getException().printStackTrace();
                }
            }
        });

    }


}
