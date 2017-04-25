package trainedge.blank.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import trainedge.blank.R;
public class TwitterFragment extends Fragment {
    public static final String TWITTER_LINK = "https://mobile.twitter.com";


    public TwitterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_twitter, container, false);

        WebView wbTwitter = (WebView) view.findViewById(R.id.ivTwitter);
        wbTwitter.getSettings().setJavaScriptEnabled(true);
        wbTwitter.setWebViewClient(new TwCallback());
        wbTwitter.loadUrl(TWITTER_LINK);
        return view;
    }

    private class TwCallback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return false;
        }
    }
}


