package com.krish.bvcmba.simplebuttonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ActualButton= (Button)findViewById(R.id.actualbutton);
        ActualButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Actual Button is Clicked",Toast.LENGTH_LONG).show();
            }
        });

        Button smallbutton=(Button)findViewById(R.id.smallbutton);
        smallbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"small button is clicked",Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton imageButton=(ImageButton)findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Image Button is Clicked",Toast.LENGTH_SHORT).show();
            }
        });

        final ToggleButton toggleButton=(ToggleButton)findViewById(R.id.toggleButton);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuffer result = new StringBuffer();
                result.append("ToggleButton : ").append(toggleButton.getText());


                Toast.makeText(MainActivity.this, result.toString(),
                        Toast.LENGTH_SHORT).show();
                           }
        });


        CheckBox checkBox=(CheckBox)findViewById(R.id.checkBox);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"CheckBox is Clicked",Toast.LENGTH_SHORT).show();
            }
        });
        final RadioGroup radioGroup=(RadioGroup)findViewById(R.id.radioGroup) ;
        //RadioButton rbyes=(RadioButton)findViewById(R.id.radioButtonYes);
       // RadioButton  rbno=(RadioButton)findViewById(R.id.radioButtonNo);

           radioGroup.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   int selectedId=radioGroup.getCheckedRadioButtonId();
                   RadioButton radioGenderButton=(RadioButton)findViewById(selectedId);
                   Toast.makeText(MainActivity.this,radioGenderButton.getText(),Toast.LENGTH_SHORT).show();

               }
           });

    }

}
