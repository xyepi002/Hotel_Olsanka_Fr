package com.example.ilya.hotel_ols2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button B1,B2,B3,B4,B5;
    Button button;
    Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        B1=(Button)findViewById(R.id.b1);
        B2=(Button)findViewById(R.id.b2);
        B3=(Button)findViewById(R.id.b3);
        B4=(Button)findViewById(R.id.b4);
        B5=(Button)findViewById(R.id.b5);


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager FM = getFragmentManager();
                FragmentTransaction FT=FM.beginTransaction();
                FragmentOne F1=new FragmentOne();
                FT.add(R.id.fr1_id, F1);
                FT.addToBackStack("f1");
                FT.commit();


            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager FM = getFragmentManager();
                FragmentTransaction FT=FM.beginTransaction();
                FragmentTwo F2=new FragmentTwo();
                FT.add(R.id.fr1_id, F2);
                FT.addToBackStack("f2");
                FT.commit();
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager FM = getFragmentManager();
                FragmentTransaction FT=FM.beginTransaction();
                FragmentThree F3=new FragmentThree();
                FT.add(R.id.fr1_id, F3);
                FT.addToBackStack("f3");
                FT.commit();


            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager FM = getFragmentManager();
                FragmentTransaction FT=FM.beginTransaction();
                FragmentFour F4=new FragmentFour();
                FT.add(R.id.fr1_id, F4);
                FT.addToBackStack("f4");
                FT.commit();
            }
        });

        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager FM = getFragmentManager();
                FragmentTransaction FT=FM.beginTransaction();
                FragmentFive F5=new FragmentFive();
                FT.add(R.id.fr1_id, F5);
                FT.addToBackStack("f5");
                FT.commit();
            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }
}
