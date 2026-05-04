package com.huawei.hms.support.api.paytask;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.iap.util.a;
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
import com.huawei.hms.support.api.paytask.fullsdk.FailureTask;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import fr.k;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class PayClientEntryImpl implements PayClient {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f36333a;

    /* renamed from: b, reason: collision with root package name */
    private PayClientImpl f36334b;

    /* renamed from: c, reason: collision with root package name */
    private PayClientFullImpl f36335c;

    public PayClientEntryImpl(Activity activity) {
        this.f36333a = new WeakReference<>(activity);
    }

    private PayClientImpl a() {
        if (this.f36334b == null) {
            Context context = this.f36333a.get();
            if (context == null) {
                HMSLog.e("PayClientImpl", "getPayClientImpl context is null.");
                return null;
            }
            this.f36334b = context instanceof Activity ? new PayClientImpl((Activity) context) : new PayClientImpl(context);
        }
        return this.f36334b;
    }

    private PayClientFullImpl b() {
        if (this.f36335c == null) {
            Context context = this.f36333a.get();
            if (context == null) {
                HMSLog.e("PayClientImpl", "getPayClientFullImpl context is null.");
                return null;
            }
            this.f36335c = new PayClientFullImpl(context);
        }
        return this.f36335c;
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<PayResult> addWithholdingPlan(WithholdRequest withholdRequest) {
        Checker.checkNonNull(withholdRequest);
        Context context = this.f36333a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (a.a(context, withholdRequest.reservedInfor, withholdRequest.country, withholdRequest.currency, "Withhold")) {
            HMSLog.i("PayClientImpl", "withhold with Full SDK branch.");
            PayClientFullImpl b11 = b();
            return b11 != null ? b11.addWithholdingPlan(withholdRequest) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "withhold with IAP SDK branch.");
        PayClientImpl a11 = a();
        return a11 != null ? a11.addWithholdingPlan(withholdRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<OrderResult> getOrderDetail(OrderRequest orderRequest) {
        Checker.checkNonNull(orderRequest);
        Context context = this.f36333a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (!a.a(context, orderRequest.reservedInfor, "GetOrderDetail")) {
            PayClientImpl a11 = a();
            return a11 != null ? a11.getOrderDetail(orderRequest) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "getOrderDetail with Full SDK branch.");
        PayClientFullImpl b11 = b();
        return b11 != null ? b11.getOrderDetail(orderRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public PayResultInfo getPayResultInfoFromIntent(Intent intent) {
        Checker.checkNonNull(intent);
        PayClientImpl a11 = a();
        if (a11 != null) {
            return a11.getPayResultInfoFromIntent(intent);
        }
        return null;
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<ProductDetailResult> getProductDetails(ProductDetailRequest productDetailRequest) {
        Checker.checkNonNull(productDetailRequest);
        Context context = this.f36333a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (!a.a(context, productDetailRequest.reservedInfor, "Productdetail")) {
            PayClientImpl a11 = a();
            return a11 != null ? a11.getProductDetails(productDetailRequest) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "getProductDetails with Full SDK branch.");
        PayClientFullImpl b11 = b();
        return b11 != null ? b11.getProductDetails(productDetailRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public ProductPayResultInfo getProductPayResultFromIntent(Intent intent) {
        Checker.checkNonNull(intent);
        PayClientImpl a11 = a();
        if (a11 != null) {
            return a11.getProductPayResultFromIntent(intent);
        }
        return null;
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<PurchaseInfoResult> getPurchaseInfo(PurchaseInfoRequest purchaseInfoRequest) {
        Checker.checkNonNull(purchaseInfoRequest);
        Context context = this.f36333a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (!a.a(context, purchaseInfoRequest.reservedInfor, "Purchaseinfo")) {
            PayClientImpl a11 = a();
            return a11 != null ? a11.getPurchaseInfo(purchaseInfoRequest) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "getProductDetails with Full SDK branch.");
        PayClientFullImpl b11 = b();
        return b11 != null ? b11.getPurchaseInfo(purchaseInfoRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<GetWalletUiIntentResult> getWalletUiIntent(int i11) {
        PayClientImpl a11 = a();
        return a11 != null ? a11.getWalletUiIntent(i11) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<PayResult> internalPay(InternalPayRequest internalPayRequest) {
        Checker.checkNonNull(internalPayRequest);
        PayClientImpl a11 = a();
        return a11 != null ? a11.internalPay(internalPayRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<PayResult> pay(PayReq payReq) {
        Checker.checkNonNull(payReq);
        Context context = this.f36333a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (a.a(context, payReq.reservedInfor, payReq.country, payReq.currency, "Pay")) {
            HMSLog.i("PayClientImpl", "pay with Full SDK branch.");
            PayClientFullImpl b11 = b();
            return b11 != null ? b11.pay(payReq) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "pay with IAP SDK branch.");
        PayClientImpl a11 = a();
        return a11 != null ? a11.pay(payReq) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<PayResult> productPay(ProductPayRequest productPayRequest) {
        Checker.checkNonNull(productPayRequest);
        Context context = this.f36333a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (!a.a(context, productPayRequest.reservedInfor, "ProductPay")) {
            PayClientImpl a11 = a();
            return a11 != null ? a11.productPay(productPayRequest) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "productPay with Full SDK branch.");
        PayClientFullImpl b11 = b();
        return b11 != null ? b11.productPay(productPayRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public k<HwWalletInfoResult> queryWalletInfo(HwWalletInfoRequest hwWalletInfoRequest) {
        Checker.checkNonNull(hwWalletInfoRequest);
        PayClientImpl a11 = a();
        return a11 != null ? a11.queryWalletInfo(hwWalletInfoRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public void setSubAppId(String str) {
        PayClientImpl a11 = a();
        if (a11 == null) {
            HMSLog.e("PayClientImpl", "setSubAppId payClient is null");
            return;
        }
        try {
            a11.setSubAppId(str);
        } catch (ApiException unused) {
            HMSLog.d("PayClientImpl", "setSubAppId fail");
        }
    }

    public PayClientEntryImpl(Context context) {
        this.f36333a = new WeakReference<>(context);
    }
}
