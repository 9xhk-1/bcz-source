package com.google.common.collect;

import java.util.ListIterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class ba<E> extends aa<E> implements ListIterator<E> {
    @Override // java.util.ListIterator
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public final void add(@t7 E e11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public final void set(@t7 E e11) {
        throw new UnsupportedOperationException();
    }
}
