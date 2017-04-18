package trainedge.blank;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import static trainedge.blank.HomeActivity.POSITION;


public class SocialActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private AppBarLayout appbar;
    private TabLayout tabs;
    private int[] tabIcons=new int[]{
            R.drawable.face,
            R.drawable.inst,
            R.drawable.tw,
            R.drawable.go,
            R.drawable.red,
            R.drawable.tmbr,
            R.drawable.lkin,
            R.drawable.flic,
            R.drawable.pint,
            R.drawable.tndr,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        appbar = (AppBarLayout) findViewById(R.id.appbar);
        tabs = (TabLayout) findViewById(R.id.tabs);
        setSupportActionBar(toolbar);
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(new SocialPagerAdapter(this, getSupportFragmentManager(), appbar));
        tabs.setupWithViewPager(mViewPager);
        //setTabIcons();
        try {
            Intent intent = getIntent();
            int selection = intent.getIntExtra(POSITION, 0);
            mViewPager.setCurrentItem(selection, true);
        } catch (Exception e) {

        }

        //After set an adapter to the ViewPager
    }

    private void setTabIcons() {
        tabs.getTabAt(0).setIcon(tabIcons[0]);
        tabs.getTabAt(1).setIcon(tabIcons[1]);
        tabs.getTabAt(2).setIcon(tabIcons[2]);
        tabs.getTabAt(3).setIcon(tabIcons[3]);
        tabs.getTabAt(4).setIcon(tabIcons[4]);
        tabs.getTabAt(5).setIcon(tabIcons[5]);
        tabs.getTabAt(6).setIcon(tabIcons[6]);
        tabs.getTabAt(7).setIcon(tabIcons[7]);
        tabs.getTabAt(8).setIcon(tabIcons[8]);
        tabs.getTabAt(9).setIcon(tabIcons[9]);
    }


}
