package y;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g<E> implements Collection<E>, y00.b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public Collection<E> f98781a;

    public g(@l Collection<E> collection) {
        this.f98781a = collection;
    }

    public final Collection<E> a() {
        Collection<E> collection = this.f98781a;
        g0.m(collection);
        return collection;
    }

    @Override // java.util.Collection
    public boolean add(E e11) {
        return a().add(e11);
    }

    @Override // java.util.Collection
    public boolean addAll(@k Collection<? extends E> elements) {
        g0.p(elements, "elements");
        return a().addAll(elements);
    }

    public int b() {
        return a().size();
    }

    @Override // java.util.Collection
    public void clear() {
        a().clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return a().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@k Collection<? extends Object> elements) {
        g0.p(elements, "elements");
        return a().containsAll(elements);
    }

    @l
    public final Collection<E> d() {
        return this.f98781a;
    }

    public final void f(@l Collection<E> collection) {
        this.f98781a = collection;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @k
    public Iterator<E> iterator() {
        return a().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return a().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(@k Collection<? extends Object> elements) {
        g0.p(elements, "elements");
        return a().removeAll(elements);
    }

    @Override // java.util.Collection
    public boolean retainAll(@k Collection<? extends Object> elements) {
        g0.p(elements, "elements");
        return a().retainAll(elements);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return u.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        g0.p(array, "array");
        return (T[]) u.b(this, array);
    }
}
