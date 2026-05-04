package com.badlogic.gdx.utils;

import com.badlogic.gdx.utils.l;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class n<K, V> extends l<K, V> {

    /* renamed from: o, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<K> f13414o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<K, V> extends l.a<K, V> {

        /* renamed from: g, reason: collision with root package name */
        public com.badlogic.gdx.utils.a<K> f13415g;

        public a(n<K, V> nVar) {
            super(nVar);
            this.f13415g = nVar.f13414o;
        }

        @Override // com.badlogic.gdx.utils.l.a, com.badlogic.gdx.utils.l.d
        public void b() {
            this.f13399d = -1;
            this.f13398c = 0;
            this.f13396a = this.f13397b.f13380a > 0;
        }

        @Override // com.badlogic.gdx.utils.l.a, java.util.Iterator
        /* renamed from: f */
        public l.b next() {
            if (!this.f13396a) {
                throw new NoSuchElementException();
            }
            if (!this.f13400e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            int i11 = this.f13398c;
            this.f13399d = i11;
            this.f13393f.f13394a = this.f13415g.get(i11);
            l.b<K, V> bVar = this.f13393f;
            bVar.f13395b = this.f13397b.k(bVar.f13394a);
            int i12 = this.f13398c + 1;
            this.f13398c = i12;
            this.f13396a = i12 < this.f13397b.f13380a;
            return this.f13393f;
        }

        @Override // com.badlogic.gdx.utils.l.a, com.badlogic.gdx.utils.l.d, java.util.Iterator
        public void remove() {
            if (this.f13399d < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            this.f13397b.u(this.f13393f.f13394a);
            this.f13398c--;
            this.f13399d = -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<K> extends l.c<K> {

        /* renamed from: f, reason: collision with root package name */
        public com.badlogic.gdx.utils.a<K> f13416f;

        public b(n<K, ?> nVar) {
            super(nVar);
            this.f13416f = nVar.f13414o;
        }

        @Override // com.badlogic.gdx.utils.l.c, com.badlogic.gdx.utils.l.d
        public void b() {
            this.f13399d = -1;
            this.f13398c = 0;
            this.f13396a = this.f13397b.f13380a > 0;
        }

        @Override // com.badlogic.gdx.utils.l.c
        public com.badlogic.gdx.utils.a<K> f() {
            return g(new com.badlogic.gdx.utils.a<>(true, this.f13416f.f13179b - this.f13398c));
        }

        @Override // com.badlogic.gdx.utils.l.c
        public com.badlogic.gdx.utils.a<K> g(com.badlogic.gdx.utils.a<K> aVar) {
            com.badlogic.gdx.utils.a<K> aVar2 = this.f13416f;
            int i11 = this.f13398c;
            aVar.h(aVar2, i11, aVar2.f13179b - i11);
            this.f13398c = this.f13416f.f13179b;
            this.f13396a = false;
            return aVar;
        }

        @Override // com.badlogic.gdx.utils.l.c, java.util.Iterator
        public K next() {
            if (!this.f13396a) {
                throw new NoSuchElementException();
            }
            if (!this.f13400e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            K k11 = this.f13416f.get(this.f13398c);
            int i11 = this.f13398c;
            this.f13399d = i11;
            int i12 = i11 + 1;
            this.f13398c = i12;
            this.f13396a = i12 < this.f13397b.f13380a;
            return k11;
        }

        @Override // com.badlogic.gdx.utils.l.c, com.badlogic.gdx.utils.l.d, java.util.Iterator
        public void remove() {
            int i11 = this.f13399d;
            if (i11 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            ((n) this.f13397b).E(i11);
            this.f13398c = this.f13399d;
            this.f13399d = -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<V> extends l.e<V> {

        /* renamed from: f, reason: collision with root package name */
        public com.badlogic.gdx.utils.a f13417f;

        public c(n<?, V> nVar) {
            super(nVar);
            this.f13417f = nVar.f13414o;
        }

        @Override // com.badlogic.gdx.utils.l.e, com.badlogic.gdx.utils.l.d
        public void b() {
            this.f13399d = -1;
            this.f13398c = 0;
            this.f13396a = this.f13397b.f13380a > 0;
        }

        @Override // com.badlogic.gdx.utils.l.e
        public com.badlogic.gdx.utils.a<V> f() {
            return g(new com.badlogic.gdx.utils.a<>(true, this.f13417f.f13179b - this.f13398c));
        }

        @Override // com.badlogic.gdx.utils.l.e
        public com.badlogic.gdx.utils.a<V> g(com.badlogic.gdx.utils.a<V> aVar) {
            int i11 = this.f13417f.f13179b;
            aVar.o(i11 - this.f13398c);
            Object[] objArr = this.f13417f.f13178a;
            for (int i12 = this.f13398c; i12 < i11; i12++) {
                aVar.a(this.f13397b.k(objArr[i12]));
            }
            this.f13399d = i11 - 1;
            this.f13398c = i11;
            this.f13396a = false;
            return aVar;
        }

        @Override // com.badlogic.gdx.utils.l.e, java.util.Iterator
        public V next() {
            if (!this.f13396a) {
                throw new NoSuchElementException();
            }
            if (!this.f13400e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            V k11 = this.f13397b.k(this.f13417f.get(this.f13398c));
            int i11 = this.f13398c;
            this.f13399d = i11;
            int i12 = i11 + 1;
            this.f13398c = i12;
            this.f13396a = i12 < this.f13397b.f13380a;
            return k11;
        }

        @Override // com.badlogic.gdx.utils.l.e, com.badlogic.gdx.utils.l.d, java.util.Iterator
        public void remove() {
            int i11 = this.f13399d;
            if (i11 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            ((n) this.f13397b).E(i11);
            this.f13398c = this.f13399d;
            this.f13399d = -1;
        }
    }

    public n() {
        this.f13414o = new com.badlogic.gdx.utils.a<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean A(K k11, K k12) {
        int q11;
        if (b(k12) || (q11 = this.f13414o.q(k11, false)) == -1) {
            return false;
        }
        super.r(k12, super.u(k11));
        this.f13414o.K(q11, k12);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean B(int i11, K k11) {
        if (i11 < 0 || i11 >= this.f13380a || b(k11)) {
            return false;
        }
        super.r(k11, super.u(this.f13414o.get(i11)));
        this.f13414o.K(i11, k11);
        return true;
    }

    public com.badlogic.gdx.utils.a<K> C() {
        return this.f13414o;
    }

    public <T extends K> void D(n<T, ? extends V> nVar) {
        f(nVar.f13380a);
        com.badlogic.gdx.utils.a<T> aVar = nVar.f13414o;
        T[] tArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            T t11 = tArr[i12];
            r(t11, nVar.k(t11));
        }
    }

    public V E(int i11) {
        return (V) super.u(this.f13414o.A(i11));
    }

    @Override // com.badlogic.gdx.utils.l
    public void a(int i11) {
        this.f13414o.clear();
        super.a(i11);
    }

    @Override // com.badlogic.gdx.utils.l
    public void clear() {
        this.f13414o.clear();
        super.clear();
    }

    @Override // com.badlogic.gdx.utils.l
    public l.a<K, V> g() {
        if (a3.k.f1553a) {
            return new a(this);
        }
        if (this.f13387h == null) {
            this.f13387h = new a(this);
            this.f13388i = new a(this);
        }
        l.a aVar = this.f13387h;
        if (aVar.f13400e) {
            this.f13388i.b();
            l.a<K, V> aVar2 = this.f13388i;
            aVar2.f13400e = true;
            this.f13387h.f13400e = false;
            return aVar2;
        }
        aVar.b();
        l.a<K, V> aVar3 = this.f13387h;
        aVar3.f13400e = true;
        this.f13388i.f13400e = false;
        return aVar3;
    }

    @Override // com.badlogic.gdx.utils.l, java.lang.Iterable
    /* renamed from: m */
    public l.a<K, V> iterator() {
        return g();
    }

    @Override // com.badlogic.gdx.utils.l
    public l.c<K> n() {
        if (a3.k.f1553a) {
            return new b(this);
        }
        if (this.f13391l == null) {
            this.f13391l = new b(this);
            this.f13392m = new b(this);
        }
        l.c cVar = this.f13391l;
        if (cVar.f13400e) {
            this.f13392m.b();
            l.c<K> cVar2 = this.f13392m;
            cVar2.f13400e = true;
            this.f13391l.f13400e = false;
            return cVar2;
        }
        cVar.b();
        l.c<K> cVar3 = this.f13391l;
        cVar3.f13400e = true;
        this.f13392m.f13400e = false;
        return cVar3;
    }

    @Override // com.badlogic.gdx.utils.l
    public V r(K k11, V v11) {
        int o11 = o(k11);
        if (o11 >= 0) {
            V[] vArr = this.f13382c;
            V v12 = vArr[o11];
            vArr[o11] = v11;
            return v12;
        }
        int i11 = -(o11 + 1);
        this.f13381b[i11] = k11;
        this.f13382c[i11] = v11;
        this.f13414o.a(k11);
        int i12 = this.f13380a + 1;
        this.f13380a = i12;
        if (i12 < this.f13384e) {
            return null;
        }
        v(this.f13381b.length << 1);
        return null;
    }

    @Override // com.badlogic.gdx.utils.l
    public V u(K k11) {
        this.f13414o.C(k11, false);
        return (V) super.u(k11);
    }

    @Override // com.badlogic.gdx.utils.l
    public String y(String str, boolean z11) {
        if (this.f13380a == 0) {
            return z11 ? "{}" : "";
        }
        StringBuilder sb2 = new StringBuilder(32);
        if (z11) {
            sb2.append(l50.b.f69927i);
        }
        com.badlogic.gdx.utils.a<K> aVar = this.f13414o;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            K k11 = aVar.get(i12);
            if (i12 > 0) {
                sb2.append(str);
            }
            Object obj = "(this)";
            sb2.append(k11 == this ? "(this)" : k11);
            sb2.append('=');
            V k12 = k(k11);
            if (k12 != this) {
                obj = k12;
            }
            sb2.append(obj);
        }
        if (z11) {
            sb2.append(l50.b.f69928j);
        }
        return sb2.toString();
    }

    @Override // com.badlogic.gdx.utils.l
    public l.e<V> z() {
        if (a3.k.f1553a) {
            return new c(this);
        }
        if (this.f13389j == null) {
            this.f13389j = new c(this);
            this.f13390k = new c(this);
        }
        l.e eVar = this.f13389j;
        if (eVar.f13400e) {
            this.f13390k.b();
            l.e<V> eVar2 = this.f13390k;
            eVar2.f13400e = true;
            this.f13389j.f13400e = false;
            return eVar2;
        }
        eVar.b();
        l.e<V> eVar3 = this.f13389j;
        eVar3.f13400e = true;
        this.f13390k.f13400e = false;
        return eVar3;
    }

    public n(int i11) {
        super(i11);
        this.f13414o = new com.badlogic.gdx.utils.a<>(i11);
    }

    public n(int i11, float f11) {
        super(i11, f11);
        this.f13414o = new com.badlogic.gdx.utils.a<>(i11);
    }

    public n(n<? extends K, ? extends V> nVar) {
        super(nVar);
        this.f13414o = new com.badlogic.gdx.utils.a<>(nVar.f13414o);
    }
}
