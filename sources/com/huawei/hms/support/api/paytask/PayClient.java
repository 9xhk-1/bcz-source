package com.huawei.hms.support.api.paytask;

import android.content.Intent;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.api.entity.pay.HwWalletInfoRequest;
import com.huawei.hms.support.api.entity.pay.InternalPayRequest;
import com.huawei.hms.support.api.entity.pay.OrderRequest;
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
import fr.k;

/* loaded from: classes7.dex */
public interface PayClient {
    k<PayResult> addWithholdingPlan(WithholdRequest withholdRequest);

    k<OrderResult> getOrderDetail(OrderRequest orderRequest);

    PayResultInfo getPayResultInfoFromIntent(Intent intent);

    k<ProductDetailResult> getProductDetails(ProductDetailRequest productDetailRequest);

    ProductPayResultInfo getProductPayResultFromIntent(Intent intent);

    k<PurchaseInfoResult> getPurchaseInfo(PurchaseInfoRequest purchaseInfoRequest);

    k<GetWalletUiIntentResult> getWalletUiIntent(int i11);

    k<PayResult> internalPay(InternalPayRequest internalPayRequest);

    k<PayResult> pay(PayReq payReq);

    k<PayResult> productPay(ProductPayRequest productPayRequest);

    k<HwWalletInfoResult> queryWalletInfo(HwWalletInfoRequest hwWalletInfoRequest);

    void setSubAppId(String str) throws ApiException;
}
