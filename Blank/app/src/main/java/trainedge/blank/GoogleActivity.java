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

public class GoogleActivity extends AppCompatActivity {
    public static final String GOOGLE_LINK = "https://plus.google.com";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView wbGoogle = (WebView) findViewById(R.id.wvGoogle);

        wbGoogle.getSettings().setJavaScriptEnabled(true);
        wbGoogle.setWebViewClient(new GCallback());
        wbGoogle.loadUrl(GOOGLE_LINK);
    }

    private class GCallback extends WebViewClient {
        @Override
                public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return false;
        }

    }

}
