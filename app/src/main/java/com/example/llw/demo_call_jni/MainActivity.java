package com.example.llw.demo_call_jni;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.llw.demo_call_jni.jni.JNI;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnSend;

    private void assignViews() {
        btnSend = (Button) findViewById(R.id.btn_send);
        btnSend.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_send:
                fun();
                break;
        }
    }

    public void fun() {
        JNI jni = new JNI();
        Toast.makeText(MainActivity.this, "信息来了:" + jni.hellofromc(), Toast.LENGTH_SHORT).show();
    }
}
