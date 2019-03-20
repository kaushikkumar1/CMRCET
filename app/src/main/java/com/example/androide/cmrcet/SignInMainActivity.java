package com.example.androide.cmrcet;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class SignInMainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();
    EditText email;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_main2);
        setTitle("KAUSHIK");
        email=(EditText)findViewById(R.id.editTextemail);
        password=(EditText)findViewById(R.id.editTextemail);

        if(mAuth.getCurrentUser()!=null)
        {
            login();
        }


        }
    public void goclick(View view)
    {

            try{

                mAuth.signInWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    login();
                                } else {
                                    // If sign in fails, display a message to the user.
                                    update();
                                }

                                // ...
                            }
                        });
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

    }
    public  void update()
    {
        try{
        mAuth.createUserWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            String str=task.getResult().getUser().getUid().toString();
                            FirebaseDatabase.getInstance().getReference().child("users").child(str).child("email").setValue(email.getText().toString());
                            login();
                            // Sign in success, update UI with the signed-in user's information

                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(getApplicationContext(),"Authentication failed ",Toast.LENGTH_SHORT).show();
                            //  updateUI(null);
                        }

                        // ...
                    }
                });}
                catch(Exception e)
                {
                    e.printStackTrace();
                }
    }
    public  void login()
    {
        Intent intent=new Intent(getApplicationContext(),StudentsActivity.class);
        startActivity(intent);
    }
}
