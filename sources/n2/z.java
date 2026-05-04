package n2;

import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class z implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.s f74263a;

    /* renamed from: b, reason: collision with root package name */
    public final FloatBuffer f74264b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f74265c;

    /* renamed from: d, reason: collision with root package name */
    public int f74266d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f74267e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f74268f;

    /* renamed from: g, reason: collision with root package name */
    public final int f74269g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f74270h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f74271i;

    public z(boolean z11, int i11, com.badlogic.gdx.graphics.r... rVarArr) {
        this(z11, i11, new com.badlogic.gdx.graphics.s(rVarArr));
    }

    private void b() {
        if (this.f74271i) {
            q1.g.f81385h.f1(com.badlogic.gdx.graphics.f.N, 0, this.f74265c.limit(), this.f74265c);
            this.f74270h = false;
        }
    }

    private int o() {
        int S0 = q1.g.f81385h.S0();
        q1.g.f81385h.j3(com.badlogic.gdx.graphics.f.N, S0);
        q1.g.f81385h.m2(com.badlogic.gdx.graphics.f.N, this.f74265c.capacity(), null, this.f74269g);
        q1.g.f81385h.j3(com.badlogic.gdx.graphics.f.N, 0);
        return S0;
    }

    @Override // n2.b0
    public void S0(float[] fArr, int i11, int i12) {
        this.f74270h = true;
        if (this.f74267e) {
            BufferUtils.j(fArr, this.f74265c, i12, i11);
            this.f74264b.position(0);
            this.f74264b.limit(i12);
        } else {
            this.f74264b.clear();
            this.f74264b.put(fArr, i11, i12);
            this.f74264b.flip();
            this.f74265c.position(0);
            this.f74265c.limit(this.f74264b.limit() << 2);
        }
        b();
    }

    @Override // n2.b0
    public int W() {
        return this.f74265c.capacity() / this.f74263a.f12497b;
    }

    @Override // n2.b0
    public FloatBuffer d(boolean z11) {
        this.f74270h = z11 | this.f74270h;
        return this.f74264b;
    }

    @Override // n2.b0, a3.q
    public void dispose() {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        fVar.j3(com.badlogic.gdx.graphics.f.N, 0);
        fVar.s(this.f74266d);
        this.f74266d = 0;
    }

    @Override // n2.b0
    public void f(w wVar) {
        i(wVar, null);
    }

    @Override // n2.b0
    public void g(w wVar, int[] iArr) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        fVar.j3(com.badlogic.gdx.graphics.f.N, this.f74266d);
        if (this.f74270h) {
            this.f74265c.limit(this.f74264b.limit() * 4);
            fVar.m2(com.badlogic.gdx.graphics.f.N, this.f74265c.limit(), this.f74265c, this.f74269g);
            this.f74270h = false;
        }
        int size = this.f74263a.size();
        if (iArr == null) {
            for (int i11 = 0; i11 < size; i11++) {
                com.badlogic.gdx.graphics.r f11 = this.f74263a.f(i11);
                int V0 = wVar.V0(f11.f12493f);
                if (V0 >= 0) {
                    wVar.Z(V0);
                    wVar.m2(V0, f11.f12489b, f11.f12491d, f11.f12490c, this.f74263a.f12497b, f11.f12492e);
                }
            }
        } else {
            for (int i12 = 0; i12 < size; i12++) {
                com.badlogic.gdx.graphics.r f12 = this.f74263a.f(i12);
                int i13 = iArr[i12];
                if (i13 >= 0) {
                    wVar.Z(i13);
                    wVar.m2(i13, f12.f12489b, f12.f12491d, f12.f12490c, this.f74263a.f12497b, f12.f12492e);
                }
            }
        }
        this.f74271i = true;
    }

    @Override // n2.b0
    public com.badlogic.gdx.graphics.s getAttributes() {
        return this.f74263a;
    }

    @Override // n2.b0
    @Deprecated
    public FloatBuffer getBuffer() {
        this.f74270h = true;
        return this.f74264b;
    }

    @Override // n2.b0
    public void i(w wVar, int[] iArr) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        int size = this.f74263a.size();
        if (iArr == null) {
            for (int i11 = 0; i11 < size; i11++) {
                wVar.X(this.f74263a.f(i11).f12493f);
            }
        } else {
            for (int i12 = 0; i12 < size; i12++) {
                int i13 = iArr[i12];
                if (i13 >= 0) {
                    wVar.R(i13);
                }
            }
        }
        fVar.j3(com.badlogic.gdx.graphics.f.N, 0);
        this.f74271i = false;
    }

    @Override // n2.b0
    public void invalidate() {
        this.f74266d = o();
        this.f74270h = true;
    }

    @Override // n2.b0
    public int m() {
        return (this.f74264b.limit() * 4) / this.f74263a.f12497b;
    }

    @Override // n2.b0
    public void n(w wVar) {
        g(wVar, null);
    }

    @Override // n2.b0
    public void r0(int i11, float[] fArr, int i12, int i13) {
        this.f74270h = true;
        if (!this.f74267e) {
            throw new GdxRuntimeException("Buffer must be allocated direct.");
        }
        int position = this.f74265c.position();
        this.f74265c.position(i11 * 4);
        BufferUtils.h(fArr, i12, i13, this.f74265c);
        this.f74265c.position(position);
        b();
    }

    public int z() {
        return this.f74266d;
    }

    public z(boolean z11, int i11, com.badlogic.gdx.graphics.s sVar) {
        this.f74270h = false;
        this.f74271i = false;
        this.f74268f = z11;
        this.f74263a = sVar;
        ByteBuffer C = BufferUtils.C(sVar.f12497b * i11);
        this.f74265c = C;
        this.f74267e = true;
        this.f74269g = z11 ? com.badlogic.gdx.graphics.f.S : com.badlogic.gdx.graphics.f.T;
        FloatBuffer asFloatBuffer = C.asFloatBuffer();
        this.f74264b = asFloatBuffer;
        this.f74266d = o();
        asFloatBuffer.flip();
        C.flip();
    }
}
