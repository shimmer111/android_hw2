package chapter.android.aweme.ss.com.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Exerciser3_head extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exerciser3_head);
        final String name = getIntent().getStringExtra("name");
        Button button_head = findViewById(R.id.button_show_head);
        button_head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Exerciser3_head.this, name, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
