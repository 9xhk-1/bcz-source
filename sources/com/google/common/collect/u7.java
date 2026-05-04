package com.google.common.collect;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
@uo.f("Use Iterators.peekingIterator")
/* loaded from: classes7.dex */
public interface u7<E> extends Iterator<E> {
    @Override // java.util.Iterator
    @t7
    @uo.a
    E next();

    @t7
    E peek();

    @Override // java.util.Iterator
    void remove();
}
