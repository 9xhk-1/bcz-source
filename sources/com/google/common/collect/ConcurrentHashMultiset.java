package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.j7;
import com.google.common.collect.o8;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@u3
@go.c
/* loaded from: classes7.dex */
public final class ConcurrentHashMultiset<E> extends i<E> implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient ConcurrentMap<E, AtomicInteger> countMap;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends com.google.common.collect.c<j7.a<E>> {

        /* renamed from: c, reason: collision with root package name */
        public final Iterator<Map.Entry<E, AtomicInteger>> f32958c;

        public b() {
            this.f32958c = ConcurrentHashMultiset.this.countMap.entrySet().iterator();
        }

        @Override // com.google.common.collect.c
        @CheckForNull
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public j7.a<E> a() {
            while (this.f32958c.hasNext()) {
                Map.Entry<E, AtomicInteger> next = this.f32958c.next();
                int i11 = next.getValue().get();
                if (i11 != 0) {
                    return k7.k(next.getKey(), i11);
                }
            }
            return b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends s4<j7.a<E>> {

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        public j7.a<E> f32960a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterator f32961b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ConcurrentHashMultiset f32962c;

        public c(final ConcurrentHashMultiset this$0, final Iterator val$readOnlyIterator) {
            this.f32961b = val$readOnlyIterator;
            this.f32962c = this$0;
        }

        @Override // com.google.common.collect.s4, java.util.Iterator
        public void remove() {
            Preconditions.checkState(this.f32960a != null, "no calls to next() since the last call to remove()");
            this.f32962c.setCount(this.f32960a.e(), 0);
            this.f32960a = null;
        }

        @Override // com.google.common.collect.s4, com.google.common.collect.c5
        /* renamed from: w */
        public Iterator<j7.a<E>> delegate() {
            return this.f32961b;
        }

        @Override // com.google.common.collect.s4, java.util.Iterator
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public j7.a<E> next() {
            j7.a<E> aVar = (j7.a) super.next();
            this.f32960a = aVar;
            return aVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends i<E>.b {
        public d() {
            super();
        }

        @Override // com.google.common.collect.i.b, com.google.common.collect.k7.i
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public ConcurrentHashMultiset<E> g() {
            return ConcurrentHashMultiset.this;
        }

        public final List<j7.a<E>> j() {
            ArrayList v11 = q6.v(size());
            l6.a(v11, iterator());
            return v11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return j().toArray();
        }

        public /* synthetic */ d(ConcurrentHashMultiset concurrentHashMultiset, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) j().toArray(tArr);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final o8.b<? super ConcurrentHashMultiset<?>> f32964a = o8.a(ConcurrentHashMultiset.class, "countMap");
    }

    @go.e
    public ConcurrentHashMultiset(ConcurrentMap<E, AtomicInteger> countMap) {
        Preconditions.checkArgument(countMap.isEmpty(), "the backing map (%s) must be empty", countMap);
        this.countMap = countMap;
    }

    public static <E> ConcurrentHashMultiset<E> create() {
        return new ConcurrentHashMultiset<>(new ConcurrentHashMap());
    }

    @go.d
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        Object readObject = stream.readObject();
        Objects.requireNonNull(readObject);
        e.f32964a.b(this, (ConcurrentMap) readObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<E> snapshot() {
        ArrayList v11 = q6.v(size());
        for (j7.a aVar : entrySet()) {
            Object e11 = aVar.e();
            for (int count = aVar.getCount(); count > 0; count--) {
                v11.add(e11);
            }
        }
        return v11;
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.countMap);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    @uo.a
    public int add(E element, int occurrences) {
        AtomicInteger atomicInteger;
        int i11;
        AtomicInteger atomicInteger2;
        Preconditions.checkNotNull(element);
        if (occurrences == 0) {
            return count(element);
        }
        x2.d(occurrences, "occurrences");
        do {
            atomicInteger = (AtomicInteger) u6.p0(this.countMap, element);
            if (atomicInteger == null && (atomicInteger = this.countMap.putIfAbsent(element, new AtomicInteger(occurrences))) == null) {
                return 0;
            }
            do {
                i11 = atomicInteger.get();
                if (i11 == 0) {
                    atomicInteger2 = new AtomicInteger(occurrences);
                    if (this.countMap.putIfAbsent(element, atomicInteger2) == null) {
                        break;
                    }
                } else {
                    try {
                    } catch (ArithmeticException unused) {
                        throw new IllegalArgumentException("Overflow adding " + occurrences + " occurrences to a count of " + i11);
                    }
                }
            } while (!atomicInteger.compareAndSet(i11, com.google.common.math.f.c(i11, occurrences)));
            return i11;
        } while (!this.countMap.replace(element, atomicInteger, atomicInteger2));
        return 0;
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.countMap.clear();
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object element) {
        return super.contains(element);
    }

    @Override // com.google.common.collect.j7
    public int count(@CheckForNull Object element) {
        AtomicInteger atomicInteger = (AtomicInteger) u6.p0(this.countMap, element);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // com.google.common.collect.i
    public Set<E> createElementSet() {
        return new a(this, this.countMap.keySet());
    }

    @Override // com.google.common.collect.i
    @Deprecated
    public Set<j7.a<E>> createEntrySet() {
        return new d(this, null);
    }

    @Override // com.google.common.collect.i
    public int distinctElements() {
        return this.countMap.size();
    }

    @Override // com.google.common.collect.i
    public Iterator<E> elementIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.i
    public Iterator<j7.a<E>> entryIterator() {
        return new c(this, new b());
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.countMap.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.j7
    public Iterator<E> iterator() {
        return k7.n(this);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    @uo.a
    public int remove(@CheckForNull Object element, int occurrences) {
        int i11;
        int max;
        if (occurrences == 0) {
            return count(element);
        }
        x2.d(occurrences, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) u6.p0(this.countMap, element);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i11 = atomicInteger.get();
            if (i11 == 0) {
                return 0;
            }
            max = Math.max(0, i11 - occurrences);
        } while (!atomicInteger.compareAndSet(i11, max));
        if (max == 0) {
            this.countMap.remove(element, atomicInteger);
        }
        return i11;
    }

    @uo.a
    public boolean removeExactly(@CheckForNull Object element, int occurrences) {
        int i11;
        int i12;
        if (occurrences == 0) {
            return true;
        }
        x2.d(occurrences, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) u6.p0(this.countMap, element);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i11 = atomicInteger.get();
            if (i11 < occurrences) {
                return false;
            }
            i12 = i11 - occurrences;
        } while (!atomicInteger.compareAndSet(i11, i12));
        if (i12 == 0) {
            this.countMap.remove(element, atomicInteger);
        }
        return true;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    @uo.a
    public int setCount(E element, int count) {
        AtomicInteger atomicInteger;
        int i11;
        AtomicInteger atomicInteger2;
        Preconditions.checkNotNull(element);
        x2.b(count, "count");
        do {
            atomicInteger = (AtomicInteger) u6.p0(this.countMap, element);
            if (atomicInteger == null && (count == 0 || (atomicInteger = this.countMap.putIfAbsent(element, new AtomicInteger(count))) == null)) {
                return 0;
            }
            do {
                i11 = atomicInteger.get();
                if (i11 == 0) {
                    if (count != 0) {
                        atomicInteger2 = new AtomicInteger(count);
                        if (this.countMap.putIfAbsent(element, atomicInteger2) == null) {
                            break;
                        }
                    } else {
                        return 0;
                    }
                }
            } while (!atomicInteger.compareAndSet(i11, count));
            if (count == 0) {
                this.countMap.remove(element, atomicInteger);
            }
            return i11;
        } while (!this.countMap.replace(element, atomicInteger, atomicInteger2));
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
    public int size() {
        long j11 = 0;
        while (this.countMap.values().iterator().hasNext()) {
            j11 += r0.next().get();
        }
        return ro.i.A(j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return snapshot().toArray();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends e5<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f32956a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConcurrentHashMultiset f32957b;

        public a(final ConcurrentHashMultiset this$0, final Set val$delegate) {
            this.f32956a = val$delegate;
            this.f32957b = this$0;
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object object) {
            return object != null && y2.j(this.f32956a, object);
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object object) {
            return object != null && y2.k(this.f32956a, object);
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c11) {
            return standardRemoveAll(c11);
        }

        @Override // com.google.common.collect.e5, com.google.common.collect.l4, com.google.common.collect.c5
        public Set<E> delegate() {
            return this.f32956a;
        }
    }

    public static <E> ConcurrentHashMultiset<E> create(Iterable<? extends E> elements) {
        ConcurrentHashMultiset<E> create = create();
        k6.a(create, elements);
        return create;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) snapshot().toArray(tArr);
    }

    public static <E> ConcurrentHashMultiset<E> create(ConcurrentMap<E, AtomicInteger> countMap) {
        return new ConcurrentHashMultiset<>(countMap);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    @uo.a
    public boolean setCount(E element, int expectedOldCount, int newCount) {
        Preconditions.checkNotNull(element);
        x2.b(expectedOldCount, "oldCount");
        x2.b(newCount, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) u6.p0(this.countMap, element);
        if (atomicInteger == null) {
            if (expectedOldCount != 0) {
                return false;
            }
            return newCount == 0 || this.countMap.putIfAbsent(element, new AtomicInteger(newCount)) == null;
        }
        int i11 = atomicInteger.get();
        if (i11 == expectedOldCount) {
            if (i11 == 0) {
                if (newCount == 0) {
                    this.countMap.remove(element, atomicInteger);
                    return true;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(newCount);
                return this.countMap.putIfAbsent(element, atomicInteger2) == null || this.countMap.replace(element, atomicInteger, atomicInteger2);
            }
            if (atomicInteger.compareAndSet(i11, newCount)) {
                if (newCount == 0) {
                    this.countMap.remove(element, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }
}
