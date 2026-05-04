package no;

import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
/* loaded from: classes7.dex */
public abstract class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f75213a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @uo.a
    public final o j(int bytes) {
        try {
            n(this.f75213a.array(), 0, bytes);
            return this;
        } finally {
            u.a(this.f75213a);
        }
    }

    public abstract void k(byte b11);

    public void l(ByteBuffer b11) {
        if (b11.hasArray()) {
            n(b11.array(), b11.arrayOffset() + b11.position(), b11.remaining());
            u.d(b11, b11.limit());
        } else {
            for (int remaining = b11.remaining(); remaining > 0; remaining--) {
                k(b11.get());
            }
        }
    }

    public void m(byte[] b11) {
        n(b11, 0, b11.length);
    }

    public void n(byte[] b11, int off, int len) {
        for (int i11 = off; i11 < off + len; i11++) {
            k(b11[i11]);
        }
    }

    @Override // no.o, no.f0
    @uo.a
    public o a(byte b11) {
        k(b11);
        return this;
    }

    @Override // no.d, no.o, no.f0
    @uo.a
    public o b(byte[] bytes) {
        Preconditions.checkNotNull(bytes);
        m(bytes);
        return this;
    }

    @Override // no.d, no.o, no.f0
    @uo.a
    public o c(char c11) {
        this.f75213a.putChar(c11);
        return j(2);
    }

    @Override // no.d, no.o, no.f0
    @uo.a
    public o e(byte[] bytes, int off, int len) {
        Preconditions.checkPositionIndexes(off, off + len, bytes.length);
        n(bytes, off, len);
        return this;
    }

    @Override // no.d, no.o, no.f0
    @uo.a
    public o f(ByteBuffer bytes) {
        l(bytes);
        return this;
    }

    @Override // no.d, no.o, no.f0
    @uo.a
    public o putInt(int i11) {
        this.f75213a.putInt(i11);
        return j(4);
    }

    @Override // no.d, no.o, no.f0
    @uo.a
    public o putLong(long l11) {
        this.f75213a.putLong(l11);
        return j(8);
    }

    @Override // no.d, no.o, no.f0
    @uo.a
    public o putShort(short s11) {
        this.f75213a.putShort(s11);
        return j(2);
    }
}
