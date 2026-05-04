package ol;

import a3.d0;
import com.badlogic.gdx.graphics.g2d.e;
import com.esotericsoftware.spine.attachments.Sequence;
import jl.m;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class g extends l implements f {

    /* renamed from: h, reason: collision with root package name */
    public o f77553h;

    /* renamed from: i, reason: collision with root package name */
    public String f77554i;

    /* renamed from: j, reason: collision with root package name */
    public float[] f77555j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f77556k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f77557l;

    /* renamed from: m, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f77558m;

    /* renamed from: n, reason: collision with root package name */
    public int f77559n;

    /* renamed from: o, reason: collision with root package name */
    @d0
    public g f77560o;

    /* renamed from: p, reason: collision with root package name */
    @d0
    public Sequence f77561p;

    /* renamed from: q, reason: collision with root package name */
    @d0
    public short[] f77562q;

    /* renamed from: r, reason: collision with root package name */
    public float f77563r;

    /* renamed from: s, reason: collision with root package name */
    public float f77564s;

    public g(String str) {
        super(str);
        this.f77558m = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public short[] A() {
        return this.f77557l;
    }

    public float[] B() {
        return this.f77556k;
    }

    public float C() {
        return this.f77563r;
    }

    public g D() {
        g gVar = new g(this.f77549a);
        gVar.f77597c = this.f77597c;
        gVar.f77553h = this.f77553h;
        gVar.f77554i = this.f77554i;
        gVar.f77558m.H(this.f77558m);
        g gVar2 = this.f77560o;
        if (gVar2 == null) {
            gVar2 = this;
        }
        gVar.H(gVar2);
        if (gVar.g() != null) {
            gVar.b();
        }
        return gVar;
    }

    public void E(short[] sArr) {
        this.f77562q = sArr;
    }

    public void F(float f11) {
        this.f77564s = f11;
    }

    public void G(int i11) {
        this.f77559n = i11;
    }

    public void H(@d0 g gVar) {
        this.f77560o = gVar;
        if (gVar != null) {
            this.f77598d = gVar.f77598d;
            this.f77599e = gVar.f77599e;
            this.f77555j = gVar.f77555j;
            this.f77557l = gVar.f77557l;
            this.f77559n = gVar.f77559n;
            this.f77600f = gVar.f77600f;
            this.f77562q = gVar.f77562q;
            this.f77563r = gVar.f77563r;
            this.f77564s = gVar.f77564s;
        }
    }

    public void I(float[] fArr) {
        this.f77555j = fArr;
    }

    public void J(short[] sArr) {
        this.f77557l = sArr;
    }

    public void K(float[] fArr) {
        this.f77556k = fArr;
    }

    public void L(float f11) {
        this.f77563r = f11;
    }

    @Override // ol.f
    public void a(o oVar) {
        if (oVar == null) {
            throw new IllegalArgumentException("region cannot be null.");
        }
        this.f77553h = oVar;
    }

    @Override // ol.f
    public void b() {
        float g11;
        float i11;
        float j11;
        float[] fArr = this.f77555j;
        float[] fArr2 = this.f77556k;
        if (fArr2 == null || fArr2.length != fArr.length) {
            this.f77556k = new float[fArr.length];
        }
        float[] fArr3 = this.f77556k;
        int length = fArr3.length;
        o oVar = this.f77553h;
        int i12 = 0;
        float f11 = 1.0f;
        if (oVar instanceof e.a) {
            float g12 = oVar.g();
            float i13 = this.f77553h.i();
            e.a aVar = (e.a) this.f77553h;
            float C0 = aVar.f().C0();
            float I = aVar.f().I();
            int i14 = aVar.f12080q;
            if (i14 == 90) {
                int i15 = aVar.f12078o;
                float f12 = g12 - (((i15 - aVar.f12074k) - aVar.f12075l) / C0);
                int i16 = aVar.f12077n;
                float f13 = i13 - (((i16 - aVar.f12073j) - aVar.f12076m) / I);
                float f14 = i15 / C0;
                float f15 = i16 / I;
                while (i12 < length) {
                    int i17 = i12 + 1;
                    fArr3[i12] = (fArr[i17] * f14) + f12;
                    fArr3[i17] = ((1.0f - fArr[i12]) * f15) + f13;
                    i12 += 2;
                }
                return;
            }
            if (i14 == 180) {
                int i18 = aVar.f12077n;
                float f16 = g12 - (((i18 - aVar.f12073j) - aVar.f12075l) / C0);
                float f17 = i13 - (aVar.f12074k / I);
                float f18 = i18 / C0;
                float f19 = aVar.f12078o / I;
                while (i12 < length) {
                    fArr3[i12] = ((1.0f - fArr[i12]) * f18) + f16;
                    int i19 = i12 + 1;
                    fArr3[i19] = ((1.0f - fArr[i19]) * f19) + f17;
                    i12 += 2;
                }
                return;
            }
            if (i14 == 270) {
                float f21 = g12 - (aVar.f12074k / C0);
                float f22 = i13 - (aVar.f12073j / I);
                float f23 = aVar.f12078o / C0;
                float f24 = aVar.f12077n / I;
                while (i12 < length) {
                    int i21 = i12 + 1;
                    fArr3[i12] = ((1.0f - fArr[i21]) * f23) + f21;
                    fArr3[i21] = (fArr[i12] * f24) + f22;
                    i12 += 2;
                }
                return;
            }
            g11 = g12 - (aVar.f12073j / C0);
            int i22 = aVar.f12078o;
            i11 = i13 - (((i22 - aVar.f12074k) - aVar.f12076m) / I);
            float f25 = aVar.f12077n / C0;
            j11 = i22 / I;
            f11 = f25;
        } else if (oVar == null) {
            g11 = 0.0f;
            i11 = 0.0f;
            j11 = 1.0f;
        } else {
            g11 = oVar.g();
            i11 = this.f77553h.i();
            f11 = this.f77553h.h() - g11;
            j11 = this.f77553h.j() - i11;
        }
        while (i12 < length) {
            fArr3[i12] = (fArr[i12] * f11) + g11;
            int i23 = i12 + 1;
            fArr3[i23] = (fArr[i23] * j11) + i11;
            i12 += 2;
        }
    }

    @Override // ol.f
    public void c(@d0 Sequence sequence) {
        this.f77561p = sequence;
    }

    @Override // ol.f
    @d0
    public Sequence d() {
        return this.f77561p;
    }

    @Override // ol.f
    public com.badlogic.gdx.graphics.b e() {
        return this.f77558m;
    }

    @Override // ol.f
    public void f(String str) {
        this.f77554i = str;
    }

    @Override // ol.f
    @d0
    public o g() {
        return this.f77553h;
    }

    @Override // ol.f
    public String getPath() {
        return this.f77554i;
    }

    @Override // ol.l
    public void j(m mVar, int i11, int i12, float[] fArr, int i13, int i14) {
        Sequence sequence = this.f77561p;
        if (sequence != null) {
            sequence.a(mVar, this);
        }
        super.j(mVar, i11, i12, fArr, i13, i14);
    }

    @Override // ol.b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public g h() {
        return this.f77560o != null ? D() : new g(this);
    }

    @d0
    public short[] v() {
        return this.f77562q;
    }

    public float w() {
        return this.f77564s;
    }

    public int x() {
        return this.f77559n;
    }

    @d0
    public g y() {
        return this.f77560o;
    }

    public float[] z() {
        return this.f77555j;
    }

    public g(g gVar) {
        super(gVar);
        com.badlogic.gdx.graphics.b bVar = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f77558m = bVar;
        if (this.f77560o == null) {
            this.f77553h = gVar.f77553h;
            this.f77554i = gVar.f77554i;
            bVar.H(gVar.f77558m);
            float[] fArr = new float[gVar.f77555j.length];
            this.f77555j = fArr;
            pl.g.a(gVar.f77555j, 0, fArr, 0, fArr.length);
            float[] fArr2 = new float[gVar.f77556k.length];
            this.f77556k = fArr2;
            pl.g.a(gVar.f77556k, 0, fArr2, 0, fArr2.length);
            short[] sArr = new short[gVar.f77557l.length];
            this.f77557l = sArr;
            pl.g.a(gVar.f77557l, 0, sArr, 0, sArr.length);
            this.f77559n = gVar.f77559n;
            Sequence sequence = gVar.f77561p;
            this.f77561p = sequence != null ? new Sequence(sequence) : null;
            short[] sArr2 = gVar.f77562q;
            if (sArr2 != null) {
                short[] sArr3 = new short[sArr2.length];
                this.f77562q = sArr3;
                pl.g.a(gVar.f77562q, 0, sArr3, 0, sArr3.length);
            }
            this.f77563r = gVar.f77563r;
            this.f77564s = gVar.f77564s;
            return;
        }
        throw new IllegalArgumentException("Use newLinkedMesh to copy a linked mesh.");
    }
}
