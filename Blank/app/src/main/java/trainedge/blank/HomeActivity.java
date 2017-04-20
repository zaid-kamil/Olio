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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ImageView ivFacebook = (ImageView) findViewById(R.id.ivFacebook);
        ImageView ivGoogle = (ImageView) findViewById(R.id.ivGoogle);
        ImageView ivTwitter = (ImageView) findViewById(R.id.ivTwitter);
        ImageView ivInstagram = (ImageView) findViewById(R.id.ivInstagram);
        ivFacebook.setOnClickListener(this);
        ivGoogle.setOnClickListener(this);
        ivTwitter.setOnClickListener(this);
        ivInstagram.setOnClickListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {
            Intent share = new Intent(Intent.ACTION_SEND);
            share.setType("text/plain");
            share.putExtra(Intent.EXTRA_SUBJECT, "Olio");

            share.putExtra(Intent.EXTRA_TEXT, "Your friend has invited you to join the app./n To join click the link");
            startActivity(Intent.createChooser(share, "Share via..."));

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ivFacebook:
                Intent fbIntent = new Intent(this, SocialActivity.class);
                fbIntent.putExtra(POSITION,0);
                startActivity(fbIntent);
                break;
            case R.id.ivGoogle:
                Intent googleIntent = new Intent(this, SocialActivity.class);
                googleIntent.putExtra(POSITION,3);
                startActivity(googleIntent);
                break;
            case R.id.ivTwitter:
                startActivity(new Intent(this, TwitterActivity.class));
                break;
            case R.id.ivInstagram:
                startActivity(new Intent(this, InstagramActivity.class));
                break;
            case R.id.wbTinder:
                startActivity(new Intent(this, TinderActivity.class));
                break;
            case R.id.wbTumbler:
                startActivity(new Intent(this, TumblerActivity.class));
                break;
            case R.id.ivPinterest:
                startActivity(new Intent(this, PinterestActivity.class));
                break;
            case R.id.wvLinkedin:
                startActivity(new Intent(this, LinkedinActivity.class));
                break;
            case R.id.wbReddit:
                startActivity(new Intent(this, RedditActivity.class));
                break;
            case R.id.ivFlickr:
                startActivity(new Intent(this, FlickrActivity.class));
                break;
        }
    }
}
