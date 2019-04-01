package com.lifeistech.andoroid.tapnumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    TextView textView8;//今回の得点
    TextView textView9;//highschore
    int highscore;
    int tennsuu;

    PreferenceManager preferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        tennsuu = intent.getIntExtra("tennsuu", 0);

        preferenceManager = new PreferenceManager(getApplication());

        textView8 = (TextView) findViewById(R.id.textView8);

        int savedHighScore = preferenceManager.getInt("TENNSUU", 0);
        //highscore = tennsuu;
        textView8.setText(String.valueOf(savedHighScore));

        // ここにfindViewByIdを書こう
        textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setText(String.valueOf(preferenceManager.getInt("TENNSUU", 0)));


        // 点数を保存
        if(tennsuu > savedHighScore) {
            preferenceManager.setInt("TENNSUU", tennsuu);
            textView9.setText(String.valueOf(tennsuu));
        } else {
//            highscore = 0;
//            preferenceManager.setInt("TENNSUU", 2);
            //textView8.setText(String.valueOf(tennsuu));
        }
        textView8.setText(String.valueOf(tennsuu));


        //Intent intent = getIntent();
        //point = intent.getIntExtra("tokutenn", 0);*/
    }

    public void challenge(View view) {
        Intent intent = new Intent(SubActivity.this, StartActivity.class);
        startActivity(intent);
    }

    public void finish(View view) {
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
