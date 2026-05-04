package n2;

import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.s f74209a;

    /* renamed from: b, reason: collision with root package name */
    public final FloatBuffer f74210b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f74211c;

    /* renamed from: d, reason: collision with root package name */
    public int f74212d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f74213e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f74214f;

    /* renamed from: g, reason: collision with root package name */
    public final int f74215g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f74216h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f74217i;

    public r(boolean z11, int i11, com.badlogic.gdx.graphics.r... rVarArr) {
        this(z11, i11, new com.badlogic.gdx.graphics.s(rVarArr));
    }

    private void b() {
        if (this.f74217i) {
            q1.g.f81385h.m2(com.badlogic.gdx.graphics.f.N, this.f74211c.limit(), null, this.f74215g);
            q1.g.f81385h.f1(com.badlogic.gdx.graphics.f.N, 0, this.f74211c.limit(), this.f74211c);
            this.f74216h = false;
        }
    }

    private int o() {
        int S0 = q1.g.f81385h.S0();
        q1.g.f81385h.j3(com.badlogic.gdx.graphics.f.N, S0);
        q1.g.f81385h.m2(com.badlogic.gdx.graphics.f.N, this.f74211c.capacity(), null, this.f74215g);
        q1.g.f81385h.j3(com.badlogic.gdx.graphics.f.N, 0);
        return S0;
    }

    @Override // n2.s
    public void I0(int i11, FloatBuffer floatBuffer, int i12, int i13) {
        this.f74216h = true;
        if (!this.f74213e) {
            throw new GdxRuntimeException("Buffer must be allocated direct.");
        }
        int position = this.f74211c.position();
        this.f74211c.position(i11 * 4);
        floatBuffer.position(i12 * 4);
        BufferUtils.b(floatBuffer, this.f74211c, i13);
        this.f74211c.position(position);
        b();
    }

    @Override // n2.s
    public void Y0(FloatBuffer floatBuffer, int i11) {
        this.f74216h = true;
        if (this.f74213e) {
            BufferUtils.b(floatBuffer, this.f74211c, i11);
            this.f74210b.position(0);
            this.f74210b.limit(i11);
        } else {
            this.f74210b.clear();
            this.f74210b.put(floatBuffer);
            this.f74210b.flip();
            this.f74211c.position(0);
            this.f74211c.limit(this.f74210b.limit() << 2);
        }
        b();
    }

    @Override // n2.s
    public FloatBuffer d(boolean z11) {
        this.f74216h = z11 | this.f74216h;
        return this.f74210b;
    }

    @Override // n2.s, a3.q
    public void dispose() {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        fVar.j3(com.badlogic.gdx.graphics.f.N, 0);
        fVar.s(this.f74212d);
        this.f74212d = 0;
    }

    @Override // n2.s
    public void f(w wVar) {
        i(wVar, null);
    }

    @Override // n2.s
    public void g(w wVar, int[] iArr) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        fVar.j3(com.badlogic.gdx.graphics.f.N, this.f74212d);
        if (this.f74216h) {
            this.f74211c.limit(this.f74210b.limit() * 4);
            fVar.m2(com.badlogic.gdx.graphics.f.N, this.f74211c.limit(), this.f74211c, this.f74215g);
            this.f74216h = false;
        }
        int size = this.f74209a.size();
        if (iArr == null) {
            for (int i11 = 0; i11 < size; i11++) {
                com.badlogic.gdx.graphics.r f11 = this.f74209a.f(i11);
                int V0 = wVar.V0(f11.f12493f);
                if (V0 >= 0) {
                    int i12 = V0 + f11.f12494g;
                    wVar.Z(i12);
                    wVar.m2(i12, f11.f12489b, f11.f12491d, f11.f12490c, this.f74209a.f12497b, f11.f12492e);
                    q1.g.f81386i.I2(i12, 1);
                }
            }
        } else {
            for (int i13 = 0; i13 < size; i13++) {
                com.badlogic.gdx.graphics.r f12 = this.f74209a.f(i13);
                int i14 = iArr[i13];
                if (i14 >= 0) {
                    int i15 = i14 + f12.f12494g;
                    wVar.Z(i15);
                    wVar.m2(i15, f12.f12489b, f12.f12491d, f12.f12490c, this.f74209a.f12497b, f12.f12492e);
                    q1.g.f81386i.I2(i15, 1);
                }
            }
        }
        this.f74217i = true;
    }

    @Override // n2.s
    public com.badlogic.gdx.graphics.s getAttributes() {
        return this.f74209a;
    }

    @Override // n2.s
    @Deprecated
    public FloatBuffer getBuffer() {
        this.f74216h = true;
        return this.f74210b;
    }

    @Override // n2.s
    public void h0(float[] fArr, int i11, int i12) {
        this.f74216h = true;
        if (this.f74213e) {
            BufferUtils.j(fArr, this.f74211c, i12, i11);
            this.f74210b.position(0);
            this.f74210b.limit(i12);
        } else {
            this.f74210b.clear();
            this.f74210b.put(fArr, i11, i12);
            this.f74210b.flip();
            this.f74211c.position(0);
            this.f74211c.limit(this.f74210b.limit() << 2);
        }
        b();
    }

    @Override // n2.s
    public void i(w wVar, int[] iArr) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        int size = this.f74209a.size();
        if (iArr == null) {
            for (int i11 = 0; i11 < size; i11++) {
                com.badlogic.gdx.graphics.r f11 = this.f74209a.f(i11);
                int V0 = wVar.V0(f11.f12493f);
                if (V0 >= 0) {
                    wVar.R(V0 + f11.f12494g);
                }
            }
        } else {
            for (int i12 = 0; i12 < size; i12++) {
                com.badlogic.gdx.graphics.r f12 = this.f74209a.f(i12);
                int i13 = iArr[i12];
                if (i13 >= 0) {
                    wVar.Z(i13 + f12.f12494g);
                }
            }
        }
        fVar.j3(com.badlogic.gdx.graphics.f.N, 0);
        this.f74217i = false;
    }

    @Override // n2.s
    public void invalidate() {
        this.f74212d = o();
        this.f74216h = true;
    }

    @Override // n2.s
    public void j0(int i11, float[] fArr, int i12, int i13) {
        this.f74216h = true;
        if (!this.f74213e) {
            throw new GdxRuntimeException("Buffer must be allocated direct.");
        }
        int position = this.f74211c.position();
        this.f74211c.position(i11 * 4);
        BufferUtils.h(fArr, i12, i13, this.f74211c);
        this.f74211c.position(position);
        b();
    }

    @Override // n2.s
    public int m0() {
        return (this.f74210b.limit() * 4) / this.f74209a.f12497b;
    }

    @Override // n2.s
    public void n(w wVar) {
        g(wVar, null);
    }

    @Override // n2.s
    public int x() {
        return this.f74211c.capacity() / this.f74209a.f12497b;
    }

    public int z() {
        return this.f74212d;
    }

    public r(boolean z11, int i11, com.badlogic.gdx.graphics.s sVar) {
        this.f74216h = false;
        this.f74217i = false;
        this.f74214f = z11;
        this.f74209a = sVar;
        ByteBuffer C = BufferUtils.C(sVar.f12497b * i11);
        this.f74211c = C;
        this.f74213e = true;
        this.f74215g = z11 ? com.badlogic.gdx.graphics.f.S : com.badlogic.gdx.graphics.f.T;
        FloatBuffer asFloatBuffer = C.asFloatBuffer();
        this.f74210b = asFloatBuffer;
        this.f74212d = o();
        asFloatBuffer.flip();
        C.flip();
    }
}
