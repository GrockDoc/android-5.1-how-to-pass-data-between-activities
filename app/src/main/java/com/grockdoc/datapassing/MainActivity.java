package com.grockdoc.datapassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // Define a static constant to hold the key that is used in the Intent's bundle
    public final static String EXTRA_MESSAGE = "com.grockdoc.datapassing.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a reference to the button
        final Button startSecondActivity = (Button) findViewById(R.id.start_second_activity);

        // Attach a click listener to the button
        startSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to start SecondActivity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                // Add a key of EXTRA_MESSAGE with a string value to the Intent
                intent.putExtra(EXTRA_MESSAGE, "Hi from MainActivity");
                // Notify Android of the intent to start SecondActivity
                startActivity(intent);
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
