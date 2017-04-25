package trainedge.blank.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
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
public class FlickrFragment extends Fragment {
    public static final String FLICKR_LINK = "https://www.flickr.com";

    public FlickrFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_flickr, container, false);
        WebView wbFlickr = (WebView) view.findViewById(R.id.ivFlickr);
        NestedScrollView scrollView = (NestedScrollView) view.findViewById (R.id.scroller);
        scrollView.setFillViewport (true);
        wbFlickr.getSettings().setJavaScriptEnabled(true);
        wbFlickr.setWebViewClient(new FlickCallback());
        wbFlickr.loadUrl(FLICKR_LINK);
        return view;
    }

    private class FlickCallback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return false;
        }
    }

}
