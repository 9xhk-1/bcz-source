package io.ktor.client.engine.cio;

import c40.l2;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.ConnectionPipelineKt$skipCancels$1", f = "ConnectionPipeline.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {162, 167, 170, 178, 178}, m = "invokeSuspend", n = {"$this$useInstance$iv", "instance$iv", "buffer", "$this$useInstance$iv", "instance$iv", "buffer", "$this$useInstance$iv", "instance$iv", "buffer"}, s = {"L$0", "L$3", "L$4", "L$0", "L$3", "L$4", "L$0", "L$3", "L$4"})
    @u0({"SMAP\nConnectionPipeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPipeline.kt\nio/ktor/client/engine/cio/ConnectionPipelineKt$skipCancels$1\n+ 2 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n*L\n1#1,181:1\n156#2,5:182\n*S KotlinDebug\n*F\n+ 1 ConnectionPipeline.kt\nio/ktor/client/engine/cio/ConnectionPipelineKt$skipCancels$1\n*L\n158#1:182,5\n*E\n"})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f60913a;

        /* renamed from: b, reason: collision with root package name */
        public Object f60914b;

        /* renamed from: c, reason: collision with root package name */
        public Object f60915c;

        /* renamed from: d, reason: collision with root package name */
        public Object f60916d;

        /* renamed from: e, reason: collision with root package name */
        public Object f60917e;

        /* renamed from: f, reason: collision with root package name */
        public int f60918f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.m f60919g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f60920h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.ktor.utils.io.m mVar, io.ktor.utils.io.g gVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f60919g = mVar;
            this.f60920h = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f60919g, this.f60920h, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00d5, code lost:
        
            if (io.ktor.utils.io.r.g(r2, r0, r18) == r6) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0119, code lost:
        
            if (r0.j(r18) == r6) goto L66;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c2 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #1 {all -> 0x0046, blocks: (B:18:0x0042, B:23:0x00ba, B:25:0x00c2, B:45:0x0102, B:58:0x0081), top: B:2:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0102 A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0046, blocks: (B:18:0x0042, B:23:0x00ba, B:25:0x00c2, B:45:0x0102, B:58:0x0081), top: B:2:0x000e }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00d5 -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00f3 -> B:20:0x0099). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 324
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final l2 b(r0 r0Var, io.ktor.utils.io.g gVar, io.ktor.utils.io.m mVar) {
        l2 f11;
        f11 = c40.k.f(r0Var, null, null, new a(mVar, gVar, null), 3, null);
        return f11;
    }
}
