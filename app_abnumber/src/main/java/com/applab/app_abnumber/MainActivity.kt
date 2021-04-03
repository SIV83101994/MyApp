package com.applab.app_abnumber

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.applab.app_abnumber.Utils.ABNumber
import java.util.*

class MainActivity : AppCompatActivity() {
    private var ab = ABNumber()
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ab.setAns()

    }
    fun onClickSubmitButton(view: View){
        val guess = "1234"
        val result = ab.getResult(guess)
        Log.d("MainActivity",Arrays.toString(result))
        //資料呈現
        val log ="${result[0]}A${result[1]}B"
        //log資料累積
        
    }
}