package com.google.common.collect;

import com.google.common.collect.j7;
import com.google.common.collect.k7;
import com.google.common.collect.z8;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public abstract class s3<E> extends z4<E> implements x8<E> {

    /* renamed from: a, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public transient Comparator<? super E> f33824a;

    /* renamed from: b, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public transient NavigableSet<E> f33825b;

    /* renamed from: c, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public transient Set<j7.a<E>> f33826c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends k7.i<E> {
        public a() {
        }

        @Override // com.google.common.collect.k7.i
        public j7<E> g() {
            return s3.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<j7.a<E>> iterator() {
            return s3.this.F();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s3.this.G().entrySet().size();
        }
    }

    public Set<j7.a<E>> D() {
        return new a();
    }

    public abstract Iterator<j7.a<E>> F();

    public abstract x8<E> G();

    @Override // com.google.common.collect.x8, com.google.common.collect.t8
    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f33824a;
        if (comparator != null) {
            return comparator;
        }
        s7 F = s7.i(G().comparator()).F();
        this.f33824a = F;
        return F;
    }

    @Override // com.google.common.collect.x8
    public x8<E> descendingMultiset() {
        return G();
    }

    @Override // com.google.common.collect.z4, com.google.common.collect.j7
    public Set<j7.a<E>> entrySet() {
        Set<j7.a<E>> set = this.f33826c;
        if (set != null) {
            return set;
        }
        Set<j7.a<E>> D = D();
        this.f33826c = D;
        return D;
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    public j7.a<E> firstEntry() {
        return G().lastEntry();
    }

    @Override // com.google.common.collect.x8
    public x8<E> headMultiset(@t7 E toElement, BoundType boundType) {
        return G().tailMultiset(toElement, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.l4, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return k7.n(this);
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    public j7.a<E> lastEntry() {
        return G().firstEntry();
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    public j7.a<E> pollFirstEntry() {
        return G().pollLastEntry();
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    public j7.a<E> pollLastEntry() {
        return G().pollFirstEntry();
    }

    @Override // com.google.common.collect.x8
    public x8<E> subMultiset(@t7 E fromElement, BoundType fromBoundType, @t7 E toElement, BoundType toBoundType) {
        return G().subMultiset(toElement, toBoundType, fromElement, fromBoundType).descendingMultiset();
    }

    @Override // com.google.common.collect.x8
    public x8<E> tailMultiset(@t7 E fromElement, BoundType boundType) {
        return G().headMultiset(fromElement, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.l4, java.util.Collection
    public Object[] toArray() {
        return standardToArray();
    }

    @Override // com.google.common.collect.c5
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.z4, com.google.common.collect.l4, com.google.common.collect.c5
    /* renamed from: w */
    public j7<E> delegate() {
        return G();
    }

    @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) standardToArray(tArr);
    }

    @Override // com.google.common.collect.z4, com.google.common.collect.j7
    public NavigableSet<E> elementSet() {
        NavigableSet<E> navigableSet = this.f33825b;
        if (navigableSet != null) {
            return navigableSet;
        }
        z8.b bVar = new z8.b(this);
        this.f33825b = bVar;
        return bVar;
    }
}
