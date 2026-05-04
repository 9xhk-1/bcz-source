package com.baicizhan.client.business.webview.hwpay.aggr;

import c40.n0;
import kotlin.coroutines.a;
import kotlin.coroutines.d;
import kotlin.jvm.internal.u0;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 HwAggrPayManager.kt\ncom/baicizhan/client/business/webview/hwpay/aggr/HwAggrPayManager\n*L\n1#1,49:1\n34#2,2:50\n*E\n"})
/* loaded from: classes4.dex */
public final class HwAggrPayManager$special$$inlined$CoroutineExceptionHandler$1 extends a implements n0 {
    public HwAggrPayManager$special$$inlined$CoroutineExceptionHandler$1(n0.b bVar) {
        super(bVar);
    }

    @Override // c40.n0
    public void handleException(d dVar, Throwable th2) {
        c.c("HwAggrPayManager", "支付协程异常: " + th2.getMessage(), th2);
    }
}
