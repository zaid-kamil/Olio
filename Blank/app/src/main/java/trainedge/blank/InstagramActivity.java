package trainedge.blank;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class InstagramActivity extends AppCompatActivity {
    public static final String INSTAGRAM_LINK = "https://www.instagram.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        WebView wbInstagram= (WebView) findViewById(R.id.ivInstagram);
        wbInstagram.getSettings().setJavaScriptEnabled(true);
        wbInstagram.setWebViewClient(new InstaCallback());
        wbInstagram.loadUrl(INSTAGRAM_LINK);
    }

       private class InstaCallback extends WebViewClient {
           @Override
           public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
               return false;
           }
       }
}
