package com.ronyjony.banglatoenglish;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = (Button) findViewById(R.id.free);
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
                finish();
            }
        });
    }

    public void gmail(View view) {

        Intent email = new Intent(Intent.ACTION_VIEW);
        email.setData(Uri.parse("mailto:moskinggreat99@gmail.com"));
        startActivity(email);
    }

    public void sher(View view) {

        Toast.makeText(getApplicationContext(), "Share this App ", Toast.LENGTH_LONG).show();
        Intent i = new Intent("android.intent.action.SEND");
        i.setType("text/plain");
        i.putExtra("android.intent.extra.SUBJECT", "বাংলা থেকে ইংরেজি অনুবাদ");
        i.putExtra("android.intent.extra.TEXT", "market://details?id=" + this.getPackageName());
        this.startActivity(Intent.createChooser(i, "Share via"));

    }


    public void face(View view) {

        Intent fb = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.facebook.com/profile.php?id=100006286246228"));
        startActivity(fb);
    }


    public void ref(View view) {
        Toast.makeText(getApplicationContext(), "Already Updated", Toast.LENGTH_SHORT).show();
        ;
    }

    public void r(View view) {
        Intent play = new Intent(Intent.ACTION_VIEW,
                Uri.parse("market://details?id=com.ronyjony.banglatoenglish"));
        startActivity(play);

    }

    public void rr(View view) {
        Intent play = new Intent(Intent.ACTION_VIEW,
                Uri.parse("market://details?id=com.ronyjony.banglatoenglish"));
        startActivity(play);

    }

    public void rrr(View view) {
        Intent play = new Intent(Intent.ACTION_VIEW,
                Uri.parse("market://details?id=com.ronyjony.banglatoenglish"));
        startActivity(play);

    }

    public void rrrr(View view) {
        Intent play = new Intent(Intent.ACTION_VIEW,
                Uri.parse("market://details?id=com.ronyjony.banglatoenglish"));
        startActivity(play);

    }

    public void rrrrr(View view) {
        Intent play = new Intent(Intent.ACTION_VIEW,
                Uri.parse("market://details?id=com.ronyjony.banglatoenglish"));
        startActivity(play);

    }

    public void w(View view) {
        Toast.makeText(getApplicationContext(), "More Apps ", Toast.LENGTH_LONG).show();
        this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pub:\"Abdullah+Rony..\"")));

    }


    public void ww(View view) {
        Toast.makeText(getApplicationContext(), "More Apps ", Toast.LENGTH_LONG).show();
        this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.ronyjony.banglatoenglish")));


    }
}
