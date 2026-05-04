package e3;

import androidx.compose.ui.spatial.RectListKt;
import com.badlogic.gdx.graphics.f;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: b0, reason: collision with root package name */
    public static final int f48485b0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f48486c0 = 1;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f48487d0 = 268435455;

    /* renamed from: e0, reason: collision with root package name */
    public static byte[] f48488e0 = null;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f48489f0 = 22;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f48490g0 = 32;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f48491h0 = 16;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f48492i0 = 4096;

    /* renamed from: j0, reason: collision with root package name */
    public static final int f48493j0 = 5;
    public int D;
    public long M;
    public boolean N;
    public InputStream O;
    public int U;

    /* renamed from: a0, reason: collision with root package name */
    public int f48495a0;

    /* renamed from: b, reason: collision with root package name */
    public byte f48496b;

    /* renamed from: u, reason: collision with root package name */
    public int f48515u;

    /* renamed from: v, reason: collision with root package name */
    public int f48516v;

    /* renamed from: w, reason: collision with root package name */
    public int f48517w;

    /* renamed from: x, reason: collision with root package name */
    public int f48518x;

    /* renamed from: y, reason: collision with root package name */
    public int f48519y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f48520z;

    /* renamed from: a, reason: collision with root package name */
    public int f48494a = e3.a.b();

    /* renamed from: c, reason: collision with root package name */
    public int[] f48497c = new int[4];

    /* renamed from: d, reason: collision with root package name */
    public d[] f48498d = new d[4096];

    /* renamed from: e, reason: collision with root package name */
    public d3.a f48499e = null;

    /* renamed from: f, reason: collision with root package name */
    public f3.d f48500f = new f3.d();

    /* renamed from: g, reason: collision with root package name */
    public short[] f48501g = new short[192];

    /* renamed from: h, reason: collision with root package name */
    public short[] f48502h = new short[12];

    /* renamed from: i, reason: collision with root package name */
    public short[] f48503i = new short[12];

    /* renamed from: j, reason: collision with root package name */
    public short[] f48504j = new short[12];

    /* renamed from: k, reason: collision with root package name */
    public short[] f48505k = new short[12];

    /* renamed from: l, reason: collision with root package name */
    public short[] f48506l = new short[192];

    /* renamed from: m, reason: collision with root package name */
    public f3.b[] f48507m = new f3.b[4];

    /* renamed from: n, reason: collision with root package name */
    public short[] f48508n = new short[114];

    /* renamed from: o, reason: collision with root package name */
    public f3.b f48509o = new f3.b(4);

    /* renamed from: p, reason: collision with root package name */
    public b f48510p = new b();

    /* renamed from: q, reason: collision with root package name */
    public b f48511q = new b();

    /* renamed from: r, reason: collision with root package name */
    public C0584c f48512r = new C0584c();

    /* renamed from: s, reason: collision with root package name */
    public int[] f48513s = new int[548];

    /* renamed from: t, reason: collision with root package name */
    public int f48514t = 32;
    public int[] A = new int[256];
    public int[] B = new int[512];
    public int[] C = new int[16];
    public int E = 44;
    public int F = 2;
    public int G = 3;
    public int H = 0;
    public int I = 3;
    public int J = 4194304;
    public int K = -1;
    public int L = -1;
    public int P = 1;
    public boolean Q = false;
    public boolean R = false;
    public int[] S = new int[4];
    public int[] T = new int[4];
    public long[] V = new long[1];
    public long[] W = new long[1];
    public boolean[] X = new boolean[1];
    public byte[] Y = new byte[5];
    public int[] Z = new int[128];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public short[] f48521a = new short[2];

        /* renamed from: b, reason: collision with root package name */
        public f3.b[] f48522b = new f3.b[16];

        /* renamed from: c, reason: collision with root package name */
        public f3.b[] f48523c = new f3.b[16];

        /* renamed from: d, reason: collision with root package name */
        public f3.b f48524d = new f3.b(8);

        public a() {
            for (int i11 = 0; i11 < 16; i11++) {
                this.f48522b[i11] = new f3.b(3);
                this.f48523c[i11] = new f3.b(3);
            }
        }

        public void a(f3.d dVar, int i11, int i12) throws IOException {
            if (i11 < 8) {
                dVar.a(this.f48521a, 0, 0);
                this.f48522b[i12].a(dVar, i11);
                return;
            }
            int i13 = i11 - 8;
            dVar.a(this.f48521a, 0, 1);
            if (i13 < 8) {
                dVar.a(this.f48521a, 1, 0);
                this.f48523c[i12].a(dVar, i13);
            } else {
                dVar.a(this.f48521a, 1, 1);
                this.f48524d.a(dVar, i11 - 16);
            }
        }

        public void b(int i11) {
            f3.d.j(this.f48521a);
            for (int i12 = 0; i12 < i11; i12++) {
                this.f48522b[i12].c();
                this.f48523c[i12].c();
            }
            this.f48524d.c();
        }

        public void c(int i11, int i12, int[] iArr, int i13) {
            int i14 = 0;
            int f11 = f3.d.f(this.f48521a[0]);
            int g11 = f3.d.g(this.f48521a[0]);
            int f12 = f3.d.f(this.f48521a[1]) + g11;
            int g12 = g11 + f3.d.g(this.f48521a[1]);
            while (i14 < 8) {
                if (i14 >= i12) {
                    return;
                }
                iArr[i13 + i14] = this.f48522b[i11].b(i14) + f11;
                i14++;
            }
            while (i14 < 16) {
                if (i14 >= i12) {
                    return;
                }
                iArr[i13 + i14] = this.f48523c[i11].b(i14 - 8) + f12;
                i14++;
            }
            while (i14 < i12) {
                iArr[i13 + i14] = this.f48524d.b(i14 - 16) + g12;
                i14++;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends a {

        /* renamed from: f, reason: collision with root package name */
        public int[] f48526f;

        /* renamed from: g, reason: collision with root package name */
        public int f48527g;

        /* renamed from: h, reason: collision with root package name */
        public int[] f48528h;

        public b() {
            super();
            this.f48526f = new int[f.f11637o1];
            this.f48528h = new int[16];
        }

        @Override // e3.c.a
        public void a(f3.d dVar, int i11, int i12) throws IOException {
            super.a(dVar, i11, i12);
            int[] iArr = this.f48528h;
            int i13 = iArr[i12] - 1;
            iArr[i12] = i13;
            if (i13 == 0) {
                f(i12);
            }
        }

        public int d(int i11, int i12) {
            return this.f48526f[(i12 * e3.a.f48454z) + i11];
        }

        public void e(int i11) {
            this.f48527g = i11;
        }

        public void f(int i11) {
            c(i11, this.f48527g, this.f48526f, i11 * e3.a.f48454z);
            this.f48528h[i11] = this.f48527g;
        }

        public void g(int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                f(i12);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: e3.c$c, reason: collision with other inner class name */
    public class C0584c {

        /* renamed from: a, reason: collision with root package name */
        public a[] f48530a;

        /* renamed from: b, reason: collision with root package name */
        public int f48531b;

        /* renamed from: c, reason: collision with root package name */
        public int f48532c;

        /* renamed from: d, reason: collision with root package name */
        public int f48533d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: e3.c$c$a */
        public class a {

            /* renamed from: a, reason: collision with root package name */
            public short[] f48535a = new short[768];

            public a() {
            }

            public void a(f3.d dVar, byte b11) throws IOException {
                int i11 = 1;
                for (int i12 = 7; i12 >= 0; i12--) {
                    int i13 = (b11 >> i12) & 1;
                    dVar.a(this.f48535a, i11, i13);
                    i11 = (i11 << 1) | i13;
                }
            }

            public void b(f3.d dVar, byte b11, byte b12) throws IOException {
                int i11;
                int i12 = 1;
                boolean z11 = true;
                for (int i13 = 7; i13 >= 0; i13--) {
                    int i14 = (b12 >> i13) & 1;
                    if (z11) {
                        int i15 = (b11 >> i13) & 1;
                        i11 = ((i15 + 1) << 8) + i12;
                        z11 = i15 == i14;
                    } else {
                        i11 = i12;
                    }
                    dVar.a(this.f48535a, i11, i14);
                    i12 = (i12 << 1) | i14;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:7:0x0021). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public int c(boolean r8, byte r9, byte r10) {
                /*
                    r7 = this;
                    r0 = 0
                    r1 = 1
                    r2 = 7
                    if (r8 == 0) goto L27
                    r8 = r1
                L6:
                    if (r2 < 0) goto L28
                    int r3 = r9 >> r2
                    r3 = r3 & r1
                    int r4 = r10 >> r2
                    r4 = r4 & r1
                    short[] r5 = r7.f48535a
                    int r6 = r3 + 1
                    int r6 = r6 << 8
                    int r6 = r6 + r8
                    short r5 = r5[r6]
                    int r5 = f3.d.e(r5, r4)
                    int r0 = r0 + r5
                    int r8 = r8 << 1
                    r8 = r8 | r4
                    if (r3 == r4) goto L24
                L21:
                    int r2 = r2 + (-1)
                    goto L28
                L24:
                    int r2 = r2 + (-1)
                    goto L6
                L27:
                    r8 = r1
                L28:
                    if (r2 < 0) goto L39
                    int r9 = r10 >> r2
                    r9 = r9 & r1
                    short[] r3 = r7.f48535a
                    short r3 = r3[r8]
                    int r3 = f3.d.e(r3, r9)
                    int r0 = r0 + r3
                    int r8 = r8 << r1
                    r8 = r8 | r9
                    goto L21
                L39:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: e3.c.C0584c.a.c(boolean, byte, byte):int");
            }

            public void d() {
                f3.d.j(this.f48535a);
            }
        }

        public C0584c() {
        }

        public void a(int i11, int i12) {
            if (this.f48530a != null && this.f48531b == i12 && this.f48532c == i11) {
                return;
            }
            this.f48532c = i11;
            this.f48533d = (1 << i11) - 1;
            this.f48531b = i12;
            int i13 = 1 << (i12 + i11);
            this.f48530a = new a[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                this.f48530a[i14] = new a();
            }
        }

        public a b(int i11, byte b11) {
            a[] aVarArr = this.f48530a;
            int i12 = i11 & this.f48533d;
            int i13 = this.f48531b;
            return aVarArr[(i12 << i13) + ((b11 & 255) >>> (8 - i13))];
        }

        public void c() {
            int i11 = 1 << (this.f48531b + this.f48532c);
            for (int i12 = 0; i12 < i11; i12++) {
                this.f48530a[i12].d();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        public int f48537a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f48538b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f48539c;

        /* renamed from: d, reason: collision with root package name */
        public int f48540d;

        /* renamed from: e, reason: collision with root package name */
        public int f48541e;

        /* renamed from: f, reason: collision with root package name */
        public int f48542f;

        /* renamed from: g, reason: collision with root package name */
        public int f48543g;

        /* renamed from: h, reason: collision with root package name */
        public int f48544h;

        /* renamed from: i, reason: collision with root package name */
        public int f48545i;

        /* renamed from: j, reason: collision with root package name */
        public int f48546j;

        /* renamed from: k, reason: collision with root package name */
        public int f48547k;

        /* renamed from: l, reason: collision with root package name */
        public int f48548l;

        public d() {
        }

        public boolean a() {
            return this.f48544h == 0;
        }

        public void b() {
            this.f48544h = -1;
            this.f48538b = false;
        }

        public void c() {
            this.f48544h = 0;
            this.f48538b = false;
        }
    }

    static {
        byte[] bArr = new byte[2048];
        f48488e0 = bArr;
        bArr[0] = 0;
        bArr[1] = 1;
        int i11 = 2;
        for (int i12 = 2; i12 < 22; i12++) {
            int i13 = 1 << ((i12 >> 1) - 1);
            int i14 = 0;
            while (i14 < i13) {
                f48488e0[i11] = (byte) i12;
                i14++;
                i11++;
            }
        }
    }

    public c() {
        for (int i11 = 0; i11 < 4096; i11++) {
            this.f48498d[i11] = new d();
        }
        for (int i12 = 0; i12 < 4; i12++) {
            this.f48507m[i12] = new f3.b(6);
        }
    }

    public static int l(int i11) {
        return i11 < 2048 ? f48488e0[i11] : i11 < 2097152 ? f48488e0[i11 >> 10] + 20 : f48488e0[i11 >> 20] + 40;
    }

    public static int m(int i11) {
        return i11 < 131072 ? f48488e0[i11 >> 6] + 12 : i11 < 134217728 ? f48488e0[i11 >> 16] + 32 : f48488e0[i11 >> 26] + 52;
    }

    public boolean A(int i11) {
        if (i11 < 0 || i11 > 2) {
            return false;
        }
        int i12 = this.P;
        this.P = i11;
        if (this.f48499e == null || i12 == i11) {
            return true;
        }
        this.K = -1;
        this.f48499e = null;
        return true;
    }

    public boolean B(int i11) {
        if (i11 < 5 || i11 > 273) {
            return false;
        }
        this.f48514t = i11;
        return true;
    }

    public void C(OutputStream outputStream) {
        this.f48500f.l(outputStream);
    }

    public void D(InputStream inputStream, OutputStream outputStream, long j11, long j12) {
        this.O = inputStream;
        this.N = false;
        f();
        C(outputStream);
        q();
        h();
        g();
        this.f48510p.e(this.f48514t - 1);
        this.f48510p.g(1 << this.F);
        this.f48511q.e(this.f48514t - 1);
        this.f48511q.g(1 << this.F);
        this.M = 0L;
    }

    public void E(boolean z11) {
        this.Q = z11;
    }

    public void F(OutputStream outputStream) throws IOException {
        this.Y[0] = (byte) ((((this.F * 5) + this.H) * 9) + this.I);
        int i11 = 0;
        while (i11 < 4) {
            int i12 = i11 + 1;
            this.Y[i12] = (byte) (this.J >> (i11 * 8));
            i11 = i12;
        }
        outputStream.write(this.Y, 0, 5);
    }

    public void G(int i11) throws IOException {
        if (this.Q) {
            this.f48500f.a(this.f48501g, (this.f48494a << 4) + i11, 1);
            this.f48500f.a(this.f48502h, this.f48494a, 0);
            this.f48494a = e3.a.e(this.f48494a);
            this.f48510p.a(this.f48500f, 0, i11);
            this.f48507m[e3.a.a(2)].a(this.f48500f, 63);
            this.f48500f.b(RectListKt.Lower26Bits, 26);
            this.f48509o.d(this.f48500f, 15);
        }
    }

    public int a(int i11) {
        this.f48518x = i11;
        d dVar = this.f48498d[i11];
        int i12 = dVar.f48543g;
        int i13 = dVar.f48544h;
        while (true) {
            d[] dVarArr = this.f48498d;
            if (dVarArr[i11].f48538b) {
                dVarArr[i12].b();
                d[] dVarArr2 = this.f48498d;
                int i14 = i12 - 1;
                dVarArr2[i12].f48543g = i14;
                d dVar2 = dVarArr2[i11];
                if (dVar2.f48539c) {
                    d dVar3 = dVarArr2[i14];
                    dVar3.f48538b = false;
                    dVar3.f48543g = dVar2.f48540d;
                    dVar3.f48544h = dVar2.f48541e;
                }
            }
            d[] dVarArr3 = this.f48498d;
            d dVar4 = dVarArr3[i12];
            int i15 = dVar4.f48544h;
            int i16 = dVar4.f48543g;
            dVar4.f48544h = i13;
            dVar4.f48543g = i11;
            if (i12 <= 0) {
                d dVar5 = dVarArr3[0];
                this.U = dVar5.f48544h;
                int i17 = dVar5.f48543g;
                this.f48519y = i17;
                return i17;
            }
            i11 = i12;
            i13 = i15;
            i12 = i16;
        }
    }

    public void b() {
        this.f48494a = e3.a.b();
        this.f48496b = (byte) 0;
        for (int i11 = 0; i11 < 4; i11++) {
            this.f48497c[i11] = 0;
        }
    }

    public boolean c(int i11, int i12) {
        return i11 < 33554432 && i12 >= (i11 << 7);
    }

    public void d(InputStream inputStream, OutputStream outputStream, long j11, long j12, c3.b bVar) throws IOException {
        this.R = false;
        try {
            D(inputStream, outputStream, j11, j12);
            while (true) {
                try {
                    e(this.V, this.W, this.X);
                    if (this.X[0]) {
                        v();
                        return;
                    } else if (bVar != null) {
                        bVar.a(this.V[0], this.W[0]);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    v();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void e(long[] jArr, long[] jArr2, boolean[] zArr) throws IOException {
        jArr[0] = 0;
        jArr2[0] = 0;
        zArr[0] = true;
        InputStream inputStream = this.O;
        if (inputStream != null) {
            this.f48499e.l(inputStream);
            this.f48499e.f();
            this.R = true;
            this.O = null;
        }
        if (this.N) {
            return;
        }
        this.N = true;
        long j11 = this.M;
        if (j11 == 0) {
            if (this.f48499e.e() == 0) {
                i((int) this.M);
                return;
            }
            s();
            this.f48500f.a(this.f48501g, (this.f48494a << 4) + (((int) this.M) & this.G), 0);
            this.f48494a = e3.a.d(this.f48494a);
            byte c11 = this.f48499e.c(0 - this.f48517w);
            this.f48512r.b((int) this.M, this.f48496b).a(this.f48500f, c11);
            this.f48496b = c11;
            this.f48517w--;
            this.M++;
        }
        if (this.f48499e.e() == 0) {
            i((int) this.M);
            return;
        }
        while (true) {
            int j12 = j((int) this.M);
            int i11 = this.U;
            int i12 = ((int) this.M) & this.G;
            int i13 = (this.f48494a << 4) + i12;
            if (j12 == 1 && i11 == -1) {
                this.f48500f.a(this.f48501g, i13, 0);
                byte c12 = this.f48499e.c(0 - this.f48517w);
                C0584c.a b11 = this.f48512r.b((int) this.M, this.f48496b);
                if (e3.a.c(this.f48494a)) {
                    b11.a(this.f48500f, c12);
                } else {
                    b11.b(this.f48500f, this.f48499e.c(((-1) - this.f48497c[0]) - this.f48517w), c12);
                }
                this.f48496b = c12;
                this.f48494a = e3.a.d(this.f48494a);
            } else {
                this.f48500f.a(this.f48501g, i13, 1);
                if (i11 < 4) {
                    this.f48500f.a(this.f48502h, this.f48494a, 1);
                    if (i11 == 0) {
                        this.f48500f.a(this.f48503i, this.f48494a, 0);
                        if (j12 == 1) {
                            this.f48500f.a(this.f48506l, i13, 0);
                        } else {
                            this.f48500f.a(this.f48506l, i13, 1);
                        }
                    } else {
                        this.f48500f.a(this.f48503i, this.f48494a, 1);
                        if (i11 == 1) {
                            this.f48500f.a(this.f48504j, this.f48494a, 0);
                        } else {
                            this.f48500f.a(this.f48504j, this.f48494a, 1);
                            this.f48500f.a(this.f48505k, this.f48494a, i11 - 2);
                        }
                    }
                    if (j12 == 1) {
                        this.f48494a = e3.a.g(this.f48494a);
                    } else {
                        this.f48511q.a(this.f48500f, j12 - 2, i12);
                        this.f48494a = e3.a.f(this.f48494a);
                    }
                    int i14 = this.f48497c[i11];
                    if (i11 != 0) {
                        while (i11 >= 1) {
                            int[] iArr = this.f48497c;
                            iArr[i11] = iArr[i11 - 1];
                            i11--;
                        }
                        this.f48497c[0] = i14;
                    }
                } else {
                    this.f48500f.a(this.f48502h, this.f48494a, 0);
                    this.f48494a = e3.a.e(this.f48494a);
                    this.f48510p.a(this.f48500f, j12 - 2, i12);
                    int i15 = i11 - 4;
                    int l11 = l(i15);
                    this.f48507m[e3.a.a(j12)].a(this.f48500f, l11);
                    if (l11 >= 4) {
                        int i16 = l11 >> 1;
                        int i17 = i16 - 1;
                        int i18 = ((l11 & 1) | 2) << i17;
                        int i19 = i15 - i18;
                        if (l11 < 14) {
                            f3.b.e(this.f48508n, (i18 - l11) - 1, this.f48500f, i17, i19);
                        } else {
                            this.f48500f.b(i19 >> 4, i16 - 5);
                            this.f48509o.d(this.f48500f, i19 & 15);
                            this.D++;
                        }
                    }
                    for (int i21 = 3; i21 >= 1; i21--) {
                        int[] iArr2 = this.f48497c;
                        iArr2[i21] = iArr2[i21 - 1];
                    }
                    this.f48497c[0] = i15;
                    this.f48495a0++;
                }
                this.f48496b = this.f48499e.c((j12 - 1) - this.f48517w);
            }
            int i22 = this.f48517w - j12;
            this.f48517w = i22;
            this.M += j12;
            if (i22 == 0) {
                if (this.f48495a0 >= 128) {
                    h();
                }
                if (this.D >= 16) {
                    g();
                }
                jArr[0] = this.M;
                jArr2[0] = this.f48500f.h();
                if (this.f48499e.e() == 0) {
                    i((int) this.M);
                    return;
                } else if (this.M - j11 >= 4096) {
                    this.N = false;
                    zArr[0] = false;
                    return;
                }
            }
        }
    }

    public void f() {
        if (this.f48499e == null) {
            d3.a aVar = new d3.a();
            aVar.r(this.P == 0 ? 2 : 4);
            this.f48499e = aVar;
        }
        this.f48512r.a(this.H, this.I);
        int i11 = this.J;
        if (i11 == this.K && this.L == this.f48514t) {
            return;
        }
        this.f48499e.m(i11, 4096, this.f48514t, DefaultImageHeaderParser.f28794q);
        this.K = this.J;
        this.L = this.f48514t;
    }

    public void g() {
        for (int i11 = 0; i11 < 16; i11++) {
            this.C[i11] = this.f48509o.f(i11);
        }
        this.D = 0;
    }

    public void h() {
        for (int i11 = 4; i11 < 128; i11++) {
            int l11 = l(i11);
            int i12 = (l11 >> 1) - 1;
            this.Z[i11] = f3.b.g(this.f48508n, (r4 - l11) - 1, i12, i11 - (((l11 & 1) | 2) << i12));
        }
        for (int i13 = 0; i13 < 4; i13++) {
            f3.b bVar = this.f48507m[i13];
            int i14 = i13 << 6;
            for (int i15 = 0; i15 < this.E; i15++) {
                this.A[i14 + i15] = bVar.b(i15);
            }
            for (int i16 = 14; i16 < this.E; i16++) {
                int[] iArr = this.A;
                int i17 = i14 + i16;
                iArr[i17] = iArr[i17] + (((i16 >> 1) - 5) << 6);
            }
            int i18 = i13 * 128;
            int i19 = 0;
            while (i19 < 4) {
                this.B[i18 + i19] = this.A[i14 + i19];
                i19++;
            }
            while (i19 < 128) {
                this.B[i18 + i19] = this.A[l(i19) + i14] + this.Z[i19];
                i19++;
            }
        }
        this.f48495a0 = 0;
    }

    public void i(int i11) throws IOException {
        t();
        G(i11 & this.G);
        this.f48500f.c();
        this.f48500f.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x065f A[EDGE_INSN: B:216:0x065f->B:217:0x065f BREAK  A[LOOP:14: B:197:0x0573->B:222:0x066e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x066e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x054a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int j(int r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.c.j(int):int");
    }

    public int k(int i11, int i12, int i13) {
        int i14;
        int a11 = e3.a.a(i12);
        if (i11 < 128) {
            i14 = this.B[(a11 * 128) + i11];
        } else {
            i14 = this.C[i11 & 15] + this.A[(a11 << 6) + m(i11)];
        }
        return i14 + this.f48510p.d(i12 - 2, i13);
    }

    public int n(int i11, int i12, int i13) {
        int e11;
        if (i11 == 0) {
            return f3.d.f(this.f48503i[i12]) + f3.d.g(this.f48506l[(i12 << 4) + i13]);
        }
        int g11 = f3.d.g(this.f48503i[i12]);
        if (i11 == 1) {
            e11 = f3.d.f(this.f48504j[i12]);
        } else {
            g11 += f3.d.g(this.f48504j[i12]);
            e11 = f3.d.e(this.f48505k[i12], i11 - 2);
        }
        return g11 + e11;
    }

    public int o(int i11, int i12) {
        return f3.d.f(this.f48503i[i11]) + f3.d.f(this.f48506l[(i11 << 4) + i12]);
    }

    public int p(int i11, int i12, int i13, int i14) {
        return this.f48511q.d(i12 - 2, i14) + n(i11, i13, i14);
    }

    public void q() {
        b();
        this.f48500f.i();
        f3.d.j(this.f48501g);
        f3.d.j(this.f48506l);
        f3.d.j(this.f48502h);
        f3.d.j(this.f48503i);
        f3.d.j(this.f48504j);
        f3.d.j(this.f48505k);
        f3.d.j(this.f48508n);
        this.f48512r.c();
        for (int i11 = 0; i11 < 4; i11++) {
            this.f48507m[i11].c();
        }
        this.f48510p.b(1 << this.F);
        this.f48511q.b(1 << this.F);
        this.f48509o.c();
        this.f48520z = false;
        this.f48518x = 0;
        this.f48519y = 0;
        this.f48517w = 0;
    }

    public void r(int i11) throws IOException {
        if (i11 > 0) {
            this.f48499e.s(i11);
            this.f48517w += i11;
        }
    }

    public int s() throws IOException {
        int i11;
        int n11 = this.f48499e.n(this.f48513s);
        this.f48516v = n11;
        if (n11 > 0) {
            int[] iArr = this.f48513s;
            i11 = iArr[n11 - 2];
            if (i11 == this.f48514t) {
                i11 += this.f48499e.d(i11 - 1, iArr[n11 - 1], 273 - i11);
            }
        } else {
            i11 = 0;
        }
        this.f48517w++;
        return i11;
    }

    public void t() {
        d3.a aVar = this.f48499e;
        if (aVar == null || !this.R) {
            return;
        }
        aVar.k();
        this.R = false;
    }

    public void u() {
        this.f48500f.k();
    }

    public void v() {
        t();
        u();
    }

    public boolean w(int i11) {
        return true;
    }

    public boolean x(int i11) {
        int i12 = 0;
        if (i11 < 1 || i11 > 536870912) {
            return false;
        }
        this.J = i11;
        while (i11 > (1 << i12)) {
            i12++;
        }
        this.E = i12 * 2;
        return true;
    }

    public void y(boolean z11) {
        this.Q = z11;
    }

    public boolean z(int i11, int i12, int i13) {
        if (i12 < 0 || i12 > 4 || i11 < 0 || i11 > 8 || i13 < 0 || i13 > 4) {
            return false;
        }
        this.H = i12;
        this.I = i11;
        this.F = i13;
        this.G = (1 << i13) - 1;
        return true;
    }
}
