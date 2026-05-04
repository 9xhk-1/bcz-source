package androidx.compose.foundation;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2", f = "BasicTooltip.kt", i = {}, l = {310, 312}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class BasicTooltipStateImpl$show$2 extends SuspendLambda implements l<j00.c<? super g2>, Object> {
    final /* synthetic */ l<j00.c<? super g2>, Object> $cancellableShow;
    int label;
    final /* synthetic */ BasicTooltipStateImpl this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2$1", f = "BasicTooltip.kt", i = {}, l = {312}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.BasicTooltipStateImpl$show$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
        final /* synthetic */ l<j00.c<? super g2>, Object> $cancellableShow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(l<? super j00.c<? super g2>, ? extends Object> lVar, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$cancellableShow = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new AnonymousClass1(this.$cancellableShow, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            if (i11 == 0) {
                kotlin.e.n(obj);
                l<j00.c<? super g2>, Object> lVar = this.$cancellableShow;
                this.label = 1;
                if (lVar.invoke(this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BasicTooltipStateImpl$show$2(BasicTooltipStateImpl basicTooltipStateImpl, l<? super j00.c<? super g2>, ? extends Object> lVar, j00.c<? super BasicTooltipStateImpl$show$2> cVar) {
        super(1, cVar);
        this.this$0 = basicTooltipStateImpl;
        this.$cancellableShow = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(j00.c<?> cVar) {
        return new BasicTooltipStateImpl$show$2(this.this$0, this.$cancellableShow, cVar);
    }

    @Override // x00.l
    public final Object invoke(j00.c<? super g2> cVar) {
        return ((BasicTooltipStateImpl$show$2) create(cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (c40.v3.c(1500, r6, r5) == r0) goto L20;
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
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto Lf
            if (r1 != r3) goto L15
        Lf:
            kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L13
            goto L46
        L13:
            r6 = move-exception
            goto L4e
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            kotlin.e.n(r6)
            androidx.compose.foundation.BasicTooltipStateImpl r6 = r5.this$0     // Catch: java.lang.Throwable -> L13
            boolean r6 = r6.isPersistent()     // Catch: java.lang.Throwable -> L13
            if (r6 == 0) goto L33
            x00.l<j00.c<? super yz.g2>, java.lang.Object> r6 = r5.$cancellableShow     // Catch: java.lang.Throwable -> L13
            r5.label = r4     // Catch: java.lang.Throwable -> L13
            java.lang.Object r6 = r6.invoke(r5)     // Catch: java.lang.Throwable -> L13
            if (r6 != r0) goto L46
            goto L45
        L33:
            androidx.compose.foundation.BasicTooltipStateImpl$show$2$1 r6 = new androidx.compose.foundation.BasicTooltipStateImpl$show$2$1     // Catch: java.lang.Throwable -> L13
            x00.l<j00.c<? super yz.g2>, java.lang.Object> r1 = r5.$cancellableShow     // Catch: java.lang.Throwable -> L13
            r4 = 0
            r6.<init>(r1, r4)     // Catch: java.lang.Throwable -> L13
            r5.label = r3     // Catch: java.lang.Throwable -> L13
            r3 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r6 = c40.v3.c(r3, r6, r5)     // Catch: java.lang.Throwable -> L13
            if (r6 != r0) goto L46
        L45:
            return r0
        L46:
            androidx.compose.foundation.BasicTooltipStateImpl r6 = r5.this$0
            r6.setVisible(r2)
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L4e:
            androidx.compose.foundation.BasicTooltipStateImpl r0 = r5.this$0
            r0.setVisible(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipStateImpl$show$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
