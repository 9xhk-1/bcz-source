package po;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public final class f0 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final Reader f81027a;

    /* renamed from: b, reason: collision with root package name */
    public final CharsetEncoder f81028b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f81029c;

    /* renamed from: d, reason: collision with root package name */
    public CharBuffer f81030d;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f81031e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f81032f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f81033g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f81034h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f0(java.io.Reader r2, java.nio.charset.Charset r3, int r4) {
        /*
            r1 = this;
            java.nio.charset.CharsetEncoder r3 = r3.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r3 = r3.onMalformedInput(r0)
            java.nio.charset.CharsetEncoder r3 = r3.onUnmappableCharacter(r0)
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: po.f0.<init>(java.io.Reader, java.nio.charset.Charset, int):void");
    }

    public static int a(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    public static CharBuffer f(CharBuffer buf) {
        CharBuffer wrap = CharBuffer.wrap(Arrays.copyOf(buf.array(), buf.capacity() * 2));
        v.e(wrap, buf.position());
        v.c(wrap, buf.limit());
        return wrap;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f81027a.close();
    }

    public final int e(byte[] b11, int off, int len) {
        int min = Math.min(len, this.f81031e.remaining());
        this.f81031e.get(b11, off, min);
        return min;
    }

    public final void j() throws IOException {
        if (a(this.f81030d) == 0) {
            if (this.f81030d.position() > 0) {
                v.b(this.f81030d.compact());
            } else {
                this.f81030d = f(this.f81030d);
            }
        }
        int limit = this.f81030d.limit();
        int read = this.f81027a.read(this.f81030d.array(), limit, a(this.f81030d));
        if (read == -1) {
            this.f81032f = true;
        } else {
            v.c(this.f81030d, limit + read);
        }
    }

    public final void k(boolean overflow) {
        v.b(this.f81031e);
        if (overflow && this.f81031e.remaining() == 0) {
            this.f81031e = ByteBuffer.allocate(this.f81031e.capacity() * 2);
        } else {
            this.f81033g = true;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f81029c) == 1) {
            return ro.r.p(this.f81029c[0]);
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r2 <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return -1;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(byte[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r9 + r10
            int r1 = r8.length
            com.google.common.base.Preconditions.checkPositionIndexes(r9, r0, r1)
            r0 = 0
            if (r10 != 0) goto La
            return r0
        La:
            boolean r1 = r7.f81032f
            r2 = r0
        Ld:
            boolean r3 = r7.f81033g
            if (r3 == 0) goto L2e
            int r3 = r9 + r2
            int r4 = r10 - r2
            int r3 = r7.e(r8, r3, r4)
            int r2 = r2 + r3
            if (r2 == r10) goto L29
            boolean r3 = r7.f81034h
            if (r3 == 0) goto L21
            goto L29
        L21:
            r7.f81033g = r0
            java.nio.ByteBuffer r3 = r7.f81031e
            po.v.a(r3)
            goto L2e
        L29:
            if (r2 <= 0) goto L2c
            return r2
        L2c:
            r8 = -1
            return r8
        L2e:
            boolean r3 = r7.f81034h
            if (r3 == 0) goto L35
            java.nio.charset.CoderResult r3 = java.nio.charset.CoderResult.UNDERFLOW
            goto L4c
        L35:
            if (r1 == 0) goto L40
            java.nio.charset.CharsetEncoder r3 = r7.f81028b
            java.nio.ByteBuffer r4 = r7.f81031e
            java.nio.charset.CoderResult r3 = r3.flush(r4)
            goto L4c
        L40:
            java.nio.charset.CharsetEncoder r3 = r7.f81028b
            java.nio.CharBuffer r4 = r7.f81030d
            java.nio.ByteBuffer r5 = r7.f81031e
            boolean r6 = r7.f81032f
            java.nio.charset.CoderResult r3 = r3.encode(r4, r5, r6)
        L4c:
            boolean r4 = r3.isOverflow()
            r5 = 1
            if (r4 == 0) goto L57
            r7.k(r5)
            goto Ld
        L57:
            boolean r4 = r3.isUnderflow()
            if (r4 == 0) goto L6f
            if (r1 == 0) goto L65
            r7.f81034h = r5
            r7.k(r0)
            goto Ld
        L65:
            boolean r3 = r7.f81032f
            if (r3 == 0) goto L6b
            r1 = r5
            goto L2e
        L6b:
            r7.j()
            goto L2e
        L6f:
            boolean r4 = r3.isError()
            if (r4 == 0) goto L2e
            r3.throwException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: po.f0.read(byte[], int, int):int");
    }

    public f0(Reader reader, CharsetEncoder encoder, int bufferSize) {
        this.f81029c = new byte[1];
        this.f81027a = (Reader) Preconditions.checkNotNull(reader);
        this.f81028b = (CharsetEncoder) Preconditions.checkNotNull(encoder);
        Preconditions.checkArgument(bufferSize > 0, "bufferSize must be positive: %s", bufferSize);
        encoder.reset();
        CharBuffer allocate = CharBuffer.allocate(bufferSize);
        this.f81030d = allocate;
        v.b(allocate);
        this.f81031e = ByteBuffer.allocate(bufferSize);
    }
}
