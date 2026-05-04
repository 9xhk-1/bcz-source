package com.google.gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import xo.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public com.google.gson.internal.d f34952a;

    /* renamed from: b, reason: collision with root package name */
    public LongSerializationPolicy f34953b;

    /* renamed from: c, reason: collision with root package name */
    public c f34954c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Type, f<?>> f34955d;

    /* renamed from: e, reason: collision with root package name */
    public final List<t> f34956e;

    /* renamed from: f, reason: collision with root package name */
    public final List<t> f34957f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f34958g;

    /* renamed from: h, reason: collision with root package name */
    public String f34959h;

    /* renamed from: i, reason: collision with root package name */
    public int f34960i;

    /* renamed from: j, reason: collision with root package name */
    public int f34961j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f34962k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f34963l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f34964m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f34965n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f34966o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f34967p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f34968q;

    /* renamed from: r, reason: collision with root package name */
    public r f34969r;

    /* renamed from: s, reason: collision with root package name */
    public r f34970s;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedList<ReflectionAccessFilter> f34971t;

    public e() {
        this.f34952a = com.google.gson.internal.d.f35021h;
        this.f34953b = LongSerializationPolicy.DEFAULT;
        this.f34954c = FieldNamingPolicy.IDENTITY;
        this.f34955d = new HashMap();
        this.f34956e = new ArrayList();
        this.f34957f = new ArrayList();
        this.f34958g = false;
        this.f34959h = d.H;
        this.f34960i = 2;
        this.f34961j = 2;
        this.f34962k = false;
        this.f34963l = false;
        this.f34964m = true;
        this.f34965n = false;
        this.f34966o = false;
        this.f34967p = false;
        this.f34968q = true;
        this.f34969r = d.J;
        this.f34970s = d.K;
        this.f34971t = new LinkedList<>();
    }

    public e A(r rVar) {
        this.f34969r = rVar;
        return this;
    }

    public e B() {
        this.f34965n = true;
        return this;
    }

    public e C(double d11) {
        this.f34952a = this.f34952a.s(d11);
        return this;
    }

    public e a(a aVar) {
        this.f34952a = this.f34952a.p(aVar, false, true);
        return this;
    }

    public e b(ReflectionAccessFilter reflectionAccessFilter) {
        reflectionAccessFilter.getClass();
        this.f34971t.addFirst(reflectionAccessFilter);
        return this;
    }

    public e c(a aVar) {
        this.f34952a = this.f34952a.p(aVar, true, false);
        return this;
    }

    public final void d(String str, int i11, int i12, List<t> list) {
        t tVar;
        t tVar2;
        boolean z11 = ap.d.f5400a;
        t tVar3 = null;
        if (str != null && !str.trim().isEmpty()) {
            tVar = d.b.f98166b.c(str);
            if (z11) {
                tVar3 = ap.d.f5402c.c(str);
                tVar2 = ap.d.f5401b.c(str);
            }
            tVar2 = null;
        } else {
            if (i11 == 2 || i12 == 2) {
                return;
            }
            t b11 = d.b.f98166b.b(i11, i12);
            if (z11) {
                tVar3 = ap.d.f5402c.b(i11, i12);
                t b12 = ap.d.f5401b.b(i11, i12);
                tVar = b11;
                tVar2 = b12;
            } else {
                tVar = b11;
                tVar2 = null;
            }
        }
        list.add(tVar);
        if (z11) {
            list.add(tVar3);
            list.add(tVar2);
        }
    }

    public d e() {
        List<t> arrayList = new ArrayList<>(this.f34956e.size() + this.f34957f.size() + 3);
        arrayList.addAll(this.f34956e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f34957f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        d(this.f34959h, this.f34960i, this.f34961j, arrayList);
        return new d(this.f34952a, this.f34954c, new HashMap(this.f34955d), this.f34958g, this.f34962k, this.f34966o, this.f34964m, this.f34965n, this.f34967p, this.f34963l, this.f34968q, this.f34953b, this.f34959h, this.f34960i, this.f34961j, new ArrayList(this.f34956e), new ArrayList(this.f34957f), arrayList, this.f34969r, this.f34970s, new ArrayList(this.f34971t));
    }

    public e f() {
        this.f34964m = false;
        return this;
    }

    public e g() {
        this.f34952a = this.f34952a.c();
        return this;
    }

    public e h() {
        this.f34968q = false;
        return this;
    }

    public e i() {
        this.f34962k = true;
        return this;
    }

    public e j(int... iArr) {
        this.f34952a = this.f34952a.q(iArr);
        return this;
    }

    public e k() {
        this.f34952a = this.f34952a.h();
        return this;
    }

    public e l() {
        this.f34966o = true;
        return this;
    }

    public e m(Type type, Object obj) {
        boolean z11 = obj instanceof p;
        com.google.gson.internal.a.a(z11 || (obj instanceof i) || (obj instanceof f) || (obj instanceof s));
        if (obj instanceof f) {
            this.f34955d.put(type, (f) obj);
        }
        if (z11 || (obj instanceof i)) {
            this.f34956e.add(xo.l.l(bp.a.get(type), obj));
        }
        if (obj instanceof s) {
            this.f34956e.add(xo.n.a(bp.a.get(type), (s) obj));
        }
        return this;
    }

    public e n(t tVar) {
        this.f34956e.add(tVar);
        return this;
    }

    public e o(Class<?> cls, Object obj) {
        boolean z11 = obj instanceof p;
        com.google.gson.internal.a.a(z11 || (obj instanceof i) || (obj instanceof s));
        if ((obj instanceof i) || z11) {
            this.f34957f.add(xo.l.m(cls, obj));
        }
        if (obj instanceof s) {
            this.f34956e.add(xo.n.e(cls, (s) obj));
        }
        return this;
    }

    public e p() {
        this.f34958g = true;
        return this;
    }

    public e q() {
        this.f34963l = true;
        return this;
    }

    public e r(int i11) {
        this.f34960i = i11;
        this.f34959h = null;
        return this;
    }

    public e s(int i11, int i12) {
        this.f34960i = i11;
        this.f34961j = i12;
        this.f34959h = null;
        return this;
    }

    public e t(String str) {
        this.f34959h = str;
        return this;
    }

    public e u(a... aVarArr) {
        for (a aVar : aVarArr) {
            this.f34952a = this.f34952a.p(aVar, true, true);
        }
        return this;
    }

    public e v(FieldNamingPolicy fieldNamingPolicy) {
        this.f34954c = fieldNamingPolicy;
        return this;
    }

    public e w(c cVar) {
        this.f34954c = cVar;
        return this;
    }

    public e x() {
        this.f34967p = true;
        return this;
    }

    public e y(LongSerializationPolicy longSerializationPolicy) {
        this.f34953b = longSerializationPolicy;
        return this;
    }

    public e z(r rVar) {
        this.f34970s = rVar;
        return this;
    }

    public e(d dVar) {
        this.f34952a = com.google.gson.internal.d.f35021h;
        this.f34953b = LongSerializationPolicy.DEFAULT;
        this.f34954c = FieldNamingPolicy.IDENTITY;
        HashMap hashMap = new HashMap();
        this.f34955d = hashMap;
        ArrayList arrayList = new ArrayList();
        this.f34956e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f34957f = arrayList2;
        this.f34958g = false;
        this.f34959h = d.H;
        this.f34960i = 2;
        this.f34961j = 2;
        this.f34962k = false;
        this.f34963l = false;
        this.f34964m = true;
        this.f34965n = false;
        this.f34966o = false;
        this.f34967p = false;
        this.f34968q = true;
        this.f34969r = d.J;
        this.f34970s = d.K;
        LinkedList<ReflectionAccessFilter> linkedList = new LinkedList<>();
        this.f34971t = linkedList;
        this.f34952a = dVar.f34927f;
        this.f34954c = dVar.f34928g;
        hashMap.putAll(dVar.f34929h);
        this.f34958g = dVar.f34930i;
        this.f34962k = dVar.f34931j;
        this.f34966o = dVar.f34932k;
        this.f34964m = dVar.f34933l;
        this.f34965n = dVar.f34934m;
        this.f34967p = dVar.f34935n;
        this.f34963l = dVar.f34936o;
        this.f34953b = dVar.f34941t;
        this.f34959h = dVar.f34938q;
        this.f34960i = dVar.f34939r;
        this.f34961j = dVar.f34940s;
        arrayList.addAll(dVar.f34942u);
        arrayList2.addAll(dVar.f34943v);
        this.f34968q = dVar.f34937p;
        this.f34969r = dVar.f34944w;
        this.f34970s = dVar.f34945x;
        linkedList.addAll(dVar.f34946y);
    }
}
