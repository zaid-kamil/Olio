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

/**
 * A simple {@link Fragment} subclass.
 */
public class GoogleFragment extends Fragment {
    public static final String GOOGLE_LINK = "https://plus.google.com";


    public GoogleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_google, container, false);
        WebView wbGoogle = (WebView) view.findViewById(R.id.wvGoogle);

        wbGoogle.getSettings().setJavaScriptEnabled(true);
        wbGoogle.setWebViewClient(new GCallback());
        wbGoogle.loadUrl(GOOGLE_LINK);
        return view;
    }
    private class GCallback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return false;
        }

    }
}
