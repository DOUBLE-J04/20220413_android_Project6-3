package com.example.android_project6_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost=getTabHost();
        TabHost.TabSpec tabSpecdog=tabHost.newTabSpec("pic1").setIndicator("pic1");
        tabSpecdog.setContent(R.id.pic1);
        tabHost.addTab(tabSpecdog);
        TabHost.TabSpec tabSpeccat=tabHost.newTabSpec("pic2").setIndicator("pic2");
        tabSpeccat.setContent(R.id.pic2);
        tabHost.addTab(tabSpeccat);
        TabHost.TabSpec tabSpecrab=tabHost.newTabSpec("pic3").setIndicator("pic3");
        tabSpecrab.setContent(R.id.pic3);
        tabHost.addTab(tabSpecrab);
        TabHost.TabSpec tabSpeclion=tabHost.newTabSpec("pic4").setIndicator("pic4");
        tabSpeclion.setContent(R.id.pic4);
        tabHost.addTab(tabSpeclion);
        tabHost.setCurrentTab(0);
    }
}