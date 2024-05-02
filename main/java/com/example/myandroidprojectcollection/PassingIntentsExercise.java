package com.example.myandroidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;


public class PassingIntentsExercise extends AppCompatActivity {
    Button clear;
    Button submit;
    EditText firstname, lastname, birthdate, email, address,studentid,nationality;
    RadioButton male,female,others;
    String strfirstname, strlastname, strbirthdate, stremail, straddress,strstudentid,strnationality;
    String gender,number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);
        firstname=findViewById(R.id.fname);
        lastname=findViewById(R.id.lname);
        birthdate=findViewById(R.id.birthdatetf);
        email=findViewById(R.id.emailtf);
        address=findViewById(R.id.addresstf);
        studentid=findViewById(R.id.studentidtf);
        nationality=findViewById(R.id.nationalitytf);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
        others=findViewById(R.id.others);



        //get the spinner from the xml.
        Spinner dropdown = findViewById(R.id.spinner);
        Spinner dropdown2 = findViewById(R.id.spinner2);

        String[] yearlvl = new String[]{"Select Year Level","1", "2", "3", "4","5","Irregeular"};
        String[] courses = new String[]{"Select Course","BSCS", "BSIT", "BSCE", "BSARCH","BSN","BSCpe"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, yearlvl);
        dropdown.setAdapter(adapter);

         adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, courses);
        dropdown2.setAdapter(adapter);
        clear=findViewById(R.id.clearbtn);
        submit=findViewById(R.id.submitbtn);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firstname.setText("");
                lastname.setText("");
                email.setText("");
                birthdate.setText("");
                studentid.setText("");
                nationality.setText("");
                male.setChecked(false);
                female.setChecked(false);
                address.setText("");
                ((Spinner) findViewById(R.id.spinner)).setSelection(0);
                ((Spinner) findViewById(R.id.spinner2)).setSelection(0);
                ((TextView)(findViewById(R.id.phonetf))).setText("");


            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strfirstname= String.valueOf(firstname.getText());
                strlastname= String.valueOf(lastname.getText());
                strbirthdate= String.valueOf(birthdate.getText());
                stremail= String.valueOf(email.getText());
                straddress= address.getText().toString();
                strstudentid= String.valueOf(studentid.getText());
                strnationality= String.valueOf(nationality.getText());

                if(male.isChecked()){
                    gender="Male";
                } else if (female.isChecked()) {
                    gender="Female";
                }else{
                    gender="Others";
                }

                    String YearLvl= (String) dropdown.getSelectedItem();
                    String coursess= (String) dropdown2.getSelectedItem();



                String number= ((TextView)(findViewById(R.id.phonetf))).getText().toString();
                Intent intent=new Intent(PassingIntentsExercise.this,PassingIntentsExercise2.class);
                intent.putExtra("fname",strfirstname);
                intent.putExtra("lname",strlastname);
                intent.putExtra("bdate",strbirthdate);
                intent.putExtra("email",stremail);
                intent.putExtra("addr",straddress);
                intent.putExtra("stdid",strstudentid);
                intent.putExtra("nationality",strnationality);
                intent.putExtra("gender",gender);
                intent.putExtra("pnum",number);
                intent.putExtra("yrlvl",YearLvl);
                intent.putExtra("course",coursess);
                startActivity(intent);


            }
        });

    }
}