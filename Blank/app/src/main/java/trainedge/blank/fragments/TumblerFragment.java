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
public class TumblerFragment extends Fragment {


    private static final java.lang.String TUMBLER_LINK = "https://m.tubmler.com.com" ;

    public TumblerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_tumbler, container, false);

        WebView wbTumbler= (WebView) view.findViewById(R.id.wbTumbler);

        wbTumbler.getSettings().setJavaScriptEnabled(true);
        wbTumbler.setWebViewClient(new TumbCallback());
        wbTumbler.loadUrl(TUMBLER_LINK);
        return view;
    }
    private class TumbCallback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return false;
        }
    }


}
