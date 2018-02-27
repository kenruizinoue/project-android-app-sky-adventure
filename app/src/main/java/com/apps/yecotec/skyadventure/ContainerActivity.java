package com.apps.yecotec.skyadventure;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.ImageView;

import com.apps.yecotec.skyadventure.fragments.DiscoverTabFragment;
import com.apps.yecotec.skyadventure.fragments.HomeTabFragment;
import com.apps.yecotec.skyadventure.fragments.LikesTabFragment;
import com.apps.yecotec.skyadventure.fragments.TravellersTabFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ContainerActivity extends AppCompatActivity {

    HomeTabFragment homeTabFragment;
    DiscoverTabFragment discoverTabFragment;
    TravellersTabFragment travellersTabFragment;
    LikesTabFragment likesTabFragment;

    @BindView(R.id.home_tab) ImageView homeTab;
    @BindView(R.id.discover_tab) ImageView discoverTab;
    @BindView(R.id.travellers_tab) ImageView travellersTab;
    @BindView(R.id.likes_tab) ImageView likesTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        ButterKnife.bind(this);
        initFragment();

        Rect rectangle = new Rect();
        Window window = getWindow();
        window.getDecorView().getWindowVisibleDisplayFrame(rectangle);
        int statusBarHeight = rectangle.top;
        int contentViewTop =
                window.findViewById(Window.ID_ANDROID_CONTENT).getTop();
        int titleBarHeight= contentViewTop - statusBarHeight;

        Log.d("TAG", "StatusBar Height= " + statusBarHeight + " , TitleBar Height = " + titleBarHeight);
    }

    private void initFragment() {
        homeTabFragment = new HomeTabFragment();
        discoverTabFragment = new DiscoverTabFragment();
        travellersTabFragment = new TravellersTabFragment();
        likesTabFragment = new LikesTabFragment();

        // Transaction adds fragment to the specified container
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, homeTabFragment)
                .add(R.id.fragment_container, discoverTabFragment)
                .add(R.id.fragment_container, travellersTabFragment)
                .add(R.id.fragment_container, likesTabFragment)
                .commit();
        homeTabSelected();
    }

    @OnClick(R.id.home_tab)
    public void homeTabSelected() {
        setBottomTabsToDefault();
        homeTab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_selected));
        getSupportFragmentManager().beginTransaction().show(homeTabFragment).commit();
    }

    @OnClick(R.id.discover_tab)
    public void discoverTabSelected() {
        setBottomTabsToDefault();
        discoverTab.setImageDrawable(getResources().getDrawable(R.drawable.ic_discover_selected));
        getSupportFragmentManager().beginTransaction().show(discoverTabFragment).commit();
    }

    @OnClick(R.id.travellers_tab)
    public void travellersTabSelected() {
        setBottomTabsToDefault();
        travellersTab.setImageDrawable(getResources().getDrawable(R.drawable.ic_travellers_selected));
        getSupportFragmentManager().beginTransaction().show(travellersTabFragment).commit();
    }

    @OnClick(R.id.likes_tab)
    public void likesTabSelected() {
        setBottomTabsToDefault();
        likesTab.setImageDrawable(getResources().getDrawable(R.drawable.ic_likes_selected));
        getSupportFragmentManager().beginTransaction().show(likesTabFragment).commit();
    }

    public void setBottomTabsToDefault() {
        getSupportFragmentManager().beginTransaction().hide(homeTabFragment).commit();
        getSupportFragmentManager().beginTransaction().hide(discoverTabFragment).commit();
        getSupportFragmentManager().beginTransaction().hide(travellersTabFragment).commit();
        getSupportFragmentManager().beginTransaction().hide(likesTabFragment).commit();
        homeTab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_not_selected));
        discoverTab.setImageDrawable(getResources().getDrawable(R.drawable.ic_discover_not_selected));
        travellersTab.setImageDrawable(getResources().getDrawable(R.drawable.ic_travellers_not_selected));
        likesTab.setImageDrawable(getResources().getDrawable(R.drawable.ic_likes_not_selected));
    }
}
