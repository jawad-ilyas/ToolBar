package com.example.toolbarexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {


    // find the id of the tool bar because need to work dynamically
    Toolbar toolBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        toolBar = findViewById(R.id.toolBar);

        // 1st step
        setSupportActionBar(toolBar);

        // second step is used to show back button before we show we need to check this is working or not
        if(getSupportActionBar()!=null)
        {
            // or false if you dont want to show back button
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Jawad Mughal");
        }
        else
        {
            Toast.makeText(this, "Second Activity Menu Issue", Toast.LENGTH_SHORT).show();
        }


        toolBar.setSubtitle("Menu Practice Section ");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.option, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        int itemId = item.getItemId();

        if(itemId == R.id.close)
        {
            Toast.makeText(this, "I am the open Close", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.open) {
            Toast.makeText(this, "I am the open Menu", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "I am the Back", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
}