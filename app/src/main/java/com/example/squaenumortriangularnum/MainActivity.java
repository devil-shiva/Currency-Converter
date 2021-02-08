package com.example.squaenumortriangularnum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class number{
        long num;
        public char isWhat(){
            long calc_num = 8*num+1;
            long t = (long) Math.sqrt(calc_num);
            if (t*t  == calc_num && Math.sqrt(num) - Math.floor(Math.sqrt(num)) == 0){
                return 'b';}
            else if (t*t  == calc_num ){
                return 't';
            }else if (Math.sqrt(num) - Math.floor(Math.sqrt(num)) == 0){
                return 's';
            }else
                return 'n';


        }

    }
    public void what(View view) {
        String message;
        EditText editText = (EditText) findViewById(R.id.editText);
        if(editText.getText().toString().isEmpty()){
            message = "Please Enter a Number";
        }else {
            int inpt = Integer.parseInt(editText.getText().toString());

            number enterd = new number();
            enterd.num = inpt;
            if (enterd.isWhat() == 't')
                message = "Triangular";
            else if (enterd.isWhat() == 's')
                message = "Square";
            else if (enterd.isWhat() == 'b')
                message = "Both Square And Triangular";
            else
                message = "Neither Triangular Nor square";

            Log.i("Entered Number", editText.getText().toString());

        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}