package com.huawei.hms.opendevice;

import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.support.api.entity.opendevice.HuaweiOpendeviceNaming;
import com.huawei.hms.support.api.opendevice.OdidResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.utils.JsonUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class OpenDeviceClientImpl extends HuaweiApi<OpenDeviceOptions> implements OpenDeviceClient {

    /* renamed from: a, reason: collision with root package name */
    public static final OpenDeviceHmsClientBuilder f36077a = new OpenDeviceHmsClientBuilder();

    /* renamed from: b, reason: collision with root package name */
    public static final Api<OpenDeviceOptions> f36078b = new Api<>(HuaweiApiAvailability.HMS_API_NAME_OD);

    /* renamed from: c, reason: collision with root package name */
    public static OpenDeviceOptions f36079c = new OpenDeviceOptions();

    public OpenDeviceClientImpl(Context context) {
        super(context, f36078b, f36079c, f36077a);
        super.setKitSdkVersion(60300305);
    }

    @Override // com.huawei.hms.opendevice.OpenDeviceClient
    public fr.k<OdidResult> getOdid() {
        return doWrite(new OpenDeviceTaskApiCall(HuaweiOpendeviceNaming.getOdid, JsonUtil.createJsonString(null), HiAnalyticsClient.reportEntry(getContext(), HuaweiOpendeviceNaming.getOdid, 60300305)));
    }
}
