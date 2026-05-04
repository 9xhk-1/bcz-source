package l60;

import java.io.IOException;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCipherSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSource.kt\nokio/CipherSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
/* loaded from: classes8.dex */
public final class o implements g1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m f70469a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Cipher f70470b;

    /* renamed from: c, reason: collision with root package name */
    public final int f70471c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final k f70472d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f70473e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f70474f;

    public o(@m80.k m source, @m80.k Cipher cipher) {
        kotlin.jvm.internal.g0.p(source, "source");
        kotlin.jvm.internal.g0.p(cipher, "cipher");
        this.f70469a = source;
        this.f70470b = cipher;
        int blockSize = cipher.getBlockSize();
        this.f70471c = blockSize;
        this.f70472d = new k();
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    @Override // l60.g1
    @m80.k
    public i1 D() {
        return this.f70469a.D();
    }

    @Override // l60.g1
    public long L3(@m80.k k sink, long j11) throws IOException {
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        if (this.f70474f) {
            throw new IllegalStateException("closed");
        }
        if (j11 == 0) {
            return 0L;
        }
        e();
        return this.f70472d.L3(sink, j11);
    }

    public final void a() {
        int outputSize = this.f70470b.getOutputSize(0);
        if (outputSize == 0) {
            return;
        }
        c1 m12 = this.f70472d.m1(outputSize);
        int doFinal = this.f70470b.doFinal(m12.f70383a, m12.f70384b);
        m12.f70385c += doFinal;
        k kVar = this.f70472d;
        kVar.g1(kVar.size() + doFinal);
        if (m12.f70384b == m12.f70385c) {
            this.f70472d.f70446a = m12.b();
            d1.d(m12);
        }
    }

    @m80.k
    public final Cipher c() {
        return this.f70470b;
    }

    @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f70474f = true;
        this.f70469a.close();
    }

    public final void e() {
        while (this.f70472d.size() == 0 && !this.f70473e) {
            if (this.f70469a.J()) {
                this.f70473e = true;
                a();
                return;
            }
            f();
        }
    }

    public final void f() {
        c1 c1Var = this.f70469a.getBuffer().f70446a;
        kotlin.jvm.internal.g0.m(c1Var);
        int i11 = c1Var.f70385c - c1Var.f70384b;
        int outputSize = this.f70470b.getOutputSize(i11);
        int i12 = i11;
        while (outputSize > 8192) {
            int i13 = this.f70471c;
            if (i12 <= i13) {
                this.f70473e = true;
                k kVar = this.f70472d;
                byte[] doFinal = this.f70470b.doFinal(this.f70469a.w2());
                kotlin.jvm.internal.g0.o(doFinal, "doFinal(...)");
                kVar.write(doFinal);
                return;
            }
            i12 -= i13;
            outputSize = this.f70470b.getOutputSize(i12);
        }
        c1 m12 = this.f70472d.m1(outputSize);
        int update = this.f70470b.update(c1Var.f70383a, c1Var.f70384b, i12, m12.f70383a, m12.f70384b);
        this.f70469a.skip(i12);
        m12.f70385c += update;
        k kVar2 = this.f70472d;
        kVar2.g1(kVar2.size() + update);
        if (m12.f70384b == m12.f70385c) {
            this.f70472d.f70446a = m12.b();
            d1.d(m12);
        }
    }
}
