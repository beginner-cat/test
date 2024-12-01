package com.example.experiment3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class TestActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);
        // 当需要显示自定义对话框时调用该方法
        showLoginDialog();
    }

    private void showLoginDialog() {
        // 获取布局文件
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.activity_test2, null);

        // 获取自定义布局中的控件
        TextView Title =dialogView.findViewById(R.id.title);
        EditText usernameEditText = dialogView.findViewById(R.id.username);
        EditText passwordEditText = dialogView.findViewById(R.id.password);
        Button cancelButton = dialogView.findViewById(R.id.cancel_button);
        Button SingInButton = dialogView.findViewById(R.id.sign_in);

        // 创建 AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // 将自定义布局添加到对话框中
        builder.setView(dialogView);
        // 创建并显示对话框
        AlertDialog dialog = builder.create();
        dialog.show();
        // 设置取消按钮点击事件
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 取消登录操作（你可以选择退出对话框或执行其他操作）
                // 关闭对话框
                dialog.dismiss();
            }
        });


    }
}
