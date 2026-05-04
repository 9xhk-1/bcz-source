package xy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDelegatingMutableSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingMutableSet.kt\nio/ktor/util/DelegatingMutableSet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1557#2:60\n1628#2,3:61\n1557#2:64\n1628#2,3:65\n*S KotlinDebug\n*F\n+ 1 DelegatingMutableSet.kt\nio/ktor/util/DelegatingMutableSet\n*L\n13#1:60\n13#1:61,3\n14#1:64\n14#1:65,3\n*E\n"})
/* loaded from: classes8.dex */
public class j0<From, To> implements Set<To>, y00.h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Set<From> f98552a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<From, To> f98553b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x00.l<To, From> f98554c;

    /* renamed from: d, reason: collision with root package name */
    public final int f98555d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<To>, y00.d {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<From> f98556a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0<From, To> f98557b;

        public a(j0<From, To> j0Var) {
            this.f98557b = j0Var;
            this.f98556a = j0Var.f98552a.iterator();
        }

        public final Iterator<From> a() {
            return this.f98556a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f98556a.hasNext();
        }

        @Override // java.util.Iterator
        public To next() {
            return (To) this.f98557b.f98553b.invoke(this.f98556a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f98556a.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j0(@m80.k Set<From> delegate, @m80.k x00.l<? super From, ? extends To> convertTo, @m80.k x00.l<? super To, ? extends From> convert) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        kotlin.jvm.internal.g0.p(convertTo, "convertTo");
        kotlin.jvm.internal.g0.p(convert, "convert");
        this.f98552a = delegate;
        this.f98553b = convertTo;
        this.f98554c = convert;
        this.f98555d = delegate.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(To to2) {
        return this.f98552a.add(this.f98554c.invoke(to2));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@m80.k Collection<? extends To> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return this.f98552a.addAll(d(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f98552a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f98552a.contains(this.f98554c.invoke(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@m80.k Collection<? extends Object> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return this.f98552a.containsAll(d(elements));
    }

    @m80.k
    public Collection<From> d(@m80.k Collection<? extends To> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        Collection<? extends To> collection2 = collection;
        ArrayList arrayList = new ArrayList(a00.i0.d0(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f98554c.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(@m80.l Object obj) {
        if (obj != null && (obj instanceof Set)) {
            Collection<To> f11 = f(this.f98552a);
            if (((Set) obj).containsAll(f11) && f11.containsAll((Collection) obj)) {
                return true;
            }
        }
        return false;
    }

    @m80.k
    public Collection<To> f(@m80.k Collection<? extends From> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        Collection<? extends From> collection2 = collection;
        ArrayList arrayList = new ArrayList(a00.i0.d0(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f98553b.invoke(it.next()));
        }
        return arrayList;
    }

    public int g() {
        return this.f98555d;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f98552a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f98552a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<To> iterator() {
        return new a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f98552a.remove(this.f98554c.invoke(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@m80.k Collection<? extends Object> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return this.f98552a.removeAll(a00.r0.f6(d(elements)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@m80.k Collection<? extends Object> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return this.f98552a.retainAll(a00.r0.f6(d(elements)));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.u.a(this);
    }

    @m80.k
    public String toString() {
        return f(this.f98552a).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.g0.p(array, "array");
        return (T[]) kotlin.jvm.internal.u.b(this, array);
    }
}
