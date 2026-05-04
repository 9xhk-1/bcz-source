package o20;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class c implements Collection<b>, y00.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Set<b> f75591a;

    public boolean a(@k b element) {
        g0.p(element, "element");
        return this.f75591a.contains(element);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @k
    public final Set<b> b() {
        return this.f75591a;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof b) {
            return a((b) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@k Collection<? extends Object> elements) {
        g0.p(elements, "elements");
        return this.f75591a.containsAll(elements);
    }

    public int d() {
        return this.f75591a.size();
    }

    @Override // java.util.Collection
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && g0.g(this.f75591a, ((c) obj).f75591a);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f75591a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f75591a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @k
    public Iterator<b> iterator() {
        return this.f75591a.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super b> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return u.a(this);
    }

    @k
    public String toString() {
        return a.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        g0.p(array, "array");
        return (T[]) u.b(this, array);
    }
}
