package chapter.android.aweme.ss.com.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Exercises3_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises3_list);
        int position = getIntent().getIntExtra("position", 0)+1;
        TextView textView = findViewById(R.id.text_show_position);
        textView.setText("第"+position+"个Message");
        textView.setTextSize(20);


    }
}
