package com.google.common.collect;

import com.google.common.base.Preconditions;
import ix.g;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class y2 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<E> extends AbstractCollection<E> {

        /* renamed from: a, reason: collision with root package name */
        public final Collection<E> f34089a;

        /* renamed from: b, reason: collision with root package name */
        public final ho.i0<? super E> f34090b;

        public a(Collection<E> unfiltered, ho.i0<? super E> predicate) {
            this.f34089a = unfiltered;
            this.f34090b = predicate;
        }

        public a<E> a(ho.i0<? super E> newPredicate) {
            return new a<>(this.f34089a, ho.j0.d(this.f34090b, newPredicate));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@t7 E element) {
            Preconditions.checkArgument(this.f34090b.apply(element));
            return this.f34089a.add(element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                Preconditions.checkArgument(this.f34090b.apply(it.next()));
            }
            return this.f34089a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            k6.J(this.f34089a, this.f34090b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object element) {
            if (y2.j(this.f34089a, element)) {
                return this.f34090b.apply(element);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return y2.b(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !k6.c(this.f34089a, this.f34090b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return l6.w(this.f34089a.iterator(), this.f34090b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object element) {
            return contains(element) && this.f34089a.remove(element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(final Collection<?> collection) {
            Iterator<E> it = this.f34089a.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f34090b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(final Collection<?> collection) {
            Iterator<E> it = this.f34089a.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f34090b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f34089a.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                if (this.f34090b.apply(it.next())) {
                    i11++;
                }
            }
            return i11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return q6.s(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) q6.s(iterator()).toArray(tArr);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<E> extends AbstractCollection<List<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableList<E> f34091a;

        /* renamed from: b, reason: collision with root package name */
        public final Comparator<? super E> f34092b;

        /* renamed from: c, reason: collision with root package name */
        public final int f34093c;

        public b(Iterable<E> input, Comparator<? super E> comparator) {
            ImmutableList<E> sortedCopyOf = ImmutableList.sortedCopyOf(comparator, input);
            this.f34091a = sortedCopyOf;
            this.f34092b = comparator;
            this.f34093c = a(sortedCopyOf, comparator);
        }

        public static <E> int a(List<E> sortedInputList, Comparator<? super E> comparator) {
            int i11 = 1;
            int i12 = 1;
            int i13 = 1;
            while (i11 < sortedInputList.size()) {
                if (comparator.compare(sortedInputList.get(i11 - 1), sortedInputList.get(i11)) < 0) {
                    i12 = com.google.common.math.f.u(i12, com.google.common.math.f.a(i11, i13));
                    if (i12 == Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    i13 = 0;
                }
                i11++;
                i13++;
            }
            return com.google.common.math.f.u(i12, com.google.common.math.f.a(i11, i13));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return y2.e(this.f34091a, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new c(this.f34091a, this.f34092b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f34093c;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "orderedPermutationCollection(" + this.f34091a + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<E> extends com.google.common.collect.c<List<E>> {

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public List<E> f34094c;

        /* renamed from: d, reason: collision with root package name */
        public final Comparator<? super E> f34095d;

        public c(List<E> list, Comparator<? super E> comparator) {
            this.f34094c = q6.r(list);
            this.f34095d = comparator;
        }

        public void d() {
            int f11 = f();
            if (f11 == -1) {
                this.f34094c = null;
                return;
            }
            Objects.requireNonNull(this.f34094c);
            Collections.swap(this.f34094c, f11, g(f11));
            Collections.reverse(this.f34094c.subList(f11 + 1, this.f34094c.size()));
        }

        @Override // com.google.common.collect.c
        @CheckForNull
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<E> a() {
            List<E> list = this.f34094c;
            if (list == null) {
                return b();
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
            d();
            return copyOf;
        }

        public int f() {
            Objects.requireNonNull(this.f34094c);
            for (int size = this.f34094c.size() - 2; size >= 0; size--) {
                if (this.f34095d.compare(this.f34094c.get(size), this.f34094c.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        public int g(int i11) {
            Objects.requireNonNull(this.f34094c);
            E e11 = this.f34094c.get(i11);
            for (int size = this.f34094c.size() - 1; size > i11; size--) {
                if (this.f34095d.compare(e11, this.f34094c.get(size)) < 0) {
                    return size;
                }
            }
            throw new AssertionError("this statement should be unreachable");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<E> extends AbstractCollection<List<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableList<E> f34096a;

        public d(ImmutableList<E> input) {
            this.f34096a = input;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return y2.e(this.f34096a, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new e(this.f34096a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return com.google.common.math.f.h(this.f34096a.size());
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "permutations(" + this.f34096a + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e<E> extends com.google.common.collect.c<List<E>> {

        /* renamed from: c, reason: collision with root package name */
        public final List<E> f34097c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f34098d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f34099e;

        /* renamed from: f, reason: collision with root package name */
        public int f34100f;

        public e(List<E> list) {
            this.f34097c = new ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.f34098d = iArr;
            int[] iArr2 = new int[size];
            this.f34099e = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 1);
            this.f34100f = Integer.MAX_VALUE;
        }

        public void d() {
            int size = this.f34097c.size() - 1;
            this.f34100f = size;
            if (size == -1) {
                return;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f34098d;
                int i12 = this.f34100f;
                int i13 = iArr[i12];
                int i14 = this.f34099e[i12] + i13;
                if (i14 < 0) {
                    f();
                } else if (i14 != i12 + 1) {
                    Collections.swap(this.f34097c, (i12 - i13) + i11, (i12 - i14) + i11);
                    this.f34098d[this.f34100f] = i14;
                    return;
                } else {
                    if (i12 == 0) {
                        return;
                    }
                    i11++;
                    f();
                }
            }
        }

        @Override // com.google.common.collect.c
        @CheckForNull
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<E> a() {
            if (this.f34100f <= 0) {
                return b();
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) this.f34097c);
            d();
            return copyOf;
        }

        public void f() {
            int[] iArr = this.f34099e;
            int i11 = this.f34100f;
            iArr[i11] = -iArr[i11];
            this.f34100f = i11 - 1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f<F, T> extends AbstractCollection<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Collection<F> f34101a;

        /* renamed from: b, reason: collision with root package name */
        public final ho.r<? super F, ? extends T> f34102b;

        public f(Collection<F> fromCollection, ho.r<? super F, ? extends T> function) {
            this.f34101a = (Collection) Preconditions.checkNotNull(fromCollection);
            this.f34102b = (ho.r) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f34101a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f34101a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return l6.b0(this.f34101a.iterator(), this.f34102b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f34101a.size();
        }
    }

    public static boolean b(Collection<?> self, Collection<?> c11) {
        Iterator<?> it = c11.iterator();
        while (it.hasNext()) {
            if (!self.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <E> q7<E> c(Collection<E> collection) {
        q7<E> q7Var = new q7<>();
        for (E e11 : collection) {
            q7Var.v(e11, q7Var.g(e11) + 1);
        }
        return q7Var;
    }

    public static <E> Collection<E> d(Collection<E> unfiltered, ho.i0<? super E> predicate) {
        return unfiltered instanceof a ? ((a) unfiltered).a(predicate) : new a((Collection) Preconditions.checkNotNull(unfiltered), (ho.i0) Preconditions.checkNotNull(predicate));
    }

    public static boolean e(List<?> first, List<?> second) {
        if (first.size() != second.size()) {
            return false;
        }
        q7 c11 = c(first);
        q7 c12 = c(second);
        if (first.size() != second.size()) {
            return false;
        }
        for (int i11 = 0; i11 < first.size(); i11++) {
            if (c11.l(i11) != c12.g(c11.j(i11))) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder f(int size) {
        x2.b(size, g.b.f62794h);
        return new StringBuilder((int) Math.min(size * 8, 1073741824L));
    }

    public static <E extends Comparable<? super E>> Collection<List<E>> g(Iterable<E> elements) {
        return h(elements, s7.z());
    }

    public static <E> Collection<List<E>> h(Iterable<E> elements, Comparator<? super E> comparator) {
        return new b(elements, comparator);
    }

    public static <E> Collection<List<E>> i(Collection<E> elements) {
        return new d(ImmutableList.copyOf((Collection) elements));
    }

    public static boolean j(Collection<?> collection, @CheckForNull Object object) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.contains(object);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean k(Collection<?> collection, @CheckForNull Object object) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.remove(object);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static String l(final Collection<?> collection) {
        StringBuilder f11 = f(collection.size());
        f11.append('[');
        boolean z11 = true;
        for (Object obj : collection) {
            if (!z11) {
                f11.append(org.junit.jupiter.api.j2.O);
            }
            if (obj == collection) {
                f11.append("(this Collection)");
            } else {
                f11.append(obj);
            }
            z11 = false;
        }
        f11.append(l50.b.f69930l);
        return f11.toString();
    }

    public static <F, T> Collection<T> m(Collection<F> fromCollection, ho.r<? super F, T> function) {
        return new f(fromCollection, function);
    }
}
