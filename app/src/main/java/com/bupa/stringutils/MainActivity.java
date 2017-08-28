package com.bupa.stringutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.bupa.stringutils.util.UIUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView viewById = (TextView) findViewById(R.id.show);
        viewById.setText(UIUtils.getCommenterString("你是sb吗?",R.color.colorAccent,"//回复不怕丶:",R.color.colorPrimaryDark,20,25,"我是你爹",R.color.colorPrimary,30));
    }

}
