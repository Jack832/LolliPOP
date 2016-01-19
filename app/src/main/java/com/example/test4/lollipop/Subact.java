package com.example.test4.lollipop;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Slide;
import android.transition.Transition;
import android.view.Gravity;

/**
 * Created by bridgelabz4 on 19/1/16.
 */
public class Subact extends ActionBarActivity{
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Transition Trans = new Slide();

        getWindow().setEnterTransition(Trans);
        Trans.setDuration(1500);
        ((Slide) Trans).setSlideEdge(Gravity.LEFT);
        getWindow().setReturnTransition(Trans);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subact);
        toolbar = (Toolbar) findViewById(R.id.intoolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
