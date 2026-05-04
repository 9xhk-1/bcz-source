package io.ktor.server.testing;

import com.jiongji.andriod.card.R;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "io.ktor.server.testing.TestApplicationEngine$handleRequest$2", f = "TestApplicationEngine.kt", i = {}, l = {R.styleable.Theme_drawable_share_close, 188}, m = "invokeSuspend", n = {}, s = {})
@kotlin.jvm.internal.u0({"SMAP\nTestApplicationEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestApplicationEngine.kt\nio/ktor/server/testing/TestApplicationEngine$handleRequest$2\n+ 2 Pipeline.kt\nio/ktor/util/pipeline/PipelineKt\n*L\n1#1,220:1\n487#2,4:221\n*S KotlinDebug\n*F\n+ 1 TestApplicationEngine.kt\nio/ktor/server/testing/TestApplicationEngine$handleRequest$2\n*L\n187#1:221,4\n*E\n"})
/* loaded from: classes8.dex */
public final class TestApplicationEngine$handleRequest$2 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f61821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TestApplicationEngine f61822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f61823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestApplicationEngine$handleRequest$2(TestApplicationEngine testApplicationEngine, f0 f0Var, j00.c<? super TestApplicationEngine$handleRequest$2> cVar) {
        super(2, cVar);
        this.f61822b = testApplicationEngine;
        this.f61823c = f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new TestApplicationEngine$handleRequest$2(this.f61822b, this.f61823c, cVar);
    }

    @Override // x00.p
    public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
        return ((TestApplicationEngine$handleRequest$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r7.O(r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (cz.a.b(r4, r6) == r0) goto L15;
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
            int r1 = r6.f61821a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r7)
            goto L47
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.e.n(r7)
            goto L38
        L1e:
            kotlin.e.n(r7)
            io.ktor.server.testing.TestApplicationEngine r7 = r6.f61822b
            io.ktor.server.engine.s1 r7 = r7.r()
            io.ktor.server.testing.f0 r1 = r6.f61823c
            io.ktor.server.testing.TestApplicationEngine$handleRequest$2$invokeSuspend$$inlined$execute$1 r4 = new io.ktor.server.testing.TestApplicationEngine$handleRequest$2$invokeSuspend$$inlined$execute$1
            r5 = 0
            r4.<init>(r7, r1, r5)
            r6.f61821a = r3
            java.lang.Object r7 = cz.a.b(r4, r6)
            if (r7 != r0) goto L38
            goto L46
        L38:
            io.ktor.server.testing.f0 r7 = r6.f61823c
            io.ktor.server.testing.w0 r7 = r7.b()
            r6.f61821a = r2
            java.lang.Object r7 = r7.O(r6)
            if (r7 != r0) goto L47
        L46:
            return r0
        L47:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.testing.TestApplicationEngine$handleRequest$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
