package www.pointed.com.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;

/**
 * Please go to {@link ListViewFragment} to see an example of using EasyAdapter with a ListView
 * or {@link RecyclerViewFragment} for an example with a RecyclerView.
 *
 * This class only has boilerplate code to set up the the tabs and the ViewPager.
 */
public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(new MyPageAdapter(getSupportFragmentManager()));
        mViewPager.setOnPageChangeListener(mPageChangeListener);
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar!= null) {
            actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
            actionBar.addTab(actionBar
                    .newTab()
                    .setText(getString(R.string.tab_1_name))
                    .setTabListener(mTabListener));
            actionBar.addTab(actionBar
                    .newTab()
                    .setText(getString(R.string.tab_2_name))
                    .setTabListener(mTabListener));
        }
    }

    // Create a tab listener that is called when the user changes tabs.
    private ActionBar.TabListener mTabListener = new ActionBar.TabListener() {
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
            mViewPager.setCurrentItem(tab.getPosition());
        }

        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        }

        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        }
    };

    private ViewPager.OnPageChangeListener mPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.setSelectedNavigationItem(position);
            }
        }



        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    private class MyPageAdapter extends FragmentPagerAdapter {
        private MyPageAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 1) {
                return new RecyclerViewFragment();
            }
            return new ListViewFragment();
        }

        @Override
        public int getCount() {
            return 2;
        }

    }

}
