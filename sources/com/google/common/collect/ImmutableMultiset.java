package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.j7;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public abstract class ImmutableMultiset<E> extends y5<E> implements j7<E> {
    private static final long serialVersionUID = 912559;

    @CheckForNull
    @vo.b
    private transient ImmutableList<E> asList;

    @CheckForNull
    @vo.b
    private transient ImmutableSet<j7.a<E>> entrySet;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends aa<E> {

        /* renamed from: a, reason: collision with root package name */
        public int f33037a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public E f33038b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterator f33039c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ImmutableMultiset f33040d;

        public a(final ImmutableMultiset this$0, final Iterator val$entryIterator) {
            this.f33039c = val$entryIterator;
            this.f33040d = this$0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33037a > 0 || this.f33039c.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f33037a <= 0) {
                j7.a aVar = (j7.a) this.f33039c.next();
                this.f33038b = (E) aVar.e();
                this.f33037a = aVar.getCount();
            }
            this.f33037a--;
            E e11 = this.f33038b;
            Objects.requireNonNull(e11);
            return e11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<E> extends ImmutableCollection.b<E> {

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public q7<E> f33041b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f33042c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f33043d;

        public b() {
            this(4);
        }

        @CheckForNull
        public static <T> q7<T> n(Iterable<T> iterable) {
            if (iterable instanceof f8) {
                return ((f8) iterable).f33487a;
            }
            if (iterable instanceof f) {
                return ((f) iterable).backingMap;
            }
            return null;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        @uo.a
        public b<E> a(E element) {
            return k(element, 1);
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        @uo.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public b<E> b(E... elements) {
            super.b(elements);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.b
        @uo.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public b<E> c(Iterable<? extends E> elements) {
            Objects.requireNonNull(this.f33041b);
            if (!(elements instanceof j7)) {
                super.c(elements);
                return this;
            }
            j7 d11 = k7.d(elements);
            q7 n11 = n(d11);
            if (n11 != null) {
                q7<E> q7Var = this.f33041b;
                q7Var.e(Math.max(q7Var.D(), n11.D()));
                for (int f11 = n11.f(); f11 >= 0; f11 = n11.t(f11)) {
                    k(n11.j(f11), n11.l(f11));
                }
            } else {
                Set<j7.a<E>> entrySet = d11.entrySet();
                q7<E> q7Var2 = this.f33041b;
                q7Var2.e(Math.max(q7Var2.D(), entrySet.size()));
                for (j7.a<E> aVar : d11.entrySet()) {
                    k(aVar.e(), aVar.getCount());
                }
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        @uo.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public b<E> d(Iterator<? extends E> elements) {
            super.d(elements);
            return this;
        }

        @uo.a
        public b<E> k(E element, int occurrences) {
            Objects.requireNonNull(this.f33041b);
            if (occurrences == 0) {
                return this;
            }
            if (this.f33042c) {
                this.f33041b = new q7<>(this.f33041b);
                this.f33043d = false;
            }
            this.f33042c = false;
            Preconditions.checkNotNull(element);
            q7<E> q7Var = this.f33041b;
            q7Var.v(element, occurrences + q7Var.g(element));
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public ImmutableMultiset<E> e() {
            Objects.requireNonNull(this.f33041b);
            if (this.f33041b.D() == 0) {
                return ImmutableMultiset.of();
            }
            if (this.f33043d) {
                this.f33041b = new q7<>(this.f33041b);
                this.f33043d = false;
            }
            this.f33042c = true;
            return new f8(this.f33041b);
        }

        @uo.a
        public b<E> m(E e11, int i11) {
            Objects.requireNonNull(this.f33041b);
            if (i11 == 0 && !this.f33043d) {
                this.f33041b = new r7(this.f33041b);
                this.f33043d = true;
            } else if (this.f33042c) {
                this.f33041b = new q7<>(this.f33041b);
                this.f33043d = false;
            }
            this.f33042c = false;
            Preconditions.checkNotNull(e11);
            if (i11 == 0) {
                this.f33041b.w(e11);
                return this;
            }
            this.f33041b.v(Preconditions.checkNotNull(e11), i11);
            return this;
        }

        public b(int estimatedDistinct) {
            this.f33042c = false;
            this.f33043d = false;
            this.f33041b = q7.d(estimatedDistinct);
        }

        public b(boolean forSubtype) {
            this.f33042c = false;
            this.f33043d = false;
            this.f33041b = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends h6<j7.a<E>> {

        @go.d
        private static final long serialVersionUID = 0;

        public c() {
        }

        @go.d
        @go.c
        private void readObject(ObjectInputStream stream) throws InvalidObjectException {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }

        @Override // com.google.common.collect.h6
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j7.a<E> get(int index) {
            return ImmutableMultiset.this.getEntry(index);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object o11) {
            if (o11 instanceof j7.a) {
                j7.a aVar = (j7.a) o11;
                if (aVar.getCount() > 0 && ImmutableMultiset.this.count(aVar.e()) == aVar.getCount()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return ImmutableMultiset.this.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ImmutableMultiset.this.elementSet().size();
        }

        @Override // com.google.common.collect.h6, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return new d(ImmutableMultiset.this);
        }

        public /* synthetic */ c(ImmutableMultiset immutableMultiset, a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    @go.c
    public static class d<E> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableMultiset<E> f33045a;

        public d(ImmutableMultiset<E> multiset) {
            this.f33045a = multiset;
        }

        public Object readResolve() {
            return this.f33045a.entrySet();
        }
    }

    public static /* synthetic */ int a(Object obj) {
        return 1;
    }

    public static <E> b<E> builder() {
        return new b<>();
    }

    private static <E> ImmutableMultiset<E> copyFromElements(E... elements) {
        return new b().b(elements).e();
    }

    public static <E> ImmutableMultiset<E> copyFromEntries(Collection<? extends j7.a<? extends E>> entries) {
        b bVar = new b(entries.size());
        for (j7.a<? extends E> aVar : entries) {
            bVar.k(aVar.e(), aVar.getCount());
        }
        return bVar.e();
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] elements) {
        return copyFromElements(elements);
    }

    private ImmutableSet<j7.a<E>> createEntrySet() {
        return isEmpty() ? ImmutableSet.of() : new c(this, null);
    }

    public static <E> ImmutableMultiset<E> of() {
        return f8.f33486d;
    }

    @go.d
    @go.c
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @p5
    public static <E> Collector<E, ?, ImmutableMultiset<E>> toImmutableMultiset() {
        return v2.P(Function.identity(), new ToIntFunction() { // from class: com.google.common.collect.x5
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ImmutableMultiset.a(obj);
            }
        });
    }

    @Override // com.google.common.collect.j7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final int add(E element, int occurrences) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> asList = super.asList();
        this.asList = asList;
        return asList;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object object) {
        return count(object) > 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    @go.c
    public int copyIntoArray(Object[] dst, int offset) {
        aa<j7.a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            j7.a<E> next = it.next();
            Arrays.fill(dst, offset, next.getCount() + offset, next.e());
            offset += next.getCount();
        }
        return offset;
    }

    @Override // com.google.common.collect.j7
    public abstract ImmutableSet<E> elementSet();

    @Override // java.util.Collection, com.google.common.collect.j7
    public boolean equals(@CheckForNull Object object) {
        return k7.i(this, object);
    }

    public abstract j7.a<E> getEntry(int index);

    @Override // java.util.Collection, com.google.common.collect.j7
    public int hashCode() {
        return q8.k(entrySet());
    }

    @Override // com.google.common.collect.j7
    @Deprecated
    @uo.a
    @uo.e("Always throws UnsupportedOperationException")
    public final int remove(@CheckForNull Object element, int occurrences) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.j7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final int setCount(E element, int count) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.j7
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @go.d
    @go.c
    public abstract Object writeReplace();

    public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> elements) {
        if (elements instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) elements;
            if (!immutableMultiset.isPartialView()) {
                return immutableMultiset;
            }
        }
        b bVar = new b(k7.l(elements));
        bVar.c(elements);
        return bVar.e();
    }

    public static <E> ImmutableMultiset<E> of(E e12) {
        return copyFromElements(e12);
    }

    @p5
    public static <T, E> Collector<T, ?, ImmutableMultiset<E>> toImmutableMultiset(Function<? super T, ? extends E> elementFunction, ToIntFunction<? super T> countFunction) {
        return v2.P(elementFunction, countFunction);
    }

    @Override // com.google.common.collect.j7
    public ImmutableSet<j7.a<E>> entrySet() {
        ImmutableSet<j7.a<E>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<j7.a<E>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public aa<E> iterator() {
        return new a(this, entrySet().iterator());
    }

    @Override // com.google.common.collect.j7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final boolean setCount(E element, int oldCount, int newCount) {
        throw new UnsupportedOperationException();
    }

    public static <E> ImmutableMultiset<E> of(E e12, E e22) {
        return copyFromElements(e12, e22);
    }

    public static <E> ImmutableMultiset<E> of(E e12, E e22, E e32) {
        return copyFromElements(e12, e22, e32);
    }

    public static <E> ImmutableMultiset<E> of(E e12, E e22, E e32, E e42) {
        return copyFromElements(e12, e22, e32, e42);
    }

    public static <E> ImmutableMultiset<E> of(E e12, E e22, E e32, E e42, E e52) {
        return copyFromElements(e12, e22, e32, e42, e52);
    }

    public static <E> ImmutableMultiset<E> of(E e12, E e22, E e32, E e42, E e52, E e62, E... others) {
        return new b().g(e12).g(e22).g(e32).g(e42).g(e52).g(e62).b(others).e();
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> elements) {
        return new b().d(elements).e();
    }
}
