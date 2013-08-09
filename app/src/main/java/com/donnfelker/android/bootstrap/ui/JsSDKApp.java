package com.donnfelker.android.bootstrap.ui;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import com.donnfelker.android.bootstrap.R;

/**
 * Created by xuliu on 8/9/13.
 */
public class JsSDKApp extends Activity {
    private WebView page ;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adpage);
        page = (WebView) findViewById(R.id.ad_page);
        page.getSettings().setJavaScriptEnabled(true);

        page.loadUrl("http://weibom-test.yunyun.com/jssdk_demo.html");
    }
}