package com.huawei.hms.iap.task;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.iap.entity.PurchaseIntentReq;
import com.huawei.hms.iap.entity.PurchaseIntentResult;
import com.huawei.hms.iapfull.IIapFullAPIVer4;
import com.huawei.hms.iapfull.bean.WebProductPayRequest;
import com.huawei.hms.support.api.client.Status;

/* loaded from: classes7.dex */
public class CreatePurchaseTask extends BaseIapFullTask<PurchaseIntentResult, PurchaseIntentReq> {

    /* renamed from: a, reason: collision with root package name */
    private Intent f36023a;

    public CreatePurchaseTask(Context context, PurchaseIntentReq purchaseIntentReq) {
        super(context, purchaseIntentReq);
    }

    private WebProductPayRequest a(PurchaseIntentReq purchaseIntentReq) {
        if (purchaseIntentReq == null) {
            return new WebProductPayRequest();
        }
        WebProductPayRequest webProductPayRequest = new WebProductPayRequest();
        webProductPayRequest.setProductId(purchaseIntentReq.getProductId());
        webProductPayRequest.setPriceType(purchaseIntentReq.getPriceType());
        webProductPayRequest.setDeveloperPayload(purchaseIntentReq.getDeveloperPayload());
        webProductPayRequest.setReservedInfor(purchaseIntentReq.getReservedInfor());
        webProductPayRequest.setSignatureAlgorithm(purchaseIntentReq.getSignatureAlgorithm());
        webProductPayRequest.setWebPayPmsVer4(true);
        return webProductPayRequest;
    }

    @Override // com.huawei.hms.iap.task.BaseIapFullTask
    public void handleRequest(PurchaseIntentReq purchaseIntentReq, IIapFullAPIVer4 iIapFullAPIVer4) {
        Intent pmsPayIntent = iIapFullAPIVer4.getPmsPayIntent(a(purchaseIntentReq));
        this.f36023a = pmsPayIntent;
        ((PurchaseIntentResult) this.mResult).setStatus(pmsPayIntent == null ? new Status(60001, "param is error") : new Status(0, "success", this.f36023a));
        this.mIsCompleted = true;
    }

    @Override // com.huawei.hms.iap.task.BaseIapFullTask, fr.k
    public boolean isSuccessful() {
        return this.f36023a != null;
    }

    @Override // com.huawei.hms.iap.task.BaseIapFullTask
    public void setResult() {
        this.mResult = new PurchaseIntentResult();
    }
}
