package com.google.common.collect;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class v7 {
    public static <T> T[] a(Object[] objArr, int i11, int i12, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i11, i12, tArr.getClass());
    }

    public static <E extends Enum<E>> Class<E> b(E e11) {
        return e11.getDeclaringClass();
    }

    public static <T> T[] c(T[] tArr, int i11) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i11);
    }

    public static <K, V> Map<K, V> d(int expectedSize) {
        return z2.B(expectedSize);
    }

    public static <E> Set<E> e(int expectedSize) {
        return a3.m(expectedSize);
    }

    public static <K, V> Map<K, V> f(int expectedSize) {
        return c3.l0(expectedSize);
    }

    public static <E> Set<E> g(int expectedSize) {
        return d3.N(expectedSize);
    }

    public static <E> Set<E> h() {
        return a3.h();
    }

    public static <K, V> Map<K, V> i() {
        return z2.w();
    }

    public static <K, V> Map<K, V> j(int expectedSize) {
        return u6.e0(expectedSize);
    }

    @go.d
    public static s6 m(s6 mapMaker) {
        return mapMaker.l();
    }

    public static int k(int exponent) {
        return exponent;
    }

    public static int l(int iterations) {
        return iterations;
    }
}
