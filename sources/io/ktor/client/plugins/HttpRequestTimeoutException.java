package io.ktor.client.plugins;

import c40.g0;
import java.io.IOException;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class HttpRequestTimeoutException extends IOException implements g0<HttpRequestTimeoutException> {

    @l
    private final Long timeoutMillis;

    @k
    private final String url;

    public /* synthetic */ HttpRequestTimeoutException(String str, Long l11, Throwable th2, int i11, v vVar) {
        this(str, l11, (i11 & 4) != 0 ? null : th2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HttpRequestTimeoutException(@m80.k java.lang.String r3, @m80.l java.lang.Long r4, @m80.l java.lang.Throwable r5) {
        /*
            r2 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Request timeout has expired [url="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", request_timeout="
            r0.append(r1)
            if (r4 != 0) goto L1c
            java.lang.String r1 = "unknown"
            goto L1d
        L1c:
            r1 = r4
        L1d:
            r0.append(r1)
            java.lang.String r1 = " ms]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r5)
            r2.url = r3
            r2.timeoutMillis = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpRequestTimeoutException.<init>(java.lang.String, java.lang.Long, java.lang.Throwable):void");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c40.g0
    @k
    public HttpRequestTimeoutException createCopy() {
        return new HttpRequestTimeoutException(this.url, this.timeoutMillis, getCause());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HttpRequestTimeoutException(@m80.k cx.y r8) {
        /*
            r7 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r8, r0)
            ix.b2 r0 = r8.j()
            java.lang.String r2 = r0.c()
            rw.c1 r0 = rw.c1.f84603a
            java.lang.Object r8 = r8.g(r0)
            rw.d1 r8 = (rw.d1) r8
            if (r8 == 0) goto L1d
            java.lang.Long r8 = r8.d()
        L1b:
            r3 = r8
            goto L1f
        L1d:
            r8 = 0
            goto L1b
        L1f:
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpRequestTimeoutException.<init>(cx.y):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HttpRequestTimeoutException(@m80.k cx.z r8) {
        /*
            r7 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r8, r0)
            ix.t2 r0 = r8.h()
            java.lang.String r2 = r0.toString()
            rw.c1 r0 = rw.c1.f84603a
            java.lang.Object r8 = r8.c(r0)
            rw.d1 r8 = (rw.d1) r8
            if (r8 == 0) goto L1d
            java.lang.Long r8 = r8.d()
        L1b:
            r3 = r8
            goto L1f
        L1d:
            r8 = 0
            goto L1b
        L1f:
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpRequestTimeoutException.<init>(cx.z):void");
    }
}
