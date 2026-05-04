package com.google.common.collect;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class k6 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a<T> extends i4<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f33568b;

        public a(final Iterable val$iterable) {
            this.f33568b = val$iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return l6.q(this.f33568b);
        }

        @Override // com.google.common.collect.i4
        public String toString() {
            return this.f33568b.toString() + " (cycled)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<T> extends i4<List<T>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f33569b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f33570c;

        public b(final Iterable val$iterable, final int val$size) {
            this.f33569b = val$iterable;
            this.f33570c = val$size;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return l6.P(this.f33569b.iterator(), this.f33570c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c<T> extends i4<List<T>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f33571b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f33572c;

        public c(final Iterable val$iterable, final int val$size) {
            this.f33571b = val$iterable;
            this.f33572c = val$size;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return l6.O(this.f33571b.iterator(), this.f33572c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d<T> extends i4<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f33573b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ho.i0 f33574c;

        public d(final Iterable val$unfiltered, final ho.i0 val$retainIfTrue) {
            this.f33573b = val$unfiltered;
            this.f33574c = val$retainIfTrue;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return l6.w(this.f33573b.iterator(), this.f33574c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e<T> extends i4<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f33575b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ho.r f33576c;

        public e(final Iterable val$fromIterable, final ho.r val$function) {
            this.f33575b = val$fromIterable;
            this.f33576c = val$function;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return l6.b0(this.f33575b.iterator(), this.f33576c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f<T> extends i4<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f33577b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f33578c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Iterator<T> {

            /* renamed from: a, reason: collision with root package name */
            public boolean f33579a = true;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator f33580b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f33581c;

            public a(final f this$0, final Iterator val$iterator) {
                this.f33580b = val$iterator;
                this.f33581c = this$0;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f33580b.hasNext();
            }

            @Override // java.util.Iterator
            @t7
            public T next() {
                T t11 = (T) this.f33580b.next();
                this.f33579a = false;
                return t11;
            }

            @Override // java.util.Iterator
            public void remove() {
                x2.e(!this.f33579a);
                this.f33580b.remove();
            }
        }

        public f(final Iterable val$iterable, final int val$numberToSkip) {
            this.f33577b = val$iterable;
            this.f33578c = val$numberToSkip;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f33577b;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.f33578c), list.size()).iterator();
            }
            Iterator<T> it = iterable.iterator();
            l6.b(it, this.f33578c);
            return new a(this, it);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g<T> extends i4<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f33582b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f33583c;

        public g(final Iterable val$iterable, final int val$limitSize) {
            this.f33582b = val$iterable;
            this.f33583c = val$limitSize;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return l6.M(this.f33582b.iterator(), this.f33583c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h<T> extends i4<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f33584b;

        public h(final Iterable val$iterable) {
            this.f33584b = val$iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f33584b;
            return iterable instanceof Queue ? new m3((Queue) iterable) : l6.o(iterable.iterator());
        }

        @Override // com.google.common.collect.i4
        public String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i<T> extends i4<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f33585b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Comparator f33586c;

        public i(final Iterable val$iterables, final Comparator val$comparator) {
            this.f33585b = val$iterables;
            this.f33586c = val$comparator;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return l6.N(k6.T(this.f33585b, new j4()), this.f33586c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j<T> extends i4<T> {

        /* renamed from: b, reason: collision with root package name */
        public final Iterable<? extends T> f33587b;

        public /* synthetic */ j(Iterable iterable, a aVar) {
            this(iterable);
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return l6.e0(this.f33587b.iterator());
        }

        @Override // com.google.common.collect.i4
        public String toString() {
            return this.f33587b.toString();
        }

        public j(Iterable<? extends T> iterable) {
            this.f33587b = iterable;
        }
    }

    @t7
    public static <T> T A(Iterable<? extends T> iterable, @t7 T t11) {
        return (T) l6.K(iterable.iterator(), t11);
    }

    public static <T> int B(Iterable<T> iterable, ho.i0<? super T> predicate) {
        return l6.L(iterable.iterator(), predicate);
    }

    public static boolean C(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static <T> Iterable<T> D(final Iterable<T> iterable, final int limitSize) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(limitSize >= 0, "limit is negative");
        return new g(iterable, limitSize);
    }

    public static <T> Iterable<T> E(final Iterable<? extends Iterable<? extends T>> iterables, final Comparator<? super T> comparator) {
        Preconditions.checkNotNull(iterables, "iterables");
        Preconditions.checkNotNull(comparator, "comparator");
        return new j(new i(iterables, comparator), null);
    }

    public static <T> Iterable<List<T>> F(final Iterable<T> iterable, final int size) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(size > 0);
        return new c(iterable, size);
    }

    public static <T> Iterable<List<T>> G(final Iterable<T> iterable, final int size) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(size > 0);
        return new b(iterable, size);
    }

    @uo.a
    public static boolean H(Iterable<?> removeFrom, Collection<?> elementsToRemove) {
        return removeFrom instanceof Collection ? ((Collection) removeFrom).removeAll((Collection) Preconditions.checkNotNull(elementsToRemove)) : l6.U(removeFrom.iterator(), elementsToRemove);
    }

    @CheckForNull
    public static <T> T I(Iterable<T> removeFrom, ho.i0<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        Iterator<T> it = removeFrom.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    @uo.a
    public static <T> boolean J(Iterable<T> removeFrom, ho.i0<? super T> predicate) {
        return ((removeFrom instanceof RandomAccess) && (removeFrom instanceof List)) ? K((List) removeFrom, (ho.i0) Preconditions.checkNotNull(predicate)) : l6.V(removeFrom.iterator(), predicate);
    }

    public static <T> boolean K(List<T> list, ho.i0<? super T> predicate) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < list.size()) {
            T t11 = list.get(i11);
            if (!predicate.apply(t11)) {
                if (i11 > i12) {
                    try {
                        list.set(i12, t11);
                    } catch (IllegalArgumentException unused) {
                        O(list, predicate, i12, i11);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        O(list, predicate, i12, i11);
                        return true;
                    }
                }
                i12++;
            }
            i11++;
        }
        list.subList(i12, list.size()).clear();
        return i11 != i12;
    }

    @uo.a
    public static boolean L(Iterable<?> removeFrom, Collection<?> elementsToRetain) {
        return removeFrom instanceof Collection ? ((Collection) removeFrom).retainAll((Collection) Preconditions.checkNotNull(elementsToRetain)) : l6.W(removeFrom.iterator(), elementsToRetain);
    }

    public static int M(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : l6.Y(iterable.iterator());
    }

    public static <T> Iterable<T> N(final Iterable<T> iterable, final int numberToSkip) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(numberToSkip >= 0, "number to skip cannot be negative");
        return new f(iterable, numberToSkip);
    }

    public static <T> void O(List<T> list, ho.i0<? super T> predicate, int to2, int from) {
        for (int size = list.size() - 1; size > from; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i11 = from - 1; i11 >= to2; i11--) {
            list.remove(i11);
        }
    }

    public static Object[] P(Iterable<?> iterable) {
        return d(iterable).toArray();
    }

    @go.c
    public static <T> T[] Q(Iterable<? extends T> iterable, Class<T> cls) {
        return (T[]) R(iterable, p7.i(cls, 0));
    }

    public static <T> T[] R(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) d(iterable).toArray(tArr);
    }

    public static String S(Iterable<?> iterable) {
        return l6.a0(iterable.iterator());
    }

    public static <F, T> Iterable<T> T(final Iterable<F> fromIterable, final ho.r<? super F, ? extends T> function) {
        Preconditions.checkNotNull(fromIterable);
        Preconditions.checkNotNull(function);
        return new e(fromIterable, function);
    }

    public static <T> Optional<T> U(Iterable<T> iterable, ho.i0<? super T> predicate) {
        return l6.c0(iterable.iterator(), predicate);
    }

    @Deprecated
    public static <E> Iterable<E> V(ImmutableCollection<E> iterable) {
        return (Iterable) Preconditions.checkNotNull(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Iterable<T> W(final Iterable<? extends T> iterable) {
        Preconditions.checkNotNull(iterable);
        return !(iterable instanceof j) ? iterable instanceof ImmutableCollection ? iterable : new j(iterable, null) : iterable;
    }

    @uo.a
    public static <T> boolean a(Collection<T> addTo, Iterable<? extends T> elementsToAdd) {
        return elementsToAdd instanceof Collection ? addTo.addAll((Collection) elementsToAdd) : l6.a(addTo, ((Iterable) Preconditions.checkNotNull(elementsToAdd)).iterator());
    }

    public static <T> boolean b(Iterable<T> iterable, ho.i0<? super T> predicate) {
        return l6.c(iterable.iterator(), predicate);
    }

    public static <T> boolean c(Iterable<T> iterable, ho.i0<? super T> predicate) {
        return l6.d(iterable.iterator(), predicate);
    }

    public static <E> Collection<E> d(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : q6.s(iterable.iterator());
    }

    public static <T> Iterable<T> e(Iterable<? extends Iterable<? extends T>> inputs) {
        return i4.g(inputs);
    }

    public static <T> Iterable<T> f(Iterable<? extends T> a11, Iterable<? extends T> b11) {
        return i4.h(a11, b11);
    }

    public static <T> Iterable<T> g(Iterable<? extends T> a11, Iterable<? extends T> b11, Iterable<? extends T> c11) {
        return i4.j(a11, b11, c11);
    }

    public static <T> Iterable<T> h(Iterable<? extends T> a11, Iterable<? extends T> b11, Iterable<? extends T> c11, Iterable<? extends T> d11) {
        return i4.k(a11, b11, c11, d11);
    }

    @SafeVarargs
    public static <T> Iterable<T> i(Iterable<? extends T>... inputs) {
        return i4.l(inputs);
    }

    public static <T> Iterable<T> j(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new h(iterable);
    }

    public static boolean k(Iterable<? extends Object> iterable, @CheckForNull Object element) {
        return iterable instanceof Collection ? y2.j((Collection) iterable, element) : l6.p(iterable.iterator(), element);
    }

    public static <T> Iterable<T> l(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new a(iterable);
    }

    @SafeVarargs
    public static <T> Iterable<T> m(T... elements) {
        return l(q6.t(elements));
    }

    public static boolean n(Iterable<?> iterable1, Iterable<?> iterable2) {
        if ((iterable1 instanceof Collection) && (iterable2 instanceof Collection) && ((Collection) iterable1).size() != ((Collection) iterable2).size()) {
            return false;
        }
        return l6.s(iterable1.iterator(), iterable2.iterator());
    }

    public static <T> Iterable<T> o(final Iterable<T> unfiltered, final ho.i0<? super T> retainIfTrue) {
        Preconditions.checkNotNull(unfiltered);
        Preconditions.checkNotNull(retainIfTrue);
        return new d(unfiltered, retainIfTrue);
    }

    @go.c
    public static <T> Iterable<T> p(final Iterable<?> unfiltered, final Class<T> desiredType) {
        Preconditions.checkNotNull(unfiltered);
        Preconditions.checkNotNull(desiredType);
        return o(unfiltered, ho.j0.o(desiredType));
    }

    @t7
    public static <T> T q(Iterable<T> iterable, ho.i0<? super T> i0Var) {
        return (T) l6.y(iterable.iterator(), i0Var);
    }

    @CheckForNull
    public static <T> T r(Iterable<? extends T> iterable, ho.i0<? super T> i0Var, @CheckForNull T t11) {
        return (T) l6.z(iterable.iterator(), i0Var, t11);
    }

    public static int s(Iterable<?> iterable, @CheckForNull Object obj) {
        return iterable instanceof j7 ? ((j7) iterable).count(obj) : iterable instanceof Set ? ((Set) iterable).contains(obj) ? 1 : 0 : l6.D(iterable.iterator(), obj);
    }

    @t7
    public static <T> T t(Iterable<T> iterable, int i11) {
        Preconditions.checkNotNull(iterable);
        return iterable instanceof List ? (T) ((List) iterable).get(i11) : (T) l6.E(iterable.iterator(), i11);
    }

    @t7
    public static <T> T u(Iterable<? extends T> iterable, int i11, @t7 T t11) {
        Preconditions.checkNotNull(iterable);
        l6.f(i11);
        if (iterable instanceof List) {
            List f11 = q6.f(iterable);
            return i11 < f11.size() ? (T) f11.get(i11) : t11;
        }
        Iterator<? extends T> it = iterable.iterator();
        l6.b(it, i11);
        return (T) l6.I(it, t11);
    }

    @t7
    public static <T> T v(Iterable<? extends T> iterable, @t7 T t11) {
        return (T) l6.I(iterable.iterator(), t11);
    }

    @t7
    public static <T> T w(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) l6.G(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) y(list);
    }

    @t7
    public static <T> T x(Iterable<? extends T> iterable, @t7 T t11) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t11;
            }
            if (iterable instanceof List) {
                return (T) y(q6.f(iterable));
            }
        }
        return (T) l6.H(iterable.iterator(), t11);
    }

    @t7
    public static <T> T y(List<T> list) {
        return list.get(list.size() - 1);
    }

    @t7
    public static <T> T z(Iterable<T> iterable) {
        return (T) l6.J(iterable.iterator());
    }
}
