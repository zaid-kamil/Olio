package trainedge.blank.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import trainedge.blank.InstagramActivity;
import trainedge.blank.R;

import static trainedge.blank.InstagramActivity.INSTAGRAM_LINK;

/**
 * A simple {@link Fragment} subclass.
 */
public class InstagramFragment extends Fragment {
    public static final String INSTAGRAM_LINK = "https://www.instagram.com";


    public InstagramFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View inflate = inflater.inflate(R.layout.fragment_instagram, container, false);
        View view = inflate;
        WebView wbInstagram= (WebView) view.findViewById(R.id.ivInstagram);

        wbInstagram.getSettings().setJavaScriptEnabled(true);
        wbInstagram.setWebViewClient(new InstaCallback());
        wbInstagram.loadUrl(INSTAGRAM_LINK);
        return view;
    }
    private class InstaCallback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return false;
        }
    }
}
