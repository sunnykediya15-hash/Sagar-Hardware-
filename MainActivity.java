package com.sagarhardware.app;
import android.app.Activity;import android.os.Bundle;import android.webkit.*;
public class MainActivity extends Activity{public void onCreate(Bundle b){super.onCreate(b);WebView w=new WebView(this);w.setWebViewClient(new WebViewClient());w.getSettings().setJavaScriptEnabled(true);w.getSettings().setDomStorageEnabled(true);w.loadUrl("file:///android_asset/www/index.html");setContentView(w);}}
