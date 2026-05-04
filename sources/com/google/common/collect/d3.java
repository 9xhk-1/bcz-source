package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
/* loaded from: classes7.dex */
public class d3<E> extends a3<E> {

    /* renamed from: l, reason: collision with root package name */
    public static final int f33316l = -2;

    /* renamed from: h, reason: collision with root package name */
    @CheckForNull
    public transient int[] f33317h;

    /* renamed from: i, reason: collision with root package name */
    @CheckForNull
    public transient int[] f33318i;

    /* renamed from: j, reason: collision with root package name */
    public transient int f33319j;

    /* renamed from: k, reason: collision with root package name */
    public transient int f33320k;

    public d3() {
    }

    public static <E> d3<E> K() {
        return new d3<>();
    }

    public static <E> d3<E> L(Collection<? extends E> collection) {
        d3<E> N = N(collection.size());
        N.addAll(collection);
        return N;
    }

    @SafeVarargs
    public static <E> d3<E> M(E... elements) {
        d3<E> N = N(elements.length);
        Collections.addAll(N, elements);
        return N;
    }

    public static <E> d3<E> N(int expectedSize) {
        return new d3<>(expectedSize);
    }

    @Override // com.google.common.collect.a3
    public void C(int newCapacity) {
        super.C(newCapacity);
        this.f33317h = Arrays.copyOf(P(), newCapacity);
        this.f33318i = Arrays.copyOf(Q(), newCapacity);
    }

    public final int O(int entry) {
        return P()[entry] - 1;
    }

    public final int[] P() {
        int[] iArr = this.f33317h;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final int[] Q() {
        int[] iArr = this.f33318i;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final void R(int entry, int pred) {
        P()[entry] = pred + 1;
    }

    public final void S(int pred, int succ) {
        if (pred == -2) {
            this.f33319j = succ;
        } else {
            T(pred, succ);
        }
        if (succ == -2) {
            this.f33320k = pred;
        } else {
            R(succ, pred);
        }
    }

    public final void T(int entry, int succ) {
        Q()[entry] = succ + 1;
    }

    @Override // com.google.common.collect.a3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (y()) {
            return;
        }
        this.f33319j = -2;
        this.f33320k = -2;
        int[] iArr = this.f33317h;
        if (iArr != null && this.f33318i != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f33318i, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.a3
    public int d(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove >= size() ? indexRemoved : indexBeforeRemove;
    }

    @Override // com.google.common.collect.a3
    public int f() {
        int f11 = super.f();
        this.f33317h = new int[f11];
        this.f33318i = new int[f11];
        return f11;
    }

    @Override // com.google.common.collect.a3
    @uo.a
    public Set<E> g() {
        Set<E> g11 = super.g();
        this.f33317h = null;
        this.f33318i = null;
        return g11;
    }

    @Override // com.google.common.collect.a3
    public int q() {
        return this.f33319j;
    }

    @Override // com.google.common.collect.a3
    public int r(int entry) {
        return Q()[entry] - 1;
    }

    @Override // com.google.common.collect.a3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return p7.l(this);
    }

    @Override // com.google.common.collect.a3
    public void u(int expectedSize) {
        super.u(expectedSize);
        this.f33319j = -2;
        this.f33320k = -2;
    }

    @Override // com.google.common.collect.a3
    public void v(int entryIndex, @t7 E object, int hash, int mask) {
        super.v(entryIndex, object, hash, mask);
        S(this.f33320k, entryIndex);
        S(entryIndex, -2);
    }

    @Override // com.google.common.collect.a3
    public void x(int dstIndex, int mask) {
        int size = size() - 1;
        super.x(dstIndex, mask);
        S(O(dstIndex), r(dstIndex));
        if (dstIndex < size) {
            S(O(size), dstIndex);
            S(dstIndex, r(size));
        }
        P()[size] = 0;
        Q()[size] = 0;
    }

    public d3(int expectedSize) {
        super(expectedSize);
    }

    @Override // com.google.common.collect.a3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) p7.m(this, tArr);
    }
}
