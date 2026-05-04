package no;

import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
/* loaded from: classes7.dex */
public abstract class f extends d {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f75259a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75260b;

    /* renamed from: c, reason: collision with root package name */
    public final int f75261c;

    public f(int chunkSize) {
        this(chunkSize, chunkSize);
    }

    @Override // no.o
    public final m h() {
        k();
        u.b(this.f75259a);
        if (this.f75259a.remaining() > 0) {
            n(this.f75259a);
            ByteBuffer byteBuffer = this.f75259a;
            u.d(byteBuffer, byteBuffer.limit());
        }
        return j();
    }

    public abstract m j();

    public final void k() {
        u.b(this.f75259a);
        while (this.f75259a.remaining() >= this.f75261c) {
            m(this.f75259a);
        }
        this.f75259a.compact();
    }

    public final void l() {
        if (this.f75259a.remaining() < 8) {
            k();
        }
    }

    public abstract void m(ByteBuffer bb2);

    public void n(ByteBuffer bb2) {
        u.d(bb2, bb2.limit());
        u.c(bb2, this.f75261c + 7);
        while (true) {
            int position = bb2.position();
            int i11 = this.f75261c;
            if (position >= i11) {
                u.c(bb2, i11);
                u.b(bb2);
                m(bb2);
                return;
            }
            bb2.putLong(0L);
        }
    }

    @uo.a
    public final o o(ByteBuffer readBuffer) {
        if (readBuffer.remaining() <= this.f75259a.remaining()) {
            this.f75259a.put(readBuffer);
            l();
            return this;
        }
        int position = this.f75260b - this.f75259a.position();
        for (int i11 = 0; i11 < position; i11++) {
            this.f75259a.put(readBuffer.get());
        }
        k();
        while (readBuffer.remaining() >= this.f75261c) {
            m(readBuffer);
        }
        this.f75259a.put(readBuffer);
        return this;
    }

    public f(int chunkSize, int bufferSize) {
        Preconditions.checkArgument(bufferSize % chunkSize == 0);
        this.f75259a = ByteBuffer.allocate(bufferSize + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f75260b = bufferSize;
        this.f75261c = chunkSize;
    }

    @Override // no.o, no.f0
    @uo.a
    public final o a(byte b11) {
        this.f75259a.put(b11);
        l();
        return this;
    }

    @Override // no.d, no.o, no.f0
    @uo.a
    public final o c(char c11) {
        this.f75259a.putChar(c11);
        l();
        return this;
    }

    @Override // no.d, no.o, no.f0
    @uo.a
    public final o e(byte[] bytes, int off, int len) {
        return o(ByteBuffer.wrap(bytes, off, len).order(ByteOrder.LITTLE_ENDIAN));
    }

    @Override // no.d, no.o, no.f0
    @uo.a
    public final o f(ByteBuffer readBuffer) {
        ByteOrder order = readBuffer.order();
        try {
            readBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return o(readBuffer);
        } finally {
            readBuffer.order(order);
        }
    }

    @Override // no.d, no.o, no.f0
    @uo.a
    public final o putInt(int i11) {
        this.f75259a.putInt(i11);
        l();
        return this;
    }

    @Override // no.d, no.o, no.f0
    @uo.a
    public final o putLong(long l11) {
        this.f75259a.putLong(l11);
        l();
        return this;
    }

    @Override // no.d, no.o, no.f0
    @uo.a
    public final o putShort(short s11) {
        this.f75259a.putShort(s11);
        l();
        return this;
    }
}
