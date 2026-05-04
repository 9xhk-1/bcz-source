package f0;

import f0.k0;
import java.io.File;
import kotlin.jvm.internal.u0;
import l60.r0;
import okio.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nImageSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSource.kt\ncoil/decode/SourceImageSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FileSystem.kt\nokio/FileSystem\n+ 4 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,310:1\n1#2:311\n80#3:312\n165#3:313\n81#3:314\n82#3:320\n52#4,5:315\n60#4,10:321\n57#4,16:331\n*S KotlinDebug\n*F\n+ 1 ImageSource.kt\ncoil/decode/SourceImageSource\n*L\n276#1:312\n276#1:313\n276#1:314\n276#1:320\n276#1:315,5\n276#1:321,10\n276#1:331,16\n*E\n"})
/* loaded from: classes3.dex */
public final class n0 extends k0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final k0.a f50319a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f50320b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public l60.m f50321c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public x00.a<? extends File> f50322d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public okio.f f50323e;

    public n0(@m80.k l60.m mVar, @m80.k x00.a<? extends File> aVar, @m80.l k0.a aVar2) {
        super(null);
        this.f50319a = aVar2;
        this.f50321c = mVar;
        this.f50322d = aVar;
    }

    private final void r() {
        if (this.f50320b) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // f0.k0
    @m80.k
    public synchronized okio.f a() {
        Throwable th2;
        Long l11;
        try {
            r();
            okio.f fVar = this.f50323e;
            if (fVar != null) {
                return fVar;
            }
            okio.f w11 = w();
            l60.l d11 = r0.d(e().D0(w11, false));
            try {
                l60.m mVar = this.f50321c;
                kotlin.jvm.internal.g0.m(mVar);
                l11 = Long.valueOf(d11.V2(mVar));
                if (d11 != null) {
                    try {
                        d11.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                th2 = null;
            } catch (Throwable th4) {
                if (d11 != null) {
                    try {
                        d11.close();
                    } catch (Throwable th5) {
                        yz.r.a(th4, th5);
                    }
                }
                th2 = th4;
                l11 = null;
            }
            if (th2 != null) {
                throw th2;
            }
            kotlin.jvm.internal.g0.m(l11);
            this.f50321c = null;
            this.f50323e = w11;
            this.f50322d = null;
            return w11;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    @Override // f0.k0
    @m80.l
    public synchronized okio.f c() {
        r();
        return this.f50323e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f50320b = true;
            l60.m mVar = this.f50321c;
            if (mVar != null) {
                u0.l.f(mVar);
            }
            okio.f fVar = this.f50323e;
            if (fVar != null) {
                e().U(fVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // f0.k0
    @m80.k
    public okio.b e() {
        return okio.b.f77535b;
    }

    @Override // f0.k0
    @m80.l
    public k0.a f() {
        return this.f50319a;
    }

    @Override // f0.k0
    @m80.k
    public synchronized l60.m k() {
        r();
        l60.m mVar = this.f50321c;
        if (mVar != null) {
            return mVar;
        }
        okio.b e11 = e();
        okio.f fVar = this.f50323e;
        kotlin.jvm.internal.g0.m(fVar);
        l60.m e12 = r0.e(e11.F0(fVar));
        this.f50321c = e12;
        return e12;
    }

    @Override // f0.k0
    @m80.k
    public l60.m q() {
        return k();
    }

    public final okio.f w() {
        x00.a<? extends File> aVar = this.f50322d;
        kotlin.jvm.internal.g0.m(aVar);
        File invoke = aVar.invoke();
        if (invoke.isDirectory()) {
            return f.a.g(okio.f.f77539b, File.createTempFile(vb.a.f93812o, null, invoke), false, 1, null);
        }
        throw new IllegalStateException("cacheDirectory must be a directory.");
    }
}
