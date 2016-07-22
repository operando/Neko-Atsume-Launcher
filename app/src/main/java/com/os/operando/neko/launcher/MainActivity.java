package com.os.operando.neko.launcher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = new Intent();
        i.setClassName("com.android.egg", "com.android.egg.neko.NekoLand");
        startActivity(i);
        finish();
    }
}
