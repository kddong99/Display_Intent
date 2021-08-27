package com.example.test;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ClickActivity extends AppCompatActivity{
    //생성자가 끝나면 자동으로 onCreate 실행
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //화면에 보여질 내용물 뷰를 설정
        setContentView(R.layout.activity_menu);
    }
}
