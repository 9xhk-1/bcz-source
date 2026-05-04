package com.google.common.collect;

import com.google.common.collect.j7;
import com.google.common.collect.z8;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public abstract class h5<E> extends z4<E> implements x8<E> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class a extends s3<E> {
        public a() {
        }

        @Override // com.google.common.collect.s3
        public x8<E> G() {
            return h5.this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends z8.b<E> {
        public b() {
            super(h5.this);
        }
    }

    @Override // com.google.common.collect.z4
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public abstract x8<E> delegate();

    @CheckForNull
    public j7.a<E> F() {
        Iterator<j7.a<E>> it = entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        j7.a<E> next = it.next();
        return k7.k(next.e(), next.getCount());
    }

    @CheckForNull
    public j7.a<E> G() {
        Iterator<j7.a<E>> it = descendingMultiset().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        j7.a<E> next = it.next();
        return k7.k(next.e(), next.getCount());
    }

    @CheckForNull
    public j7.a<E> H() {
        Iterator<j7.a<E>> it = entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        j7.a<E> next = it.next();
        j7.a<E> k11 = k7.k(next.e(), next.getCount());
        it.remove();
        return k11;
    }

    @CheckForNull
    public j7.a<E> I() {
        Iterator<j7.a<E>> it = descendingMultiset().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        j7.a<E> next = it.next();
        j7.a<E> k11 = k7.k(next.e(), next.getCount());
        it.remove();
        return k11;
    }

    public x8<E> J(@t7 E lowerBound, BoundType lowerBoundType, @t7 E upperBound, BoundType upperBoundType) {
        return tailMultiset(lowerBound, lowerBoundType).headMultiset(upperBound, upperBoundType);
    }

    @Override // com.google.common.collect.x8, com.google.common.collect.t8
    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    @Override // com.google.common.collect.x8
    public x8<E> descendingMultiset() {
        return delegate().descendingMultiset();
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    public j7.a<E> firstEntry() {
        return delegate().firstEntry();
    }

    @Override // com.google.common.collect.x8
    public x8<E> headMultiset(@t7 E upperBound, BoundType boundType) {
        return delegate().headMultiset(upperBound, boundType);
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    public j7.a<E> lastEntry() {
        return delegate().lastEntry();
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    public j7.a<E> pollFirstEntry() {
        return delegate().pollFirstEntry();
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    public j7.a<E> pollLastEntry() {
        return delegate().pollLastEntry();
    }

    @Override // com.google.common.collect.x8
    public x8<E> subMultiset(@t7 E lowerBound, BoundType lowerBoundType, @t7 E upperBound, BoundType upperBoundType) {
        return delegate().subMultiset(lowerBound, lowerBoundType, upperBound, upperBoundType);
    }

    @Override // com.google.common.collect.x8
    public x8<E> tailMultiset(@t7 E lowerBound, BoundType boundType) {
        return delegate().tailMultiset(lowerBound, boundType);
    }

    @Override // com.google.common.collect.z4, com.google.common.collect.j7
    public NavigableSet<E> elementSet() {
        return delegate().elementSet();
    }
}
