package mx;

import java.io.InputStream;
import java.net.URI;
import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d0 extends v.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final URI f73780b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ix.k f73781c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final Long f73782d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ d0(java.net.URI r2, ix.k r3, java.lang.Long r4, int r5, kotlin.jvm.internal.v r6) {
        /*
            r1 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L13
            ix.k$c r3 = ix.k.f62843f
            java.lang.String r6 = r2.getPath()
            java.lang.String r0 = "getPath(...)"
            kotlin.jvm.internal.g0.o(r6, r0)
            ix.k r3 = ix.l0.f(r3, r6)
        L13:
            r5 = r5 & 4
            if (r5 == 0) goto L18
            r4 = 0
        L18:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mx.d0.<init>(java.net.URI, ix.k, java.lang.Long, int, kotlin.jvm.internal.v):void");
    }

    @Override // mx.v
    @m80.l
    public Long a() {
        return this.f73782d;
    }

    @Override // mx.v
    @m80.k
    public ix.k b() {
        return this.f73781c;
    }

    @Override // mx.v.e
    @m80.k
    public io.ktor.utils.io.g m() {
        InputStream openStream = this.f73780b.toURL().openStream();
        kotlin.jvm.internal.g0.o(openStream, "openStream(...)");
        return mz.c.b(openStream, null, yy.a.a(), 1, null);
    }

    @m80.k
    public final URI o() {
        return this.f73780b;
    }

    public d0(@m80.k URI uri, @m80.k ix.k contentType, @m80.l Long l11) {
        kotlin.jvm.internal.g0.p(uri, "uri");
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        this.f73780b = uri;
        this.f73781c = contentType;
        this.f73782d = l11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ d0(java.net.URL r1, ix.k r2, int r3, kotlin.jvm.internal.v r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L13
            ix.k$c r2 = ix.k.f62843f
            java.lang.String r3 = r1.getPath()
            java.lang.String r4 = "getPath(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            ix.k r2 = ix.l0.f(r2, r3)
        L13:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mx.d0.<init>(java.net.URL, ix.k, int, kotlin.jvm.internal.v):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d0(@m80.k java.net.URL r8, @m80.k ix.k r9) {
        /*
            r7 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "contentType"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.net.URI r2 = r8.toURI()
            java.lang.String r8 = "toURI(...)"
            kotlin.jvm.internal.g0.o(r2, r8)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mx.d0.<init>(java.net.URL, ix.k):void");
    }
}
