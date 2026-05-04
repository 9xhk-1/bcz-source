package n2;

import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a0 implements b0 {

    /* renamed from: l, reason: collision with root package name */
    public static final IntBuffer f74097l = BufferUtils.G(1);

    /* renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.s f74098a;

    /* renamed from: b, reason: collision with root package name */
    public final FloatBuffer f74099b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f74100c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f74101d;

    /* renamed from: e, reason: collision with root package name */
    public int f74102e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f74103f;

    /* renamed from: g, reason: collision with root package name */
    public final int f74104g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f74105h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f74106i;

    /* renamed from: j, reason: collision with root package name */
    public int f74107j;

    /* renamed from: k, reason: collision with root package name */
    public a3.v f74108k;

    public a0(boolean z11, int i11, com.badlogic.gdx.graphics.r... rVarArr) {
        this(z11, i11, new com.badlogic.gdx.graphics.s(rVarArr));
    }

    private void z() {
        if (this.f74106i) {
            q1.g.f81385h.j3(com.badlogic.gdx.graphics.f.N, this.f74102e);
            q1.g.f81385h.m2(com.badlogic.gdx.graphics.f.N, this.f74100c.limit(), this.f74100c, this.f74104g);
            this.f74105h = false;
        }
    }

    public final void D() {
        IntBuffer intBuffer = f74097l;
        intBuffer.clear();
        q1.g.f81386i.l2(1, intBuffer);
        this.f74107j = intBuffer.get();
    }

    public final void I() {
        if (this.f74107j != -1) {
            IntBuffer intBuffer = f74097l;
            intBuffer.clear();
            intBuffer.put(this.f74107j);
            intBuffer.flip();
            q1.g.f81386i.W2(1, intBuffer);
            this.f74107j = -1;
        }
    }

    public final void R(w wVar) {
        if (this.f74108k.f1640b == 0) {
            return;
        }
        int size = this.f74098a.size();
        for (int i11 = 0; i11 < size; i11++) {
            int m11 = this.f74108k.m(i11);
            if (m11 >= 0) {
                wVar.R(m11);
            }
        }
    }

    @Override // n2.b0
    public void S0(float[] fArr, int i11, int i12) {
        this.f74105h = true;
        BufferUtils.j(fArr, this.f74100c, i12, i11);
        this.f74099b.position(0);
        this.f74099b.limit(i12);
        z();
    }

    @Override // n2.b0
    public int W() {
        return this.f74100c.capacity() / this.f74098a.f12497b;
    }

    public final void b(w wVar, int[] iArr) {
        w wVar2;
        int i11 = 0;
        boolean z11 = this.f74108k.f1640b != 0;
        int size = this.f74098a.size();
        if (z11) {
            if (iArr == null) {
                for (int i12 = 0; z11 && i12 < size; i12++) {
                    z11 = wVar.V0(this.f74098a.f(i12).f12493f) == this.f74108k.m(i12);
                }
            } else {
                z11 = iArr.length == this.f74108k.f1640b;
                for (int i13 = 0; z11 && i13 < size; i13++) {
                    z11 = iArr[i13] == this.f74108k.m(i13);
                }
            }
        }
        if (z11) {
            return;
        }
        q1.g.f81384g.j3(com.badlogic.gdx.graphics.f.N, this.f74102e);
        R(wVar);
        this.f74108k.i();
        while (i11 < size) {
            com.badlogic.gdx.graphics.r f11 = this.f74098a.f(i11);
            if (iArr == null) {
                this.f74108k.a(wVar.V0(f11.f12493f));
            } else {
                this.f74108k.a(iArr[i11]);
            }
            int m11 = this.f74108k.m(i11);
            if (m11 < 0) {
                wVar2 = wVar;
            } else {
                wVar.Z(m11);
                wVar2 = wVar;
                wVar2.m2(m11, f11.f12489b, f11.f12491d, f11.f12490c, this.f74098a.f12497b, f11.f12492e);
            }
            i11++;
            wVar = wVar2;
        }
    }

    @Override // n2.b0
    public FloatBuffer d(boolean z11) {
        this.f74105h = z11 | this.f74105h;
        return this.f74099b;
    }

    @Override // n2.b0, a3.q
    public void dispose() {
        com.badlogic.gdx.graphics.g gVar = q1.g.f81386i;
        gVar.j3(com.badlogic.gdx.graphics.f.N, 0);
        gVar.s(this.f74102e);
        this.f74102e = 0;
        if (this.f74101d) {
            BufferUtils.p(this.f74100c);
        }
        I();
    }

    @Override // n2.b0
    public void f(w wVar) {
        i(wVar, null);
    }

    @Override // n2.b0
    public void g(w wVar, int[] iArr) {
        com.badlogic.gdx.graphics.g gVar = q1.g.f81386i;
        gVar.C(this.f74107j);
        b(wVar, iArr);
        o(gVar);
        this.f74106i = true;
    }

    @Override // n2.b0
    public com.badlogic.gdx.graphics.s getAttributes() {
        return this.f74098a;
    }

    @Override // n2.b0
    @Deprecated
    public FloatBuffer getBuffer() {
        this.f74105h = true;
        return this.f74099b;
    }

    @Override // n2.b0
    public void i(w wVar, int[] iArr) {
        q1.g.f81386i.C(0);
        this.f74106i = false;
    }

    @Override // n2.b0
    public void invalidate() {
        this.f74102e = q1.g.f81386i.S0();
        D();
        this.f74105h = true;
    }

    @Override // n2.b0
    public int m() {
        return (this.f74099b.limit() * 4) / this.f74098a.f12497b;
    }

    @Override // n2.b0
    public void n(w wVar) {
        g(wVar, null);
    }

    public final void o(com.badlogic.gdx.graphics.f fVar) {
        if (this.f74105h) {
            fVar.j3(com.badlogic.gdx.graphics.f.N, this.f74102e);
            this.f74100c.limit(this.f74099b.limit() * 4);
            fVar.m2(com.badlogic.gdx.graphics.f.N, this.f74100c.limit(), this.f74100c, this.f74104g);
            this.f74105h = false;
        }
    }

    @Override // n2.b0
    public void r0(int i11, float[] fArr, int i12, int i13) {
        this.f74105h = true;
        int position = this.f74100c.position();
        this.f74100c.position(i11 * 4);
        BufferUtils.h(fArr, i12, i13, this.f74100c);
        this.f74100c.position(position);
        this.f74099b.position(0);
        z();
    }

    public a0(boolean z11, int i11, com.badlogic.gdx.graphics.s sVar) {
        this.f74105h = false;
        this.f74106i = false;
        this.f74107j = -1;
        this.f74108k = new a3.v();
        this.f74103f = z11;
        this.f74098a = sVar;
        ByteBuffer J = BufferUtils.J(sVar.f12497b * i11);
        this.f74100c = J;
        FloatBuffer asFloatBuffer = J.asFloatBuffer();
        this.f74099b = asFloatBuffer;
        this.f74101d = true;
        asFloatBuffer.flip();
        J.flip();
        this.f74102e = q1.g.f81385h.S0();
        this.f74104g = z11 ? com.badlogic.gdx.graphics.f.S : com.badlogic.gdx.graphics.f.T;
        D();
    }

    public a0(boolean z11, ByteBuffer byteBuffer, com.badlogic.gdx.graphics.s sVar) {
        this.f74105h = false;
        this.f74106i = false;
        this.f74107j = -1;
        this.f74108k = new a3.v();
        this.f74103f = z11;
        this.f74098a = sVar;
        this.f74100c = byteBuffer;
        this.f74101d = false;
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        this.f74099b = asFloatBuffer;
        asFloatBuffer.flip();
        byteBuffer.flip();
        this.f74102e = q1.g.f81385h.S0();
        this.f74104g = z11 ? com.badlogic.gdx.graphics.f.S : com.badlogic.gdx.graphics.f.T;
        D();
    }
}
