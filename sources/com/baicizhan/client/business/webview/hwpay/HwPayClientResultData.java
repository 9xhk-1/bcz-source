package com.baicizhan.client.business.webview.hwpay;

import androidx.compose.runtime.internal.StabilityInferred;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class HwPayClientResultData {
    public static final int $stable = 0;

    @wo.c("applicationId")
    private final int applicationId;

    @k
    @wo.c("applicationIdString")
    private final String applicationIdString;

    @wo.c("autoRenewing")
    private final boolean autoRenewing;

    @wo.c("confirmed")
    private final int confirmed;

    @wo.c("consumptionState")
    private final int consumptionState;

    @k
    @wo.c(HwPayConstant.KEY_COUNTRY)
    private final String country;

    @k
    @wo.c(HwPayConstant.KEY_CURRENCY)
    private final String currency;

    @k
    @wo.c("developerPayload")
    private final String developerPayload;

    @wo.c("kind")
    private final int kind;

    @k
    @wo.c("orderId")
    private final String orderId;

    @k
    @wo.c(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME)
    private final String packageName;

    @k
    @wo.c("payOrderId")
    private final String payOrderId;

    @k
    @wo.c("payType")
    private final String payType;

    @wo.c("price")
    private final int price;

    @k
    @wo.c("productId")
    private final String productId;

    @k
    @wo.c(HwPayConstant.KEY_PRODUCTNAME)
    private final String productName;

    @wo.c("purchaseState")
    private final int purchaseState;

    @wo.c("purchaseTime")
    private final long purchaseTime;

    @wo.c("purchaseTimeMillis")
    private final long purchaseTimeMillis;

    @k
    @wo.c("purchaseToken")
    private final String purchaseToken;

    @k
    @wo.c(HwPayConstant.KEY_SDKCHANNEL)
    private final String sdkChannel;

    public HwPayClientResultData(int i11, @k String applicationIdString, boolean z11, int i12, int i13, @k String country, @k String currency, @k String developerPayload, int i14, @k String orderId, @k String packageName, @k String payOrderId, @k String payType, int i15, @k String productId, @k String productName, int i16, long j11, long j12, @k String purchaseToken, @k String sdkChannel) {
        g0.p(applicationIdString, "applicationIdString");
        g0.p(country, "country");
        g0.p(currency, "currency");
        g0.p(developerPayload, "developerPayload");
        g0.p(orderId, "orderId");
        g0.p(packageName, "packageName");
        g0.p(payOrderId, "payOrderId");
        g0.p(payType, "payType");
        g0.p(productId, "productId");
        g0.p(productName, "productName");
        g0.p(purchaseToken, "purchaseToken");
        g0.p(sdkChannel, "sdkChannel");
        this.applicationId = i11;
        this.applicationIdString = applicationIdString;
        this.autoRenewing = z11;
        this.confirmed = i12;
        this.consumptionState = i13;
        this.country = country;
        this.currency = currency;
        this.developerPayload = developerPayload;
        this.kind = i14;
        this.orderId = orderId;
        this.packageName = packageName;
        this.payOrderId = payOrderId;
        this.payType = payType;
        this.price = i15;
        this.productId = productId;
        this.productName = productName;
        this.purchaseState = i16;
        this.purchaseTime = j11;
        this.purchaseTimeMillis = j12;
        this.purchaseToken = purchaseToken;
        this.sdkChannel = sdkChannel;
    }

    public static /* synthetic */ HwPayClientResultData copy$default(HwPayClientResultData hwPayClientResultData, int i11, String str, boolean z11, int i12, int i13, String str2, String str3, String str4, int i14, String str5, String str6, String str7, String str8, int i15, String str9, String str10, int i16, long j11, long j12, String str11, String str12, int i17, Object obj) {
        int i18 = (i17 & 1) != 0 ? hwPayClientResultData.applicationId : i11;
        return hwPayClientResultData.copy(i18, (i17 & 2) != 0 ? hwPayClientResultData.applicationIdString : str, (i17 & 4) != 0 ? hwPayClientResultData.autoRenewing : z11, (i17 & 8) != 0 ? hwPayClientResultData.confirmed : i12, (i17 & 16) != 0 ? hwPayClientResultData.consumptionState : i13, (i17 & 32) != 0 ? hwPayClientResultData.country : str2, (i17 & 64) != 0 ? hwPayClientResultData.currency : str3, (i17 & 128) != 0 ? hwPayClientResultData.developerPayload : str4, (i17 & 256) != 0 ? hwPayClientResultData.kind : i14, (i17 & 512) != 0 ? hwPayClientResultData.orderId : str5, (i17 & 1024) != 0 ? hwPayClientResultData.packageName : str6, (i17 & 2048) != 0 ? hwPayClientResultData.payOrderId : str7, (i17 & 4096) != 0 ? hwPayClientResultData.payType : str8, (i17 & 8192) != 0 ? hwPayClientResultData.price : i15, (i17 & 16384) != 0 ? hwPayClientResultData.productId : str9, (i17 & 32768) != 0 ? hwPayClientResultData.productName : str10, (i17 & 65536) != 0 ? hwPayClientResultData.purchaseState : i16, (i17 & 131072) != 0 ? hwPayClientResultData.purchaseTime : j11, (i17 & 262144) != 0 ? hwPayClientResultData.purchaseTimeMillis : j12, (i17 & 524288) != 0 ? hwPayClientResultData.purchaseToken : str11, (i17 & 1048576) != 0 ? hwPayClientResultData.sdkChannel : str12);
    }

    public final int component1() {
        return this.applicationId;
    }

    @k
    public final String component10() {
        return this.orderId;
    }

    @k
    public final String component11() {
        return this.packageName;
    }

    @k
    public final String component12() {
        return this.payOrderId;
    }

    @k
    public final String component13() {
        return this.payType;
    }

    public final int component14() {
        return this.price;
    }

    @k
    public final String component15() {
        return this.productId;
    }

    @k
    public final String component16() {
        return this.productName;
    }

    public final int component17() {
        return this.purchaseState;
    }

    public final long component18() {
        return this.purchaseTime;
    }

    public final long component19() {
        return this.purchaseTimeMillis;
    }

    @k
    public final String component2() {
        return this.applicationIdString;
    }

    @k
    public final String component20() {
        return this.purchaseToken;
    }

    @k
    public final String component21() {
        return this.sdkChannel;
    }

    public final boolean component3() {
        return this.autoRenewing;
    }

    public final int component4() {
        return this.confirmed;
    }

    public final int component5() {
        return this.consumptionState;
    }

    @k
    public final String component6() {
        return this.country;
    }

    @k
    public final String component7() {
        return this.currency;
    }

    @k
    public final String component8() {
        return this.developerPayload;
    }

    public final int component9() {
        return this.kind;
    }

    @k
    public final HwPayClientResultData copy(int i11, @k String applicationIdString, boolean z11, int i12, int i13, @k String country, @k String currency, @k String developerPayload, int i14, @k String orderId, @k String packageName, @k String payOrderId, @k String payType, int i15, @k String productId, @k String productName, int i16, long j11, long j12, @k String purchaseToken, @k String sdkChannel) {
        g0.p(applicationIdString, "applicationIdString");
        g0.p(country, "country");
        g0.p(currency, "currency");
        g0.p(developerPayload, "developerPayload");
        g0.p(orderId, "orderId");
        g0.p(packageName, "packageName");
        g0.p(payOrderId, "payOrderId");
        g0.p(payType, "payType");
        g0.p(productId, "productId");
        g0.p(productName, "productName");
        g0.p(purchaseToken, "purchaseToken");
        g0.p(sdkChannel, "sdkChannel");
        return new HwPayClientResultData(i11, applicationIdString, z11, i12, i13, country, currency, developerPayload, i14, orderId, packageName, payOrderId, payType, i15, productId, productName, i16, j11, j12, purchaseToken, sdkChannel);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HwPayClientResultData)) {
            return false;
        }
        HwPayClientResultData hwPayClientResultData = (HwPayClientResultData) obj;
        return this.applicationId == hwPayClientResultData.applicationId && g0.g(this.applicationIdString, hwPayClientResultData.applicationIdString) && this.autoRenewing == hwPayClientResultData.autoRenewing && this.confirmed == hwPayClientResultData.confirmed && this.consumptionState == hwPayClientResultData.consumptionState && g0.g(this.country, hwPayClientResultData.country) && g0.g(this.currency, hwPayClientResultData.currency) && g0.g(this.developerPayload, hwPayClientResultData.developerPayload) && this.kind == hwPayClientResultData.kind && g0.g(this.orderId, hwPayClientResultData.orderId) && g0.g(this.packageName, hwPayClientResultData.packageName) && g0.g(this.payOrderId, hwPayClientResultData.payOrderId) && g0.g(this.payType, hwPayClientResultData.payType) && this.price == hwPayClientResultData.price && g0.g(this.productId, hwPayClientResultData.productId) && g0.g(this.productName, hwPayClientResultData.productName) && this.purchaseState == hwPayClientResultData.purchaseState && this.purchaseTime == hwPayClientResultData.purchaseTime && this.purchaseTimeMillis == hwPayClientResultData.purchaseTimeMillis && g0.g(this.purchaseToken, hwPayClientResultData.purchaseToken) && g0.g(this.sdkChannel, hwPayClientResultData.sdkChannel);
    }

    public final int getApplicationId() {
        return this.applicationId;
    }

    @k
    public final String getApplicationIdString() {
        return this.applicationIdString;
    }

    public final boolean getAutoRenewing() {
        return this.autoRenewing;
    }

    public final int getConfirmed() {
        return this.confirmed;
    }

    public final int getConsumptionState() {
        return this.consumptionState;
    }

    @k
    public final String getCountry() {
        return this.country;
    }

    @k
    public final String getCurrency() {
        return this.currency;
    }

    @k
    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    public final int getKind() {
        return this.kind;
    }

    @k
    public final String getOrderId() {
        return this.orderId;
    }

    @k
    public final String getPackageName() {
        return this.packageName;
    }

    @k
    public final String getPayOrderId() {
        return this.payOrderId;
    }

    @k
    public final String getPayType() {
        return this.payType;
    }

    public final int getPrice() {
        return this.price;
    }

    @k
    public final String getProductId() {
        return this.productId;
    }

    @k
    public final String getProductName() {
        return this.productName;
    }

    public final int getPurchaseState() {
        return this.purchaseState;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final long getPurchaseTimeMillis() {
        return this.purchaseTimeMillis;
    }

    @k
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @k
    public final String getSdkChannel() {
        return this.sdkChannel;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.applicationId) * 31) + this.applicationIdString.hashCode()) * 31) + Boolean.hashCode(this.autoRenewing)) * 31) + Integer.hashCode(this.confirmed)) * 31) + Integer.hashCode(this.consumptionState)) * 31) + this.country.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.developerPayload.hashCode()) * 31) + Integer.hashCode(this.kind)) * 31) + this.orderId.hashCode()) * 31) + this.packageName.hashCode()) * 31) + this.payOrderId.hashCode()) * 31) + this.payType.hashCode()) * 31) + Integer.hashCode(this.price)) * 31) + this.productId.hashCode()) * 31) + this.productName.hashCode()) * 31) + Integer.hashCode(this.purchaseState)) * 31) + Long.hashCode(this.purchaseTime)) * 31) + Long.hashCode(this.purchaseTimeMillis)) * 31) + this.purchaseToken.hashCode()) * 31) + this.sdkChannel.hashCode();
    }

    @k
    public String toString() {
        return "HwPayClientResultData(applicationId=" + this.applicationId + ", applicationIdString=" + this.applicationIdString + ", autoRenewing=" + this.autoRenewing + ", confirmed=" + this.confirmed + ", consumptionState=" + this.consumptionState + ", country=" + this.country + ", currency=" + this.currency + ", developerPayload=" + this.developerPayload + ", kind=" + this.kind + ", orderId=" + this.orderId + ", packageName=" + this.packageName + ", payOrderId=" + this.payOrderId + ", payType=" + this.payType + ", price=" + this.price + ", productId=" + this.productId + ", productName=" + this.productName + ", purchaseState=" + this.purchaseState + ", purchaseTime=" + this.purchaseTime + ", purchaseTimeMillis=" + this.purchaseTimeMillis + ", purchaseToken=" + this.purchaseToken + ", sdkChannel=" + this.sdkChannel + j.f81007d;
    }
}
