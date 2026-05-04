package com.huawei.updatesdk.b.h;

import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static String f36923a;

    /* renamed from: b, reason: collision with root package name */
    private static Resources f36924b;

    public static int a(Context context, String str) {
        return a(context, str, "id");
    }

    public static int b(Context context, String str) {
        return a(context, str, "layout");
    }

    public static int c(Context context, String str) {
        return a(context, str, TypedValues.Custom.S_STRING);
    }

    private static int a(Context context, String str, String str2) {
        if (f36924b == null) {
            f36924b = context.getResources();
        }
        return f36924b.getIdentifier(str, str2, a(context));
    }

    private static String a(Context context) {
        if (f36923a == null) {
            f36923a = context.getPackageName();
        }
        return f36923a;
    }
}
