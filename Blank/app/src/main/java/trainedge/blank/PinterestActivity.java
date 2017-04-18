package trainedge.blank;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PinterestActivity extends AppCompatActivity {
    public  static final String PINTEREST_LINK = "https://in.pinterest.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinterest);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView wbPinterest = (WebView) findViewById(R.id.ivPinterest);
        wbPinterest.getSettings().setJavaScriptEnabled(true);
        wbPinterest.setWebViewClient(new PintCallback());
        wbPinterest.loadUrl(PINTEREST_LINK);
    }
    private class PintCallback extends WebViewClient {
        @Override
                public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return false;
        }


    }

}
