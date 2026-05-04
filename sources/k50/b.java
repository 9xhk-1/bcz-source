package k50;

import a00.r0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0(with = d.class)
/* loaded from: classes8.dex */
public final class b extends k implements List<k>, y00.a {

    @m80.k
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<k> f65907a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public a() {
        }

        @m80.k
        public final f50.i<b> serializer() {
            return d.f65914a;
        }

        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(@m80.k List<? extends k> content) {
        super(null);
        kotlin.jvm.internal.g0.p(content, "content");
        this.f65907a = content;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i11, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection<? extends k> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void b(int i11, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof k) {
            return g((k) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@m80.k Collection<?> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return this.f65907a.containsAll(elements);
    }

    public boolean d(k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@m80.l Object obj) {
        return kotlin.jvm.internal.g0.g(this.f65907a, obj);
    }

    public boolean g(@m80.k k element) {
        kotlin.jvm.internal.g0.p(element, "element");
        return this.f65907a.contains(element);
    }

    @Override // java.util.List
    @m80.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public k get(int i11) {
        return this.f65907a.get(i11);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f65907a.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof k) {
            return k((k) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f65907a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<k> iterator() {
        return this.f65907a.iterator();
    }

    public int j() {
        return this.f65907a.size();
    }

    public int k(@m80.k k element) {
        kotlin.jvm.internal.g0.p(element, "element");
        return this.f65907a.indexOf(element);
    }

    public int l(@m80.k k element) {
        kotlin.jvm.internal.g0.p(element, "element");
        return this.f65907a.lastIndexOf(element);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof k) {
            return l((k) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @m80.k
    public ListIterator<k> listIterator() {
        return this.f65907a.listIterator();
    }

    public k m(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public k n(int i11, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ k remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<k> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ k set(int i11, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return j();
    }

    @Override // java.util.List
    public void sort(Comparator<? super k> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @m80.k
    public List<k> subList(int i11, int i12) {
        return this.f65907a.subList(i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.u.a(this);
    }

    @m80.k
    public String toString() {
        return r0.r3(this.f65907a, ",", "[", "]", 0, null, null, 56, null);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends k> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @m80.k
    public ListIterator<k> listIterator(int i11) {
        return this.f65907a.listIterator(i11);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.g0.p(array, "array");
        return (T[]) kotlin.jvm.internal.u.b(this, array);
    }
}
