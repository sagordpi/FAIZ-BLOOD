package com.redappsbd.faizblood.faizblood;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BloodGroup extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_group);//***************

    }

    public void bgAPlus(View view){
        Intent intent = new Intent(getApplicationContext(), Bloodaplus.class);
        startActivity(intent);

    }

    public void bgAMinus(View view){
        Intent intent = new Intent(getApplicationContext(), Bloodaminus.class);
        startActivity(intent);

    }

    public void bgbp(View view){
        Intent intent = new Intent(getApplicationContext(), Bloodbp.class);
        startActivity(intent);

    }

    public void bgbn(View view){
        Intent intent = new Intent(getApplicationContext(), Bloodbn.class);
        startActivity(intent);

    }

    public void bgop(View view){
        Intent intent = new Intent(getApplicationContext(), Bloodop.class);
        startActivity(intent);

    }

    public void bgon(View view){
        Intent intent = new Intent(getApplicationContext(), Bloodon.class);
        startActivity(intent);

    }

    public void bgabp(View view){
        Intent intent = new Intent(getApplicationContext(), Bloodabp.class);
        startActivity(intent);

    }

    public void bgabn(View view){
        Intent intent = new Intent(getApplicationContext(), Bloodabn.class);
        startActivity(intent);

    }



}
