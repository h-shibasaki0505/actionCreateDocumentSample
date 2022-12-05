# actionCreateDocumentSample

<reproduction procedure>

1. launch the application
2. Press the OPENSAF button

ADB Logs:

```
12-05 14:51:57.077  1692  6859 I ActivityTaskManager: START u0 {act=android.intent.action.CREATE_DOCUMENT typ=text/* (has extras)} from uid 10169
12-05 14:51:57.079 10130 10130 D AndroidRuntime: Shutting down VM
12-05 14:51:57.082 10130 10130 E AndroidRuntime: FATAL EXCEPTION: main
12-05 14:51:57.082 10130 10130 E AndroidRuntime: Process: com.example.safsumple, PID: 10130
12-05 14:51:57.082 10130 10130 E AndroidRuntime: android.content.ActivityNotFoundException: No Activity found to handle Intent { act=android.intent.action.CREATE_DOCUMENT typ=text/* (has extras) }
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at android.app.Instrumentation.checkStartActivityResult(Instrumentation.java:2073)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at android.app.Instrumentation.execStartActivity(Instrumentation.java:1729)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at android.app.Activity.startActivityForResult(Activity.java:5314)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at androidx.activity.ComponentActivity.startActivityForResult(ComponentActivity.java:712)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at androidx.core.app.ActivityCompat$Api16Impl.startActivityForResult(ActivityCompat.java:766)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at androidx.core.app.ActivityCompat.startActivityForResult(ActivityCompat.java:241)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at androidx.activity.ComponentActivity$2.onLaunch(ComponentActivity.java:237)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at androidx.activity.result.ActivityResultRegistry$3.launch(ActivityResultRegistry.java:246)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at androidx.activity.result.ActivityResultLauncher.launch(ActivityResultLauncher.java:47)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at androidx.fragment.app.FragmentManager.launchStartActivityForResult(FragmentManager.java:2823)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at androidx.fragment.app.Fragment.startActivityForResult(Fragment.java:1502)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at androidx.fragment.app.Fragment.startActivityForResult(Fragment.java:1471)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at com.example.safsumple.FirstFragment.openSAF(FirstFragment.kt:63)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at com.example.safsumple.FirstFragment.onViewCreated$lambda-0(FirstFragment.kt:42)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at com.example.safsumple.FirstFragment.$r8$lambda$CodfaO31HGTGtMXJ3jJbQ5hS6S8(Unknown Source:0)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at com.example.safsumple.FirstFragment$$ExternalSyntheticLambda0.onClick(Unknown Source:2)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at android.view.View.performClick(View.java:7448)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at com.google.android.material.button.MaterialButton.performClick(MaterialButton.java:1219)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at android.view.View.performClickInternal(View.java:7425)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at android.view.View.access$3600(View.java:810)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at android.view.View$PerformClick.run(View.java:28309)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at android.os.Handler.handleCallback(Handler.java:938)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at android.os.Handler.dispatchMessage(Handler.java:99)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at android.os.Looper.loop(Looper.java:223)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at android.app.ActivityThread.main(ActivityThread.java:7705)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at java.lang.reflect.Method.invoke(Native Method)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:592)
12-05 14:51:57.082 10130 10130 E AndroidRuntime: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:952)
12-05 14:51:57.088  1692 10189 I DropBoxManagerService: add tag=data_app_crash isTagEnabled=true flags=0x2
12-05 14:51:57.089  1692  6859 W ActivityTaskManager:   Force finishing activity com.example.safsumple/.MainActivity
12-05 14:51:57.101  1692  6859 D ActivityTrigger: ActivityTrigger activityPauseTrigger 
12-05 14:51:57.112 10130 10130 I Process : Sending signal. PID: 10130 SIG: 9
12-05 14:51:57.130  1692  2221 W InputDispatcher: channel 'df7ad1e com.example.safsumple/com.example.safsumple.MainActivity (server)' ~ Consumer closed input channel or an error occurred.  events=0x9
12-05 14:51:57.132   645   645 I Zygote  : Process 10130 exited due to signal 9 (Killed)
12-05 14:51:57.134  1692  3061 I ActivityManager: Process com.example.safsumple (pid 10130) has died: fg  TOP 
12-05 14:51:57.134  1692  4356 I WindowManager: WIN DEATH: Window{df7ad1e u0 com.example.safsumple/com.example.safsumple.MainActivity}
12-05 14:51:57.134  1692  2221 E InputDispatcher: channel 'df7ad1e com.example.safsumple/com.example.safsumple.MainActivity (server)' ~ Channel is unrecoverably broken and will be disposed!
12-05 14:51:57.135  1692  4356 W InputDispatcher: Attempted to unregister already unregistered input channel 'df7ad1e com.example.safsumple/com.example.safsumple.MainActivity (server)'
12-05 14:51:57.144  1692  1953 I libprocessgroup: Successfully killed process cgroup uid 10169 pid 10130 in 0ms

```
