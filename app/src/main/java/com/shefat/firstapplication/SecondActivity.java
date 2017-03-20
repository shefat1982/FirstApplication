package com.shefat.firstapplication;

import android.app.Activity;
import android.inputmethodservice.KeyboardView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends Activity implements View.OnClickListener {

    Button b, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        b = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Clicked on first button", Toast.LENGTH_LONG).show();
            }
        });

        b2.setOnClickListener(this);
    }

    //my second button

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Clicked on second button", Toast.LENGTH_LONG).show();
    }


    //my third button

    public void myButton(View v){
        Toast.makeText(getApplicationContext(), "Clicked on third button", Toast.LENGTH_LONG).show();
    }

}
