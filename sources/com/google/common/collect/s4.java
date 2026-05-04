package com.google.common.collect;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class s4<T> extends c5 implements Iterator<T> {
    @Override // java.util.Iterator
    public boolean hasNext() {
        return delegate().hasNext();
    }

    @t7
    @uo.a
    public T next() {
        return delegate().next();
    }

    public void remove() {
        delegate().remove();
    }

    @Override // com.google.common.collect.c5
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract Iterator<T> delegate();
}
