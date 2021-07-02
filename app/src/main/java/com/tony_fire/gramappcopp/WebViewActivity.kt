package com.tony_fire.gramappcopp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        getUrlIntent()
    }

    fun getUrlIntent(){
        val i = intent
        val myWebView: WebView = findViewById(R.id.kytkt)
        val url = i.getStringExtra("Url")
        myWebView.loadUrl("$url")

    }
}