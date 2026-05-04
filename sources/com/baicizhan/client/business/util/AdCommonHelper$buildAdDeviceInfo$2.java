package com.baicizhan.client.business.util;

import c40.r0;
import com.baicizhan.online.ad_property.AdDeviceInfo;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.client.business.util.AdCommonHelper$buildAdDeviceInfo$2", f = "AdCommonHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes4.dex */
public final class AdCommonHelper$buildAdDeviceInfo$2 extends SuspendLambda implements x00.p<r0, j00.c<? super AdDeviceInfo>, Object> {
    int label;

    public AdCommonHelper$buildAdDeviceInfo$2(j00.c<? super AdCommonHelper$buildAdDeviceInfo$2> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new AdCommonHelper$buildAdDeviceInfo$2(cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super AdDeviceInfo> cVar) {
        return ((AdCommonHelper$buildAdDeviceInfo$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        return AdCommonHelper.INSTANCE.buildAdDeviceInfoSync();
    }
}
