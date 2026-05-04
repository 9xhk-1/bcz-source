package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", i = {}, l = {288, 288}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class FlowKt__ZipKt$combine$6$2<R, T> extends SuspendLambda implements x00.q<j<? super R>, T[], j00.c<? super g2>, Object> {
    final /* synthetic */ x00.p<T[], j00.c<? super R>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$6$2(x00.p<? super T[], ? super j00.c<? super R>, ? extends Object> pVar, j00.c<? super FlowKt__ZipKt$combine$6$2> cVar) {
        super(3, cVar);
        this.$transform = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r6)
            goto L47
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
            kotlin.e.n(r6)
            goto L3b
        L22:
            kotlin.e.n(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
            java.lang.Object r6 = r5.L$1
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            x00.p<T[], j00.c<? super R>, java.lang.Object> r4 = r5.$transform
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L3b
            goto L46
        L3b:
            r3 = 0
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L47
        L46:
            return r0
        L47:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend$$forInline(Object obj) {
        j jVar = (j) this.L$0;
        Object invoke = this.$transform.invoke((Object[]) this.L$1, this);
        kotlin.jvm.internal.d0.e(0);
        jVar.emit(invoke, this);
        kotlin.jvm.internal.d0.e(1);
        return g2.f100423a;
    }

    @Override // x00.q
    public final Object invoke(j<? super R> jVar, T[] tArr, j00.c<? super g2> cVar) {
        kotlin.jvm.internal.g0.w();
        FlowKt__ZipKt$combine$6$2 flowKt__ZipKt$combine$6$2 = new FlowKt__ZipKt$combine$6$2(this.$transform, cVar);
        flowKt__ZipKt$combine$6$2.L$0 = jVar;
        flowKt__ZipKt$combine$6$2.L$1 = tArr;
        return flowKt__ZipKt$combine$6$2.invokeSuspend(g2.f100423a);
    }
}
