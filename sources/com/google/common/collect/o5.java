package com.google.common.collect;

import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class o5 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f33693a = -862048943;

    /* renamed from: b, reason: collision with root package name */
    public static final long f33694b = 461845907;

    /* renamed from: c, reason: collision with root package name */
    public static final int f33695c = 1073741824;

    public static int a(int expectedEntries, double loadFactor) {
        int max = Math.max(expectedEntries, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (loadFactor * highestOneBit))) {
            return highestOneBit;
        }
        int i11 = highestOneBit << 1;
        if (i11 > 0) {
            return i11;
        }
        return 1073741824;
    }

    public static boolean b(int size, int tableSize, double loadFactor) {
        return ((double) size) > loadFactor * ((double) tableSize) && tableSize < 1073741824;
    }

    public static int c(int hashCode) {
        return (int) (Integer.rotateLeft((int) (hashCode * f33693a), 15) * f33694b);
    }

    public static int d(@CheckForNull Object o11) {
        return c(o11 == null ? 0 : o11.hashCode());
    }
}
