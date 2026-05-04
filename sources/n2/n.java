package n2;

import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class n implements p {

    /* renamed from: a, reason: collision with root package name */
    public final ShortBuffer f74185a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f74186b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f74187c;

    /* renamed from: d, reason: collision with root package name */
    public int f74188d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f74189e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f74190f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f74191g;

    /* renamed from: h, reason: collision with root package name */
    public final int f74192h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f74193i;

    public n(int i11) {
        this(true, i11);
    }

    @Override // n2.p
    public int D0() {
        if (this.f74193i) {
            return 0;
        }
        return this.f74185a.limit();
    }

    @Override // n2.p
    public void P(int i11, short[] sArr, int i12, int i13) {
        this.f74190f = true;
        int position = this.f74186b.position();
        this.f74186b.position(i11 * 2);
        BufferUtils.o(sArr, i12, this.f74186b, i13);
        this.f74186b.position(position);
        this.f74185a.position(0);
        if (this.f74191g) {
            q1.g.f81385h.m2(com.badlogic.gdx.graphics.f.O, this.f74186b.limit(), this.f74186b, this.f74192h);
            this.f74190f = false;
        }
    }

    @Override // n2.p
    public void S() {
        int i11 = this.f74188d;
        if (i11 == 0) {
            throw new GdxRuntimeException("No buffer allocated!");
        }
        q1.g.f81385h.j3(com.badlogic.gdx.graphics.f.O, i11);
        if (this.f74190f) {
            this.f74186b.limit(this.f74185a.limit() * 2);
            q1.g.f81385h.m2(com.badlogic.gdx.graphics.f.O, this.f74186b.limit(), this.f74186b, this.f74192h);
            this.f74190f = false;
        }
        this.f74191g = true;
    }

    @Override // n2.p
    public void W0(ShortBuffer shortBuffer) {
        this.f74190f = true;
        int position = shortBuffer.position();
        this.f74185a.clear();
        this.f74185a.put(shortBuffer);
        this.f74185a.flip();
        shortBuffer.position(position);
        this.f74186b.position(0);
        this.f74186b.limit(this.f74185a.limit() << 1);
        if (this.f74191g) {
            q1.g.f81385h.m2(com.badlogic.gdx.graphics.f.O, this.f74186b.limit(), this.f74186b, this.f74192h);
            this.f74190f = false;
        }
    }

    @Override // n2.p
    public ShortBuffer d(boolean z11) {
        this.f74190f = z11 | this.f74190f;
        return this.f74185a;
    }

    @Override // n2.p, a3.q
    public void dispose() {
        q1.g.f81385h.j3(com.badlogic.gdx.graphics.f.O, 0);
        q1.g.f81385h.s(this.f74188d);
        this.f74188d = 0;
        if (this.f74187c) {
            BufferUtils.p(this.f74186b);
        }
    }

    @Override // n2.p
    @Deprecated
    public ShortBuffer getBuffer() {
        this.f74190f = true;
        return this.f74185a;
    }

    @Override // n2.p
    public void invalidate() {
        this.f74188d = q1.g.f81385h.S0();
        this.f74190f = true;
    }

    @Override // n2.p
    public void l0(short[] sArr, int i11, int i12) {
        this.f74190f = true;
        this.f74185a.clear();
        this.f74185a.put(sArr, i11, i12);
        this.f74185a.flip();
        this.f74186b.position(0);
        this.f74186b.limit(i12 << 1);
        if (this.f74191g) {
            q1.g.f81385h.m2(com.badlogic.gdx.graphics.f.O, this.f74186b.limit(), this.f74186b, this.f74192h);
            this.f74190f = false;
        }
    }

    @Override // n2.p
    public int o0() {
        if (this.f74193i) {
            return 0;
        }
        return this.f74185a.capacity();
    }

    @Override // n2.p
    public void p() {
        q1.g.f81385h.j3(com.badlogic.gdx.graphics.f.O, 0);
        this.f74191g = false;
    }

    public n(boolean z11, int i11) {
        this.f74190f = true;
        this.f74191g = false;
        boolean z12 = i11 == 0;
        this.f74193i = z12;
        ByteBuffer J = BufferUtils.J((z12 ? 1 : i11) * 2);
        this.f74186b = J;
        this.f74189e = true;
        ShortBuffer asShortBuffer = J.asShortBuffer();
        this.f74185a = asShortBuffer;
        this.f74187c = true;
        asShortBuffer.flip();
        J.flip();
        this.f74188d = q1.g.f81385h.S0();
        this.f74192h = z11 ? com.badlogic.gdx.graphics.f.S : com.badlogic.gdx.graphics.f.T;
    }

    public n(boolean z11, ByteBuffer byteBuffer) {
        this.f74190f = true;
        this.f74191g = false;
        this.f74193i = byteBuffer.limit() == 0;
        this.f74186b = byteBuffer;
        this.f74189e = true;
        this.f74185a = byteBuffer.asShortBuffer();
        this.f74187c = false;
        this.f74188d = q1.g.f81385h.S0();
        this.f74192h = z11 ? com.badlogic.gdx.graphics.f.S : com.badlogic.gdx.graphics.f.T;
    }
}
