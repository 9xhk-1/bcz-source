package u2;

import a3.q;
import com.badlogic.gdx.graphics.k;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import java.util.Iterator;
import s2.g;
import s2.h;
import s2.i;
import w1.m;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a implements h, q {

    /* renamed from: i, reason: collision with root package name */
    public static final int f91526i = 20;

    /* renamed from: a, reason: collision with root package name */
    public s2.f f91527a;

    /* renamed from: b, reason: collision with root package name */
    public float f91528b;

    /* renamed from: c, reason: collision with root package name */
    public w1.a f91529c;

    /* renamed from: d, reason: collision with root package name */
    public Rectangle f91530d;

    /* renamed from: e, reason: collision with root package name */
    public Rectangle f91531e;

    /* renamed from: f, reason: collision with root package name */
    public Rectangle f91532f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f91533g;

    /* renamed from: h, reason: collision with root package name */
    public float[] f91534h;

    public a(s2.f fVar) {
        this(fVar, 1.0f);
    }

    public float C0(g gVar, com.badlogic.gdx.graphics.b bVar) {
        com.badlogic.gdx.graphics.b b11 = gVar.b();
        boolean L = gVar.L();
        float f11 = L ? 1.0f : b11.f11547d;
        return com.badlogic.gdx.graphics.b.M(bVar.f11544a * b11.f11544a * f11, bVar.f11545b * b11.f11545b * f11, bVar.f11546c * b11.f11546c * f11, bVar.f11547d * gVar.g() * (L ? b11.f11547d : 1.0f));
    }

    @Override // q2.i
    public void I(k kVar) {
        this.f91529c.Z0(kVar.f11513f);
        float f11 = kVar.f11517j;
        float f12 = kVar.f12458o;
        float f13 = f11 * f12;
        float f14 = kVar.f11518k * f12;
        float abs = (Math.abs(kVar.f11510c.f12538y) * f13) + (Math.abs(kVar.f11510c.f12537x) * f14);
        float abs2 = (f14 * Math.abs(kVar.f11510c.f12538y)) + (f13 * Math.abs(kVar.f11510c.f12537x));
        Rectangle rectangle = this.f91530d;
        Vector3 vector3 = kVar.f11508a;
        rectangle.set(vector3.f12537x - (abs / 2.0f), vector3.f12538y - (abs2 / 2.0f), abs, abs2);
    }

    public s2.f J0() {
        return this.f91527a;
    }

    public float Q0(i iVar, com.badlogic.gdx.graphics.b bVar) {
        return com.badlogic.gdx.graphics.b.M(bVar.f11544a * iVar.b().f11544a, bVar.f11545b * iVar.b().f11545b, bVar.f11546c * iVar.b().f11546c, bVar.f11547d * iVar.b().f11547d * iVar.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s2.h
    public void R(g gVar) {
        char c11;
        Object[] objArr;
        char c12;
        int i11;
        float f11;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i13;
        g gVar2 = gVar;
        float C0 = C0(gVar2, this.f91529c.e());
        float[] fArr = this.f91534h;
        o B = gVar2.B();
        if (B == null) {
            return;
        }
        float C = gVar2.C();
        float D = gVar2.D();
        float h11 = (C * this.f91528b) - (this.f91530d.f12533x * (gVar2.h() - 1.0f));
        float i14 = (D * this.f91528b) - (this.f91530d.f12534y * (gVar2.i() - 1.0f));
        float c13 = (B.c() * this.f91528b) + h11;
        float b11 = (B.b() * this.f91528b) + i14;
        this.f91531e.set(h11, i14, c13 - h11, b11 - i14);
        int i15 = 0;
        if (!gVar2.E() && !gVar2.F()) {
            if (this.f91530d.contains(this.f91531e) || this.f91530d.overlaps(this.f91531e)) {
                float g11 = B.g();
                float j11 = B.j();
                float h12 = B.h();
                float i16 = B.i();
                fArr[0] = h11;
                fArr[1] = i14;
                fArr[2] = C0;
                fArr[3] = g11;
                fArr[4] = j11;
                fArr[5] = h11;
                fArr[6] = b11;
                fArr[7] = C0;
                fArr[8] = g11;
                fArr[9] = i16;
                fArr[10] = c13;
                fArr[11] = b11;
                fArr[12] = C0;
                fArr[13] = h12;
                fArr[14] = i16;
                fArr[15] = c13;
                fArr[16] = i14;
                fArr[17] = C0;
                fArr[18] = h12;
                fArr[19] = j11;
                this.f91529c.t0(B.f(), fArr, 0, 20);
                return;
            }
            return;
        }
        if (gVar2.E()) {
            c11 = 18;
            objArr = 17;
            c12 = 16;
            i11 = (int) Math.ceil((this.f91530d.width / this.f91531e.width) + 4.0f);
        } else {
            c11 = 18;
            objArr = 17;
            c12 = 16;
            i11 = 0;
        }
        int ceil = gVar2.F() ? (int) Math.ceil((this.f91530d.height / this.f91531e.height) + 4.0f) : 0;
        Rectangle rectangle = this.f91530d;
        Object[] objArr2 = objArr;
        float f17 = rectangle.f12533x;
        float f18 = rectangle.f12534y;
        Rectangle rectangle2 = this.f91531e;
        float f19 = f17 - (f17 % rectangle2.width);
        float f21 = f18 - (f18 % rectangle2.height);
        int i17 = 0;
        while (i17 <= i11) {
            int i18 = i15;
            while (i18 <= ceil) {
                if (gVar2.E()) {
                    i12 = i15;
                    f11 = C0;
                    float f22 = this.f91531e.width;
                    f12 = ((i17 - 2) * f22) + f19 + (h11 % f22);
                    f13 = f22 + f12;
                } else {
                    f11 = C0;
                    i12 = i15;
                    f12 = h11;
                    f13 = c13;
                }
                if (gVar2.F()) {
                    f14 = f13;
                    float f23 = this.f91531e.height;
                    float f24 = f21 + ((i18 - 2) * f23) + (i14 % f23);
                    f16 = f24 + f23;
                    f15 = f24;
                } else {
                    f14 = f13;
                    f15 = i14;
                    f16 = b11;
                }
                o oVar = B;
                float f25 = h11;
                this.f91532f.set(f12, f15, f14 - f12, f16 - f15);
                if (this.f91530d.contains(this.f91532f) || this.f91530d.overlaps(this.f91532f)) {
                    float g12 = oVar.g();
                    float j12 = oVar.j();
                    float h13 = oVar.h();
                    float i19 = oVar.i();
                    fArr[i12] = f12;
                    fArr[1] = f15;
                    fArr[2] = f11;
                    fArr[3] = g12;
                    fArr[4] = j12;
                    fArr[5] = f12;
                    fArr[6] = f16;
                    fArr[7] = f11;
                    fArr[8] = g12;
                    fArr[9] = i19;
                    fArr[10] = f14;
                    fArr[11] = f16;
                    fArr[12] = f11;
                    fArr[13] = h13;
                    fArr[14] = i19;
                    fArr[15] = f14;
                    fArr[c12] = f15;
                    fArr[objArr2 == true ? 1 : 0] = f11;
                    fArr[c11] = h13;
                    fArr[19] = j12;
                    i13 = i12;
                    this.f91529c.t0(oVar.f(), fArr, i13, 20);
                } else {
                    i13 = i12;
                }
                i18++;
                gVar2 = gVar;
                i15 = i13;
                C0 = f11;
                B = oVar;
                h11 = f25;
            }
            i17++;
            gVar2 = gVar;
            B = B;
            h11 = h11;
        }
    }

    public float V0() {
        return this.f91528b;
    }

    @Override // q2.i
    public void X(Matrix4 matrix4, float f11, float f12, float f13, float f14) {
        this.f91529c.Z0(matrix4);
        this.f91530d.set(f11, f12, f13, f14);
    }

    @Override // s2.h
    public void Z(q2.d dVar) {
        Iterator<q2.f> it = dVar.d().iterator();
        while (it.hasNext()) {
            z(it.next());
        }
    }

    public Rectangle a1() {
        return this.f91530d;
    }

    @Override // q2.i
    public void b() {
        i0();
        Iterator<q2.d> it = this.f91527a.b().iterator();
        while (it.hasNext()) {
            b1(it.next());
        }
        n0();
    }

    public void b1(q2.d dVar) {
        if (dVar.p()) {
            if (dVar instanceof q2.c) {
                q2.e z11 = ((q2.c) dVar).z();
                for (int i11 = 0; i11 < z11.size(); i11++) {
                    q2.d b11 = z11.b(i11);
                    if (b11.p()) {
                        b1(b11);
                    }
                }
                return;
            }
            if (dVar instanceof i) {
                D((i) dVar);
            } else if (dVar instanceof g) {
                R((g) dVar);
            } else {
                Z(dVar);
            }
        }
    }

    public void c1(s2.f fVar) {
        this.f91527a = fVar;
    }

    @Override // a3.q
    public void dispose() {
        if (this.f91533g) {
            this.f91529c.dispose();
        }
    }

    public void i0() {
        v2.a.q();
        this.f91529c.c();
    }

    public void n0() {
        this.f91529c.end();
    }

    @Override // q2.i
    public void o(int[] iArr) {
        i0();
        for (int i11 : iArr) {
            b1(this.f91527a.b().b(i11));
        }
        n0();
    }

    public w1.a w0() {
        return this.f91529c;
    }

    public a(s2.f fVar, float f11) {
        this.f91531e = new Rectangle();
        this.f91532f = new Rectangle();
        this.f91534h = new float[20];
        this.f91527a = fVar;
        this.f91528b = f11;
        this.f91530d = new Rectangle();
        this.f91529c = new m();
        this.f91533g = true;
    }

    public a(s2.f fVar, w1.a aVar) {
        this(fVar, 1.0f, aVar);
    }

    public a(s2.f fVar, float f11, w1.a aVar) {
        this.f91531e = new Rectangle();
        this.f91532f = new Rectangle();
        this.f91534h = new float[20];
        this.f91527a = fVar;
        this.f91528b = f11;
        this.f91530d = new Rectangle();
        this.f91529c = aVar;
        this.f91533g = false;
    }

    @Override // s2.h
    public void z(q2.f fVar) {
    }
}
