package trainedge.blank;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Switch;

public class SettinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settin);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Switch fbSwitch = (Switch) findViewById(R.id.fbSwitch);
        Switch gSwitch = (Switch) findViewById(R.id.gSwitch);
        Switch insSwitch = (Switch) findViewById(R.id.insSwitch);
        Switch twSwitch = (Switch) findViewById(R.id.twSwitch);
        Switch linkSwitch = (Switch) findViewById(R.id.linSwitch);
        Switch redSwitch = (Switch) findViewById(R.id.redSwitch);
        Switch pintSwitch = (Switch) findViewById(R.id.pintSwitch);
        Switch tindSwitch = (Switch) findViewById(R.id.tindSwitch);
        Switch filcSwitch = (Switch) findViewById(R.id.flicSwitch);
        Switch tumbSwitch = (Switch) findViewById(R.id.tumbSwitch);



    }

}
