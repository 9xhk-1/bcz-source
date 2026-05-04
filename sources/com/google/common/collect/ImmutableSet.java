package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.j2objc.annotations.RetainedWith;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private static final int CUTOFF = 751619276;
    private static final double DESIRED_LOAD_FACTOR = 0.7d;
    static final int MAX_TABLE_SIZE = 1073741824;
    private static final long serialVersionUID = 912559;

    @RetainedWith
    @CheckForNull
    @vo.b
    private transient ImmutableList<E> asList;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<E> extends ImmutableCollection.a<E> {

        /* renamed from: e, reason: collision with root package name */
        @CheckForNull
        @go.e
        public Object[] f33076e;

        /* renamed from: f, reason: collision with root package name */
        public int f33077f;

        public a() {
            super(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.a
        @uo.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a<E> g(E element) {
            Preconditions.checkNotNull(element);
            if (this.f33076e != null && ImmutableSet.chooseTableSize(this.f32992c) <= this.f33076e.length) {
                n(element);
                return this;
            }
            this.f33076e = null;
            super.g(element);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.a, com.google.common.collect.ImmutableCollection.b
        @uo.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a<E> b(E... elements) {
            if (this.f33076e == null) {
                super.b(elements);
                return this;
            }
            for (E e11 : elements) {
                a(e11);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.a, com.google.common.collect.ImmutableCollection.b
        @uo.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a<E> c(Iterable<? extends E> elements) {
            Preconditions.checkNotNull(elements);
            if (this.f33076e == null) {
                super.c(elements);
                return this;
            }
            Iterator<? extends E> it = elements.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        @uo.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public a<E> d(Iterator<? extends E> elements) {
            Preconditions.checkNotNull(elements);
            while (elements.hasNext()) {
                a(elements.next());
            }
            return this;
        }

        public final void n(E element) {
            Objects.requireNonNull(this.f33076e);
            int length = this.f33076e.length - 1;
            int hashCode = element.hashCode();
            int c11 = o5.c(hashCode);
            while (true) {
                int i11 = c11 & length;
                Object[] objArr = this.f33076e;
                Object obj = objArr[i11];
                if (obj == null) {
                    objArr[i11] = element;
                    this.f33077f += hashCode;
                    super.g(element);
                    return;
                } else if (obj.equals(element)) {
                    return;
                } else {
                    c11 = i11 + 1;
                }
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public ImmutableSet<E> e() {
            ImmutableSet<E> construct;
            int i11 = this.f32992c;
            if (i11 == 0) {
                return ImmutableSet.of();
            }
            if (i11 == 1) {
                Object obj = this.f32991b[0];
                Objects.requireNonNull(obj);
                return ImmutableSet.of(obj);
            }
            if (this.f33076e == null || ImmutableSet.chooseTableSize(i11) != this.f33076e.length) {
                construct = ImmutableSet.construct(this.f32992c, this.f32991b);
                this.f32992c = construct.size();
            } else {
                Object[] copyOf = ImmutableSet.shouldTrim(this.f32992c, this.f32991b.length) ? Arrays.copyOf(this.f32991b, this.f32992c) : this.f32991b;
                construct = new g8<>(copyOf, this.f33077f, this.f33076e, r5.length - 1, this.f32992c);
            }
            this.f32993d = true;
            this.f33076e = null;
            return construct;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @uo.a
        public a<E> p(a<E> other) {
            if (this.f33076e == null) {
                h(other.f32991b, other.f32992c);
                return this;
            }
            for (int i11 = 0; i11 < other.f32992c; i11++) {
                Object obj = other.f32991b[i11];
                Objects.requireNonNull(obj);
                a(obj);
            }
            return this;
        }

        public a(int capacity, boolean makeHashTable) {
            super(capacity);
            if (makeHashTable) {
                this.f33076e = new Object[ImmutableSet.chooseTableSize(capacity)];
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    public static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f33078a;

        public b(Object[] elements) {
            this.f33078a = elements;
        }

        public Object readResolve() {
            return ImmutableSet.copyOf(this.f33078a);
        }
    }

    public static <E> a<E> builder() {
        return new a<>();
    }

    public static <E> a<E> builderWithExpectedSize(int expectedSize) {
        x2.b(expectedSize, "expectedSize");
        return new a<>(expectedSize, true);
    }

    @go.e
    public static int chooseTableSize(int setSize) {
        int max = Math.max(setSize, 2);
        if (max >= CUTOFF) {
            Preconditions.checkArgument(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ImmutableSet<E> construct(int n11, Object... elements) {
        if (n11 == 0) {
            return of();
        }
        if (n11 == 1) {
            Object obj = elements[0];
            Objects.requireNonNull(obj);
            return of(obj);
        }
        int chooseTableSize = chooseTableSize(n11);
        Object[] objArr = new Object[chooseTableSize];
        int i11 = chooseTableSize - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < n11; i14++) {
            Object a11 = p7.a(elements[i14], i14);
            int hashCode = a11.hashCode();
            int c11 = o5.c(hashCode);
            while (true) {
                int i15 = c11 & i11;
                Object obj2 = objArr[i15];
                if (obj2 == null) {
                    elements[i13] = a11;
                    objArr[i15] = a11;
                    i12 += hashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(a11)) {
                    break;
                }
                c11++;
            }
        }
        Arrays.fill(elements, i13, n11, (Object) null);
        if (i13 == 1) {
            Object obj3 = elements[0];
            Objects.requireNonNull(obj3);
            return new r8(obj3);
        }
        if (chooseTableSize(i13) < chooseTableSize / 2) {
            return construct(i13, elements);
        }
        if (shouldTrim(i13, elements.length)) {
            elements = Arrays.copyOf(elements, i13);
        }
        return new g8(elements, i12, objArr, i11, i13);
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> elements) {
        if ((elements instanceof ImmutableSet) && !(elements instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) elements;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array = elements.toArray();
        return construct(array.length, array);
    }

    public static <E> ImmutableSet<E> of() {
        return g8.f33521g;
    }

    @go.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldTrim(int actualUnique, int expectedUnique) {
        return actualUnique < (expectedUnique >> 1) + (expectedUnique >> 2);
    }

    @p5
    public static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        return v2.S();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> createAsList = createAsList();
        this.asList = createAsList;
        return createAsList;
    }

    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if ((object instanceof ImmutableSet) && isHashCodeFast() && ((ImmutableSet) object).isHashCodeFast() && hashCode() != object.hashCode()) {
            return false;
        }
        return q8.g(this, object);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return q8.k(this);
    }

    public boolean isHashCodeFast() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract aa<E> iterator();

    @Override // com.google.common.collect.ImmutableCollection
    @go.d
    public Object writeReplace() {
        return new b(toArray());
    }

    public static <E> ImmutableSet<E> of(E e12) {
        return new r8(e12);
    }

    public static <E> ImmutableSet<E> of(E e12, E e22) {
        return construct(2, e12, e22);
    }

    public static <E> ImmutableSet<E> of(E e12, E e22, E e32) {
        return construct(3, e12, e22, e32);
    }

    public static <E> ImmutableSet<E> of(E e12, E e22, E e32, E e42) {
        return construct(4, e12, e22, e32, e42);
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return copyOf((Collection) elements);
        }
        return copyOf(elements.iterator());
    }

    public static <E> ImmutableSet<E> of(E e12, E e22, E e32, E e42, E e52) {
        return construct(5, e12, e22, e32, e42, e52);
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> of(E e12, E e22, E e32, E e42, E e52, E e62, E... others) {
        Preconditions.checkArgument(others.length <= 2147483641, "the total number of elements must fit in an int");
        int length = others.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e12;
        objArr[1] = e22;
        objArr[2] = e32;
        objArr[3] = e42;
        objArr[4] = e52;
        objArr[5] = e62;
        System.arraycopy(others, 0, objArr, 6, others.length);
        return construct(length, objArr);
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> elements) {
        if (!elements.hasNext()) {
            return of();
        }
        E next = elements.next();
        if (!elements.hasNext()) {
            return of((Object) next);
        }
        return new a().a(next).d(elements).e();
    }

    public static <E> ImmutableSet<E> copyOf(E[] elements) {
        int length = elements.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return construct(elements.length, (Object[]) elements.clone());
        }
        return of((Object) elements[0]);
    }
}
