package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(serializable = true)
/* loaded from: classes7.dex */
public final class l7 extends s7<Comparable<?>> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final l7 f33668e = new l7();
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public transient s7<Comparable<?>> f33669c;

    /* renamed from: d, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public transient s7<Comparable<?>> f33670d;

    private Object readResolve() {
        return f33668e;
    }

    @Override // com.google.common.collect.s7
    public <S extends Comparable<?>> s7<S> A() {
        s7<S> s7Var = (s7<S>) this.f33669c;
        if (s7Var != null) {
            return s7Var;
        }
        s7<S> A = super.A();
        this.f33669c = A;
        return A;
    }

    @Override // com.google.common.collect.s7
    public <S extends Comparable<?>> s7<S> B() {
        s7<S> s7Var = (s7<S>) this.f33670d;
        if (s7Var != null) {
            return s7Var;
        }
        s7<S> B = super.B();
        this.f33670d = B;
        return B;
    }

    @Override // com.google.common.collect.s7
    public <S extends Comparable<?>> s7<S> F() {
        return l8.f33671c;
    }

    @Override // com.google.common.collect.s7, java.util.Comparator
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> left, Comparable<?> right) {
        Preconditions.checkNotNull(left);
        Preconditions.checkNotNull(right);
        return left.compareTo(right);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
