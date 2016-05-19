package com.learnandroid.singhdeepak.textbox;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.charset.MalformedInputException;

public class MainActivity extends AppCompatActivity {

    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Attach a key listener inside your activity “onCreate()”
        addKeylistener();

        // This is an example of EditText, onKeyListener and Toast floating messages.

    }

    public void addKeylistener(){

        // get Edittext component
        final EditText editText = (EditText) findViewById(R.id.edtext);

        // add a key listener to keep track of user input

      editText.setOnKeyListener(new View.OnKeyListener() {
          @Override
          public boolean onKey(View v, int keyCode, KeyEvent event) {

              // if keydown and enter is pressed
              if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {

                      // display a floating message using toast

                  Toast.makeText(MainActivity.this, editText.getText(), Toast.LENGTH_LONG).show();
                  return true;


              } else if ((event.getAction() ==  KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_9)){
                  // DISPLAY A FLOATING MESSAGE

                  Toast.makeText(MainActivity.this, "Number 9 is pressed", Toast.LENGTH_LONG).show();
                  return true;
              }

              return false;
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
