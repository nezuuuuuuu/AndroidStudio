package com.example.myandroidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PassingIntentsExercise2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);
        Intent intent=this.getIntent();


        ((TextView)findViewById(R.id.fname)).setText(intent.getStringExtra("fname"));
        ((TextView)findViewById(R.id.lname)).setText(intent.getStringExtra("lname"));
        ((TextView)findViewById(R.id.bday)).setText(intent.getStringExtra("bdate"));
        ((TextView)findViewById(R.id.email)).setText(intent.getStringExtra("email"));
        ((TextView)findViewById(R.id.address)).setText(intent.getStringExtra("addr"));
        ((TextView)findViewById(R.id.stdid)).setText(intent.getStringExtra("stdid"));
        ((TextView)findViewById(R.id.nationality)).setText(intent.getStringExtra("nationality"));
        ((TextView)findViewById(R.id.gender)).setText(intent.getStringExtra("gender"));
        ((TextView)findViewById(R.id.pnum)).setText(intent.getStringExtra("pnum"));
        ((TextView)findViewById(R.id.yrlvl)).setText(intent.getStringExtra("yrlvl"));
        ((TextView)findViewById(R.id.course)).setText(intent.getStringExtra("course"));
        ((TextView)findViewById(R.id.fname)).setText(intent.getStringExtra("fname"));
        ((TextView)findViewById(R.id.fname)).setText(intent.getStringExtra("fname"));
        ((TextView)findViewById(R.id.fname)).setText(intent.getStringExtra("fname"));



    }
}