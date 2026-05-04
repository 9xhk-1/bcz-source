package com.google.common.collect;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
/* loaded from: classes7.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f33269a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f33270b = 5;

    /* renamed from: c, reason: collision with root package name */
    public static final int f33271c = 32;

    /* renamed from: d, reason: collision with root package name */
    public static final int f33272d = 31;

    /* renamed from: e, reason: collision with root package name */
    public static final int f33273e = 1073741823;

    /* renamed from: f, reason: collision with root package name */
    public static final int f33274f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f33275g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f33276h = 256;

    /* renamed from: i, reason: collision with root package name */
    public static final int f33277i = 255;

    /* renamed from: j, reason: collision with root package name */
    public static final int f33278j = 65536;

    /* renamed from: k, reason: collision with root package name */
    public static final int f33279k = 65535;

    public static Object a(int buckets) {
        if (buckets >= 2 && buckets <= 1073741824 && Integer.highestOneBit(buckets) == buckets) {
            return buckets <= 256 ? new byte[buckets] : buckets <= 65536 ? new short[buckets] : new int[buckets];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + buckets);
    }

    public static int b(int value, int mask) {
        return value & (~mask);
    }

    public static int c(int entry, int mask) {
        return entry & mask;
    }

    public static int d(int prefix, int suffix, int mask) {
        return (prefix & (~mask)) | (suffix & mask);
    }

    public static int e(int mask) {
        return (mask < 32 ? 4 : 2) * (mask + 1);
    }

    public static int f(@CheckForNull Object key, @CheckForNull Object value, int mask, Object table, int[] entries, Object[] keys, @CheckForNull Object[] values) {
        int i11;
        int i12;
        int d11 = o5.d(key);
        int i13 = d11 & mask;
        int h11 = h(table, i13);
        if (h11 == 0) {
            return -1;
        }
        int b11 = b(d11, mask);
        int i14 = -1;
        while (true) {
            i11 = h11 - 1;
            i12 = entries[i11];
            if (b(i12, mask) != b11 || !ho.d0.a(key, keys[i11]) || (values != null && !ho.d0.a(value, values[i11]))) {
                int c11 = c(i12, mask);
                if (c11 == 0) {
                    return -1;
                }
                i14 = i11;
                h11 = c11;
            }
        }
        int c12 = c(i12, mask);
        if (i14 == -1) {
            i(table, i13, c12);
            return i11;
        }
        entries[i14] = d(entries[i14], c12, mask);
        return i11;
    }

    public static void g(Object table) {
        if (table instanceof byte[]) {
            Arrays.fill((byte[]) table, (byte) 0);
        } else if (table instanceof short[]) {
            Arrays.fill((short[]) table, (short) 0);
        } else {
            Arrays.fill((int[]) table, 0);
        }
    }

    public static int h(Object table, int index) {
        return table instanceof byte[] ? ((byte[]) table)[index] & 255 : table instanceof short[] ? ((short[]) table)[index] & yz.c2.f100412d : ((int[]) table)[index];
    }

    public static void i(Object table, int index, int entry) {
        if (table instanceof byte[]) {
            ((byte[]) table)[index] = (byte) entry;
        } else if (table instanceof short[]) {
            ((short[]) table)[index] = (short) entry;
        } else {
            ((int[]) table)[index] = entry;
        }
    }

    public static int j(int expectedSize) {
        return Math.max(4, o5.a(expectedSize + 1, 1.0d));
    }
}
