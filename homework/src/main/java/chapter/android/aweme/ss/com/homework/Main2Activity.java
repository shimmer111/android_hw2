package chapter.android.aweme.ss.com.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("main_activity", "---->onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("main_activity", "---->onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("main_activity", "---->onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("main_activity", "---->onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("main_activity", "---->onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("main_activity", "---->onDestroy: ");
    }
}
