package n2;

import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class m implements p {

    /* renamed from: a, reason: collision with root package name */
    public final ShortBuffer f74182a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f74183b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f74184c;

    public m(int i11) {
        boolean z11 = i11 == 0;
        this.f74184c = z11;
        ByteBuffer J = BufferUtils.J((z11 ? 1 : i11) * 2);
        this.f74183b = J;
        ShortBuffer asShortBuffer = J.asShortBuffer();
        this.f74182a = asShortBuffer;
        asShortBuffer.flip();
        J.flip();
    }

    @Override // n2.p
    public int D0() {
        if (this.f74184c) {
            return 0;
        }
        return this.f74182a.limit();
    }

    @Override // n2.p
    public void P(int i11, short[] sArr, int i12, int i13) {
        int position = this.f74183b.position();
        this.f74183b.position(i11 * 2);
        BufferUtils.o(sArr, i12, this.f74183b, i13);
        this.f74183b.position(position);
    }

    @Override // n2.p
    public void W0(ShortBuffer shortBuffer) {
        int position = shortBuffer.position();
        this.f74182a.clear();
        this.f74182a.limit(shortBuffer.remaining());
        this.f74182a.put(shortBuffer);
        this.f74182a.flip();
        shortBuffer.position(position);
        this.f74183b.position(0);
        this.f74183b.limit(this.f74182a.limit() << 1);
    }

    @Override // n2.p
    public ShortBuffer d(boolean z11) {
        return this.f74182a;
    }

    @Override // n2.p, a3.q
    public void dispose() {
        BufferUtils.p(this.f74183b);
    }

    @Override // n2.p
    @Deprecated
    public ShortBuffer getBuffer() {
        return this.f74182a;
    }

    @Override // n2.p
    public void l0(short[] sArr, int i11, int i12) {
        this.f74182a.clear();
        this.f74182a.put(sArr, i11, i12);
        this.f74182a.flip();
        this.f74183b.position(0);
        this.f74183b.limit(i12 << 1);
    }

    @Override // n2.p
    public int o0() {
        if (this.f74184c) {
            return 0;
        }
        return this.f74182a.capacity();
    }

    @Override // n2.p
    public void S() {
    }

    @Override // n2.p
    public void invalidate() {
    }

    @Override // n2.p
    public void p() {
    }
}
