package com.example.myandroidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Button> buttons=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons.add(((Button)findViewById(R.id.page2Btn)));
        buttons.add(((Button)findViewById(R.id.Button_Exercise)));
        buttons.add(((Button)findViewById(R.id.calculator)));
//        buttons.add(((Button)findViewById(R.id.page5Btn)));
        buttons.add(((Button)findViewById(R.id.connectact)));

        buttons.add(((Button)findViewById(R.id.passingintents)));
        buttons.add(((Button)findViewById(R.id.passingintents)));


        buttons.add(((Button)findViewById(R.id.menu)));
        buttons.add(((Button)findViewById(R.id.openingMaps)));

        buttons.get(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,LayoutExercise.class);
                startActivity(intent);

            }
        });
        buttons.get(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ButtonExercise.class);
                startActivity(intent);
            }
        });
        buttons.get(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Calculator.class);
                startActivity(intent);
            }
        });
        buttons.get(4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ColorMatching.class);
                startActivity(intent);
            }
        });

        buttons.get(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ConnectThree.class);
                startActivity(intent);
            }
        });
        buttons.get(5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, PassingIntentsExercise.class);
                startActivity(intent);
            }
        });
        buttons.get(6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MenuExercise.class);
                startActivity(intent);
            }
        });
        buttons.get(7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, MapExercise.class);
                startActivity(intent);

            }
        });











    }


    }
