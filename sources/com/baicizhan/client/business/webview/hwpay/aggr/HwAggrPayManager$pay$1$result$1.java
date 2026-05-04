package com.baicizhan.client.business.webview.hwpay.aggr;

import android.app.Activity;
import c40.r0;
import com.huawei.hms.aggrpay.AggrPayClient;
import com.huawei.hms.aggrpay.Pay;
import com.huawei.hms.aggrpay.entity.PayResult;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "com.baicizhan.client.business.webview.hwpay.aggr.HwAggrPayManager$pay$1$result$1", f = "HwAggrPayManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes4.dex */
public final class HwAggrPayManager$pay$1$result$1 extends SuspendLambda implements p<r0, c<? super PayResult>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $orderStr;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HwAggrPayManager$pay$1$result$1(Activity activity, String str, c<? super HwAggrPayManager$pay$1$result$1> cVar) {
        super(2, cVar);
        this.$activity = activity;
        this.$orderStr = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new HwAggrPayManager$pay$1$result$1(this.$activity, this.$orderStr, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super PayResult> cVar) {
        return ((HwAggrPayManager$pay$1$result$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        AggrPayClient payClient = Pay.getPayClient(this.$activity);
        g0.o(payClient, "getPayClient(...)");
        return payClient.pay(this.$orderStr);
    }
}
