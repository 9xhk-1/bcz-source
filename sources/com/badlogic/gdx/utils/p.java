package com.badlogic.gdx.utils;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface p<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<T> implements Iterable<T> {

        /* renamed from: a, reason: collision with root package name */
        public Iterable<T> f13422a;

        /* renamed from: b, reason: collision with root package name */
        public p<T> f13423b;

        /* renamed from: c, reason: collision with root package name */
        public b<T> f13424c = null;

        public a(Iterable<T> iterable, p<T> pVar) {
            a(iterable, pVar);
        }

        public void a(Iterable<T> iterable, p<T> pVar) {
            this.f13422a = iterable;
            this.f13423b = pVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            if (a3.k.f1553a) {
                return new b(this.f13422a.iterator(), this.f13423b);
            }
            b<T> bVar = this.f13424c;
            if (bVar == null) {
                this.f13424c = new b<>(this.f13422a.iterator(), this.f13423b);
            } else {
                bVar.b(this.f13422a.iterator(), this.f13423b);
            }
            return this.f13424c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public Iterator<T> f13425a;

        /* renamed from: b, reason: collision with root package name */
        public p<T> f13426b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f13427c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f13428d;

        /* renamed from: e, reason: collision with root package name */
        public T f13429e;

        public b(Iterable<T> iterable, p<T> pVar) {
            this(iterable.iterator(), pVar);
        }

        public void a(Iterable<T> iterable, p<T> pVar) {
            b(iterable.iterator(), pVar);
        }

        public void b(Iterator<T> it, p<T> pVar) {
            this.f13425a = it;
            this.f13426b = pVar;
            this.f13428d = false;
            this.f13427c = false;
            this.f13429e = null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13427c) {
                return false;
            }
            if (this.f13429e != null) {
                return true;
            }
            this.f13428d = true;
            while (this.f13425a.hasNext()) {
                T next = this.f13425a.next();
                if (this.f13426b.a(next)) {
                    this.f13429e = next;
                    return true;
                }
            }
            this.f13427c = true;
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f13429e == null && !hasNext()) {
                return null;
            }
            T t11 = this.f13429e;
            this.f13429e = null;
            this.f13428d = false;
            return t11;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f13428d) {
                throw new GdxRuntimeException("Cannot remove between a call to hasNext() and next().");
            }
            this.f13425a.remove();
        }

        public b(Iterator<T> it, p<T> pVar) {
            this.f13427c = false;
            this.f13428d = false;
            this.f13429e = null;
            b(it, pVar);
        }
    }

    boolean a(T t11);
}
