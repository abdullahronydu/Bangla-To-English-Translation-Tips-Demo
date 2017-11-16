package com.ronyjony.banglatoenglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class p1 extends AppCompatActivity {
    public void onBackPressed()
    {
        Intent intent = new Intent(p1.this, Main2Activity.class);
        startActivity(intent);
        finish();
        super.onBackPressed();  // optional depending on your needs
    }
    WebView myweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p1);
        myweb = (WebView) findViewById(R.id.webView);
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        myweb.loadUrl("file:///android_asset/T.html");
        myweb.getSettings().setJavaScriptEnabled(true);
    }
    public void backto(View view) {
        Intent intent = new Intent(p1.this, Main2Activity.class);
        startActivity(intent);
        finish();
    }
}