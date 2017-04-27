package trainedge.blank;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;
import com.google.android.gms.plus.PlusShare;

public class StatusActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int REQUEST_POST_GOOGLE_CODE = 3;
    private FloatingActionButton fabStatus;
    private EditText etStatus;
    private TextView tvUpdate;
    private String statusText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        bindViews();
        initListeners();
    }

    private void initListeners() {
        fabStatus.setOnClickListener(this);
    }

    private void bindViews() {
        fabStatus = (FloatingActionButton) findViewById(R.id.fabStatus);
        etStatus = (EditText) findViewById(R.id.etStatus);
        tvUpdate = (TextView) findViewById(R.id.tvUpdate);
    }

    @Override
    public void onClick(View v) {
        String statusText = etStatus.getText().toString().trim();
        if (statusText.isEmpty()) {
            etStatus.setError("Please fill the status first");
            return;
        }
        shareOnFacebook(statusText);
        shareOnGooglePlus(statusText);
    }

    private void shareOnGooglePlus(String statusText) {

        Intent shareIntent = new PlusShare.Builder(this)
                .setType("text/plain")
                .setText(statusText)
                .getIntent();

        startActivityForResult(shareIntent, REQUEST_POST_GOOGLE_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            if (requestCode == REQUEST_POST_GOOGLE_CODE){
                tvUpdate.setText("updated on Google +\n updated on FB");
            }

        }
    }

    private void shareOnFacebook(String statusText) {
        ShareLinkContent content = new ShareLinkContent.Builder()
                .setQuote(this.statusText)
                .build();
        ShareDialog dialog= new ShareDialog(this);
        dialog.show(content);
    }
}
