package com.baicizhan.client.business.webview.hwpay;

import c40.r0;
import com.baicizhan.client.business.webview.hwpay.db.HwPayDatabaseKt;
import com.baicizhan.client.business.webview.hwpay.db.dao.HwPayOrderDao;
import com.baicizhan.client.business.webview.hwpay.db.entity.HwPayOrderInfo;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.client.business.webview.hwpay.HwPayManager$pay$2$1$1", f = "HwPayManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes4.dex */
public final class HwPayManager$pay$2$1$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ HwPayOrderInfo $hwOrderInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HwPayManager$pay$2$1$1(HwPayOrderInfo hwPayOrderInfo, j00.c<? super HwPayManager$pay$2$1$1> cVar) {
        super(2, cVar);
        this.$hwOrderInfo = hwPayOrderInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new HwPayManager$pay$2$1$1(this.$hwOrderInfo, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((HwPayManager$pay$2$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        HwPayOrderDao hwPayOrderDao = HwPayDatabaseKt.getHwPayDB().getHwPayOrderDao();
        HwPayOrderInfo hwPayOrderInfo = this.$hwOrderInfo;
        g0.m(hwPayOrderInfo);
        hwPayOrderDao.addCourseItem(hwPayOrderInfo);
        return g2.f100423a;
    }
}
