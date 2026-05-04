package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public class d8<E> extends ImmutableList<E> {

    /* renamed from: c, reason: collision with root package name */
    public static final ImmutableList<Object> f33328c = new d8(new Object[0], 0);

    /* renamed from: a, reason: collision with root package name */
    @go.e
    public final transient Object[] f33329a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f33330b;

    public d8(Object[] array, int size) {
        this.f33329a = array;
        this.f33330b = size;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] dst, int dstOff) {
        System.arraycopy(this.f33329a, 0, dst, dstOff, this.f33330b);
        return dstOff + this.f33330b;
    }

    @Override // java.util.List
    public E get(int i11) {
        Preconditions.checkElementIndex(i11, this.f33330b);
        E e11 = (E) this.f33329a[i11];
        Objects.requireNonNull(e11);
        return e11;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] internalArray() {
        return this.f33329a;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayEnd() {
        return this.f33330b;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayStart() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f33330b;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @go.d
    @go.c
    public Object writeReplace() {
        return super.writeReplace();
    }
}
