package com.huawei.hms.push.ups;

import android.content.Context;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.HmsMessaging;
import com.huawei.hms.push.s;
import com.huawei.hms.push.ups.entity.CodeResult;
import com.huawei.hms.push.ups.entity.TokenResult;
import com.huawei.hms.push.ups.entity.UPSRegisterCallBack;
import com.huawei.hms.push.ups.entity.UPSTurnCallBack;
import com.huawei.hms.push.ups.entity.UPSUnRegisterCallBack;
import com.huawei.hms.support.log.HMSLog;
import fr.g;
import fr.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class UPSService {
    public static void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallBack uPSRegisterCallBack) {
        HMSLog.i("UPSService", "invoke registerToken");
        Preconditions.checkNotNull(uPSRegisterCallBack);
        if (!s.b()) {
            uPSRegisterCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
            return;
        }
        try {
            uPSRegisterCallBack.onResult(new TokenResult(HmsInstanceId.getInstance(context).getToken(str, null)));
        } catch (ApiException e11) {
            uPSRegisterCallBack.onResult(new TokenResult(e11.getStatusCode(), e11.getMessage()));
        }
    }

    public static void turnOffPush(Context context, final UPSTurnCallBack uPSTurnCallBack) {
        HMSLog.i("UPSService", "invoke turnOffPush");
        Preconditions.checkNotNull(uPSTurnCallBack);
        if (s.b()) {
            HmsMessaging.getInstance(context).turnOffPush().addOnCompleteListener(new g<Void>() { // from class: com.huawei.hms.push.ups.UPSService.2
                @Override // fr.g
                public void onComplete(k<Void> kVar) {
                    if (kVar.isSuccessful()) {
                        UPSTurnCallBack.this.onResult(new CodeResult());
                    } else {
                        ApiException apiException = (ApiException) kVar.getException();
                        UPSTurnCallBack.this.onResult(new CodeResult(apiException.getStatusCode(), apiException.getMessage()));
                    }
                }
            });
        } else {
            uPSTurnCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
        }
    }

    public static void turnOnPush(Context context, final UPSTurnCallBack uPSTurnCallBack) {
        HMSLog.i("UPSService", "invoke turnOnPush");
        Preconditions.checkNotNull(uPSTurnCallBack);
        if (s.b()) {
            HmsMessaging.getInstance(context).turnOnPush().addOnCompleteListener(new g<Void>() { // from class: com.huawei.hms.push.ups.UPSService.1
                @Override // fr.g
                public void onComplete(k<Void> kVar) {
                    if (kVar.isSuccessful()) {
                        UPSTurnCallBack.this.onResult(new CodeResult());
                    } else {
                        ApiException apiException = (ApiException) kVar.getException();
                        UPSTurnCallBack.this.onResult(new CodeResult(apiException.getStatusCode(), apiException.getMessage()));
                    }
                }
            });
        } else {
            uPSTurnCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
        }
    }

    public static void unRegisterToken(Context context, UPSUnRegisterCallBack uPSUnRegisterCallBack) {
        HMSLog.i("UPSService", "invoke unRegisterToken");
        Preconditions.checkNotNull(uPSUnRegisterCallBack);
        if (!s.b()) {
            uPSUnRegisterCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
            return;
        }
        try {
            HmsInstanceId.getInstance(context).deleteToken(null, null);
            uPSUnRegisterCallBack.onResult(new TokenResult());
        } catch (ApiException e11) {
            uPSUnRegisterCallBack.onResult(new TokenResult(e11.getStatusCode(), e11.getMessage()));
        }
    }
}
