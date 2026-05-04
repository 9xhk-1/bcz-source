package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.c
@l0
/* loaded from: classes7.dex */
public final class y {
    public static <V> AtomicReference<V> a() {
        return new AtomicReference<>();
    }

    public static <V> AtomicReference<V> b(@z1 V initialValue) {
        return new AtomicReference<>(initialValue);
    }

    public static <E> AtomicReferenceArray<E> c(int length) {
        return new AtomicReferenceArray<>(length);
    }

    public static <E> AtomicReferenceArray<E> d(E[] array) {
        return new AtomicReferenceArray<>(array);
    }
}
