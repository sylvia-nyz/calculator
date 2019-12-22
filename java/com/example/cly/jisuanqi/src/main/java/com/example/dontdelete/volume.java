package com.example.dontdelete;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class volume extends AppCompatActivity implements View.OnClickListener{

    private Spinner spinner1,spinner2;
    private List<String> data_list;
    private ArrayAdapter<String> adapter1,adapter2;
    private String choice1,choice2;
    public Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnpoi,btndel,btnce,calcalator,back;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_volume );
        btn0=(Button)findViewById(R.id.button0);
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn7=(Button)findViewById(R.id.button7);
        btn8=(Button)findViewById(R.id.button8);
        btn9=(Button)findViewById(R.id.button9);
        btnpoi=(Button)findViewById(R.id.buttonpoint);
        btndel=(Button)findViewById(R.id.buttondel);
        btnce=(Button)findViewById(R.id.buttonclear);
        calcalator=(Button)findViewById(R.id.calcalator);
        back=(Button)findViewById(R.id.back);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnpoi.setOnClickListener(this);
        btndel.setOnClickListener(this);
        btnce.setOnClickListener(this);
        calcalator.setOnClickListener( this);
        back.setOnClickListener( this);
        spinner1 = (Spinner)findViewById( R.id.firstspinner );
        spinner2 = (Spinner)findViewById( R.id.secondspinner );

        data_list = new ArrayList<String>();
        data_list.add("立方米");
        data_list.add("立方分米");
        data_list.add("立方厘米");

        adapter1=new ArrayAdapter <>( this,android.R.layout.simple_list_item_1,data_list );
        adapter2=new ArrayAdapter <>( this,android.R.layout.simple_list_item_1,data_list );

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adapter1);
        spinner2.setAdapter(adapter2);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                choice1= spinner1.getItemAtPosition(i).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                choice2= spinner2.getItemAtPosition(i).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
    public void calcalator(){
        double one=100*100*100,anotherone=100*100*100;
        TextView firstText,secondText;
        String first,second;
        firstText=(TextView)findViewById( R.id.firstText );
        secondText=(TextView)findViewById( R.id.secondText );
        first=firstText.getText().toString();
        switch (choice1){
            case "立方米":
                one=100*100*100;
                break;
            case "立方分米":
                one=10*10*10;
                break;
            case "立方厘米":
                one=1;
                break;
        }
        switch (choice2){
            case "立方米":
                anotherone=100*100*100;
                break;
            case "立方分米":
                anotherone=10*10*10;
                break;
            case "立方厘米":
                anotherone=1;
                break;
        }
        double x=one/anotherone;
        if(!first.equals( "" )){
            double value = Double.valueOf(first);
            value=value*x;
            secondText.setText( value+"" );
        }else{
            Toast.makeText( this, "请输入数字", Toast.LENGTH_SHORT ).show();
        }
    }

    public void onClick(View view) {
        TextView firstText = findViewById( R.id.firstText );
        Button btn = (Button) view;
        switch (btn.getId()) {
            case R.id.back:{
                Intent intent=new Intent( this,MainActivity.class );
                startActivity( intent );
                break;
            }
            case R.id.calcalator:{
                calcalator();
                break;
            }
            case R.id.button0: {
                String str = firstText.getText().toString();
                str += "0";
                firstText.setText( str );
                break;
            }
            case R.id.button1:{
                String str=firstText.getText().toString();
                str+="1";
                firstText.setText(str);
                break;
            }
            case R.id.button2:{
                String str=firstText.getText().toString();
                str+="2";
                firstText.setText(str);
                break;
            }
            case R.id.button3:{
                String str=firstText.getText().toString();
                str+="3";
                firstText.setText(str);
                break;
            }
            case R.id.button4:{
                String str=firstText.getText().toString();
                str+="4";
                firstText.setText(str);
                break;
            }
            case R.id.button5:{
                String str=firstText.getText().toString();
                str+="5";
                firstText.setText(str);
                break;
            }
            case R.id.button6:{
                String str=firstText.getText().toString();
                str+="6";
                firstText.setText(str);
                break;
            }
            case R.id.button7:{
                String str=firstText.getText().toString();
                str+="7";
                firstText.setText(str);
                break;
            }
            case R.id.button8:{
                String str=firstText.getText().toString();
                str+="8";
                firstText.setText(str);
                break;
            }
            case R.id.button9:{
                String str=firstText.getText().toString();
                str+="9";
                firstText.setText(str);
                break;
            }
            case R.id.buttonpoint:{
                String str=firstText.getText().toString();
                str+=".";
                firstText.setText(str);
                break;
            }
            case R.id.buttonclear:{
                String str=firstText.getText().toString();
                str="";
                firstText.setText(str);
                break;
            }
            case R.id.buttondel:{
                String str=firstText.getText().toString();
                str = str.substring(0,str.length() - 1);
                firstText.setText(str);
                break;
            }
        }
    }
}
