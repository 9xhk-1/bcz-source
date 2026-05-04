package a00;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,527:1\n1740#2,3:528\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n*L\n65#1:528,3\n*E\n"})
/* loaded from: classes8.dex */
public final class l<T> implements Collection<T>, y00.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final T[] f1110a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1111b;

    public l(@m80.k T[] values, boolean z11) {
        kotlin.jvm.internal.g0.p(values, "values");
        this.f1110a = values;
        this.f1111b = z11;
    }

    public int a() {
        return this.f1110a.length;
    }

    @Override // java.util.Collection
    public boolean add(T t11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @m80.k
    public final T[] b() {
        return this.f1110a;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return a0.B8(this.f1110a, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@m80.k Collection<?> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        Collection<?> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean d() {
        return this.f1111b;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f1110a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<T> iterator() {
        return kotlin.jvm.internal.h.a(this.f1110a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.g0.p(array, "array");
        return (T[]) kotlin.jvm.internal.u.b(this, array);
    }

    @Override // java.util.Collection
    @m80.k
    public final Object[] toArray() {
        return g0.i(this.f1110a, this.f1111b);
    }
}
