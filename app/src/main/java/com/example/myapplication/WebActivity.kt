package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.webkit.WebView;
import kotlinx.android.synthetic.main.webview.*

internal class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       val text = intent.getStringExtra("text")
        setContentView(R.layout.webview);
        webView.getSettings().setJavaScriptEnabled(true)
        webView.loadUrl("https://www.$text/")

    }

}