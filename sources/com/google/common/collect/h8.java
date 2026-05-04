package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.j7;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
/* loaded from: classes7.dex */
public final class h8<E> extends ImmutableSortedMultiset<E> {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f33535e = {0};

    /* renamed from: f, reason: collision with root package name */
    public static final ImmutableSortedMultiset<?> f33536f = new h8(s7.z());

    /* renamed from: a, reason: collision with root package name */
    @go.e
    public final transient i8<E> f33537a;

    /* renamed from: b, reason: collision with root package name */
    public final transient long[] f33538b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f33539c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f33540d;

    public h8(Comparator<? super E> comparator) {
        this.f33537a = ImmutableSortedSet.emptySet(comparator);
        this.f33538b = f33535e;
        this.f33539c = 0;
        this.f33540d = 0;
    }

    @Override // com.google.common.collect.j7
    public int count(@CheckForNull Object element) {
        int indexOf = this.f33537a.indexOf(element);
        if (indexOf >= 0) {
            return j(indexOf);
        }
        return 0;
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    public j7.a<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(0);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public j7.a<E> getEntry(int index) {
        return k7.k(this.f33537a.asList().get(index), j(index));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.x8
    public /* bridge */ /* synthetic */ x8 headMultiset(Object upperBound, BoundType boundType) {
        return headMultiset((h8<E>) upperBound, boundType);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.f33539c > 0 || this.f33540d < this.f33538b.length - 1;
    }

    public final int j(int index) {
        long[] jArr = this.f33538b;
        int i11 = this.f33539c;
        return (int) (jArr[(i11 + index) + 1] - jArr[i11 + index]);
    }

    public ImmutableSortedMultiset<E> k(int from, int to2) {
        Preconditions.checkPositionIndexes(from, to2, this.f33540d);
        return from == to2 ? ImmutableSortedMultiset.emptyMultiset(comparator()) : (from == 0 && to2 == this.f33540d) ? this : new h8(this.f33537a.a(from, to2), this.f33538b, this.f33539c + from, to2 - from);
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    public j7.a<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(this.f33540d - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
    public int size() {
        long[] jArr = this.f33538b;
        int i11 = this.f33539c;
        return ro.i.A(jArr[this.f33540d + i11] - jArr[i11]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.x8
    public /* bridge */ /* synthetic */ x8 tailMultiset(Object lowerBound, BoundType boundType) {
        return tailMultiset((h8<E>) lowerBound, boundType);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    @go.d
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.x8
    public ImmutableSortedMultiset<E> headMultiset(E upperBound, BoundType boundType) {
        return k(0, this.f33537a.b(upperBound, Preconditions.checkNotNull(boundType) == BoundType.CLOSED));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.x8
    public ImmutableSortedMultiset<E> tailMultiset(E lowerBound, BoundType boundType) {
        return k(this.f33537a.d(lowerBound, Preconditions.checkNotNull(boundType) == BoundType.CLOSED), this.f33540d);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.j7
    public ImmutableSortedSet<E> elementSet() {
        return this.f33537a;
    }

    public h8(i8<E> elementSet, long[] cumulativeCounts, int offset, int length) {
        this.f33537a = elementSet;
        this.f33538b = cumulativeCounts;
        this.f33539c = offset;
        this.f33540d = length;
    }
}
