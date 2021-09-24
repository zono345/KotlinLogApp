package jp.techacademy.yusuke.shimozono.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log //追加箇所
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val dog = Dog("ポチ", 3)
        dog.move()*/

        val human1 = Human("下園", 35, "プログラミング")
        human1.say()
        human1.think()

        val human2 = Human("ロナウド", 36, "サッカー")
        human2.say()
        human2.think()
    }
}