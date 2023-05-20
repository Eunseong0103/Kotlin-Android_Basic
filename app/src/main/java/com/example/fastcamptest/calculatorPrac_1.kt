package com.example.fastcamptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class calculatorPrac_1 : AppCompatActivity() {

    lateinit var one : TextView
    lateinit var two : TextView
    lateinit var three : TextView
    lateinit var four : TextView
    lateinit var five : TextView
    lateinit var six : TextView
    lateinit var seven : TextView
    lateinit var eight : TextView
    lateinit var nine : TextView
    lateinit var zero : TextView
    lateinit var plus : TextView
    lateinit var ca : TextView
    lateinit var result : TextView
    lateinit var equal : TextView

    var list = mutableListOf<String>()

    var tempo : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_prac1)

        findViews()
        one.setOnClickListener {
            result.append(one.text.toString())
        }
        two.setOnClickListener {
            result.append(two.text.toString())
        }
        three.setOnClickListener {
            result.append(three.text.toString())
        }
        four.setOnClickListener {
            result.append(four.text.toString())
        }
        five.setOnClickListener {
            result.append(five.text.toString())
        }
        six.setOnClickListener {
            result.append(six.text.toString())
        }
        seven.setOnClickListener {
            result.append(seven.text.toString())
        }
        eight.setOnClickListener {
            result.append(eight.text.toString())
        }
        nine.setOnClickListener {
            result.append(nine.text.toString())
        }
        zero.setOnClickListener {
            result.append(zero.text.toString())
        }
        ca.setOnClickListener {
            result.setText("")
        }
        plus.setOnClickListener {
            result.append(plus.text.toString())
        }
        equal.setOnClickListener {
            var input = 0
            if(result.text.contains('+')){
                var str = result.text.split('+')
                for (i in 0.. str.size-1){
                    list.add(str[i])
                    input+=list.get(i).toInt()

                }
            }
            result.text = input.toString()

        }


    }

    fun findViews(){
        one = findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five= findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)
        zero = findViewById(R.id.zero)
        plus = findViewById(R.id.plus)
        ca = findViewById(R.id.CA)
        result = findViewById(R.id.result)
        equal = findViewById(R.id.equal)
    }
}