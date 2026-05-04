package com.google.common.collect;

import com.google.common.collect.j7;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
/* loaded from: classes7.dex */
public final class q3<E> extends ImmutableSortedMultiset<E> {

    /* renamed from: a, reason: collision with root package name */
    public final transient ImmutableSortedMultiset<E> f33727a;

    public q3(ImmutableSortedMultiset<E> forward) {
        this.f33727a = forward;
    }

    @Override // com.google.common.collect.j7
    public int count(@CheckForNull Object element) {
        return this.f33727a.count(element);
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    public j7.a<E> firstEntry() {
        return this.f33727a.lastEntry();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public j7.a<E> getEntry(int index) {
        return this.f33727a.entrySet().asList().reverse().get(index);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.x8
    public /* bridge */ /* synthetic */ x8 headMultiset(Object upperBound, BoundType boundType) {
        return headMultiset((q3<E>) upperBound, boundType);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.f33727a.isPartialView();
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    public j7.a<E> lastEntry() {
        return this.f33727a.firstEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
    public int size() {
        return this.f33727a.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.x8
    public /* bridge */ /* synthetic */ x8 tailMultiset(Object lowerBound, BoundType boundType) {
        return tailMultiset((q3<E>) lowerBound, boundType);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    @go.d
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.x8
    public ImmutableSortedMultiset<E> descendingMultiset() {
        return this.f33727a;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.x8
    public ImmutableSortedMultiset<E> headMultiset(E upperBound, BoundType boundType) {
        return this.f33727a.tailMultiset((ImmutableSortedMultiset<E>) upperBound, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.x8
    public ImmutableSortedMultiset<E> tailMultiset(E lowerBound, BoundType boundType) {
        return this.f33727a.headMultiset((ImmutableSortedMultiset<E>) lowerBound, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.j7
    public ImmutableSortedSet<E> elementSet() {
        return this.f33727a.elementSet().descendingSet();
    }
}
