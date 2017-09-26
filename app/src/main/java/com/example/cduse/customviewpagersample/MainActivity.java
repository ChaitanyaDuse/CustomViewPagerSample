package com.example.cduse.customviewpagersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        if (getSupportActionBar() != null)
            getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        initViewPager();
    }

    private void initViewPager() {
        VerticalViewPager viewPager = (VerticalViewPager) findViewById(R.id.vertical_viewpager);
        viewPager.setAdapter(new SampleFragmentPagerAdapter.Holder(getSupportFragmentManager())
                .add(SampleContentFragment.newInstance(1))
                .add(SampleContentFragment.newInstance(2))
                .add(SampleContentFragment.newInstance(3))
                .add(SampleContentFragment.newInstance(4))
                .add(SampleContentFragment.newInstance(5))
                .set());
        viewPager.setOverScrollMode(View.OVER_SCROLL_NEVER);
    }
}
