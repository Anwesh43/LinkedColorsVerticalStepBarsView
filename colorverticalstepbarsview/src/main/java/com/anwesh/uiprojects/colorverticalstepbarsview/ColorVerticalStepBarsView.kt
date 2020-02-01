package com.anwesh.uiprojects.colorverticalstepbarsview

/**
 * Created by anweshmishra on 01/02/20.
 */

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.content.Context
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.RectF
import android.graphics.Color

val colors : Array<String> = arrayOf("#3F51B5", "#880E4F", "#009688", "#f44336", "#4CAF50")
val bars : Int = 5
val scGap : Float = 0.02f
val sizeFactor : Float = 5.2f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")

