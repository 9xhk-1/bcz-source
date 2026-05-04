package io.ktor.server.routing;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nIgnoreTrailingSlash.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IgnoreTrailingSlash.kt\nio/ktor/server/routing/IgnoreTrailingSlashKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,29:1\n18#2:30\n58#3,16:31\n*S KotlinDebug\n*F\n+ 1 IgnoreTrailingSlash.kt\nio/ktor/server/routing/IgnoreTrailingSlashKt\n*L\n10#1:30\n10#1:31,16\n*E\n"})
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<g2> f61652a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final zx.k<g2> f61653b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.routing.IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1", f = "IgnoreTrailingSlash.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.q<zx.h0<g2>, zx.k0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61654a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61655b;

        public a(j00.c<? super a> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zx.h0<g2> h0Var, zx.k0 k0Var, j00.c<? super g2> cVar) {
            a aVar = new a(cVar);
            aVar.f61655b = k0Var;
            return aVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f61654a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            k.f((zx.k0) this.f61655b, true);
            return g2.f100423a;
        }
    }

    static {
        h10.r rVar;
        h10.d d11 = kotlin.jvm.internal.o0.d(g2.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(g2.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f61652a = new xy.a<>("IgnoreTrailingSlashAttributeKey", new gz.a(d11, rVar));
        f61653b = zx.b0.j("IgnoreTrailingSlash", new x00.l() { // from class: io.ktor.server.routing.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 b11;
                b11 = k.b((zx.o0) obj);
                return b11;
            }
        });
    }

    public static final g2 b(zx.o0 createApplicationPlugin) {
        kotlin.jvm.internal.g0.p(createApplicationPlugin, "$this$createApplicationPlugin");
        createApplicationPlugin.o(new a(null));
        return g2.f100423a;
    }

    @m80.k
    public static final zx.k<g2> d() {
        return f61653b;
    }

    public static final boolean e(@m80.k zx.b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        return bVar.getAttributes().c(f61652a);
    }

    public static final void f(zx.b bVar, boolean z11) {
        if (z11) {
            bVar.getAttributes().e(f61652a, g2.f100423a);
        } else {
            bVar.getAttributes().b(f61652a);
        }
    }
}
