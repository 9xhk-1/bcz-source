package e2;

import e2.a;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {
    public static final int A = 1;
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 0;
    public static final int I = 1;
    public static final int J = 2;
    public static final int K = 3;
    public static final int L = 0;
    public static final int M = 1;
    public static final int N = 2;
    public static final int O = 3;
    public static final int P = 4;
    public static final int Q = 5;
    public static final int R = 0;
    public static final int S = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f48344b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final a.b f48345c;

    /* renamed from: d, reason: collision with root package name */
    public static final a.b f48346d;

    /* renamed from: e, reason: collision with root package name */
    public static final a.b f48347e;

    /* renamed from: f, reason: collision with root package name */
    public static final a.b f48348f;

    /* renamed from: g, reason: collision with root package name */
    public static final a.b f48349g;

    /* renamed from: h, reason: collision with root package name */
    public static final a.b f48350h;

    /* renamed from: i, reason: collision with root package name */
    public static final a.b f48351i;

    /* renamed from: j, reason: collision with root package name */
    public static final a.b f48352j;

    /* renamed from: k, reason: collision with root package name */
    public static final a.b f48353k;

    /* renamed from: l, reason: collision with root package name */
    public static final a.b f48354l;

    /* renamed from: m, reason: collision with root package name */
    public static final a.b f48355m;

    /* renamed from: n, reason: collision with root package name */
    public static final a.b f48356n;

    /* renamed from: o, reason: collision with root package name */
    public static final a.b f48357o;

    /* renamed from: p, reason: collision with root package name */
    public static final a.b f48358p;

    /* renamed from: q, reason: collision with root package name */
    public static final a.b f48359q;

    /* renamed from: r, reason: collision with root package name */
    public static final a.b f48360r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f48361s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final int f48362t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f48363u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f48364v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static final int f48365w = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final int f48366x = 2;

    /* renamed from: y, reason: collision with root package name */
    public static final int f48367y = 3;

    /* renamed from: z, reason: collision with root package name */
    public static final int f48368z = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f48369a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements a.c<a.d> {

        /* renamed from: a, reason: collision with root package name */
        public static a f48370a;

        public static a b() {
            if (f48370a == null) {
                f48370a = new a();
            }
            return f48370a;
        }

        @Override // e2.a.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(a.d dVar) {
            float[] fArr = dVar.f48337e;
            Arrays.fill(fArr, 0, fArr.length, 1.0f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: e2.b$b, reason: collision with other inner class name */
    public static class C0582b implements a.c<a.d> {

        /* renamed from: a, reason: collision with root package name */
        public static C0582b f48371a;

        public static C0582b b() {
            if (f48371a == null) {
                f48371a = new C0582b();
            }
            return f48371a;
        }

        @Override // e2.a.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(a.d dVar) {
            int length = dVar.f48337e.length;
            int i11 = 0;
            while (i11 < length) {
                float[] fArr = dVar.f48337e;
                fArr[i11] = 1.0f;
                fArr[i11 + 1] = 0.0f;
                i11 += dVar.f48332c;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements a.c<a.d> {

        /* renamed from: a, reason: collision with root package name */
        public static c f48372a;

        public static c b() {
            if (f48372a == null) {
                f48372a = new c();
            }
            return f48372a;
        }

        @Override // e2.a.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(a.d dVar) {
            int length = dVar.f48337e.length;
            int i11 = 0;
            while (i11 < length) {
                float[] fArr = dVar.f48337e;
                fArr[i11 + 2] = 0.0f;
                fArr[i11 + 1] = 0.0f;
                fArr[i11] = 0.0f;
                fArr[i11 + 3] = 1.0f;
                i11 += dVar.f48332c;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements a.c<a.d> {

        /* renamed from: a, reason: collision with root package name */
        public static d f48373a;

        public static d b() {
            if (f48373a == null) {
                f48373a = new d();
            }
            return f48373a;
        }

        @Override // e2.a.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(a.d dVar) {
            float[] fArr = dVar.f48337e;
            Arrays.fill(fArr, 0, fArr.length, 1.0f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements a.c<a.d> {

        /* renamed from: a, reason: collision with root package name */
        public static e f48374a;

        public static e b() {
            if (f48374a == null) {
                f48374a = new e();
            }
            return f48374a;
        }

        @Override // e2.a.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(a.d dVar) {
            int length = dVar.f48337e.length;
            int i11 = 0;
            while (i11 < length) {
                float[] fArr = dVar.f48337e;
                fArr[i11] = 0.0f;
                fArr[i11 + 1] = 0.0f;
                fArr[i11 + 2] = 1.0f;
                fArr[i11 + 3] = 1.0f;
                fArr[i11 + 4] = 0.5f;
                fArr[i11 + 5] = 0.5f;
                i11 += dVar.f48332c;
            }
        }
    }

    static {
        int a11 = a();
        Class cls = Float.TYPE;
        f48345c = new a.b(a11, cls, 3);
        f48346d = new a.b(a(), cls, 3);
        f48347e = new a.b(a(), cls, 3);
        f48348f = new a.b(a(), cls, 4);
        f48349g = new a.b(a(), cls, 6);
        f48350h = new a.b(a(), cls, 2);
        f48351i = new a.b(a(), cls, 4);
        f48352j = new a.b(a(), cls, 1);
        f48353k = new a.b(a(), x1.h.class, 1);
        f48354l = new a.b(a(), e2.c.class, 1);
        f48355m = new a.b(a(), cls, 3);
        f48356n = new a.b(a(), cls, 1);
        f48357o = new a.b(a(), cls, 3);
        f48358p = new a.b(-1, cls, 2);
        f48359q = new a.b(-1, cls, 4);
        f48360r = new a.b(-1, cls, 6);
    }

    public b() {
        c();
    }

    public static int a() {
        int i11 = f48344b;
        f48344b = i11 + 1;
        return i11;
    }

    public int b() {
        int i11 = this.f48369a;
        this.f48369a = i11 + 1;
        return i11;
    }

    public void c() {
        this.f48369a = f48344b;
    }
}
