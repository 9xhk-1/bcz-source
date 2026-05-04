package com.huawei.hms.push;

import android.content.Context;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.ConsentTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.EnableConsentReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.utils.JsonUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HmsConsent {

    /* renamed from: a, reason: collision with root package name */
    public HuaweiApi<Api.ApiOptions.NoOptions> f36128a;

    /* renamed from: b, reason: collision with root package name */
    public Context f36129b;

    public HmsConsent(Context context) {
        Preconditions.checkNotNull(context);
        this.f36129b = context;
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi = new HuaweiApi<>(context, (Api<Api.ApiOptions>) new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH), (Api.ApiOptions) null, new PushClientBuilder());
        this.f36128a = huaweiApi;
        huaweiApi.setKitSdkVersion(60500300);
    }

    public static HmsConsent getInstance(Context context) {
        return new HmsConsent(context);
    }

    public final fr.k<Void> a(boolean z11) {
        fr.l lVar;
        int externalCode;
        String reportEntry = PushBiUtil.reportEntry(this.f36129b, PushNaming.PUSH_CONSENT);
        try {
            if (!s.d(this.f36129b)) {
                throw ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException();
            }
            EnableConsentReq enableConsentReq = new EnableConsentReq();
            enableConsentReq.setPackageName(this.f36129b.getPackageName());
            enableConsentReq.setEnable(z11);
            return this.f36128a.doWrite(new ConsentTask(PushNaming.PUSH_CONSENT, JsonUtil.createJsonString(enableConsentReq), reportEntry));
        } catch (ApiException e11) {
            fr.l lVar2 = new fr.l();
            lVar2.c(e11);
            externalCode = e11.getStatusCode();
            lVar = lVar2;
            PushBiUtil.reportExit(this.f36129b, PushNaming.PUSH_CONSENT, reportEntry, externalCode);
            return lVar.b();
        } catch (Exception unused) {
            lVar = new fr.l();
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            lVar.c(errorEnum.toApiException());
            externalCode = errorEnum.getExternalCode();
            PushBiUtil.reportExit(this.f36129b, PushNaming.PUSH_CONSENT, reportEntry, externalCode);
            return lVar.b();
        }
    }

    public fr.k<Void> consentOff() {
        return a(false);
    }

    public fr.k<Void> consentOn() {
        return a(true);
    }
}
