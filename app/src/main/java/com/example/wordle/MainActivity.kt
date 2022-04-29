package com.example.wordle

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    var dict: MutableList<String?> = ArrayList()
    var matrix: ArrayList<ArrayList<TextView>> = ArrayList<ArrayList<TextView>>()

    fun init(){

        for(i in 0..4) matrix.add(ArrayList<TextView>())
        matrix[0].add(findViewById(R.id.textView12))
        matrix[0].add(findViewById(R.id.textView13))
        matrix[0].add(findViewById(R.id.textView14))
        matrix[0].add(findViewById(R.id.textView11))
        matrix[0].add(findViewById(R.id.textView15))
        matrix[1].add(findViewById(R.id.textView22))
        matrix[1].add(findViewById(R.id.textView23))
        matrix[1].add(findViewById(R.id.textView24))
        matrix[1].add(findViewById(R.id.textView21))
        matrix[1].add(findViewById(R.id.textView25))
        matrix[2].add(findViewById(R.id.textView32))
        matrix[2].add(findViewById(R.id.textView33))
        matrix[2].add(findViewById(R.id.textView34))
        matrix[2].add(findViewById(R.id.textView31))
        matrix[2].add(findViewById(R.id.textView35))
        matrix[3].add(findViewById(R.id.textView42))
        matrix[3].add(findViewById(R.id.textView43))
        matrix[3].add(findViewById(R.id.textView44))
        matrix[3].add(findViewById(R.id.textView41))
        matrix[3].add(findViewById(R.id.textView45))
        matrix[4].add(findViewById(R.id.textView52))
        matrix[4].add(findViewById(R.id.textView53))
        matrix[4].add(findViewById(R.id.textView54))
        matrix[4].add(findViewById(R.id.textView51))
        matrix[4].add(findViewById(R.id.textView55))


    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        // Following code might help you finish this homework

        for(i in 0..4) {
            for(j in 0..4) {
                matrix[i][j].text = "A"
                matrix[i][j].setTextColor(Color.WHITE)
            }
            matrix[i][0].setBackgroundColor(Color.parseColor("#6aaa64"))
            matrix[i][1].setBackgroundColor(Color.parseColor("#c9b458"))
            matrix[i][2].setBackgroundColor(Color.parseColor("#c9b458"))
            matrix[i][3].setBackgroundColor(Color.parseColor("#c9b458"))
            matrix[i][4].setBackgroundColor(Color.parseColor("#787c7e"))
        }
    }
}