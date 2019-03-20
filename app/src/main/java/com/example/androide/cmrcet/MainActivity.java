package com.example.androide.cmrcet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=(TextView)findViewById(R.id.textView2);
        textView.setText("CMR College of Engineering & Technology Kandlakoya(v), Medchal Road Hyderabad,Telangana, India - 501401");
    }
    public void signup(View view)
    {
        Intent intent=new Intent(this,SignUpMainActivity.class);
        startActivity(intent);
    }
    public void signin(View view)
    {
        Intent intent=new Intent(this,SignInMainActivity.class);
        startActivity(intent);
    }
    public  void people(View view)
    {

        Intent intent=new Intent(this,StudentsActivity.class);
        startActivity(intent);
    }
}
