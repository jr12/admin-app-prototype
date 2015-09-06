package com.example.justin.adminapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.justin.adminapp.Menu_Options.box1;
import com.example.justin.adminapp.Menu_Options.box2;
import com.example.justin.adminapp.Menu_Options.box3;

public class MainMenu extends LoginActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
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

    //opens main menu activities
    public void openBox1 (View view) {
        Intent i = new Intent(this, box1.class);
        startActivity(i);
    }

    public void openBox2 (View view) {
        Intent i = new Intent(this, box2.class);
        startActivity(i);
    }

    public void openBox3 (View view) {
        Intent i = new Intent(this, box3.class);
        startActivity(i);
    }

}
