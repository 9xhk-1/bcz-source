package io.ktor.server.routing;

import io.ktor.server.plugins.CannotTransformContentToTypeException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "io.ktor.server.routing.RegexRoutingKt$patch$2", f = "RegexRouting.kt", i = {}, l = {292, 197}, m = "invokeSuspend", n = {}, s = {})
@kotlin.jvm.internal.u0({"SMAP\nRegexRouting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegexRouting.kt\nio/ktor/server/routing/RegexRoutingKt$patch$2\n+ 2 ApplicationReceiveFunctions.kt\nio/ktor/server/request/ApplicationReceiveFunctionsKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,291:1\n72#2:292\n73#2:309\n58#3,16:293\n*S KotlinDebug\n*F\n+ 1 RegexRouting.kt\nio/ktor/server/routing/RegexRoutingKt$patch$2\n*L\n197#1:292\n197#1:309\n197#1:293,16\n*E\n"})
/* loaded from: classes8.dex */
public final class RegexRoutingKt$patch$2 extends SuspendLambda implements x00.p<c1, j00.c<? super g2>, Object> {
    final /* synthetic */ x00.q<c1, R, j00.c<? super g2>, Object> $body;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RegexRoutingKt$patch$2(x00.q<? super c1, ? super R, ? super j00.c<? super g2>, ? extends Object> qVar, j00.c<? super RegexRoutingKt$patch$2> cVar) {
        super(2, cVar);
        this.$body = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        RegexRoutingKt$patch$2 regexRoutingKt$patch$2 = new RegexRoutingKt$patch$2(this.$body, cVar);
        regexRoutingKt$patch$2.L$0 = obj;
        return regexRoutingKt$patch$2;
    }

    @Override // x00.p
    public final Object invoke(c1 c1Var, j00.c<? super g2> cVar) {
        return ((RegexRoutingKt$patch$2) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r6.invoke(r1, r14, r13) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r13.label
            r2 = 6
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r4 = 4
            r5 = 2
            r6 = 1
            java.lang.String r7 = "R"
            r8 = 0
            if (r1 == 0) goto L2d
            if (r1 == r6) goto L21
            if (r1 != r5) goto L19
            kotlin.e.n(r14)
            goto L69
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L21:
            java.lang.Object r1 = r13.L$1
            io.ktor.server.routing.c1 r1 = (io.ktor.server.routing.c1) r1
            java.lang.Object r6 = r13.L$0
            x00.q r6 = (x00.q) r6
            kotlin.e.n(r14)
            goto L5a
        L2d:
            kotlin.e.n(r14)
            java.lang.Object r14 = r13.L$0
            r1 = r14
            io.ktor.server.routing.c1 r1 = (io.ktor.server.routing.c1) r1
            x00.q<io.ktor.server.routing.c1, R, j00.c<? super yz.g2>, java.lang.Object> r14 = r13.$body
            io.ktor.server.routing.b1 r9 = r1.a()
            kotlin.jvm.internal.g0.y(r4, r7)
            h10.d r10 = kotlin.jvm.internal.o0.d(r3)
            kotlin.jvm.internal.g0.y(r2, r7)     // Catch: java.lang.Throwable -> L45
        L45:
            gz.a r11 = new gz.a
            r11.<init>(r10, r8)
            r13.L$0 = r14
            r13.L$1 = r1
            r13.label = r6
            java.lang.Object r6 = r9.L(r11, r13)
            if (r6 != r0) goto L57
            goto L68
        L57:
            r12 = r6
            r6 = r14
            r14 = r12
        L5a:
            if (r14 == 0) goto L6c
            r13.L$0 = r8
            r13.L$1 = r8
            r13.label = r5
            java.lang.Object r14 = r6.invoke(r1, r14, r13)
            if (r14 != r0) goto L69
        L68:
            return r0
        L69:
            yz.g2 r14 = yz.g2.f100423a
            return r14
        L6c:
            kotlin.jvm.internal.g0.y(r4, r7)
            h10.d r14 = kotlin.jvm.internal.o0.d(r3)
            kotlin.jvm.internal.g0.y(r2, r7)     // Catch: java.lang.Throwable -> L76
        L76:
            gz.a r0 = new gz.a
            r0.<init>(r14, r8)
            h10.r r14 = r0.a()
            kotlin.jvm.internal.g0.m(r14)
            io.ktor.server.plugins.CannotTransformContentToTypeException r0 = new io.ktor.server.plugins.CannotTransformContentToTypeException
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.routing.RegexRoutingKt$patch$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        c1 c1Var = (c1) this.L$0;
        x00.q<c1, R, j00.c<? super g2>, Object> qVar = this.$body;
        b1 a11 = c1Var.a();
        kotlin.jvm.internal.g0.y(4, "R");
        h10.d d11 = kotlin.jvm.internal.o0.d(Object.class);
        try {
            kotlin.jvm.internal.g0.y(6, "R");
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        kotlin.jvm.internal.d0.e(0);
        Object L = a11.L(aVar, this);
        kotlin.jvm.internal.d0.e(1);
        if (L != null) {
            qVar.invoke(c1Var, L, this);
            return g2.f100423a;
        }
        kotlin.jvm.internal.g0.y(4, "R");
        h10.d d12 = kotlin.jvm.internal.o0.d(Object.class);
        try {
            kotlin.jvm.internal.g0.y(6, "R");
        } catch (Throwable unused2) {
        }
        h10.r a12 = new gz.a(d12, null).a();
        kotlin.jvm.internal.g0.m(a12);
        throw new CannotTransformContentToTypeException(a12);
    }
}
