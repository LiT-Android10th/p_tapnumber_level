package com.lifeistech.andoroid.tapnumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Level5Activity extends AppCompatActivity {
    int[] hairetu = {2, 4, 6};

    // A=0番目, B=1番目, C=2番目, D=3番目, E=4番目, F=5番目
    String[] hairetuAlphabet = {"A", "B", "C", "D", "E", "F"};

    String mondai;

    int seikai;
    int error;
    int point;

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);
        textView = (TextView) findViewById(R.id.textView);

        error = 0;
        point = 0;

        start();
    }

    public void start() {
        hairetu = new int[6];
        Random rand = new Random();

        // 0,1,2,3でランダムを作る -> +1する -> 1,2,3,4
        hairetu[0] = rand.nextInt(6);
        hairetu[1] = rand.nextInt(6);
        hairetu[2] = rand.nextInt(6);
        hairetu[3] = rand.nextInt(6);
        hairetu[4] = rand.nextInt(6);
        hairetu[5] = rand.nextInt(6);

        // hairetuを文字にする
        mondai =
                hairetuAlphabet[hairetu[0]]
                        + hairetuAlphabet[hairetu[1]]
                        + hairetuAlphabet[hairetu[2]]
                        + hairetuAlphabet[hairetu[3]]
                        + hairetuAlphabet[hairetu[4]]
                        + hairetuAlphabet[hairetu[5]];
        textView.setText(mondai);
        seikai = 0;
    }

    public void number1(View v) {

        if (hairetu[seikai] == 0) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 6) {
                point = point + 1;
                Toast.makeText(this, point + "点ゲット", Toast.LENGTH_SHORT).show();
                start();
            }
        } else {
            error = error + 1;
            Toast.makeText(this, "間違えた回数" + error, Toast.LENGTH_SHORT).show();

            if (error == 5) {
                Toast.makeText(this, "ゲームオーバー", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Level5Activity.this, SubActivity.class);
                intent.putExtra("tennsuu", point);
                startActivity(intent);
                finish();
            }
        }
    }

    public void number2(View v) {

        if (hairetu[seikai] == 1) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 6) {
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
                Intent intent = new Intent(Level5Activity.this, SubActivity.class);
                //intent.putExtra("tokutenn", point);
                intent.putExtra("tennsuu", point);
                startActivity(intent);
                finish();
            }
        }

    }

    public void number3(View v) {

        if (hairetu[seikai] == 2) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 6) {
                point = point + 1;
                Toast.makeText(this, point + "点ゲット", Toast.LENGTH_SHORT).show();
                start();

            }
        } else {
            error = error + 1;
            Toast.makeText(this, "間違えた回数" + error, Toast.LENGTH_SHORT).show();

            if (error == 5) {
                Toast.makeText(this, "ゲームオーバー", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Level5Activity.this, SubActivity.class);
                intent.putExtra("tennsuu", point);
                startActivity(intent);
                finish();
            }
        }
    }

    public void number4(View v) {

        if (hairetu[seikai] == 3) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 6) {
                point = point + 1;
                Toast.makeText(this, point + "点ゲット", Toast.LENGTH_SHORT).show();
                start();
            }

        } else {
            error = error + 1;
            Toast.makeText(this, "間違えた回数" + error, Toast.LENGTH_SHORT).show();

            if (error == 5) {
                Toast.makeText(this, "ゲームオーバー", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Level5Activity.this, SubActivity.class);
                intent.putExtra("tennsuu", point);
                startActivity(intent);
                finish();
            }
        }


    }

    public void number5(View v) {

        if (hairetu[seikai] == 4) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 6) {
                point = point + 1;
                Toast.makeText(this, point + "点ゲット", Toast.LENGTH_SHORT).show();
                start();
            }

        } else {
            error = error + 1;
            Toast.makeText(this, "間違えた回数" + error, Toast.LENGTH_SHORT).show();

            if (error == 5) {
                Toast.makeText(this, "ゲームオーバー", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Level5Activity.this, SubActivity.class); // どの画面からどの画面に遷移するか
                intent.putExtra("tennsuu", point); // ポイントを次の画面に渡す
                startActivity(intent); // 次の画面を起動する
                finish(); // 今の画面を終了する
            }
        }
    }

    public void number6(View v) {

        if (hairetu[seikai] == 5) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 6) {
                point = point + 1;
                Toast.makeText(this, point + "点ゲット", Toast.LENGTH_SHORT).show();
                start();
            }

        } else {
            error = error + 1;
            Toast.makeText(this, "間違えた回数" + error, Toast.LENGTH_SHORT).show();

            if (error == 5) {
                Toast.makeText(this, "ゲームオーバー", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Level5Activity.this, SubActivity.class); // どの画面からどの画面に遷移するか
                intent.putExtra("tennsuu", point); // ポイントを次の画面に渡す
                startActivity(intent); // 次の画面を起動する
                finish(); // 今の画面を終了する
            }
        }
    }
}
