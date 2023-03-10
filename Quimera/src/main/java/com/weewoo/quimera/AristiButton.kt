package com.weewoo.quimera

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class AristiButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle:Int = 0,
    defStyleRes:Int = 0
): LinearLayout(context, attrs, defStyle, defStyleRes)
{
    init{
        LayoutInflater.from(context).inflate(R.layout.component_btn,this, true)
        var btn = findViewById<Button>(R.id.btnQuimera)
        btn.setOnClickListener{Toast.makeText(context, "Prueba SOTEC", Toast.LENGTH_SHORT).show()}
    }
}