package com.example.btfirebasetonghop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignIn extends AppCompatActivity {

    private EditText username, password;
    private Button buttonLogin, buttonSignup;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        mAuth = FirebaseAuth.getInstance();

        username = (EditText) findViewById(R.id.signinusername);
        password = (EditText) findViewById(R.id.signinpass);
        buttonLogin = (Button) findViewById(R.id.signinsubmit);
        buttonSignup = (Button) findViewById(R.id.signinsignup);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login();
            }
        });
        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignUp();
            }
        });
    }

    private void SignUp() {
        Intent i = new Intent(SignIn.this, SignUp.class);
        startActivity(i);
    }

    private void Login() {
        String email, pass;
        email = username.getText().toString();
        pass = password.getText().toString();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Nhap Email !",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(pass)){
            Toast.makeText(this,"Nhap Password !",Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(getApplicationContext(),"Dang nhap thanh cong !", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(SignIn.this, Home.class);
        startActivity(i);
//        mAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                if (task.isSuccessful()) {
//                    Toast.makeText(getApplicationContext(),"Dang nhap thanh cong !", Toast.LENGTH_SHORT).show();
//                    Intent i = new Intent(SignIn.this, Home.class);
//                    startActivity(i);
//                }
//                else {
//                    Toast.makeText(getApplicationContext(),"Dang nhap khong thanh cong !", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }
}