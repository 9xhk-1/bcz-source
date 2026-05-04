package com.huawei.hms.support.api.paytask;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.api.entity.pay.HwWalletInfoRequest;
import com.huawei.hms.support.api.entity.pay.InternalPayRequest;
import com.huawei.hms.support.api.entity.pay.OrderRequest;
import com.huawei.hms.support.api.entity.pay.PayNaming;
import com.huawei.hms.support.api.entity.pay.PayReq;
import com.huawei.hms.support.api.entity.pay.ProductDetailRequest;
import com.huawei.hms.support.api.entity.pay.ProductPayRequest;
import com.huawei.hms.support.api.entity.pay.PurchaseInfoRequest;
import com.huawei.hms.support.api.entity.pay.WithholdRequest;
import com.huawei.hms.support.api.pay.GetWalletUiIntentResult;
import com.huawei.hms.support.api.pay.HwWalletInfoResult;
import com.huawei.hms.support.api.pay.OrderResult;
import com.huawei.hms.support.api.pay.PayResult;
import com.huawei.hms.support.api.pay.PayResultInfo;
import com.huawei.hms.support.api.pay.ProductDetailResult;
import com.huawei.hms.support.api.pay.ProductPayResultInfo;
import com.huawei.hms.support.api.pay.PurchaseInfoResult;
import com.huawei.hms.support.api.paytask.fullsdk.FullSdkPayTask;
import com.huawei.hms.support.api.paytask.fullsdk.FullSdkProductPayTask;
import com.huawei.hms.support.api.paytask.fullsdk.FullSdkWithholdTask;
import com.huawei.hms.support.api.paytask.fullsdk.OrderDetailTask;
import com.huawei.hms.support.api.paytask.fullsdk.ProductDetailTask;
import com.huawei.hms.support.api.paytask.fullsdk.PurchaseInfoTask;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.utils.Checker;
import fr.k;

/* loaded from: classes7.dex */
public class PayClientFullImpl implements PayClient {

    /* renamed from: a, reason: collision with root package name */
    private Context f36336a;

    public PayClientFullImpl(Context context) {
        if (context != null) {
            this.f36336a = context;
        }
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<PayResult> addWithholdingPlan(WithholdRequest withholdRequest) {
        Checker.checkNonNull(withholdRequest);
        HiAnalyticsClient.reportEntry(this.f36336a, PayNaming.FULL_WITHHOLD, 61300300);
        return new FullSdkWithholdTask(this.f36336a, withholdRequest);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<OrderResult> getOrderDetail(OrderRequest orderRequest) {
        Checker.checkNonNull(orderRequest);
        HiAnalyticsClient.reportEntry(this.f36336a, PayNaming.FULL_GETORDERDETAIL, 61300300);
        return new OrderDetailTask(this.f36336a, orderRequest);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public PayResultInfo getPayResultInfoFromIntent(Intent intent) {
        throw new UnsupportedOperationException("getPayResultInfoFromIntent");
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<ProductDetailResult> getProductDetails(ProductDetailRequest productDetailRequest) {
        Checker.checkNonNull(productDetailRequest);
        HiAnalyticsClient.reportEntry(this.f36336a, PayNaming.FULL_PRODUCTDETAIL, 61300300);
        return new ProductDetailTask(this.f36336a, productDetailRequest);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public ProductPayResultInfo getProductPayResultFromIntent(Intent intent) {
        throw new UnsupportedOperationException("getProductPayResultFromIntent");
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<PurchaseInfoResult> getPurchaseInfo(PurchaseInfoRequest purchaseInfoRequest) {
        Checker.checkNonNull(purchaseInfoRequest);
        HiAnalyticsClient.reportEntry(this.f36336a, PayNaming.FULL_PURCHASEINFO, 61300300);
        return new PurchaseInfoTask(this.f36336a, purchaseInfoRequest);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<GetWalletUiIntentResult> getWalletUiIntent(int i11) {
        throw new UnsupportedOperationException("getWalletUiIntent");
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<PayResult> internalPay(InternalPayRequest internalPayRequest) {
        throw new UnsupportedOperationException("internalPay");
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<PayResult> pay(PayReq payReq) {
        Checker.checkNonNull(payReq);
        HiAnalyticsClient.reportEntry(this.f36336a, PayNaming.FULL_PAY, 61300300);
        return new FullSdkPayTask(this.f36336a, payReq);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<PayResult> productPay(ProductPayRequest productPayRequest) {
        Checker.checkNonNull(productPayRequest);
        HiAnalyticsClient.reportEntry(this.f36336a, PayNaming.FULL_PRODUCTPAY, 61300300);
        return new FullSdkProductPayTask(this.f36336a, productPayRequest);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<HwWalletInfoResult> queryWalletInfo(HwWalletInfoRequest hwWalletInfoRequest) {
        throw new UnsupportedOperationException("queryWalletInfo");
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public void setSubAppId(String str) throws ApiException {
        throw new UnsupportedOperationException("setSubAppId");
    }
}
