package com.os.operando.neko.launcher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = new Intent();
        i.setClassName("com.android.egg", "com.android.egg.neko.NekoLand");
        startActivity(i);
        finish();
    }
}
