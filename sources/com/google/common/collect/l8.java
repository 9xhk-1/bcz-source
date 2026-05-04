package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(serializable = true)
/* loaded from: classes7.dex */
public final class l8 extends s7<Comparable<?>> implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final l8 f33671c = new l8();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f33671c;
    }

    @Override // com.google.common.collect.s7
    public <S extends Comparable<?>> s7<S> F() {
        return s7.z();
    }

    @Override // com.google.common.collect.s7, java.util.Comparator
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> left, Comparable<?> right) {
        Preconditions.checkNotNull(left);
        if (left == right) {
            return 0;
        }
        return right.compareTo(left);
    }

    @Override // com.google.common.collect.s7
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E s(E a11, E b11) {
        return (E) l7.f33668e.w(a11, b11);
    }

    @Override // com.google.common.collect.s7
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E t(E a11, E b11, E c11, E... rest) {
        return (E) l7.f33668e.x(a11, b11, c11, rest);
    }

    @Override // com.google.common.collect.s7
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E r(Iterable<E> iterable) {
        return (E) l7.f33668e.v(iterable);
    }

    @Override // com.google.common.collect.s7
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E u(Iterator<E> iterator) {
        return (E) l7.f33668e.y(iterator);
    }

    @Override // com.google.common.collect.s7
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E w(E a11, E b11) {
        return (E) l7.f33668e.s(a11, b11);
    }

    @Override // com.google.common.collect.s7
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E x(E a11, E b11, E c11, E... rest) {
        return (E) l7.f33668e.t(a11, b11, c11, rest);
    }

    @Override // com.google.common.collect.s7
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E v(Iterable<E> iterable) {
        return (E) l7.f33668e.r(iterable);
    }

    @Override // com.google.common.collect.s7
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E y(Iterator<E> iterator) {
        return (E) l7.f33668e.u(iterator);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
