package com.baicizhan.client.business.webview.hwpay;

import com.jiongji.andriod.card.R;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.client.business.webview.hwpay.HwPayManager", f = "HwPayManager.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {R.styleable.Theme_drawable_tab_friends_new}, m = "handleHwPay", n = {"activity", "purchaseData", "result", "hwPayOrderInfo", "payInfo", "needCallback", "$i$a$-onSuccess-HwPayManager$handleHwPay$3", "$i$a$-runCatching-HwPayManager$handleHwPay$3$1"}, s = {"L$0", "L$1", "L$3", "L$4", "L$5", "Z$0", "I$0", "I$1"}, v = 1)
/* loaded from: classes4.dex */
public final class HwPayManager$handleHwPay$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HwPayManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HwPayManager$handleHwPay$1(HwPayManager hwPayManager, j00.c<? super HwPayManager$handleHwPay$1> cVar) {
        super(cVar);
        this.this$0 = hwPayManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object handleHwPay;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleHwPay = this.this$0.handleHwPay(null, null, false, this);
        return handleHwPay;
    }
}
