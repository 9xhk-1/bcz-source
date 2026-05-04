package com.google.common.collect;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@u3
@go.c
/* loaded from: classes7.dex */
public class c3<K, V> extends z2<K, V> {

    /* renamed from: q, reason: collision with root package name */
    public static final int f33296q = -2;

    /* renamed from: m, reason: collision with root package name */
    @CheckForNull
    @go.e
    public transient long[] f33297m;

    /* renamed from: n, reason: collision with root package name */
    public transient int f33298n;

    /* renamed from: o, reason: collision with root package name */
    public transient int f33299o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f33300p;

    public c3() {
        this(3);
    }

    public static <K, V> c3<K, V> k0() {
        return new c3<>();
    }

    public static <K, V> c3<K, V> l0(int expectedSize) {
        return new c3<>(expectedSize);
    }

    @Override // com.google.common.collect.z2
    public int G() {
        return this.f33298n;
    }

    @Override // com.google.common.collect.z2
    public int H(int entry) {
        return ((int) p0(entry)) - 1;
    }

    @Override // com.google.common.collect.z2
    public void L(int expectedSize) {
        super.L(expectedSize);
        this.f33298n = -2;
        this.f33299o = -2;
    }

    @Override // com.google.common.collect.z2
    public void M(int entryIndex, @t7 K key, @t7 V value, int hash, int mask) {
        super.M(entryIndex, key, value, hash, mask);
        u0(this.f33299o, entryIndex);
        u0(entryIndex, -2);
    }

    @Override // com.google.common.collect.z2
    public void P(int dstIndex, int mask) {
        int size = size() - 1;
        super.P(dstIndex, mask);
        u0(n0(dstIndex), H(dstIndex));
        if (dstIndex < size) {
            u0(n0(size), dstIndex);
            u0(dstIndex, H(size));
        }
        r0(size, 0L);
    }

    @Override // com.google.common.collect.z2
    public void W(int newCapacity) {
        super.W(newCapacity);
        this.f33297m = Arrays.copyOf(q0(), newCapacity);
    }

    @Override // com.google.common.collect.z2, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (Q()) {
            return;
        }
        this.f33298n = -2;
        this.f33299o = -2;
        long[] jArr = this.f33297m;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    public final int n0(int entry) {
        return ((int) (p0(entry) >>> 32)) - 1;
    }

    public final long p0(int i11) {
        return q0()[i11];
    }

    public final long[] q0() {
        long[] jArr = this.f33297m;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    public final void r0(int i11, long value) {
        q0()[i11] = value;
    }

    @Override // com.google.common.collect.z2
    public void s(int index) {
        if (this.f33300p) {
            u0(n0(index), H(index));
            u0(this.f33299o, index);
            u0(index, -2);
            J();
        }
    }

    @Override // com.google.common.collect.z2
    public int t(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove >= size() ? indexRemoved : indexBeforeRemove;
    }

    public final void t0(int entry, int pred) {
        r0(entry, (p0(entry) & 4294967295L) | ((pred + 1) << 32));
    }

    @Override // com.google.common.collect.z2
    public int u() {
        int u11 = super.u();
        this.f33297m = new long[u11];
        return u11;
    }

    public final void u0(int pred, int succ) {
        if (pred == -2) {
            this.f33298n = succ;
        } else {
            v0(pred, succ);
        }
        if (succ == -2) {
            this.f33299o = pred;
        } else {
            t0(succ, pred);
        }
    }

    @Override // com.google.common.collect.z2
    @uo.a
    public Map<K, V> v() {
        Map<K, V> v11 = super.v();
        this.f33297m = null;
        return v11;
    }

    public final void v0(int entry, int succ) {
        r0(entry, (p0(entry) & q7.f33754l) | ((succ + 1) & 4294967295L));
    }

    @Override // com.google.common.collect.z2
    public Map<K, V> y(int tableSize) {
        return new LinkedHashMap(tableSize, 1.0f, this.f33300p);
    }

    public c3(int expectedSize) {
        this(expectedSize, false);
    }

    public c3(int expectedSize, boolean accessOrder) {
        super(expectedSize);
        this.f33300p = accessOrder;
    }
}
