package com.google.common.collect;

import com.google.common.collect.j7;
import com.google.common.collect.k7;
import java.util.Comparator;
import java.util.NavigableSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class ca<E> extends k7.m<E> implements x8<E> {
    private static final long serialVersionUID = 0;

    /* renamed from: d, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public transient ca<E> f33315d;

    public ca(x8<E> delegate) {
        super(delegate);
    }

    @Override // com.google.common.collect.k7.m
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public NavigableSet<E> D() {
        return q8.P(delegate().elementSet());
    }

    @Override // com.google.common.collect.k7.m, com.google.common.collect.z4
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public x8<E> delegate() {
        return (x8) super.delegate();
    }

    @Override // com.google.common.collect.x8, com.google.common.collect.t8
    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    @Override // com.google.common.collect.x8
    public x8<E> descendingMultiset() {
        ca<E> caVar = this.f33315d;
        if (caVar != null) {
            return caVar;
        }
        ca<E> caVar2 = new ca<>(delegate().descendingMultiset());
        caVar2.f33315d = this;
        this.f33315d = caVar2;
        return caVar2;
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    public j7.a<E> firstEntry() {
        return delegate().firstEntry();
    }

    @Override // com.google.common.collect.x8
    public x8<E> headMultiset(@t7 E upperBound, BoundType boundType) {
        return k7.C(delegate().headMultiset(upperBound, boundType));
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    public j7.a<E> lastEntry() {
        return delegate().lastEntry();
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    public j7.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    public j7.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.x8
    public x8<E> subMultiset(@t7 E lowerBound, BoundType lowerBoundType, @t7 E upperBound, BoundType upperBoundType) {
        return k7.C(delegate().subMultiset(lowerBound, lowerBoundType, upperBound, upperBoundType));
    }

    @Override // com.google.common.collect.x8
    public x8<E> tailMultiset(@t7 E lowerBound, BoundType boundType) {
        return k7.C(delegate().tailMultiset(lowerBound, boundType));
    }

    @Override // com.google.common.collect.k7.m, com.google.common.collect.z4, com.google.common.collect.j7
    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }
}
