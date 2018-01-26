package com.redappsbd.faizblood.faizblood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class tips_for_donor extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tips_for_donor);//***************

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
                Intent intent=new Intent(tips_for_donor.this,tips_for_donor.class);
                startActivity(intent);
                return true;

            case R.id.two:
                //do something
                intent = new Intent(tips_for_donor.this, about_apps.class);
                startActivity(intent);
                return true;

            case R.id.three:
                //do something
                intent = new Intent(tips_for_donor.this, MainActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
