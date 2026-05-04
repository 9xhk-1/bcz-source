package com.baicizhan.client.business.webview.hwpay;

import androidx.core.app.ComponentActivity;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.client.business.webview.hwpay.HwPayManager$repairConsumeProduct$1$1", f = "HwPayManager.kt", i = {}, l = {312}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes4.dex */
public final class HwPayManager$repairConsumeProduct$1$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ ComponentActivity $activity;
    final /* synthetic */ String $inAppPurchaseData;
    final /* synthetic */ boolean $needCallback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HwPayManager$repairConsumeProduct$1$1(ComponentActivity componentActivity, String str, boolean z11, j00.c<? super HwPayManager$repairConsumeProduct$1$1> cVar) {
        super(2, cVar);
        this.$activity = componentActivity;
        this.$inAppPurchaseData = str;
        this.$needCallback = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new HwPayManager$repairConsumeProduct$1$1(this.$activity, this.$inAppPurchaseData, this.$needCallback, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((HwPayManager$repairConsumeProduct$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleHwPay;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            HwPayManager hwPayManager = HwPayManager.INSTANCE;
            ComponentActivity componentActivity = this.$activity;
            String str = this.$inAppPurchaseData;
            g0.m(str);
            boolean z11 = this.$needCallback;
            this.label = 1;
            handleHwPay = hwPayManager.handleHwPay(componentActivity, str, z11, this);
            if (handleHwPay == l11) {
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
