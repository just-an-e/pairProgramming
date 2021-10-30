package com.zybooks.pairprogrammingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView v = (TextView) findViewById(R.id.Valorant);
        v. setMovementMethod(LinkMovementMethod.getInstance());
        TextView m = (TextView) findViewById(R.id.Minecraft);
        m. setMovementMethod(LinkMovementMethod.getInstance());
        TextView r = (TextView) findViewById(R.id.Rainbow);
        r. setMovementMethod(LinkMovementMethod.getInstance());
        TextView a = (TextView) findViewById(R.id.AmongUs);
        a. setMovementMethod(LinkMovementMethod.getInstance());
        TextView c = (TextView) findViewById(R.id.CSGO);
        c. setMovementMethod(LinkMovementMethod.getInstance());
    }
    public void nextClick(View view){
        Intent intent = new Intent(this,PageTwoActivity.class);
        startActivity(intent);
    }
}