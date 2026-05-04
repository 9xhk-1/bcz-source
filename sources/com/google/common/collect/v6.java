package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class v6<E> extends AbstractQueue<E> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f34033g = 1431655765;

    /* renamed from: h, reason: collision with root package name */
    public static final int f34034h = -1431655766;

    /* renamed from: i, reason: collision with root package name */
    public static final int f34035i = 11;

    /* renamed from: a, reason: collision with root package name */
    public final v6<E>.c f34036a;

    /* renamed from: b, reason: collision with root package name */
    public final v6<E>.c f34037b;

    /* renamed from: c, reason: collision with root package name */
    @go.e
    public final int f34038c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f34039d;

    /* renamed from: e, reason: collision with root package name */
    public int f34040e;

    /* renamed from: f, reason: collision with root package name */
    public int f34041f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<B> {

        /* renamed from: d, reason: collision with root package name */
        public static final int f34042d = -1;

        /* renamed from: a, reason: collision with root package name */
        public final Comparator<B> f34043a;

        /* renamed from: b, reason: collision with root package name */
        public int f34044b;

        /* renamed from: c, reason: collision with root package name */
        public int f34045c;

        public <T extends B> v6<T> c() {
            return d(Collections.EMPTY_SET);
        }

        public <T extends B> v6<T> d(Iterable<? extends T> initialContents) {
            v6<T> v6Var = new v6<>(this, v6.r(this.f34044b, this.f34045c, initialContents));
            Iterator<? extends T> it = initialContents.iterator();
            while (it.hasNext()) {
                v6Var.offer(it.next());
            }
            return v6Var;
        }

        @uo.a
        public b<B> e(int expectedSize) {
            Preconditions.checkArgument(expectedSize >= 0);
            this.f34044b = expectedSize;
            return this;
        }

        @uo.a
        public b<B> f(int maximumSize) {
            Preconditions.checkArgument(maximumSize > 0);
            this.f34045c = maximumSize;
            return this;
        }

        public final <T extends B> s7<T> g() {
            return s7.i(this.f34043a);
        }

        public b(Comparator<B> comparator) {
            this.f34044b = -1;
            this.f34045c = Integer.MAX_VALUE;
            this.f34043a = (Comparator) Preconditions.checkNotNull(comparator);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public final s7<E> f34046a;

        /* renamed from: b, reason: collision with root package name */
        @Weak
        public v6<E>.c f34047b;

        public c(s7<E> ordering) {
            this.f34046a = ordering;
        }

        public void b(int index, E x11) {
            c cVar;
            int f11 = f(index, x11);
            if (f11 == index) {
                f11 = index;
                cVar = this;
            } else {
                cVar = this.f34047b;
            }
            cVar.c(f11, x11);
        }

        @uo.a
        public int c(int i11, E e11) {
            while (i11 > 2) {
                int k11 = k(i11);
                Object l11 = v6.this.l(k11);
                if (this.f34046a.compare(l11, e11) <= 0) {
                    break;
                }
                v6.this.f34039d[i11] = l11;
                i11 = k11;
            }
            v6.this.f34039d[i11] = e11;
            return i11;
        }

        public int d(int i11, int i12) {
            return this.f34046a.compare(v6.this.l(i11), v6.this.l(i12));
        }

        public int e(int i11, E e11) {
            int i12 = i(i11);
            if (i12 <= 0 || this.f34046a.compare(v6.this.l(i12), e11) >= 0) {
                return f(i11, e11);
            }
            v6.this.f34039d[i11] = v6.this.l(i12);
            v6.this.f34039d[i12] = e11;
            return i12;
        }

        public int f(int i11, E e11) {
            int n11;
            if (i11 == 0) {
                v6.this.f34039d[0] = e11;
                return 0;
            }
            int m11 = m(i11);
            Object l11 = v6.this.l(m11);
            if (m11 != 0 && (n11 = n(m(m11))) != m11 && l(n11) >= v6.this.f34040e) {
                Object l12 = v6.this.l(n11);
                if (this.f34046a.compare(l12, l11) < 0) {
                    m11 = n11;
                    l11 = l12;
                }
            }
            if (this.f34046a.compare(l11, e11) >= 0) {
                v6.this.f34039d[i11] = e11;
                return i11;
            }
            v6.this.f34039d[i11] = l11;
            v6.this.f34039d[m11] = e11;
            return m11;
        }

        public int g(int index) {
            while (true) {
                int j11 = j(index);
                if (j11 <= 0) {
                    return index;
                }
                v6.this.f34039d[index] = v6.this.l(j11);
                index = j11;
            }
        }

        public int h(int index, int len) {
            if (index >= v6.this.f34040e) {
                return -1;
            }
            Preconditions.checkState(index > 0);
            int min = Math.min(index, v6.this.f34040e - len) + len;
            for (int i11 = index + 1; i11 < min; i11++) {
                if (d(i11, index) < 0) {
                    index = i11;
                }
            }
            return index;
        }

        public int i(int index) {
            return h(l(index), 2);
        }

        public int j(int index) {
            int l11 = l(index);
            if (l11 < 0) {
                return -1;
            }
            return h(l(l11), 4);
        }

        public final int k(int i11) {
            return m(m(i11));
        }

        public final int l(int i11) {
            return (i11 * 2) + 1;
        }

        public final int m(int i11) {
            return (i11 - 1) / 2;
        }

        public final int n(int i11) {
            return (i11 * 2) + 2;
        }

        public int o(E e11) {
            int n11;
            int m11 = m(v6.this.f34040e);
            if (m11 != 0 && (n11 = n(m(m11))) != m11 && l(n11) >= v6.this.f34040e) {
                Object l11 = v6.this.l(n11);
                if (this.f34046a.compare(l11, e11) < 0) {
                    v6.this.f34039d[n11] = e11;
                    v6.this.f34039d[v6.this.f34040e] = l11;
                    return n11;
                }
            }
            return v6.this.f34040e;
        }

        @CheckForNull
        public d<E> p(int removeIndex, int vacated, E toTrickle) {
            int e11 = e(vacated, toTrickle);
            if (e11 == vacated) {
                return null;
            }
            Object l11 = e11 < removeIndex ? v6.this.l(removeIndex) : v6.this.l(m(removeIndex));
            if (this.f34047b.c(e11, toTrickle) < removeIndex) {
                return new d<>(toTrickle, l11);
            }
            return null;
        }

        public final boolean q(int i11) {
            if (l(i11) < v6.this.f34040e && d(i11, l(i11)) > 0) {
                return false;
            }
            if (n(i11) < v6.this.f34040e && d(i11, n(i11)) > 0) {
                return false;
            }
            if (i11 <= 0 || d(i11, m(i11)) <= 0) {
                return i11 <= 2 || d(k(i11), i11) <= 0;
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<E> {

        /* renamed from: a, reason: collision with root package name */
        public final E f34049a;

        /* renamed from: b, reason: collision with root package name */
        public final E f34050b;

        public d(E toTrickle, E replaced) {
            this.f34049a = toTrickle;
            this.f34050b = replaced;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Iterator<E> {

        /* renamed from: a, reason: collision with root package name */
        public int f34051a;

        /* renamed from: b, reason: collision with root package name */
        public int f34052b;

        /* renamed from: c, reason: collision with root package name */
        public int f34053c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        public Queue<E> f34054d;

        /* renamed from: e, reason: collision with root package name */
        @CheckForNull
        public List<E> f34055e;

        /* renamed from: f, reason: collision with root package name */
        @CheckForNull
        public E f34056f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f34057g;

        public e() {
            this.f34051a = -1;
            this.f34052b = -1;
            this.f34053c = v6.this.f34041f;
        }

        public final void a() {
            if (v6.this.f34041f != this.f34053c) {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean b(Iterable<E> elements, E target) {
            Iterator<E> it = elements.iterator();
            while (it.hasNext()) {
                if (it.next() == target) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void c(int c11) {
            if (this.f34052b < c11) {
                if (this.f34055e != null) {
                    while (c11 < v6.this.size() && b(this.f34055e, v6.this.l(c11))) {
                        c11++;
                    }
                }
                this.f34052b = c11;
            }
        }

        public final boolean d(Object target) {
            for (int i11 = 0; i11 < v6.this.f34040e; i11++) {
                if (v6.this.f34039d[i11] == target) {
                    v6.this.x(i11);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Queue<E> queue;
            a();
            c(this.f34051a + 1);
            return this.f34052b < v6.this.size() || !((queue = this.f34054d) == null || queue.isEmpty());
        }

        @Override // java.util.Iterator
        public E next() {
            a();
            c(this.f34051a + 1);
            if (this.f34052b < v6.this.size()) {
                int i11 = this.f34052b;
                this.f34051a = i11;
                this.f34057g = true;
                return (E) v6.this.l(i11);
            }
            if (this.f34054d != null) {
                this.f34051a = v6.this.size();
                E poll = this.f34054d.poll();
                this.f34056f = poll;
                if (poll != null) {
                    this.f34057g = true;
                    return poll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        @Override // java.util.Iterator
        public void remove() {
            x2.e(this.f34057g);
            a();
            this.f34057g = false;
            this.f34053c++;
            if (this.f34051a >= v6.this.size()) {
                E e11 = this.f34056f;
                Objects.requireNonNull(e11);
                Preconditions.checkState(d(e11));
                this.f34056f = null;
                return;
            }
            d<E> x11 = v6.this.x(this.f34051a);
            if (x11 != null) {
                if (this.f34054d == null || this.f34055e == null) {
                    this.f34054d = new ArrayDeque();
                    this.f34055e = new ArrayList(3);
                }
                if (!b(this.f34055e, x11.f34049a)) {
                    this.f34054d.add(x11.f34049a);
                }
                if (!b(this.f34054d, x11.f34050b)) {
                    this.f34055e.add(x11.f34050b);
                }
            }
            this.f34051a--;
            this.f34052b--;
        }
    }

    public static int g(int queueSize, int maximumSize) {
        return Math.min(queueSize - 1, maximumSize) + 1;
    }

    public static <E extends Comparable<E>> v6<E> j() {
        return new b(s7.z()).c();
    }

    public static <E extends Comparable<E>> v6<E> k(Iterable<? extends E> initialContents) {
        return new b(s7.z()).d(initialContents);
    }

    public static b<Comparable> m(int expectedSize) {
        return new b(s7.z()).e(expectedSize);
    }

    @go.e
    public static int r(int configuredExpectedSize, int maximumSize, Iterable<?> initialContents) {
        if (configuredExpectedSize == -1) {
            configuredExpectedSize = 11;
        }
        if (initialContents instanceof Collection) {
            configuredExpectedSize = Math.max(configuredExpectedSize, ((Collection) initialContents).size());
        }
        return g(configuredExpectedSize, maximumSize);
    }

    @go.e
    public static boolean s(int index) {
        int i11 = ~(~(index + 1));
        Preconditions.checkState(i11 > 0, "negative index");
        return (1431655765 & i11) > (i11 & f34034h);
    }

    public static b<Comparable> u(int maximumSize) {
        return new b(s7.z()).f(maximumSize);
    }

    public static <B> b<B> v(Comparator<B> comparator) {
        return new b<>(comparator);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @uo.a
    public boolean add(E element) {
        offer(element);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @uo.a
    public boolean addAll(Collection<? extends E> newElements) {
        Iterator<? extends E> it = newElements.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            offer(it.next());
            z11 = true;
        }
        return z11;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i11 = 0; i11 < this.f34040e; i11++) {
            this.f34039d[i11] = null;
        }
        this.f34040e = 0;
    }

    public Comparator<? super E> comparator() {
        return this.f34036a.f34046a;
    }

    public final int f() {
        int length = this.f34039d.length;
        return g(length < 64 ? (length + 1) * 2 : com.google.common.math.f.d(length / 2, 3), this.f34038c);
    }

    @go.e
    public int h() {
        return this.f34039d.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new e();
    }

    public E l(int i11) {
        E e11 = (E) this.f34039d[i11];
        Objects.requireNonNull(e11);
        return e11;
    }

    @CheckForNull
    public final d<E> n(int index, E toTrickle) {
        v6<E>.c q11 = q(index);
        int g11 = q11.g(index);
        int c11 = q11.c(g11, toTrickle);
        if (c11 == g11) {
            return q11.p(index, g11, toTrickle);
        }
        if (c11 < index) {
            return new d<>(toTrickle, l(index));
        }
        return null;
    }

    public final int o() {
        int i11 = this.f34040e;
        if (i11 != 1) {
            return (i11 == 2 || this.f34037b.d(1, 2) <= 0) ? 1 : 2;
        }
        return 0;
    }

    @Override // java.util.Queue
    @uo.a
    public boolean offer(E element) {
        Preconditions.checkNotNull(element);
        this.f34041f++;
        int i11 = this.f34040e;
        this.f34040e = i11 + 1;
        p();
        q(i11).b(i11, element);
        return this.f34040e <= this.f34038c || pollLast() != element;
    }

    public final void p() {
        if (this.f34040e > this.f34039d.length) {
            Object[] objArr = new Object[f()];
            Object[] objArr2 = this.f34039d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f34039d = objArr;
        }
    }

    @Override // java.util.Queue
    @CheckForNull
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return l(0);
    }

    @CheckForNull
    public E peekFirst() {
        return peek();
    }

    @CheckForNull
    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return l(o());
    }

    @Override // java.util.Queue
    @CheckForNull
    @uo.a
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return w(0);
    }

    @CheckForNull
    @uo.a
    public E pollFirst() {
        return poll();
    }

    @CheckForNull
    @uo.a
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return w(o());
    }

    public final v6<E>.c q(int i11) {
        return s(i11) ? this.f34036a : this.f34037b;
    }

    @uo.a
    public E removeFirst() {
        return remove();
    }

    @uo.a
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return w(o());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f34040e;
    }

    @go.e
    public boolean t() {
        for (int i11 = 1; i11 < this.f34040e; i11++) {
            if (!q(i11).q(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @go.d
    public Object[] toArray() {
        int i11 = this.f34040e;
        Object[] objArr = new Object[i11];
        System.arraycopy(this.f34039d, 0, objArr, 0, i11);
        return objArr;
    }

    public final E w(int index) {
        E l11 = l(index);
        x(index);
        return l11;
    }

    @CheckForNull
    @go.e
    @uo.a
    public d<E> x(int index) {
        Preconditions.checkPositionIndex(index, this.f34040e);
        this.f34041f++;
        int i11 = this.f34040e - 1;
        this.f34040e = i11;
        if (i11 == index) {
            this.f34039d[i11] = null;
            return null;
        }
        E l11 = l(i11);
        int o11 = q(this.f34040e).o(l11);
        if (o11 == index) {
            this.f34039d[this.f34040e] = null;
            return null;
        }
        E l12 = l(this.f34040e);
        this.f34039d[this.f34040e] = null;
        d<E> n11 = n(index, l12);
        return o11 < index ? n11 == null ? new d<>(l11, l12) : new d<>(l11, n11.f34050b) : n11;
    }

    public v6(b<? super E> builder, int queueSize) {
        s7 g11 = builder.g();
        v6<E>.c cVar = new c(g11);
        this.f34036a = cVar;
        v6<E>.c cVar2 = new c(g11.F());
        this.f34037b = cVar2;
        cVar.f34047b = cVar2;
        cVar2.f34047b = cVar;
        this.f34038c = builder.f34045c;
        this.f34039d = new Object[queueSize];
    }
}
