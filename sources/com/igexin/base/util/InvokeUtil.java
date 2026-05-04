package com.igexin.base.util;

import android.content.Context;

/* loaded from: classes7.dex */
public class InvokeUtil {
    private static Context appContext;

    public static Context findAppContext() {
        Context context = appContext;
        if (context != null) {
            return context;
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Context context2 = (Context) cls.getMethod("getApplication", null).invoke(cls.getDeclaredMethod("currentActivityThread", null).invoke(null, null), null);
            appContext = context2;
            return context2;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }
}
