package com.lifeistech.andoroid.tapnumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void level1(View v) {
        Intent intent = new Intent(StartActivity.this, Level1Activity.class); // どの画面からどの画面に遷移するか
        startActivity(intent); // 次の画面を起動する
        finish(); // 今の画面を終了する
    }
    public void level2(View v) {
        Intent intent = new Intent(StartActivity.this, Level2Activity.class); // どの画面からどの画面に遷移するか
        startActivity(intent); // 次の画面を起動する
        finish(); // 今の画面を終了する
    }
    public void level3(View v) {
        Intent intent = new Intent(StartActivity.this, Level3Activity.class); // どの画面からどの画面に遷移するか
        startActivity(intent); // 次の画面を起動する
        finish(); // 今の画面を終了する
    }
    public void level4(View v) {
        Intent intent = new Intent(StartActivity.this, Level4Activity.class); // どの画面からどの画面に遷移するか
        startActivity(intent); // 次の画面を起動する
        finish(); // 今の画面を終了する
    }
    public void level5(View v) {
        Intent intent = new Intent(StartActivity.this, Level5Activity.class); // どの画面からどの画面に遷移するか
        startActivity(intent); // 次の画面を起動する
        finish(); // 今の画面を終了する
    }
}