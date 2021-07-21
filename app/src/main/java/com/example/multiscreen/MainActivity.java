package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG ="com.example.multiscreen.ORDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void placeorder(View view){
        //we will handle the click on the button here
        //build an Intent to open another activity
        Intent intent = new Intent (this,OrderActivity.class);
        EditText edittext1 = findViewById(R.id.edittext1);
        EditText edittext2 = findViewById(R.id.edittext2);
        EditText edittext3 = findViewById(R.id.edittext3);
        String message = "Order for" + edittext1.getText().toString() + " & " +
                edittext2.getText().toString() + " & " +
                edittext3.getText().toString() + " has been successfully placed \n\n"+"hope to visit my restaurent again.\n"+"\tHave a good day!";
        intent.putExtra(MSG,message);
        startActivity(intent);
    }
}