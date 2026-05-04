package com.google.common.collect;

import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public class b8<E> extends q5<E> {

    /* renamed from: a, reason: collision with root package name */
    public final ImmutableCollection<E> f33282a;

    /* renamed from: b, reason: collision with root package name */
    public final ImmutableList<? extends E> f33283b;

    public b8(ImmutableCollection<E> delegate, ImmutableList<? extends E> delegateList) {
        this.f33282a = delegate;
        this.f33283b = delegateList;
    }

    @Override // com.google.common.collect.q5
    public ImmutableCollection<E> a() {
        return this.f33282a;
    }

    public ImmutableList<? extends E> b() {
        return this.f33283b;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @go.c
    public int copyIntoArray(Object[] dst, int offset) {
        return this.f33283b.copyIntoArray(dst, offset);
    }

    @Override // java.util.List
    public E get(int index) {
        return this.f33283b.get(index);
    }

    @Override // com.google.common.collect.ImmutableCollection
    @CheckForNull
    public Object[] internalArray() {
        return this.f33283b.internalArray();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayEnd() {
        return this.f33283b.internalArrayEnd();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayStart() {
        return this.f33283b.internalArrayStart();
    }

    @Override // com.google.common.collect.q5, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @go.d
    @go.c
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public ba<E> listIterator(int i11) {
        return this.f33283b.listIterator(i11);
    }

    public b8(ImmutableCollection<E> delegate, Object[] array) {
        this(delegate, ImmutableList.asImmutableList(array));
    }

    public b8(ImmutableCollection<E> delegate, Object[] array, int size) {
        this(delegate, ImmutableList.asImmutableList(array, size));
    }
}
