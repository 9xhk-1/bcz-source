package com.heytap.mcssdk.utils;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ThreadUtil {
    private static final ExecutorService sFixedThreadExecutor = Executors.newSingleThreadExecutor();
    private static Handler mainHandler = new Handler(Looper.getMainLooper());

    public static void executeOnBackground(Runnable runnable) {
        sFixedThreadExecutor.execute(runnable);
    }

    public static void executeOnUiThread(Runnable runnable) {
        mainHandler.post(runnable);
    }
}
