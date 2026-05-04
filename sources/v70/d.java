package v70;

import b80.e;
import java.net.ConnectException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import x70.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class d<T, C, E extends b80.e<T, C>> {

    /* renamed from: a, reason: collision with root package name */
    public final T f93225a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<E> f93226b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList<E> f93227c = new LinkedList<>();

    /* renamed from: d, reason: collision with root package name */
    public final Map<l, u60.a<E>> f93228d = new HashMap();

    public d(T t11) {
        this.f93225a = t11;
    }

    public void a(l lVar, u60.a<E> aVar) {
        this.f93228d.put(lVar, aVar);
    }

    public void b(l lVar) {
        u60.a<E> p11 = p(lVar);
        if (p11 != null) {
            p11.cancel(true);
        }
    }

    public boolean c(l lVar, E e11) {
        u60.a<E> p11 = p(lVar);
        if (p11 != null) {
            return p11.a(e11);
        }
        lVar.cancel();
        return false;
    }

    public abstract E d(T t11, C c11);

    public E e(l lVar, C c11) {
        E d11 = d(this.f93225a, c11);
        this.f93226b.add(d11);
        return d11;
    }

    public void f(l lVar, Exception exc) {
        u60.a<E> p11 = p(lVar);
        if (p11 != null) {
            p11.c(exc);
        }
    }

    public void g(E e11, boolean z11) {
        e80.a.j(e11, "Pool entry");
        e80.b.b(this.f93226b.remove(e11), "Entry %s has not been leased from this pool", e11);
        if (z11) {
            this.f93227c.addFirst(e11);
        }
    }

    public int h() {
        return this.f93227c.size() + this.f93226b.size() + this.f93228d.size();
    }

    public int i() {
        return this.f93227c.size();
    }

    public E j(Object obj) {
        if (this.f93227c.isEmpty()) {
            return null;
        }
        if (obj != null) {
            Iterator<E> it = this.f93227c.iterator();
            while (it.hasNext()) {
                E next = it.next();
                if (obj.equals(next.g())) {
                    it.remove();
                    this.f93226b.add(next);
                    return next;
                }
            }
        }
        Iterator<E> it2 = this.f93227c.iterator();
        while (it2.hasNext()) {
            E next2 = it2.next();
            if (next2.g() == null) {
                it2.remove();
                this.f93226b.add(next2);
                return next2;
            }
        }
        return null;
    }

    public E k() {
        if (this.f93227c.isEmpty()) {
            return null;
        }
        return this.f93227c.getLast();
    }

    public int l() {
        return this.f93226b.size();
    }

    public int m() {
        return this.f93228d.size();
    }

    public T n() {
        return this.f93225a;
    }

    public boolean o(E e11) {
        e80.a.j(e11, "Pool entry");
        return this.f93227c.remove(e11) || this.f93226b.remove(e11);
    }

    public final u60.a<E> p(l lVar) {
        return this.f93228d.remove(lVar);
    }

    public void q() {
        Iterator<l> it = this.f93228d.keySet().iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.f93228d.clear();
        Iterator<E> it2 = this.f93227c.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        this.f93227c.clear();
        Iterator<E> it3 = this.f93226b.iterator();
        while (it3.hasNext()) {
            it3.next().a();
        }
        this.f93226b.clear();
    }

    public void r(l lVar) {
        u60.a<E> p11 = p(lVar);
        if (p11 != null) {
            p11.c(new ConnectException("Timeout connecting to [" + lVar.l() + "]"));
        }
    }

    public String toString() {
        return "[route: " + this.f93225a + "][leased: " + this.f93226b.size() + "][available: " + this.f93227c.size() + "][pending: " + this.f93228d.size() + "]";
    }
}
