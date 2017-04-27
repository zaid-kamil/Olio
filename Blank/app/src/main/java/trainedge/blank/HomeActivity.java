package trainedge.blank;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {


    public static final String POSITION = "trainedge.blank.POS";
    private ImageView ivFacebook;
    private ImageView ivInstagram;
    private ImageView ivTwitter;
    private ImageView ivGoogle;
    private ImageView ivPinterest;
    private ImageView ivFlickr;
    private ImageView ivTumblr;
    private ImageView ivTinder;
    private ImageView ivReddit;
    private ImageView ivInkedin;
    private Toolbar toolbar;
    private NavigationView navigationView;
    private FloatingActionButton fabGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__drawer);
        bindViews();
        setupListeners();
        initViews();
    }

    private void initViews() {
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    private void setupListeners() {

        ivTumblr.setOnClickListener(this);
        ivTinder.setOnClickListener(this);
        ivReddit.setOnClickListener(this);
        ivInkedin.setOnClickListener(this);
        ivFacebook.setOnClickListener(this);
        ivInstagram.setOnClickListener(this);
        ivTwitter.setOnClickListener(this);
        ivGoogle.setOnClickListener(this);
        ivPinterest.setOnClickListener(this);
        ivFlickr.setOnClickListener(this);
        fabGo.setOnClickListener(this);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void bindViews() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        ivFacebook = (ImageView) findViewById(R.id.ivFacebook);
        ivInstagram = (ImageView) findViewById(R.id.ivInstagram);
        ivTwitter = (ImageView) findViewById(R.id.ivTwitter);
        ivGoogle = (ImageView) findViewById(R.id.ivGoogle);
        ivPinterest = (ImageView) findViewById(R.id.ivPinterest);
        ivFlickr = (ImageView) findViewById(R.id.ivFlickr);
        ivTumblr = (ImageView) findViewById(R.id.ivTumblr);
        ivTinder = (ImageView) findViewById(R.id.ivTinder);
        ivReddit = (ImageView) findViewById(R.id.ivReddit);
        ivInkedin = (ImageView) findViewById(R.id.ivLinkedin);
        fabGo = (FloatingActionButton) findViewById(R.id.fabGo);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id) {
            case R.id.navabout:
                goToAbout();
                break;
            case R.id.navSetting:
                settingActivity();
                break;
            case R.id.navFeedabck:
                goToFeedback();
                break;
            case R.id.nav_share:
                shareApp();
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void goToAbout() {
        Intent abt = new Intent(HomeActivity.this, aboutActivity.class);
        startActivity(abt);
    }

    private void settingActivity() {
        Intent set = new Intent(this, SettinActivity.class);
        startActivity(set);
    }

    private void goToFeedback() {
        Intent fed = new Intent(HomeActivity.this, Feedback.class);
        startActivity(fed);
    }

    private void shareApp() {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.setType("text/plain");
        share.putExtra(Intent.EXTRA_SUBJECT, "Olio");
        share.putExtra(Intent.EXTRA_TEXT, "Your friend has invited you to join the app./n To join click the link");
        startActivity(Intent.createChooser(share, "Share via..."));
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.ivFacebook:
                loadFragment(0);
                break;
            case R.id.ivInstagram:
                loadFragment(1);
                break;
            case R.id.ivTwitter:
                loadFragment(2);
                break;
            case R.id.ivGoogle:
                loadFragment(3);
                break;
            case R.id.ivPinterest:
                loadFragment(4);
                break;
            case R.id.ivFlickr:
                loadFragment(5);
                break;
            case R.id.ivTumblr:
                loadFragment(6);
                break;
            case R.id.ivTinder:
                loadFragment(7);
                break;
            case R.id.ivReddit:
                loadFragment(8);
                break;
            case R.id.ivLinkedin:
                loadFragment(9);
                break;
            case R.id.fabGo:
                gotoStatus();
        }
    }

    private void gotoStatus() {
        Intent fed = new Intent(HomeActivity.this, StatusActivity.class);
        startActivity(fed);
    }

    private void loadFragment(int value) {
        Intent linkedIntent = new Intent(this, SocialActivity.class);
        linkedIntent.putExtra(POSITION, value);
        startActivity(linkedIntent);
    }
}
