package kx;

import ix.e1;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final y40.x f68956a = jz.h.a();

    public static /* synthetic */ void d(c0 c0Var, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        c0Var.c(bArr, i11, i12);
    }

    @m80.k
    public final y40.c0 a() {
        return jz.h.e(this.f68956a);
    }

    public final void b(@m80.k ByteBuffer content) {
        g0.p(content, "content");
        jz.g.a(this.f68956a, content);
    }

    public final void c(@m80.k byte[] content, int i11, int i12) {
        g0.p(content, "content");
        jz.h.h(this.f68956a, content, i11, i12);
    }

    public final void e() {
        this.f68956a.u((byte) 13);
        this.f68956a.u((byte) 10);
    }

    public final void f(@m80.k CharSequence name, @m80.k CharSequence value) {
        g0.p(name, "name");
        g0.p(value, "value");
        jz.h.d(this.f68956a, name, 0, 0, 6, null);
        jz.h.d(this.f68956a, ": ", 0, 0, 6, null);
        jz.h.d(this.f68956a, value, 0, 0, 6, null);
        this.f68956a.u((byte) 13);
        this.f68956a.u((byte) 10);
    }

    public final void g(@m80.k CharSequence line) {
        g0.p(line, "line");
        jz.h.d(this.f68956a, line, 0, 0, 6, null);
        this.f68956a.u((byte) 13);
        this.f68956a.u((byte) 10);
    }

    public final void h() {
        this.f68956a.close();
    }

    public final void i(@m80.k e1 method, @m80.k CharSequence uri, @m80.k CharSequence version) {
        g0.p(method, "method");
        g0.p(uri, "uri");
        g0.p(version, "version");
        jz.s.p(this.f68956a, method.l(), 0, 0, null, 14, null);
        this.f68956a.u((byte) 32);
        jz.s.p(this.f68956a, uri, 0, 0, null, 14, null);
        this.f68956a.u((byte) 32);
        jz.s.p(this.f68956a, version, 0, 0, null, 14, null);
        this.f68956a.u((byte) 13);
        this.f68956a.u((byte) 10);
    }

    public final void j(@m80.k CharSequence version, int i11, @m80.k CharSequence statusText) {
        g0.p(version, "version");
        g0.p(statusText, "statusText");
        jz.s.p(this.f68956a, version, 0, 0, null, 14, null);
        this.f68956a.u((byte) 32);
        jz.s.p(this.f68956a, String.valueOf(i11), 0, 0, null, 14, null);
        this.f68956a.u((byte) 32);
        jz.s.p(this.f68956a, statusText, 0, 0, null, 14, null);
        this.f68956a.u((byte) 13);
        this.f68956a.u((byte) 10);
    }
}
