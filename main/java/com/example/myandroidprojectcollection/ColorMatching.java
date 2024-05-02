package com.example.myandroidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class ColorMatching extends AppCompatActivity {
    int[]colors={Color.RED,Color.GREEN,Color.BLUE};
    int[][] coor=new int[][]{{0,0,0},
                  {0,0,0},
                  {0,0,0}};
    Button[][] btns;
    Random rnd=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast.makeText(getApplicationContext(),"Jan Edward V. Abadiano  ColorMatching",Toast.LENGTH_SHORT).show();

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_color_matching);
        btns= new Button[][]{{findViewById(R.id.button2),findViewById(R.id.button3),findViewById(R.id.button4)},
                {findViewById(R.id.button5),findViewById(R.id.button6),findViewById(R.id.button7)},
                {findViewById(R.id.button8),findViewById(R.id.button9),findViewById(R.id.button10)}};
        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deBUG();





            }
        });

        findViewById(R.id.returnId).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                random();
                update();
            }
        });
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                final int r=row;
                final int c=col;
                btns[row][col].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        changeColor(r-1,c);
                        changeColor(r+1,c);
                        changeColor(r,c-1);
                        changeColor(r,c+1);
//                        deBUG(); pang check ranis sa winning case sir
                        update();

                        int toCheck=coor[0][1];
                        boolean done=true;

                        for(int row=0;row<3;row++){
                            for(int col=0;col<3;col++){
                                if(toCheck==coor[row][col]){


                                }
                                else{

                                    done=false;
                                }
                            }
                        }
                        if(done){
                            for(int row=0;row<3;row++){
                                for(int col=0;col<3;col++){
                                    btns[row][col].setEnabled(false);
                                }
                            }
                            Toast.makeText(getApplicationContext(),"You Won",Toast.LENGTH_SHORT).show();

                        }
//




                    }

                });
            }
        }


        random();
        update();

    }
    void changeColor(int r,int c){
        try {


            coor[r][c] = (coor[r][c] + 1) % 3;
        }catch (IndexOutOfBoundsException e){
            return;
        }


    }
    void random(){
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                coor[row][col]=rnd.nextInt(3);
            }
        }
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                btns[row][col].setEnabled(true);
            }
        }
    }

    void update(){
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                int color=coor[row][col];
                btns[row][col].setBackgroundColor(colors[color]);
            }
        }
    }
    void deBUG(){
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                btns[row][col].setEnabled(true);
            }
        }
        coor[0][0]=0;
        coor[0][1]=2;
        coor[0][2]=0;
        coor[1][0]=2;
        coor[1][1]=0;
        coor[1][2]=2;
        coor[2][0]=0;
        coor[2][1]=2;
        coor[2][2]=0;
        update();


    }




}