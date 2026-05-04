package com.huawei.hms.support.api.paytask.fullsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iapfull.IapFullAPIFactory;
import com.huawei.hms.iapfull.bean.WebPurchaseInfoRequest;
import com.huawei.hms.iapfull.webpay.callback.WebPayCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.pay.PurchaseInfoRequest;
import com.huawei.hms.support.api.entity.pay.PurchaseInfoResp;
import com.huawei.hms.support.api.pay.PurchaseInfoResult;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import fr.h;
import fr.i;
import fr.k;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public class PurchaseInfoTask extends k<PurchaseInfoResult> {

    /* renamed from: a, reason: collision with root package name */
    private boolean f36356a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f36357b;

    /* renamed from: c, reason: collision with root package name */
    private PurchaseInfoResult f36358c = new PurchaseInfoResult();

    /* renamed from: d, reason: collision with root package name */
    private i<PurchaseInfoResult> f36359d;

    /* renamed from: e, reason: collision with root package name */
    private h f36360e;

    public PurchaseInfoTask(Context context, PurchaseInfoRequest purchaseInfoRequest) {
        if (context != null) {
            IapFullAPIFactory.createIapFullAPI(context).getPurchaseInfo(a(purchaseInfoRequest), new WebPayCallback() { // from class: com.huawei.hms.support.api.paytask.fullsdk.PurchaseInfoTask.1
                public void onFailure(int i11, String str) {
                    PurchaseInfoResp purchaseInfoResp = new PurchaseInfoResp();
                    purchaseInfoResp.setCommonStatus(new Status(i11, str));
                    PurchaseInfoTask.this.f36357b = false;
                    PurchaseInfoTask.this.f36358c = new PurchaseInfoResult(purchaseInfoResp);
                    PurchaseInfoTask.this.f36356a = true;
                    if (PurchaseInfoTask.this.f36360e != null) {
                        PurchaseInfoTask.this.f36360e.onFailure(new IapApiException(PurchaseInfoTask.this.f36358c.getStatus()));
                    }
                }

                public void onSuccess(String str) {
                    PurchaseInfoResp purchaseInfoResp = new PurchaseInfoResp();
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            JsonUtil.jsonToEntity(str, purchaseInfoResp);
                        } catch (IllegalArgumentException e11) {
                            HMSLog.e("ProductDetailTask", "ProductDetailResp jsonToEntity " + e11.getMessage());
                        }
                    }
                    PurchaseInfoResult purchaseInfoResult = new PurchaseInfoResult(purchaseInfoResp);
                    PurchaseInfoTask.this.f36357b = true;
                    PurchaseInfoTask.this.f36358c = purchaseInfoResult;
                    PurchaseInfoTask.this.f36356a = true;
                    if (PurchaseInfoTask.this.f36359d != null) {
                        PurchaseInfoTask.this.f36359d.onSuccess(PurchaseInfoTask.this.f36358c);
                    }
                }
            });
            return;
        }
        this.f36358c.setStatus(new Status(30001, "param is error"));
        this.f36357b = false;
        this.f36356a = true;
    }

    private WebPurchaseInfoRequest a(PurchaseInfoRequest purchaseInfoRequest) {
        WebPurchaseInfoRequest webPurchaseInfoRequest = new WebPurchaseInfoRequest();
        webPurchaseInfoRequest.setAppId(purchaseInfoRequest.getAppId());
        webPurchaseInfoRequest.setMerchantId(purchaseInfoRequest.getMerchantId());
        webPurchaseInfoRequest.setPageNo(purchaseInfoRequest.getPageNo());
        webPurchaseInfoRequest.setPriceType(purchaseInfoRequest.getPriceType());
        webPurchaseInfoRequest.setProductId(purchaseInfoRequest.getProductId());
        webPurchaseInfoRequest.setReservedInfor(purchaseInfoRequest.getReservedInfor());
        webPurchaseInfoRequest.setSign(purchaseInfoRequest.getSign());
        webPurchaseInfoRequest.setSignatureAlgorithm(purchaseInfoRequest.getSignatureAlgorithm());
        webPurchaseInfoRequest.setTs(purchaseInfoRequest.getTs());
        return webPurchaseInfoRequest;
    }

    @Override // fr.k
    public k<PurchaseInfoResult> addOnFailureListener(Activity activity, h hVar) {
        addOnFailureListener(hVar);
        return this;
    }

    @Override // fr.k
    public k<PurchaseInfoResult> addOnSuccessListener(Activity activity, i<PurchaseInfoResult> iVar) {
        addOnSuccessListener(iVar);
        return this;
    }

    @Override // fr.k
    public Exception getException() {
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // fr.k
    public PurchaseInfoResult getResult() {
        return this.f36358c;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // fr.k
    public <E extends Throwable> PurchaseInfoResult getResultThrowException(Class<E> cls) throws Throwable {
        return null;
    }

    @Override // fr.k
    public boolean isCanceled() {
        return false;
    }

    @Override // fr.k
    public boolean isComplete() {
        return this.f36356a;
    }

    @Override // fr.k
    public boolean isSuccessful() {
        return this.f36357b;
    }

    @Override // fr.k
    public k<PurchaseInfoResult> addOnFailureListener(h hVar) {
        if (hVar != null) {
            if (isComplete()) {
                hVar.onFailure(new IapApiException(this.f36358c.getStatus()));
                return this;
            }
            this.f36360e = hVar;
        }
        return this;
    }

    @Override // fr.k
    public k<PurchaseInfoResult> addOnSuccessListener(i<PurchaseInfoResult> iVar) {
        if (iVar != null) {
            this.f36359d = iVar;
        }
        return this;
    }

    @Override // fr.k
    public k<PurchaseInfoResult> addOnFailureListener(Executor executor, h hVar) {
        addOnFailureListener(hVar);
        return this;
    }

    @Override // fr.k
    public k<PurchaseInfoResult> addOnSuccessListener(Executor executor, i<PurchaseInfoResult> iVar) {
        addOnSuccessListener(iVar);
        return this;
    }
}
