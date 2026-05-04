package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class c<T> extends aa<T> {

    /* renamed from: a, reason: collision with root package name */
    public a f33289a = a.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    @CheckForNull
    public T f33290b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    @CheckForNull
    public abstract T a();

    @CheckForNull
    @uo.a
    public final T b() {
        this.f33289a = a.DONE;
        return null;
    }

    public final boolean c() {
        this.f33289a = a.FAILED;
        this.f33290b = a();
        if (this.f33289a == a.DONE) {
            return false;
        }
        this.f33289a = a.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Preconditions.checkState(this.f33289a != a.FAILED);
        int ordinal = this.f33289a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    @t7
    @uo.a
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f33289a = a.NOT_READY;
        T t11 = (T) m7.a(this.f33290b);
        this.f33290b = null;
        return t11;
    }

    @t7
    public final T peek() {
        if (hasNext()) {
            return (T) m7.a(this.f33290b);
        }
        throw new NoSuchElementException();
    }
}
