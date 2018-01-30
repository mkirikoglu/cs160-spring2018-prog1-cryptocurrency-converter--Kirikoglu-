package com.example.meliskirikoglu.cs160proj1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button converter1;
    Button converter2;
    TextView showUSD;
    TextView showLIT;
    EditText enterUSD;
    EditText enterLIT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        converter1 = (Button) findViewById(R.id.converterButton1);
        converter2 = (Button) findViewById(R.id.converterButton2);
        showUSD = findViewById(R.id.convertedAmount2);
        showLIT = findViewById(R.id.convertedAmount1);
        enterUSD = findViewById(R.id.inputAmount1);
        enterLIT = findViewById(R.id.inputAmount2);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        converter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double USD = Double.parseDouble(enterUSD.getText().toString());
                Double USDtoLIT = USD * 0.00547;
                showLIT.setText(USDtoLIT.toString());
            }
        });

        converter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double LIT = Double.parseDouble(enterLIT.getText().toString());
                Double LITtoUSD = LIT * 180.3595;
                showUSD.setText(LITtoUSD.toString());
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
