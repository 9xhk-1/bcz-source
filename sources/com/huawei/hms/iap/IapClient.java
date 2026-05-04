package com.huawei.hms.iap;

import android.content.Intent;
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

/* loaded from: classes7.dex */
public interface IapClient {

    public interface PriceType {
        public static final int IN_APP_CONSUMABLE = 0;
        public static final int IN_APP_NONCONSUMABLE = 1;
        public static final int IN_APP_SUBSCRIPTION = 2;
    }

    fr.k<ConsumeOwnedPurchaseResult> consumeOwnedPurchase(ConsumeOwnedPurchaseReq consumeOwnedPurchaseReq);

    fr.k<PurchaseIntentResult> createPurchaseIntent(PurchaseIntentReq purchaseIntentReq);

    @Deprecated
    fr.k<PurchaseIntentResult> createPurchaseIntentWithPrice(PurchaseIntentWithPriceReq purchaseIntentWithPriceReq);

    void enablePendingPurchase();

    fr.k<IsEnvReadyResult> isEnvReady();

    fr.k<IsEnvReadyResult> isEnvReady(IsEnvReadyReq isEnvReadyReq);

    fr.k<IsEnvReadyResult> isEnvReady(boolean z11);

    fr.k<IsSandboxActivatedResult> isSandboxActivated(IsSandboxActivatedReq isSandboxActivatedReq);

    fr.k<OwnedPurchasesResult> obtainOwnedPurchaseRecord(OwnedPurchasesReq ownedPurchasesReq);

    fr.k<OwnedPurchasesResult> obtainOwnedPurchases(OwnedPurchasesReq ownedPurchasesReq);

    fr.k<ProductInfoResult> obtainProductInfo(ProductInfoReq productInfoReq);

    PurchaseResultInfo parsePurchaseResultInfoFromIntent(Intent intent);

    RedeemCodeResultInfo parseRedeemCodeResultInfoFromIntent(Intent intent);

    fr.k<ScanRedeemCodeResult> scanRedeemCode();

    fr.k<StartIapActivityResult> startIapActivity(StartIapActivityReq startIapActivityReq);
}
