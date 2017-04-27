package trainedge.blank;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SettinActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TUMBLER = "tumb";
    public static final String FLICKR = "flickr";
    public static final String TINDER = "tinder";
    public static final String PINTEREST = "pin";
    public static final String REDDIT = "reddit";
    public static final String LINKEDIN = "linked";
    public static final String TWITTER = "twitter";
    public static final String INSTA = "insta";
    public static final String GOOGLE = "google";
    public static final String FB = "fb";
    private Switch fbSwitch;
    private Switch gSwitch;
    private Switch insSwitch;
    private Switch twSwitch;
    private Switch linkSwitch;
    private Switch redSwitch;
    private Switch pintSwitch;
    private Switch tindSwitch;
    private Switch filcSwitch;
    private Switch tumbSwitch;
    private SharedPreferences tabsPref;
    private FloatingActionButton fabDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settin);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        bindViews();

        tabsPref = getSharedPreferences("tabsPref", MODE_PRIVATE);
        updateUI();
        initListener();

    }

    private void initListener() {
        fabDone.setOnClickListener(this);
    }

    private void updateUI() {
        fbSwitch.setChecked(tabsPref.getBoolean(FB, false));
        gSwitch.setChecked(tabsPref.getBoolean(GOOGLE, false));
        insSwitch.setChecked(tabsPref.getBoolean(INSTA, false));
        twSwitch.setChecked(tabsPref.getBoolean(TWITTER, false));
        linkSwitch.setChecked(tabsPref.getBoolean(LINKEDIN, false));
        redSwitch.setChecked(tabsPref.getBoolean(REDDIT, false));
        pintSwitch.setChecked(tabsPref.getBoolean(PINTEREST, false));
        tindSwitch.setChecked(tabsPref.getBoolean(TINDER, false));
        filcSwitch.setChecked(tabsPref.getBoolean(FLICKR, false));
        tumbSwitch.setChecked(tabsPref.getBoolean(TUMBLER, false));
    }

    private void bindViews() {
        fbSwitch = (Switch) findViewById(R.id.fbSwitch);
        gSwitch = (Switch) findViewById(R.id.gSwitch);
        insSwitch = (Switch) findViewById(R.id.insSwitch);
        twSwitch = (Switch) findViewById(R.id.twSwitch);
        linkSwitch = (Switch) findViewById(R.id.linSwitch);
        redSwitch = (Switch) findViewById(R.id.redSwitch);
        pintSwitch = (Switch) findViewById(R.id.pintSwitch);
        tindSwitch = (Switch) findViewById(R.id.tindSwitch);
        filcSwitch = (Switch) findViewById(R.id.flicSwitch);
        tumbSwitch = (Switch) findViewById(R.id.tumbSwitch);
        fabDone = (FloatingActionButton) findViewById(R.id.fabDone);
    }

    @Override
    public void onClick(View v) {
        SharedPreferences.Editor edit = tabsPref.edit();
        edit.putBoolean(FB, fbSwitch.isChecked());
        edit.putBoolean(GOOGLE, gSwitch.isChecked());
        edit.putBoolean(INSTA, insSwitch.isChecked());
        edit.putBoolean(TWITTER, twSwitch.isChecked());
        edit.putBoolean(LINKEDIN, linkSwitch.isChecked());
        edit.putBoolean(REDDIT, redSwitch.isChecked());
        edit.putBoolean(PINTEREST, pintSwitch.isChecked());
        edit.putBoolean(TINDER, tindSwitch.isChecked());
        edit.putBoolean(FLICKR, filcSwitch.isChecked());
        edit.putBoolean(TUMBLER, tumbSwitch.isChecked());
        edit.apply();
        startActivity(new Intent(SettinActivity.this,HomeActivity.class));
        finish();
    }
}
