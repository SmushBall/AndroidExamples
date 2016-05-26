package com.learnandroid.singhdeepak.checkbox;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Initialize CheckBox and Button
    private CheckBox chkIos, chkAndroid, chkWindows;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Call user defines listener methods

        addListenerOnChkios();
        addListenerOnChkAndroid();


    }

    public void addListenerOnChkios(){
        chkIos = (CheckBox) findViewById(R.id.chkIos);
        chkIos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // is chkIos checked?
                if (((CheckBox) v).isChecked()){
                    Toast.makeText(MainActivity.this, "Did you try Android :) ?", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


    public void addListenerOnChkAndroid(){
        chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);
        chkWindows = (CheckBox) findViewById(R.id.chkWindows);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);

        // set onclick listener on Button

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Iphone Check").append(chkIos.isChecked());
                result.append("\nAndroid Check").append(chkAndroid.isChecked());
                result.append("\nWindows Check").append(chkWindows.isChecked());

                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
