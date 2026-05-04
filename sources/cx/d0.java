package cx;

import cx.y;
import ix.b1;
import ix.b2;
import ix.e2;
import ix.l2;
import ix.r0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequest.kt\nio/ktor/client/request/HttpRequestKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,352:1\n1#2:353\n18#3:354\n58#4,16:355\n*S KotlinDebug\n*F\n+ 1 HttpRequest.kt\nio/ktor/client/request/HttpRequestKt\n*L\n312#1:354\n312#1:355,16\n*E\n"})
/* loaded from: classes8.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<i0> f46865a;

    static {
        h10.r rVar;
        h10.d d11 = o0.d(i0.class);
        try {
            rVar = o0.B(i0.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f46865a = new xy.a<>("ResponseAdapterAttributeKey", new gz.a(d11, rVar));
    }

    @m80.k
    public static final xy.a<i0> c() {
        return f46865a;
    }

    @m80.k
    public static final r0 e(@m80.k b1 b1Var, @m80.k x00.l<? super r0, g2> block) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        r0 a11 = b1Var.a();
        block.invoke(a11);
        return a11;
    }

    @m80.k
    public static final y f(@m80.k y.a aVar, @m80.l String str, @m80.l String str2, @m80.l Integer num, @m80.l String str3, @m80.k x00.l<? super b2, g2> block) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        y yVar = new y();
        o(yVar, str, str2, num, str3, block);
        return yVar;
    }

    @m80.k
    public static final y g(@m80.k y.a aVar, @m80.k x00.l<? super b2, g2> block) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        y yVar = new y();
        p(yVar, block);
        return yVar;
    }

    public static /* synthetic */ y h(y.a aVar, String str, String str2, Integer num, String str3, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        if ((i11 & 16) != 0) {
            lVar = new x00.l() { // from class: cx.b0
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 i12;
                    i12 = d0.i((b2) obj2);
                    return i12;
                }
            };
        }
        return f(aVar, str, str2, num, str3, lVar);
    }

    public static final g2 i(b2 b2Var) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        return g2.f100423a;
    }

    @io.ktor.utils.io.b0
    public static final boolean j(@m80.k z zVar) {
        kotlin.jvm.internal.g0.p(zVar, "<this>");
        return zVar.b() instanceof zw.t;
    }

    @io.ktor.utils.io.b0
    public static final boolean k(@m80.k z zVar) {
        kotlin.jvm.internal.g0.p(zVar, "<this>");
        return zVar.b() instanceof u;
    }

    @m80.k
    public static final y l(@m80.k y yVar, @m80.k w request) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        kotlin.jvm.internal.g0.p(request, "request");
        yVar.q(request.getMethod());
        yVar.l(request.w());
        yVar.m((gz.a) yVar.d().a(h0.a()));
        l2.u(yVar.j(), request.getUrl());
        yVar.a().j(request.a());
        xy.e.c(yVar.d(), request.getAttributes());
        return yVar;
    }

    @m80.k
    public static final y m(@m80.k y yVar, @m80.k z request) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        kotlin.jvm.internal.g0.p(request, "request");
        yVar.q(request.f());
        yVar.l(request.b());
        yVar.m((gz.a) yVar.d().a(h0.a()));
        l2.u(yVar.j(), request.h());
        yVar.a().j(request.e());
        xy.e.c(yVar.d(), request.a());
        return yVar;
    }

    public static final void n(@m80.k y yVar, @m80.k String urlString) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        kotlin.jvm.internal.g0.p(urlString, "urlString");
        ix.g2.m(yVar.j(), urlString);
    }

    public static final void o(@m80.k y yVar, @m80.l String str, @m80.l String str2, @m80.l Integer num, @m80.l String str3, @m80.k x00.l<? super b2, g2> block) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        e2.u(yVar.j(), str, str2, num, str3, block);
    }

    public static final void p(@m80.k y yVar, @m80.k x00.l<? super b2, g2> block) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        block.invoke(yVar.j());
    }

    public static /* synthetic */ void q(y yVar, String str, String str2, Integer num, String str3, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        if ((i11 & 16) != 0) {
            lVar = new x00.l() { // from class: cx.c0
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 r11;
                    r11 = d0.r((b2) obj2);
                    return r11;
                }
            };
        }
        o(yVar, str, str2, num, str3, lVar);
    }

    public static final g2 r(b2 b2Var) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        return g2.f100423a;
    }

    @io.ktor.utils.io.b0
    public static /* synthetic */ void d() {
    }
}
