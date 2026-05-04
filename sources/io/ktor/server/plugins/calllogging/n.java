package io.ktor.server.plugins.calllogging;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.p;
import x00.q;
import yz.g2;
import zx.d0;
import zx.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n implements d0<p<? super zx.b, ? super j00.c<? super g2>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final n f61546a = new n();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.plugins.calllogging.ResponseSent$install$1", f = "MDCHook.kt", i = {0}, l = {32, 33}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    @u0({"SMAP\nMDCHook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MDCHook.kt\nio/ktor/server/plugins/calllogging/ResponseSent$install$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,39:1\n79#2:40\n79#2:41\n79#2:42\n*S KotlinDebug\n*F\n+ 1 MDCHook.kt\nio/ktor/server/plugins/calllogging/ResponseSent$install$1\n*L\n29#1:40\n31#1:41\n33#1:42\n*E\n"})
    public static final class a extends SuspendLambda implements q<io.ktor.util.pipeline.d<Object, k0>, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61547a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61548b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<zx.b, j00.c<? super g2>, Object> f61549c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super zx.b, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super a> cVar) {
            super(3, cVar);
            this.f61549c = pVar;
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, k0> dVar, Object obj, j00.c<? super g2> cVar) {
            a aVar = new a(this.f61549c, cVar);
            aVar.f61548b = dVar;
            return aVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
        
            if (r7.invoke(r1, r6) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        
            if (r1.h(r6) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f61547a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r7)
                goto L73
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f61548b
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                kotlin.e.n(r7)
                goto L5f
            L22:
                kotlin.e.n(r7)
                java.lang.Object r7 = r6.f61548b
                r1 = r7
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                java.lang.Object r7 = r1.d()
                zx.k0 r7 = (zx.k0) r7
                xy.b r7 = r7.getAttributes()
                xy.a r4 = io.ktor.server.plugins.calllogging.l.b()
                boolean r7 = r7.c(r4)
                if (r7 == 0) goto L41
                yz.g2 r7 = yz.g2.f100423a
                return r7
            L41:
                java.lang.Object r7 = r1.d()
                zx.k0 r7 = (zx.k0) r7
                xy.b r7 = r7.getAttributes()
                xy.a r4 = io.ktor.server.plugins.calllogging.l.b()
                yz.g2 r5 = yz.g2.f100423a
                r7.e(r4, r5)
                r6.f61548b = r1
                r6.f61547a = r3
                java.lang.Object r7 = r1.h(r6)
                if (r7 != r0) goto L5f
                goto L72
            L5f:
                x00.p<zx.b, j00.c<? super yz.g2>, java.lang.Object> r7 = r6.f61549c
                java.lang.Object r1 = r1.d()
                zx.k0 r1 = (zx.k0) r1
                r3 = 0
                r6.f61548b = r3
                r6.f61547a = r2
                java.lang.Object r7 = r7.invoke(r1, r6)
                if (r7 != r0) goto L73
            L72:
                return r0
            L73:
                yz.g2 r7 = yz.g2.f100423a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.plugins.calllogging.n.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // zx.d0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@m80.k zx.c pipeline, @m80.k p<? super zx.b, ? super j00.c<? super g2>, ? extends Object> handler) {
        g0.p(pipeline, "pipeline");
        g0.p(handler, "handler");
        pipeline.j0().C(qy.m.f82742h.d(), new a(handler, null));
    }
}
