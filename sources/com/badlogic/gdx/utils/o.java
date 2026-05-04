package com.badlogic.gdx.utils;

import com.badlogic.gdx.utils.m;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class o<T> extends m<T> {

    /* renamed from: i, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<T> f13418i;

    /* renamed from: j, reason: collision with root package name */
    public transient a f13419j;

    /* renamed from: k, reason: collision with root package name */
    public transient a f13420k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<K> extends m.a<K> {

        /* renamed from: f, reason: collision with root package name */
        public com.badlogic.gdx.utils.a<K> f13421f;

        public a(o<K> oVar) {
            super(oVar);
            this.f13421f = oVar.f13418i;
        }

        @Override // com.badlogic.gdx.utils.m.a
        public void d() {
            this.f13411c = 0;
            this.f13409a = this.f13410b.f13401a > 0;
        }

        @Override // com.badlogic.gdx.utils.m.a
        public com.badlogic.gdx.utils.a<K> f() {
            return g(new com.badlogic.gdx.utils.a<>(true, this.f13410b.f13401a - this.f13411c));
        }

        @Override // com.badlogic.gdx.utils.m.a
        public com.badlogic.gdx.utils.a<K> g(com.badlogic.gdx.utils.a<K> aVar) {
            com.badlogic.gdx.utils.a<K> aVar2 = this.f13421f;
            int i11 = this.f13411c;
            aVar.h(aVar2, i11, aVar2.f13179b - i11);
            this.f13411c = this.f13421f.f13179b;
            this.f13409a = false;
            return aVar;
        }

        @Override // com.badlogic.gdx.utils.m.a, java.util.Iterator
        public K next() {
            if (!this.f13409a) {
                throw new NoSuchElementException();
            }
            if (!this.f13413e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            K k11 = this.f13421f.get(this.f13411c);
            int i11 = this.f13411c + 1;
            this.f13411c = i11;
            this.f13409a = i11 < this.f13410b.f13401a;
            return k11;
        }

        @Override // com.badlogic.gdx.utils.m.a, java.util.Iterator
        public void remove() {
            int i11 = this.f13411c;
            if (i11 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            int i12 = i11 - 1;
            this.f13411c = i12;
            ((o) this.f13410b).B(i12);
        }
    }

    public o() {
        this.f13418i = new com.badlogic.gdx.utils.a<>();
    }

    public static <T> o<T> C(T... tArr) {
        o<T> oVar = new o<>();
        oVar.f(tArr);
        return oVar;
    }

    public com.badlogic.gdx.utils.a<T> A() {
        return this.f13418i;
    }

    public T B(int i11) {
        T A = this.f13418i.A(i11);
        super.remove(A);
        return A;
    }

    @Override // com.badlogic.gdx.utils.m
    public boolean add(T t11) {
        if (!super.add(t11)) {
            return false;
        }
        this.f13418i.a(t11);
        return true;
    }

    @Override // com.badlogic.gdx.utils.m
    public void clear() {
        this.f13418i.clear();
        super.clear();
    }

    @Override // com.badlogic.gdx.utils.m
    public void j(int i11) {
        this.f13418i.clear();
        super.j(i11);
    }

    @Override // com.badlogic.gdx.utils.m
    public boolean remove(T t11) {
        if (!super.remove(t11)) {
            return false;
        }
        this.f13418i.C(t11, false);
        return true;
    }

    @Override // com.badlogic.gdx.utils.m
    public String t(String str) {
        return this.f13418i.R(str);
    }

    @Override // com.badlogic.gdx.utils.m
    public String toString() {
        if (this.f13401a == 0) {
            return "{}";
        }
        T[] tArr = this.f13418i.f13178a;
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(l50.b.f69927i);
        sb2.append(tArr[0]);
        for (int i11 = 1; i11 < this.f13401a; i11++) {
            sb2.append(j2.O);
            sb2.append(tArr[i11]);
        }
        sb2.append(l50.b.f69928j);
        return sb2.toString();
    }

    public boolean v(T t11, int i11) {
        if (super.add(t11)) {
            this.f13418i.r(i11, t11);
            return true;
        }
        int q11 = this.f13418i.q(t11, true);
        if (q11 == i11) {
            return false;
        }
        com.badlogic.gdx.utils.a<T> aVar = this.f13418i;
        aVar.r(i11, aVar.A(q11));
        return false;
    }

    public void w(o<T> oVar) {
        k(oVar.f13401a);
        com.badlogic.gdx.utils.a<T> aVar = oVar.f13418i;
        T[] tArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            add(tArr[i12]);
        }
    }

    public boolean x(T t11, T t12) {
        if (contains(t12) || !super.remove(t11)) {
            return false;
        }
        super.add(t12);
        com.badlogic.gdx.utils.a<T> aVar = this.f13418i;
        aVar.K(aVar.q(t11, false), t12);
        return true;
    }

    public boolean y(int i11, T t11) {
        if (i11 < 0 || i11 >= this.f13401a || contains(t11)) {
            return false;
        }
        super.remove(this.f13418i.get(i11));
        super.add(t11);
        this.f13418i.K(i11, t11);
        return true;
    }

    @Override // com.badlogic.gdx.utils.m
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public a<T> iterator() {
        if (a3.k.f1553a) {
            return new a<>(this);
        }
        if (this.f13419j == null) {
            this.f13419j = new a(this);
            this.f13420k = new a(this);
        }
        a aVar = this.f13419j;
        if (aVar.f13413e) {
            this.f13420k.d();
            a<T> aVar2 = this.f13420k;
            aVar2.f13413e = true;
            this.f13419j.f13413e = false;
            return aVar2;
        }
        aVar.d();
        a<T> aVar3 = this.f13419j;
        aVar3.f13413e = true;
        this.f13420k.f13413e = false;
        return aVar3;
    }

    public o(int i11, float f11) {
        super(i11, f11);
        this.f13418i = new com.badlogic.gdx.utils.a<>(i11);
    }

    public o(int i11) {
        super(i11);
        this.f13418i = new com.badlogic.gdx.utils.a<>(i11);
    }

    public o(o<? extends T> oVar) {
        super(oVar);
        this.f13418i = new com.badlogic.gdx.utils.a<>(oVar.f13418i);
    }
}
