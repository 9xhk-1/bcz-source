package a3;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class w0<E> implements Iterable<b<E>> {

    /* renamed from: b, reason: collision with root package name */
    public transient w0<E>.a f1671b;

    /* renamed from: d, reason: collision with root package name */
    public b<E> f1673d;

    /* renamed from: a, reason: collision with root package name */
    public c<E> f1670a = new c<>();

    /* renamed from: c, reason: collision with root package name */
    public int f1672c = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Iterator<b<E>> {

        /* renamed from: a, reason: collision with root package name */
        public b<E> f1674a;

        /* renamed from: b, reason: collision with root package name */
        public b<E> f1675b;

        public a() {
            b();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b<E> next() {
            b<E> bVar = this.f1674a;
            this.f1675b = bVar;
            this.f1674a = bVar.f1678b;
            return bVar;
        }

        public w0<E>.a b() {
            this.f1674a = w0.this.f1673d;
            this.f1675b = null;
            return this;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1674a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            b<E> bVar = this.f1675b;
            if (bVar != null) {
                w0 w0Var = w0.this;
                if (bVar == w0Var.f1673d) {
                    w0Var.f1673d = this.f1674a;
                } else {
                    b<E> bVar2 = bVar.f1677a;
                    b<E> bVar3 = this.f1674a;
                    bVar2.f1678b = bVar3;
                    if (bVar3 != null) {
                        bVar3.f1677a = bVar2;
                    }
                }
                w0Var.f1672c--;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<E> {

        /* renamed from: a, reason: collision with root package name */
        public b<E> f1677a;

        /* renamed from: b, reason: collision with root package name */
        public b<E> f1678b;

        /* renamed from: c, reason: collision with root package name */
        public E f1679c;

        /* renamed from: d, reason: collision with root package name */
        public int f1680d;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<E> extends j0<b<E>> {
        @Override // a3.j0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public b<E> g() {
            return new b<>();
        }

        public b<E> k(b<E> bVar, b<E> bVar2, E e11, int i11) {
            b<E> bVar3 = (b) super.h();
            bVar3.f1677a = bVar;
            bVar3.f1678b = bVar2;
            bVar3.f1679c = e11;
            bVar3.f1680d = i11;
            return bVar3;
        }
    }

    @d0
    public E a(int i11, E e11) {
        b<E> bVar;
        b<E> bVar2 = this.f1673d;
        if (bVar2 != null) {
            while (true) {
                bVar = bVar2.f1678b;
                if (bVar == null || bVar.f1680d > i11) {
                    break;
                }
                bVar2 = bVar;
            }
            int i12 = bVar2.f1680d;
            if (i11 > i12) {
                b<E> k11 = this.f1670a.k(bVar2, bVar, e11, i11);
                bVar2.f1678b = k11;
                b<E> bVar3 = k11.f1678b;
                if (bVar3 != null) {
                    bVar3.f1677a = k11;
                }
                this.f1672c++;
            } else if (i11 < i12) {
                b<E> k12 = this.f1670a.k(null, this.f1673d, e11, i11);
                this.f1673d.f1677a = k12;
                this.f1673d = k12;
                this.f1672c++;
            } else {
                bVar2.f1679c = e11;
            }
        } else {
            this.f1673d = this.f1670a.k(null, null, e11, i11);
            this.f1672c++;
        }
        return null;
    }

    public boolean b() {
        return this.f1672c > 0;
    }

    public void clear() {
        while (true) {
            b<E> bVar = this.f1673d;
            if (bVar == null) {
                this.f1672c = 0;
                return;
            } else {
                this.f1670a.d(bVar);
                this.f1673d = this.f1673d.f1678b;
            }
        }
    }

    public E get(int i11) {
        b<E> bVar = this.f1673d;
        if (bVar == null) {
            return null;
        }
        while (true) {
            b<E> bVar2 = bVar.f1678b;
            if (bVar2 == null || bVar.f1680d >= i11) {
                break;
            }
            bVar = bVar2;
        }
        if (bVar.f1680d == i11) {
            return bVar.f1679c;
        }
        return null;
    }

    public boolean isEmpty() {
        return this.f1672c == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<b<E>> iterator() {
        if (k.f1553a) {
            return new a();
        }
        w0<E>.a aVar = this.f1671b;
        if (aVar != null) {
            return aVar.b();
        }
        w0<E>.a aVar2 = new a();
        this.f1671b = aVar2;
        return aVar2;
    }

    public int size() {
        return this.f1672c;
    }
}
