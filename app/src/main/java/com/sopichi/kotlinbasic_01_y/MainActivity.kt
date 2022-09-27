package com.sopichi.kotlinbasic_01_y

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn.setOnClickListener {

            // 코드에 메모 남기기 - 주석
//            ctrl + / 커서가 있는 줄을 주석 처리

     Log.d("메인화면", "클릭용 버튼 눌림")
        }
    }
}