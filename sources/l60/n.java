package l60;

import java.io.IOException;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCipherSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n1#2:149\n85#3:150\n*S KotlinDebug\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n*L\n47#1:150\n*E\n"})
/* loaded from: classes8.dex */
public final class n implements e1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l f70465a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Cipher f70466b;

    /* renamed from: c, reason: collision with root package name */
    public final int f70467c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f70468d;

    public n(@m80.k l sink, @m80.k Cipher cipher) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        kotlin.jvm.internal.g0.p(cipher, "cipher");
        this.f70465a = sink;
        this.f70466b = cipher;
        int blockSize = cipher.getBlockSize();
        this.f70467c = blockSize;
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    @Override // l60.e1
    @m80.k
    public i1 D() {
        return this.f70465a.D();
    }

    public final Throwable a() {
        int outputSize = this.f70466b.getOutputSize(0);
        Throwable th2 = null;
        if (outputSize == 0) {
            return null;
        }
        if (outputSize > 8192) {
            try {
                l lVar = this.f70465a;
                byte[] doFinal = this.f70466b.doFinal();
                kotlin.jvm.internal.g0.o(doFinal, "doFinal(...)");
                lVar.write(doFinal);
                return null;
            } catch (Throwable th3) {
                return th3;
            }
        }
        k buffer = this.f70465a.getBuffer();
        c1 m12 = buffer.m1(outputSize);
        try {
            int doFinal2 = this.f70466b.doFinal(m12.f70383a, m12.f70385c);
            m12.f70385c += doFinal2;
            buffer.g1(buffer.size() + doFinal2);
        } catch (Throwable th4) {
            th2 = th4;
        }
        if (m12.f70384b == m12.f70385c) {
            buffer.f70446a = m12.b();
            d1.d(m12);
        }
        return th2;
    }

    @m80.k
    public final Cipher c() {
        return this.f70466b;
    }

    @Override // l60.e1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f70468d) {
            return;
        }
        this.f70468d = true;
        Throwable a11 = a();
        try {
            this.f70465a.close();
        } catch (Throwable th2) {
            if (a11 == null) {
                a11 = th2;
            }
        }
        if (a11 != null) {
            throw a11;
        }
    }

    public final int e(k kVar, long j11) {
        c1 c1Var = kVar.f70446a;
        kotlin.jvm.internal.g0.m(c1Var);
        int min = (int) Math.min(j11, c1Var.f70385c - c1Var.f70384b);
        k buffer = this.f70465a.getBuffer();
        int outputSize = this.f70466b.getOutputSize(min);
        int i11 = min;
        while (outputSize > 8192) {
            int i12 = this.f70467c;
            if (i11 <= i12) {
                l lVar = this.f70465a;
                byte[] update = this.f70466b.update(kVar.P5(j11));
                kotlin.jvm.internal.g0.o(update, "update(...)");
                lVar.write(update);
                return (int) j11;
            }
            i11 -= i12;
            outputSize = this.f70466b.getOutputSize(i11);
        }
        c1 m12 = buffer.m1(outputSize);
        int update2 = this.f70466b.update(c1Var.f70383a, c1Var.f70384b, i11, m12.f70383a, m12.f70385c);
        m12.f70385c += update2;
        buffer.g1(buffer.size() + update2);
        if (m12.f70384b == m12.f70385c) {
            buffer.f70446a = m12.b();
            d1.d(m12);
        }
        this.f70465a.X4();
        kVar.g1(kVar.size() - i11);
        int i13 = c1Var.f70384b + i11;
        c1Var.f70384b = i13;
        if (i13 == c1Var.f70385c) {
            kVar.f70446a = c1Var.b();
            d1.d(c1Var);
        }
        return i11;
    }

    @Override // l60.e1, java.io.Flushable
    public void flush() {
        this.f70465a.flush();
    }

    @Override // l60.e1
    public void y8(@m80.k k source, long j11) throws IOException {
        kotlin.jvm.internal.g0.p(source, "source");
        h.e(source.size(), 0L, j11);
        if (this.f70468d) {
            throw new IllegalStateException("closed");
        }
        long j12 = j11;
        while (j12 > 0) {
            j12 -= e(source, j12);
        }
    }
}
