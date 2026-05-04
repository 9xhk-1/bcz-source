package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class g extends j implements Iterable<j> {

    /* renamed from: a, reason: collision with root package name */
    public final List<j> f34972a;

    public g() {
        this.f34972a = new ArrayList();
    }

    public void A(Character ch2) {
        this.f34972a.add(ch2 == null ? k.f35047a : new n(ch2));
    }

    public void B(Number number) {
        this.f34972a.add(number == null ? k.f35047a : new n(number));
    }

    public void C(String str) {
        this.f34972a.add(str == null ? k.f35047a : new n(str));
    }

    public void D(g gVar) {
        this.f34972a.addAll(gVar.f34972a);
    }

    public boolean E(j jVar) {
        return this.f34972a.contains(jVar);
    }

    @Override // com.google.gson.j
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public g a() {
        if (this.f34972a.isEmpty()) {
            return new g();
        }
        g gVar = new g(this.f34972a.size());
        Iterator<j> it = this.f34972a.iterator();
        while (it.hasNext()) {
            gVar.y(it.next().a());
        }
        return gVar;
    }

    public j G(int i11) {
        return this.f34972a.get(i11);
    }

    public j H(int i11) {
        return this.f34972a.remove(i11);
    }

    public boolean I(j jVar) {
        return this.f34972a.remove(jVar);
    }

    public j J(int i11, j jVar) {
        return this.f34972a.set(i11, jVar);
    }

    @Override // com.google.gson.j
    public BigDecimal b() {
        if (this.f34972a.size() == 1) {
            return this.f34972a.get(0).b();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public BigInteger d() {
        if (this.f34972a.size() == 1) {
            return this.f34972a.get(0).d();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof g) && ((g) obj).f34972a.equals(this.f34972a);
        }
        return true;
    }

    @Override // com.google.gson.j
    public boolean f() {
        if (this.f34972a.size() == 1) {
            return this.f34972a.get(0).f();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public byte g() {
        if (this.f34972a.size() == 1) {
            return this.f34972a.get(0).g();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    @Deprecated
    public char h() {
        if (this.f34972a.size() == 1) {
            return this.f34972a.get(0).h();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f34972a.hashCode();
    }

    public boolean isEmpty() {
        return this.f34972a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<j> iterator() {
        return this.f34972a.iterator();
    }

    @Override // com.google.gson.j
    public double j() {
        if (this.f34972a.size() == 1) {
            return this.f34972a.get(0).j();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public float k() {
        if (this.f34972a.size() == 1) {
            return this.f34972a.get(0).k();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public int l() {
        if (this.f34972a.size() == 1) {
            return this.f34972a.get(0).l();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public long q() {
        if (this.f34972a.size() == 1) {
            return this.f34972a.get(0).q();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public Number r() {
        if (this.f34972a.size() == 1) {
            return this.f34972a.get(0).r();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public short s() {
        if (this.f34972a.size() == 1) {
            return this.f34972a.get(0).s();
        }
        throw new IllegalStateException();
    }

    public int size() {
        return this.f34972a.size();
    }

    @Override // com.google.gson.j
    public String t() {
        if (this.f34972a.size() == 1) {
            return this.f34972a.get(0).t();
        }
        throw new IllegalStateException();
    }

    public void y(j jVar) {
        if (jVar == null) {
            jVar = k.f35047a;
        }
        this.f34972a.add(jVar);
    }

    public void z(Boolean bool) {
        this.f34972a.add(bool == null ? k.f35047a : new n(bool));
    }

    public g(int i11) {
        this.f34972a = new ArrayList(i11);
    }
}
