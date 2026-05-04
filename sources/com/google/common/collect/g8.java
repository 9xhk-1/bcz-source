package com.google.common.collect;

import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public final class g8<E> extends ImmutableSet<E> {

    /* renamed from: f, reason: collision with root package name */
    public static final Object[] f33520f;

    /* renamed from: g, reason: collision with root package name */
    public static final g8<Object> f33521g;

    /* renamed from: a, reason: collision with root package name */
    @go.e
    public final transient Object[] f33522a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f33523b;

    /* renamed from: c, reason: collision with root package name */
    @go.e
    public final transient Object[] f33524c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f33525d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f33526e;

    static {
        Object[] objArr = new Object[0];
        f33520f = objArr;
        f33521g = new g8<>(objArr, 0, objArr, 0, 0);
    }

    public g8(Object[] elements, int hashCode, Object[] table, int mask, int size) {
        this.f33522a = elements;
        this.f33523b = hashCode;
        this.f33524c = table;
        this.f33525d = mask;
        this.f33526e = size;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object target) {
        Object[] objArr = this.f33524c;
        if (target == null || objArr.length == 0) {
            return false;
        }
        int d11 = o5.d(target);
        while (true) {
            int i11 = d11 & this.f33525d;
            Object obj = objArr[i11];
            if (obj == null) {
                return false;
            }
            if (obj.equals(target)) {
                return true;
            }
            d11 = i11 + 1;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] dst, int offset) {
        System.arraycopy(this.f33522a, 0, dst, offset, this.f33526e);
        return offset + this.f33526e;
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(this.f33522a, this.f33526e);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f33523b;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] internalArray() {
        return this.f33522a;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayEnd() {
        return this.f33526e;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayStart() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableSet
    public boolean isHashCodeFast() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f33526e;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @go.d
    @go.c
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public aa<E> iterator() {
        return asList().iterator();
    }
}
