package com.huawei.hms.push;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.ProfileTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.ProfileReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HmsProfile {
    public static final int CUSTOM_PROFILE = 2;
    public static final int HUAWEI_PROFILE = 1;

    /* renamed from: a, reason: collision with root package name */
    public static final String f36135a = "HmsProfile";

    /* renamed from: b, reason: collision with root package name */
    public Context f36136b;

    /* renamed from: c, reason: collision with root package name */
    public HuaweiApi<Api.ApiOptions.NoOptions> f36137c;

    public HmsProfile(Context context) {
        this.f36136b = null;
        Preconditions.checkNotNull(context);
        this.f36136b = context;
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi = new HuaweiApi<>(context, (Api<Api.ApiOptions>) new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH), (Api.ApiOptions) null, new PushClientBuilder());
        this.f36137c = huaweiApi;
        huaweiApi.setKitSdkVersion(60500300);
    }

    public static HmsProfile getInstance(Context context) {
        return new HmsProfile(context);
    }

    public final fr.k<Void> a(int i11, String str, int i12, String str2) {
        if (!isSupportProfile()) {
            fr.l lVar = new fr.l();
            lVar.c(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException());
            return lVar.b();
        }
        if (!TextUtils.isEmpty(str)) {
            String a11 = a(this.f36136b);
            if (TextUtils.isEmpty(a11)) {
                HMSLog.i(f36135a, "agc connect services config missing project id.");
                fr.l lVar2 = new fr.l();
                lVar2.c(ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException());
                return lVar2.b();
            }
            if (str.equals(a11)) {
                str = "";
            }
        }
        ProfileReq profileReq = new ProfileReq();
        if (i11 == 0) {
            profileReq.setOperation(0);
            profileReq.setType(i12);
        } else {
            profileReq.setOperation(1);
        }
        String reportEntry = PushBiUtil.reportEntry(this.f36136b, PushNaming.PUSH_PROFILE);
        try {
            profileReq.setSubjectId(str);
            profileReq.setProfileId(qr.d.b(str2));
            profileReq.setPkgName(this.f36136b.getPackageName());
            return this.f36137c.doWrite(new ProfileTask(PushNaming.PUSH_PROFILE, JsonUtil.createJsonString(profileReq), reportEntry));
        } catch (Exception e11) {
            if (e11.getCause() instanceof ApiException) {
                fr.l lVar3 = new fr.l();
                ApiException apiException = (ApiException) e11.getCause();
                lVar3.c(apiException);
                PushBiUtil.reportExit(this.f36136b, PushNaming.PUSH_PROFILE, reportEntry, apiException.getStatusCode());
                return lVar3.b();
            }
            fr.l lVar4 = new fr.l();
            Context context = this.f36136b;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            PushBiUtil.reportExit(context, PushNaming.PUSH_PROFILE, reportEntry, errorEnum);
            lVar4.c(errorEnum.toApiException());
            return lVar4.b();
        }
    }

    public fr.k<Void> addProfile(int i11, String str) {
        return addProfile("", i11, str);
    }

    public final boolean b(Context context) {
        return s.b(context) >= 110001400;
    }

    public fr.k<Void> deleteProfile(String str) {
        return deleteProfile("", str);
    }

    public boolean isSupportProfile() {
        if (!s.d(this.f36136b)) {
            return true;
        }
        if (s.c()) {
            HMSLog.i(f36135a, "current EMUI version below 9.1, not support profile operation.");
            return false;
        }
        if (b(this.f36136b)) {
            return true;
        }
        HMSLog.i(f36135a, "current HwPushService.apk version below 11.0.1.400,please upgrade your HwPushService.apk version.");
        return false;
    }

    public fr.k<Void> addProfile(String str, int i11, String str2) {
        if (i11 != 1 && i11 != 2) {
            HMSLog.i(f36135a, "add profile type undefined.");
            fr.l lVar = new fr.l();
            lVar.c(ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
            return lVar.b();
        }
        if (!TextUtils.isEmpty(str2)) {
            return a(0, str, i11, str2);
        }
        HMSLog.i(f36135a, "add profile params is empty.");
        fr.l lVar2 = new fr.l();
        lVar2.c(ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
        return lVar2.b();
    }

    public fr.k<Void> deleteProfile(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return a(1, str, -1, str2);
        }
        HMSLog.e(f36135a, "del profile params is empty.");
        fr.l lVar = new fr.l();
        lVar.c(ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
        return lVar.b();
    }

    public static String a(Context context) {
        return oq.a.b(context).getString("client/project_id");
    }
}
