package com.lsit.android.testopengl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lsit.android.testopengl.gl.v1.OpenGLES10Activity;
import com.lsit.android.testopengl.gl.v2.OpenGLES20Activity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_opengl_v1)
    protected void onClickOpenglV1() {
        Intent intent = new Intent(this, OpenGLES20Activity.class);
        startActivity(intent);
    }

    @OnClick(R.id.button_opengl_v2)
    protected void onClickOpenglV2() {
        Intent intent = new Intent(this, OpenGLES10Activity.class);
        startActivity(intent);
    }
}
