package com.example.myandroidprojectcollection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MenuExercise extends AppCompatActivity {
    Button transformingButton;
    boolean left=false;
    boolean heightchanged=false;
    float x,y;
    GradientDrawable shape=new GradientDrawable();


   int height;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_menu_exercise);
        transformingButton=findViewById(R.id.btnTransformingButton);


    }
    void btnInit(Button btn){


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_menuexercise,menu);
        return true;
    }
    void circle(){
        //transformingButton.setHeight(transformingButton.getWidth());


        ViewGroup.LayoutParams params = transformingButton.getLayoutParams();
        params.width = ViewGroup.LayoutParams.WRAP_CONTENT;
        transformingButton.setLayoutParams(params);
        int temp2 = transformingButton.getWidth();
        transformingButton.setHeight(temp2);
        shape.setCornerRadius(transformingButton.getHeight());
        shape.setColor(Color.BLACK);
        transformingButton.setBackground(shape);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.mItemChangeColor){
            transformingButton.setBackgroundColor(Color.RED);
        }
        if(item.getItemId()==R.id.mItemRotate){

            ObjectAnimator ob=ObjectAnimator.ofFloat(transformingButton, "rotation", 0f, 3600f);
            ob.setDuration(1000);
            ob.start();


        }
        if(item.getItemId()==R.id.mItemHelloWorld){
           transformingButton.setText("Hello World!!!");

            circle();


        }

        if(item.getItemId()==R.id.mItemChangeHeight){
            heightchanged=true;
            height=transformingButton.getHeight();
            transformingButton.setHeight(500);


        }
        if(item.getItemId()==R.id.mItemINVISIBLE){
            transformingButton.setVisibility(View.INVISIBLE);

        }

        if(item.getItemId()==R.id.mItemChange){
            Toast.makeText(this, "Edit Object Items is clicked", Toast.LENGTH_SHORT).show();

        } else if (item.getItemId()==R.id.mItemReset) {
            Toast.makeText(this, "Reset Object Items is clicked", Toast.LENGTH_SHORT).show();

            transformingButton.setBackgroundColor(Color.BLUE);

            if(heightchanged){
                transformingButton.setHeight(height);
                heightchanged=false;
            }

            transformingButton.setVisibility(View.VISIBLE);
            transformingButton.setText("");

        }else if (item.getItemId()==R.id.mItemExit) {

        finish();
        }
        return true;
    }

}