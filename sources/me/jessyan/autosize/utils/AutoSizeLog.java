package me.jessyan.autosize.utils;

import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class AutoSizeLog {
    private static final String TAG = "AndroidAutoSize";
    private static boolean debug;

    private AutoSizeLog() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    public static void d(String str) {
        if (debug) {
            Log.d(TAG, str);
        }
    }

    public static void e(String str) {
        if (debug) {
            Log.e(TAG, str);
        }
    }

    public static boolean isDebug() {
        return debug;
    }

    public static void setDebug(boolean z11) {
        debug = z11;
    }

    public static void w(String str) {
        if (debug) {
            Log.w(TAG, str);
        }
    }
}
