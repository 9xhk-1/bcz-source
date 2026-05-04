package c80;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c<E> {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList<E> f8300a = new LinkedList<>();

    /* renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, E> f8301b = new HashMap();

    public c<E> a(Collection<E> collection) {
        if (collection != null) {
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                e(it.next());
            }
        }
        return this;
    }

    public c<E> b(E... eArr) {
        if (eArr != null) {
            for (E e11 : eArr) {
                e(e11);
            }
        }
        return this;
    }

    public c<E> c(Collection<E> collection) {
        if (collection != null) {
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                f(it.next());
            }
        }
        return this;
    }

    public c<E> d(E... eArr) {
        if (eArr != null) {
            for (E e11 : eArr) {
                f(e11);
            }
        }
        return this;
    }

    public c<E> e(E e11) {
        if (e11 == null) {
            return this;
        }
        h(e11);
        this.f8300a.addFirst(e11);
        return this;
    }

    public c<E> f(E e11) {
        if (e11 == null) {
            return this;
        }
        h(e11);
        this.f8300a.addLast(e11);
        return this;
    }

    public LinkedList<E> g() {
        return new LinkedList<>(this.f8300a);
    }

    public final void h(E e11) {
        E remove = this.f8301b.remove(e11.getClass());
        if (remove != null) {
            this.f8300a.remove(remove);
        }
        this.f8301b.put(e11.getClass(), e11);
    }
}
