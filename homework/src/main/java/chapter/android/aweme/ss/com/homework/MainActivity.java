package chapter.android.aweme.ss.com.homework;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import chapter.android.aweme.ss.com.homework.widget.CircleImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View root_view = findViewById(R.id.root_view);
        final int cnt = getViewCount(root_view);

        CircleImageView circleImageView = findViewById(R.id.circle_view);
        circleImageView.setImageResource(R.drawable.icon_micro_game_comment);
        findViewById(R.id.btn_exercises1).setOnClickListener(this);
        findViewById(R.id.btn_exercises2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this ,cnt+"views",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn_exercises3).setOnClickListener(this);
//        findViewById(R.id.btn_exercises3).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, Exercises3.class));
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_exercises1:
                startActivity(new Intent(this, Exercises1.class));
                break;
            case R.id.btn_exercises2:
                startActivity(new Intent(this, Exercises2.class));
                break;
            case R.id.btn_exercises3:
                startActivity(new Intent(this, Exercises3.class));
                break;
        }
    }

    public static int getViewCount(View view) {

        int viewCount = 0;

        if (null == view) {
            return 0;
        }

        if (view instanceof android.view.ViewGroup) {
            viewCount++;
            for (int i = 0; i < ((android.view.ViewGroup) view).getChildCount(); i++) {
                View viewc = ((android.view.ViewGroup) view).getChildAt(i);
                if (viewc instanceof android.view.ViewGroup) {
                    viewCount += getViewCount(viewc);
                } else {
                    viewCount++;
                }
            }
        }
        return viewCount;
        //todo 补全你的代码
    }
}
