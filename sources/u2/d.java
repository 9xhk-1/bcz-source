package u2;

import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import s2.g;
import s2.i;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends a {

    /* renamed from: j, reason: collision with root package name */
    public Matrix4 f91538j;

    /* renamed from: k, reason: collision with root package name */
    public Matrix4 f91539k;

    /* renamed from: l, reason: collision with root package name */
    public Vector3 f91540l;

    /* renamed from: m, reason: collision with root package name */
    public Vector2 f91541m;

    /* renamed from: n, reason: collision with root package name */
    public Vector2 f91542n;

    /* renamed from: o, reason: collision with root package name */
    public Vector2 f91543o;

    /* renamed from: p, reason: collision with root package name */
    public Vector2 f91544p;

    public d(s2.f fVar) {
        super(fVar);
        this.f91540l = new Vector3();
        this.f91541m = new Vector2();
        this.f91542n = new Vector2();
        this.f91543o = new Vector2();
        this.f91544p = new Vector2();
        init();
    }

    private void init() {
        Matrix4 matrix4 = new Matrix4();
        this.f91538j = matrix4;
        matrix4.idt();
        this.f91538j.scale((float) (Math.sqrt(2.0d) / 2.0d), (float) (Math.sqrt(2.0d) / 4.0d), 1.0f);
        this.f91538j.rotate(0.0f, 0.0f, 1.0f, -45.0f);
        Matrix4 matrix42 = new Matrix4(this.f91538j);
        this.f91539k = matrix42;
        matrix42.inv();
    }

    @Override // s2.h
    public void D(i iVar) {
        TiledMapTile d11;
        i iVar2 = iVar;
        float Q0 = Q0(iVar2, this.f91529c.e());
        float C = iVar2.C() * this.f91528b;
        float B = iVar2.B() * this.f91528b;
        float l11 = (iVar2.l() * this.f91528b) - (this.f91530d.f12533x * (iVar2.h() - 1.0f));
        float i11 = ((-iVar2.m()) * this.f91528b) - (this.f91530d.f12534y * (iVar2.i() - 1.0f));
        float f11 = C * 0.5f;
        float f12 = B * 0.5f;
        Vector2 vector2 = this.f91541m;
        Rectangle rectangle = this.f91530d;
        vector2.set((rectangle.f12533x + rectangle.width) - l11, rectangle.f12534y - i11);
        Vector2 vector22 = this.f91542n;
        Rectangle rectangle2 = this.f91530d;
        vector22.set(rectangle2.f12533x - l11, (rectangle2.f12534y + rectangle2.height) - i11);
        Vector2 vector23 = this.f91543o;
        Rectangle rectangle3 = this.f91530d;
        vector23.set(rectangle3.f12533x - l11, rectangle3.f12534y - i11);
        Vector2 vector24 = this.f91544p;
        Rectangle rectangle4 = this.f91530d;
        vector24.set((rectangle4.f12533x + rectangle4.width) - l11, (rectangle4.f12534y + rectangle4.height) - i11);
        int i12 = 2;
        int i13 = ((int) (d1(this.f91543o).f12538y / C)) - 2;
        int i14 = ((int) (d1(this.f91544p).f12538y / C)) + 2;
        int i15 = ((int) (d1(this.f91542n).f12537x / C)) - 2;
        int i16 = ((int) (d1(this.f91541m).f12537x / C)) + 2;
        while (i14 >= i13) {
            int i17 = i15;
            while (i17 <= i16) {
                float f13 = i17;
                float f14 = i14;
                float f15 = (f13 * f11) + (f14 * f11);
                float f16 = (f14 * f12) - (f13 * f12);
                i.a z11 = iVar2.z(i17, i14);
                if (z11 != null && (d11 = z11.d()) != null) {
                    boolean a11 = z11.a();
                    boolean b11 = z11.b();
                    int c11 = z11.c();
                    o b12 = d11.b();
                    int i18 = i12;
                    float c12 = f15 + (d11.c() * this.f91528b) + l11;
                    float f17 = f16 + (d11.f() * this.f91528b) + i11;
                    float c13 = (b12.c() * this.f91528b) + c12;
                    float b13 = (b12.b() * this.f91528b) + f17;
                    float g11 = b12.g();
                    float j11 = b12.j();
                    float h11 = b12.h();
                    float i19 = b12.i();
                    float[] fArr = this.f91534h;
                    fArr[0] = c12;
                    fArr[1] = f17;
                    fArr[i18] = Q0;
                    fArr[3] = g11;
                    fArr[4] = j11;
                    fArr[5] = c12;
                    fArr[6] = b13;
                    fArr[7] = Q0;
                    fArr[8] = g11;
                    fArr[9] = i19;
                    fArr[10] = c13;
                    fArr[11] = b13;
                    fArr[12] = Q0;
                    fArr[13] = h11;
                    fArr[14] = i19;
                    fArr[15] = c13;
                    fArr[16] = f17;
                    fArr[17] = Q0;
                    fArr[18] = h11;
                    fArr[19] = j11;
                    if (a11) {
                        fArr[3] = h11;
                        fArr[13] = g11;
                        fArr[8] = h11;
                        fArr[18] = g11;
                    }
                    if (b11) {
                        fArr[4] = i19;
                        fArr[14] = j11;
                        fArr[9] = j11;
                        fArr[19] = i19;
                    }
                    if (c11 != 0) {
                        if (c11 == 1) {
                            float f18 = fArr[4];
                            fArr[4] = fArr[9];
                            fArr[9] = fArr[14];
                            fArr[14] = fArr[19];
                            fArr[19] = f18;
                            float f19 = fArr[3];
                            fArr[3] = fArr[8];
                            fArr[8] = fArr[13];
                            fArr[13] = fArr[18];
                            fArr[18] = f19;
                        } else if (c11 == i18) {
                            float f21 = fArr[3];
                            fArr[3] = fArr[13];
                            fArr[13] = f21;
                            float f22 = fArr[8];
                            fArr[8] = fArr[18];
                            fArr[18] = f22;
                            float f23 = fArr[4];
                            fArr[4] = fArr[14];
                            fArr[14] = f23;
                            float f24 = fArr[9];
                            fArr[9] = fArr[19];
                            fArr[19] = f24;
                        } else if (c11 == 3) {
                            float f25 = fArr[4];
                            fArr[4] = fArr[19];
                            fArr[19] = fArr[14];
                            fArr[14] = fArr[9];
                            fArr[9] = f25;
                            float f26 = fArr[3];
                            fArr[3] = fArr[18];
                            fArr[18] = fArr[13];
                            fArr[13] = fArr[8];
                            fArr[8] = f26;
                        }
                    }
                    this.f91529c.t0(b12.f(), this.f91534h, 0, 20);
                }
                i17++;
                iVar2 = iVar;
                i12 = 2;
            }
            i14--;
            iVar2 = iVar;
            i12 = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u2.a, s2.h
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
        int intValue = ((Integer) J0().o().d("tileheight", Integer.class)).intValue();
        float intValue2 = ((Integer) J0().o().d("height", Integer.class)).intValue() * intValue;
        float f17 = this.f91528b;
        float f18 = intValue2 * f17;
        float f19 = intValue * 0.5f * f17;
        float C = gVar2.C();
        float D = gVar2.D();
        float h11 = (C * this.f91528b) - (this.f91530d.f12533x * (gVar2.h() - 1.0f));
        float i14 = (((D * this.f91528b) - (this.f91530d.f12534y * (gVar2.i() - 1.0f))) - (f18 * 0.5f)) + f19;
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
            c11 = 17;
            objArr = 16;
            c12 = 15;
            i11 = (int) Math.ceil((this.f91530d.width / this.f91531e.width) + 4.0f);
        } else {
            c11 = 17;
            objArr = 16;
            c12 = 15;
            i11 = 0;
        }
        int ceil = gVar2.F() ? (int) Math.ceil((this.f91530d.height / this.f91531e.height) + 4.0f) : 0;
        Rectangle rectangle = this.f91530d;
        Object[] objArr2 = objArr;
        float f21 = rectangle.f12533x;
        float f22 = rectangle.f12534y;
        Rectangle rectangle2 = this.f91531e;
        float f23 = f21 - (f21 % rectangle2.width);
        float f24 = f22 - (f22 % rectangle2.height);
        int i17 = 0;
        while (i17 <= i11) {
            int i18 = i15;
            while (i18 <= ceil) {
                if (gVar2.E()) {
                    i12 = i15;
                    f11 = C0;
                    float f25 = this.f91531e.width;
                    f13 = ((i17 - 2) * f25) + f23 + (h11 % f25);
                    f12 = f25 + f13;
                } else {
                    f11 = C0;
                    i12 = i15;
                    f12 = c13;
                    f13 = h11;
                }
                if (gVar2.F()) {
                    f14 = f12;
                    float f26 = this.f91531e.height;
                    float f27 = f24 + ((i18 - 2) * f26) + (i14 % f26);
                    f15 = f27 + f26;
                    f16 = f27;
                } else {
                    f14 = f12;
                    f15 = b11;
                    f16 = i14;
                }
                o oVar = B;
                float f28 = c13;
                this.f91532f.set(f13, f16, f14 - f13, f15 - f16);
                if (this.f91530d.contains(this.f91532f) || this.f91530d.overlaps(this.f91532f)) {
                    float g12 = oVar.g();
                    float j12 = oVar.j();
                    float h13 = oVar.h();
                    float i19 = oVar.i();
                    fArr[i12] = f13;
                    fArr[1] = f16;
                    fArr[2] = f11;
                    fArr[3] = g12;
                    fArr[4] = j12;
                    fArr[5] = f13;
                    fArr[6] = f15;
                    fArr[7] = f11;
                    fArr[8] = g12;
                    fArr[9] = i19;
                    fArr[10] = f14;
                    fArr[11] = f15;
                    fArr[12] = f11;
                    fArr[13] = h13;
                    fArr[14] = i19;
                    fArr[c12] = f14;
                    fArr[objArr2 == true ? 1 : 0] = f16;
                    fArr[c11] = f11;
                    fArr[18] = h13;
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
                c13 = f28;
            }
            i17++;
            gVar2 = gVar;
            c13 = c13;
        }
    }

    public final Vector3 d1(Vector2 vector2) {
        this.f91540l.set(vector2.f12535x, vector2.f12536y, 0.0f);
        this.f91540l.mul(this.f91539k);
        return this.f91540l;
    }

    public d(s2.f fVar, w1.a aVar) {
        super(fVar, aVar);
        this.f91540l = new Vector3();
        this.f91541m = new Vector2();
        this.f91542n = new Vector2();
        this.f91543o = new Vector2();
        this.f91544p = new Vector2();
        init();
    }

    public d(s2.f fVar, float f11) {
        super(fVar, f11);
        this.f91540l = new Vector3();
        this.f91541m = new Vector2();
        this.f91542n = new Vector2();
        this.f91543o = new Vector2();
        this.f91544p = new Vector2();
        init();
    }

    public d(s2.f fVar, float f11, w1.a aVar) {
        super(fVar, f11, aVar);
        this.f91540l = new Vector3();
        this.f91541m = new Vector2();
        this.f91542n = new Vector2();
        this.f91543o = new Vector2();
        this.f91544p = new Vector2();
        init();
    }
}
