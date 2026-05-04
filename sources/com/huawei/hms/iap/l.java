package com.huawei.hms.iap;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.iap.entity.OwnedPurchasesReq;
import com.huawei.hms.iap.entity.OwnedPurchasesResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* loaded from: classes7.dex */
public class l extends a<g, OwnedPurchasesResult> {

    /* renamed from: a, reason: collision with root package name */
    private OwnedPurchasesReq f36018a;

    public l(String str, OwnedPurchasesReq ownedPurchasesReq, String str2, String str3) {
        super(str, JsonUtil.createJsonString(ownedPurchasesReq), str2, str3);
        this.f36018a = ownedPurchasesReq;
        if (b()) {
            a(4);
        }
    }

    private boolean b() {
        OwnedPurchasesReq ownedPurchasesReq = this.f36018a;
        if (ownedPurchasesReq == null || TextUtils.isEmpty(ownedPurchasesReq.getSignatureAlgorithm())) {
            return false;
        }
        HMSLog.i("OwnedPurchasesTaskApiCall", "Use the SHA256WithRSA/PSS algorithm.");
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
    public void a(@NonNull fr.l<OwnedPurchasesResult> lVar, ResponseErrorCode responseErrorCode, String str) {
        HMSLog.i("OwnedPurchasesTaskApiCall", "dealSuccess");
        com.huawei.hms.iap.entity.d dVar = new com.huawei.hms.iap.entity.d();
        if (!TextUtils.isEmpty(str)) {
            JsonUtil.jsonToEntity(str, dVar);
        }
        OwnedPurchasesResult ownedPurchasesResult = new OwnedPurchasesResult();
        ownedPurchasesResult.setReturnCode(dVar.getReturnCode());
        ownedPurchasesResult.setErrMsg(dVar.getErrMsg());
        ownedPurchasesResult.setContinuationToken(dVar.getContinuationToken());
        ownedPurchasesResult.setItemList(dVar.getItemList());
        ownedPurchasesResult.setInAppPurchaseDataList(dVar.getInAppPurchaseDataList());
        ownedPurchasesResult.setInAppSignature(dVar.getInAppSignatureList());
        ownedPurchasesResult.setStatus(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason()));
        ownedPurchasesResult.setPlacedInappPurchaseDataList(dVar.getPlacedInappPurchaseDataList());
        ownedPurchasesResult.setPlacedInappSignatureList(dVar.getPlacedInappSignatureList());
        ownedPurchasesResult.setSignatureAlgorithm(dVar.getSignatureAlgorithm());
        lVar.d(ownedPurchasesResult);
    }
}
