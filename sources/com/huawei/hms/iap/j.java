package com.huawei.hms.iap;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.iap.entity.IsEnvReadyResult;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* loaded from: classes7.dex */
public class j extends a<g, IsEnvReadyResult> {
    public j(String str, String str2, boolean z11) {
        super(str, JsonUtil.createJsonString(null), str2);
        if (z11) {
            setApiLevel(4);
        }
    }

    @Override // com.huawei.hms.iap.a
    public void a(@NonNull fr.l<IsEnvReadyResult> lVar, @NonNull ResponseErrorCode responseErrorCode, String str) {
        HMSLog.i("IsEnvReadyTaskApiCall", "dealSuccess");
        IsEnvReadyResult isEnvReadyResult = new IsEnvReadyResult();
        com.huawei.hms.iap.entity.b bVar = new com.huawei.hms.iap.entity.b();
        if (!TextUtils.isEmpty(str)) {
            JsonUtil.jsonToEntity(str, bVar);
        }
        isEnvReadyResult.setReturnCode(bVar.getReturnCode());
        isEnvReadyResult.setStatus(a(responseErrorCode));
        isEnvReadyResult.setAccountFlag(bVar.getAccountFlag());
        isEnvReadyResult.setCountry(bVar.getCountry());
        isEnvReadyResult.setCarrierId(bVar.getCarrierId());
        lVar.d(isEnvReadyResult);
    }
}
