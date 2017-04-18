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
import trainedge.blank.TinderActivity;

import static trainedge.blank.TinderActivity.TINDER_LINK;

/**
 * A simple {@link Fragment} subclass.
 */
public class TinderFragment extends Fragment {


    public TinderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_tinder, container, false);
        View view = inflate;
        WebView wbTinder = (WebView) view.findViewById(R.id.wbTinder);

        wbTinder.getSettings().setJavaScriptEnabled(true);
        wbTinder.setWebViewClient(new TinCallback());
        wbTinder.loadUrl(TINDER_LINK);
        return view;
    }

    private class TinCallback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request){
            return false;
        }
    }
}
