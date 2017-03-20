package com.shefat.firstapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button b;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.mybutton);
        lv = (ListView) findViewById(R.id.lvid);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                AlertDialog.Builder mybuilder = new AlertDialog.Builder(MainActivity.this);
                mybuilder.setTitle("Attention!");
                mybuilder.setMessage("Do you want to go other site!");
                mybuilder.setIcon(R.drawable.attention);

                mybuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Going to this site.",Toast.LENGTH_LONG).show();
                        Intent i = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(i);
                    }
                });

                mybuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "We are not going to this site.",Toast.LENGTH_LONG).show();
                    }
                });

                AlertDialog mydialog = mybuilder.create();
                mydialog.show();

            }
        });

        final String[] pcs = {"Macbook Pro", "Macbook Air", "The Macbook", "iMac", "MacMini"};
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.lvlayout, R.id.txtid, pcs);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Clicked on"+pcs[position],Toast.LENGTH_LONG).show();
            }
        });

    }
}
