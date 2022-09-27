package com.sopichi.kotlinbasic_01_y

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 코드에 메모 남기기 - 주석
//            ctrl + / 커서가 있는 줄을 주석 처리

        clickBtn.setOnClickListener {

            Log.d("메인화면", "클릭용 버튼 눌림")
            Log.e("메인화면", "에러관련 로그")

        }

        smallBtn.setOnClickListener {

            Toast.makeText(this, "작은 버튼 눌림", Toast.LENGTH_SHORT).show()

        }
    }
}