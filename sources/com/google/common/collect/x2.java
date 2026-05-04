package com.google.common.collect;

import com.google.common.base.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class x2 {
    public static void a(Object key, Object value) {
        if (key == null) {
            throw new NullPointerException("null key in entry: null=" + value);
        }
        if (value != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + key + "=null");
    }

    @uo.a
    public static int b(int value, String name) {
        if (value >= 0) {
            return value;
        }
        throw new IllegalArgumentException(name + " cannot be negative but was: " + value);
    }

    @uo.a
    public static long c(long value, String name) {
        if (value >= 0) {
            return value;
        }
        throw new IllegalArgumentException(name + " cannot be negative but was: " + value);
    }

    public static void d(int value, String name) {
        if (value > 0) {
            return;
        }
        throw new IllegalArgumentException(name + " must be positive but was: " + value);
    }

    public static void e(boolean canRemove) {
        Preconditions.checkState(canRemove, "no calls to next() since the last call to remove()");
    }
}
