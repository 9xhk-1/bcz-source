package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class b<E> extends ba<E> {

    /* renamed from: a, reason: collision with root package name */
    public final int f33264a;

    /* renamed from: b, reason: collision with root package name */
    public int f33265b;

    public b(int size) {
        this(size, 0);
    }

    @t7
    public abstract E a(int index);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f33265b < this.f33264a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f33265b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    @t7
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f33265b;
        this.f33265b = i11 + 1;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f33265b;
    }

    @Override // java.util.ListIterator
    @t7
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f33265b - 1;
        this.f33265b = i11;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f33265b - 1;
    }

    public b(int size, int position) {
        Preconditions.checkPositionIndex(position, size);
        this.f33264a = size;
        this.f33265b = position;
    }
}
