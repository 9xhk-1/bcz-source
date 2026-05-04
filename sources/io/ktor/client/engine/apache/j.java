package io.ktor.client.engine.apache;

import javax.net.ssl.SSLContext;
import kotlin.jvm.internal.g0;
import org.apache.http.client.config.RequestConfig;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j extends ow.j {

    /* renamed from: e, reason: collision with root package name */
    public boolean f60746e;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public SSLContext f60750i;

    /* renamed from: f, reason: collision with root package name */
    public int f60747f = 10000;

    /* renamed from: g, reason: collision with root package name */
    public int f60748g = 10000;

    /* renamed from: h, reason: collision with root package name */
    public int f60749h = 20000;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public x00.l<? super RequestConfig.Builder, ? extends RequestConfig.Builder> f60751j = new x00.l() { // from class: io.ktor.client.engine.apache.f
        @Override // x00.l
        public final Object invoke(Object obj) {
            RequestConfig.Builder o11;
            o11 = j.o((RequestConfig.Builder) obj);
            return o11;
        }
    };

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public x00.l<? super d70.l, ? extends d70.l> f60752k = new x00.l() { // from class: io.ktor.client.engine.apache.g
        @Override // x00.l
        public final Object invoke(Object obj) {
            d70.l n11;
            n11 = j.n((d70.l) obj);
            return n11;
        }
    };

    public static final d70.l n(d70.l lVar) {
        g0.p(lVar, "<this>");
        return lVar;
    }

    public static final RequestConfig.Builder o(RequestConfig.Builder builder) {
        g0.p(builder, "<this>");
        return builder;
    }

    public static final d70.l q(x00.l lVar, x00.l lVar2, d70.l lVar3) {
        g0.p(lVar3, "<this>");
        lVar.invoke(lVar3);
        lVar2.invoke(lVar3);
        return lVar3;
    }

    public static final RequestConfig.Builder s(x00.l lVar, x00.l lVar2, RequestConfig.Builder builder) {
        g0.p(builder, "<this>");
        lVar.invoke(builder);
        lVar2.invoke(builder);
        return builder;
    }

    public final void A(int i11) {
        this.f60748g = i11;
    }

    public final void B(int i11) {
        this.f60749h = i11;
    }

    public final void C(boolean z11) {
        this.f60746e = z11;
    }

    public final void D(int i11) {
        this.f60747f = i11;
    }

    public final void E(@m80.l SSLContext sSLContext) {
        this.f60750i = sSLContext;
    }

    public final void p(@m80.k final x00.l<? super d70.l, g2> block) {
        g0.p(block, "block");
        final x00.l<? super d70.l, ? extends d70.l> lVar = this.f60752k;
        this.f60752k = new x00.l() { // from class: io.ktor.client.engine.apache.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                d70.l q11;
                q11 = j.q(x00.l.this, block, (d70.l) obj);
                return q11;
            }
        };
    }

    public final void r(@m80.k final x00.l<? super RequestConfig.Builder, g2> block) {
        g0.p(block, "block");
        final x00.l<? super RequestConfig.Builder, ? extends RequestConfig.Builder> lVar = this.f60751j;
        this.f60751j = new x00.l() { // from class: io.ktor.client.engine.apache.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                RequestConfig.Builder s11;
                s11 = j.s(x00.l.this, block, (RequestConfig.Builder) obj);
                return s11;
            }
        };
    }

    public final int t() {
        return this.f60748g;
    }

    public final int u() {
        return this.f60749h;
    }

    @m80.k
    public final x00.l<d70.l, d70.l> v() {
        return this.f60752k;
    }

    @m80.k
    public final x00.l<RequestConfig.Builder, RequestConfig.Builder> w() {
        return this.f60751j;
    }

    public final boolean x() {
        return this.f60746e;
    }

    public final int y() {
        return this.f60747f;
    }

    @m80.l
    public final SSLContext z() {
        return this.f60750i;
    }
}
