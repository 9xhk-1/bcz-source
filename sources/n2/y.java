package n2;

import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class y implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.graphics.s f74255a;

    /* renamed from: b, reason: collision with root package name */
    public FloatBuffer f74256b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f74257c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f74258d;

    /* renamed from: e, reason: collision with root package name */
    public int f74259e;

    /* renamed from: f, reason: collision with root package name */
    public int f74260f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f74261g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f74262h;

    public y(boolean z11, int i11, com.badlogic.gdx.graphics.r... rVarArr) {
        this(z11, i11, new com.badlogic.gdx.graphics.s(rVarArr));
    }

    private void b() {
        if (this.f74262h) {
            q1.g.f81385h.m2(com.badlogic.gdx.graphics.f.N, this.f74257c.limit(), this.f74257c, this.f74260f);
            this.f74261g = false;
        }
    }

    public void D(int i11) {
        if (this.f74262h) {
            throw new GdxRuntimeException("Cannot change usage while VBO is bound");
        }
        this.f74260f = i11;
    }

    @Override // n2.b0
    public void S0(float[] fArr, int i11, int i12) {
        this.f74261g = true;
        BufferUtils.j(fArr, this.f74257c, i12, i11);
        this.f74256b.position(0);
        this.f74256b.limit(i12);
        b();
    }

    @Override // n2.b0
    public int W() {
        return this.f74257c.capacity() / this.f74255a.f12497b;
    }

    @Override // n2.b0
    public FloatBuffer d(boolean z11) {
        this.f74261g = z11 | this.f74261g;
        return this.f74256b;
    }

    @Override // n2.b0, a3.q
    public void dispose() {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        fVar.j3(com.badlogic.gdx.graphics.f.N, 0);
        fVar.s(this.f74259e);
        this.f74259e = 0;
        if (this.f74258d) {
            BufferUtils.p(this.f74257c);
        }
    }

    @Override // n2.b0
    public void f(w wVar) {
        i(wVar, null);
    }

    @Override // n2.b0
    public void g(w wVar, int[] iArr) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        fVar.j3(com.badlogic.gdx.graphics.f.N, this.f74259e);
        if (this.f74261g) {
            this.f74257c.limit(this.f74256b.limit() * 4);
            fVar.m2(com.badlogic.gdx.graphics.f.N, this.f74257c.limit(), this.f74257c, this.f74260f);
            this.f74261g = false;
        }
        int size = this.f74255a.size();
        if (iArr == null) {
            for (int i11 = 0; i11 < size; i11++) {
                com.badlogic.gdx.graphics.r f11 = this.f74255a.f(i11);
                int V0 = wVar.V0(f11.f12493f);
                if (V0 >= 0) {
                    wVar.Z(V0);
                    wVar.m2(V0, f11.f12489b, f11.f12491d, f11.f12490c, this.f74255a.f12497b, f11.f12492e);
                }
            }
        } else {
            for (int i12 = 0; i12 < size; i12++) {
                com.badlogic.gdx.graphics.r f12 = this.f74255a.f(i12);
                int i13 = iArr[i12];
                if (i13 >= 0) {
                    wVar.Z(i13);
                    wVar.m2(i13, f12.f12489b, f12.f12491d, f12.f12490c, this.f74255a.f12497b, f12.f12492e);
                }
            }
        }
        this.f74262h = true;
    }

    @Override // n2.b0
    public com.badlogic.gdx.graphics.s getAttributes() {
        return this.f74255a;
    }

    @Override // n2.b0
    @Deprecated
    public FloatBuffer getBuffer() {
        this.f74261g = true;
        return this.f74256b;
    }

    @Override // n2.b0
    public void i(w wVar, int[] iArr) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        int size = this.f74255a.size();
        if (iArr == null) {
            for (int i11 = 0; i11 < size; i11++) {
                wVar.X(this.f74255a.f(i11).f12493f);
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
        this.f74262h = false;
    }

    @Override // n2.b0
    public void invalidate() {
        this.f74259e = q1.g.f81385h.S0();
        this.f74261g = true;
    }

    @Override // n2.b0
    public int m() {
        return (this.f74256b.limit() * 4) / this.f74255a.f12497b;
    }

    @Override // n2.b0
    public void n(w wVar) {
        g(wVar, null);
    }

    public int o() {
        return this.f74260f;
    }

    @Override // n2.b0
    public void r0(int i11, float[] fArr, int i12, int i13) {
        this.f74261g = true;
        int position = this.f74257c.position();
        this.f74257c.position(i11 * 4);
        BufferUtils.h(fArr, i12, i13, this.f74257c);
        this.f74257c.position(position);
        this.f74256b.position(0);
        b();
    }

    public void z(Buffer buffer, boolean z11, com.badlogic.gdx.graphics.s sVar) {
        ByteBuffer byteBuffer;
        if (this.f74262h) {
            throw new GdxRuntimeException("Cannot change attributes while VBO is bound");
        }
        if (this.f74258d && (byteBuffer = this.f74257c) != null) {
            BufferUtils.p(byteBuffer);
        }
        this.f74255a = sVar;
        if (!(buffer instanceof ByteBuffer)) {
            throw new GdxRuntimeException("Only ByteBuffer is currently supported");
        }
        ByteBuffer byteBuffer2 = (ByteBuffer) buffer;
        this.f74257c = byteBuffer2;
        this.f74258d = z11;
        int limit = byteBuffer2.limit();
        ByteBuffer byteBuffer3 = this.f74257c;
        byteBuffer3.limit(byteBuffer3.capacity());
        this.f74256b = this.f74257c.asFloatBuffer();
        this.f74257c.limit(limit);
        this.f74256b.limit(limit / 4);
    }

    public y(boolean z11, int i11, com.badlogic.gdx.graphics.s sVar) {
        this.f74261g = false;
        this.f74262h = false;
        this.f74259e = q1.g.f81385h.S0();
        ByteBuffer J = BufferUtils.J(sVar.f12497b * i11);
        J.limit(0);
        z(J, true, sVar);
        D(z11 ? com.badlogic.gdx.graphics.f.S : com.badlogic.gdx.graphics.f.T);
    }

    public y(int i11, ByteBuffer byteBuffer, boolean z11, com.badlogic.gdx.graphics.s sVar) {
        this.f74261g = false;
        this.f74262h = false;
        this.f74259e = q1.g.f81385h.S0();
        z(byteBuffer, z11, sVar);
        D(i11);
    }
}
