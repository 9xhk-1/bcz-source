package qy;

import a00.h0;
import io.ktor.utils.io.b0;
import ix.b2;
import ix.e1;
import ix.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import mx.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u
@b0
@u0({"SMAP\nDefaultResponsePushBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultResponsePushBuilder.kt\nio/ktor/server/response/DefaultResponsePushBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 URLBuilder.kt\nio/ktor/server/util/URLBuilderKt\n+ 4 URLBuilder.kt\nio/ktor/server/util/URLBuilderKt$url$1\n*L\n1#1,47:1\n1#2:48\n37#3,2:49\n37#4:51\n*S KotlinDebug\n*F\n+ 1 DefaultResponsePushBuilder.kt\nio/ktor/server/response/DefaultResponsePushBuilder\n*L\n37#1:49,2\n37#1:51\n*E\n"})
/* loaded from: classes8.dex */
public final class n implements s {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public e1 f82751a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final b2 f82752b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final r0 f82753c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public ArrayList<e0> f82754d;

    public n() {
        this(null, null, null, null, 15, null);
    }

    @Override // qy.s
    @m80.k
    public r0 a() {
        return this.f82753c;
    }

    @Override // qy.s
    public void b(@m80.k e1 e1Var) {
        g0.p(e1Var, "<set-?>");
        this.f82751a = e1Var;
    }

    @Override // qy.s
    @m80.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ArrayList<e0> c() {
        return this.f82754d;
    }

    public void e(@m80.k ArrayList<e0> arrayList) {
        g0.p(arrayList, "<set-?>");
        this.f82754d = arrayList;
    }

    @Override // qy.s
    @m80.k
    public e1 getMethod() {
        return this.f82751a;
    }

    @Override // qy.s
    @m80.k
    public b2 getUrl() {
        return this.f82752b;
    }

    public n(@m80.k e1 method, @m80.k b2 url, @m80.k r0 headers, @m80.k List<? extends e0> versions) {
        g0.p(method, "method");
        g0.p(url, "url");
        g0.p(headers, "headers");
        g0.p(versions, "versions");
        this.f82751a = method;
        this.f82752b = url;
        this.f82753c = headers;
        this.f82754d = versions.isEmpty() ? new ArrayList<>() : new ArrayList<>(versions);
    }

    public /* synthetic */ n(e1 e1Var, b2 b2Var, r0 r0Var, List list, int i11, v vVar) {
        this((i11 & 1) != 0 ? e1.f62753b.c() : e1Var, (i11 & 2) != 0 ? new b2(null, null, 0, null, null, null, null, null, false, 511, null) : b2Var, (i11 & 4) != 0 ? new r0(0, 1, null) : r0Var, (i11 & 8) != 0 ? h0.J() : list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(@m80.k ix.b2 r9, @m80.k ix.q0 r10) {
        /*
            r8 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.g0.p(r10, r0)
            ix.r0 r4 = new ix.r0
            r0 = 1
            r1 = 0
            r2 = 0
            r4.<init>(r2, r0, r1)
            r4.j(r10)
            yz.g2 r10 = yz.g2.f100423a
            r6 = 9
            r7 = 0
            r2 = 0
            r5 = 0
            r1 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qy.n.<init>(ix.b2, ix.q0):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(@m80.k zx.b r9) {
        /*
            r8 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r9, r0)
            ix.b2$a r0 = ix.b2.f62712k
            ix.b2 r3 = ty.i.a(r0, r9)
            ix.r0 r4 = new ix.r0
            r1 = 1
            r2 = 0
            r5 = 0
            r4.<init>(r5, r1, r2)
            py.d r1 = r9.f()
            ix.q0 r1 = r1.a()
            r4.j(r1)
            ix.y0 r1 = ix.y0.f63006a
            java.lang.String r1 = r1.q0()
            ix.b2 r9 = ty.i.a(r0, r9)
            yz.g2 r0 = yz.g2.f100423a
            java.lang.String r9 = r9.c()
            r4.d(r1, r9)
            r6 = 9
            r7 = 0
            r5 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qy.n.<init>(zx.b):void");
    }
}
