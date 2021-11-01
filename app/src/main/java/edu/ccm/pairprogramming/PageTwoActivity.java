package com.zybooks.pairprogrammingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class PageTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);
        TextView f = (TextView) findViewById(R.id.Fortnite);
        f. setMovementMethod(LinkMovementMethod.getInstance());
        TextView g = (TextView) findViewById(R.id.Gmod);
        g. setMovementMethod(LinkMovementMethod.getInstance());
        TextView s = (TextView) findViewById(R.id.SWTOR);
        s. setMovementMethod(LinkMovementMethod.getInstance());
        TextView n = (TextView) findViewById(R.id.NBA);
        n. setMovementMethod(LinkMovementMethod.getInstance());



    }
    public void lastClick(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void finalClick (View view) {
        Intent intent = new Intent(this,FinalPage.class);
        startActivity(intent);
    }
}