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

public class TinderActivity extends AppCompatActivity {
    public static final String TINDER_LINK = "https://www.gotinder.com.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinder);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        WebView wbTinder = (WebView) findViewById(R.id.wbTinder);

        wbTinder.getSettings().setJavaScriptEnabled(true);
        wbTinder.setWebViewClient(new TinCallback());
        wbTinder.loadUrl(TINDER_LINK);
    }

    private class TinCallback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request){
            return false;
        }
    }
}

