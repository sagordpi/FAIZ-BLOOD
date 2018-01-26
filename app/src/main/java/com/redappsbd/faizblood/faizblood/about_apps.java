package com.redappsbd.faizblood.faizblood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class about_apps extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_apps);//***************

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.one:
                // do something
                Intent intent=new Intent(about_apps.this,tips_for_donor.class);
                startActivity(intent);
                return true;

            case R.id.two:
                //do something
                intent = new Intent(about_apps.this, about_apps.class);
                startActivity(intent);
                return true;

            case R.id.three:
                //do something
                intent = new Intent(about_apps.this, MainActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
