package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(serializable = true)
/* loaded from: classes7.dex */
public final class n7<T> extends s7<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    public final s7<? super T> f33686c;

    public n7(s7<? super T> ordering) {
        this.f33686c = ordering;
    }

    @Override // com.google.common.collect.s7
    public <S extends T> s7<S> B() {
        return this.f33686c.B();
    }

    @Override // com.google.common.collect.s7
    public <S extends T> s7<S> F() {
        return this.f33686c.F().B();
    }

    @Override // com.google.common.collect.s7, java.util.Comparator
    public int compare(@CheckForNull T left, @CheckForNull T right) {
        if (left == right) {
            return 0;
        }
        if (left == null) {
            return -1;
        }
        if (right == null) {
            return 1;
        }
        return this.f33686c.compare(left, right);
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof n7) {
            return this.f33686c.equals(((n7) object).f33686c);
        }
        return false;
    }

    public int hashCode() {
        return this.f33686c.hashCode() ^ 957692532;
    }

    public String toString() {
        return this.f33686c + ".nullsFirst()";
    }

    @Override // com.google.common.collect.s7
    public <S extends T> s7<S> A() {
        return this;
    }
}
