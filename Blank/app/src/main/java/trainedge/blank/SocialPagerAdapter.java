package trainedge.blank;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

import java.util.List;

import trainedge.blank.fragments.FacebookFragment;
import trainedge.blank.fragments.FlickrFragment;
import trainedge.blank.fragments.GoogleFragment;
import trainedge.blank.fragments.InstagramFragment;
import trainedge.blank.fragments.LinkedinFragment;
import trainedge.blank.fragments.PinterestFragment;
import trainedge.blank.fragments.RedditFragment;
import trainedge.blank.fragments.TinderFragment;
import trainedge.blank.fragments.TumblerFragment;
import trainedge.blank.fragments.TwitterFragment;

/**
 * Created by User on 14-04-2017.
 */

class SocialPagerAdapter extends FragmentPagerAdapter {


    private final Context context;

    public SocialPagerAdapter(Context context, FragmentManager fm, AppBarLayout appbar) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new FacebookFragment();
            case 1:
                return new InstagramFragment();
            case 2:
                return new TwitterFragment();
            case 3:
                return new GoogleFragment();
            case 4:
                return new PinterestFragment();
            case 5:
                return new FlickrFragment();
            case 6:
                return new TinderFragment();
            case 7:
                return new TumblerFragment();
            case 8:
                return new RedditFragment();
            case 9:
                return new LinkedinFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "facebook";
            case 1:
                return "Instagram";
            case 2:
                return "Twitter";
            case 3:
                return "Google";
            case 4:
                return "Pinterest";
            case 5:
                return "flickr";
            case 6:
                return "Tumbler";
            case 7:
                return "Tinder";
            case 8:
                return "Reddit";
            case 9:
                return "Linkedin";
        }
        return super.getPageTitle(position);
    }
}
