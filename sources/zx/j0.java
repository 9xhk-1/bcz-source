package zx;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.c0
@kotlin.jvm.internal.u0({"SMAP\nKtorCallContexts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KtorCallContexts.kt\nio/ktor/server/application/OnCallRespondContext\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,88:1\n79#2:89\n*S KotlinDebug\n*F\n+ 1 KtorCallContexts.kt\nio/ktor/server/application/OnCallRespondContext\n*L\n83#1:89\n*E\n"})
/* loaded from: classes8.dex */
public final class j0<PluginConfig> extends u<PluginConfig> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final io.ktor.util.pipeline.d<Object, k0> f103045c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.application.OnCallRespondContext", f = "KtorCallContexts.kt", i = {}, l = {85}, m = "transformBody", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f103046a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f103047b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j0<PluginConfig> f103048c;

        /* renamed from: d, reason: collision with root package name */
        public int f103049d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0<PluginConfig> j0Var, j00.c<? super a> cVar) {
            super(cVar);
            this.f103048c = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f103047b = obj;
            this.f103049d |= Integer.MIN_VALUE;
            return this.f103048c.d(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(@m80.k PluginConfig pluginConfig, @m80.k io.ktor.util.pipeline.d<Object, k0> context) {
        super(pluginConfig, context);
        kotlin.jvm.internal.g0.p(pluginConfig, "pluginConfig");
        kotlin.jvm.internal.g0.p(context, "context");
        this.f103045c = context;
    }

    @Override // zx.u
    @m80.k
    public io.ktor.util.pipeline.d<Object, k0> b() {
        return this.f103045c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@m80.k x00.q<? super zx.x0, java.lang.Object, ? super j00.c<java.lang.Object>, ? extends java.lang.Object> r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zx.j0.a
            if (r0 == 0) goto L13
            r0 = r7
            zx.j0$a r0 = (zx.j0.a) r0
            int r1 = r0.f103049d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f103049d = r1
            goto L18
        L13:
            zx.j0$a r0 = new zx.j0$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f103047b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f103049d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f103046a
            io.ktor.util.pipeline.d r6 = (io.ktor.util.pipeline.d) r6
            kotlin.e.n(r7)
            goto L67
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.e.n(r7)
            zx.x0 r7 = new zx.x0
            io.ktor.util.pipeline.d r2 = r5.b()
            java.lang.Object r2 = r2.d()
            zx.k0 r2 = (zx.k0) r2
            qy.o r2 = r2.k()
            gz.a r2 = qy.t.a(r2)
            r7.<init>(r2)
            io.ktor.util.pipeline.d r2 = r5.b()
            io.ktor.util.pipeline.d r4 = r5.b()
            java.lang.Object r4 = r4.e()
            r0.f103046a = r2
            r0.f103049d = r3
            java.lang.Object r7 = r6.invoke(r7, r4, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r6 = r2
        L67:
            r6.l(r7)
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zx.j0.d(x00.q, j00.c):java.lang.Object");
    }
}
