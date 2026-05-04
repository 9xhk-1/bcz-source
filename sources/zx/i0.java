package zx;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.c0
@kotlin.jvm.internal.u0({"SMAP\nKtorCallContexts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KtorCallContexts.kt\nio/ktor/server/application/OnCallReceiveContext\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,88:1\n79#2:89\n58#3,16:90\n*S KotlinDebug\n*F\n+ 1 KtorCallContexts.kt\nio/ktor/server/application/OnCallReceiveContext\n*L\n60#1:89\n61#1:90,16\n*E\n"})
/* loaded from: classes8.dex */
public final class i0<PluginConfig> extends u<PluginConfig> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final io.ktor.util.pipeline.d<Object, k0> f103040c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.application.OnCallReceiveContext", f = "KtorCallContexts.kt", i = {}, l = {64}, m = "transformBody", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f103041a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f103042b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i0<PluginConfig> f103043c;

        /* renamed from: d, reason: collision with root package name */
        public int f103044d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i0<PluginConfig> i0Var, j00.c<? super a> cVar) {
            super(cVar);
            this.f103043c = i0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f103042b = obj;
            this.f103044d |= Integer.MIN_VALUE;
            return this.f103043c.d(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(@m80.k PluginConfig pluginConfig, @m80.k io.ktor.util.pipeline.d<Object, k0> context) {
        super(pluginConfig, context);
        kotlin.jvm.internal.g0.p(pluginConfig, "pluginConfig");
        kotlin.jvm.internal.g0.p(context, "context");
        this.f103040c = context;
    }

    @Override // zx.u
    @m80.k
    public io.ktor.util.pipeline.d<Object, k0> b() {
        return this.f103040c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@m80.k x00.q<? super zx.x0, ? super io.ktor.utils.io.g, ? super j00.c<java.lang.Object>, ? extends java.lang.Object> r8, @m80.k j00.c<? super yz.g2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zx.i0.a
            if (r0 == 0) goto L13
            r0 = r9
            zx.i0$a r0 = (zx.i0.a) r0
            int r1 = r0.f103044d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f103044d = r1
            goto L18
        L13:
            zx.i0$a r0 = new zx.i0$a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f103042b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f103044d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f103041a
            io.ktor.util.pipeline.d r8 = (io.ktor.util.pipeline.d) r8
            kotlin.e.n(r9)
            goto L89
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.e.n(r9)
            io.ktor.util.pipeline.d r9 = r7.b()
            java.lang.Object r9 = r9.e()
            boolean r2 = r9 instanceof io.ktor.utils.io.g
            r4 = 0
            if (r2 == 0) goto L48
            io.ktor.utils.io.g r9 = (io.ktor.utils.io.g) r9
            goto L49
        L48:
            r9 = r4
        L49:
            if (r9 != 0) goto L4e
            yz.g2 r8 = yz.g2.f100423a
            return r8
        L4e:
            io.ktor.util.pipeline.d r2 = r7.b()
            java.lang.Object r2 = r2.d()
            zx.k0 r2 = (zx.k0) r2
            gz.a r2 = zx.l0.b(r2)
            java.lang.Class<io.ktor.utils.io.g> r5 = io.ktor.utils.io.g.class
            h10.d r6 = kotlin.jvm.internal.o0.d(r5)
            h10.r r4 = kotlin.jvm.internal.o0.B(r5)     // Catch: java.lang.Throwable -> L66
        L66:
            gz.a r5 = new gz.a
            r5.<init>(r6, r4)
            boolean r4 = kotlin.jvm.internal.g0.g(r2, r5)
            if (r4 == 0) goto L74
            yz.g2 r8 = yz.g2.f100423a
            return r8
        L74:
            zx.x0 r4 = new zx.x0
            r4.<init>(r2)
            io.ktor.util.pipeline.d r2 = r7.b()
            r0.f103041a = r2
            r0.f103044d = r3
            java.lang.Object r9 = r8.invoke(r4, r9, r0)
            if (r9 != r1) goto L88
            return r1
        L88:
            r8 = r2
        L89:
            r8.l(r9)
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zx.i0.d(x00.q, j00.c):java.lang.Object");
    }
}
