package com.app.menna.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submit = (Button) findViewById(R.id.submit);
        TextView firstQuestion = (TextView) findViewById(R.id.q1);
        TextView secondQuestion = (TextView) findViewById(R.id.q2);
        TextView thirdQuestion = (TextView) findViewById(R.id.q3);
        TextView fourthQuestion = (TextView) findViewById(R.id.q4);
        TextView fifthQuestion = (TextView) findViewById(R.id.q5);
        TextView sixthQuestion = (TextView) findViewById(R.id.q6);
        TextView seventhQuestion = (TextView) findViewById(R.id.q7);
        firstQuestion.setText("What is my name?");
        secondQuestion.setText("How are you ?");
        thirdQuestion.setText("My name is ");
        fourthQuestion.setText("Good ");
        fifthQuestion.setText("Did you park there ?");
        sixthQuestion.setText("Good ");
        seventhQuestion.setText("How are you?");
        RadioButton q1an1 = (RadioButton) findViewById(R.id.q1an1);
        RadioButton q1an2 = (RadioButton) findViewById(R.id.q1an2);
        final RadioButton q1an3 = (RadioButton) findViewById(R.id.q1an3);
        final RadioButton q2an1 = (RadioButton) findViewById(R.id.q2an1);
        RadioButton q2an2 = (RadioButton) findViewById(R.id.q2an2);
        RadioButton q2an3 = (RadioButton) findViewById(R.id.q2an3);
        RadioButton q3an1 = (RadioButton) findViewById(R.id.q3an1);
        final RadioButton q3an2 = (RadioButton) findViewById(R.id.q3an2);
        RadioButton q3an3 = (RadioButton) findViewById(R.id.q3an3);
        final RadioButton q4an1 = (RadioButton) findViewById(R.id.q4an1);
        RadioButton q4an2 = (RadioButton) findViewById(R.id.q4an2);
        RadioButton q4an3 = (RadioButton) findViewById(R.id.q4an3);
        final CheckBox q5an1 = (CheckBox) findViewById(R.id.q5an1);
        final CheckBox q5an2 = (CheckBox) findViewById(R.id.q5an2);
        final CheckBox q5an3 = (CheckBox) findViewById(R.id.q5an3);
        final CheckBox q6an1 = (CheckBox) findViewById(R.id.q6an1);
        final CheckBox q6an2 = (CheckBox) findViewById(R.id.q6an2);
        final CheckBox q6an3 = (CheckBox) findViewById(R.id.q6an3);
        q1an1.setText("Ahmed");
        q1an2.setText("Mohamed");
        q1an3.setText("Menna");
        q2an1.setText("Fine");
        q2an2.setText("Hey");
        q2an3.setText("Menna");
        q3an1.setText("Ali");
        q3an2.setText("Menna");
        q3an3.setText("Sayed");
        q4an1.setText("Night");
        q4an2.setText("Hello");
        q4an3.setText("Yes");
        q5an1.setText("Yes,I did");
        q5an2.setText("No,I didn't");
        q5an3.setText("by");
        q6an1.setText("Night");
        q6an2.setText("Hello");
        q6an3.setText("By");


submit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        int grade = 0;
        EditText ans = (EditText) findViewById(R.id.edan);
        String answer = ans.getText().toString();
        if (q1an3.isChecked()){
            grade++;
        }if (q2an1.isChecked()){
            grade++;
        }if (q3an2.isChecked()){
            grade++;
        }if (q4an1.isChecked()){
            grade++;
        }if (q5an1.isChecked() && q5an2.isChecked() && !q5an3.isChecked()){
            grade++;
        }if (q6an1.isChecked() && q6an3.isChecked() && !q6an2.isChecked()){
            grade++;
        }if (answer.contains("fine") || answer.contains("Fine")){
            grade++;
        }
        Toast.makeText(MainActivity.this,String.valueOf(grade)+"/7",Toast.LENGTH_LONG).show();
    }
});

    }
}
