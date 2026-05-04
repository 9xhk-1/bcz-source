package xy;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.b0
/* loaded from: classes8.dex */
public final class t implements Set<String>, y00.h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final s<Boolean> f98649a;

    public t() {
        this.f98649a = new s<>();
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(@m80.k String element) {
        kotlin.jvm.internal.g0.p(element, "element");
        if (this.f98649a.containsKey(element)) {
            return false;
        }
        this.f98649a.put(element, Boolean.TRUE);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@m80.k Collection<? extends String> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        Iterator<? extends String> it = elements.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (add(it.next())) {
                z11 = true;
            }
        }
        return z11;
    }

    public boolean b(@m80.k String element) {
        kotlin.jvm.internal.g0.p(element, "element");
        return this.f98649a.containsKey(element);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f98649a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return b((String) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@m80.k Collection<? extends Object> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return this.f98649a.keySet().containsAll(elements);
    }

    public int d() {
        return this.f98649a.size();
    }

    public boolean f(@m80.k String element) {
        kotlin.jvm.internal.g0.p(element, "element");
        return kotlin.jvm.internal.g0.g(this.f98649a.remove(element), Boolean.TRUE);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f98649a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<String> iterator() {
        return this.f98649a.keySet().iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof String) {
            return f((String) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@m80.k Collection<? extends Object> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return this.f98649a.keySet().removeAll(a00.r0.f6(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@m80.k Collection<? extends Object> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return this.f98649a.keySet().retainAll(a00.r0.f6(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.u.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.g0.p(array, "array");
        return (T[]) kotlin.jvm.internal.u.b(this, array);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(@m80.k Iterable<String> initial) {
        this();
        kotlin.jvm.internal.g0.p(initial, "initial");
        a00.m0.s0(this, initial);
    }
}
