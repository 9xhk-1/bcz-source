package n2;

import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class q implements s {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.graphics.s f74201a;

    /* renamed from: b, reason: collision with root package name */
    public FloatBuffer f74202b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f74203c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f74204d;

    /* renamed from: e, reason: collision with root package name */
    public int f74205e;

    /* renamed from: f, reason: collision with root package name */
    public int f74206f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f74207g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f74208h;

    public q(boolean z11, int i11, com.badlogic.gdx.graphics.r... rVarArr) {
        this(z11, i11, new com.badlogic.gdx.graphics.s(rVarArr));
    }

    public void D(int i11) {
        if (this.f74208h) {
            throw new GdxRuntimeException("Cannot change usage while VBO is bound");
        }
        this.f74206f = i11;
    }

    @Override // n2.s
    public void I0(int i11, FloatBuffer floatBuffer, int i12, int i13) {
        this.f74207g = true;
        int position = this.f74203c.position();
        this.f74203c.position(i11 * 4);
        floatBuffer.position(i12 * 4);
        BufferUtils.b(floatBuffer, this.f74203c, i13);
        this.f74203c.position(position);
        this.f74202b.position(0);
        b();
    }

    @Override // n2.s
    public void Y0(FloatBuffer floatBuffer, int i11) {
        this.f74207g = true;
        BufferUtils.b(floatBuffer, this.f74203c, i11);
        this.f74202b.position(0);
        this.f74202b.limit(i11);
        b();
    }

    public final void b() {
        if (this.f74208h) {
            q1.g.f81385h.m2(com.badlogic.gdx.graphics.f.N, this.f74203c.limit(), null, this.f74206f);
            q1.g.f81385h.m2(com.badlogic.gdx.graphics.f.N, this.f74203c.limit(), this.f74203c, this.f74206f);
            this.f74207g = false;
        }
    }

    @Override // n2.s
    public FloatBuffer d(boolean z11) {
        this.f74207g = z11 | this.f74207g;
        return this.f74202b;
    }

    @Override // n2.s, a3.q
    public void dispose() {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        fVar.j3(com.badlogic.gdx.graphics.f.N, 0);
        fVar.s(this.f74205e);
        this.f74205e = 0;
        if (this.f74204d) {
            BufferUtils.p(this.f74203c);
        }
    }

    @Override // n2.s
    public void f(w wVar) {
        i(wVar, null);
    }

    @Override // n2.s
    public void g(w wVar, int[] iArr) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        fVar.j3(com.badlogic.gdx.graphics.f.N, this.f74205e);
        if (this.f74207g) {
            this.f74203c.limit(this.f74202b.limit() * 4);
            fVar.m2(com.badlogic.gdx.graphics.f.N, this.f74203c.limit(), this.f74203c, this.f74206f);
            this.f74207g = false;
        }
        int size = this.f74201a.size();
        if (iArr == null) {
            for (int i11 = 0; i11 < size; i11++) {
                com.badlogic.gdx.graphics.r f11 = this.f74201a.f(i11);
                int V0 = wVar.V0(f11.f12493f);
                if (V0 >= 0) {
                    int i12 = V0 + f11.f12494g;
                    wVar.Z(i12);
                    wVar.m2(i12, f11.f12489b, f11.f12491d, f11.f12490c, this.f74201a.f12497b, f11.f12492e);
                    q1.g.f81386i.I2(i12, 1);
                }
            }
        } else {
            for (int i13 = 0; i13 < size; i13++) {
                com.badlogic.gdx.graphics.r f12 = this.f74201a.f(i13);
                int i14 = iArr[i13];
                if (i14 >= 0) {
                    int i15 = i14 + f12.f12494g;
                    wVar.Z(i15);
                    wVar.m2(i15, f12.f12489b, f12.f12491d, f12.f12490c, this.f74201a.f12497b, f12.f12492e);
                    q1.g.f81386i.I2(i15, 1);
                }
            }
        }
        this.f74208h = true;
    }

    @Override // n2.s
    public com.badlogic.gdx.graphics.s getAttributes() {
        return this.f74201a;
    }

    @Override // n2.s
    @Deprecated
    public FloatBuffer getBuffer() {
        this.f74207g = true;
        return this.f74202b;
    }

    @Override // n2.s
    public void h0(float[] fArr, int i11, int i12) {
        this.f74207g = true;
        BufferUtils.j(fArr, this.f74203c, i12, i11);
        this.f74202b.position(0);
        this.f74202b.limit(i12);
        b();
    }

    @Override // n2.s
    public void i(w wVar, int[] iArr) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        int size = this.f74201a.size();
        if (iArr == null) {
            for (int i11 = 0; i11 < size; i11++) {
                com.badlogic.gdx.graphics.r f11 = this.f74201a.f(i11);
                int V0 = wVar.V0(f11.f12493f);
                if (V0 >= 0) {
                    wVar.R(V0 + f11.f12494g);
                }
            }
        } else {
            for (int i12 = 0; i12 < size; i12++) {
                com.badlogic.gdx.graphics.r f12 = this.f74201a.f(i12);
                int i13 = iArr[i12];
                if (i13 >= 0) {
                    wVar.R(i13 + f12.f12494g);
                }
            }
        }
        fVar.j3(com.badlogic.gdx.graphics.f.N, 0);
        this.f74208h = false;
    }

    @Override // n2.s
    public void invalidate() {
        this.f74205e = q1.g.f81385h.S0();
        this.f74207g = true;
    }

    @Override // n2.s
    public void j0(int i11, float[] fArr, int i12, int i13) {
        this.f74207g = true;
        int position = this.f74203c.position();
        this.f74203c.position(i11 * 4);
        BufferUtils.h(fArr, i12, i13, this.f74203c);
        this.f74203c.position(position);
        this.f74202b.position(0);
        b();
    }

    @Override // n2.s
    public int m0() {
        return (this.f74202b.limit() * 4) / this.f74201a.f12497b;
    }

    @Override // n2.s
    public void n(w wVar) {
        g(wVar, null);
    }

    public int o() {
        return this.f74206f;
    }

    @Override // n2.s
    public int x() {
        return this.f74203c.capacity() / this.f74201a.f12497b;
    }

    public void z(Buffer buffer, boolean z11, com.badlogic.gdx.graphics.s sVar) {
        ByteBuffer byteBuffer;
        if (this.f74208h) {
            throw new GdxRuntimeException("Cannot change attributes while VBO is bound");
        }
        if (this.f74204d && (byteBuffer = this.f74203c) != null) {
            BufferUtils.p(byteBuffer);
        }
        this.f74201a = sVar;
        if (!(buffer instanceof ByteBuffer)) {
            throw new GdxRuntimeException("Only ByteBuffer is currently supported");
        }
        ByteBuffer byteBuffer2 = (ByteBuffer) buffer;
        this.f74203c = byteBuffer2;
        this.f74204d = z11;
        int limit = byteBuffer2.limit();
        ByteBuffer byteBuffer3 = this.f74203c;
        byteBuffer3.limit(byteBuffer3.capacity());
        this.f74202b = this.f74203c.asFloatBuffer();
        this.f74203c.limit(limit);
        this.f74202b.limit(limit / 4);
    }

    public q(boolean z11, int i11, com.badlogic.gdx.graphics.s sVar) {
        this.f74207g = false;
        this.f74208h = false;
        if (q1.g.f81386i == null) {
            throw new GdxRuntimeException("InstanceBufferObject requires a device running with GLES 3.0 compatibilty");
        }
        this.f74205e = q1.g.f81385h.S0();
        ByteBuffer J = BufferUtils.J(sVar.f12497b * i11);
        J.limit(0);
        z(J, true, sVar);
        D(z11 ? com.badlogic.gdx.graphics.f.S : com.badlogic.gdx.graphics.f.T);
    }
}
