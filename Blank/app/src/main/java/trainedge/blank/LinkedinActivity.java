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

public class LinkedinActivity extends AppCompatActivity {
    public static final String LINKEDIN_LINK = "https://in.linkedin.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkedin);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView wbLinkedin = (WebView) findViewById(R.id.wvLinkedin);

        wbLinkedin.getSettings().setJavaScriptEnabled(true);
        wbLinkedin.setWebViewClient(new LinkdCallback());
        wbLinkedin.loadUrl(LINKEDIN_LINK);
    }


    private class LinkdCallback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return false;
        }
    }
}