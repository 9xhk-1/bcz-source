package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class v9<F, T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator<? extends F> f34069a;

    public v9(Iterator<? extends F> backingIterator) {
        this.f34069a = (Iterator) Preconditions.checkNotNull(backingIterator);
    }

    @t7
    public abstract T a(@t7 F from);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34069a.hasNext();
    }

    @Override // java.util.Iterator
    @t7
    public final T next() {
        return a(this.f34069a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f34069a.remove();
    }
}
