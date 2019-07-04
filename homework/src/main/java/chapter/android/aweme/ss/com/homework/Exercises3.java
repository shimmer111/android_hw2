package chapter.android.aweme.ss.com.homework;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.LayoutInflater;

import java.util.List;

import chapter.android.aweme.ss.com.homework.model.Message;
import chapter.android.aweme.ss.com.homework.model.PullParser;

/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 */
public class Exercises3 extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        List<Message> list = null;
        try {
            list = PullParser.getMessage(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final ListView listView = findViewById(R.id.rv_list);
        listView.setAdapter(new ListViewAdapter(this, list));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intentList = new Intent(Exercises3.this, Exercises3_list.class);
                intentList.putExtra("position",position);
                startActivity(intentList);
            }
        });
        final TextView headline4 = findViewById(R.id.headline4);
        headline4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHeadline4 = new Intent(Exercises3.this, Exerciser3_head.class);
                intentHeadline4.putExtra("name",headline4.getText());
                startActivity(intentHeadline4);
            }
        });
        final TextView headline3 = findViewById(R.id.headline3);
        headline3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHeadline3 = new Intent(Exercises3.this, Exerciser3_head.class);
                intentHeadline3.putExtra("name",headline3.getText());
                startActivity(intentHeadline3);
            }
        });
        final TextView headline2 = findViewById(R.id.headline2);
        headline2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHeadline2 = new Intent(Exercises3.this, Exerciser3_head.class);
                intentHeadline2.putExtra("name",headline2.getText());
                startActivity(intentHeadline2);
            }
        });
        final TextView headline1 = findViewById(R.id.headline1);
        headline1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHeadline1 = new Intent(Exercises3.this, Exerciser3_head.class);
                intentHeadline1.putExtra("name",headline1.getText());
                startActivity(intentHeadline1);
            }
        });

    }

    public static class ListViewAdapter extends BaseAdapter {

        private List<Message> list;

        private Context mContext;
        public ListViewAdapter(Context context,List<Message> list1){
            mContext = context;
            list = list1;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view;
            if (convertView == null) {
                LayoutInflater inflater = LayoutInflater.from(mContext);
                view = inflater.inflate(R.layout.im_list_item, null);
            } else {
                //!=null
                view = convertView;
            }
            TextView txtTitle = view.findViewById(R.id.tv_title);
            txtTitle.setText(list.get(position).getTitle());
            TextView txtDescription = view.findViewById(R.id.tv_description);
            txtDescription.setText(list.get(position).getDescription());
            TextView txtTime = view.findViewById(R.id.tv_time);
            txtTime.setText(list.get(position).getTime());

            return view;
        }
    }

}
