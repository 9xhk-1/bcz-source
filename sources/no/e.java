package no;

import com.google.common.base.Preconditions;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
@uo.j
/* loaded from: classes7.dex */
public abstract class e extends c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final b f75257a;

        public a(int expectedInputSize) {
            this.f75257a = new b(expectedInputSize);
        }

        @Override // no.o
        public m h() {
            return e.this.k(this.f75257a.a(), 0, this.f75257a.c());
        }

        @Override // no.o, no.f0
        public o a(byte b11) {
            this.f75257a.write(b11);
            return this;
        }

        @Override // no.d, no.o, no.f0
        public o e(byte[] bytes, int off, int len) {
            this.f75257a.write(bytes, off, len);
            return this;
        }

        @Override // no.d, no.o, no.f0
        public o f(ByteBuffer bytes) {
            this.f75257a.e(bytes);
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends ByteArrayOutputStream {
        public b(int expectedInputSize) {
            super(expectedInputSize);
        }

        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public int c() {
            return ((ByteArrayOutputStream) this).count;
        }

        public void e(ByteBuffer input) {
            int remaining = input.remaining();
            int i11 = ((ByteArrayOutputStream) this).count;
            int i12 = i11 + remaining;
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            if (i12 > bArr.length) {
                ((ByteArrayOutputStream) this).buf = Arrays.copyOf(bArr, i11 + remaining);
            }
            input.get(((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count, remaining);
            ((ByteArrayOutputStream) this).count += remaining;
        }
    }

    @Override // no.c, no.n
    public o a(int expectedInputSize) {
        Preconditions.checkArgument(expectedInputSize >= 0);
        return new a(expectedInputSize);
    }

    @Override // no.c, no.n
    public m c(int input) {
        return b(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(input).array());
    }

    @Override // no.c, no.n
    public m e(long input) {
        return b(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(input).array());
    }

    @Override // no.c, no.n
    public m f(CharSequence input, Charset charset) {
        return b(input.toString().getBytes(charset));
    }

    @Override // no.c, no.n
    public m g(CharSequence input) {
        int length = input.length();
        ByteBuffer order = ByteBuffer.allocate(length * 2).order(ByteOrder.LITTLE_ENDIAN);
        for (int i11 = 0; i11 < length; i11++) {
            order.putChar(input.charAt(i11));
        }
        return b(order.array());
    }

    @Override // no.n
    public o i() {
        return a(32);
    }

    @Override // no.c, no.n
    public m j(ByteBuffer input) {
        return a(input.remaining()).f(input).h();
    }

    @Override // no.c, no.n
    public abstract m k(byte[] input, int off, int len);
}
