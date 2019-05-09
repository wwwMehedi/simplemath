package com.tolet.sajib.simplemath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button plus,minus,multi,divide;
private EditText editTextone,editTexttwo;
private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextone=findViewById(R.id.editextone);
        editTexttwo=findViewById(R.id.edittexttwo);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        multi=findViewById(R.id.muli);
        divide=findViewById(R.id.divide);
        result=findViewById(R.id.resultid);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multi.setOnClickListener(this);
        divide.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.plus){
            String num1= editTextone.getText().toString();
            String num2= editTexttwo.getText().toString();
            if(num1.equals("mirpur") && num2.equals("dhaka")){
                result.setText(" "+"bikas");
             //   System.out.println(""+"bikash");
            }

        }
        if (view.getId()==R.id.minus){
            double num1= Double.parseDouble(editTextone.getText().toString());
            double num2= Double.parseDouble(editTexttwo.getText().toString());
            double num3=num1-num2;
            if(num3==2){
                Toast.makeText(this, "helow", Toast.LENGTH_SHORT).show();
                result.setText(""+"0000");
            }else {
                result.setText("" + num3);
            }



        }
        if (view.getId()==R.id.muli){
            double num1= Double.parseDouble(editTextone.getText().toString());
            double num2= Double.parseDouble(editTexttwo.getText().toString());
            double num3=num1*num2;
            result.setText(""+num3);

        }
        if (view.getId()==R.id.divide){
            double num1= Double.parseDouble(editTextone.getText().toString());
            double num2= Double.parseDouble(editTexttwo.getText().toString());
            double num3=num1/num2;
            result.setText(""+num3);

        }
    }
}
