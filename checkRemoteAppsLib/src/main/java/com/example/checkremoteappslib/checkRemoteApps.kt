package com.example.checkremoteappslib

import android.content.pm.PackageManager

object checkRemoteApps {
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
}