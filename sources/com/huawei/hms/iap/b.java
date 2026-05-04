package com.huawei.hms.iap;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.iap.entity.PurchaseIntentResult;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* loaded from: classes7.dex */
public abstract class b extends a<g, PurchaseIntentResult> {
    public b(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    @Override // com.huawei.hms.iap.a
    public void a(@NonNull fr.l<PurchaseIntentResult> lVar, ResponseErrorCode responseErrorCode, String str) {
        HMSLog.i("BasePurchaseIntentTaskApiCall", "dealSuccess");
        com.huawei.hms.iap.entity.g gVar = new com.huawei.hms.iap.entity.g();
        if (!TextUtils.isEmpty(str)) {
            JsonUtil.jsonToEntity(str, gVar);
        }
        PurchaseIntentResult purchaseIntentResult = new PurchaseIntentResult();
        purchaseIntentResult.setReturnCode(gVar.getReturnCode());
        purchaseIntentResult.setErrMsg(gVar.getErrMsg());
        purchaseIntentResult.setPaymentData(gVar.getPaymentData());
        purchaseIntentResult.setPaymentSignature(gVar.getPaymentSignature());
        purchaseIntentResult.setSignatureAlgorithm(gVar.getSignatureAlgorithm());
        purchaseIntentResult.setStatus(a(responseErrorCode));
        lVar.d(purchaseIntentResult);
    }

    public boolean a(String str) {
        return "entrusted".equals(com.huawei.hms.iap.util.b.c(com.huawei.hms.iap.util.b.c(str, "PayTypePolicy"), "DefaultPayment"));
    }
}
