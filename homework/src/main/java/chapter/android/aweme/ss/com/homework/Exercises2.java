package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    setContentView(R.layout.activity_main);
        View root_view = findViewById(R.id.root_view);

        final int cnt = getViewCount(root_view);
        findViewById(R.id.btn_exercises2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Exercises2.this ,cnt+"views",Toast.LENGTH_SHORT).show();
            }
        });
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
