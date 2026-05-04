package com.baicizhan.client.business.webview.hwpay.aggr;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import c40.h1;
import c40.l2;
import c40.l3;
import c40.n0;
import c40.r0;
import c40.s0;
import com.baicizhan.client.business.webview.PayManager;
import com.huawei.hms.aggrpay.entity.PayResult;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import qb.c;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nHwAggrPayManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HwAggrPayManager.kt\ncom/baicizhan/client/business/webview/hwpay/aggr/HwAggrPayManager\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,104:1\n47#2,4:105\n*S KotlinDebug\n*F\n+ 1 HwAggrPayManager.kt\ncom/baicizhan/client/business/webview/hwpay/aggr/HwAggrPayManager\n*L\n33#1:105,4\n*E\n"})
/* loaded from: classes4.dex */
public final class HwAggrPayManager {

    @k
    private static final String TAG = "HwAggrPayManager";

    @l
    private static PayManager.IPayListener onPayListener;

    @k
    public static final HwAggrPayManager INSTANCE = new HwAggrPayManager();

    @k
    private static volatile l2 payJob = l3.c(null, 1, null);

    @k
    private static final n0 exceptionHandler = new HwAggrPayManager$special$$inlined$CoroutineExceptionHandler$1(n0.f7891d0);
    public static final int $stable = 8;

    private HwAggrPayManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dealOminPayResult(PayResult payResult) {
        if (payResult == null) {
            c.d(TAG, "支付失败: payResult is null", new Object[0]);
            return;
        }
        PayManager.IPayListener iPayListener = onPayListener;
        if (iPayListener != null) {
            iPayListener.onHwAggrResponse(payResult);
        }
        c.b(TAG, "支付结果 - returnCode: " + payResult.getReturnCode() + ", returnMsg: " + payResult.getReturnMsg(), new Object[0]);
    }

    private final r0 getPayScope() {
        return s0.a(payJob.plus(h1.e()).plus(exceptionHandler));
    }

    public final void cancelAll() {
        synchronized (this) {
            l2.a.b(payJob, null, 1, null);
            payJob = l3.c(null, 1, null);
            c.b(TAG, "已取消所有支付协程，并创建新的 Job", new Object[0]);
            g2 g2Var = g2.f100423a;
        }
    }

    @l
    public final PayManager.IPayListener getOnPayListener() {
        return onPayListener;
    }

    public final void pay(@k Activity activity, @k String orderStr) {
        g0.p(activity, "activity");
        g0.p(orderStr, "orderStr");
        c.b(TAG, "start pay :" + orderStr, new Object[0]);
        c40.k.f(getPayScope(), null, null, new HwAggrPayManager$pay$1(activity, orderStr, null), 3, null);
    }

    public final void setOnPayListener(@l PayManager.IPayListener iPayListener) {
        onPayListener = iPayListener;
    }
}
