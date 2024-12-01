package com.example.experiment3;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class TestActivity3 extends AppCompatActivity {

    private TextView testTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);
        testTextView = findViewById(R.id.testTextView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // 使用 MenuInflater 来加载菜单资源
        getMenuInflater().inflate(R.menu.menu1, menu);  // 你的菜单
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.action_small) {
            testTextView.setTextSize(10);
            return true;
        } else if (itemId == R.id.action_medium) {
            testTextView.setTextSize(16);
            return true;
        } else if (itemId == R.id.action_large) {
            testTextView.setTextSize(20);
            return true;
        } else if (itemId == R.id.action_red) {
            testTextView.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            return true;
        } else if (itemId == R.id.action_black) {
            testTextView.setTextColor(getResources().getColor(android.R.color.black));
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
