package com.huawei.hms.support.api.paytask;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.api.entity.pay.HwWalletInfoRequest;
import com.huawei.hms.support.api.entity.pay.InternalPayRequest;
import com.huawei.hms.support.api.entity.pay.OrderRequest;
import com.huawei.hms.support.api.entity.pay.PayNaming;
import com.huawei.hms.support.api.entity.pay.PayReq;
import com.huawei.hms.support.api.entity.pay.ProductDetailRequest;
import com.huawei.hms.support.api.entity.pay.ProductPayRequest;
import com.huawei.hms.support.api.entity.pay.PurchaseInfoInnerRequest;
import com.huawei.hms.support.api.entity.pay.PurchaseInfoRequest;
import com.huawei.hms.support.api.entity.pay.WalletUiIntentReq;
import com.huawei.hms.support.api.entity.pay.WithholdRequest;
import com.huawei.hms.support.api.pay.GetWalletUiIntentResult;
import com.huawei.hms.support.api.pay.HwWalletInfoResult;
import com.huawei.hms.support.api.pay.OrderResult;
import com.huawei.hms.support.api.pay.PayResult;
import com.huawei.hms.support.api.pay.PayResultInfo;
import com.huawei.hms.support.api.pay.ProductDetailResult;
import com.huawei.hms.support.api.pay.ProductPayResultInfo;
import com.huawei.hms.support.api.pay.PurchaseInfoResult;
import com.huawei.hms.support.api.pay.util.a;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.JsonUtil;
import com.tencent.mobileqq.openpay.constants.OpenConstants;
import fr.k;

/* loaded from: classes7.dex */
public class PayClientImpl extends HuaweiApi<PayOptions> implements PayClient {

    /* renamed from: a, reason: collision with root package name */
    private static final Api<PayOptions> f36337a = new Api<>(HuaweiApiAvailability.HMS_API_NAME_PAY);

    /* renamed from: b, reason: collision with root package name */
    private static PayOptions f36338b = new PayOptions();

    public PayClientImpl(Activity activity) {
        super(activity, f36337a, f36338b, (AbstractClientBuilder) new PayHmsClientBuilder(), 61300300);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<PayResult> addWithholdingPlan(WithholdRequest withholdRequest) {
        HMSLog.i("PayClientImpl", "addWithholdingPlan");
        Checker.checkNonNull(withholdRequest);
        return doWrite(new PayTaskApiCall(PayNaming.withhold, JsonUtil.createJsonString(withholdRequest), HiAnalyticsClient.reportEntry(getContext(), PayNaming.withhold, 61300300), withholdRequest.signatureAlgorithm));
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<OrderResult> getOrderDetail(OrderRequest orderRequest) {
        HMSLog.i("PayClientImpl", "getOrderDetail");
        Checker.checkNonNull(orderRequest);
        return doWrite(new OrderTaskApiCall(PayNaming.getOrderDetail, orderRequest, HiAnalyticsClient.reportEntry(getContext(), PayNaming.getOrderDetail, 61300300)));
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public PayResultInfo getPayResultInfoFromIntent(Intent intent) {
        HMSLog.i("PayClientImpl", "getPayResultInfoFromIntent");
        if (intent == null) {
            HMSLog.e("PayClientImpl", "getPayResultInfoFromIntent, mIntent is null");
            return null;
        }
        PayResultInfo payResultInfo = new PayResultInfo();
        payResultInfo.setReturnCode(a.a(intent, "returnCode", 1));
        payResultInfo.setErrMsg(a.a(intent, "errMsg"));
        payResultInfo.setUserName(a.a(intent, "userName"));
        payResultInfo.setOrderID(a.a(intent, "orderID"));
        payResultInfo.setRequestId(a.a(intent, HwPayConstant.KEY_REQUESTID));
        payResultInfo.setWithholdID(a.a(intent, "withholdID"));
        payResultInfo.setAmount(a.a(intent, HwPayConstant.KEY_AMOUNT));
        payResultInfo.setTime(a.a(intent, "time"));
        payResultInfo.setCountry(a.a(intent, HwPayConstant.KEY_COUNTRY));
        payResultInfo.setCurrency(a.a(intent, HwPayConstant.KEY_CURRENCY));
        payResultInfo.setSign(a.a(intent, HwPayConstant.KEY_SIGN));
        payResultInfo.setNewSign(a.a(intent, "newSign"));
        payResultInfo.setSignatureAlgorithm(a.a(intent, "signatureAlgorithm"));
        HMSLog.i("PayClientImpl", "final pay result info::" + payResultInfo.getReturnCode());
        return payResultInfo;
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<ProductDetailResult> getProductDetails(ProductDetailRequest productDetailRequest) {
        HMSLog.i("PayClientImpl", "getProductDetails");
        Checker.checkNonNull(productDetailRequest);
        return doWrite(new ProductDetailTaskApiCall(PayNaming.productdetail, JsonUtil.createJsonString(productDetailRequest), HiAnalyticsClient.reportEntry(getContext(), PayNaming.productdetail, 61300300)));
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public ProductPayResultInfo getProductPayResultFromIntent(Intent intent) {
        HMSLog.i("PayClientImpl", "getProductPayResultFromIntent");
        if (intent == null) {
            HMSLog.e("PayClientImpl", "getProductPayResultFromIntent, mIntent is null");
            return null;
        }
        ProductPayResultInfo productPayResultInfo = new ProductPayResultInfo();
        productPayResultInfo.setReturnCode(a.a(intent, "returnCode", 1));
        productPayResultInfo.setOrderID(a.a(intent, "orderID"));
        productPayResultInfo.setErrMsg(a.a(intent, "errMsg"));
        productPayResultInfo.setProductNo(a.a(intent, HwPayConstant.KEY_PRODUCT_NO));
        productPayResultInfo.setMicrosAmount(a.a(intent, "microsAmount", 0L));
        productPayResultInfo.setTime(a.a(intent, "time"));
        productPayResultInfo.setCountry(a.a(intent, HwPayConstant.KEY_COUNTRY));
        productPayResultInfo.setCurrency(a.a(intent, HwPayConstant.KEY_CURRENCY));
        productPayResultInfo.setRequestId(a.a(intent, HwPayConstant.KEY_REQUESTID));
        productPayResultInfo.setMerchantId(a.a(intent, HwPayConstant.KEY_MERCHANTID));
        productPayResultInfo.setSign(a.a(intent, HwPayConstant.KEY_SIGN));
        productPayResultInfo.setNewSign(a.a(intent, "newSign"));
        productPayResultInfo.setSignatureAlgorithm(a.a(intent, "signatureAlgorithm"));
        HMSLog.i("PayClientImpl", "final product pay result info::" + productPayResultInfo.getReturnCode());
        return productPayResultInfo;
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<PurchaseInfoResult> getPurchaseInfo(PurchaseInfoRequest purchaseInfoRequest) {
        HMSLog.i("PayClientImpl", "getPurchaseInfo");
        Checker.checkNonNull(purchaseInfoRequest);
        return doWrite(new GetPurchaseInfoTaskApiCall(PayNaming.purchaseinfo, JsonUtil.createJsonString(new PurchaseInfoInnerRequest(purchaseInfoRequest))));
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<GetWalletUiIntentResult> getWalletUiIntent(int i11) {
        HMSLog.i("PayClientImpl", "getWalletUiIntent");
        WalletUiIntentReq walletUiIntentReq = new WalletUiIntentReq();
        walletUiIntentReq.setType(i11);
        Checker.checkNonNull(walletUiIntentReq);
        return doWrite(new GetWalletUiIntentTaskApiCall(PayNaming.getwalletintent, JsonUtil.createJsonString(walletUiIntentReq), i11));
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<PayResult> internalPay(InternalPayRequest internalPayRequest) {
        HMSLog.i("PayClientImpl", "internalPay");
        Checker.checkNonNull(internalPayRequest);
        return doWrite(new PayTaskApiCall(PayNaming.internalPay, JsonUtil.createJsonString(internalPayRequest), internalPayRequest.signType));
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<PayResult> pay(PayReq payReq) {
        HMSLog.i("PayClientImpl", OpenConstants.API_NAME_PAY);
        Checker.checkNonNull(payReq);
        return doWrite(new PayTaskApiCall(PayNaming.pay, JsonUtil.createJsonString(payReq), HiAnalyticsClient.reportEntry(getContext(), PayNaming.pay, 61300300), payReq.signatureAlgorithm));
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<PayResult> productPay(ProductPayRequest productPayRequest) {
        HMSLog.i("PayClientImpl", "productPay");
        Checker.checkNonNull(productPayRequest);
        return doWrite(new PayTaskApiCall(PayNaming.pms, JsonUtil.createJsonString(productPayRequest), HiAnalyticsClient.reportEntry(getContext(), PayNaming.pms, 61300300), productPayRequest.signatureAlgorithm));
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<HwWalletInfoResult> queryWalletInfo(HwWalletInfoRequest hwWalletInfoRequest) {
        HMSLog.i("PayClientImpl", "queryWalletInfo");
        Checker.checkNonNull(hwWalletInfoRequest);
        return doWrite(new HwWalletInfoTaskApiCall(PayNaming.walletQuery, JsonUtil.createJsonString(hwWalletInfoRequest)));
    }

    public PayClientImpl(Context context) {
        super(context, f36337a, f36338b, new PayHmsClientBuilder(), 61300300);
    }
}
