package com.example.androidapp

import android.app.Application
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.android.FlutterActivity

class MyApplication : Application() {

    lateinit var flutterEngine: FlutterEngine

    override fun onCreate() {
        super.onCreate()

        // Pre-warm Flutter engine
        flutterEngine = FlutterEngine(this)
        flutterEngine.navigationChannel.setInitialRoute("/")

        // Start executing Dart code to pre-warm engine
        flutterEngine.dartExecutor.executeDartEntrypoint(
            io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint.createDefault()
        )

        // Cache the FlutterEngine
        FlutterEngineCache
            .getInstance()
            .put("my_engine_id", flutterEngine)
    }
}
