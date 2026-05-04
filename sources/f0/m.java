package f0;

import f0.k0;
import java.io.Closeable;
import kotlin.jvm.internal.u0;
import l60.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nImageSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSource.kt\ncoil/decode/FileImageSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
/* loaded from: classes3.dex */
public final class m extends k0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final okio.f f50303a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final okio.b f50304b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f50305c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final Closeable f50306d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final k0.a f50307e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f50308f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public l60.m f50309g;

    public m(@m80.k okio.f fVar, @m80.k okio.b bVar, @m80.l String str, @m80.l Closeable closeable, @m80.l k0.a aVar) {
        super(null);
        this.f50303a = fVar;
        this.f50304b = bVar;
        this.f50305c = str;
        this.f50306d = closeable;
        this.f50307e = aVar;
    }

    @m80.k
    public final okio.f C() {
        return this.f50303a;
    }

    @Override // f0.k0
    @m80.k
    public synchronized okio.f a() {
        r();
        return this.f50303a;
    }

    @Override // f0.k0
    @m80.k
    public okio.f c() {
        return a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f50308f = true;
            l60.m mVar = this.f50309g;
            if (mVar != null) {
                u0.l.f(mVar);
            }
            Closeable closeable = this.f50306d;
            if (closeable != null) {
                u0.l.f(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // f0.k0
    @m80.k
    public okio.b e() {
        return this.f50304b;
    }

    @Override // f0.k0
    @m80.l
    public k0.a f() {
        return this.f50307e;
    }

    @Override // f0.k0
    @m80.k
    public synchronized l60.m k() {
        r();
        l60.m mVar = this.f50309g;
        if (mVar != null) {
            return mVar;
        }
        l60.m e11 = r0.e(e().F0(this.f50303a));
        this.f50309g = e11;
        return e11;
    }

    @Override // f0.k0
    @m80.l
    public synchronized l60.m q() {
        r();
        return this.f50309g;
    }

    public final void r() {
        if (this.f50308f) {
            throw new IllegalStateException("closed");
        }
    }

    @m80.l
    public final String w() {
        return this.f50305c;
    }
}
