package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 * 屏幕切换后出现后生命周期历程：
 * onPause—》onStop—》onDestroy—》onCreate—》onStart—》onResume
 * 再次切换，与上相同：
 * onPause—》onStop—》onDestroy—》onCreate—》onStart—》onResume
 */
public class Exercises1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

}
