package com.lifeistech.andoroid.tapnumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Level3Activity extends AppCompatActivity {
    int[] hairetu = {2, 4, 6};

    String mondai;

    int seikai;
    int error;
    int point;

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
        textView = (TextView) findViewById(R.id.textView);

        error = 0;
        point = 0;

        start();
    }


    public void start() {
        hairetu = new int[4];
        Random rand = new Random();
        // 4つだから4桁
        // 0,1,2,3でランダムを作る -> +1する -> 1,2,3,4
        hairetu[0] = rand.nextInt(6) + 1;
        hairetu[1] = rand.nextInt(6) + 1;
        hairetu[2] = rand.nextInt(6) + 1;
        hairetu[3] = rand.nextInt(6) + 1;

        // hairetuを文字にする
        mondai =
                String.valueOf(hairetu[0])
                        + String.valueOf(hairetu[1])
                        + String.valueOf(hairetu[2])
                        + String.valueOf(hairetu[3]);
        textView.setText(mondai);
        seikai = 0;
    }

    public void number1(View v) {

        if (hairetu[seikai] == 1) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 4) {
                point = point + 1;
                Toast.makeText(this, point + "点ゲット", Toast.LENGTH_SHORT).show();
                start();
            }
        } else {
            error = error + 1;
            Toast.makeText(this, "間違えた回数" + error, Toast.LENGTH_SHORT).show();

            if (error == 5) {
                Toast.makeText(this, "ゲームオーバー", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Level3Activity.this, SubActivity.class);
                intent.putExtra("tennsuu", point);
                startActivity(intent);
                finish();
            }
        }
    }

    public void number2(View v) {

        if (hairetu[seikai] == 2) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 4) {
                point = point + 1;
                Toast.makeText(this, point + "点ゲット", Toast.LENGTH_SHORT).show();
                start();
            }
        } else {
            error = error + 1;
            Toast.makeText(this, "間違えた回数" + error, Toast.LENGTH_SHORT).show();
            Log.d("エラー", "error" + error + "個");

            if (error == 5) {
                Toast.makeText(this, "ゲームオーバー", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Level3Activity.this, SubActivity.class);
                //intent.putExtra("tokutenn", point);
                intent.putExtra("tennsuu", point);
                startActivity(intent);
                finish();
            }
        }

    }

    public void number3(View v) {

        if (hairetu[seikai] == 3) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 4) {
                point = point + 1;
                Toast.makeText(this, point + "点ゲット", Toast.LENGTH_SHORT).show();
                start();

            }
        } else {
            error = error + 1;
            Toast.makeText(this, "間違えた回数" + error, Toast.LENGTH_SHORT).show();

            if (error == 5) {
                Toast.makeText(this, "ゲームオーバー", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Level3Activity.this, SubActivity.class);
                intent.putExtra("tennsuu", point);
                startActivity(intent);
                finish();
            }
        }
    }

    public void number4(View v) {

        if (hairetu[seikai] == 4) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 4) {
                point = point + 1;
                Toast.makeText(this, point + "点ゲット", Toast.LENGTH_SHORT).show();
                start();
            }

        } else {
            error = error + 1;
            Toast.makeText(this, "間違えた回数" + error, Toast.LENGTH_SHORT).show();

            if (error == 5) {
                Toast.makeText(this, "ゲームオーバー", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Level3Activity.this, SubActivity.class); // どの画面からどの画面に遷移するか
                intent.putExtra("tennsuu", point); // ポイントを次の画面に渡す
                startActivity(intent); // 次の画面を起動する
                finish(); // 今の画面を終了する
            }
        }
    }

    public void number5(View v) {

        if (hairetu[seikai] == 5) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 4) {
                point = point + 1;
                Toast.makeText(this, point + "点ゲット", Toast.LENGTH_SHORT).show();
                start();
            }

        } else {
            error = error + 1;
            Toast.makeText(this, "間違えた回数" + error, Toast.LENGTH_SHORT).show();

            if (error == 5) {
                Toast.makeText(this, "ゲームオーバー", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Level3Activity.this, SubActivity.class); // どの画面からどの画面に遷移するか
                intent.putExtra("tennsuu", point); // ポイントを次の画面に渡す
                startActivity(intent); // 次の画面を起動する
                finish(); // 今の画面を終了する
            }
        }
    }

    public void number6(View v) {

        if (hairetu[seikai] == 6) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 4) {
                point = point + 1;
                Toast.makeText(this, point + "点ゲット", Toast.LENGTH_SHORT).show();
                start();
            }

        } else {
            error = error + 1;
            Toast.makeText(this, "間違えた回数" + error, Toast.LENGTH_SHORT).show();

            if (error == 5) {
                Toast.makeText(this, "ゲームオーバー", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Level3Activity.this, SubActivity.class); // どの画面からどの画面に遷移するか
                intent.putExtra("tennsuu", point); // ポイントを次の画面に渡す
                startActivity(intent); // 次の画面を起動する
                finish(); // 今の画面を終了する
            }
        }
    }
}
