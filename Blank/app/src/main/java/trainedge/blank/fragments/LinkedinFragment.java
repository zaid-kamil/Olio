package trainedge.blank.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import trainedge.blank.LinkedinActivity;
import trainedge.blank.R;

import static trainedge.blank.LinkedinActivity.LINKEDIN_LINK;

/**
 * A simple {@link Fragment} subclass.
 */
public class LinkedinFragment extends Fragment {
    public static final String LINKEDIN_LINK = "https://in.linkedin.com";


    public LinkedinFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_linkedin, container, false);

        WebView wbLinkedin = (WebView) view.findViewById(R.id.wvLinkedin);

        wbLinkedin.getSettings().setJavaScriptEnabled(true);
        wbLinkedin.setWebViewClient(new LinkdCallback());
        wbLinkedin.loadUrl(LINKEDIN_LINK);
        return view;
    }
    private class LinkdCallback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return false;
        }
    }
}
