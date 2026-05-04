package com.google.common.collect;

import androidx.collection.SieveCacheKt;
import com.google.common.base.Preconditions;
import com.google.common.collect.j7;
import com.google.common.collect.k7;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class TreeMultiset<E> extends o<E> implements Serializable {

    @go.d
    @go.c
    private static final long serialVersionUID = 1;
    private final transient f<E> header;
    private final transient l5<E> range;
    private final transient g<f<E>> rootReference;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends k7.f<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f33174a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TreeMultiset f33175b;

        public a(final TreeMultiset this$0, final f val$baseEntry) {
            this.f33174a = val$baseEntry;
            this.f33175b = this$0;
        }

        @Override // com.google.common.collect.j7.a
        @t7
        public E e() {
            return (E) this.f33174a.x();
        }

        @Override // com.google.common.collect.j7.a
        public int getCount() {
            int w11 = this.f33174a.w();
            return w11 == 0 ? this.f33175b.count(e()) : w11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Iterator<j7.a<E>> {

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        public f<E> f33176a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public j7.a<E> f33177b;

        public b() {
            this.f33176a = TreeMultiset.this.firstNode();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j7.a<E> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            TreeMultiset treeMultiset = TreeMultiset.this;
            f<E> fVar = this.f33176a;
            Objects.requireNonNull(fVar);
            j7.a<E> wrapEntry = treeMultiset.wrapEntry(fVar);
            this.f33177b = wrapEntry;
            if (this.f33176a.L() == TreeMultiset.this.header) {
                this.f33176a = null;
                return wrapEntry;
            }
            this.f33176a = this.f33176a.L();
            return wrapEntry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f33176a == null) {
                return false;
            }
            if (!TreeMultiset.this.range.p(this.f33176a.x())) {
                return true;
            }
            this.f33176a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.checkState(this.f33177b != null, "no calls to next() since the last call to remove()");
            TreeMultiset.this.setCount(this.f33177b.e(), 0);
            this.f33177b = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Iterator<j7.a<E>> {

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        public f<E> f33179a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public j7.a<E> f33180b = null;

        public c() {
            this.f33179a = TreeMultiset.this.lastNode();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j7.a<E> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Objects.requireNonNull(this.f33179a);
            j7.a<E> wrapEntry = TreeMultiset.this.wrapEntry(this.f33179a);
            this.f33180b = wrapEntry;
            if (this.f33179a.z() == TreeMultiset.this.header) {
                this.f33179a = null;
                return wrapEntry;
            }
            this.f33179a = this.f33179a.z();
            return wrapEntry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f33179a == null) {
                return false;
            }
            if (!TreeMultiset.this.range.q(this.f33179a.x())) {
                return true;
            }
            this.f33179a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.checkState(this.f33180b != null, "no calls to next() since the last call to remove()");
            TreeMultiset.this.setCount(this.f33180b.e(), 0);
            this.f33180b = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33182a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f33182a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33182a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f33183a = new a("SIZE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final e f33184b = new b("DISTINCT", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ e[] f33185c = a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends e {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.collect.TreeMultiset.e
            public int b(f<?> node) {
                return node.f33187b;
            }

            @Override // com.google.common.collect.TreeMultiset.e
            public long c(@CheckForNull f<?> root) {
                if (root == null) {
                    return 0L;
                }
                return root.f33189d;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum b extends e {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.collect.TreeMultiset.e
            public int b(f<?> node) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.e
            public long c(@CheckForNull f<?> root) {
                if (root == null) {
                    return 0L;
                }
                return root.f33188c;
            }
        }

        public e(String $enum$name, int $enum$ordinal) {
        }

        public static /* synthetic */ e[] a() {
            return new e[]{f33183a, f33184b};
        }

        public static e valueOf(String name) {
            return (e) Enum.valueOf(e.class, name);
        }

        public static e[] values() {
            return (e[]) f33185c.clone();
        }

        public abstract int b(f<?> node);

        public abstract long c(@CheckForNull f<?> root);

        public /* synthetic */ e(String str, int i11, a aVar) {
            this(str, i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g<T> {

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        public T f33195a;

        public g() {
        }

        public void a(@CheckForNull T expected, @CheckForNull T newValue) {
            if (this.f33195a != expected) {
                throw new ConcurrentModificationException();
            }
            this.f33195a = newValue;
        }

        public void b() {
            this.f33195a = null;
        }

        @CheckForNull
        public T c() {
            return this.f33195a;
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    public TreeMultiset(g<f<E>> rootReference, l5<E> range, f<E> endLink) {
        super(range.b());
        this.rootReference = rootReference;
        this.range = range;
        this.header = endLink;
    }

    private long aggregateAboveRange(e aggr, @CheckForNull f<E> node) {
        long c11;
        long aggregateAboveRange;
        if (node == null) {
            return 0L;
        }
        int compare = comparator().compare(m7.a(this.range.i()), node.x());
        if (compare > 0) {
            return aggregateAboveRange(aggr, node.f33192g);
        }
        if (compare == 0) {
            int i11 = d.f33182a[this.range.h().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return aggr.c(node.f33192g);
                }
                throw new AssertionError();
            }
            c11 = aggr.b(node);
            aggregateAboveRange = aggr.c(node.f33192g);
        } else {
            c11 = aggr.c(node.f33192g) + aggr.b(node);
            aggregateAboveRange = aggregateAboveRange(aggr, node.f33191f);
        }
        return c11 + aggregateAboveRange;
    }

    private long aggregateBelowRange(e aggr, @CheckForNull f<E> node) {
        long c11;
        long aggregateBelowRange;
        if (node == null) {
            return 0L;
        }
        int compare = comparator().compare(m7.a(this.range.g()), node.x());
        if (compare < 0) {
            return aggregateBelowRange(aggr, node.f33191f);
        }
        if (compare == 0) {
            int i11 = d.f33182a[this.range.f().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return aggr.c(node.f33191f);
                }
                throw new AssertionError();
            }
            c11 = aggr.b(node);
            aggregateBelowRange = aggr.c(node.f33191f);
        } else {
            c11 = aggr.c(node.f33191f) + aggr.b(node);
            aggregateBelowRange = aggregateBelowRange(aggr, node.f33192g);
        }
        return c11 + aggregateBelowRange;
    }

    private long aggregateForEntries(e aggr) {
        f<E> c11 = this.rootReference.c();
        long c12 = aggr.c(c11);
        if (this.range.j()) {
            c12 -= aggregateBelowRange(aggr, c11);
        }
        return this.range.k() ? c12 - aggregateAboveRange(aggr, c11) : c12;
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
        return new TreeMultiset<>(s7.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public f<E> firstNode() {
        f<E> L;
        f<E> c11 = this.rootReference.c();
        if (c11 == null) {
            return null;
        }
        if (this.range.j()) {
            Object a11 = m7.a(this.range.g());
            L = c11.s(comparator(), a11);
            if (L == null) {
                return null;
            }
            if (this.range.f() == BoundType.OPEN && comparator().compare(a11, L.x()) == 0) {
                L = L.L();
            }
        } else {
            L = this.header.L();
        }
        if (L == this.header || !this.range.c(L.x())) {
            return null;
        }
        return L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public f<E> lastNode() {
        f<E> z11;
        f<E> c11 = this.rootReference.c();
        if (c11 == null) {
            return null;
        }
        if (this.range.k()) {
            Object a11 = m7.a(this.range.i());
            z11 = c11.v(comparator(), a11);
            if (z11 == null) {
                return null;
            }
            if (this.range.h() == BoundType.OPEN && comparator().compare(a11, z11.x()) == 0) {
                z11 = z11.z();
            }
        } else {
            z11 = this.header.z();
        }
        if (z11 == this.header || !this.range.c(z11.x())) {
            return null;
        }
        return z11;
    }

    @go.d
    @go.c
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        Object readObject = stream.readObject();
        Objects.requireNonNull(readObject);
        Comparator comparator = (Comparator) readObject;
        o8.a(o.class, "comparator").b(this, comparator);
        o8.a(TreeMultiset.class, "range").b(this, l5.a(comparator));
        o8.a(TreeMultiset.class, "rootReference").b(this, new g(null));
        f fVar = new f();
        o8.a(TreeMultiset.class, "header").b(this, fVar);
        successor(fVar, fVar);
        o8.f(this, stream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(f<T> a11, f<T> b11) {
        a11.f33194i = b11;
        b11.f33193h = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j7.a<E> wrapEntry(final f<E> baseEntry) {
        return new a(this, baseEntry);
    }

    @go.d
    @go.c
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(elementSet().comparator());
        o8.k(this, stream);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    @uo.a
    public int add(@t7 E element, int occurrences) {
        x2.b(occurrences, "occurrences");
        if (occurrences == 0) {
            return count(element);
        }
        Preconditions.checkArgument(this.range.c(element));
        f<E> c11 = this.rootReference.c();
        if (c11 != null) {
            int[] iArr = new int[1];
            this.rootReference.a(c11, c11.o(comparator(), element, occurrences, iArr));
            return iArr[0];
        }
        comparator().compare(element, element);
        f<E> fVar = new f<>(element, occurrences);
        f<E> fVar2 = this.header;
        successor(fVar2, fVar, fVar2);
        this.rootReference.a(c11, fVar);
        return 0;
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.range.j() || this.range.k()) {
            l6.g(entryIterator());
            return;
        }
        f<E> L = this.header.L();
        while (true) {
            f<E> fVar = this.header;
            if (L == fVar) {
                successor(fVar, fVar);
                this.rootReference.b();
                return;
            }
            f<E> L2 = L.L();
            L.f33187b = 0;
            L.f33191f = null;
            L.f33192g = null;
            L.f33193h = null;
            L.f33194i = null;
            L = L2;
        }
    }

    @Override // com.google.common.collect.o, com.google.common.collect.x8, com.google.common.collect.t8
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object element) {
        return super.contains(element);
    }

    @Override // com.google.common.collect.j7
    public int count(@CheckForNull Object element) {
        try {
            f<E> c11 = this.rootReference.c();
            if (this.range.c(element) && c11 != null) {
                return c11.t(comparator(), element);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.o
    public Iterator<j7.a<E>> descendingEntryIterator() {
        return new c();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.x8
    public /* bridge */ /* synthetic */ x8 descendingMultiset() {
        return super.descendingMultiset();
    }

    @Override // com.google.common.collect.i
    public int distinctElements() {
        return ro.i.A(aggregateForEntries(e.f33184b));
    }

    @Override // com.google.common.collect.i
    public Iterator<E> elementIterator() {
        return k7.h(entryIterator());
    }

    @Override // com.google.common.collect.o, com.google.common.collect.i, com.google.common.collect.j7
    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.i
    public Iterator<j7.a<E>> entryIterator() {
        return new b();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.x8
    @CheckForNull
    public /* bridge */ /* synthetic */ j7.a firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.x8
    public x8<E> headMultiset(@t7 E upperBound, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.l(l5.r(comparator(), upperBound, boundType)), this.header);
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.j7
    public Iterator<E> iterator() {
        return k7.n(this);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.x8
    @CheckForNull
    public /* bridge */ /* synthetic */ j7.a lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.x8
    @CheckForNull
    public /* bridge */ /* synthetic */ j7.a pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.x8
    @CheckForNull
    public /* bridge */ /* synthetic */ j7.a pollLastEntry() {
        return super.pollLastEntry();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    @uo.a
    public int remove(@CheckForNull Object element, int occurrences) {
        x2.b(occurrences, "occurrences");
        if (occurrences == 0) {
            return count(element);
        }
        f<E> c11 = this.rootReference.c();
        int[] iArr = new int[1];
        try {
            if (this.range.c(element) && c11 != null) {
                this.rootReference.a(c11, c11.E(comparator(), element, occurrences, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    @uo.a
    public int setCount(@t7 E element, int count) {
        x2.b(count, "count");
        if (!this.range.c(element)) {
            Preconditions.checkArgument(count == 0);
            return 0;
        }
        f<E> c11 = this.rootReference.c();
        if (c11 == null) {
            if (count > 0) {
                add(element, count);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.a(c11, c11.K(comparator(), element, count, iArr));
        return iArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
    public int size() {
        return ro.i.A(aggregateForEntries(e.f33183a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.o, com.google.common.collect.x8
    public /* bridge */ /* synthetic */ x8 subMultiset(@t7 Object fromElement, BoundType fromBoundType, @t7 Object toElement, BoundType toBoundType) {
        return super.subMultiset(fromElement, fromBoundType, toElement, toBoundType);
    }

    @Override // com.google.common.collect.x8
    public x8<E> tailMultiset(@t7 E lowerBound, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.l(l5.d(comparator(), lowerBound, boundType)), this.header);
    }

    public static <E> TreeMultiset<E> create(@CheckForNull Comparator<? super E> comparator) {
        return comparator == null ? new TreeMultiset<>(s7.z()) : new TreeMultiset<>(comparator);
    }

    public static int distinctElements(@CheckForNull f<?> node) {
        if (node == null) {
            return 0;
        }
        return node.f33188c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(f<T> a11, f<T> b11, f<T> c11) {
        successor(a11, b11);
        successor(b11, c11);
    }

    public static <E extends Comparable> TreeMultiset<E> create(Iterable<? extends E> elements) {
        TreeMultiset<E> create = create();
        k6.a(create, elements);
        return create;
    }

    public TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        this.range = l5.a(comparator);
        f<E> fVar = new f<>();
        this.header = fVar;
        successor(fVar, fVar);
        this.rootReference = new g<>(null);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f<E> {

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        public final E f33186a;

        /* renamed from: b, reason: collision with root package name */
        public int f33187b;

        /* renamed from: c, reason: collision with root package name */
        public int f33188c;

        /* renamed from: d, reason: collision with root package name */
        public long f33189d;

        /* renamed from: e, reason: collision with root package name */
        public int f33190e;

        /* renamed from: f, reason: collision with root package name */
        @CheckForNull
        public f<E> f33191f;

        /* renamed from: g, reason: collision with root package name */
        @CheckForNull
        public f<E> f33192g;

        /* renamed from: h, reason: collision with root package name */
        @CheckForNull
        public f<E> f33193h;

        /* renamed from: i, reason: collision with root package name */
        @CheckForNull
        public f<E> f33194i;

        public f(@t7 E elem, int elemCount) {
            Preconditions.checkArgument(elemCount > 0);
            this.f33186a = elem;
            this.f33187b = elemCount;
            this.f33189d = elemCount;
            this.f33188c = 1;
            this.f33190e = 1;
            this.f33191f = null;
            this.f33192g = null;
        }

        public static long M(@CheckForNull f<?> node) {
            if (node == null) {
                return 0L;
            }
            return node.f33189d;
        }

        public static int y(@CheckForNull f<?> node) {
            if (node == null) {
                return 0;
            }
            return node.f33190e;
        }

        public final f<E> A() {
            int r11 = r();
            if (r11 == -2) {
                Objects.requireNonNull(this.f33192g);
                if (this.f33192g.r() > 0) {
                    this.f33192g = this.f33192g.I();
                }
                return H();
            }
            if (r11 != 2) {
                C();
                return this;
            }
            Objects.requireNonNull(this.f33191f);
            if (this.f33191f.r() < 0) {
                this.f33191f = this.f33191f.H();
            }
            return I();
        }

        public final void B() {
            D();
            C();
        }

        public final void C() {
            this.f33190e = Math.max(y(this.f33191f), y(this.f33192g)) + 1;
        }

        public final void D() {
            this.f33188c = TreeMultiset.distinctElements(this.f33191f) + 1 + TreeMultiset.distinctElements(this.f33192g);
            this.f33189d = this.f33187b + M(this.f33191f) + M(this.f33192g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public f<E> E(Comparator<? super E> comparator, @t7 E e11, int count, int[] result) {
            int compare = comparator.compare(e11, x());
            if (compare < 0) {
                f<E> fVar = this.f33191f;
                if (fVar == null) {
                    result[0] = 0;
                    return this;
                }
                this.f33191f = fVar.E(comparator, e11, count, result);
                int i11 = result[0];
                if (i11 > 0) {
                    if (count >= i11) {
                        this.f33188c--;
                        this.f33189d -= i11;
                    } else {
                        this.f33189d -= count;
                    }
                }
                return i11 == 0 ? this : A();
            }
            if (compare <= 0) {
                int i12 = this.f33187b;
                result[0] = i12;
                if (count >= i12) {
                    return u();
                }
                this.f33187b = i12 - count;
                this.f33189d -= count;
                return this;
            }
            f<E> fVar2 = this.f33192g;
            if (fVar2 == null) {
                result[0] = 0;
                return this;
            }
            this.f33192g = fVar2.E(comparator, e11, count, result);
            int i13 = result[0];
            if (i13 > 0) {
                if (count >= i13) {
                    this.f33188c--;
                    this.f33189d -= i13;
                } else {
                    this.f33189d -= count;
                }
            }
            return A();
        }

        @CheckForNull
        public final f<E> F(f<E> node) {
            f<E> fVar = this.f33192g;
            if (fVar == null) {
                return this.f33191f;
            }
            this.f33192g = fVar.F(node);
            this.f33188c--;
            this.f33189d -= node.f33187b;
            return A();
        }

        @CheckForNull
        public final f<E> G(f<E> node) {
            f<E> fVar = this.f33191f;
            if (fVar == null) {
                return this.f33192g;
            }
            this.f33191f = fVar.G(node);
            this.f33188c--;
            this.f33189d -= node.f33187b;
            return A();
        }

        public final f<E> H() {
            Preconditions.checkState(this.f33192g != null);
            f<E> fVar = this.f33192g;
            this.f33192g = fVar.f33191f;
            fVar.f33191f = this;
            fVar.f33189d = this.f33189d;
            fVar.f33188c = this.f33188c;
            B();
            fVar.C();
            return fVar;
        }

        public final f<E> I() {
            Preconditions.checkState(this.f33191f != null);
            f<E> fVar = this.f33191f;
            this.f33191f = fVar.f33192g;
            fVar.f33192g = this;
            fVar.f33189d = this.f33189d;
            fVar.f33188c = this.f33188c;
            B();
            fVar.C();
            return fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public f<E> J(Comparator<? super E> comparator, @t7 E e11, int expectedCount, int newCount, int[] result) {
            int compare = comparator.compare(e11, x());
            if (compare < 0) {
                f<E> fVar = this.f33191f;
                if (fVar != null) {
                    this.f33191f = fVar.J(comparator, e11, expectedCount, newCount, result);
                    int i11 = result[0];
                    if (i11 == expectedCount) {
                        if (newCount == 0 && i11 != 0) {
                            this.f33188c--;
                        } else if (newCount > 0 && i11 == 0) {
                            this.f33188c++;
                        }
                        this.f33189d += newCount - i11;
                    }
                    return A();
                }
                result[0] = 0;
                if (expectedCount == 0 && newCount > 0) {
                    return p(e11, newCount);
                }
            } else if (compare > 0) {
                f<E> fVar2 = this.f33192g;
                if (fVar2 != null) {
                    this.f33192g = fVar2.J(comparator, e11, expectedCount, newCount, result);
                    int i12 = result[0];
                    if (i12 == expectedCount) {
                        if (newCount == 0 && i12 != 0) {
                            this.f33188c--;
                        } else if (newCount > 0 && i12 == 0) {
                            this.f33188c++;
                        }
                        this.f33189d += newCount - i12;
                    }
                    return A();
                }
                result[0] = 0;
                if (expectedCount == 0 && newCount > 0) {
                    return q(e11, newCount);
                }
            } else {
                int i13 = this.f33187b;
                result[0] = i13;
                if (expectedCount == i13) {
                    if (newCount == 0) {
                        return u();
                    }
                    this.f33189d += newCount - i13;
                    this.f33187b = newCount;
                }
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public f<E> K(Comparator<? super E> comparator, @t7 E e11, int count, int[] result) {
            int compare = comparator.compare(e11, x());
            if (compare < 0) {
                f<E> fVar = this.f33191f;
                if (fVar != null) {
                    this.f33191f = fVar.K(comparator, e11, count, result);
                    if (count == 0 && result[0] != 0) {
                        this.f33188c--;
                    } else if (count > 0 && result[0] == 0) {
                        this.f33188c++;
                    }
                    this.f33189d += count - result[0];
                    return A();
                }
                result[0] = 0;
                if (count > 0) {
                    return p(e11, count);
                }
            } else {
                if (compare <= 0) {
                    result[0] = this.f33187b;
                    if (count == 0) {
                        return u();
                    }
                    this.f33189d += count - r3;
                    this.f33187b = count;
                    return this;
                }
                f<E> fVar2 = this.f33192g;
                if (fVar2 != null) {
                    this.f33192g = fVar2.K(comparator, e11, count, result);
                    if (count == 0 && result[0] != 0) {
                        this.f33188c--;
                    } else if (count > 0 && result[0] == 0) {
                        this.f33188c++;
                    }
                    this.f33189d += count - result[0];
                    return A();
                }
                result[0] = 0;
                if (count > 0) {
                    return q(e11, count);
                }
            }
            return this;
        }

        public final f<E> L() {
            f<E> fVar = this.f33194i;
            Objects.requireNonNull(fVar);
            return fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f<E> o(Comparator<? super E> comparator, @t7 E e11, int count, int[] result) {
            int compare = comparator.compare(e11, x());
            if (compare < 0) {
                f<E> fVar = this.f33191f;
                if (fVar == null) {
                    result[0] = 0;
                    return p(e11, count);
                }
                int i11 = fVar.f33190e;
                f<E> o11 = fVar.o(comparator, e11, count, result);
                this.f33191f = o11;
                if (result[0] == 0) {
                    this.f33188c++;
                }
                this.f33189d += count;
                if (o11.f33190e != i11) {
                    return A();
                }
            } else {
                if (compare <= 0) {
                    int i12 = this.f33187b;
                    result[0] = i12;
                    long j11 = count;
                    Preconditions.checkArgument(((long) i12) + j11 <= SieveCacheKt.NodeLinkMask);
                    this.f33187b += count;
                    this.f33189d += j11;
                    return this;
                }
                f<E> fVar2 = this.f33192g;
                if (fVar2 == null) {
                    result[0] = 0;
                    return q(e11, count);
                }
                int i13 = fVar2.f33190e;
                f<E> o12 = fVar2.o(comparator, e11, count, result);
                this.f33192g = o12;
                if (result[0] == 0) {
                    this.f33188c++;
                }
                this.f33189d += count;
                if (o12.f33190e != i13) {
                    return A();
                }
            }
            return this;
        }

        public final f<E> p(@t7 E e11, int count) {
            this.f33191f = new f<>(e11, count);
            TreeMultiset.successor(z(), this.f33191f, this);
            this.f33190e = Math.max(2, this.f33190e);
            this.f33188c++;
            this.f33189d += count;
            return this;
        }

        public final f<E> q(@t7 E e11, int count) {
            f<E> fVar = new f<>(e11, count);
            this.f33192g = fVar;
            TreeMultiset.successor(this, fVar, L());
            this.f33190e = Math.max(2, this.f33190e);
            this.f33188c++;
            this.f33189d += count;
            return this;
        }

        public final int r() {
            return y(this.f33191f) - y(this.f33192g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public final f<E> s(Comparator<? super E> comparator, @t7 E e11) {
            int compare = comparator.compare(e11, x());
            if (compare < 0) {
                f<E> fVar = this.f33191f;
                if (fVar != null) {
                    return (f) ho.b0.a(fVar.s(comparator, e11), this);
                }
            } else if (compare != 0) {
                f<E> fVar2 = this.f33192g;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.s(comparator, e11);
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int t(Comparator<? super E> comparator, @t7 E e11) {
            int compare = comparator.compare(e11, x());
            if (compare < 0) {
                f<E> fVar = this.f33191f;
                if (fVar == null) {
                    return 0;
                }
                return fVar.t(comparator, e11);
            }
            if (compare <= 0) {
                return this.f33187b;
            }
            f<E> fVar2 = this.f33192g;
            if (fVar2 == null) {
                return 0;
            }
            return fVar2.t(comparator, e11);
        }

        public String toString() {
            return k7.k(x(), w()).toString();
        }

        @CheckForNull
        public final f<E> u() {
            int i11 = this.f33187b;
            this.f33187b = 0;
            TreeMultiset.successor(z(), L());
            f<E> fVar = this.f33191f;
            if (fVar == null) {
                return this.f33192g;
            }
            f<E> fVar2 = this.f33192g;
            if (fVar2 == null) {
                return fVar;
            }
            if (fVar.f33190e >= fVar2.f33190e) {
                f<E> z11 = z();
                z11.f33191f = this.f33191f.F(z11);
                z11.f33192g = this.f33192g;
                z11.f33188c = this.f33188c - 1;
                z11.f33189d = this.f33189d - i11;
                return z11.A();
            }
            f<E> L = L();
            L.f33192g = this.f33192g.G(L);
            L.f33191f = this.f33191f;
            L.f33188c = this.f33188c - 1;
            L.f33189d = this.f33189d - i11;
            return L.A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public final f<E> v(Comparator<? super E> comparator, @t7 E e11) {
            int compare = comparator.compare(e11, x());
            if (compare > 0) {
                f<E> fVar = this.f33192g;
                if (fVar != null) {
                    return (f) ho.b0.a(fVar.v(comparator, e11), this);
                }
            } else if (compare != 0) {
                f<E> fVar2 = this.f33191f;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.v(comparator, e11);
            }
            return this;
        }

        public int w() {
            return this.f33187b;
        }

        @t7
        public E x() {
            return (E) m7.a(this.f33186a);
        }

        public final f<E> z() {
            f<E> fVar = this.f33193h;
            Objects.requireNonNull(fVar);
            return fVar;
        }

        public f() {
            this.f33186a = null;
            this.f33187b = 1;
        }
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    @uo.a
    public boolean setCount(@t7 E element, int oldCount, int newCount) {
        x2.b(newCount, "newCount");
        x2.b(oldCount, "oldCount");
        Preconditions.checkArgument(this.range.c(element));
        f<E> c11 = this.rootReference.c();
        if (c11 != null) {
            int[] iArr = new int[1];
            this.rootReference.a(c11, c11.J(comparator(), element, oldCount, newCount, iArr));
            return iArr[0] == oldCount;
        }
        if (oldCount != 0) {
            return false;
        }
        if (newCount > 0) {
            add(element, newCount);
        }
        return true;
    }
}
