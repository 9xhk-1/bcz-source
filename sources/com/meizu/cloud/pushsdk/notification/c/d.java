package com.meizu.cloud.pushsdk.notification.c;

import android.content.Context;
import android.content.res.AssetManager;
import com.meizu.cloud.pushinternal.DebugLogger;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static d f39910a;

    /* renamed from: b, reason: collision with root package name */
    private AssetManager f39911b;

    private d(Context context) {
        b(context);
    }

    private void b(Context context) {
        this.f39911b = context.getAssets();
    }

    public int a(Context context, String str, String str2) {
        DebugLogger.i("ResourceReader", "Get resource type " + str2 + " " + str);
        return context.getResources().getIdentifier(str, str2, context.getApplicationInfo().packageName);
    }

    public static d a(Context context) {
        if (f39910a == null) {
            f39910a = new d(context);
        }
        return f39910a;
    }
}
