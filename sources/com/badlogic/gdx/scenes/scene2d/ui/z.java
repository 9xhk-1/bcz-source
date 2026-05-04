package com.badlogic.gdx.scenes.scene2d.ui;

import a3.c1;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.utils.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class z {

    /* renamed from: o, reason: collision with root package name */
    public static z f13127o;

    /* renamed from: p, reason: collision with root package name */
    public static Files f13128p;

    /* renamed from: m, reason: collision with root package name */
    public y f13141m;

    /* renamed from: a, reason: collision with root package name */
    public float f13129a = 2.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f13130b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f13131c = 1.5f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13132d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13133e = true;

    /* renamed from: f, reason: collision with root package name */
    public float f13134f = 2.14748365E9f;

    /* renamed from: g, reason: collision with root package name */
    public float f13135g = 15.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f13136h = 19.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f13137i = 7.0f;

    /* renamed from: j, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<y> f13138j = new com.badlogic.gdx.utils.a<>();

    /* renamed from: k, reason: collision with root package name */
    public float f13139k = this.f13129a;

    /* renamed from: l, reason: collision with root package name */
    public final c1.a f13140l = new a();

    /* renamed from: n, reason: collision with root package name */
    public final c1.a f13142n = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends c1.a {
        public a() {
        }

        @Override // a3.c1.a, java.lang.Runnable
        public void run() {
            z zVar = z.this;
            zVar.f13139k = zVar.f13129a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends c1.a {
        public b() {
        }

        @Override // a3.c1.a, java.lang.Runnable
        public void run() {
            com.badlogic.gdx.scenes.scene2d.a aVar;
            com.badlogic.gdx.scenes.scene2d.c F1;
            y yVar = z.this.f13141m;
            if (yVar == null || (aVar = yVar.f13126g) == null || (F1 = aVar.F1()) == null) {
                return;
            }
            F1.Q0(z.this.f13141m.f13122c);
            z.this.f13141m.f13122c.Z2();
            z zVar = z.this;
            zVar.f13138j.a(zVar.f13141m);
            z.this.f13141m.f13122c.h1();
            z zVar2 = z.this;
            zVar2.g(zVar2.f13141m);
            z zVar3 = z.this;
            if (zVar3.f13141m.f13123d) {
                return;
            }
            zVar3.f13139k = zVar3.f13130b;
            zVar3.f13140l.a();
        }
    }

    public static z b() {
        Files files = f13128p;
        if (files == null || files != q1.g.f81382e) {
            f13128p = q1.g.f81382e;
            f13127o = new z();
        }
        return f13127o;
    }

    public void a(y yVar) {
        this.f13141m = yVar;
        this.f13142n.a();
        if (this.f13132d || yVar.f13124e) {
            float f11 = this.f13139k;
            if (f11 == 0.0f || yVar.f13123d) {
                this.f13142n.run();
            } else {
                c1.h(this.f13142n, f11);
            }
        }
    }

    public void c(y yVar) {
        this.f13141m = null;
        this.f13142n.a();
        if (yVar.f13122c.R1()) {
            this.f13138j.C(yVar, true);
            d(yVar);
            this.f13140l.a();
            c1.h(this.f13140l, this.f13131c);
        }
    }

    public void d(y yVar) {
        com.badlogic.gdx.scenes.scene2d.a aVar = yVar.f13122c;
        com.badlogic.gdx.math.l lVar = com.badlogic.gdx.math.l.f12619e;
        aVar.b1(y2.a.h0(y2.a.G(y2.a.i(0.2f, 0.2f, lVar), y2.a.e0(0.05f, 0.05f, 0.2f, lVar)), y2.a.N()));
    }

    public void e() {
        this.f13140l.a();
        this.f13142n.a();
        this.f13139k = this.f13129a;
        this.f13141m = null;
        a.b<y> it = this.f13138j.iterator();
        while (it.hasNext()) {
            it.next().o();
        }
        this.f13138j.clear();
    }

    public void f() {
        this.f13139k = 0.0f;
        this.f13142n.run();
        this.f13142n.a();
    }

    public void g(y yVar) {
        float f11 = this.f13133e ? this.f13139k > 0.0f ? 0.5f : 0.15f : 0.1f;
        yVar.f13122c.B3(true);
        yVar.f13122c.e().f11547d = 0.2f;
        yVar.f13122c.F2(0.05f);
        com.badlogic.gdx.scenes.scene2d.a aVar = yVar.f13122c;
        com.badlogic.gdx.math.l lVar = com.badlogic.gdx.math.l.f12619e;
        aVar.b1(y2.a.G(y2.a.p(f11, lVar), y2.a.e0(1.0f, 1.0f, f11, lVar)));
    }

    public void h(y yVar) {
        this.f13142n.a();
        if (yVar.f13122c.j2()) {
            this.f13140l.a();
        }
        this.f13140l.run();
        if (this.f13132d || yVar.f13124e) {
            this.f13141m = yVar;
            c1.h(this.f13142n, this.f13139k);
        }
    }
}
