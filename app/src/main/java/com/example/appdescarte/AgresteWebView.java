package com.example.appdescarte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class AgresteWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreste_web_view);

        WebView webview = findViewById(R.id.webView);
        webview.loadUrl("https://www.google.com/maps/dir//Descarte+Eletr%C3%B4nicos+Caruaru+-+R.+17+-+Kennedy,+Caruaru+-+PE,+55036-720/@-8.289763,-36.0074526,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x7a98bea1f58cec7:0xfcc9947fbeb599e3!2m2!1d-35.9724328!2d-8.2897645");
    }
}