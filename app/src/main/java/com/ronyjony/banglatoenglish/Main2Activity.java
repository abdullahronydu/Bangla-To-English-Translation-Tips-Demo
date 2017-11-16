package com.ronyjony.banglatoenglish;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends Activity {
    Button p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        p1 = (Button) findViewById(R.id.p1);
        p11 = (Button) findViewById(R.id.p111);
        p2 = (Button) findViewById(R.id.p2);
        p3 = (Button) findViewById(R.id.p3);
        p4 = (Button) findViewById(R.id.p4);
        p5 = (Button) findViewById(R.id.p5);
        p6 = (Button) findViewById(R.id.p6);
        p7 = (Button) findViewById(R.id.p7);
        p8 = (Button) findViewById(R.id.p8);
        p9 = (Button) findViewById(R.id.p9);
        p10 = (Button) findViewById(R.id.p10);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main2Activity.this,p1.class);
                startActivity(i);
                finish();
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, p2.class);
                startActivity(i);
                finish();
            }

        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, p3.class);
                startActivity(i);
                finish();

            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, p4.class);
                startActivity(i);
                finish();

            }
        });
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, p5.class);
                startActivity(i);
                finish();

            }
        });
        p6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Main2Activity.this, p6.class);
            startActivity(i);
            finish();

        }
    });

        p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, p7.class);
                startActivity(i);
                finish();

            }
        });

        p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, p8.class);
                startActivity(i);
                finish();

            }
        });

        p9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, p9.class);
                startActivity(i);
                finish();

            }
        });
        p10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, p10.class);
                startActivity(i);
                finish();

            }
        });
        p11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, p11.class);
                startActivity(i);
                finish();

            }
        });












}


    public void bb(View view) {
        Intent i = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(i);
        finish();

    }
}
