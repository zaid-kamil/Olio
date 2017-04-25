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
public class PinterestFragment extends Fragment {
    public  static final String PINTEREST_LINK = "https://in.pinterest.com";


    public PinterestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pinterest, container, false);


        WebView wbPinterest = (WebView) view.findViewById(R.id.wbPinterest);
        wbPinterest.getSettings().setJavaScriptEnabled(true);
        wbPinterest.setWebViewClient(new PintCallback());
        wbPinterest.loadUrl(PINTEREST_LINK);
        return view;
    }

    private class PintCallback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return false;
        }


    }

}

