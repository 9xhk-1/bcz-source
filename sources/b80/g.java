package b80;

import b80.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class g<T, C, E extends e<T, C>> {

    /* renamed from: a, reason: collision with root package name */
    public final T f6448a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<E> f6449b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList<E> f6450c = new LinkedList<>();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedList<Future<E>> f6451d = new LinkedList<>();

    public g(T t11) {
        this.f6448a = t11;
    }

    public E a(C c11) {
        E b11 = b(c11);
        this.f6449b.add(b11);
        return b11;
    }

    public abstract E b(C c11);

    public void c(E e11, boolean z11) {
        e80.a.j(e11, "Pool entry");
        e80.b.b(this.f6449b.remove(e11), "Entry %s has not been leased from this pool", e11);
        if (z11) {
            this.f6450c.addFirst(e11);
        }
    }

    public int d() {
        return this.f6450c.size() + this.f6449b.size();
    }

    public int e() {
        return this.f6450c.size();
    }

    public E f(Object obj) {
        if (this.f6450c.isEmpty()) {
            return null;
        }
        if (obj != null) {
            Iterator<E> it = this.f6450c.iterator();
            while (it.hasNext()) {
                E next = it.next();
                if (obj.equals(next.g())) {
                    it.remove();
                    this.f6449b.add(next);
                    return next;
                }
            }
        }
        Iterator<E> it2 = this.f6450c.iterator();
        while (it2.hasNext()) {
            E next2 = it2.next();
            if (next2.g() == null) {
                it2.remove();
                this.f6449b.add(next2);
                return next2;
            }
        }
        return null;
    }

    public E g() {
        if (this.f6450c.isEmpty()) {
            return null;
        }
        return this.f6450c.getLast();
    }

    public int h() {
        return this.f6449b.size();
    }

    public int i() {
        return this.f6451d.size();
    }

    public final T j() {
        return this.f6448a;
    }

    public Future<E> k() {
        return this.f6451d.poll();
    }

    public void l(Future<E> future) {
        if (future == null) {
            return;
        }
        this.f6451d.add(future);
    }

    public boolean m(E e11) {
        e80.a.j(e11, "Pool entry");
        return this.f6450c.remove(e11) || this.f6449b.remove(e11);
    }

    public void n() {
        Iterator<Future<E>> it = this.f6451d.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
        this.f6451d.clear();
        Iterator<E> it2 = this.f6450c.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        this.f6450c.clear();
        Iterator<E> it3 = this.f6449b.iterator();
        while (it3.hasNext()) {
            it3.next().a();
        }
        this.f6449b.clear();
    }

    public void o(Future<E> future) {
        if (future == null) {
            return;
        }
        this.f6451d.remove(future);
    }

    public String toString() {
        return "[route: " + this.f6448a + "][leased: " + this.f6449b.size() + "][available: " + this.f6450c.size() + "][pending: " + this.f6451d.size() + "]";
    }
}
