package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ContextHolder {
    private static final String TAG = "ContextHolder";

    @SuppressLint({"StaticFieldLeak"})
    private static Context sAppContext;

    @SuppressLint({"StaticFieldLeak"})
    private static Context sKitContext;

    public static Context getAppContext() {
        return sAppContext;
    }

    public static Context getKitContext() {
        return sKitContext;
    }

    public static Context getResourceContext() {
        return getKitContext() != null ? getKitContext() : getAppContext();
    }

    public static void setAppContext(Context context) {
        if (sAppContext != null) {
            return;
        }
        CheckParamUtils.checkNotNull(context, "sAppContext == null");
        sAppContext = context.getApplicationContext();
    }

    public static void setKitContext(Context context) {
        CheckParamUtils.checkNotNull(context, "sKitContext == null");
        sKitContext = context;
    }
}
