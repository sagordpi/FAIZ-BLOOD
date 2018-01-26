package com.redappsbd.faizblood.faizblood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBloodGroup(View view){
        Intent intent=new Intent(MainActivity.this,BloodGroup.class);
        startActivity(intent);
    }


    public void clickArea(View view){
        Intent intent = new Intent(getApplicationContext(), BloodArea.class);
        startActivity(intent);

    }

    public void clickmemreg(View view){
        Intent intent = new Intent(getApplicationContext(), MemberRegistration.class);
        startActivity(intent);

    }

    public void ClickVsign(View view){
        Intent intent = new Intent(getApplicationContext(), VolunteerReg.class);
        startActivity(intent);

    }

    public void ClickVLogin(View view){
        Intent intent = new Intent(getApplicationContext(), VolunteerLogin.class);
        startActivity(intent);

    }

    public void ClickFBGroup(View view){
        Intent intent = new Intent(getApplicationContext(), FbGroup.class);
        startActivity(intent);

    }

    public void ClickFBPage(View view){
        Intent intent = new Intent(getApplicationContext(), FbPage.class);
        startActivity(intent);

    }

    public void ClickWeb(View view){
        Intent intent = new Intent(getApplicationContext(), WebFB.class);
        startActivity(intent);

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
                Intent intent=new Intent(MainActivity.this,tips_for_donor.class);
                startActivity(intent);
                return true;

            case R.id.two:
                //do something
                intent = new Intent(MainActivity.this, about_apps.class);
                startActivity(intent);
                return true;

            case R.id.three:
                //do something
                intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
