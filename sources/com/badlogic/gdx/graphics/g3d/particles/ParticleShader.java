package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.graphics.f;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.Iterator;
import k2.a;
import k2.b;
import l2.m;
import n2.w;
import x1.i;
import x1.k;
import y1.d;
import y1.g;
import y1.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ParticleShader extends k2.a {

    /* renamed from: u, reason: collision with root package name */
    public static String f12154u;

    /* renamed from: v, reason: collision with root package name */
    public static String f12155v;

    /* renamed from: w, reason: collision with root package name */
    public static long f12156w = y1.a.f98941j | j.f98991l;

    /* renamed from: x, reason: collision with root package name */
    public static final Vector3 f12157x = new Vector3();

    /* renamed from: y, reason: collision with root package name */
    public static final long f12158y = g.f98982g | d.f98967j;

    /* renamed from: p, reason: collision with root package name */
    public i f12159p;

    /* renamed from: q, reason: collision with root package name */
    public long f12160q;

    /* renamed from: r, reason: collision with root package name */
    public long f12161r;

    /* renamed from: s, reason: collision with root package name */
    public final a f12162s;

    /* renamed from: t, reason: collision with root package name */
    public x1.d f12163t;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum AlignMode {
        Screen,
        ViewPoint
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ParticleType {
        Billboard,
        Point
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final a.d f12171a = new a.d("u_cameraRight");

        /* renamed from: b, reason: collision with root package name */
        public static final a.d f12172b = new a.d("u_cameraInvDirection");

        /* renamed from: c, reason: collision with root package name */
        public static final a.d f12173c = new a.d("u_screenWidth");

        /* renamed from: d, reason: collision with root package name */
        public static final a.d f12174d = new a.d("u_regionSize");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final a.c f12175a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final a.c f12176b = new b();

        /* renamed from: c, reason: collision with root package name */
        public static final a.c f12177c = new C0192c();

        /* renamed from: d, reason: collision with root package name */
        public static final a.c f12178d = new d();

        /* renamed from: e, reason: collision with root package name */
        public static final a.c f12179e = new e();

        /* renamed from: f, reason: collision with root package name */
        public static final a.c f12180f = new f();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements a.c {
            @Override // k2.a.c
            public boolean a(k2.a aVar, int i11) {
                return true;
            }

            @Override // k2.a.c
            public void b(k2.a aVar, int i11, i iVar, x1.b bVar) {
                aVar.m1(i11, ParticleShader.f12157x.set(aVar.f65028k.f11509b).crs(aVar.f65028k.f11510c).nor());
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements a.c {
            @Override // k2.a.c
            public boolean a(k2.a aVar, int i11) {
                return true;
            }

            @Override // k2.a.c
            public void b(k2.a aVar, int i11, i iVar, x1.b bVar) {
                aVar.m1(i11, ParticleShader.f12157x.set(aVar.f65028k.f11510c).nor());
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.badlogic.gdx.graphics.g3d.particles.ParticleShader$c$c, reason: collision with other inner class name */
        public class C0192c implements a.c {
            @Override // k2.a.c
            public boolean a(k2.a aVar, int i11) {
                return true;
            }

            @Override // k2.a.c
            public void b(k2.a aVar, int i11, i iVar, x1.b bVar) {
                Vector3 vector3 = ParticleShader.f12157x;
                Vector3 vector32 = aVar.f65028k.f11509b;
                aVar.m1(i11, vector3.set(-vector32.f12537x, -vector32.f12538y, -vector32.f12539z).nor());
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class d implements a.c {
            @Override // k2.a.c
            public boolean a(k2.a aVar, int i11) {
                return true;
            }

            @Override // k2.a.c
            public void b(k2.a aVar, int i11, i iVar, x1.b bVar) {
                aVar.m1(i11, aVar.f65028k.f11508a);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class e implements a.c {
            @Override // k2.a.c
            public boolean a(k2.a aVar, int i11) {
                return true;
            }

            @Override // k2.a.c
            public void b(k2.a aVar, int i11, i iVar, x1.b bVar) {
                aVar.V0(i11, q1.g.f81379b.getWidth());
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class f implements a.c {

            /* renamed from: a, reason: collision with root package name */
            public final Matrix4 f12181a = new Matrix4();

            @Override // k2.a.c
            public boolean a(k2.a aVar, int i11) {
                return false;
            }

            @Override // k2.a.c
            public void b(k2.a aVar, int i11, i iVar, x1.b bVar) {
                aVar.k1(i11, this.f12181a.set(aVar.f65028k.f11512e).mul(iVar.f97047a));
            }
        }
    }

    public ParticleShader(i iVar) {
        this(iVar, new a());
    }

    public static String p1(i iVar, a aVar) {
        String str;
        if (q1.g.f81378a.getType() == Application.ApplicationType.Desktop) {
            str = "#version 120\n";
        } else {
            str = "#version 100\n";
        }
        if (aVar.f12170g != ParticleType.Billboard) {
            return str;
        }
        String str2 = str + "#define billboard\n";
        AlignMode alignMode = aVar.f12169f;
        if (alignMode == AlignMode.Screen) {
            return str2 + "#define screenFacing\n";
        }
        if (alignMode != AlignMode.ViewPoint) {
            return str2;
        }
        return str2 + "#define viewPointFacing\n";
    }

    public static String t1() {
        if (f12155v == null) {
            f12155v = q1.g.f81382e.i("com/badlogic/gdx/graphics/g3d/particles/particles.fragment.glsl").I();
        }
        return f12155v;
    }

    public static String u1() {
        if (f12154u == null) {
            f12154u = q1.g.f81382e.i("com/badlogic/gdx/graphics/g3d/particles/particles.vertex.glsl").I();
        }
        return f12154u;
    }

    @Override // x1.k
    public int F0(k kVar) {
        return kVar == null ? -1 : 0;
    }

    @Override // k2.a, x1.k
    public void M(i iVar) {
        if (!iVar.f97049c.p(y1.a.f98941j)) {
            this.f65027j.c(false, f.f11653r, f.f11659s);
        }
        o1(iVar);
        super.M(iVar);
    }

    @Override // k2.a, a3.q
    public void dispose() {
        this.f65026i.dispose();
        super.dispose();
    }

    @Override // k2.a, x1.k
    public void end() {
        this.f12163t = null;
        super.end();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ParticleShader) && q1((ParticleShader) obj);
    }

    @Override // x1.k
    public void init() {
        w wVar = this.f65026i;
        this.f65026i = null;
        R(wVar, this.f12159p);
        this.f12159p = null;
    }

    public void o1(i iVar) {
        x1.d dVar = this.f12163t;
        x1.d dVar2 = iVar.f97049c;
        if (dVar == dVar2) {
            return;
        }
        a aVar = this.f12162s;
        int i11 = aVar.f12167d;
        if (i11 == -1) {
            i11 = 1029;
        }
        int i12 = aVar.f12168e;
        if (i12 == -1) {
            i12 = f.f11596h2;
        }
        this.f12163t = dVar2;
        Iterator<x1.a> it = dVar2.iterator();
        float f11 = 0.0f;
        float f12 = 1.0f;
        boolean z11 = true;
        while (it.hasNext()) {
            x1.a next = it.next();
            long j11 = next.f97002a;
            if (y1.a.i(j11)) {
                y1.a aVar2 = (y1.a) next;
                this.f65027j.c(true, aVar2.f98943f, aVar2.f98944g);
            } else {
                long j12 = d.f98967j;
                if ((j11 & j12) == j12) {
                    d dVar3 = (d) next;
                    i12 = dVar3.f98969e;
                    f11 = dVar3.f98970f;
                    f12 = dVar3.f98971g;
                    z11 = dVar3.f98972h;
                } else if (!this.f12162s.f12166c) {
                    throw new GdxRuntimeException("Unknown material attribute: " + next.toString());
                }
            }
        }
        this.f65027j.d(i11);
        this.f65027j.g(i12, f11, f12);
        this.f65027j.e(z11);
    }

    public boolean q1(ParticleShader particleShader) {
        return particleShader == this;
    }

    public int r1() {
        int i11 = this.f12162s.f12167d;
        if (i11 == -1) {
            return 1029;
        }
        return i11;
    }

    public int s1() {
        int i11 = this.f12162s.f12168e;
        return i11 == -1 ? f.f11596h2 : i11;
    }

    @Override // x1.k
    public boolean u(i iVar) {
        return this.f12160q == (iVar.f97049c.o() | f12158y) && this.f12161r == iVar.f97048b.f7490e.r1().k();
    }

    public void v1(int i11) {
        this.f12162s.f12167d = i11;
    }

    public void w1(int i11) {
        this.f12162s.f12168e = i11;
    }

    @Override // k2.a, x1.k
    public void y0(com.badlogic.gdx.graphics.a aVar, m mVar) {
        super.y0(aVar, mVar);
    }

    public ParticleShader(i iVar, a aVar) {
        this(iVar, aVar, p1(iVar, aVar));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ParticleShader(x1.i r8, com.badlogic.gdx.graphics.g3d.particles.ParticleShader.a r9, java.lang.String r10) {
        /*
            r7 = this;
            java.lang.String r0 = r9.f12164a
            if (r0 == 0) goto L6
        L4:
            r5 = r0
            goto Lb
        L6:
            java.lang.String r0 = u1()
            goto L4
        Lb:
            java.lang.String r0 = r9.f12165b
            if (r0 == 0) goto L15
        Lf:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r0
            goto L1a
        L15:
            java.lang.String r0 = t1()
            goto Lf
        L1a:
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.graphics.g3d.particles.ParticleShader.<init>(x1.i, com.badlogic.gdx.graphics.g3d.particles.ParticleShader$a, java.lang.String):void");
    }

    public ParticleShader(i iVar, a aVar, String str, String str2, String str3) {
        this(iVar, aVar, new w(str + str2, str + str3));
    }

    public ParticleShader(i iVar, a aVar, w wVar) {
        this.f12162s = aVar;
        this.f65026i = wVar;
        this.f12159p = iVar;
        this.f12160q = iVar.f97049c.o() | f12158y;
        this.f12161r = iVar.f97048b.f7490e.r1().k();
        if (!aVar.f12166c) {
            long j11 = f12156w;
            long j12 = this.f12160q;
            if ((j11 & j12) != j12) {
                throw new GdxRuntimeException("Some attributes not implemented yet (" + this.f12160q + pn.j.f81007d);
            }
        }
        J0(b.C0748b.f65089b, b.c.f65115b);
        J0(b.C0748b.f65090c, b.c.f65116c);
        J0(b.C0748b.f65088a, b.c.f65114a);
        J0(b.f12173c, c.f12179e);
        J0(b.C0748b.f65093f, c.f12176b);
        J0(b.f12171a, c.f12175a);
        J0(b.f12172b, c.f12177c);
        J0(b.C0748b.f65091d, c.f12178d);
        J0(b.C0748b.f65103p, b.c.f65127n);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f12164a;

        /* renamed from: b, reason: collision with root package name */
        public String f12165b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f12166c;

        /* renamed from: d, reason: collision with root package name */
        public int f12167d;

        /* renamed from: e, reason: collision with root package name */
        public int f12168e;

        /* renamed from: f, reason: collision with root package name */
        public AlignMode f12169f;

        /* renamed from: g, reason: collision with root package name */
        public ParticleType f12170g;

        public a() {
            this.f12164a = null;
            this.f12165b = null;
            this.f12166c = true;
            this.f12167d = -1;
            this.f12168e = -1;
            this.f12169f = AlignMode.Screen;
            this.f12170g = ParticleType.Billboard;
        }

        public a(AlignMode alignMode, ParticleType particleType) {
            this.f12164a = null;
            this.f12165b = null;
            this.f12166c = true;
            this.f12167d = -1;
            this.f12168e = -1;
            this.f12169f = AlignMode.Screen;
            ParticleType particleType2 = ParticleType.Billboard;
            this.f12169f = alignMode;
            this.f12170g = particleType;
        }

        public a(AlignMode alignMode) {
            this.f12164a = null;
            this.f12165b = null;
            this.f12166c = true;
            this.f12167d = -1;
            this.f12168e = -1;
            this.f12169f = AlignMode.Screen;
            this.f12170g = ParticleType.Billboard;
            this.f12169f = alignMode;
        }

        public a(ParticleType particleType) {
            this.f12164a = null;
            this.f12165b = null;
            this.f12166c = true;
            this.f12167d = -1;
            this.f12168e = -1;
            this.f12169f = AlignMode.Screen;
            ParticleType particleType2 = ParticleType.Billboard;
            this.f12170g = particleType;
        }

        public a(String str, String str2) {
            this.f12164a = null;
            this.f12165b = null;
            this.f12166c = true;
            this.f12167d = -1;
            this.f12168e = -1;
            this.f12169f = AlignMode.Screen;
            this.f12170g = ParticleType.Billboard;
            this.f12164a = str;
            this.f12165b = str2;
        }
    }
}
