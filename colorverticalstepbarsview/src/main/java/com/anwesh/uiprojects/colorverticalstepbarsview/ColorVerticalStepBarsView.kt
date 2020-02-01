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

fun Int.inverse() : Float = 1f / this
fun Float.maxScale(i : Int, n : Int) : Float = Math.max(0f, this - i * n.inverse())
fun Float.divideScale(i : Int, n : Int) : Float = Math.min(n.inverse(), maxScale(i, n)) * n
fun Float.sinify() : Float = Math.sin(this * Math.PI).toFloat()

fun Canvas.drawColorVerticalStepBar(i : Int, scale : Float, w : Float, size : Float, paint : Paint) {
    val sf : Float = scale.sinify().divideScale(i, bars)
    save()
    drawRect(RectF(0f, -size, w * sf, size), paint)
    restore()
}

fun Canvas.drawColorVerticalStepBars(scale : Float, w : Float, size : Float, paint : Paint) {
    for (j in 0..(bars - 1)) {
        drawColorVerticalStepBar(j, scale, w, size, paint)
    }
}

fun Canvas.drawCVSBNode(i : Int, scale : Float, paint : Paint) {
    val w : Float = width.toFloat()
    val h : Float = height.toFloat()
    val gap : Float = h / (colors.size + 1)
    val size : Float = gap / sizeFactor
    paint.color = Color.parseColor(colors[i])
    save()
    translate(0f, gap * (i + 1))
    drawColorVerticalStepBars(scale, w, size, paint)
    restore()
}

class ColorVerticalStepBarsView(ctx : Context) : View(ctx) {

    private val paint : Paint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas : Canvas) {

    }

    override fun onTouchEvent(event : MotionEvent) : Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {

            }
        }
        return true
    }
}