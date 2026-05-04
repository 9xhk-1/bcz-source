package com.huawei.hms.iap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
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
import com.huawei.hms.iap.task.IapFailureTask;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class d implements IapClient {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f35973a;

    /* renamed from: b, reason: collision with root package name */
    private String f35974b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35975c;

    /* renamed from: d, reason: collision with root package name */
    private String f35976d;

    /* renamed from: e, reason: collision with root package name */
    private f f35977e;

    /* renamed from: f, reason: collision with root package name */
    private e f35978f;

    public d(Activity activity) {
        this.f35973a = new WeakReference<>(activity);
    }

    private f a() {
        f fVar;
        f fVar2 = this.f35977e;
        if (fVar2 != null) {
            return fVar2;
        }
        Context context = this.f35973a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "getIapClientImpl context is null.");
            return null;
        }
        String b11 = b();
        b11.getClass();
        switch (b11) {
            case "MCP_MODE":
                String str = TextUtils.isEmpty(this.f35974b) ? this.f35976d : this.f35974b;
                this.f35977e = context instanceof Activity ? new f((Activity) context, str) : new f(context, str);
                break;
            case "GENERAL_MODE":
                fVar = context instanceof Activity ? new f((Activity) context) : new f(context);
                this.f35977e = fVar;
                break;
            case "CONSIGNMENT_MODE":
                fVar = context instanceof Activity ? new f((Activity) context, this.f35976d, this.f35975c) : new f(context, this.f35976d, this.f35975c);
                this.f35977e = fVar;
                break;
        }
        return this.f35977e;
    }

    private String b() {
        return this.f35975c ? !TextUtils.isEmpty(this.f35976d) ? "CONSIGNMENT_MODE" : "GENERAL_MODE" : (TextUtils.isEmpty(this.f35974b) && TextUtils.isEmpty(this.f35976d)) ? "GENERAL_MODE" : "MCP_MODE";
    }

    private e c() {
        e eVar;
        e eVar2 = this.f35978f;
        if (eVar2 != null) {
            return eVar2;
        }
        Context context = this.f35973a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "getIapClientFullImpl context is null.");
            return null;
        }
        String b11 = b();
        b11.getClass();
        switch (b11) {
            case "MCP_MODE":
                this.f35978f = new e(context, TextUtils.isEmpty(this.f35974b) ? this.f35976d : this.f35974b);
                break;
            case "GENERAL_MODE":
                eVar = new e(context);
                this.f35978f = eVar;
                break;
            case "CONSIGNMENT_MODE":
                eVar = new e(context, this.f35976d);
                this.f35978f = eVar;
                break;
        }
        return this.f35978f;
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<ConsumeOwnedPurchaseResult> consumeOwnedPurchase(ConsumeOwnedPurchaseReq consumeOwnedPurchaseReq) {
        Checker.checkNonNull(consumeOwnedPurchaseReq);
        Context context = this.f35973a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "consumeOwnedPurchase context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, consumeOwnedPurchaseReq.getReservedInfor())) {
            f a11 = a();
            return a11 != null ? a11.consumeOwnedPurchase(consumeOwnedPurchaseReq) : new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "consumeOwnedPurchase with Full SDK branch.");
        e c11 = c();
        return c11 != null ? c11.consumeOwnedPurchase(consumeOwnedPurchaseReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<PurchaseIntentResult> createPurchaseIntent(PurchaseIntentReq purchaseIntentReq) {
        Checker.checkNonNull(purchaseIntentReq);
        Context context = this.f35973a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "createPurchaseIntent context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, purchaseIntentReq.getReservedInfor())) {
            f a11 = a();
            return a11 != null ? a11.createPurchaseIntent(purchaseIntentReq) : new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "createPurchaseIntent with Full SDK branch.");
        e c11 = c();
        return c11 != null ? c11.createPurchaseIntent(purchaseIntentReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<PurchaseIntentResult> createPurchaseIntentWithPrice(PurchaseIntentWithPriceReq purchaseIntentWithPriceReq) {
        f a11 = a();
        return a11 != null ? a11.createPurchaseIntentWithPrice(purchaseIntentWithPriceReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public void enablePendingPurchase() {
        f a11 = a();
        if (a11 != null) {
            a11.enablePendingPurchase();
        }
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<IsEnvReadyResult> isEnvReady() {
        return isEnvReady(false);
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<IsSandboxActivatedResult> isSandboxActivated(IsSandboxActivatedReq isSandboxActivatedReq) {
        Checker.checkNonNull(isSandboxActivatedReq);
        f a11 = a();
        return a11 != null ? a11.isSandboxActivated(isSandboxActivatedReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<OwnedPurchasesResult> obtainOwnedPurchaseRecord(OwnedPurchasesReq ownedPurchasesReq) {
        Checker.checkNonNull(ownedPurchasesReq);
        Context context = this.f35973a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "obtainOwnedPurchaseRecord context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, ownedPurchasesReq.getReservedInfor())) {
            f a11 = a();
            return a11 != null ? a11.obtainOwnedPurchaseRecord(ownedPurchasesReq) : new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "obtainOwnedPurchaseRecord with Full SDK branch.");
        e c11 = c();
        return c11 != null ? c11.obtainOwnedPurchaseRecord(ownedPurchasesReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<OwnedPurchasesResult> obtainOwnedPurchases(OwnedPurchasesReq ownedPurchasesReq) {
        Checker.checkNonNull(ownedPurchasesReq);
        Context context = this.f35973a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "obtainOwnedPurchases context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, ownedPurchasesReq.getReservedInfor())) {
            f a11 = a();
            return a11 != null ? a11.obtainOwnedPurchases(ownedPurchasesReq) : new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "obtainOwnedPurchases with Full SDK branch.");
        e c11 = c();
        return c11 != null ? c11.obtainOwnedPurchases(ownedPurchasesReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<ProductInfoResult> obtainProductInfo(ProductInfoReq productInfoReq) {
        Checker.checkNonNull(productInfoReq);
        Context context = this.f35973a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "obtainProductInfo context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, productInfoReq.getReservedInfor())) {
            f a11 = a();
            return a11 != null ? a11.obtainProductInfo(productInfoReq) : new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "obtainProductInfo with Full SDK branch.");
        e c11 = c();
        return c11 != null ? c11.obtainProductInfo(productInfoReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public PurchaseResultInfo parsePurchaseResultInfoFromIntent(Intent intent) {
        if (intent == null) {
            intent = new Intent();
        }
        if (!com.huawei.hms.iap.util.c.a(intent, "isFullSdk", false)) {
            f a11 = a();
            return a11 != null ? a11.parsePurchaseResultInfoFromIntent(intent) : new PurchaseResultInfo();
        }
        HMSLog.i("IapClientEntryImpl", "parsePurchaseResultInfoFromIntent with Full SDK branch.");
        e c11 = c();
        return c11 != null ? c11.parsePurchaseResultInfoFromIntent(intent) : new PurchaseResultInfo();
    }

    @Override // com.huawei.hms.iap.IapClient
    public RedeemCodeResultInfo parseRedeemCodeResultInfoFromIntent(Intent intent) {
        if (intent == null) {
            intent = new Intent();
        }
        f a11 = a();
        return a11 != null ? a11.parseRedeemCodeResultInfoFromIntent(intent) : new RedeemCodeResultInfo();
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<ScanRedeemCodeResult> scanRedeemCode() {
        f a11 = a();
        return a11 != null ? a11.scanRedeemCode() : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<StartIapActivityResult> startIapActivity(StartIapActivityReq startIapActivityReq) {
        Checker.checkNonNull(startIapActivityReq);
        f a11 = a();
        return a11 != null ? a11.startIapActivity(startIapActivityReq) : new IapFailureTask();
    }

    public d(Activity activity, String str) {
        this.f35973a = new WeakReference<>(activity);
        this.f35974b = str;
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<IsEnvReadyResult> isEnvReady(IsEnvReadyReq isEnvReadyReq) {
        Checker.checkNonNull(isEnvReadyReq);
        Context context = this.f35973a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "isEnvReady context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, isEnvReadyReq.getReservedInfor())) {
            return new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "isEnvReady with Full SDK branch.");
        e c11 = c();
        return c11 != null ? c11.isEnvReady(isEnvReadyReq) : new IapFailureTask();
    }

    public d(Activity activity, String str, boolean z11) {
        this.f35973a = new WeakReference<>(activity);
        this.f35976d = str;
        this.f35975c = z11;
    }

    @Override // com.huawei.hms.iap.IapClient
    public fr.k<IsEnvReadyResult> isEnvReady(boolean z11) {
        f a11 = a();
        return a11 != null ? a11.isEnvReady(z11) : new IapFailureTask();
    }

    public d(Context context) {
        this.f35973a = new WeakReference<>(context);
    }

    public d(Context context, String str) {
        this.f35973a = new WeakReference<>(context);
        this.f35974b = str;
    }

    public d(Context context, String str, boolean z11) {
        this.f35973a = new WeakReference<>(context);
        this.f35976d = str;
        this.f35975c = z11;
    }
}
