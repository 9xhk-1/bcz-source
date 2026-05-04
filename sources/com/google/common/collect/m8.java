package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(serializable = true)
/* loaded from: classes7.dex */
public final class m8<T> extends s7<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    public final s7<? super T> f33680c;

    public m8(s7<? super T> forwardOrder) {
        this.f33680c = (s7) Preconditions.checkNotNull(forwardOrder);
    }

    @Override // com.google.common.collect.s7
    public <S extends T> s7<S> F() {
        return this.f33680c;
    }

    @Override // com.google.common.collect.s7, java.util.Comparator
    public int compare(@t7 T a11, @t7 T b11) {
        return this.f33680c.compare(b11, a11);
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof m8) {
            return this.f33680c.equals(((m8) object).f33680c);
        }
        return false;
    }

    public int hashCode() {
        return -this.f33680c.hashCode();
    }

    @Override // com.google.common.collect.s7
    public <E extends T> E r(Iterable<E> iterable) {
        return (E) this.f33680c.v(iterable);
    }

    @Override // com.google.common.collect.s7
    public <E extends T> E s(@t7 E e11, @t7 E e12) {
        return (E) this.f33680c.w(e11, e12);
    }

    @Override // com.google.common.collect.s7
    public <E extends T> E t(@t7 E e11, @t7 E e12, @t7 E e13, E... eArr) {
        return (E) this.f33680c.x(e11, e12, e13, eArr);
    }

    public String toString() {
        return this.f33680c + ".reverse()";
    }

    @Override // com.google.common.collect.s7
    public <E extends T> E u(Iterator<E> it) {
        return (E) this.f33680c.y(it);
    }

    @Override // com.google.common.collect.s7
    public <E extends T> E v(Iterable<E> iterable) {
        return (E) this.f33680c.r(iterable);
    }

    @Override // com.google.common.collect.s7
    public <E extends T> E w(@t7 E e11, @t7 E e12) {
        return (E) this.f33680c.s(e11, e12);
    }

    @Override // com.google.common.collect.s7
    public <E extends T> E x(@t7 E e11, @t7 E e12, @t7 E e13, E... eArr) {
        return (E) this.f33680c.t(e11, e12, e13, eArr);
    }

    @Override // com.google.common.collect.s7
    public <E extends T> E y(Iterator<E> it) {
        return (E) this.f33680c.u(it);
    }
}
