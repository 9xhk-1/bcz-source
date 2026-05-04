package io.ktor.server.engine;

import io.ktor.util.cio.ChannelIOException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1", f = "DefaultEnginePipeline.kt", i = {0, 2, 4}, l = {123, 42, 35, 42, 39, 42, 42}, m = "invokeSuspend", n = {"$this$intercept", "$this$intercept", "$this$intercept"}, s = {"L$0", "L$0", "L$0"})
@kotlin.jvm.internal.u0({"SMAP\nDefaultEnginePipeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultEnginePipeline.kt\nio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n+ 3 Pipeline.kt\nio/ktor/util/pipeline/PipelineKt\n*L\n1#1,121:1\n79#2:122\n79#2:127\n79#2:128\n79#2:129\n79#2:130\n79#2:131\n487#3,4:123\n*S KotlinDebug\n*F\n+ 1 DefaultEnginePipeline.kt\nio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1\n*L\n33#1:122\n42#1:127\n35#1:128\n42#1:129\n39#1:130\n42#1:131\n33#1:123,4\n*E\n"})
/* loaded from: classes8.dex */
public final class DefaultEnginePipelineKt$defaultEnginePipeline$1 extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<yz.g2, zx.k0>, yz.g2, j00.c<? super yz.g2>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f61281a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f61282b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1$1", f = "DefaultEnginePipeline.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.u0({"SMAP\nDefaultEnginePipeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultEnginePipeline.kt\nio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,121:1\n79#2:122\n*S KotlinDebug\n*F\n+ 1 DefaultEnginePipeline.kt\nio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1\n*L\n36#1:122\n*E\n"})
    public static final class a extends SuspendLambda implements x00.l<j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61283a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ io.ktor.util.pipeline.d<yz.g2, zx.k0> f61284b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ChannelIOException f61285c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.ktor.util.pipeline.d<yz.g2, zx.k0> dVar, ChannelIOException channelIOException, j00.c<? super a> cVar) {
            super(1, cVar);
            this.f61284b = dVar;
            this.f61285c = channelIOException;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(j00.c<?> cVar) {
            return new a(this.f61284b, this.f61285c, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super yz.g2> cVar) {
            return ((a) create(cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f61283a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            DefaultEnginePipelineKt.g(this.f61284b.d().w0().a(), this.f61284b.d(), this.f61285c);
            return yz.g2.f100423a;
        }
    }

    public DefaultEnginePipelineKt$defaultEnginePipeline$1(j00.c<? super DefaultEnginePipelineKt$defaultEnginePipeline$1> cVar) {
        super(3, cVar);
    }

    @Override // x00.q
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object invoke(io.ktor.util.pipeline.d<yz.g2, zx.k0> dVar, yz.g2 g2Var, j00.c<? super yz.g2> cVar) {
        DefaultEnginePipelineKt$defaultEnginePipeline$1 defaultEnginePipelineKt$defaultEnginePipeline$1 = new DefaultEnginePipelineKt$defaultEnginePipeline$1(cVar);
        defaultEnginePipelineKt$defaultEnginePipeline$1.f61282b = dVar;
        return defaultEnginePipelineKt$defaultEnginePipeline$1.invokeSuspend(yz.g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d3, code lost:
    
        if (io.ktor.utils.io.j.j(r10, 0, r5, 1, null) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x013d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011a, code lost:
    
        if (io.ktor.utils.io.j.j(r10, 0, r5, 1, null) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        if (io.ktor.utils.io.j.j(r3, 0, r9, 1, null) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        if (r0.a(r4, r6, r9) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        if (io.ktor.server.engine.DefaultEnginePipelineKt.e(r0, r10, r9) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0074, code lost:
    
        if (cz.a.b(r4, r9) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013b, code lost:
    
        if (io.ktor.utils.io.j.j(r2, 0, r5, 1, null) == r1) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15, types: [io.ktor.util.pipeline.d] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
