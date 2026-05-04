package io.ktor.server.testing;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "io.ktor.server.testing.TestApplicationEngineJvmKt$handleWebSocketConversation$4", f = "TestApplicationEngineJvm.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
@kotlin.jvm.internal.u0({"SMAP\nTestApplicationEngineJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestApplicationEngineJvm.kt\nio/ktor/server/testing/TestApplicationEngineJvmKt$handleWebSocketConversation$4\n+ 2 Pipeline.kt\nio/ktor/util/pipeline/PipelineKt\n*L\n1#1,86:1\n487#2,4:87\n*S KotlinDebug\n*F\n+ 1 TestApplicationEngineJvm.kt\nio/ktor/server/testing/TestApplicationEngineJvmKt$handleWebSocketConversation$4\n*L\n44#1:87,4\n*E\n"})
/* loaded from: classes8.dex */
public final class TestApplicationEngineJvmKt$handleWebSocketConversation$4 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f61847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TestApplicationEngine f61848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f61849c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c40.a0 f61850d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestApplicationEngineJvmKt$handleWebSocketConversation$4(TestApplicationEngine testApplicationEngine, f0 f0Var, c40.a0 a0Var, j00.c<? super TestApplicationEngineJvmKt$handleWebSocketConversation$4> cVar) {
        super(2, cVar);
        this.f61848b = testApplicationEngine;
        this.f61849c = f0Var;
        this.f61850d = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new TestApplicationEngineJvmKt$handleWebSocketConversation$4(this.f61848b, this.f61849c, this.f61850d, cVar);
    }

    @Override // x00.p
    public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
        return ((TestApplicationEngineJvmKt$handleWebSocketConversation$4) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.f61847a;
        try {
            if (i11 == 0) {
                kotlin.e.n(obj);
                TestApplicationEngineJvmKt$handleWebSocketConversation$4$invokeSuspend$$inlined$execute$1 testApplicationEngineJvmKt$handleWebSocketConversation$4$invokeSuspend$$inlined$execute$1 = new TestApplicationEngineJvmKt$handleWebSocketConversation$4$invokeSuspend$$inlined$execute$1(this.f61848b.r(), this.f61849c, null);
                this.f61847a = 1;
                if (cz.a.b(testApplicationEngineJvmKt$handleWebSocketConversation$4$invokeSuspend$$inlined$execute$1, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
        } catch (Throwable th2) {
            this.f61850d.r(th2);
        }
        return g2.f100423a;
    }
}
