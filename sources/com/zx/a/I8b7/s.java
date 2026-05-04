package com.zx.a.I8b7;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static float f46682a;

    public static int a(Context context, float f11) {
        if (f46682a == 0.0f) {
            f46682a = context.getResources().getDisplayMetrics().density;
        }
        return (int) ((f11 * f46682a) + 0.5f);
    }
}
