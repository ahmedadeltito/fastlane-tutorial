package com.ahmedadelsaid.fastlanetutorial

import android.app.Application
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric



/**
 * Created by Ahmed Adel on 22/07/2018.
 */
class FastlaneTutorialApp: Application() {

    override fun onCreate() {
        super.onCreate()
        Fabric.with(this, Crashlytics())
    }

}