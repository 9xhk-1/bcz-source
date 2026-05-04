package n2;

import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class x implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.s f74251a;

    /* renamed from: b, reason: collision with root package name */
    public final FloatBuffer f74252b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f74253c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f74254d;

    public x(int i11, com.badlogic.gdx.graphics.r... rVarArr) {
        this(i11, new com.badlogic.gdx.graphics.s(rVarArr));
    }

    @Override // n2.b0
    public void S0(float[] fArr, int i11, int i12) {
        BufferUtils.j(fArr, this.f74253c, i12, i11);
        this.f74252b.position(0);
        this.f74252b.limit(i12);
    }

    @Override // n2.b0
    public int W() {
        return this.f74253c.capacity() / this.f74251a.f12497b;
    }

    @Override // n2.b0
    public FloatBuffer d(boolean z11) {
        return this.f74252b;
    }

    @Override // n2.b0, a3.q
    public void dispose() {
        BufferUtils.p(this.f74253c);
    }

    @Override // n2.b0
    public void f(w wVar) {
        i(wVar, null);
    }

    @Override // n2.b0
    public void g(w wVar, int[] iArr) {
        int size = this.f74251a.size();
        this.f74253c.limit(this.f74252b.limit() * 4);
        if (iArr == null) {
            for (int i11 = 0; i11 < size; i11++) {
                com.badlogic.gdx.graphics.r f11 = this.f74251a.f(i11);
                int V0 = wVar.V0(f11.f12493f);
                if (V0 >= 0) {
                    wVar.Z(V0);
                    if (f11.f12491d == 5126) {
                        this.f74252b.position(f11.f12492e / 4);
                        wVar.n2(V0, f11.f12489b, f11.f12491d, f11.f12490c, this.f74251a.f12497b, this.f74252b);
                    } else {
                        this.f74253c.position(f11.f12492e);
                        wVar.n2(V0, f11.f12489b, f11.f12491d, f11.f12490c, this.f74251a.f12497b, this.f74253c);
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < size; i12++) {
                com.badlogic.gdx.graphics.r f12 = this.f74251a.f(i12);
                int i13 = iArr[i12];
                if (i13 >= 0) {
                    wVar.Z(i13);
                    if (f12.f12491d == 5126) {
                        this.f74252b.position(f12.f12492e / 4);
                        wVar.n2(i13, f12.f12489b, f12.f12491d, f12.f12490c, this.f74251a.f12497b, this.f74252b);
                    } else {
                        this.f74253c.position(f12.f12492e);
                        wVar.n2(i13, f12.f12489b, f12.f12491d, f12.f12490c, this.f74251a.f12497b, this.f74253c);
                    }
                }
            }
        }
        this.f74254d = true;
    }

    @Override // n2.b0
    public com.badlogic.gdx.graphics.s getAttributes() {
        return this.f74251a;
    }

    @Override // n2.b0
    @Deprecated
    public FloatBuffer getBuffer() {
        return this.f74252b;
    }

    @Override // n2.b0
    public void i(w wVar, int[] iArr) {
        int size = this.f74251a.size();
        if (iArr == null) {
            for (int i11 = 0; i11 < size; i11++) {
                wVar.X(this.f74251a.f(i11).f12493f);
            }
        } else {
            for (int i12 = 0; i12 < size; i12++) {
                int i13 = iArr[i12];
                if (i13 >= 0) {
                    wVar.R(i13);
                }
            }
        }
        this.f74254d = false;
    }

    @Override // n2.b0
    public int m() {
        return (this.f74252b.limit() * 4) / this.f74251a.f12497b;
    }

    @Override // n2.b0
    public void n(w wVar) {
        g(wVar, null);
    }

    @Override // n2.b0
    public void r0(int i11, float[] fArr, int i12, int i13) {
        int position = this.f74253c.position();
        this.f74253c.position(i11 * 4);
        BufferUtils.h(fArr, i12, i13, this.f74253c);
        this.f74253c.position(position);
    }

    public x(int i11, com.badlogic.gdx.graphics.s sVar) {
        this.f74254d = false;
        this.f74251a = sVar;
        ByteBuffer J = BufferUtils.J(sVar.f12497b * i11);
        this.f74253c = J;
        FloatBuffer asFloatBuffer = J.asFloatBuffer();
        this.f74252b = asFloatBuffer;
        asFloatBuffer.flip();
        J.flip();
    }

    @Override // n2.b0
    public void invalidate() {
    }
}
