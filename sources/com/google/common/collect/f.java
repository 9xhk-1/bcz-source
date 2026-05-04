package com.google.common.collect;

import androidx.collection.SieveCacheKt;
import com.google.common.base.Preconditions;
import com.google.common.collect.j7;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public abstract class f<E> extends i<E> implements Serializable {

    @go.d
    @go.c
    private static final long serialVersionUID = 0;
    transient q7<E> backingMap;
    transient long size;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends f<E>.c<E> {
        public a() {
            super();
        }

        @Override // com.google.common.collect.f.c
        @t7
        public E b(int entryIndex) {
            return f.this.backingMap.j(entryIndex);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends f<E>.c<j7.a<E>> {
        public b() {
            super();
        }

        @Override // com.google.common.collect.f.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public j7.a<E> b(int entryIndex) {
            return f.this.backingMap.h(entryIndex);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class c<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f33476a;

        /* renamed from: b, reason: collision with root package name */
        public int f33477b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f33478c;

        public c() {
            this.f33476a = f.this.backingMap.f();
            this.f33478c = f.this.backingMap.f33760d;
        }

        public final void a() {
            if (f.this.backingMap.f33760d != this.f33478c) {
                throw new ConcurrentModificationException();
            }
        }

        @t7
        public abstract T b(int entryIndex);

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f33476a >= 0;
        }

        @Override // java.util.Iterator
        @t7
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T b11 = b(this.f33476a);
            int i11 = this.f33476a;
            this.f33477b = i11;
            this.f33476a = f.this.backingMap.t(i11);
            return b11;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            x2.e(this.f33477b != -1);
            f.this.size -= r0.backingMap.y(this.f33477b);
            this.f33476a = f.this.backingMap.u(this.f33476a, this.f33477b);
            this.f33477b = -1;
            this.f33478c = f.this.backingMap.f33760d;
        }
    }

    public f(int distinctElements) {
        this.backingMap = newBackingMap(distinctElements);
    }

    @go.d
    @go.c
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        int h11 = o8.h(stream);
        this.backingMap = newBackingMap(3);
        o8.g(this, stream, h11);
    }

    @go.d
    @go.c
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        o8.k(this, stream);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    @uo.a
    public final int add(@t7 E element, int occurrences) {
        if (occurrences == 0) {
            return count(element);
        }
        Preconditions.checkArgument(occurrences > 0, "occurrences cannot be negative: %s", occurrences);
        int n11 = this.backingMap.n(element);
        if (n11 == -1) {
            this.backingMap.v(element, occurrences);
            this.size += occurrences;
            return 0;
        }
        int l11 = this.backingMap.l(n11);
        long j11 = occurrences;
        long j12 = l11 + j11;
        Preconditions.checkArgument(j12 <= SieveCacheKt.NodeLinkMask, "too many occurrences: %s", j12);
        this.backingMap.C(n11, (int) j12);
        this.size += j11;
        return l11;
    }

    public void addTo(j7<? super E> j7Var) {
        Preconditions.checkNotNull(j7Var);
        int f11 = this.backingMap.f();
        while (f11 >= 0) {
            j7Var.add(this.backingMap.j(f11), this.backingMap.l(f11));
            f11 = this.backingMap.t(f11);
        }
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.backingMap.a();
        this.size = 0L;
    }

    @Override // com.google.common.collect.j7
    public final int count(@CheckForNull Object element) {
        return this.backingMap.g(element);
    }

    @Override // com.google.common.collect.i
    public final int distinctElements() {
        return this.backingMap.D();
    }

    @Override // com.google.common.collect.i
    public final Iterator<E> elementIterator() {
        return new a();
    }

    @Override // com.google.common.collect.i
    public final Iterator<j7.a<E>> entryIterator() {
        return new b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.j7
    public final Iterator<E> iterator() {
        return k7.n(this);
    }

    public abstract q7<E> newBackingMap(int distinctElements);

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    @uo.a
    public final int remove(@CheckForNull Object element, int occurrences) {
        if (occurrences == 0) {
            return count(element);
        }
        Preconditions.checkArgument(occurrences > 0, "occurrences cannot be negative: %s", occurrences);
        int n11 = this.backingMap.n(element);
        if (n11 == -1) {
            return 0;
        }
        int l11 = this.backingMap.l(n11);
        if (l11 > occurrences) {
            this.backingMap.C(n11, l11 - occurrences);
        } else {
            this.backingMap.y(n11);
            occurrences = l11;
        }
        this.size -= occurrences;
        return l11;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    @uo.a
    public final int setCount(@t7 E element, int count) {
        x2.b(count, "count");
        q7<E> q7Var = this.backingMap;
        int w11 = count == 0 ? q7Var.w(element) : q7Var.v(element, count);
        this.size += count - w11;
        return w11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
    public final int size() {
        return ro.i.A(this.size);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    public final boolean setCount(@t7 E element, int oldCount, int newCount) {
        x2.b(oldCount, "oldCount");
        x2.b(newCount, "newCount");
        int n11 = this.backingMap.n(element);
        if (n11 == -1) {
            if (oldCount != 0) {
                return false;
            }
            if (newCount > 0) {
                this.backingMap.v(element, newCount);
                this.size += newCount;
            }
            return true;
        }
        if (this.backingMap.l(n11) != oldCount) {
            return false;
        }
        if (newCount == 0) {
            this.backingMap.y(n11);
            this.size -= oldCount;
        } else {
            this.backingMap.C(n11, newCount);
            this.size += newCount - oldCount;
        }
        return true;
    }
}
