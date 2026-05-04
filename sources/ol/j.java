package ol;

import a3.d0;
import com.esotericsoftware.spine.attachments.Sequence;
import jl.m;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class j extends b implements f {

    /* renamed from: o, reason: collision with root package name */
    public static final int f77573o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f77574p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f77575q = 2;

    /* renamed from: r, reason: collision with root package name */
    public static final int f77576r = 3;

    /* renamed from: s, reason: collision with root package name */
    public static final int f77577s = 4;

    /* renamed from: t, reason: collision with root package name */
    public static final int f77578t = 5;

    /* renamed from: u, reason: collision with root package name */
    public static final int f77579u = 6;

    /* renamed from: v, reason: collision with root package name */
    public static final int f77580v = 7;

    /* renamed from: b, reason: collision with root package name */
    public o f77581b;

    /* renamed from: c, reason: collision with root package name */
    public String f77582c;

    /* renamed from: d, reason: collision with root package name */
    public float f77583d;

    /* renamed from: e, reason: collision with root package name */
    public float f77584e;

    /* renamed from: f, reason: collision with root package name */
    public float f77585f;

    /* renamed from: g, reason: collision with root package name */
    public float f77586g;

    /* renamed from: h, reason: collision with root package name */
    public float f77587h;

    /* renamed from: i, reason: collision with root package name */
    public float f77588i;

    /* renamed from: j, reason: collision with root package name */
    public float f77589j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f77590k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f77591l;

    /* renamed from: m, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f77592m;

    /* renamed from: n, reason: collision with root package name */
    @d0
    public Sequence f77593n;

    public j(String str) {
        super(str);
        this.f77585f = 1.0f;
        this.f77586g = 1.0f;
        this.f77590k = new float[8];
        this.f77591l = new float[8];
        this.f77592m = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public void A(float f11) {
        this.f77584e = f11;
    }

    @Override // ol.f
    public void a(o oVar) {
        if (oVar == null) {
            throw new IllegalArgumentException("region cannot be null.");
        }
        this.f77581b = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012c  */
    @Override // ol.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ol.j.b():void");
    }

    @Override // ol.f
    public void c(@d0 Sequence sequence) {
        this.f77593n = sequence;
    }

    @Override // ol.f
    @d0
    public Sequence d() {
        return this.f77593n;
    }

    @Override // ol.f
    public com.badlogic.gdx.graphics.b e() {
        return this.f77592m;
    }

    @Override // ol.f
    public void f(String str) {
        this.f77582c = str;
    }

    @Override // ol.f
    @d0
    public o g() {
        return this.f77581b;
    }

    @Override // ol.f
    public String getPath() {
        return this.f77582c;
    }

    public void j(m mVar, float[] fArr, int i11, int i12) {
        Sequence sequence = this.f77593n;
        if (sequence != null) {
            sequence.a(mVar, this);
        }
        float[] fArr2 = this.f77591l;
        com.esotericsoftware.spine.b b11 = mVar.b();
        float B = b11.B();
        float C = b11.C();
        float b12 = b11.b();
        float j11 = b11.j();
        float k11 = b11.k();
        float m11 = b11.m();
        float f11 = fArr2[6];
        float f12 = fArr2[7];
        fArr[i11] = (f11 * b12) + (f12 * j11) + B;
        fArr[i11 + 1] = (f11 * k11) + (f12 * m11) + C;
        int i13 = i11 + i12;
        float f13 = fArr2[0];
        float f14 = fArr2[1];
        fArr[i13] = (f13 * b12) + (f14 * j11) + B;
        fArr[i13 + 1] = (f13 * k11) + (f14 * m11) + C;
        int i14 = i13 + i12;
        float f15 = fArr2[2];
        float f16 = fArr2[3];
        fArr[i14] = (f15 * b12) + (f16 * j11) + B;
        fArr[i14 + 1] = (f15 * k11) + (f16 * m11) + C;
        int i15 = i14 + i12;
        float f17 = fArr2[4];
        float f18 = fArr2[5];
        fArr[i15] = (b12 * f17) + (j11 * f18) + B;
        fArr[i15 + 1] = (f17 * k11) + (f18 * m11) + C;
    }

    @Override // ol.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public j h() {
        return new j(this);
    }

    public float l() {
        return this.f77589j;
    }

    public float[] m() {
        return this.f77591l;
    }

    public float n() {
        return this.f77587h;
    }

    public float o() {
        return this.f77585f;
    }

    public float p() {
        return this.f77586g;
    }

    public float[] q() {
        return this.f77590k;
    }

    public float r() {
        return this.f77588i;
    }

    public float s() {
        return this.f77583d;
    }

    public float t() {
        return this.f77584e;
    }

    public void u(float f11) {
        this.f77589j = f11;
    }

    public void v(float f11) {
        this.f77587h = f11;
    }

    public void w(float f11) {
        this.f77585f = f11;
    }

    public void x(float f11) {
        this.f77586g = f11;
    }

    public void y(float f11) {
        this.f77588i = f11;
    }

    public void z(float f11) {
        this.f77583d = f11;
    }

    public j(j jVar) {
        super(jVar);
        this.f77585f = 1.0f;
        this.f77586g = 1.0f;
        float[] fArr = new float[8];
        this.f77590k = fArr;
        float[] fArr2 = new float[8];
        this.f77591l = fArr2;
        com.badlogic.gdx.graphics.b bVar = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f77592m = bVar;
        this.f77581b = jVar.f77581b;
        this.f77582c = jVar.f77582c;
        this.f77583d = jVar.f77583d;
        this.f77584e = jVar.f77584e;
        this.f77585f = jVar.f77585f;
        this.f77586g = jVar.f77586g;
        this.f77587h = jVar.f77587h;
        this.f77588i = jVar.f77588i;
        this.f77589j = jVar.f77589j;
        pl.g.a(jVar.f77590k, 0, fArr, 0, 8);
        pl.g.a(jVar.f77591l, 0, fArr2, 0, 8);
        bVar.H(jVar.f77592m);
        Sequence sequence = jVar.f77593n;
        this.f77593n = sequence != null ? new Sequence(sequence) : null;
    }
}
