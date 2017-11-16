package com.ronyjony.banglatoenglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class p2 extends AppCompatActivity {
    public void onBackPressed()
    {
        Intent intent = new Intent(p2.this, Main2Activity.class);
        startActivity(intent);
        finish();
        super.onBackPressed();  // optional depending on your needs
    }
    WebView myweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);
        myweb = (WebView) findViewById(R.id.webView);
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        myweb.loadUrl("file:///android_asset/D.html");
        myweb.getSettings().setJavaScriptEnabled(true);
    }
    public void backto(View view) {
        Intent intent = new Intent(p2.this, Main2Activity.class);
        startActivity(intent);
        finish();
    }
}