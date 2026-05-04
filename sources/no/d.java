package no;

import com.google.common.base.Preconditions;
import com.google.common.hash.Funnel;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
/* loaded from: classes7.dex */
public abstract class d implements o {
    @Override // no.o
    @uo.a
    public <T> o i(@e0 T instance, Funnel<? super T> funnel) {
        funnel.funnel(instance, this);
        return this;
    }

    @Override // no.o, no.f0
    @uo.a
    public o b(byte[] bytes) {
        return e(bytes, 0, bytes.length);
    }

    @Override // no.o, no.f0
    @uo.a
    public o c(char c11) {
        a((byte) c11);
        a((byte) (c11 >>> '\b'));
        return this;
    }

    @Override // no.o, no.f0
    @uo.a
    public o d(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            c(charSequence.charAt(i11));
        }
        return this;
    }

    @Override // no.o, no.f0
    @uo.a
    public o e(byte[] bytes, int off, int len) {
        Preconditions.checkPositionIndexes(off, off + len, bytes.length);
        for (int i11 = 0; i11 < len; i11++) {
            a(bytes[off + i11]);
        }
        return this;
    }

    @Override // no.o, no.f0
    @uo.a
    public o f(ByteBuffer b11) {
        if (b11.hasArray()) {
            e(b11.array(), b11.arrayOffset() + b11.position(), b11.remaining());
            u.d(b11, b11.limit());
            return this;
        }
        for (int remaining = b11.remaining(); remaining > 0; remaining--) {
            a(b11.get());
        }
        return this;
    }

    @Override // no.o, no.f0
    @uo.a
    public o g(CharSequence charSequence, Charset charset) {
        return b(charSequence.toString().getBytes(charset));
    }

    @Override // no.o, no.f0
    @uo.a
    public final o putBoolean(boolean z11) {
        return a(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // no.o, no.f0
    @uo.a
    public final o putDouble(double d11) {
        return putLong(Double.doubleToRawLongBits(d11));
    }

    @Override // no.o, no.f0
    @uo.a
    public final o putFloat(float f11) {
        return putInt(Float.floatToRawIntBits(f11));
    }

    @Override // no.o, no.f0
    @uo.a
    public o putInt(int i11) {
        a((byte) i11);
        a((byte) (i11 >>> 8));
        a((byte) (i11 >>> 16));
        a((byte) (i11 >>> 24));
        return this;
    }

    @Override // no.o, no.f0
    @uo.a
    public o putLong(long l11) {
        for (int i11 = 0; i11 < 64; i11 += 8) {
            a((byte) (l11 >>> i11));
        }
        return this;
    }

    @Override // no.o, no.f0
    @uo.a
    public o putShort(short s11) {
        a((byte) s11);
        a((byte) (s11 >>> 8));
        return this;
    }
}
