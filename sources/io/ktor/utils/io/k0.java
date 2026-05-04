package io.ktor.utils.io;

import java.io.IOException;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSourceByteReadChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceByteReadChannel.kt\nio/ktor/utils/io/SourceByteReadChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
/* loaded from: classes8.dex */
public final class k0 implements g {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final y40.c0 f62254b;

    @m80.l
    private volatile t closed;

    public k0(@m80.k y40.c0 source) {
        kotlin.jvm.internal.g0.p(source, "source");
        this.f62254b = source;
    }

    @Override // io.ktor.utils.io.g, io.ktor.utils.io.m
    public void a(@m80.l Throwable th2) {
        String str;
        if (this.closed != null) {
            return;
        }
        this.f62254b.close();
        if (th2 == null || (str = th2.getMessage()) == null) {
            str = "Channel was cancelled";
        }
        this.closed = new t(new IOException(str, th2));
    }

    @Override // io.ktor.utils.io.g, io.ktor.utils.io.m
    @m80.l
    public Throwable b() {
        t tVar = this.closed;
        if (tVar != null) {
            return tVar.a();
        }
        return null;
    }

    @Override // io.ktor.utils.io.g
    @m80.l
    public Object d(int i11, @m80.k j00.c<? super Boolean> cVar) {
        Throwable b11 = b();
        if (b11 == null) {
            return l00.a.a(jz.j.j(this.f62254b) >= ((long) i11));
        }
        throw b11;
    }

    @Override // io.ktor.utils.io.g
    @m80.k
    public y40.c0 e() {
        Throwable b11 = b();
        if (b11 == null) {
            return this.f62254b;
        }
        throw b11;
    }

    @Override // io.ktor.utils.io.g
    public boolean f() {
        return this.f62254b.J();
    }

    @b0
    public static /* synthetic */ void c() {
    }
}
