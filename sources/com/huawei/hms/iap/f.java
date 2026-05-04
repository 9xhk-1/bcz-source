package com.huawei.hms.iap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.iap.entity.ConsumeOwnedPurchaseReq;
import com.huawei.hms.iap.entity.ConsumeOwnedPurchaseResult;
import com.huawei.hms.iap.entity.IsEnvReadyReq;
import com.huawei.hms.iap.entity.IsEnvReadyResult;
import com.huawei.hms.iap.entity.IsSandboxActivatedReq;
import com.huawei.hms.iap.entity.IsSandboxActivatedResult;
import com.huawei.hms.iap.entity.OwnedPurchasesReq;
import com.huawei.hms.iap.entity.OwnedPurchasesResult;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.ProductInfoResult;
import com.huawei.hms.iap.entity.PurchaseIntentReq;
import com.huawei.hms.iap.entity.PurchaseIntentResult;
import com.huawei.hms.iap.entity.PurchaseIntentWithPriceReq;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import com.huawei.hms.iap.entity.RedeemCodeResultInfo;
import com.huawei.hms.iap.entity.ScanRedeemCodeResult;
import com.huawei.hms.iap.entity.StartIapActivityReq;
import com.huawei.hms.iap.entity.StartIapActivityResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class f extends HuaweiApi<i> implements IapClient {

    /* renamed from: a, reason: collision with root package name */
    private static final Api<i> f36014a = new Api<>(HuaweiApiAvailability.HMS_API_NAME_IAP);

    /* renamed from: b, reason: collision with root package name */
    private static i f36015b = new i();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f36016c;

    /* renamed from: d, reason: collision with root package name */
    private String f36017d;

    public f(Activity activity) {
        super(activity, f36014a, f36015b, (AbstractClientBuilder) new h(), 61300300);
    }

    private void a(boolean z11, String str) {
        String a11 = com.huawei.hms.iap.util.b.a(this.f36017d, "productAppId", str);
        this.f36017d = a11;
        this.f36017d = com.huawei.hms.iap.util.b.a(a11, "isConsignment", Boolean.valueOf(z11));
        setApiLevel(10);
    }

    private String b(String str) {
        try {
            return new JSONObject(str).optString("transactionId", "");
        } catch (JSONException e11) {
            HMSLog.e("IapClientImpl", "getTransactionId  exception :" + e11.getMessage());
            return "";
        }
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<ConsumeOwnedPurchaseResult> consumeOwnedPurchase(ConsumeOwnedPurchaseReq consumeOwnedPurchaseReq) {
        HMSLog.i("IapClientImpl", "consumeOwnedPurchase");
        Checker.checkNonNull(consumeOwnedPurchaseReq);
        return doWrite(new c("iap.consumePurchase", consumeOwnedPurchaseReq, this.f36017d, HiAnalyticsClient.reportEntry(getContext(), "iap.consumePurchase", 61300300)));
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<PurchaseIntentResult> createPurchaseIntent(PurchaseIntentReq purchaseIntentReq) {
        String reportEntry;
        HiAnalyticsUtil hiAnalyticsUtil;
        Context context;
        String b11;
        String str;
        HMSLog.i("IapClientImpl", "createPurchaseIntent");
        Checker.checkNonNull(purchaseIntentReq);
        if (purchaseIntentReq.getPriceType() == 2) {
            reportEntry = HiAnalyticsClient.reportEntry(getContext(), "iap.buy", 61300300);
            hiAnalyticsUtil = HiAnalyticsUtil.getInstance();
            context = getContext();
            b11 = b(JsonUtil.createJsonString(purchaseIntentReq));
            str = HiAnalyticsConstant.KeyAndValue.START_SUB;
        } else {
            reportEntry = HiAnalyticsClient.reportEntry(getContext(), "iap.buy", 61300300);
            hiAnalyticsUtil = HiAnalyticsUtil.getInstance();
            context = getContext();
            b11 = b(JsonUtil.createJsonString(purchaseIntentReq));
            str = HiAnalyticsConstant.KeyAndValue.START_BUY;
        }
        hiAnalyticsUtil.onEvent(context, str, b11);
        String a11 = com.huawei.hms.iap.util.b.a(this.f36017d, "enablePendingPurchases", Boolean.valueOf(f36016c));
        this.f36017d = a11;
        return doWrite(new n("iap.buy", purchaseIntentReq, a11, reportEntry));
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<PurchaseIntentResult> createPurchaseIntentWithPrice(PurchaseIntentWithPriceReq purchaseIntentWithPriceReq) {
        HMSLog.i("IapClientImpl", "createPurchaseIntentWithPrice");
        Checker.checkNonNull(purchaseIntentWithPriceReq);
        if (!a(purchaseIntentWithPriceReq.getReservedInfor())) {
            fr.l lVar = new fr.l();
            lVar.c(new IapApiException(new Status(60001, "reservedInfor must be a JSON string")));
            return lVar.b();
        }
        HiAnalyticsUtil.getInstance().onEvent(getContext(), HiAnalyticsConstant.KeyAndValue.START_BUYWITHPRICE, b(JsonUtil.createJsonString(purchaseIntentWithPriceReq)));
        String reportEntry = HiAnalyticsClient.reportEntry(getContext(), "iap.buyWithPrice", 61300300);
        String a11 = com.huawei.hms.iap.util.b.a(this.f36017d, "enablePendingPurchases", Boolean.valueOf(f36016c));
        this.f36017d = a11;
        return doWrite(new o("iap.buyWithPrice", purchaseIntentWithPriceReq, a11, reportEntry));
    }

    @Override // com.huawei.hms.iap.IapClient
    public void enablePendingPurchase() {
        HMSLog.i("IapClientImpl", "enablePendingPurchase");
        f36016c = true;
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<IsEnvReadyResult> isEnvReady() {
        return isEnvReady(false);
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<IsSandboxActivatedResult> isSandboxActivated(IsSandboxActivatedReq isSandboxActivatedReq) {
        Checker.checkNonNull(isSandboxActivatedReq);
        return doWrite(new k("iap.isSandboxActivated", JsonUtil.createJsonString(isSandboxActivatedReq), this.f36017d, HiAnalyticsClient.reportEntry(getContext(), "iap.isSandboxActivated", 61300300)));
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<OwnedPurchasesResult> obtainOwnedPurchaseRecord(OwnedPurchasesReq ownedPurchasesReq) {
        HMSLog.i("IapClientImpl", "obtainOwnedPurchaseRecord");
        Checker.checkNonNull(ownedPurchasesReq);
        return doWrite(new l("iap.getPurchaseHistory", ownedPurchasesReq, this.f36017d, HiAnalyticsClient.reportEntry(getContext(), "iap.getPurchaseHistory", 61300300)));
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<OwnedPurchasesResult> obtainOwnedPurchases(OwnedPurchasesReq ownedPurchasesReq) {
        HMSLog.i("IapClientImpl", "obtainOwnedPurchases");
        Checker.checkNonNull(ownedPurchasesReq);
        return doWrite(new l("iap.getPurchase", ownedPurchasesReq, this.f36017d, HiAnalyticsClient.reportEntry(getContext(), "iap.getPurchase", 61300300)));
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<ProductInfoResult> obtainProductInfo(ProductInfoReq productInfoReq) {
        HMSLog.i("IapClientImpl", "obtainProductInfo");
        Checker.checkNonNull(productInfoReq);
        return doWrite(new m("iap.getSkuDetails", JsonUtil.createJsonString(productInfoReq), this.f36017d, HiAnalyticsClient.reportEntry(getContext(), "iap.getSkuDetails", 61300300)));
    }

    @Override // com.huawei.hms.iap.IapClient
    public PurchaseResultInfo parsePurchaseResultInfoFromIntent(Intent intent) {
        HMSLog.i("IapClientImpl", "parsePurchaseResultInfoFromIntent");
        if (intent == null) {
            intent = new Intent();
        }
        PurchaseResultInfo purchaseResultInfo = new PurchaseResultInfo();
        purchaseResultInfo.setReturnCode(com.huawei.hms.iap.util.c.a(intent, "returnCode", 1));
        purchaseResultInfo.setErrMsg(com.huawei.hms.iap.util.c.a(intent, "errMsg"));
        purchaseResultInfo.setInAppPurchaseData(com.huawei.hms.iap.util.c.a(intent, "inAppPurchaseData"));
        purchaseResultInfo.setInAppDataSignature(com.huawei.hms.iap.util.c.a(intent, "Signature"));
        purchaseResultInfo.setSignatureAlgorithm(com.huawei.hms.iap.util.c.a(intent, "signatureAlgorithm"));
        HMSLog.i("IapClientImpl", "getBuyResultInfoFromIntent:" + purchaseResultInfo.getReturnCode());
        return purchaseResultInfo;
    }

    @Override // com.huawei.hms.iap.IapClient
    public RedeemCodeResultInfo parseRedeemCodeResultInfoFromIntent(Intent intent) {
        HMSLog.i("IapClientImpl", "parseRedeemCodeResultInfoFromIntent");
        if (intent == null) {
            intent = new Intent();
        }
        RedeemCodeResultInfo redeemCodeResultInfo = new RedeemCodeResultInfo();
        redeemCodeResultInfo.setRedeemCode(com.huawei.hms.iap.util.c.a(intent, "redeemCode"));
        redeemCodeResultInfo.setReturnCode(com.huawei.hms.iap.util.c.a(intent, "returnCode", 1));
        HMSLog.i("IapClientImpl", "parseRedeemCodeResultInfoFromIntent:" + redeemCodeResultInfo.getReturnCode());
        return redeemCodeResultInfo;
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<ScanRedeemCodeResult> scanRedeemCode() {
        return doWrite(new q("iap.scanRedeemCode", HiAnalyticsClient.reportEntry(getContext(), "iap.scanRedeemCode", 61300300)));
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<StartIapActivityResult> startIapActivity(StartIapActivityReq startIapActivityReq) {
        Checker.checkNonNull(startIapActivityReq);
        return doWrite(new r("iap.startActivity", startIapActivityReq, this.f36017d, HiAnalyticsClient.reportEntry(getContext(), "iap.startActivity", 61300300)));
    }

    public f(Activity activity, String str) {
        super(activity, f36014a, f36015b, (AbstractClientBuilder) new p(), 61300300, str);
        setApiLevel(3);
    }

    private boolean a(String str) {
        if (str == null) {
            return true;
        }
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<IsEnvReadyResult> isEnvReady(IsEnvReadyReq isEnvReadyReq) {
        throw new UnsupportedOperationException("isEnvReady");
    }

    public f(Activity activity, String str, boolean z11) {
        super(activity, f36014a, f36015b, (AbstractClientBuilder) new h(), 61300300);
        a(z11, str);
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<IsEnvReadyResult> isEnvReady(boolean z11) {
        return doWrite(new j("iap.isBillingSupported", HiAnalyticsClient.reportEntry(getContext(), "iap.isBillingSupported", 61300300), z11));
    }

    public f(Context context) {
        super(context, f36014a, f36015b, new h(), 61300300);
    }

    public f(Context context, String str) {
        super(context, f36014a, f36015b, new p(), 61300300, str);
        setApiLevel(3);
    }

    public f(Context context, String str, boolean z11) {
        super(context, f36014a, f36015b, new h(), 61300300);
        a(z11, str);
    }
}
