package org.mozilla.classfile;

import com.jiongji.andriod.card.R;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import kb0.b;
import kb0.c;
import kb0.d;
import kb0.e;
import kb0.g;
import kb0.h;
import l70.f;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.UintMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ClassFileWriter {
    public static final short C = 1;
    public static final short D = 2;
    public static final short E = 4;
    public static final short F = 8;
    public static final short G = 16;
    public static final short H = 32;
    public static final short I = 32;
    public static final short J = 64;
    public static final short K = 128;
    public static final short L = 256;
    public static final short M = 1024;
    public static final int N = 4;
    public static final int O = 16;
    public static final int P = 4;
    public static final int Q;
    public static final int R;
    public static final boolean S;
    public static final int T = -889275714;
    public static final boolean U = false;
    public static final boolean V = false;
    public static final boolean W = false;
    public static final int X = 32;
    public static final int Y = 40;
    public ObjArray A;

    /* renamed from: d, reason: collision with root package name */
    public String f78321d;

    /* renamed from: e, reason: collision with root package name */
    public e[] f78322e;

    /* renamed from: f, reason: collision with root package name */
    public int f78323f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f78324g;

    /* renamed from: h, reason: collision with root package name */
    public int f78325h;

    /* renamed from: j, reason: collision with root package name */
    public int f78327j;

    /* renamed from: k, reason: collision with root package name */
    public d f78328k;

    /* renamed from: l, reason: collision with root package name */
    public c f78329l;

    /* renamed from: m, reason: collision with root package name */
    public short f78330m;

    /* renamed from: n, reason: collision with root package name */
    public short f78331n;

    /* renamed from: o, reason: collision with root package name */
    public short f78332o;

    /* renamed from: s, reason: collision with root package name */
    public short f78336s;

    /* renamed from: t, reason: collision with root package name */
    public short f78337t;

    /* renamed from: u, reason: collision with root package name */
    public short f78338u;

    /* renamed from: v, reason: collision with root package name */
    public short f78339v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f78340w;

    /* renamed from: x, reason: collision with root package name */
    public int f78341x;

    /* renamed from: y, reason: collision with root package name */
    public long[] f78342y;

    /* renamed from: z, reason: collision with root package name */
    public int f78343z;

    /* renamed from: a, reason: collision with root package name */
    public int[] f78318a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f78319b = 0;

    /* renamed from: c, reason: collision with root package name */
    public UintMap f78320c = null;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f78326i = new byte[256];

    /* renamed from: p, reason: collision with root package name */
    public ObjArray f78333p = new ObjArray();

    /* renamed from: q, reason: collision with root package name */
    public ObjArray f78334q = new ObjArray();

    /* renamed from: r, reason: collision with root package name */
    public ObjArray f78335r = new ObjArray();
    public char[] B = new char[64];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ClassFileFormatException extends RuntimeException {
        private static final long serialVersionUID = 1263998431033790599L;

        public ClassFileFormatException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a {

        /* renamed from: m, reason: collision with root package name */
        public static final boolean f78344m = false;

        /* renamed from: h, reason: collision with root package name */
        public g[] f78352h;

        /* renamed from: g, reason: collision with root package name */
        public g[] f78351g = null;

        /* renamed from: c, reason: collision with root package name */
        public int[] f78347c = null;

        /* renamed from: a, reason: collision with root package name */
        public int[] f78345a = null;

        /* renamed from: e, reason: collision with root package name */
        public g[] f78349e = null;

        /* renamed from: i, reason: collision with root package name */
        public byte[] f78353i = null;

        /* renamed from: b, reason: collision with root package name */
        public int f78346b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f78348d = 0;

        /* renamed from: f, reason: collision with root package name */
        public int f78350f = 0;

        /* renamed from: j, reason: collision with root package name */
        public int f78354j = 0;

        /* renamed from: k, reason: collision with root package name */
        public boolean f78355k = false;

        public a() {
        }

        public final void A(int i11) {
            int i12 = this.f78348d;
            if (i12 == this.f78347c.length) {
                int[] iArr = new int[Math.max(i12 * 2, 4)];
                System.arraycopy(this.f78347c, 0, iArr, 0, this.f78348d);
                this.f78347c = iArr;
            }
            int[] iArr2 = this.f78347c;
            int i13 = this.f78348d;
            this.f78348d = i13 + 1;
            iArr2[i13] = i11;
        }

        public final void B(long j11) {
            A((int) (j11 & 16777215));
            long j12 = j11 >>> 32;
            if (j12 != 0) {
                A((int) (j12 & 16777215));
            }
        }

        public final void C(int i11, int i12) {
            int i13 = this.f78346b;
            if (i11 >= i13) {
                int i14 = i11 + 1;
                int[] iArr = new int[i14];
                System.arraycopy(this.f78345a, 0, iArr, 0, i13);
                this.f78345a = iArr;
                this.f78346b = i14;
            }
            this.f78345a[i11] = i12;
        }

        public final void D() {
            int[] m02 = ClassFileWriter.this.m0();
            int i11 = 0;
            this.f78351g[0].i(m02, m02.length, new int[0], 0, ClassFileWriter.this.f78328k);
            this.f78349e = new g[]{this.f78351g[0]};
            this.f78350f = 1;
            j();
            while (true) {
                g[] gVarArr = this.f78351g;
                if (i11 >= gVarArr.length) {
                    j();
                    return;
                }
                g gVar = gVarArr[i11];
                if (!gVar.h()) {
                    x(gVar);
                }
                i11++;
            }
        }

        public int E(byte[] bArr, int i11) {
            int G0 = ClassFileWriter.G0(this.f78351g.length - 1, bArr, ClassFileWriter.H0(this.f78354j + 2, bArr, i11));
            System.arraycopy(this.f78353i, 0, bArr, G0, this.f78354j);
            return G0 + this.f78354j;
        }

        public final void F(int[] iArr, int i11, int i12) {
            int length = iArr.length - i11;
            byte[] bArr = this.f78353i;
            int i13 = this.f78354j;
            int i14 = i13 + 1;
            this.f78354j = i14;
            bArr[i13] = (byte) (i11 + R.styleable.Theme_drawable_wiki_sound);
            this.f78354j = ClassFileWriter.G0(i12, bArr, i14);
            this.f78354j = M(iArr, length);
        }

        public final void G(int i11, int i12) {
            byte[] bArr = this.f78353i;
            int i13 = this.f78354j;
            int i14 = i13 + 1;
            this.f78354j = i14;
            bArr[i13] = (byte) (251 - i11);
            this.f78354j = ClassFileWriter.G0(i12, bArr, i14);
        }

        public final void H(int[] iArr, int[] iArr2, int i11) {
            byte[] bArr = this.f78353i;
            int i12 = this.f78354j;
            int i13 = i12 + 1;
            this.f78354j = i13;
            bArr[i12] = -1;
            int G0 = ClassFileWriter.G0(i11, bArr, i13);
            this.f78354j = G0;
            this.f78354j = ClassFileWriter.G0(iArr.length, this.f78353i, G0);
            int L = L(iArr);
            this.f78354j = L;
            this.f78354j = ClassFileWriter.G0(iArr2.length, this.f78353i, L);
            this.f78354j = L(iArr2);
        }

        public final void I(int[] iArr, int i11) {
            if (i11 <= 63) {
                byte[] bArr = this.f78353i;
                int i12 = this.f78354j;
                this.f78354j = i12 + 1;
                bArr[i12] = (byte) i11;
                return;
            }
            byte[] bArr2 = this.f78353i;
            int i13 = this.f78354j;
            int i14 = i13 + 1;
            this.f78354j = i14;
            bArr2[i13] = -5;
            this.f78354j = ClassFileWriter.G0(i11, bArr2, i14);
        }

        public final void J(int[] iArr, int[] iArr2, int i11) {
            if (i11 <= 63) {
                byte[] bArr = this.f78353i;
                int i12 = this.f78354j;
                this.f78354j = i12 + 1;
                bArr[i12] = (byte) (i11 + 64);
            } else {
                byte[] bArr2 = this.f78353i;
                int i13 = this.f78354j;
                int i14 = i13 + 1;
                this.f78354j = i14;
                bArr2[i13] = -9;
                this.f78354j = ClassFileWriter.G0(i11, bArr2, i14);
            }
            K(iArr2[0]);
        }

        public final int K(int i11) {
            int i12 = i11 & 255;
            byte[] bArr = this.f78353i;
            int i13 = this.f78354j;
            int i14 = i13 + 1;
            this.f78354j = i14;
            bArr[i13] = (byte) i12;
            if (i12 == 7 || i12 == 8) {
                this.f78354j = ClassFileWriter.G0(i11 >>> 8, bArr, i14);
            }
            return this.f78354j;
        }

        public final int L(int[] iArr) {
            return M(iArr, 0);
        }

        public final int M(int[] iArr, int i11) {
            while (i11 < iArr.length) {
                this.f78354j = K(iArr[i11]);
                i11++;
            }
            return this.f78354j;
        }

        public final void a(g gVar) {
            if (gVar.g()) {
                return;
            }
            gVar.k(true);
            gVar.l(true);
            int i11 = this.f78350f;
            g[] gVarArr = this.f78349e;
            if (i11 == gVarArr.length) {
                g[] gVarArr2 = new g[i11 * 2];
                System.arraycopy(gVarArr, 0, gVarArr2, 0, i11);
                this.f78349e = gVarArr2;
            }
            g[] gVarArr3 = this.f78349e;
            int i12 = this.f78350f;
            this.f78350f = i12 + 1;
            gVarArr3[i12] = gVar;
        }

        public final void b() {
            this.f78348d = 0;
        }

        public final void c() {
            int[] f11 = this.f78351g[0].f();
            int i11 = -1;
            int i12 = 1;
            while (true) {
                g[] gVarArr = this.f78351g;
                if (i12 >= gVarArr.length) {
                    return;
                }
                g gVar = gVarArr[i12];
                int[] f12 = gVar.f();
                int[] d11 = gVar.d();
                int e11 = (gVar.e() - i11) - 1;
                if (d11.length == 0) {
                    int length = f11.length > f12.length ? f12.length : f11.length;
                    int abs = Math.abs(f11.length - f12.length);
                    int i13 = 0;
                    while (i13 < length && f11[i13] == f12[i13]) {
                        i13++;
                    }
                    if (i13 == f12.length && abs == 0) {
                        I(f12, e11);
                    } else if (i13 == f12.length && abs <= 3) {
                        G(abs, e11);
                    } else if (i13 != f11.length || abs > 3) {
                        H(f12, d11, e11);
                    } else {
                        F(f12, abs, e11);
                    }
                } else if (d11.length != 1) {
                    H(f12, d11, e11);
                } else if (Arrays.equals(f11, f12)) {
                    J(f12, d11, e11);
                } else {
                    H(f12, d11, e11);
                }
                i11 = gVar.e();
                i12++;
                f11 = f12;
            }
        }

        public int d() {
            this.f78353i = new byte[s()];
            c();
            return this.f78354j + 2;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:34:0x036c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0376  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int e(int r11) {
            /*
                Method dump skipped, instructions count: 1300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.mozilla.classfile.ClassFileWriter.a.e(int):int");
        }

        public final void f(int i11) {
            int n11 = n(i11);
            int h11 = h.h(n11);
            if (h11 == 7 || h11 == 6 || h11 == 8 || h11 == 5) {
                A(n11);
                return;
            }
            throw new IllegalStateException("bad local variable type: " + n11 + " at index: " + i11);
        }

        public final void g(int i11) {
            C(i11, y());
        }

        public final void h(g gVar) {
            int e11 = gVar.e();
            int i11 = 0;
            while (e11 < gVar.a()) {
                i11 = ClassFileWriter.this.f78326i[e11] & 255;
                int e12 = e(e11);
                if (v(i11)) {
                    k(m(e11));
                } else if (i11 == 170) {
                    int i12 = e11 + 1 + ((~e11) & 3);
                    k(r(p(i12, 4) + e11));
                    int p11 = (p(i12 + 8, 4) - p(i12 + 4, 4)) + 1;
                    int i13 = i12 + 12;
                    for (int i14 = 0; i14 < p11; i14++) {
                        k(r(p((i14 * 4) + i13, 4) + e11));
                    }
                }
                for (int i15 = 0; i15 < ClassFileWriter.this.f78323f; i15++) {
                    e eVar = ClassFileWriter.this.f78322e[i15];
                    short t02 = (short) ClassFileWriter.this.t0(eVar.f66306a);
                    short t03 = (short) ClassFileWriter.this.t0(eVar.f66307b);
                    if (e11 >= t02 && e11 < t03) {
                        g r11 = r((short) ClassFileWriter.this.t0(eVar.f66308c));
                        short s11 = eVar.f66309d;
                        r11.i(this.f78345a, this.f78346b, new int[]{s11 == 0 ? h.a(ClassFileWriter.this.f78328k.a("java/lang/Throwable")) : h.a(s11)}, 1, ClassFileWriter.this.f78328k);
                        a(r11);
                    }
                }
                e11 += e12;
            }
            if (w(i11)) {
                return;
            }
            int b11 = gVar.b() + 1;
            g[] gVarArr = this.f78351g;
            if (b11 < gVarArr.length) {
                k(gVarArr[b11]);
            }
        }

        public final void i(int i11, int i12) {
            y();
            C(i11, i12);
        }

        public final void j() {
            while (true) {
                int i11 = this.f78350f;
                if (i11 <= 0) {
                    return;
                }
                g[] gVarArr = this.f78349e;
                int i12 = i11 - 1;
                this.f78350f = i12;
                g gVar = gVarArr[i12];
                gVar.k(false);
                this.f78345a = gVar.c();
                int[] d11 = gVar.d();
                this.f78347c = d11;
                this.f78346b = this.f78345a.length;
                this.f78348d = d11.length;
                h(gVar);
            }
        }

        public final void k(g gVar) {
            if (gVar.i(this.f78345a, this.f78346b, this.f78347c, this.f78348d, ClassFileWriter.this.f78328k)) {
                a(gVar);
            }
        }

        public void l() {
            this.f78351g = new g[ClassFileWriter.this.f78319b];
            int[] m02 = ClassFileWriter.this.m0();
            int i11 = 0;
            while (i11 < ClassFileWriter.this.f78319b) {
                this.f78351g[i11] = new g(i11, ClassFileWriter.this.f78318a[i11], i11 == ClassFileWriter.this.f78319b + (-1) ? ClassFileWriter.this.f78327j : ClassFileWriter.this.f78318a[i11 + 1], m02);
                i11++;
            }
            this.f78352h = q();
            D();
        }

        public final g m(int i11) {
            return r(i11 + ((ClassFileWriter.this.f78326i[i11] & 255) == 200 ? p(i11 + 1, 4) : (short) p(i11 + 1, 2)));
        }

        public final int n(int i11) {
            if (i11 < this.f78346b) {
                return this.f78345a[i11];
            }
            return 0;
        }

        public final int o(int i11) {
            return p(i11, 1);
        }

        public final int p(int i11, int i12) {
            if (i12 > 4) {
                throw new IllegalArgumentException("bad operand size");
            }
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                i13 = (i13 << 8) | (ClassFileWriter.this.f78326i[i11 + i14] & 255);
            }
            return i13;
        }

        public final g[] q() {
            g[] gVarArr = new g[this.f78351g.length];
            for (int i11 = 0; i11 < ClassFileWriter.this.f78323f; i11++) {
                e eVar = ClassFileWriter.this.f78322e[i11];
                gVarArr[r((short) ClassFileWriter.this.t0(eVar.f66308c)).b()] = r((short) ClassFileWriter.this.t0(eVar.f66306a));
            }
            for (int i12 : ClassFileWriter.this.f78320c.getKeys()) {
                gVarArr[r(i12).b()] = r(ClassFileWriter.this.f78320c.getInt(i12, -1));
            }
            return gVarArr;
        }

        public final g r(int i11) {
            g gVar;
            int i12 = 0;
            while (true) {
                g[] gVarArr = this.f78351g;
                if (i12 >= gVarArr.length || (gVar = gVarArr[i12]) == null) {
                    break;
                }
                if (i11 >= gVar.e() && i11 < gVar.a()) {
                    return gVar;
                }
                i12++;
            }
            throw new IllegalArgumentException("bad offset: " + i11);
        }

        public final int s() {
            return (this.f78351g.length - 1) * ((ClassFileWriter.this.f78332o * 3) + 7 + (ClassFileWriter.this.f78331n * 3));
        }

        public final void t(int i11, int i12) {
            u(i11, i12, this.f78345a, this.f78346b);
            u(i11, i12, this.f78347c, this.f78348d);
        }

        public final void u(int i11, int i12, int[] iArr, int i13) {
            for (int i14 = 0; i14 < i13; i14++) {
                if (iArr[i14] == i11) {
                    iArr[i14] = i12;
                }
            }
        }

        public final boolean v(int i11) {
            switch (i11) {
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case 160:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                    return true;
                default:
                    switch (i11) {
                        case 198:
                        case 199:
                        case 200:
                            return true;
                        default:
                            return false;
                    }
            }
        }

        public final boolean w(int i11) {
            if (i11 == 167 || i11 == 191 || i11 == 200 || i11 == 176 || i11 == 177) {
                return true;
            }
            switch (i11) {
                case 170:
                case 171:
                case 172:
                case 173:
                case 174:
                    return true;
                default:
                    return false;
            }
        }

        public final void x(g gVar) {
            int[] iArr = new int[0];
            int[] iArr2 = {h.b("java/lang/Throwable", ClassFileWriter.this.f78328k)};
            for (int i11 = 0; i11 < ClassFileWriter.this.f78323f; i11++) {
                e eVar = ClassFileWriter.this.f78322e[i11];
                int t02 = ClassFileWriter.this.t0(eVar.f66306a);
                int t03 = ClassFileWriter.this.t0(eVar.f66307b);
                g r11 = r(ClassFileWriter.this.t0(eVar.f66308c));
                if ((gVar.e() > t02 && gVar.e() < t03) || (t02 > gVar.e() && t02 < gVar.a() && r11.h())) {
                    iArr = r11.c();
                    break;
                }
            }
            int[] iArr3 = iArr;
            int i12 = 0;
            while (i12 < ClassFileWriter.this.f78323f) {
                if (ClassFileWriter.this.t0(ClassFileWriter.this.f78322e[i12].f66306a) == gVar.e()) {
                    for (int i13 = i12 + 1; i13 < ClassFileWriter.this.f78323f; i13++) {
                        ClassFileWriter.this.f78322e[i13 - 1] = ClassFileWriter.this.f78322e[i13];
                    }
                    ClassFileWriter.k(ClassFileWriter.this);
                    i12--;
                }
                i12++;
            }
            gVar.i(iArr3, iArr3.length, iArr2, 1, ClassFileWriter.this.f78328k);
            int a11 = gVar.a() - 1;
            ClassFileWriter.this.f78326i[a11] = -65;
            for (int e11 = gVar.e(); e11 < a11; e11++) {
                ClassFileWriter.this.f78326i[e11] = 0;
            }
        }

        public final int y() {
            int[] iArr = this.f78347c;
            int i11 = this.f78348d - 1;
            this.f78348d = i11;
            return iArr[i11];
        }

        public final long z() {
            long y11 = y();
            return h.i((int) y11) ? y11 : (y11 << 32) | (y() & 16777215);
        }
    }

    static {
        int i11;
        byte[] bArr;
        InputStream inputStream = null;
        try {
            try {
                inputStream = ClassFileWriter.class.getResourceAsStream("ClassFileWriter.class");
                if (inputStream == null) {
                    inputStream = ClassLoader.getSystemResourceAsStream("org/mozilla/classfile/ClassFileWriter.class");
                }
                bArr = new byte[8];
                int i12 = 0;
                while (i12 < 8) {
                    int read = inputStream.read(bArr, i12, 8 - i12);
                    if (read < 0) {
                        throw new IOException();
                    }
                    i12 += read;
                }
                i11 = (bArr[4] << 8) | (bArr[5] & 255);
            } catch (IOException unused) {
                return;
            }
        } catch (Exception unused2) {
            i11 = 0;
        } catch (Throwable th2) {
            th = th2;
            i11 = 0;
        }
        try {
            int i13 = (bArr[7] & 255) | (bArr[6] << 8);
            R = i11;
            Q = i13;
            S = i13 >= 50;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Exception unused3) {
            R = i11;
            Q = 48;
            S = false;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th3) {
            th = th3;
            R = i11;
            Q = 48;
            S = false;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public ClassFileWriter(String str, String str2, String str3) {
        this.f78321d = str;
        d dVar = new d(this);
        this.f78328k = dVar;
        this.f78337t = dVar.a(str);
        this.f78338u = this.f78328k.a(str2);
        if (str3 != null) {
            this.f78339v = this.f78328k.k(str3);
        }
        this.f78336s = (short) 33;
    }

    public static int E0(int i11) {
        if (i11 == 254 || i11 == 255) {
            return 0;
        }
        switch (i11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
                return 0;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
                return 1;
            case 132:
                return 2;
            case 170:
            case 171:
                return -1;
            default:
                switch (i11) {
                    case 187:
                    case 188:
                    case 189:
                    case 192:
                    case 193:
                    case 198:
                    case 199:
                    case 200:
                    case 201:
                        return 1;
                    case 190:
                    case 191:
                    case 194:
                    case 195:
                    case 196:
                    case 202:
                        return 0;
                    case 197:
                        return 2;
                    default:
                        throw new IllegalArgumentException("Bad opcode: " + i11);
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int F0(int r3, boolean r4) {
        /*
            r0 = 254(0xfe, float:3.56E-43)
            if (r3 == r0) goto L38
            r0 = 255(0xff, float:3.57E-43)
            if (r3 == r0) goto L38
            r0 = 2
            r1 = 5
            r2 = 3
            switch(r3) {
                case 0: goto L38;
                case 1: goto L38;
                case 2: goto L38;
                case 3: goto L38;
                case 4: goto L38;
                case 5: goto L38;
                case 6: goto L38;
                case 7: goto L38;
                case 8: goto L38;
                case 9: goto L38;
                case 10: goto L38;
                case 11: goto L38;
                case 12: goto L38;
                case 13: goto L38;
                case 14: goto L38;
                case 15: goto L38;
                case 16: goto L37;
                case 17: goto L36;
                case 18: goto L37;
                case 19: goto L36;
                case 20: goto L36;
                case 21: goto L32;
                case 22: goto L32;
                case 23: goto L32;
                case 24: goto L32;
                case 25: goto L32;
                case 26: goto L38;
                case 27: goto L38;
                case 28: goto L38;
                case 29: goto L38;
                case 30: goto L38;
                case 31: goto L38;
                case 32: goto L38;
                case 33: goto L38;
                case 34: goto L38;
                case 35: goto L38;
                case 36: goto L38;
                case 37: goto L38;
                case 38: goto L38;
                case 39: goto L38;
                case 40: goto L38;
                case 41: goto L38;
                case 42: goto L38;
                case 43: goto L38;
                case 44: goto L38;
                case 45: goto L38;
                case 46: goto L38;
                case 47: goto L38;
                case 48: goto L38;
                case 49: goto L38;
                case 50: goto L38;
                case 51: goto L38;
                case 52: goto L38;
                case 53: goto L38;
                case 54: goto L32;
                case 55: goto L32;
                case 56: goto L32;
                case 57: goto L32;
                case 58: goto L32;
                case 59: goto L38;
                case 60: goto L38;
                case 61: goto L38;
                case 62: goto L38;
                case 63: goto L38;
                case 64: goto L38;
                case 65: goto L38;
                case 66: goto L38;
                case 67: goto L38;
                case 68: goto L38;
                case 69: goto L38;
                case 70: goto L38;
                case 71: goto L38;
                case 72: goto L38;
                case 73: goto L38;
                case 74: goto L38;
                case 75: goto L38;
                case 76: goto L38;
                case 77: goto L38;
                case 78: goto L38;
                case 79: goto L38;
                case 80: goto L38;
                case 81: goto L38;
                case 82: goto L38;
                case 83: goto L38;
                case 84: goto L38;
                case 85: goto L38;
                case 86: goto L38;
                case 87: goto L38;
                case 88: goto L38;
                case 89: goto L38;
                case 90: goto L38;
                case 91: goto L38;
                case 92: goto L38;
                case 93: goto L38;
                case 94: goto L38;
                case 95: goto L38;
                case 96: goto L38;
                case 97: goto L38;
                case 98: goto L38;
                case 99: goto L38;
                case 100: goto L38;
                case 101: goto L38;
                case 102: goto L38;
                case 103: goto L38;
                case 104: goto L38;
                case 105: goto L38;
                case 106: goto L38;
                case 107: goto L38;
                case 108: goto L38;
                case 109: goto L38;
                case 110: goto L38;
                case 111: goto L38;
                case 112: goto L38;
                case 113: goto L38;
                case 114: goto L38;
                case 115: goto L38;
                case 116: goto L38;
                case 117: goto L38;
                case 118: goto L38;
                case 119: goto L38;
                case 120: goto L38;
                case 121: goto L38;
                case 122: goto L38;
                case 123: goto L38;
                case 124: goto L38;
                case 125: goto L38;
                case 126: goto L38;
                case 127: goto L38;
                case 128: goto L38;
                case 129: goto L38;
                case 130: goto L38;
                case 131: goto L38;
                case 132: goto L2e;
                case 133: goto L38;
                case 134: goto L38;
                case 135: goto L38;
                case 136: goto L38;
                case 137: goto L38;
                case 138: goto L38;
                case 139: goto L38;
                case 140: goto L38;
                case 141: goto L38;
                case 142: goto L38;
                case 143: goto L38;
                case 144: goto L38;
                case 145: goto L38;
                case 146: goto L38;
                case 147: goto L38;
                case 148: goto L38;
                case 149: goto L38;
                case 150: goto L38;
                case 151: goto L38;
                case 152: goto L38;
                case 153: goto L36;
                case 154: goto L36;
                case 155: goto L36;
                case 156: goto L36;
                case 157: goto L36;
                case 158: goto L36;
                case 159: goto L36;
                case 160: goto L36;
                case 161: goto L36;
                case 162: goto L36;
                case 163: goto L36;
                case 164: goto L36;
                case 165: goto L36;
                case 166: goto L36;
                case 167: goto L36;
                case 168: goto L36;
                case 169: goto L32;
                default: goto Le;
            }
        Le:
            switch(r3) {
                case 172: goto L38;
                case 173: goto L38;
                case 174: goto L38;
                case 175: goto L38;
                case 176: goto L38;
                case 177: goto L38;
                case 178: goto L36;
                case 179: goto L36;
                case 180: goto L36;
                case 181: goto L36;
                case 182: goto L36;
                case 183: goto L36;
                case 184: goto L36;
                case 185: goto L2d;
                default: goto L11;
            }
        L11:
            switch(r3) {
                case 187: goto L36;
                case 188: goto L37;
                case 189: goto L36;
                case 190: goto L38;
                case 191: goto L38;
                case 192: goto L36;
                case 193: goto L36;
                case 194: goto L38;
                case 195: goto L38;
                case 196: goto L38;
                case 197: goto L2b;
                case 198: goto L36;
                case 199: goto L36;
                case 200: goto L2d;
                case 201: goto L2d;
                case 202: goto L38;
                default: goto L14;
            }
        L14:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Bad opcode: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L2b:
            r3 = 4
            return r3
        L2d:
            return r1
        L2e:
            if (r4 == 0) goto L31
            return r1
        L31:
            return r2
        L32:
            if (r4 == 0) goto L35
            return r2
        L35:
            return r0
        L36:
            return r2
        L37:
            return r0
        L38:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.classfile.ClassFileWriter.F0(int, boolean):int");
    }

    public static int G0(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) (i11 >>> 8);
        bArr[i12 + 1] = (byte) i11;
        return i12 + 2;
    }

    public static int H0(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) (i11 >>> 24);
        bArr[i12 + 1] = (byte) (i11 >>> 16);
        bArr[i12 + 2] = (byte) (i11 >>> 8);
        bArr[i12 + 3] = (byte) i11;
        return i12 + 4;
    }

    public static int I0(long j11, byte[] bArr, int i11) {
        return H0((int) j11, bArr, H0((int) (j11 >>> 32), bArr, i11));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:67:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int M0(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.classfile.ClassFileWriter.M0(java.lang.String):int");
    }

    public static int N0(int i11) {
        if (i11 == 254 || i11 == 255) {
            return 0;
        }
        switch (i11) {
            case 0:
            case 47:
            case 49:
            case 95:
            case 116:
            case 117:
            case 118:
            case 119:
            case 132:
            case 134:
            case 138:
            case 139:
            case 143:
            case 145:
            case 146:
            case 147:
            case 167:
            case 169:
            case 177:
            case 178:
            case 179:
            case 184:
                return 0;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 44:
            case 45:
            case 89:
            case 90:
            case 91:
            case 133:
            case 135:
            case 140:
            case 141:
            case 168:
                return 1;
            case 9:
            case 10:
            case 14:
            case 15:
            case 20:
            case 22:
            case 24:
            case 30:
            case 31:
            case 32:
            case 33:
            case 38:
            case 39:
            case 40:
            case 41:
            case 92:
            case 93:
            case 94:
                return 2;
            case 46:
            case 48:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 56:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 67:
            case 68:
            case 69:
            case 70:
            case 75:
            case 76:
            case 77:
            case 78:
            case 87:
            case 96:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 108:
            case 110:
            case 112:
            case 114:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 128:
            case 130:
            case 136:
            case 137:
            case 142:
            case 144:
            case 149:
            case 150:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 170:
            case 171:
            case 172:
            case 174:
            case 176:
            case 180:
            case 181:
            case 182:
            case 183:
            case 185:
                return -1;
            case 55:
            case 57:
            case 63:
            case 64:
            case 65:
            case 66:
            case 71:
            case 72:
            case 73:
            case 74:
            case 88:
            case 97:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 109:
            case 111:
            case 113:
            case 115:
            case 127:
            case 129:
            case 131:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 173:
            case 175:
                return -2;
            case 79:
            case 81:
            case 83:
            case 84:
            case 85:
            case 86:
            case 148:
            case 151:
            case 152:
                return -3;
            case 80:
            case 82:
                return -4;
            default:
                switch (i11) {
                    case 187:
                    case 197:
                    case 201:
                        return 1;
                    case 188:
                    case 189:
                    case 190:
                    case 192:
                    case 193:
                    case 196:
                    case 200:
                    case 202:
                        return 0;
                    case 191:
                    case 194:
                    case 195:
                    case 198:
                    case 199:
                        return -1;
                    default:
                        throw new IllegalArgumentException("Bad opcode: " + i11);
                }
        }
    }

    public static char h0(int i11) {
        switch (i11) {
            case 4:
                return 'Z';
            case 5:
                return 'C';
            case 6:
                return 'F';
            case 7:
                return 'D';
            case 8:
                return 'B';
            case 9:
                return 'S';
            case 10:
                return 'I';
            case 11:
                return 'J';
            default:
                throw new IllegalArgumentException("bad operand");
        }
    }

    public static void i0(int i11) {
        String str;
        if (i11 < 0) {
            str = "Stack underflow: " + i11;
        } else {
            str = "Too big stack: " + i11;
        }
        throw new IllegalStateException(str);
    }

    public static String j0(int i11) {
        return "";
    }

    public static /* synthetic */ int k(ClassFileWriter classFileWriter) {
        int i11 = classFileWriter.f78323f;
        classFileWriter.f78323f = i11 - 1;
        return i11;
    }

    public static String k0(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String l0(String str) {
        int length = str.length();
        int i11 = length + 1;
        int i12 = length + 2;
        char[] cArr = new char[i12];
        cArr[0] = 'L';
        cArr[i11] = f.f70689d;
        str.getChars(0, length, cArr, 1);
        for (int i13 = 1; i13 != i11; i13++) {
            if (cArr[i13] == '.') {
                cArr[i13] = '/';
            }
        }
        return new String(cArr, 0, i12);
    }

    public static String n0(String str) {
        char charAt = str.charAt(0);
        if (charAt == 'F') {
            return str;
        }
        if (charAt == 'L') {
            return k0(str);
        }
        if (charAt == 'S' || charAt == 'V' || charAt == 'I' || charAt == 'J' || charAt == 'Z' || charAt == '[') {
            return str;
        }
        switch (charAt) {
            case 'B':
            case 'C':
            case 'D':
                return str;
            default:
                throw new IllegalArgumentException("bad descriptor:" + str);
        }
    }

    public static String u0(String str) {
        return str.replace('.', '/');
    }

    public void A(int i11, int i12, int i13, String str) {
        if ((i11 & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Bad startLabel");
        }
        if ((i12 & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Bad endLabel");
        }
        if ((i13 & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Bad handlerLabel");
        }
        e eVar = new e(i11, i12, i13, str == null ? (short) 0 : this.f78328k.a(str));
        int i14 = this.f78323f;
        if (i14 == 0) {
            this.f78322e = new e[4];
        } else {
            e[] eVarArr = this.f78322e;
            if (i14 == eVarArr.length) {
                e[] eVarArr2 = new e[i14 * 2];
                System.arraycopy(eVarArr, 0, eVarArr2, 0, i14);
                this.f78322e = eVarArr2;
            }
        }
        this.f78322e[i14] = eVar;
        this.f78323f = i14 + 1;
    }

    public void A0(int i11, short s11) {
        z0(i11);
        this.f78330m = s11;
    }

    public void B(int i11) {
        S0(34, 23, i11);
    }

    public final void B0(int i11, int i12) {
        b0(this.f78327j);
        this.f78320c.put(this.f78327j, i11);
        L0(i11, i12, this.f78327j);
    }

    public void C(int i11) {
        S0(67, 56, i11);
    }

    public final void C0(int i11, int i12, int i13) {
        if (i13 < 0 || i13 > this.f78331n) {
            throw new IllegalArgumentException("Bad stack index: " + i13);
        }
        this.f78330m = (short) i13;
        b0(this.f78327j);
        this.f78320c.put(this.f78327j, i11);
        L0(i11, i12, this.f78327j);
    }

    public void D(String str, String str2, short s11) {
        this.f78334q.add(new b(this.f78328k.k(str), this.f78328k.k(str2), s11));
    }

    public final void D0(int i11) {
        b0(this.f78327j);
        this.f78320c.put(this.f78327j, i11);
        L0(i11, -1, this.f78327j);
    }

    public void E(String str, String str2, short s11, double d11) {
        b bVar = new b(this.f78328k.k(str), this.f78328k.k(str2), s11);
        bVar.b(this.f78328k.k("ConstantValue"), (short) 0, (short) 2, this.f78328k.b(d11));
        this.f78334q.add(bVar);
    }

    public void F(String str, String str2, short s11, int i11) {
        b bVar = new b(this.f78328k.k(str), this.f78328k.k(str2), s11);
        bVar.b(this.f78328k.k("ConstantValue"), (short) 0, (short) 0, this.f78328k.d(i11));
        this.f78334q.add(bVar);
    }

    public void G(String str, String str2, short s11, long j11) {
        b bVar = new b(this.f78328k.k(str), this.f78328k.k(str2), s11);
        bVar.b(this.f78328k.k("ConstantValue"), (short) 0, (short) 2, this.f78328k.e(j11));
        this.f78334q.add(bVar);
    }

    public void H(int i11) {
        S0(26, 21, i11);
    }

    public void I(int i11) {
        S0(59, 54, i11);
    }

    public void J(String str) {
        this.f78335r.add(Short.valueOf(this.f78328k.a(str)));
    }

    public void J0(short s11) {
        this.f78336s = s11;
    }

    public void K(int i11, String str, String str2, String str3) {
        int M0 = M0(str3);
        int i12 = M0 >>> 16;
        int N0 = this.f78330m + ((short) M0) + N0(i11);
        if (N0 < 0 || 32767 < N0) {
            i0(N0);
        }
        switch (i11) {
            case 182:
            case 183:
            case 184:
            case 185:
                d0(i11);
                if (i11 == 185) {
                    e0(this.f78328k.h(str, str2, str3));
                    d0(i12 + 1);
                    d0(0);
                } else {
                    e0(this.f78328k.i(str, str2, str3));
                }
                short s11 = (short) N0;
                this.f78330m = s11;
                if (N0 > this.f78331n) {
                    this.f78331n = s11;
                    return;
                }
                return;
            default:
                throw new IllegalArgumentException("bad opcode for method reference");
        }
    }

    public void K0(short s11) {
        this.f78330m = s11;
    }

    public void L(int i11) {
        S0(30, 22, i11);
    }

    public void L0(int i11, int i12, int i13) {
        int i14;
        if (i13 < 0 || i13 > (i14 = this.f78327j)) {
            throw new IllegalArgumentException("Bad jump target: " + i13);
        }
        if (i12 < -1) {
            throw new IllegalArgumentException("Bad case index: " + i12);
        }
        int i15 = (~i11) & 3;
        int i16 = i12 < 0 ? i11 + 1 + i15 : i11 + 1 + i15 + ((i12 + 3) * 4);
        if (i11 < 0 || i11 > ((i14 - 16) - i15) - 1) {
            throw new IllegalArgumentException(i11 + " is outside a possible range of tableswitch in already generated code");
        }
        byte[] bArr = this.f78326i;
        if ((bArr[i11] & 255) != 170) {
            throw new IllegalArgumentException(i11 + " is not offset of tableswitch statement");
        }
        if (i16 >= 0 && i16 + 4 <= i14) {
            H0(i13 - i11, bArr, i16);
            return;
        }
        throw new ClassFileFormatException("Too big case index: " + i12);
    }

    public void M(int i11) {
        S0(63, 55, i11);
    }

    public final void N(int i11, int i12) {
        if (i11 >= 0) {
            throw new IllegalArgumentException("Bad label, no biscuit");
        }
        int i13 = i11 & Integer.MAX_VALUE;
        if (i13 >= this.f78341x) {
            throw new IllegalArgumentException("Bad label");
        }
        int i14 = this.f78343z;
        long[] jArr = this.f78342y;
        if (jArr == null || i14 == jArr.length) {
            if (jArr == null) {
                this.f78342y = new long[40];
            } else {
                long[] jArr2 = new long[jArr.length * 2];
                System.arraycopy(jArr, 0, jArr2, 0, i14);
                this.f78342y = jArr2;
            }
        }
        this.f78343z = i14 + 1;
        this.f78342y[i14] = i12 | (i13 << 32);
    }

    public void O(short s11) {
        if (this.f78329l == null) {
            throw new IllegalArgumentException("No method to stop");
        }
        int i11 = this.f78325h;
        if (i11 == 0) {
            this.f78324g = new int[16];
        } else {
            int[] iArr = this.f78324g;
            if (i11 == iArr.length) {
                int[] iArr2 = new int[i11 * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i11);
                this.f78324g = iArr2;
            }
        }
        this.f78324g[i11] = (this.f78327j << 16) + s11;
        this.f78325h = i11 + 1;
    }

    public void O0(String str, String str2, short s11) {
        this.f78329l = new c(str, this.f78328k.k(str), str2, this.f78328k.k(str2), s11);
        this.f78320c = new UintMap();
        this.f78333p.add(this.f78329l);
        b0(0);
    }

    public void P(double d11) {
        s(20, this.f78328k.b(d11));
    }

    public void P0(short s11) {
        a aVar;
        int G0;
        int d11;
        if (this.f78329l == null) {
            throw new IllegalStateException("No method to stop");
        }
        p0();
        this.f78332o = s11;
        if (S) {
            o0();
            aVar = new a();
            aVar.l();
        } else {
            aVar = null;
        }
        int i11 = this.f78324g != null ? (this.f78325h * 4) + 8 : 0;
        ObjArray objArray = this.A;
        int size = objArray != null ? (objArray.size() * 10) + 8 : 0;
        int i12 = (aVar == null || (d11 = aVar.d()) <= 0) ? 0 : d11 + 6;
        int i13 = this.f78327j + 16 + (this.f78323f * 8) + 2 + i11 + size + i12;
        if (i13 > 65536) {
            throw new ClassFileFormatException("generated bytecode for method exceeds 64K limit.");
        }
        byte[] bArr = new byte[i13];
        int H0 = H0(this.f78327j, bArr, G0(this.f78332o, bArr, G0(this.f78331n, bArr, H0(i13 - 6, bArr, G0(this.f78328k.k("Code"), bArr, 0)))));
        System.arraycopy(this.f78326i, 0, bArr, H0, this.f78327j);
        int i14 = H0 + this.f78327j;
        int i15 = this.f78323f;
        if (i15 > 0) {
            G0 = G0(i15, bArr, i14);
            for (int i16 = 0; i16 < this.f78323f; i16++) {
                e eVar = this.f78322e[i16];
                short t02 = (short) t0(eVar.f66306a);
                short t03 = (short) t0(eVar.f66307b);
                short t04 = (short) t0(eVar.f66308c);
                short s12 = eVar.f66309d;
                if (t02 == -1) {
                    throw new IllegalStateException("start label not defined");
                }
                if (t03 == -1) {
                    throw new IllegalStateException("end label not defined");
                }
                if (t04 == -1) {
                    throw new IllegalStateException("handler label not defined");
                }
                G0 = G0(s12, bArr, G0(t04, bArr, G0(t03, bArr, G0(t02, bArr, G0))));
            }
        } else {
            G0 = G0(0, bArr, i14);
        }
        int i17 = this.f78324g != null ? 1 : 0;
        if (this.A != null) {
            i17++;
        }
        if (i12 > 0) {
            i17++;
        }
        int G02 = G0(i17, bArr, G0);
        if (this.f78324g != null) {
            G02 = G0(this.f78325h, bArr, H0((this.f78325h * 4) + 2, bArr, G0(this.f78328k.k("LineNumberTable"), bArr, G02)));
            for (int i18 = 0; i18 < this.f78325h; i18++) {
                G02 = H0(this.f78324g[i18], bArr, G02);
            }
        }
        if (this.A != null) {
            int G03 = G0(this.f78328k.k("LocalVariableTable"), bArr, G02);
            int size2 = this.A.size();
            G02 = G0(size2, bArr, H0((size2 * 10) + 2, bArr, G03));
            for (int i19 = 0; i19 < size2; i19++) {
                int[] iArr = (int[]) this.A.get(i19);
                int i21 = iArr[0];
                int i22 = iArr[1];
                int i23 = iArr[2];
                G02 = G0(iArr[3], bArr, G0(i22, bArr, G0(i21, bArr, G0(this.f78327j - i23, bArr, G0(i23, bArr, G02)))));
            }
        }
        if (i12 > 0) {
            aVar.E(bArr, G0(this.f78328k.k("StackMapTable"), bArr, G02));
        }
        this.f78329l.e(bArr);
        this.f78322e = null;
        this.f78323f = 0;
        this.f78325h = 0;
        this.f78327j = 0;
        this.f78329l = null;
        this.f78331n = (short) 0;
        this.f78330m = (short) 0;
        this.f78341x = 0;
        this.f78343z = 0;
        this.A = null;
        this.f78318a = null;
        this.f78319b = 0;
        this.f78320c = null;
    }

    public void Q(float f11) {
        s(18, this.f78328k.c(f11));
    }

    public byte[] Q0() {
        int w02 = w0();
        byte[] bArr = new byte[w02];
        short k11 = this.f78339v != 0 ? this.f78328k.k("SourceFile") : (short) 0;
        int G0 = G0(this.f78335r.size(), bArr, G0(this.f78338u, bArr, G0(this.f78337t, bArr, G0(this.f78336s, bArr, this.f78328k.s(bArr, G0(Q, bArr, G0(R, bArr, H0(T, bArr, 0))))))));
        for (int i11 = 0; i11 < this.f78335r.size(); i11++) {
            G0 = G0(((Short) this.f78335r.get(i11)).shortValue(), bArr, G0);
        }
        int G02 = G0(this.f78334q.size(), bArr, G0);
        for (int i12 = 0; i12 < this.f78334q.size(); i12++) {
            G02 = ((b) this.f78334q.get(i12)).c(bArr, G02);
        }
        int G03 = G0(this.f78333p.size(), bArr, G02);
        for (int i13 = 0; i13 < this.f78333p.size(); i13++) {
            G03 = ((c) this.f78333p.get(i13)).f(bArr, G03);
        }
        if ((this.f78339v != 0 ? G0(this.f78339v, bArr, H0(2, bArr, G0(k11, bArr, G0(1, bArr, G03)))) : G0(0, bArr, G03)) == w02) {
            return bArr;
        }
        throw new RuntimeException();
    }

    public void R(int i11) {
        if (i11 == 0) {
            r(3);
            return;
        }
        if (i11 == 1) {
            r(4);
            return;
        }
        if (i11 == 2) {
            r(5);
            return;
        }
        if (i11 == 3) {
            r(6);
            return;
        }
        if (i11 == 4) {
            r(7);
        } else if (i11 != 5) {
            s(18, this.f78328k.d(i11));
        } else {
            r(8);
        }
    }

    public void R0(OutputStream outputStream) throws IOException {
        outputStream.write(Q0());
    }

    public void S(long j11) {
        s(20, this.f78328k.e(j11));
    }

    public final void S0(int i11, int i12, int i13) {
        if (i13 == 0) {
            r(i11);
            return;
        }
        if (i13 == 1) {
            r(i11 + 1);
            return;
        }
        if (i13 == 2) {
            r(i11 + 2);
        } else if (i13 != 3) {
            s(i12, i13);
        } else {
            r(i11 + 3);
        }
    }

    public void T(String str) {
        s(18, this.f78328k.f(str));
    }

    public void U() {
        r(42);
    }

    public void V(double d11) {
        if (d11 == 0.0d) {
            r(14);
            if (1.0d / d11 < 0.0d) {
                r(119);
                return;
            }
            return;
        }
        if (d11 != 1.0d && d11 != -1.0d) {
            P(d11);
            return;
        }
        r(15);
        if (d11 < 0.0d) {
            r(119);
        }
    }

    public void W(int i11) {
        byte b11 = (byte) i11;
        if (b11 != i11) {
            short s11 = (short) i11;
            if (s11 == i11) {
                s(17, s11);
                return;
            } else {
                R(i11);
                return;
            }
        }
        if (i11 == -1) {
            r(2);
        } else if (i11 < 0 || i11 > 5) {
            s(16, b11);
        } else {
            r((byte) (i11 + 3));
        }
    }

    public void X(long j11) {
        int i11 = (int) j11;
        if (i11 != j11) {
            S(j11);
        } else {
            W(i11);
            r(133);
        }
    }

    public void Y(String str) {
        int length = str.length();
        int i11 = 0;
        int o11 = this.f78328k.o(str, 0, length);
        if (o11 == length) {
            T(str);
            return;
        }
        u(187, "java/lang/StringBuffer");
        r(89);
        W(length);
        K(183, "java/lang/StringBuffer", "<init>", "(I)V");
        while (true) {
            r(89);
            T(str.substring(i11, o11));
            K(182, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;");
            r(87);
            if (o11 == length) {
                K(182, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;");
                return;
            } else {
                i11 = o11;
                o11 = this.f78328k.o(str, o11, length);
            }
        }
    }

    public void Z(boolean z11) {
        r(z11 ? 4 : 3);
    }

    public final int a0(int i11) {
        if (this.f78329l == null) {
            throw new IllegalArgumentException("No method to add to");
        }
        int i12 = this.f78327j;
        int i13 = i11 + i12;
        byte[] bArr = this.f78326i;
        if (i13 > bArr.length) {
            int length = bArr.length * 2;
            if (i13 > length) {
                length = i13;
            }
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, i12);
            this.f78326i = bArr2;
        }
        this.f78327j = i13;
        return i12;
    }

    public final void b0(int i11) {
        if (S) {
            int[] iArr = this.f78318a;
            if (iArr == null) {
                this.f78318a = new int[4];
            } else {
                int length = iArr.length;
                int i12 = this.f78319b;
                if (length == i12) {
                    int[] iArr2 = new int[i12 * 2];
                    System.arraycopy(iArr, 0, iArr2, 0, i12);
                    this.f78318a = iArr2;
                }
            }
            int[] iArr3 = this.f78318a;
            int i13 = this.f78319b;
            this.f78319b = i13 + 1;
            iArr3[i13] = i11;
        }
    }

    public int c0(int i11, int i12) {
        if (i11 > i12) {
            throw new ClassFileFormatException("Bad bounds: " + i11 + ' ' + i12);
        }
        int N0 = this.f78330m + N0(170);
        if (N0 < 0 || 32767 < N0) {
            i0(N0);
        }
        int i13 = (~this.f78327j) & 3;
        int a02 = a0(i13 + 1 + (((i12 - i11) + 4) * 4));
        int i14 = a02 + 1;
        this.f78326i[a02] = -86;
        while (i13 != 0) {
            this.f78326i[i14] = 0;
            i13--;
            i14++;
        }
        H0(i12, this.f78326i, H0(i11, this.f78326i, i14 + 4));
        short s11 = (short) N0;
        this.f78330m = s11;
        if (N0 > this.f78331n) {
            this.f78331n = s11;
        }
        return a02;
    }

    public final void d0(int i11) {
        this.f78326i[a0(1)] = (byte) i11;
    }

    public final void e0(int i11) {
        G0(i11, this.f78326i, a0(2));
    }

    public void f0(String str, String str2, int i11, int i12) {
        int[] iArr = {this.f78328k.k(str), this.f78328k.k(str2), i11, i12};
        if (this.A == null) {
            this.A = new ObjArray();
        }
        this.A.add(iArr);
    }

    public void g0(int i11) {
        int i12 = this.f78330m + i11;
        if (i12 < 0 || 32767 < i12) {
            i0(i12);
        }
        short s11 = (short) i12;
        this.f78330m = s11;
        if (i12 > this.f78331n) {
            this.f78331n = s11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] m0() {
        /*
            r10 = this;
            short r0 = r10.f78332o
            int[] r0 = new int[r0]
            kb0.c r1 = r10.f78329l
            short r1 = r1.a()
            r1 = r1 & 8
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L2c
            kb0.c r1 = r10.f78329l
            java.lang.String r1 = r1.b()
            java.lang.String r4 = "<init>"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L23
            r1 = 6
            r0[r3] = r1
        L21:
            r1 = r2
            goto L2d
        L23:
            short r1 = r10.f78337t
            int r1 = kb0.h.a(r1)
            r0[r3] = r1
            goto L21
        L2c:
            r1 = r3
        L2d:
            kb0.c r4 = r10.f78329l
            java.lang.String r4 = r4.c()
            r5 = 40
            int r5 = r4.indexOf(r5)
            r6 = 41
            int r6 = r4.indexOf(r6)
            if (r5 != 0) goto Laf
            if (r6 < 0) goto Laf
            int r5 = r5 + r2
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
        L49:
            if (r5 >= r6) goto Lae
            char r8 = r4.charAt(r5)
            r9 = 70
            if (r8 == r9) goto L85
            r9 = 76
            if (r8 == r9) goto L75
            r9 = 83
            if (r8 == r9) goto L85
            r9 = 73
            if (r8 == r9) goto L85
            r9 = 74
            if (r8 == r9) goto L85
            r9 = 90
            if (r8 == r9) goto L85
            r9 = 91
            if (r8 == r9) goto L6f
            switch(r8) {
                case 66: goto L85;
                case 67: goto L85;
                case 68: goto L85;
                default: goto L6e;
            }
        L6e:
            goto L8e
        L6f:
            r7.append(r9)
            int r5 = r5 + 1
            goto L49
        L75:
            r8 = 59
            int r8 = r4.indexOf(r8, r5)
            int r8 = r8 + r2
            java.lang.String r5 = r4.substring(r5, r8)
            r7.append(r5)
            r5 = r8
            goto L8e
        L85:
            char r8 = r4.charAt(r5)
            r7.append(r8)
            int r5 = r5 + 1
        L8e:
            java.lang.String r8 = r7.toString()
            java.lang.String r8 = n0(r8)
            kb0.d r9 = r10.f78328k
            int r8 = kb0.h.d(r8, r9)
            int r9 = r1 + 1
            r0[r1] = r8
            boolean r8 = kb0.h.i(r8)
            if (r8 == 0) goto La9
            int r1 = r1 + 2
            goto Laa
        La9:
            r1 = r9
        Laa:
            r7.setLength(r3)
            goto L49
        Lae:
            return r0
        Laf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "bad method type"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.classfile.ClassFileWriter.m0():int[]");
    }

    public final void o0() {
        if (S) {
            for (int i11 = 0; i11 < this.f78323f; i11++) {
                b0((short) t0(this.f78322e[i11].f66308c));
            }
            Arrays.sort(this.f78318a, 0, this.f78319b);
            int i12 = this.f78318a[0];
            int i13 = 1;
            for (int i14 = 1; i14 < this.f78319b; i14++) {
                int[] iArr = this.f78318a;
                int i15 = iArr[i14];
                if (i12 != i15) {
                    if (i13 != i14) {
                        iArr[i13] = i15;
                    }
                    i13++;
                    i12 = i15;
                }
            }
            this.f78319b = i13;
            if (this.f78318a[i13 - 1] == this.f78327j) {
                this.f78319b = i13 - 1;
            }
        }
    }

    public final void p0() {
        byte[] bArr = this.f78326i;
        for (int i11 = 0; i11 < this.f78343z; i11++) {
            long j11 = this.f78342y[i11];
            int i12 = (int) (j11 >> 32);
            int i13 = (int) j11;
            int i14 = this.f78340w[i12];
            if (i14 == -1) {
                throw new RuntimeException();
            }
            b0(i14);
            int i15 = i13 - 1;
            this.f78320c.put(i14, i15);
            int i16 = i14 - i15;
            if (((short) i16) != i16) {
                throw new ClassFileFormatException("Program too complex: too big jump offset");
            }
            bArr[i13] = (byte) (i16 >> 8);
            bArr[i13 + 1] = (byte) i16;
        }
        this.f78343z = 0;
    }

    public int q() {
        int i11 = this.f78341x;
        int[] iArr = this.f78340w;
        if (iArr == null || i11 == iArr.length) {
            if (iArr == null) {
                this.f78340w = new int[32];
            } else {
                int[] iArr2 = new int[iArr.length * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i11);
                this.f78340w = iArr2;
            }
        }
        this.f78341x = i11 + 1;
        this.f78340w[i11] = -1;
        return i11 | Integer.MIN_VALUE;
    }

    public final char[] q0(int i11) {
        char[] cArr = this.B;
        if (i11 > cArr.length) {
            int length = cArr.length * 2;
            if (i11 <= length) {
                i11 = length;
            }
            this.B = new char[i11];
        }
        return this.B;
    }

    public void r(int i11) {
        if (E0(i11) != 0) {
            throw new IllegalArgumentException("Unexpected operands");
        }
        int N0 = this.f78330m + N0(i11);
        if (N0 < 0 || 32767 < N0) {
            i0(N0);
        }
        d0(i11);
        short s11 = (short) N0;
        this.f78330m = s11;
        if (N0 > this.f78331n) {
            this.f78331n = s11;
        }
        if (i11 == 191) {
            b0(this.f78327j);
        }
    }

    public final String r0() {
        return this.f78321d;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(int r6, int r7) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.classfile.ClassFileWriter.s(int, int):void");
    }

    public int s0() {
        return this.f78327j;
    }

    public void t(int i11, int i12, int i13) {
        int N0 = this.f78330m + N0(i11);
        if (N0 < 0 || 32767 < N0) {
            i0(N0);
        }
        if (i11 == 132) {
            if (i12 < 0 || i12 >= 65536) {
                throw new ClassFileFormatException("out of range variable");
            }
            if (i13 < 0 || i13 >= 65536) {
                throw new ClassFileFormatException("out of range increment");
            }
            if (i12 > 255 || i13 < -128 || i13 > 127) {
                d0(196);
                d0(132);
                e0(i12);
                e0(i13);
            } else {
                d0(132);
                d0(i12);
                d0(i13);
            }
        } else {
            if (i11 != 197) {
                throw new IllegalArgumentException("Unexpected opcode for 2 operands");
            }
            if (i12 < 0 || i12 >= 65536) {
                throw new IllegalArgumentException("out of range index");
            }
            if (i13 < 0 || i13 >= 256) {
                throw new IllegalArgumentException("out of range dimensions");
            }
            d0(197);
            e0(i12);
            d0(i13);
        }
        short s11 = (short) N0;
        this.f78330m = s11;
        if (N0 > this.f78331n) {
            this.f78331n = s11;
        }
    }

    public int t0(int i11) {
        if (i11 >= 0) {
            throw new IllegalArgumentException("Bad label, no biscuit");
        }
        int i12 = i11 & Integer.MAX_VALUE;
        if (i12 < this.f78341x) {
            return this.f78340w[i12];
        }
        throw new IllegalArgumentException("Bad label");
    }

    public void u(int i11, String str) {
        int N0 = this.f78330m + N0(i11);
        if (N0 < 0 || 32767 < N0) {
            i0(N0);
        }
        if (i11 != 187 && i11 != 189 && i11 != 192 && i11 != 193) {
            throw new IllegalArgumentException("bad opcode for class reference");
        }
        short a11 = this.f78328k.a(str);
        d0(i11);
        e0(a11);
        short s11 = (short) N0;
        this.f78330m = s11;
        if (N0 > this.f78331n) {
            this.f78331n = s11;
        }
    }

    public void v(int i11, String str, String str2, String str3) {
        int i12;
        int N0 = this.f78330m + N0(i11);
        char charAt = str3.charAt(0);
        int i13 = (charAt == 'J' || charAt == 'D') ? 2 : 1;
        switch (i11) {
            case 178:
            case 180:
                i12 = N0 + i13;
                break;
            case 179:
            case 181:
                i12 = N0 - i13;
                break;
            default:
                throw new IllegalArgumentException("bad opcode for field reference");
        }
        if (i12 < 0 || 32767 < i12) {
            i0(i12);
        }
        short g11 = this.f78328k.g(str, str2, str3);
        d0(i11);
        e0(g11);
        short s11 = (short) i12;
        this.f78330m = s11;
        if (i12 > this.f78331n) {
            this.f78331n = s11;
        }
    }

    public short v0() {
        return this.f78330m;
    }

    public void w(int i11) {
        S0(42, 25, i11);
    }

    public final int w0() {
        if (this.f78339v != 0) {
            this.f78328k.k("SourceFile");
        }
        int p11 = this.f78328k.p() + 16 + (this.f78335r.size() * 2) + 2;
        for (int i11 = 0; i11 < this.f78334q.size(); i11++) {
            p11 += ((b) this.f78334q.get(i11)).a();
        }
        int i12 = p11 + 2;
        for (int i13 = 0; i13 < this.f78333p.size(); i13++) {
            i12 += ((c) this.f78333p.get(i13)).d();
        }
        return this.f78339v != 0 ? i12 + 10 : i12 + 2;
    }

    public void x(int i11) {
        S0(75, 58, i11);
    }

    public boolean x0(String str) {
        return this.f78328k.q(str);
    }

    public void y(int i11) {
        S0(38, 24, i11);
    }

    public void y0(int i11) {
        this.f78330m = (short) 1;
        z0(i11);
    }

    public void z(int i11) {
        S0(71, 57, i11);
    }

    public void z0(int i11) {
        if (i11 >= 0) {
            throw new IllegalArgumentException("Bad label, no biscuit");
        }
        int i12 = i11 & Integer.MAX_VALUE;
        if (i12 > this.f78341x) {
            throw new IllegalArgumentException("Bad label");
        }
        int[] iArr = this.f78340w;
        if (iArr[i12] != -1) {
            throw new IllegalStateException("Can only mark label once");
        }
        iArr[i12] = this.f78327j;
    }
}
