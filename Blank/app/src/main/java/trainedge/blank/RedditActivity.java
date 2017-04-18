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

public class RedditActivity extends AppCompatActivity {
    public static final String REDDIT_LINK ="https://www.reddit.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reddit);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView wbReddit = (WebView) findViewById(R.id.wbReddit);

        wbReddit.getSettings().setJavaScriptEnabled(true);
        wbReddit.setWebViewClient(new RedCallback());
        wbReddit.loadUrl(REDDIT_LINK);
    }

    private class RedCallback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return false;
        }
    }
}



