package com.baicizhan.client.business.webview.hwpay.aggr;

import android.app.Activity;
import c40.r0;
import com.huawei.hms.aggrpay.entity.PayResult;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "com.baicizhan.client.business.webview.hwpay.aggr.HwAggrPayManager$pay$1", f = "HwAggrPayManager.kt", i = {1, 2}, l = {56, 62, 67}, m = "invokeSuspend", n = {"result", "e"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes4.dex */
public final class HwAggrPayManager$pay$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $orderStr;
    Object L$0;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.client.business.webview.hwpay.aggr.HwAggrPayManager$pay$1$1", f = "HwAggrPayManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: com.baicizhan.client.business.webview.hwpay.aggr.HwAggrPayManager$pay$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        final /* synthetic */ PayResult $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PayResult payResult, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$result = payResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$result, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            HwAggrPayManager.INSTANCE.dealOminPayResult(this.$result);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.client.business.webview.hwpay.aggr.HwAggrPayManager$pay$1$2", f = "HwAggrPayManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: com.baicizhan.client.business.webview.hwpay.aggr.HwAggrPayManager$pay$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, c<? super g2> cVar) {
            return ((AnonymousClass2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            HwAggrPayManager.INSTANCE.dealOminPayResult(null);
            return g2.f100423a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HwAggrPayManager$pay$1(Activity activity, String str, c<? super HwAggrPayManager$pay$1> cVar) {
        super(2, cVar);
        this.$activity = activity;
        this.$orderStr = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new HwAggrPayManager$pay$1(this.$activity, this.$orderStr, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((HwAggrPayManager$pay$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (c40.i.h(r1, r4, r8) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if (c40.i.h(r1, r3, r8) != r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L31
            if (r1 == r4) goto L2d
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r0 = r8.L$0
            java.lang.Exception r0 = (java.lang.Exception) r0
            kotlin.e.n(r9)
            goto L96
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            java.lang.Object r1 = r8.L$0
            com.huawei.hms.aggrpay.entity.PayResult r1 = (com.huawei.hms.aggrpay.entity.PayResult) r1
            kotlin.e.n(r9)     // Catch: java.lang.Exception -> L2b
            goto L96
        L2b:
            r9 = move-exception
            goto L64
        L2d:
            kotlin.e.n(r9)     // Catch: java.lang.Exception -> L2b
            goto L4a
        L31:
            kotlin.e.n(r9)
            c40.m0 r9 = c40.h1.c()     // Catch: java.lang.Exception -> L2b
            com.baicizhan.client.business.webview.hwpay.aggr.HwAggrPayManager$pay$1$result$1 r1 = new com.baicizhan.client.business.webview.hwpay.aggr.HwAggrPayManager$pay$1$result$1     // Catch: java.lang.Exception -> L2b
            android.app.Activity r6 = r8.$activity     // Catch: java.lang.Exception -> L2b
            java.lang.String r7 = r8.$orderStr     // Catch: java.lang.Exception -> L2b
            r1.<init>(r6, r7, r5)     // Catch: java.lang.Exception -> L2b
            r8.label = r4     // Catch: java.lang.Exception -> L2b
            java.lang.Object r9 = c40.i.h(r9, r1, r8)     // Catch: java.lang.Exception -> L2b
            if (r9 != r0) goto L4a
            goto L95
        L4a:
            com.huawei.hms.aggrpay.entity.PayResult r9 = (com.huawei.hms.aggrpay.entity.PayResult) r9     // Catch: java.lang.Exception -> L2b
            c40.v2 r1 = c40.h1.e()     // Catch: java.lang.Exception -> L2b
            com.baicizhan.client.business.webview.hwpay.aggr.HwAggrPayManager$pay$1$1 r4 = new com.baicizhan.client.business.webview.hwpay.aggr.HwAggrPayManager$pay$1$1     // Catch: java.lang.Exception -> L2b
            r4.<init>(r9, r5)     // Catch: java.lang.Exception -> L2b
            java.lang.Object r9 = l00.k.a(r9)     // Catch: java.lang.Exception -> L2b
            r8.L$0 = r9     // Catch: java.lang.Exception -> L2b
            r8.label = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r9 = c40.i.h(r1, r4, r8)     // Catch: java.lang.Exception -> L2b
            if (r9 != r0) goto L96
            goto L95
        L64:
            java.lang.String r1 = r9.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "支付异常: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "HwAggrPayManager"
            qb.c.c(r3, r1, r9)
            c40.v2 r1 = c40.h1.e()
            com.baicizhan.client.business.webview.hwpay.aggr.HwAggrPayManager$pay$1$2 r3 = new com.baicizhan.client.business.webview.hwpay.aggr.HwAggrPayManager$pay$1$2
            r3.<init>(r5)
            java.lang.Object r9 = l00.k.a(r9)
            r8.L$0 = r9
            r8.label = r2
            java.lang.Object r9 = c40.i.h(r1, r3, r8)
            if (r9 != r0) goto L96
        L95:
            return r0
        L96:
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.webview.hwpay.aggr.HwAggrPayManager$pay$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
