package com.huawei.hms.iap.entity;

import android.text.TextUtils;
import androidx.collection.SieveCacheKt;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class InAppPurchaseData {
    public static final int NOT_PRESENT = Integer.MIN_VALUE;
    private int A;
    private long B;
    private int C;
    private String D;
    private int E;
    private int F;
    private int G;
    private long H;
    private boolean I;
    private int J;
    private int K;
    private String L;
    private int M;
    private String N;
    private String O;
    private int P;
    private String Q;
    private int R;
    private long S;
    private long T;
    private int U;
    private long V;

    /* renamed from: a, reason: collision with root package name */
    private String f35981a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35982b;

    /* renamed from: c, reason: collision with root package name */
    private String f35983c;

    /* renamed from: d, reason: collision with root package name */
    private String f35984d;

    /* renamed from: e, reason: collision with root package name */
    private String f35985e;

    /* renamed from: f, reason: collision with root package name */
    private String f35986f;

    /* renamed from: g, reason: collision with root package name */
    private long f35987g;

    /* renamed from: h, reason: collision with root package name */
    private int f35988h;

    /* renamed from: i, reason: collision with root package name */
    private String f35989i;

    /* renamed from: j, reason: collision with root package name */
    private String f35990j;

    /* renamed from: k, reason: collision with root package name */
    private int f35991k;

    /* renamed from: l, reason: collision with root package name */
    private String f35992l;

    /* renamed from: m, reason: collision with root package name */
    private long f35993m;

    /* renamed from: n, reason: collision with root package name */
    private String f35994n;

    /* renamed from: o, reason: collision with root package name */
    private String f35995o;

    /* renamed from: p, reason: collision with root package name */
    private String f35996p;

    /* renamed from: q, reason: collision with root package name */
    private long f35997q;

    /* renamed from: r, reason: collision with root package name */
    private String f35998r;

    /* renamed from: s, reason: collision with root package name */
    private int f35999s;

    /* renamed from: t, reason: collision with root package name */
    private long f36000t;

    /* renamed from: u, reason: collision with root package name */
    private long f36001u;

    /* renamed from: v, reason: collision with root package name */
    private long f36002v;

    /* renamed from: w, reason: collision with root package name */
    private long f36003w;

    /* renamed from: x, reason: collision with root package name */
    private int f36004x;

    /* renamed from: y, reason: collision with root package name */
    private int f36005y;

    /* renamed from: z, reason: collision with root package name */
    private int f36006z;

    public interface PurchaseState {
        public static final int CANCELED = 1;
        public static final int INITIALIZED = Integer.MIN_VALUE;
        public static final int PENDING = 3;
        public static final int PURCHASED = 0;
        public static final int REFUNDED = 2;
    }

    public InAppPurchaseData(String str) throws JSONException {
        JSONObject jSONObject = TextUtils.isEmpty(str) ? new JSONObject() : new JSONObject(str);
        this.f35981a = jSONObject.optString("applicationId");
        this.f35982b = jSONObject.optBoolean("autoRenewing");
        this.f35983c = jSONObject.optString("orderId");
        this.f35984d = jSONObject.optString(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, null);
        this.f35985e = jSONObject.optString("productId");
        this.f35986f = jSONObject.optString(HwPayConstant.KEY_PRODUCTNAME, null);
        this.f35987g = jSONObject.optLong("purchaseTime", SieveCacheKt.NodeMetaAndPreviousMask);
        this.f35988h = jSONObject.optInt("purchaseState");
        this.f35989i = jSONObject.optString("developerPayload", null);
        this.f35990j = jSONObject.optString("purchaseToken");
        this.f35991k = jSONObject.optInt("purchaseType", Integer.MIN_VALUE);
        this.f35992l = jSONObject.optString(HwPayConstant.KEY_CURRENCY);
        this.f35993m = jSONObject.optLong("price");
        this.f35994n = jSONObject.optString(HwPayConstant.KEY_COUNTRY);
        this.f35995o = jSONObject.optString("lastOrderId", null);
        this.f35996p = jSONObject.optString("productGroup", null);
        this.f35997q = jSONObject.optLong("oriPurchaseTime", SieveCacheKt.NodeMetaAndPreviousMask);
        this.f35998r = jSONObject.optString("subscriptionId", null);
        this.f35999s = jSONObject.optInt("quantity", Integer.MIN_VALUE);
        this.f36000t = jSONObject.optLong("daysLasted", SieveCacheKt.NodeMetaAndPreviousMask);
        this.f36001u = jSONObject.optLong("numOfPeriods", SieveCacheKt.NodeMetaAndPreviousMask);
        this.f36002v = jSONObject.optLong("numOfDiscount", SieveCacheKt.NodeMetaAndPreviousMask);
        this.f36003w = jSONObject.optLong("expirationDate", SieveCacheKt.NodeMetaAndPreviousMask);
        this.f36004x = jSONObject.optInt("expirationIntent", Integer.MIN_VALUE);
        this.f36005y = jSONObject.optInt("retryFlag", Integer.MIN_VALUE);
        this.f36006z = jSONObject.optInt("introductoryFlag", Integer.MIN_VALUE);
        this.A = jSONObject.optInt("trialFlag", Integer.MIN_VALUE);
        this.B = jSONObject.optLong("cancelTime", SieveCacheKt.NodeMetaAndPreviousMask);
        this.C = jSONObject.optInt("cancelReason", Integer.MIN_VALUE);
        this.D = jSONObject.optString("appInfo", null);
        this.E = jSONObject.optInt("notifyClosed", Integer.MIN_VALUE);
        this.F = jSONObject.optInt("renewStatus", Integer.MIN_VALUE);
        this.G = jSONObject.optInt("priceConsentStatus", Integer.MIN_VALUE);
        this.H = jSONObject.optLong("renewPrice", SieveCacheKt.NodeMetaAndPreviousMask);
        this.I = jSONObject.optBoolean("subIsvalid", false);
        this.J = jSONObject.optInt("cancelledSubKeepDays", Integer.MIN_VALUE);
        this.K = jSONObject.optInt("kind", Integer.MIN_VALUE);
        this.L = jSONObject.optString("developerChallenge", null);
        this.M = jSONObject.optInt("consumptionState", Integer.MIN_VALUE);
        this.N = jSONObject.optString("payOrderId", null);
        this.O = jSONObject.optString("payType", null);
        this.P = jSONObject.optInt("deferFlag", Integer.MIN_VALUE);
        this.Q = jSONObject.optString("oriSubscriptionId", null);
        this.R = jSONObject.optInt("cancelWay", Integer.MIN_VALUE);
        this.S = jSONObject.optLong("cancellationTime", SieveCacheKt.NodeMetaAndPreviousMask);
        this.T = jSONObject.optLong("resumeTime", SieveCacheKt.NodeMetaAndPreviousMask);
        this.V = jSONObject.optLong("graceExpirationTime", SieveCacheKt.NodeMetaAndPreviousMask);
        this.U = jSONObject.optInt(com.huawei.hms.support.feature.result.CommonConstant.KEY_ACCOUNT_FLAG, Integer.MIN_VALUE);
    }

    public int getAccountFlag() {
        return this.U;
    }

    public String getAppInfo() {
        return this.D;
    }

    public String getApplicationId() {
        return this.f35981a;
    }

    public int getCancelReason() {
        return this.C;
    }

    public long getCancelTime() {
        return this.B;
    }

    public int getCancelWay() {
        return this.R;
    }

    public long getCancellationTime() {
        return this.S;
    }

    public int getCancelledSubKeepDays() {
        return this.J;
    }

    public int getConsumptionState() {
        return this.M;
    }

    public String getCountry() {
        return this.f35994n;
    }

    public String getCurrency() {
        return this.f35992l;
    }

    public long getDaysLasted() {
        return this.f36000t;
    }

    public int getDeferFlag() {
        return this.P;
    }

    public String getDeveloperChallenge() {
        return this.L;
    }

    public String getDeveloperPayload() {
        return this.f35989i;
    }

    public long getExpirationDate() {
        return this.f36003w;
    }

    public int getExpirationIntent() {
        return this.f36004x;
    }

    public long getGraceExpirationTime() {
        return this.V;
    }

    public int getIntroductoryFlag() {
        return this.f36006z;
    }

    public int getKind() {
        return this.K;
    }

    public String getLastOrderId() {
        return this.f35995o;
    }

    public int getNotifyClosed() {
        return this.E;
    }

    public long getNumOfDiscount() {
        return this.f36002v;
    }

    public long getNumOfPeriods() {
        return this.f36001u;
    }

    public String getOrderID() {
        return this.f35983c;
    }

    public long getOriPurchaseTime() {
        return this.f35997q;
    }

    public String getOriSubscriptionId() {
        return this.Q;
    }

    public String getPackageName() {
        return this.f35984d;
    }

    public String getPayOrderId() {
        return this.N;
    }

    public String getPayType() {
        return this.O;
    }

    public long getPrice() {
        return this.f35993m;
    }

    public int getPriceConsentStatus() {
        return this.G;
    }

    public String getProductGroup() {
        return this.f35996p;
    }

    public String getProductId() {
        return this.f35985e;
    }

    public String getProductName() {
        return this.f35986f;
    }

    public int getPurchaseState() {
        return this.f35988h;
    }

    public long getPurchaseTime() {
        return this.f35987g;
    }

    public String getPurchaseToken() {
        return this.f35990j;
    }

    public int getPurchaseType() {
        return this.f35991k;
    }

    public int getQuantity() {
        return this.f35999s;
    }

    public long getRenewPrice() {
        return this.H;
    }

    public int getRenewStatus() {
        return this.F;
    }

    public long getResumeTime() {
        return this.T;
    }

    public int getRetryFlag() {
        return this.f36005y;
    }

    public String getSubscriptionId() {
        return this.f35998r;
    }

    public int getTrialFlag() {
        return this.A;
    }

    public boolean isAutoRenewing() {
        return this.f35982b;
    }

    public boolean isSubValid() {
        return this.I;
    }
}
