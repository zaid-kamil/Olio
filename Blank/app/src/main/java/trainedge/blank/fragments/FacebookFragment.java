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
public class FacebookFragment extends Fragment {
    public static final String FACEBOOK_LINK = "https://m.facebook.com";


    public FacebookFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_facebook, container, false);

        WebView wbFacebook= (WebView) view.findViewById(R.id.wvFacebook);

        wbFacebook.getSettings().setJavaScriptEnabled(true);
        wbFacebook.setWebViewClient(new FbCallback());
        wbFacebook.loadUrl(FACEBOOK_LINK);
        return view;
    }

    private class FbCallback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return false;
        }
    }

}
