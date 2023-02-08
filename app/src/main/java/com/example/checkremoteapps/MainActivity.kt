package com.example.checkremoteapps

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val isPackageInstaled = isPackagesInstalled("com.anydesk.anydeskandroid", this.getPackageManager())
        Log.d("Is com.anydesk.anydeskandroid installed ---------- ",isPackageInstaled.toString())
    }
}

fun isPackagesInstalled(packageName: String, packageManager: PackageManager): Boolean {
    return try {
        packageManager.getPackageInfo(packageName, 0)
//        Log.d("---------","Package Installed")
        true
    } catch (e: PackageManager.NameNotFoundException) {
//        Log.d("---------","Package not Installed")
        false
    }
}