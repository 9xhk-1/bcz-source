package com.baicizhan.client.business.webview.hwpay;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.thrift.l;
import com.baicizhan.online.user_assistant_api.HuaweiPayInfo;
import com.baicizhan.online.user_assistant_api.PayResp;
import com.baicizhan.online.user_assistant_api.UserAssistantApiService;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class HwPayServiceImpl implements IHwPayService {
    public static final int $stable = 0;

    private final UserAssistantApiService.Client getService() {
        return (UserAssistantApiService.Client) new l("/rpc/assistant").a();
    }

    @Override // com.baicizhan.client.business.webview.hwpay.IHwPayService
    @m80.l
    public Object payInHuawei(@k HuaweiPayInfo huaweiPayInfo, @k j00.c<? super PayResp> cVar) {
        return getService().huawei_pay(huaweiPayInfo);
    }
}
