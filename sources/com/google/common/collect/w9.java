package com.google.common.collect;

import java.util.ListIterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class w9<F, T> extends v9<F, T> implements ListIterator<T> {
    public w9(ListIterator<? extends F> backingIterator) {
        super(backingIterator);
    }

    @Override // java.util.ListIterator
    public void add(@t7 T element) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<? extends F> b() {
        return (ListIterator) this.f34069a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    @t7
    public final T previous() {
        return a(b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    public void set(@t7 T element) {
        throw new UnsupportedOperationException();
    }
}
