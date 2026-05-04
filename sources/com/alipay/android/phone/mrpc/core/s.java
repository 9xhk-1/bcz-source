package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f10331a;

    public static final boolean a(Context context) {
        Boolean bool = f10331a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean z11 = (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0;
            f10331a = Boolean.valueOf(z11);
            return z11;
        } catch (Exception unused) {
            return false;
        }
    }
}
