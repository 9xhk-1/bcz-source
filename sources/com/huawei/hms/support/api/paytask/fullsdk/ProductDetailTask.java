package com.huawei.hms.support.api.paytask.fullsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iapfull.IapFullAPIFactory;
import com.huawei.hms.iapfull.bean.WebProductDetailRequest;
import com.huawei.hms.iapfull.webpay.callback.WebPayCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.pay.ProductDetailRequest;
import com.huawei.hms.support.api.entity.pay.ProductDetailResp;
import com.huawei.hms.support.api.pay.ProductDetailResult;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import fr.h;
import fr.i;
import fr.k;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public class ProductDetailTask extends k<ProductDetailResult> {

    /* renamed from: a, reason: collision with root package name */
    private boolean f36350a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f36351b;

    /* renamed from: c, reason: collision with root package name */
    private ProductDetailResult f36352c = new ProductDetailResult();

    /* renamed from: d, reason: collision with root package name */
    private i<ProductDetailResult> f36353d;

    /* renamed from: e, reason: collision with root package name */
    private h f36354e;

    public ProductDetailTask(Context context, ProductDetailRequest productDetailRequest) {
        if (context != null) {
            IapFullAPIFactory.createIapFullAPI(context).getProductDetail(a(productDetailRequest), new WebPayCallback() { // from class: com.huawei.hms.support.api.paytask.fullsdk.ProductDetailTask.1
                public void onFailure(int i11, String str) {
                    ProductDetailResult productDetailResult = new ProductDetailResult();
                    productDetailResult.setStatus(new Status(i11, str));
                    ProductDetailTask.this.f36351b = false;
                    ProductDetailTask.this.f36352c = productDetailResult;
                    ProductDetailTask.this.f36350a = true;
                    if (ProductDetailTask.this.f36354e != null) {
                        ProductDetailTask.this.f36354e.onFailure(new IapApiException(ProductDetailTask.this.f36352c.getStatus()));
                    }
                }

                public void onSuccess(String str) {
                    ProductDetailResp productDetailResp = new ProductDetailResp();
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            JsonUtil.jsonToEntity(str, productDetailResp);
                        } catch (IllegalArgumentException e11) {
                            HMSLog.e("ProductDetailTask", "ProductDetailResp jsonToEntity " + e11.getMessage());
                        }
                    }
                    ProductDetailResult productDetailResult = new ProductDetailResult();
                    productDetailResult.setProductList(productDetailResp.productList);
                    productDetailResult.setStatus(new Status(productDetailResp.returnCode, productDetailResp.errMsg));
                    productDetailResult.setFailList(productDetailResp.getFailList());
                    productDetailResult.setProductList(productDetailResp.getProductList());
                    productDetailResult.setRequestId(productDetailResp.getRequestId());
                    ProductDetailTask.this.f36351b = true;
                    ProductDetailTask.this.f36352c = productDetailResult;
                    ProductDetailTask.this.f36350a = true;
                    if (ProductDetailTask.this.f36353d != null) {
                        ProductDetailTask.this.f36353d.onSuccess(ProductDetailTask.this.f36352c);
                    }
                }
            });
            return;
        }
        this.f36352c.setStatus(new Status(30001, "param is error"));
        this.f36351b = false;
        this.f36350a = true;
    }

    private WebProductDetailRequest a(ProductDetailRequest productDetailRequest) {
        WebProductDetailRequest webProductDetailRequest = new WebProductDetailRequest();
        webProductDetailRequest.setApplicationID(productDetailRequest.getApplicationID());
        webProductDetailRequest.setMerchantId(productDetailRequest.getMerchantId());
        webProductDetailRequest.setProductNos(productDetailRequest.getProductNos());
        webProductDetailRequest.setRequestId(productDetailRequest.getRequestId());
        webProductDetailRequest.setReservedInfor(productDetailRequest.getReservedInfor());
        return webProductDetailRequest;
    }

    @Override // fr.k
    public k<ProductDetailResult> addOnFailureListener(Activity activity, h hVar) {
        addOnFailureListener(hVar);
        return this;
    }

    @Override // fr.k
    public k<ProductDetailResult> addOnSuccessListener(Activity activity, i<ProductDetailResult> iVar) {
        addOnSuccessListener(iVar);
        return this;
    }

    @Override // fr.k
    public Exception getException() {
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // fr.k
    public ProductDetailResult getResult() {
        return this.f36352c;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // fr.k
    public <E extends Throwable> ProductDetailResult getResultThrowException(Class<E> cls) throws Throwable {
        return null;
    }

    @Override // fr.k
    public boolean isCanceled() {
        return false;
    }

    @Override // fr.k
    public boolean isComplete() {
        return this.f36350a;
    }

    @Override // fr.k
    public boolean isSuccessful() {
        return this.f36351b;
    }

    @Override // fr.k
    public k<ProductDetailResult> addOnFailureListener(h hVar) {
        if (hVar != null) {
            if (isComplete()) {
                hVar.onFailure(new IapApiException(this.f36352c.getStatus()));
                return this;
            }
            this.f36354e = hVar;
        }
        return this;
    }

    @Override // fr.k
    public k<ProductDetailResult> addOnSuccessListener(i<ProductDetailResult> iVar) {
        if (iVar != null) {
            this.f36353d = iVar;
        }
        return this;
    }

    @Override // fr.k
    public k<ProductDetailResult> addOnFailureListener(Executor executor, h hVar) {
        addOnFailureListener(hVar);
        return this;
    }

    @Override // fr.k
    public k<ProductDetailResult> addOnSuccessListener(Executor executor, i<ProductDetailResult> iVar) {
        addOnSuccessListener(iVar);
        return this;
    }
}
