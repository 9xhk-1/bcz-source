package n2;

import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class o implements p {

    /* renamed from: a, reason: collision with root package name */
    public final ShortBuffer f74194a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f74195b;

    /* renamed from: c, reason: collision with root package name */
    public int f74196c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f74197d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f74198e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f74199f = false;

    /* renamed from: g, reason: collision with root package name */
    public final int f74200g;

    public o(boolean z11, int i11) {
        ByteBuffer C = BufferUtils.C(i11 * 2);
        this.f74195b = C;
        this.f74197d = true;
        this.f74200g = z11 ? com.badlogic.gdx.graphics.f.S : com.badlogic.gdx.graphics.f.T;
        ShortBuffer asShortBuffer = C.asShortBuffer();
        this.f74194a = asShortBuffer;
        asShortBuffer.flip();
        C.flip();
        this.f74196c = b();
    }

    @Override // n2.p
    public int D0() {
        return this.f74194a.limit();
    }

    @Override // n2.p
    public void P(int i11, short[] sArr, int i12, int i13) {
        this.f74198e = true;
        int position = this.f74195b.position();
        this.f74195b.position(i11 * 2);
        BufferUtils.o(sArr, i12, this.f74195b, i13);
        this.f74195b.position(position);
        this.f74194a.position(0);
        if (this.f74199f) {
            q1.g.f81385h.f1(com.badlogic.gdx.graphics.f.O, 0, this.f74195b.limit(), this.f74195b);
            this.f74198e = false;
        }
    }

    @Override // n2.p
    public void S() {
        int i11 = this.f74196c;
        if (i11 == 0) {
            throw new GdxRuntimeException("IndexBufferObject cannot be used after it has been disposed.");
        }
        q1.g.f81385h.j3(com.badlogic.gdx.graphics.f.O, i11);
        if (this.f74198e) {
            this.f74195b.limit(this.f74194a.limit() * 2);
            q1.g.f81385h.f1(com.badlogic.gdx.graphics.f.O, 0, this.f74195b.limit(), this.f74195b);
            this.f74198e = false;
        }
        this.f74199f = true;
    }

    @Override // n2.p
    public void W0(ShortBuffer shortBuffer) {
        int position = shortBuffer.position();
        this.f74198e = true;
        this.f74194a.clear();
        this.f74194a.put(shortBuffer);
        this.f74194a.flip();
        shortBuffer.position(position);
        this.f74195b.position(0);
        this.f74195b.limit(this.f74194a.limit() << 1);
        if (this.f74199f) {
            q1.g.f81385h.f1(com.badlogic.gdx.graphics.f.O, 0, this.f74195b.limit(), this.f74195b);
            this.f74198e = false;
        }
    }

    public final int b() {
        int S0 = q1.g.f81385h.S0();
        q1.g.f81385h.j3(com.badlogic.gdx.graphics.f.O, S0);
        q1.g.f81385h.m2(com.badlogic.gdx.graphics.f.O, this.f74195b.capacity(), null, this.f74200g);
        q1.g.f81385h.j3(com.badlogic.gdx.graphics.f.O, 0);
        return S0;
    }

    @Override // n2.p
    public ShortBuffer d(boolean z11) {
        this.f74198e = z11 | this.f74198e;
        return this.f74194a;
    }

    @Override // n2.p, a3.q
    public void dispose() {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        fVar.j3(com.badlogic.gdx.graphics.f.O, 0);
        fVar.s(this.f74196c);
        this.f74196c = 0;
    }

    @Override // n2.p
    @Deprecated
    public ShortBuffer getBuffer() {
        this.f74198e = true;
        return this.f74194a;
    }

    @Override // n2.p
    public void invalidate() {
        this.f74196c = b();
        this.f74198e = true;
    }

    @Override // n2.p
    public void l0(short[] sArr, int i11, int i12) {
        this.f74198e = true;
        this.f74194a.clear();
        this.f74194a.put(sArr, i11, i12);
        this.f74194a.flip();
        this.f74195b.position(0);
        this.f74195b.limit(i12 << 1);
        if (this.f74199f) {
            q1.g.f81385h.f1(com.badlogic.gdx.graphics.f.O, 0, this.f74195b.limit(), this.f74195b);
            this.f74198e = false;
        }
    }

    @Override // n2.p
    public int o0() {
        return this.f74194a.capacity();
    }

    @Override // n2.p
    public void p() {
        q1.g.f81385h.j3(com.badlogic.gdx.graphics.f.O, 0);
        this.f74199f = false;
    }

    public o(int i11) {
        ByteBuffer C = BufferUtils.C(i11 * 2);
        this.f74195b = C;
        this.f74197d = true;
        this.f74200g = com.badlogic.gdx.graphics.f.S;
        ShortBuffer asShortBuffer = C.asShortBuffer();
        this.f74194a = asShortBuffer;
        asShortBuffer.flip();
        C.flip();
        this.f74196c = b();
    }
}
