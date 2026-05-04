package j90;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class n<T> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public List<T> f63931a;

    /* renamed from: b, reason: collision with root package name */
    public List<n<T>> f63932b;

    public n() {
        this.f63931a = new ArrayList();
        this.f63932b = Collections.EMPTY_LIST;
    }

    public String H() {
        return "field selection: " + this.f63931a.toString();
    }

    public n<T> a(Collection<T> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
        Iterator<n<T>> it2 = this.f63932b.iterator();
        while (it2.hasNext()) {
            it2.next().a(collection);
        }
        return this;
    }

    public n<T> b(T... tArr) {
        for (T t11 : tArr) {
            c(t11);
        }
        Iterator<n<T>> it = this.f63932b.iterator();
        while (it.hasNext()) {
            it.next().b(tArr);
        }
        return this;
    }

    public final void c(T t11) {
        this.f63931a.add(t11);
    }

    @Override // j90.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public n<T> clone() {
        try {
            n<T> nVar = (n) super.clone();
            nVar.f63931a = new ArrayList(this.f63931a);
            if (this.f63932b != null) {
                nVar.f63932b = new ArrayList();
                Iterator<n<T>> it = this.f63932b.iterator();
                while (it.hasNext()) {
                    nVar.f63932b.add(it.next().clone());
                }
            }
            return nVar;
        } catch (CloneNotSupportedException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public List<T> e() {
        return new ArrayList(this.f63931a);
    }

    public n<T> f(Collection<T> collection) {
        this.f63931a.removeAll(collection);
        Iterator<n<T>> it = this.f63932b.iterator();
        while (it.hasNext()) {
            it.next().f(collection);
        }
        return this;
    }

    public n<T> g(T... tArr) {
        for (T t11 : tArr) {
            this.f63931a.remove(t11);
        }
        Iterator<n<T>> it = this.f63932b.iterator();
        while (it.hasNext()) {
            it.next().g(tArr);
        }
        return this;
    }

    public n<T> h(Collection<T> collection) {
        this.f63931a.clear();
        a(collection);
        Iterator<n<T>> it = this.f63932b.iterator();
        while (it.hasNext()) {
            it.next().h(collection);
        }
        return this;
    }

    public n<T> i(T... tArr) {
        this.f63931a.clear();
        b(tArr);
        Iterator<n<T>> it = this.f63932b.iterator();
        while (it.hasNext()) {
            it.next().i(tArr);
        }
        return this;
    }

    public String toString() {
        return this.f63931a.toString();
    }

    public n(List<n<T>> list) {
        this.f63931a = new ArrayList();
        this.f63932b = list;
        if (list.contains(this)) {
            this.f63932b.remove(this);
        }
    }
}
