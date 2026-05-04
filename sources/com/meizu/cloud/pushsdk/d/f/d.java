package com.meizu.cloud.pushsdk.d.f;

/* loaded from: classes7.dex */
public final class d {
    public static <T> T a(T t11) {
        t11.getClass();
        return t11;
    }

    public static <T> T a(T t11, Object obj) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void a(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
