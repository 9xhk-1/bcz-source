package com.huawei.hms.iap;

import android.text.TextUtils;
import com.huawei.hms.iap.entity.PurchaseIntentWithPriceReq;
import com.huawei.hms.jos.JosConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* loaded from: classes7.dex */
public class o extends b {

    /* renamed from: a, reason: collision with root package name */
    private PurchaseIntentWithPriceReq f36020a;

    public o(String str, PurchaseIntentWithPriceReq purchaseIntentWithPriceReq, String str2, String str3) {
        super(str, JsonUtil.createJsonString(purchaseIntentWithPriceReq), str2, str3);
        this.f36020a = purchaseIntentWithPriceReq;
        b();
    }

    private void b() {
        if (a(this.f36020a.getReservedInfor())) {
            a(11);
        } else if (c()) {
            a(4);
        } else if (d()) {
            a(4);
        }
    }

    private boolean c() {
        PurchaseIntentWithPriceReq purchaseIntentWithPriceReq = this.f36020a;
        if (purchaseIntentWithPriceReq == null || TextUtils.isEmpty(purchaseIntentWithPriceReq.getSignatureAlgorithm())) {
            return false;
        }
        HMSLog.i("PurchaseIntentWithPriceTaskApiCall", "Use the SHA256WithRSA/PSS algorithm.");
        return true;
    }

    private boolean d() {
        PurchaseIntentWithPriceReq purchaseIntentWithPriceReq = this.f36020a;
        if (purchaseIntentWithPriceReq == null || TextUtils.isEmpty(purchaseIntentWithPriceReq.getReservedInfor())) {
            return false;
        }
        HMSLog.i("PurchaseIntentWithPriceTaskApiCall", "reservedInfor is not empty");
        return true;
    }

    @Override // com.huawei.hms.iap.a
    public int a() {
        return a(this.f36020a.getReservedInfor()) ? JosConstant.APP_HMS_VERSION_6_10_0 : (c() || d()) ? 50300000 : 40002000;
    }
}
