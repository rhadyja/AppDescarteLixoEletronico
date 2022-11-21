package com.example.appdescarte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AgresteWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreste_web_view);

        WebView webview = findViewById(R.id.webView);

        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://www.raphaelmanzale.com.br:443");

    }
}