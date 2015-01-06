package com.haqisaurus.highqualitytwit;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;


public class Dashboard extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TabHost tabHost = getTabHost();

        // Tab for Revent update3
        TabHost.TabSpec RU = tabHost.newTabSpec("Recent");

        // setting Title and Icon for the Tab
        RU.setIndicator("Recent", getResources().getDrawable(R.drawable.abc_btn_switch_to_on_mtrl_00001));
        Intent photosIntent = new Intent(this, RecentUpdate.class);
        RU.setContent(photosIntent);

        // Tab for Songs
        TabHost.TabSpec notif = tabHost.newTabSpec("Notification");
        notif.setIndicator("Notification", getResources().getDrawable(R.drawable.ic_launcher));
        Intent songsIntent = new Intent(this, Mentions.class);
        notif.setContent(songsIntent);

        // Tab for Videos
        TabHost.TabSpec DM = tabHost.newTabSpec("Direct Message");
        DM.setIndicator("Direct Message", getResources().getDrawable(R.drawable.ic_launcher));
        Intent videosIntent = new Intent(this, DirectMessage.class);
        DM.setContent(videosIntent);

        // Adding all TabSpec to TabHost
        tabHost.addTab(RU); // Adding photos tab
        tabHost.addTab(notif); // Adding songs tab
        tabHost.addTab(DM); // Adding videos tab
    }
}
