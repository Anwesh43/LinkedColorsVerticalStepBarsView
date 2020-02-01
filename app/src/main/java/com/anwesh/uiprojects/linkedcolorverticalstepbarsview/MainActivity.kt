package com.anwesh.uiprojects.linkedcolorverticalstepbarsview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.colorverticalstepbarsview.ColorVerticalStepBarsView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ColorVerticalStepBarsView.create(this)
    }
}
