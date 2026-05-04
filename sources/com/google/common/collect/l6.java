package com.google.common.collect;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class l6 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a<T> implements Enumeration<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f33637a;

        public a(final Iterator val$iterator) {
            this.f33637a = val$iterator;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f33637a.hasNext();
        }

        @Override // java.util.Enumeration
        @t7
        public T nextElement() {
            return (T) this.f33637a.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<T> extends aa<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f33638a;

        public b(final Iterator val$iterator) {
            this.f33638a = val$iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33638a.hasNext();
        }

        @Override // java.util.Iterator
        @t7
        public T next() {
            return (T) this.f33638a.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public Iterator<T> f33639a = l6.v();

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f33640b;

        public c(final Iterable val$iterable) {
            this.f33640b = val$iterable;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33639a.hasNext() || this.f33640b.iterator().hasNext();
        }

        @Override // java.util.Iterator
        @t7
        public T next() {
            if (!this.f33639a.hasNext()) {
                Iterator<T> it = this.f33640b.iterator();
                this.f33639a = it;
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
            }
            return this.f33639a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f33639a.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d<I> extends aa<I> {

        /* renamed from: a, reason: collision with root package name */
        public int f33641a = 0;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterator[] f33642b;

        public d(final Iterator[] val$elements) {
            this.f33642b = val$elements;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TI; */
        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Iterator next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator it = this.f33642b[this.f33641a];
            Objects.requireNonNull(it);
            Iterator it2 = it;
            Iterator[] itArr = this.f33642b;
            int i11 = this.f33641a;
            itArr[i11] = null;
            this.f33641a = i11 + 1;
            return it2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33641a < this.f33642b.length;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e<T> extends aa<List<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f33643a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f33644b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f33645c;

        public e(final Iterator val$iterator, final int val$size, final boolean val$pad) {
            this.f33643a = val$iterator;
            this.f33644b = val$size;
            this.f33645c = val$pad;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = new Object[this.f33644b];
            int i11 = 0;
            while (i11 < this.f33644b && this.f33643a.hasNext()) {
                objArr[i11] = this.f33643a.next();
                i11++;
            }
            for (int i12 = i11; i12 < this.f33644b; i12++) {
                objArr[i12] = null;
            }
            List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
            return (this.f33645c || i11 == this.f33644b) ? unmodifiableList : unmodifiableList.subList(0, i11);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33643a.hasNext();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f<T> extends com.google.common.collect.c<T> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterator f33646c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ho.i0 f33647d;

        public f(final Iterator val$unfiltered, final ho.i0 val$retainIfTrue) {
            this.f33646c = val$unfiltered;
            this.f33647d = val$retainIfTrue;
        }

        @Override // com.google.common.collect.c
        @CheckForNull
        public T a() {
            while (this.f33646c.hasNext()) {
                T t11 = (T) this.f33646c.next();
                if (this.f33647d.apply(t11)) {
                    return t11;
                }
            }
            return b();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g<F, T> extends v9<F, T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ho.r f33648b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Iterator backingIterator, final ho.r val$function) {
            super(backingIterator);
            this.f33648b = val$function;
        }

        @Override // com.google.common.collect.v9
        @t7
        public T a(@t7 F f11) {
            return (T) this.f33648b.apply(f11);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f33649a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f33650b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterator f33651c;

        public h(final int val$limitSize, final Iterator val$iterator) {
            this.f33650b = val$limitSize;
            this.f33651c = val$iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33649a < this.f33650b && this.f33651c.hasNext();
        }

        @Override // java.util.Iterator
        @t7
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f33649a++;
            return (T) this.f33651c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f33651c.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i<T> extends aa<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f33652a;

        public i(final Iterator val$iterator) {
            this.f33652a = val$iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33652a.hasNext();
        }

        @Override // java.util.Iterator
        @t7
        public T next() {
            T t11 = (T) this.f33652a.next();
            this.f33652a.remove();
            return t11;
        }

        public String toString() {
            return "Iterators.consumingIterator(...)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j<T> extends aa<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Enumeration f33653a;

        public j(final Enumeration val$enumeration) {
            this.f33653a = val$enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33653a.hasMoreElements();
        }

        @Override // java.util.Iterator
        @t7
        public T next() {
            return (T) this.f33653a.nextElement();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k<T> extends com.google.common.collect.b<T> {

        /* renamed from: d, reason: collision with root package name */
        public static final ba<Object> f33654d = new k(new Object[0], 0);

        /* renamed from: c, reason: collision with root package name */
        public final T[] f33655c;

        public k(T[] array, int position) {
            super(array.length, position);
            this.f33655c = array;
        }

        @Override // com.google.common.collect.b
        @t7
        public T a(int index) {
            return this.f33655c[index];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        public Iterator<? extends T> f33656a;

        /* renamed from: b, reason: collision with root package name */
        public Iterator<? extends T> f33657b = l6.t();

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public Iterator<? extends Iterator<? extends T>> f33658c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        public Deque<Iterator<? extends Iterator<? extends T>>> f33659d;

        public l(Iterator<? extends Iterator<? extends T>> metaIterator) {
            this.f33658c = (Iterator) Preconditions.checkNotNull(metaIterator);
        }

        @CheckForNull
        public final Iterator<? extends Iterator<? extends T>> a() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f33658c;
                if (it != null && it.hasNext()) {
                    return this.f33658c;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f33659d;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f33658c = this.f33659d.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) Preconditions.checkNotNull(this.f33657b)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> a11 = a();
                this.f33658c = a11;
                if (a11 == null) {
                    return false;
                }
                Iterator<? extends T> next = a11.next();
                this.f33657b = next;
                if (next instanceof l) {
                    l lVar = (l) next;
                    this.f33657b = lVar.f33657b;
                    if (this.f33659d == null) {
                        this.f33659d = new ArrayDeque();
                    }
                    this.f33659d.addFirst(this.f33658c);
                    if (lVar.f33659d != null) {
                        while (!lVar.f33659d.isEmpty()) {
                            this.f33659d.addFirst(lVar.f33659d.removeLast());
                        }
                    }
                    this.f33658c = lVar.f33658c;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        @t7
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it = this.f33657b;
            this.f33656a = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.f33656a;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.f33656a = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum m implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            x2.e(false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class n<T> extends aa<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Queue<u7<T>> f33662a;

        public n(Iterable<? extends Iterator<? extends T>> iterators, final Comparator<? super T> itemComparator) {
            this.f33662a = new PriorityQueue(2, new Comparator() { // from class: com.google.common.collect.m6
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compare;
                    compare = itemComparator.compare(((u7) obj).peek(), ((u7) obj2).peek());
                    return compare;
                }
            });
            for (Iterator<? extends T> it : iterators) {
                if (it.hasNext()) {
                    this.f33662a.add(l6.S(it));
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f33662a.isEmpty();
        }

        @Override // java.util.Iterator
        @t7
        public T next() {
            u7<T> remove = this.f33662a.remove();
            T next = remove.next();
            if (remove.hasNext()) {
                this.f33662a.add(remove);
            }
            return next;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class o<E> implements u7<E> {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<? extends E> f33663a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f33664b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public E f33665c;

        public o(Iterator<? extends E> iterator) {
            this.f33663a = (Iterator) Preconditions.checkNotNull(iterator);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33664b || this.f33663a.hasNext();
        }

        @Override // com.google.common.collect.u7, java.util.Iterator
        @t7
        public E next() {
            if (!this.f33664b) {
                return this.f33663a.next();
            }
            E e11 = (E) m7.a(this.f33665c);
            this.f33664b = false;
            this.f33665c = null;
            return e11;
        }

        @Override // com.google.common.collect.u7
        @t7
        public E peek() {
            if (!this.f33664b) {
                this.f33665c = this.f33663a.next();
                this.f33664b = true;
            }
            return (E) m7.a(this.f33665c);
        }

        @Override // com.google.common.collect.u7, java.util.Iterator
        public void remove() {
            Preconditions.checkState(!this.f33664b, "Can't remove after you've peeked at next");
            this.f33663a.remove();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p<T> extends aa<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f33666a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f33667b;

        public p(T value) {
            this.f33666a = value;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f33667b;
        }

        @Override // java.util.Iterator
        @t7
        public T next() {
            if (this.f33667b) {
                throw new NoSuchElementException();
            }
            this.f33667b = true;
            return this.f33666a;
        }
    }

    @SafeVarargs
    public static <T> aa<T> A(T... array) {
        return B(array, 0);
    }

    public static <T> ba<T> B(T[] array, int position) {
        if (array.length != 0) {
            return new k(array, position);
        }
        Preconditions.checkPositionIndex(position, array.length);
        return u();
    }

    public static <T> aa<T> C(Enumeration<T> enumeration) {
        Preconditions.checkNotNull(enumeration);
        return new j(enumeration);
    }

    public static int D(Iterator<?> iterator, @CheckForNull Object element) {
        int i11 = 0;
        while (p(iterator, element)) {
            i11++;
        }
        return i11;
    }

    @t7
    public static <T> T E(Iterator<T> iterator, int position) {
        f(position);
        int b11 = b(iterator, position);
        if (iterator.hasNext()) {
            return iterator.next();
        }
        throw new IndexOutOfBoundsException("position (" + position + ") must be less than the number of elements that remained (" + b11 + pn.j.f81007d);
    }

    @t7
    public static <T> T F(Iterator<? extends T> it, int i11, @t7 T t11) {
        f(i11);
        b(it, i11);
        return (T) I(it, t11);
    }

    @t7
    public static <T> T G(Iterator<T> iterator) {
        T next;
        do {
            next = iterator.next();
        } while (iterator.hasNext());
        return next;
    }

    @t7
    public static <T> T H(Iterator<? extends T> it, @t7 T t11) {
        return it.hasNext() ? (T) G(it) : t11;
    }

    @t7
    public static <T> T I(Iterator<? extends T> iterator, @t7 T defaultValue) {
        return iterator.hasNext() ? iterator.next() : defaultValue;
    }

    @t7
    public static <T> T J(Iterator<T> iterator) {
        T next = iterator.next();
        if (!iterator.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i11 = 0; i11 < 4 && iterator.hasNext(); i11++) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append(iterator.next());
        }
        if (iterator.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append(u30.u0.f91710f);
        throw new IllegalArgumentException(sb2.toString());
    }

    @t7
    public static <T> T K(Iterator<? extends T> it, @t7 T t11) {
        return it.hasNext() ? (T) J(it) : t11;
    }

    public static <T> int L(Iterator<T> iterator, ho.i0<? super T> predicate) {
        Preconditions.checkNotNull(predicate, "predicate");
        int i11 = 0;
        while (iterator.hasNext()) {
            if (predicate.apply(iterator.next())) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static <T> Iterator<T> M(Iterator<T> iterator, int limitSize) {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkArgument(limitSize >= 0, "limit is negative");
        return new h(limitSize, iterator);
    }

    public static <T> aa<T> N(Iterable<? extends Iterator<? extends T>> iterators, Comparator<? super T> comparator) {
        Preconditions.checkNotNull(iterators, "iterators");
        Preconditions.checkNotNull(comparator, "comparator");
        return new n(iterators, comparator);
    }

    public static <T> aa<List<T>> O(Iterator<T> iterator, int size) {
        return Q(iterator, size, true);
    }

    public static <T> aa<List<T>> P(Iterator<T> iterator, int size) {
        return Q(iterator, size, false);
    }

    public static <T> aa<List<T>> Q(Iterator<T> iterator, int size, boolean pad) {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkArgument(size > 0);
        return new e(iterator, size, pad);
    }

    @Deprecated
    public static <T> u7<T> R(u7<T> iterator) {
        return (u7) Preconditions.checkNotNull(iterator);
    }

    public static <T> u7<T> S(Iterator<? extends T> iterator) {
        return iterator instanceof o ? (o) iterator : new o(iterator);
    }

    @CheckForNull
    public static <T> T T(Iterator<T> iterator) {
        if (!iterator.hasNext()) {
            return null;
        }
        T next = iterator.next();
        iterator.remove();
        return next;
    }

    @uo.a
    public static boolean U(Iterator<?> removeFrom, Collection<?> elementsToRemove) {
        Preconditions.checkNotNull(elementsToRemove);
        boolean z11 = false;
        while (removeFrom.hasNext()) {
            if (elementsToRemove.contains(removeFrom.next())) {
                removeFrom.remove();
                z11 = true;
            }
        }
        return z11;
    }

    @uo.a
    public static <T> boolean V(Iterator<T> removeFrom, ho.i0<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        boolean z11 = false;
        while (removeFrom.hasNext()) {
            if (predicate.apply(removeFrom.next())) {
                removeFrom.remove();
                z11 = true;
            }
        }
        return z11;
    }

    @uo.a
    public static boolean W(Iterator<?> removeFrom, Collection<?> elementsToRetain) {
        Preconditions.checkNotNull(elementsToRetain);
        boolean z11 = false;
        while (removeFrom.hasNext()) {
            if (!elementsToRetain.contains(removeFrom.next())) {
                removeFrom.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static <T> aa<T> X(@t7 T value) {
        return new p(value);
    }

    public static int Y(Iterator<?> iterator) {
        long j11 = 0;
        while (iterator.hasNext()) {
            iterator.next();
            j11++;
        }
        return ro.i.A(j11);
    }

    @go.c
    public static <T> T[] Z(Iterator<? extends T> it, Class<T> cls) {
        return (T[]) k6.Q(q6.s(it), cls);
    }

    @uo.a
    public static <T> boolean a(Collection<T> addTo, Iterator<? extends T> iterator) {
        Preconditions.checkNotNull(addTo);
        Preconditions.checkNotNull(iterator);
        boolean z11 = false;
        while (iterator.hasNext()) {
            z11 |= addTo.add(iterator.next());
        }
        return z11;
    }

    public static String a0(Iterator<?> iterator) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z11 = true;
        while (iterator.hasNext()) {
            if (!z11) {
                sb2.append(org.junit.jupiter.api.j2.O);
            }
            sb2.append(iterator.next());
            z11 = false;
        }
        sb2.append(l50.b.f69930l);
        return sb2.toString();
    }

    @uo.a
    public static int b(Iterator<?> iterator, int numberToAdvance) {
        Preconditions.checkNotNull(iterator);
        int i11 = 0;
        Preconditions.checkArgument(numberToAdvance >= 0, "numberToAdvance must be nonnegative");
        while (i11 < numberToAdvance && iterator.hasNext()) {
            iterator.next();
            i11++;
        }
        return i11;
    }

    public static <F, T> Iterator<T> b0(Iterator<F> fromIterator, ho.r<? super F, ? extends T> function) {
        Preconditions.checkNotNull(function);
        return new g(fromIterator, function);
    }

    public static <T> boolean c(Iterator<T> iterator, ho.i0<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        while (iterator.hasNext()) {
            if (!predicate.apply(iterator.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> Optional<T> c0(Iterator<T> iterator, ho.i0<? super T> predicate) {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(predicate);
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.apply(next)) {
                return Optional.of(next);
            }
        }
        return Optional.absent();
    }

    public static <T> boolean d(Iterator<T> iterator, ho.i0<? super T> predicate) {
        return L(iterator, predicate) != -1;
    }

    @Deprecated
    public static <T> aa<T> d0(aa<T> iterator) {
        return (aa) Preconditions.checkNotNull(iterator);
    }

    public static <T> Enumeration<T> e(Iterator<T> iterator) {
        Preconditions.checkNotNull(iterator);
        return new a(iterator);
    }

    public static <T> aa<T> e0(Iterator<? extends T> iterator) {
        Preconditions.checkNotNull(iterator);
        return iterator instanceof aa ? (aa) iterator : new b(iterator);
    }

    public static void f(int position) {
        if (position >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("position (" + position + ") must not be negative");
    }

    public static void g(Iterator<?> iterator) {
        Preconditions.checkNotNull(iterator);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static <T> Iterator<T> h(Iterator<? extends Iterator<? extends T>> inputs) {
        return new l(inputs);
    }

    public static <T> Iterator<T> i(Iterator<? extends T> a11, Iterator<? extends T> b11) {
        Preconditions.checkNotNull(a11);
        Preconditions.checkNotNull(b11);
        return h(n(a11, b11));
    }

    public static <T> Iterator<T> j(Iterator<? extends T> a11, Iterator<? extends T> b11, Iterator<? extends T> c11) {
        Preconditions.checkNotNull(a11);
        Preconditions.checkNotNull(b11);
        Preconditions.checkNotNull(c11);
        return h(n(a11, b11, c11));
    }

    public static <T> Iterator<T> k(Iterator<? extends T> a11, Iterator<? extends T> b11, Iterator<? extends T> c11, Iterator<? extends T> d11) {
        Preconditions.checkNotNull(a11);
        Preconditions.checkNotNull(b11);
        Preconditions.checkNotNull(c11);
        Preconditions.checkNotNull(d11);
        return h(n(a11, b11, c11, d11));
    }

    @SafeVarargs
    public static <T> Iterator<T> l(Iterator<? extends T>... inputs) {
        return m((Iterator[]) Arrays.copyOf(inputs, inputs.length));
    }

    public static <T> Iterator<T> m(Iterator<? extends T>... inputs) {
        for (Iterator it : (Iterator[]) Preconditions.checkNotNull(inputs)) {
            Preconditions.checkNotNull(it);
        }
        return h(n(inputs));
    }

    public static <I extends Iterator<?>> Iterator<I> n(I... elements) {
        return new d(elements);
    }

    public static <T> Iterator<T> o(Iterator<T> iterator) {
        Preconditions.checkNotNull(iterator);
        return new i(iterator);
    }

    public static boolean p(Iterator<?> iterator, @CheckForNull Object element) {
        if (element == null) {
            while (iterator.hasNext()) {
                if (iterator.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (iterator.hasNext()) {
            if (element.equals(iterator.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> q(Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new c(iterable);
    }

    @SafeVarargs
    public static <T> Iterator<T> r(T... elements) {
        return q(q6.t(elements));
    }

    public static boolean s(Iterator<?> iterator1, Iterator<?> iterator2) {
        while (iterator1.hasNext()) {
            if (!iterator2.hasNext() || !ho.d0.a(iterator1.next(), iterator2.next())) {
                return false;
            }
        }
        return !iterator2.hasNext();
    }

    public static <T> aa<T> t() {
        return u();
    }

    public static <T> ba<T> u() {
        return (ba<T>) k.f33654d;
    }

    public static <T> Iterator<T> v() {
        return m.INSTANCE;
    }

    public static <T> aa<T> w(Iterator<T> unfiltered, ho.i0<? super T> retainIfTrue) {
        Preconditions.checkNotNull(unfiltered);
        Preconditions.checkNotNull(retainIfTrue);
        return new f(unfiltered, retainIfTrue);
    }

    @go.c
    public static <T> aa<T> x(Iterator<?> unfiltered, Class<T> desiredType) {
        return w(unfiltered, ho.j0.o(desiredType));
    }

    @t7
    public static <T> T y(Iterator<T> iterator, ho.i0<? super T> predicate) {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(predicate);
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @CheckForNull
    public static <T> T z(Iterator<? extends T> it, ho.i0<? super T> i0Var, @CheckForNull T t11) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(i0Var);
        while (it.hasNext()) {
            T next = it.next();
            if (i0Var.apply(next)) {
                return next;
            }
        }
        return t11;
    }
}
