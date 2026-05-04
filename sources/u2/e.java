package u2;

import a3.q;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.math.Rectangle;
import java.util.Iterator;
import s2.g;
import s2.h;
import s2.i;
import w1.n;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e implements h, q {

    /* renamed from: r, reason: collision with root package name */
    public static final float f91545r = 1.0E-5f;

    /* renamed from: s, reason: collision with root package name */
    public static final int f91546s = 20;

    /* renamed from: a, reason: collision with root package name */
    public final s2.f f91547a;

    /* renamed from: b, reason: collision with root package name */
    public final n f91548b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f91549c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f91550d;

    /* renamed from: e, reason: collision with root package name */
    public float f91551e;

    /* renamed from: f, reason: collision with root package name */
    public final Rectangle f91552f;

    /* renamed from: g, reason: collision with root package name */
    public final Rectangle f91553g;

    /* renamed from: h, reason: collision with root package name */
    public float f91554h;

    /* renamed from: i, reason: collision with root package name */
    public float f91555i;

    /* renamed from: j, reason: collision with root package name */
    public float f91556j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f91557k;

    /* renamed from: l, reason: collision with root package name */
    public int f91558l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f91559m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f91560n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f91561o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f91562p;

    /* renamed from: q, reason: collision with root package name */
    public Rectangle f91563q;

    public e(s2.f fVar) {
        this(fVar, 1.0f, 2000);
    }

    public void C0(boolean z11) {
        this.f91550d = z11;
    }

    @Override // s2.h
    public void D(i iVar) {
        TiledMapTile d11;
        float f11;
        int i11;
        float M = com.badlogic.gdx.graphics.b.M(iVar.b().f11544a, iVar.b().f11545b, iVar.b().f11546c, iVar.g() * iVar.b().f11547d);
        int D = iVar.D();
        int A = iVar.A();
        float C = iVar.C() * this.f91551e;
        float B = iVar.B() * this.f91551e;
        float l11 = (iVar.l() * this.f91551e) - (this.f91552f.f12533x * (iVar.h() - 1.0f));
        float i12 = ((-iVar.m()) * this.f91551e) - (this.f91552f.f12534y * (iVar.i() - 1.0f));
        int i13 = 0;
        int max = Math.max(0, (int) ((this.f91553g.f12533x - l11) / C));
        Rectangle rectangle = this.f91553g;
        int min = Math.min(D, (int) ((((rectangle.f12533x + rectangle.width) + C) - l11) / C));
        int max2 = Math.max(0, (int) ((this.f91553g.f12534y - i12) / B));
        Rectangle rectangle2 = this.f91553g;
        int min2 = Math.min(A, (int) ((((rectangle2.f12534y + rectangle2.height) + B) - i12) / B));
        int i14 = 1;
        this.f91559m = min2 < A;
        this.f91560n = min < D;
        this.f91561o = max > 0;
        this.f91562p = max2 > 0;
        float[] fArr = this.f91549c;
        while (min2 >= max2) {
            int i15 = max;
            while (i15 < min) {
                i.a z11 = iVar.z(i15, min2);
                if (z11 == null || (d11 = z11.d()) == null) {
                    f11 = M;
                    i11 = i13;
                } else {
                    int i16 = i13;
                    this.f91558l += i14;
                    boolean a11 = z11.a();
                    boolean b11 = z11.b();
                    int c11 = z11.c();
                    o b12 = d11.b();
                    int i17 = i14;
                    Texture f12 = b12.f();
                    f11 = M;
                    float c12 = (i15 * C) + (d11.c() * this.f91551e) + l11;
                    float f13 = (min2 * B) + (d11.f() * this.f91551e) + i12;
                    float c13 = c12 + (this.f91551e * b12.c());
                    float b13 = f13 + (this.f91551e * b12.b());
                    float C0 = 0.5f / f12.C0();
                    float I = 0.5f / f12.I();
                    float g11 = b12.g() + C0;
                    float j11 = b12.j() - I;
                    float h11 = b12.h() - C0;
                    float i18 = b12.i() + I;
                    fArr[i16] = c12;
                    fArr[i17] = f13;
                    fArr[2] = f11;
                    fArr[3] = g11;
                    fArr[4] = j11;
                    fArr[5] = c12;
                    fArr[6] = b13;
                    fArr[7] = f11;
                    fArr[8] = g11;
                    fArr[9] = i18;
                    fArr[10] = c13;
                    fArr[11] = b13;
                    fArr[12] = f11;
                    fArr[13] = h11;
                    fArr[14] = i18;
                    fArr[15] = c13;
                    fArr[16] = f13;
                    fArr[17] = f11;
                    fArr[18] = h11;
                    fArr[19] = j11;
                    if (a11) {
                        fArr[3] = h11;
                        fArr[13] = g11;
                        fArr[8] = h11;
                        fArr[18] = g11;
                    }
                    if (b11) {
                        fArr[4] = i18;
                        fArr[14] = j11;
                        fArr[9] = j11;
                        fArr[19] = i18;
                    }
                    if (c11 != 0) {
                        if (c11 == i17) {
                            float f14 = fArr[4];
                            fArr[4] = fArr[9];
                            fArr[9] = fArr[14];
                            fArr[14] = fArr[19];
                            fArr[19] = f14;
                            float f15 = fArr[3];
                            fArr[3] = fArr[8];
                            fArr[8] = fArr[13];
                            fArr[13] = fArr[18];
                            fArr[18] = f15;
                        } else if (c11 == 2) {
                            float f16 = fArr[3];
                            fArr[3] = fArr[13];
                            fArr[13] = f16;
                            float f17 = fArr[8];
                            fArr[8] = fArr[18];
                            fArr[18] = f17;
                            float f18 = fArr[4];
                            fArr[4] = fArr[14];
                            fArr[14] = f18;
                            float f19 = fArr[9];
                            fArr[9] = fArr[19];
                            fArr[19] = f19;
                        } else if (c11 == 3) {
                            float f21 = fArr[4];
                            fArr[4] = fArr[19];
                            fArr[19] = fArr[14];
                            fArr[14] = fArr[9];
                            fArr[9] = f21;
                            float f22 = fArr[3];
                            fArr[3] = fArr[18];
                            fArr[18] = fArr[13];
                            fArr[13] = fArr[8];
                            fArr[8] = f22;
                        }
                    }
                    i11 = i16;
                    this.f91548b.R(f12, fArr, i11, 20);
                }
                i15++;
                i13 = i11;
                M = f11;
                i14 = 1;
            }
            min2--;
            i14 = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (r1 <= ((r7.f12533x + r7.width) + 1.0E-5f)) goto L14;
     */
    @Override // q2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I(com.badlogic.gdx.graphics.k r7) {
        /*
            r6 = this;
            w1.n r0 = r6.f91548b
            com.badlogic.gdx.math.Matrix4 r1 = r7.f11513f
            r0.Z0(r1)
            float r0 = r7.f11517j
            float r1 = r7.f12458o
            float r0 = r0 * r1
            float r2 = r6.f91555i
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r3
            float r4 = r6.f91551e
            float r2 = r2 * r4
            float r0 = r0 + r2
            float r2 = r7.f11518k
            float r2 = r2 * r1
            float r1 = r6.f91556j
            float r1 = r1 * r3
            float r1 = r1 * r4
            float r2 = r2 + r1
            com.badlogic.gdx.math.Rectangle r1 = r6.f91552f
            com.badlogic.gdx.math.Vector3 r7 = r7.f11508a
            float r4 = r7.f12537x
            float r5 = r0 / r3
            float r4 = r4 - r5
            float r7 = r7.f12538y
            float r3 = r2 / r3
            float r7 = r7 - r3
            r1.set(r4, r7, r0, r2)
            boolean r7 = r6.f91561o
            r0 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r7 == 0) goto L42
            com.badlogic.gdx.math.Rectangle r7 = r6.f91552f
            float r7 = r7.f12533x
            com.badlogic.gdx.math.Rectangle r1 = r6.f91553g
            float r1 = r1.f12533x
            float r1 = r1 - r0
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 < 0) goto L81
        L42:
            boolean r7 = r6.f91562p
            if (r7 == 0) goto L53
            com.badlogic.gdx.math.Rectangle r7 = r6.f91552f
            float r7 = r7.f12534y
            com.badlogic.gdx.math.Rectangle r1 = r6.f91553g
            float r1 = r1.f12534y
            float r1 = r1 - r0
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 < 0) goto L81
        L53:
            boolean r7 = r6.f91560n
            if (r7 == 0) goto L6a
            com.badlogic.gdx.math.Rectangle r7 = r6.f91552f
            float r1 = r7.f12533x
            float r7 = r7.width
            float r1 = r1 + r7
            com.badlogic.gdx.math.Rectangle r7 = r6.f91553g
            float r2 = r7.f12533x
            float r7 = r7.width
            float r2 = r2 + r7
            float r2 = r2 + r0
            int r7 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r7 > 0) goto L81
        L6a:
            boolean r7 = r6.f91559m
            if (r7 == 0) goto L84
            com.badlogic.gdx.math.Rectangle r7 = r6.f91552f
            float r1 = r7.f12534y
            float r7 = r7.height
            float r1 = r1 + r7
            com.badlogic.gdx.math.Rectangle r7 = r6.f91553g
            float r2 = r7.f12534y
            float r7 = r7.height
            float r2 = r2 + r7
            float r2 = r2 + r0
            int r7 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r7 <= 0) goto L84
        L81:
            r7 = 0
            r6.f91557k = r7
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.e.I(com.badlogic.gdx.graphics.k):void");
    }

    public void J0(float f11, float f12) {
        this.f91555i = f11;
        this.f91556j = f12;
    }

    public void Q0(float f11) {
        this.f91554h = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s2.h
    public void R(g gVar) {
        char c11;
        Object[] objArr;
        char c12;
        int i11;
        int i12;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        e eVar = this;
        com.badlogic.gdx.graphics.b b11 = gVar.b();
        boolean L = gVar.L();
        float f16 = L ? 1.0f : b11.f11547d;
        float M = com.badlogic.gdx.graphics.b.M(b11.f11544a * f16, b11.f11545b * f16, b11.f11546c * f16, gVar.g() * (L ? b11.f11547d : 1.0f));
        float[] fArr = eVar.f91549c;
        o B = gVar.B();
        if (B == null) {
            return;
        }
        float C = gVar.C();
        float D = gVar.D();
        float h11 = (C * eVar.f91551e) - (eVar.f91552f.f12533x * (gVar.h() - 1.0f));
        float i13 = (D * eVar.f91551e) - (eVar.f91552f.f12534y * (gVar.i() - 1.0f));
        float c13 = (B.c() * eVar.f91551e) + h11;
        float b12 = (B.b() * eVar.f91551e) + i13;
        eVar.f91563q.set(h11, i13, c13 - h11, b12 - i13);
        char c14 = 20;
        int i14 = 0;
        if (!gVar.E() && !gVar.F()) {
            float g11 = B.g();
            float j11 = B.j();
            float h12 = B.h();
            float i15 = B.i();
            fArr[0] = h11;
            fArr[1] = i13;
            fArr[2] = M;
            fArr[3] = g11;
            fArr[4] = j11;
            fArr[5] = h11;
            fArr[6] = b12;
            fArr[7] = M;
            fArr[8] = g11;
            fArr[9] = i15;
            fArr[10] = c13;
            fArr[11] = b12;
            fArr[12] = M;
            fArr[13] = h12;
            fArr[14] = i15;
            fArr[15] = c13;
            fArr[16] = i13;
            fArr[17] = M;
            fArr[18] = h12;
            fArr[19] = j11;
            eVar.f91548b.R(B.f(), fArr, 0, 20);
            return;
        }
        if (gVar.E()) {
            c11 = 18;
            objArr = 17;
            c12 = 16;
            i11 = (int) Math.ceil((eVar.f91553g.width / eVar.f91563q.width) + 4.0f);
        } else {
            c11 = 18;
            objArr = 17;
            c12 = 16;
            i11 = 0;
        }
        int ceil = gVar.F() ? (int) Math.ceil((eVar.f91553g.height / eVar.f91563q.height) + 4.0f) : 0;
        Rectangle rectangle = eVar.f91553g;
        Object[] objArr2 = objArr;
        float f17 = rectangle.f12533x;
        float f18 = rectangle.f12534y;
        Rectangle rectangle2 = eVar.f91563q;
        float f19 = f17 - (f17 % rectangle2.width);
        float f21 = f18 - (f18 % rectangle2.height);
        int i16 = 0;
        while (i16 <= i11) {
            int i17 = i14;
            while (i17 <= ceil) {
                if (gVar.E()) {
                    i12 = i14;
                    float f22 = eVar.f91563q.width;
                    f12 = ((i16 - 2) * f22) + f19 + (h11 % f22);
                    f11 = f22 + f12;
                } else {
                    i12 = i14;
                    f11 = c13;
                    f12 = h11;
                }
                if (gVar.F()) {
                    f13 = M;
                    float f23 = eVar.f91563q.height;
                    f14 = f21 + ((i17 - 2) * f23) + (i13 % f23);
                    f15 = f14 + f23;
                } else {
                    f13 = M;
                    f14 = i13;
                    f15 = b12;
                }
                float g12 = B.g();
                float j12 = B.j();
                float h13 = B.h();
                float i18 = B.i();
                fArr[i12] = f12;
                fArr[1] = f14;
                fArr[2] = f13;
                fArr[3] = g12;
                fArr[4] = j12;
                fArr[5] = f12;
                fArr[6] = f15;
                fArr[7] = f13;
                fArr[8] = g12;
                fArr[9] = i18;
                fArr[10] = f11;
                fArr[11] = f15;
                fArr[12] = f13;
                fArr[13] = h13;
                fArr[14] = i18;
                fArr[15] = f11;
                fArr[c12] = f14;
                fArr[objArr2 == true ? 1 : 0] = f13;
                fArr[c11] = h13;
                fArr[19] = j12;
                int i19 = i12;
                eVar.f91548b.R(B.f(), fArr, i19, 20);
                i17++;
                c14 = 20;
                M = f13;
                i14 = i19;
                eVar = this;
            }
            i16++;
            i14 = i14;
            eVar = this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r6 <= ((r4.f12533x + r4.width) + 1.0E-5f)) goto L14;
     */
    @Override // q2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X(com.badlogic.gdx.math.Matrix4 r4, float r5, float r6, float r7, float r8) {
        /*
            r3 = this;
            w1.n r0 = r3.f91548b
            r0.Z0(r4)
            float r4 = r3.f91555i
            float r0 = r3.f91551e
            float r1 = r4 * r0
            float r5 = r5 - r1
            float r1 = r3.f91556j
            float r2 = r1 * r0
            float r6 = r6 - r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r2
            float r4 = r4 * r0
            float r7 = r7 + r4
            float r1 = r1 * r2
            float r1 = r1 * r0
            float r8 = r8 + r1
            com.badlogic.gdx.math.Rectangle r4 = r3.f91552f
            r4.set(r5, r6, r7, r8)
            boolean r4 = r3.f91561o
            r5 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r4 == 0) goto L32
            com.badlogic.gdx.math.Rectangle r4 = r3.f91552f
            float r4 = r4.f12533x
            com.badlogic.gdx.math.Rectangle r6 = r3.f91553g
            float r6 = r6.f12533x
            float r6 = r6 - r5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L71
        L32:
            boolean r4 = r3.f91562p
            if (r4 == 0) goto L43
            com.badlogic.gdx.math.Rectangle r4 = r3.f91552f
            float r4 = r4.f12534y
            com.badlogic.gdx.math.Rectangle r6 = r3.f91553g
            float r6 = r6.f12534y
            float r6 = r6 - r5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L71
        L43:
            boolean r4 = r3.f91560n
            if (r4 == 0) goto L5a
            com.badlogic.gdx.math.Rectangle r4 = r3.f91552f
            float r6 = r4.f12533x
            float r4 = r4.width
            float r6 = r6 + r4
            com.badlogic.gdx.math.Rectangle r4 = r3.f91553g
            float r7 = r4.f12533x
            float r4 = r4.width
            float r7 = r7 + r4
            float r7 = r7 + r5
            int r4 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r4 > 0) goto L71
        L5a:
            boolean r4 = r3.f91559m
            if (r4 == 0) goto L74
            com.badlogic.gdx.math.Rectangle r4 = r3.f91552f
            float r6 = r4.f12534y
            float r4 = r4.height
            float r6 = r6 + r4
            com.badlogic.gdx.math.Rectangle r4 = r3.f91553g
            float r7 = r4.f12534y
            float r4 = r4.height
            float r7 = r7 + r4
            float r7 = r7 + r5
            int r4 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r4 <= 0) goto L74
        L71:
            r4 = 0
            r3.f91557k = r4
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.e.X(com.badlogic.gdx.math.Matrix4, float, float, float, float):void");
    }

    @Override // s2.h
    public void Z(q2.d dVar) {
        Iterator<q2.f> it = dVar.d().iterator();
        while (it.hasNext()) {
            z(it.next());
        }
    }

    @Override // q2.i
    public void b() {
        if (!this.f91557k) {
            this.f91557k = true;
            this.f91558l = 0;
            this.f91548b.J0();
            Rectangle rectangle = this.f91552f;
            float f11 = rectangle.width;
            float f12 = this.f91554h;
            float f13 = f11 * f12;
            float f14 = rectangle.height;
            float f15 = f12 * f14;
            Rectangle rectangle2 = this.f91553g;
            rectangle2.f12533x = rectangle.f12533x - f13;
            rectangle2.f12534y = rectangle.f12534y - f15;
            rectangle2.width = f11 + (f13 * 2.0f);
            rectangle2.height = f14 + (f15 * 2.0f);
            Iterator<q2.d> it = this.f91547a.b().iterator();
            while (it.hasNext()) {
                q2.d next = it.next();
                this.f91548b.w0();
                if (next instanceof i) {
                    D((i) next);
                } else if (next instanceof g) {
                    R((g) next);
                }
                this.f91548b.b1();
            }
        }
        if (this.f91550d) {
            q1.g.f81384g.glEnable(com.badlogic.gdx.graphics.f.f11564c0);
            q1.g.f81384g.glBlendFunc(com.badlogic.gdx.graphics.f.f11653r, com.badlogic.gdx.graphics.f.f11659s);
        }
        this.f91548b.c();
        q2.e b11 = this.f91547a.b();
        int count = b11.getCount();
        for (int i11 = 0; i11 < count; i11++) {
            q2.d b12 = b11.b(i11);
            if (b12.p()) {
                this.f91548b.V0(i11);
                Z(b12);
            }
        }
        this.f91548b.end();
        if (this.f91550d) {
            q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11564c0);
        }
    }

    @Override // a3.q
    public void dispose() {
        this.f91548b.dispose();
    }

    public n i0() {
        return this.f91548b;
    }

    public void n0() {
        this.f91557k = false;
    }

    @Override // q2.i
    public void o(int[] iArr) {
        if (!this.f91557k) {
            this.f91557k = true;
            this.f91558l = 0;
            this.f91548b.J0();
            Rectangle rectangle = this.f91552f;
            float f11 = rectangle.width;
            float f12 = this.f91554h;
            float f13 = f11 * f12;
            float f14 = rectangle.height;
            float f15 = f12 * f14;
            Rectangle rectangle2 = this.f91553g;
            rectangle2.f12533x = rectangle.f12533x - f13;
            rectangle2.f12534y = rectangle.f12534y - f15;
            rectangle2.width = f11 + (f13 * 2.0f);
            rectangle2.height = f14 + (f15 * 2.0f);
            Iterator<q2.d> it = this.f91547a.b().iterator();
            while (it.hasNext()) {
                q2.d next = it.next();
                this.f91548b.w0();
                if (next instanceof i) {
                    D((i) next);
                } else if (next instanceof g) {
                    R((g) next);
                }
                this.f91548b.b1();
            }
        }
        if (this.f91550d) {
            q1.g.f81384g.glEnable(com.badlogic.gdx.graphics.f.f11564c0);
            q1.g.f81384g.glBlendFunc(com.badlogic.gdx.graphics.f.f11653r, com.badlogic.gdx.graphics.f.f11659s);
        }
        this.f91548b.c();
        q2.e b11 = this.f91547a.b();
        for (int i11 : iArr) {
            q2.d b12 = b11.b(i11);
            if (b12.p()) {
                this.f91548b.V0(i11);
                Z(b12);
            }
        }
        this.f91548b.end();
        if (this.f91550d) {
            q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11564c0);
        }
    }

    public boolean w0() {
        return this.f91557k;
    }

    public e(s2.f fVar, float f11) {
        this(fVar, f11, 2000);
    }

    public e(s2.f fVar, float f11, int i11) {
        this.f91549c = new float[20];
        this.f91552f = new Rectangle();
        this.f91553g = new Rectangle();
        this.f91554h = 0.5f;
        this.f91563q = new Rectangle();
        this.f91547a = fVar;
        this.f91551e = f11;
        this.f91548b = new n(i11, true);
    }

    @Override // s2.h
    public void z(q2.f fVar) {
    }
}
