package com.example.experiment3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        ListView listView = findViewById(R.id.listView);

        // 创建数据
        String[] Name = {"Lion", "Tiger", "Monkey", "Dog","Cat","Elephant"};
        int[] image = {
                R.drawable.lion,
                R.drawable.tiger,
                R.drawable.monkey,
                R.drawable.dog,
                R.drawable.cat,
                R.drawable.elephant
        };
        List<Map<String, Object>> data = new ArrayList<>();
        for (int i = 0; i <6; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("Name", Name[i]);
            map.put("image",image[i]);
            data.add(map);
        }

        // 定义显示格式
        String[] from = {"Name","image"};
        int[] to = {R.id.text,R.id.image};

        // 创建SimpleAdapter
        SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.list_item, from, to);
        listView.setAdapter(adapter);
// 设置列表项点击事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // 获取选中项的名称
                String selectedItem = Name[position];
                // 显示Toast
                Toast.makeText(TestActivity1.this, selectedItem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
