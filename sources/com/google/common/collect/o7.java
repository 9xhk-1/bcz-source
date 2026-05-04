package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(serializable = true)
/* loaded from: classes7.dex */
public final class o7<T> extends s7<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    public final s7<? super T> f33696c;

    public o7(s7<? super T> ordering) {
        this.f33696c = ordering;
    }

    @Override // com.google.common.collect.s7
    public <S extends T> s7<S> A() {
        return this.f33696c.A();
    }

    @Override // com.google.common.collect.s7
    public <S extends T> s7<S> F() {
        return this.f33696c.F().A();
    }

    @Override // com.google.common.collect.s7, java.util.Comparator
    public int compare(@CheckForNull T left, @CheckForNull T right) {
        if (left == right) {
            return 0;
        }
        if (left == null) {
            return 1;
        }
        if (right == null) {
            return -1;
        }
        return this.f33696c.compare(left, right);
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof o7) {
            return this.f33696c.equals(((o7) object).f33696c);
        }
        return false;
    }

    public int hashCode() {
        return this.f33696c.hashCode() ^ (-921210296);
    }

    public String toString() {
        return this.f33696c + ".nullsLast()";
    }

    @Override // com.google.common.collect.s7
    public <S extends T> s7<S> B() {
        return this;
    }
}
