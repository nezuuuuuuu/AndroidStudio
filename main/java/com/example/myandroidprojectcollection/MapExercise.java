package com.example.myandroidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HexFormat;

import kotlin.io.LineReader;

public class MapExercise extends AppCompatActivity {
    ImageButton loc1, loc2, loc3, loc4, loc5;
    ConstraintLayout cs;
    ArrayList<View> views;
    ArrayList<TextView> edittexts;
    LinearLayout lo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_exercise);
        cs=(ConstraintLayout) findViewById(R.id.background);
        lo=findViewById(R.id.mainlo);
        loc1=(ImageButton)findViewById(R.id.i1);
        loc2=(ImageButton)findViewById(R.id.i2);
        loc3=(ImageButton)findViewById(R.id.i3);
        loc4=(ImageButton)findViewById(R.id.i4);
        loc5=(ImageButton)findViewById(R.id.i5);
        views=new ArrayList<>();
        edittexts=new ArrayList<>();
        for(int i=0;i<lo.getChildCount();i++) {
            for(int j=0;j<2;j++){
                if(((LinearLayout)(lo.getChildAt(i))).getChildAt(j) instanceof TextView) {
                    edittexts.add((TextView) ((LinearLayout)(lo.getChildAt(i))).getChildAt(j));
                }
            }

        }




        loc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:48.85860537219835, 2.2944873885904564"));
                startActivity(intent);
                cs.setBackground(getDrawable(R.drawable.itowerbg));
                toWhite();
            }
        });
        loc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:10.086926184184614, 118.85471130933657"));
                startActivity(intent);
                cs.setBackground(getDrawable(R.drawable.ugongrockbg));
                toWhite();
            }
        });
        loc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:21.296303077346828, -157.71428597164754"));
                startActivity(intent);
                cs.setBackground(getDrawable(R.drawable.hawaiibg));
                toWhite();
            }
        });
        loc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:35.374167840285146, 138.72562094045503"));
                startActivity(intent);
                cs.setBackground(getDrawable(R.drawable.mtfujibg));
                toWhite();
            }
        });
        loc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:34.4026933582558, 132.45904786377545"));
                startActivity(intent);
                cs.setBackground(getDrawable(R.drawable.hiroshimacastlebg));
                toWhite();
            }
        });
    }
    void toWhite(){
        for (TextView et:
             edittexts) {
            et.setTextColor(Color.WHITE);

        }
    }

}