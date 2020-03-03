package com.example.addsub3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText1,editText2;
    private Button add,sub ,multiplyButton,divButton ,percentButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);

        add=findViewById(R.id.addButton);
        sub=findViewById(R.id.subButton);
        multiplyButton=findViewById(R.id.multiplyButton);
        divButton=findViewById(R.id.divButton);
        percentButton=findViewById(R.id.percentButton);



        textView=findViewById(R.id.resultTextView);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        multiplyButton.setOnClickListener(this);
        divButton.setOnClickListener(this);
        percentButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        try {

            String input1=editText1.getText().toString();
            String input2=editText2.getText().toString();

            double num1=Double.parseDouble(input1);
            double num2=Double.parseDouble(input2);

            if ( v.getId()==R.id.addButton){
                double sum =num1+num2;
                textView.setText("Result = " +sum);

            }
            if ( v.getId()==R.id.subButton){
                double subs =num1-num2;
                textView.setText("Result = " +subs);


            }
            if ( v.getId()==R.id.multiplyButton){
                double mul =num1*num2;
                textView.setText("Result = " +mul);

            }


        if ( v.getId()==R.id.divButton){
            double divid =num1/num2;
            textView.setText("Result = " +divid);

        }
            if ( v.getId()==R.id.percentButton){
                double per =(num1*num2)/100;
                textView.setText("Result = " +per);

            }






        }
        catch (Exception e){
            Toast.makeText(this,"Enter the number",Toast.LENGTH_SHORT).show();
        }



    }
}
