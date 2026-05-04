package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.scenes.scene2d.ui.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class x extends y<k> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public k.a f13117a;

        /* renamed from: b, reason: collision with root package name */
        @a3.d0
        public z2.k f13118b;

        /* renamed from: c, reason: collision with root package name */
        public float f13119c;

        public a() {
        }

        public a(k.a aVar, @a3.d0 z2.k kVar) {
            this.f13117a = aVar;
            this.f13118b = kVar;
        }

        public a(a aVar) {
            this.f13117a = new k.a(aVar.f13117a);
            this.f13118b = aVar.f13118b;
            this.f13119c = aVar.f13119c;
        }
    }

    public x(@a3.d0 String str, q qVar) {
        this(str, z.b(), (a) qVar.R(a.class));
    }

    public k u(String str, k.a aVar) {
        return new k(str, aVar);
    }

    public void v(a aVar) {
        if (aVar == null) {
            throw new NullPointerException("style cannot be null");
        }
        this.f13122c.e5(aVar.f13118b);
        this.f13122c.y4(aVar.f13119c);
        boolean z11 = aVar.f13119c != 0.0f;
        this.f13122c.Q3(z11);
        k kVar = (k) this.f13122c.U3();
        kVar.u3(aVar.f13117a);
        kVar.x3(z11);
    }

    public x(@a3.d0 String str, q qVar, String str2) {
        this(str, z.b(), (a) qVar.X(str2, a.class));
    }

    public x(@a3.d0 String str, a aVar) {
        this(str, z.b(), aVar);
    }

    public x(@a3.d0 String str, z zVar, q qVar) {
        this(str, zVar, (a) qVar.R(a.class));
    }

    public x(@a3.d0 String str, z zVar, q qVar, String str2) {
        this(str, zVar, (a) qVar.X(str2, a.class));
    }

    public x(@a3.d0 String str, z zVar, a aVar) {
        super(null, zVar);
        this.f13122c.d5(u(str, aVar.f13117a));
        v(aVar);
    }
}
