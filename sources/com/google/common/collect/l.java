package com.google.common.collect;

import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class l<T> extends aa<T> {

    /* renamed from: a, reason: collision with root package name */
    @CheckForNull
    public T f33625a;

    public l(@CheckForNull T firstOrNull) {
        this.f33625a = firstOrNull;
    }

    @CheckForNull
    public abstract T a(T previous);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33625a != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t11 = this.f33625a;
        if (t11 == null) {
            throw new NoSuchElementException();
        }
        this.f33625a = a(t11);
        return t11;
    }
}
