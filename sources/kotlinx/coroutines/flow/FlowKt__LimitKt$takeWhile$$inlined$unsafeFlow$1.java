package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n83#2:109\n124#2,17:110\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n83#1:110,17\n*E\n"})
/* loaded from: classes8.dex */
public final class FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1<T> implements i<T> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f67866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x00.p f67867b;

    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {120}, m = "collect", n = {"collector$iv"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(j00.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(i iVar, x00.p pVar) {
        this.f67866a = iVar;
        this.f67867b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.j<? super T> r6, j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 r6 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) r6
            kotlin.e.n(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L5a
        L2d:
            r7 = move-exception
            goto L50
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.e.n(r7)
            kotlinx.coroutines.flow.i r7 = r5.f67866a
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 r2 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1
            x00.p r4 = r5.f67867b
            r2.<init>(r4, r6)
            r0.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            java.lang.Object r6 = r7.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            if (r6 != r1) goto L5a
            return r1
        L4e:
            r7 = move-exception
            r6 = r2
        L50:
            kotlinx.coroutines.flow.internal.o.b(r7, r6)
            kotlin.coroutines.d r6 = r0.getContext()
            c40.n2.z(r6)
        L5a:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.j, j00.c):java.lang.Object");
    }
}
