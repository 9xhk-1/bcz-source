package com.igexin.base.api;

import android.content.Context;

/* loaded from: classes7.dex */
public class GTBase {
    public static Context context;

    public static boolean init(Context context2) {
        if (context2 == null) {
            return false;
        }
        context = context2;
        SharedPreferencesManager.init(context2);
        return true;
    }
}
