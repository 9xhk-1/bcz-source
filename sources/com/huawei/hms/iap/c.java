package com.huawei.hms.iap;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.iap.entity.ConsumeOwnedPurchaseReq;
import com.huawei.hms.iap.entity.ConsumeOwnedPurchaseResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* loaded from: classes7.dex */
public class c extends a<g, ConsumeOwnedPurchaseResult> {

    /* renamed from: a, reason: collision with root package name */
    private ConsumeOwnedPurchaseReq f35972a;

    public c(String str, ConsumeOwnedPurchaseReq consumeOwnedPurchaseReq, String str2, String str3) {
        super(str, JsonUtil.createJsonString(consumeOwnedPurchaseReq), str2, str3);
        this.f35972a = consumeOwnedPurchaseReq;
        if (b()) {
            a(4);
        }
    }

    private boolean b() {
        ConsumeOwnedPurchaseReq consumeOwnedPurchaseReq = this.f35972a;
        if (consumeOwnedPurchaseReq == null || TextUtils.isEmpty(consumeOwnedPurchaseReq.getSignatureAlgorithm())) {
            return false;
        }
        HMSLog.i("ConsumeOwnedPurchaseTaskApiCall", "Use the SHA256WithRSA/PSS algorithm.");
        return true;
    }

    @Override // com.huawei.hms.iap.a
    public int a() {
        if (b()) {
            return 50300000;
        }
        return super.a();
    }

    @Override // com.huawei.hms.iap.a
    public void a(@NonNull fr.l<ConsumeOwnedPurchaseResult> lVar, ResponseErrorCode responseErrorCode, String str) {
        HMSLog.i("ConsumeOwnedPurchaseTaskApiCall", "dealSuccess");
        com.huawei.hms.iap.entity.a aVar = new com.huawei.hms.iap.entity.a();
        if (!TextUtils.isEmpty(str)) {
            JsonUtil.jsonToEntity(str, aVar);
        }
        ConsumeOwnedPurchaseResult consumeOwnedPurchaseResult = new ConsumeOwnedPurchaseResult();
        consumeOwnedPurchaseResult.setReturnCode(aVar.getReturnCode());
        consumeOwnedPurchaseResult.setErrMsg(aVar.getErrMsg());
        consumeOwnedPurchaseResult.setConsumePurchaseData(aVar.getConsumePurchaseData());
        consumeOwnedPurchaseResult.setDataSignature(aVar.getDataSignature());
        consumeOwnedPurchaseResult.setSignatureAlgorithm(aVar.getSignatureAlgorithm());
        consumeOwnedPurchaseResult.setStatus(new Status(responseErrorCode.getStatusCode(), responseErrorCode.getErrorReason()));
        lVar.d(consumeOwnedPurchaseResult);
    }
}
