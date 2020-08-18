package jp.shimamoto.benkyo_free

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        var date = "20181015"

        val gdate = SimpleDateFormat("yyyyMMdd")
        var kdate = gdate.parse(date)

        textView1.text = kdate?.toString()

        val ldate = LocalDate.now()
        textView2.text = ldate.toString()  //// デフォルト？では yyyy-mm-dd になった

        val fdate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd"))   //// カッコ内の書式に変換？
        textView3.text = fdate

         */


/*
        val cal = Calendar.getInstance()
        val pdate = LocalDate.now()
        textView1.text = pdate.toString()

        val df = SimpleDateFormat("yyyyMMdd")
        val fdate = df.parse(pdate.toString())
        textView2.text = fdate.toString()

        cal.add(Calendar.DAY_OF_MONTH,-1)
 */
        /*
        //// 当日の日付を取得してtexeView1で表示、-20日してtextView2に表示    ////
        val cal = Calendar.getInstance()
        cal.time = Date()                   //// 省略可能では？Calendar.getInstance()で現在日時取得可能？
        val df = SimpleDateFormat("yyyyMMdd")
        textView1.text = ("current: ${df.format(cal.time)}")

        //// cal.add(Calendar.MONTH, 2)
        cal.add(Calendar.DATE, -20)
        textView2.text = ("after: ${df.format(cal.time)}")
        //// println("after: ${df.format(cal.time)}")

         */

fun xLine() {
    var xId = emptyArray<String>()
    for (i in 0..30){
        //// 配列に追加

    }
}

    }
}