package com.baicizhan.client.business.webview.hwpay;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import c40.h1;
import c40.l2;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.client.business.webview.PayManager;
import com.baicizhan.client.business.webview.hwpay.db.entity.HwPayOrderInfo;
import com.huawei.hms.iap.Iap;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iap.entity.ConsumeOwnedPurchaseReq;
import com.huawei.hms.iap.entity.ConsumeOwnedPurchaseResult;
import com.huawei.hms.iap.entity.IsEnvReadyResult;
import com.huawei.hms.iap.entity.OwnedPurchasesReq;
import com.huawei.hms.iap.entity.OwnedPurchasesResult;
import com.huawei.hms.iap.entity.PurchaseIntentReq;
import com.huawei.hms.iap.entity.PurchaseIntentResult;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import com.huawei.hms.support.api.client.Status;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class HwPayManager {
    public static final int HW_PAY_REQUEST_CODE = 6666;

    @k
    public static final String TAG = "HwPayManager";

    @l
    private static HwPayOrderInfo curOrderInfo;
    private static boolean isHwPayEnvReady;

    @l
    private static PayManager.IPayListener onPayListener;

    @k
    public static final HwPayManager INSTANCE = new HwPayManager();

    @k
    private static final MutableLiveData<String> hwPayResult = new MutableLiveData<>();

    @k
    private static final MutableLiveData<String> serviceResp = new MutableLiveData<>();

    @k
    private static final c0 hwPayService$delegate = e0.c(new x00.a() { // from class: com.baicizhan.client.business.webview.hwpay.i
        @Override // x00.a
        public final Object invoke() {
            HwPayServiceImpl hwPayService_delegate$lambda$0;
            hwPayService_delegate$lambda$0 = HwPayManager.hwPayService_delegate$lambda$0();
            return hwPayService_delegate$lambda$0;
        }
    });
    public static final int $stable = 8;

    private HwPayManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkHwPayEnv$lambda$0(IsEnvReadyResult isEnvReadyResult) {
        qb.c.b(TAG, "checkHwPayEnv true", new Object[0]);
        isHwPayEnvReady = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkHwPayEnv$lambda$1(Exception exc) {
        if (exc instanceof IapApiException) {
            Status status = ((IapApiException) exc).getStatus();
            g0.o(status, "getStatus(...)");
            if (status.getStatusCode() == 60050) {
                isHwPayEnvReady = true;
                qb.c.b(TAG, "checkHwPayEnv true no login", new Object[0]);
                return;
            }
        }
        qb.c.b(TAG, "checkHwPayEnv false", new Object[0]);
        isHwPayEnvReady = false;
    }

    private final HwPayServiceImpl getHwPayService() {
        return (HwPayServiceImpl) hwPayService$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(2:3|(14:5|6|(1:(4:9|10|11|12)(2:50|51))(9:52|53|54|55|(6:57|(1:59)|60|61|62|(1:64)(1:65))|36|(2:(1:39)|40)|41|42)|13|14|15|(3:17|(4:19|(1:21)(1:25)|22|(1:24))|26)|27|(4:29|(1:31)|32|(1:34))|35|36|(0)|41|42))|72|6|(0)(0)|13|14|15|(0)|27|(0)|35|36|(0)|41|42|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013e, code lost:
    
        r15 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleHwPay(androidx.core.app.ComponentActivity r12, java.lang.String r13, boolean r14, j00.c<? super yz.g2> r15) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.webview.hwpay.HwPayManager.handleHwPay(androidx.core.app.ComponentActivity, java.lang.String, boolean, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HwPayServiceImpl hwPayService_delegate$lambda$0() {
        return new HwPayServiceImpl();
    }

    private final void onPayFailure() {
        qb.c.b(TAG, "pay failure", new Object[0]);
        HwPayResponse hwPayResponse = new HwPayResponse(HwPayResultStatus.FAILURE.getStatus(), "-1");
        PayManager.IPayListener iPayListener = onPayListener;
        if (iPayListener != null) {
            iPayListener.onHuaweiPayResponse(hwPayResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pay$lambda$1$3(ComponentActivity componentActivity, PurchaseIntentResult purchaseIntentResult) {
        Status status = purchaseIntentResult.getStatus();
        g0.o(status, "getStatus(...)");
        if (status.hasResolution()) {
            qb.c.b(TAG, "status:" + status.getStatusCode(), new Object[0]);
            try {
                status.startResolutionForResult(componentActivity, HW_PAY_REQUEST_CODE);
            } catch (IntentSender.SendIntentException e11) {
                qb.c.b(TAG, "intent error:" + e11.getMessage(), new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pay$lambda$1$4(Exception exc) {
        hwPayResult.postValue(exc.getMessage());
        if (exc instanceof IapApiException) {
            IapApiException iapApiException = (IapApiException) exc;
            Status status = iapApiException.getStatus();
            g0.o(status, "getStatus(...)");
            qb.c.d(TAG, "intent iap error:" + status + "," + iapApiException.getStatusCode(), new Object[0]);
        } else {
            qb.c.d(TAG, "intent iap error:" + exc.getMessage(), new Object[0]);
        }
        INSTANCE.onPayFailure();
    }

    private final void repairConsumeProduct(final ComponentActivity componentActivity, final boolean z11) {
        OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
        HwProductType hwProductType = HwProductType.CONSUMED;
        ownedPurchasesReq.setPriceType(hwProductType.getType());
        qb.c.b(TAG, "repairConsumeProduct: " + hwProductType.getType(), new Object[0]);
        Iap.getIapClient((Activity) componentActivity).obtainOwnedPurchases(ownedPurchasesReq).addOnSuccessListener(new fr.i() { // from class: com.baicizhan.client.business.webview.hwpay.g
            @Override // fr.i
            public final void onSuccess(Object obj) {
                HwPayManager.repairConsumeProduct$lambda$0(ComponentActivity.this, z11, (OwnedPurchasesResult) obj);
            }
        }).addOnFailureListener(new fr.h() { // from class: com.baicizhan.client.business.webview.hwpay.h
            @Override // fr.h
            public final void onFailure(Exception exc) {
                HwPayManager.repairConsumeProduct$lambda$1(exc);
            }
        });
    }

    public static /* synthetic */ void repairConsumeProduct$default(HwPayManager hwPayManager, ComponentActivity componentActivity, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        hwPayManager.repairConsumeProduct(componentActivity, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void repairConsumeProduct$lambda$0(ComponentActivity componentActivity, boolean z11, OwnedPurchasesResult ownedPurchasesResult) {
        List<String> inAppPurchaseDataList;
        qb.c.b(TAG, "repairConsumeProduct task success:" + ((ownedPurchasesResult == null || (inAppPurchaseDataList = ownedPurchasesResult.getInAppPurchaseDataList()) == null) ? null : Integer.valueOf(inAppPurchaseDataList.size())), new Object[0]);
        if ((ownedPurchasesResult != null ? ownedPurchasesResult.getInAppPurchaseDataList() : null) != null) {
            int size = ownedPurchasesResult.getInAppPurchaseDataList().size();
            for (int i11 = 0; i11 < size; i11++) {
                String str = ownedPurchasesResult.getInAppPurchaseDataList().get(i11);
                ownedPurchasesResult.getInAppSignature().get(i11);
                c40.k.f(LifecycleOwnerKt.getLifecycleScope(componentActivity), h1.c(), null, new HwPayManager$repairConsumeProduct$1$1(componentActivity, str, z11, null), 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void repairConsumeProduct$lambda$1(Exception exc) {
        qb.c.d(TAG, "repairConsumeProduct error:" + exc.getMessage(), new Object[0]);
    }

    private final void tryConsumeOwnedProduct(ComponentActivity componentActivity, int i11, String str) {
        qb.c.b(TAG, "tryConsumeOwnedProduct:" + i11 + "." + str, new Object[0]);
        if (i11 == HwProductType.CONSUMED.getType()) {
            ConsumeOwnedPurchaseReq consumeOwnedPurchaseReq = new ConsumeOwnedPurchaseReq();
            consumeOwnedPurchaseReq.setPurchaseToken(str);
            Iap.getIapClient((Activity) componentActivity).consumeOwnedPurchase(consumeOwnedPurchaseReq).addOnSuccessListener(new fr.i() { // from class: com.baicizhan.client.business.webview.hwpay.a
                @Override // fr.i
                public final void onSuccess(Object obj) {
                    HwPayManager.tryConsumeOwnedProduct$lambda$1((ConsumeOwnedPurchaseResult) obj);
                }
            }).addOnFailureListener(new fr.h() { // from class: com.baicizhan.client.business.webview.hwpay.b
                @Override // fr.h
                public final void onFailure(Exception exc) {
                    HwPayManager.tryConsumeOwnedProduct$lambda$2(exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryConsumeOwnedProduct$lambda$1(ConsumeOwnedPurchaseResult consumeOwnedPurchaseResult) {
        qb.c.b(TAG, "consume success," + consumeOwnedPurchaseResult.getConsumePurchaseData(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryConsumeOwnedProduct$lambda$2(Exception exc) {
        if (!(exc instanceof IapApiException)) {
            qb.c.d(TAG, "consume other error:" + exc.getMessage(), new Object[0]);
            return;
        }
        IapApiException iapApiException = (IapApiException) exc;
        Status status = iapApiException.getStatus();
        g0.o(status, "getStatus(...)");
        qb.c.d(TAG, "consume error:" + status + "," + iapApiException.getStatusCode(), new Object[0]);
    }

    public final void checkHwPayEnv(@k ComponentActivity activity) {
        g0.p(activity, "activity");
        qb.c.b(TAG, "start checkHwPayEnv", new Object[0]);
        if (!isHwPayEnvReady && DeviceUtil.isHuawei()) {
            Iap.getIapClient((Activity) activity).isEnvReady().addOnSuccessListener(new fr.i() { // from class: com.baicizhan.client.business.webview.hwpay.e
                @Override // fr.i
                public final void onSuccess(Object obj) {
                    HwPayManager.checkHwPayEnv$lambda$0((IsEnvReadyResult) obj);
                }
            }).addOnFailureListener(new fr.h() { // from class: com.baicizhan.client.business.webview.hwpay.f
                @Override // fr.h
                public final void onFailure(Exception exc) {
                    HwPayManager.checkHwPayEnv$lambda$1(exc);
                }
            });
            repairConsumeProduct$default(this, activity, false, 2, null);
        }
    }

    public final void destroy() {
        curOrderInfo = null;
        onPayListener = null;
    }

    @k
    public final MutableLiveData<String> getHwPayResult() {
        return hwPayResult;
    }

    @l
    public final PayManager.IPayListener getOnPayListener() {
        return onPayListener;
    }

    @k
    public final MutableLiveData<String> getServiceResp() {
        return serviceResp;
    }

    public final boolean isHwPayEnvReady() {
        return isHwPayEnvReady;
    }

    public final void onActivityResult(@k ComponentActivity activity, int i11, int i12, @l Intent intent) {
        PayManager.IPayListener iPayListener;
        g0.p(activity, "activity");
        qb.c.b(TAG, "onActivityResult:" + i11 + "," + i12, new Object[0]);
        if (i11 == 6666) {
            serviceResp.postValue("");
            if (intent == null) {
                qb.c.d("onActivityResult", "data is null", new Object[0]);
                return;
            }
            PurchaseResultInfo parsePurchaseResultInfoFromIntent = Iap.getIapClient((Activity) activity).parsePurchaseResultInfoFromIntent(intent);
            qb.c.b(TAG, "resultInfo:" + parsePurchaseResultInfoFromIntent.getReturnCode() + "," + parsePurchaseResultInfoFromIntent.getInAppPurchaseData() + "," + parsePurchaseResultInfoFromIntent.getErrMsg(), new Object[0]);
            int returnCode = parsePurchaseResultInfoFromIntent.getReturnCode();
            if (returnCode != -1) {
                if (returnCode == 0) {
                    String inAppPurchaseData = parsePurchaseResultInfoFromIntent.getInAppPurchaseData();
                    hwPayResult.postValue(inAppPurchaseData);
                    c40.k.f(LifecycleOwnerKt.getLifecycleScope(activity), h1.c(), null, new HwPayManager$onActivityResult$1(activity, inAppPurchaseData, null), 2, null);
                    return;
                } else if (returnCode != 1) {
                    if (returnCode == 60000) {
                        hwPayResult.postValue("user cancel");
                        HwPayResponse hwPayResponse = new HwPayResponse(HwPayResultStatus.CANCEL.getStatus(), "-1");
                        PayManager.IPayListener iPayListener2 = onPayListener;
                        if (iPayListener2 != null) {
                            iPayListener2.onHuaweiPayResponse(hwPayResponse);
                            return;
                        }
                        return;
                    }
                    if (returnCode != 60051) {
                        onPayFailure();
                        return;
                    }
                }
            }
            hwPayResult.postValue(parsePurchaseResultInfoFromIntent.getReturnCode() + "," + parsePurchaseResultInfoFromIntent.getErrMsg());
            HwPayOrderInfo hwPayOrderInfo = curOrderInfo;
            if (hwPayOrderInfo != null && hwPayOrderInfo.getProductType() == HwProductType.NON_CONSUMED.getType() && parsePurchaseResultInfoFromIntent.getReturnCode() == 60051 && (iPayListener = onPayListener) != null) {
                iPayListener.onHuaweiPayResponse(new HwPayResponse(HwPayResultStatus.NON_CONSUMED_OWNED.getStatus(), "-1"));
            }
            HwPayOrderInfo hwPayOrderInfo2 = curOrderInfo;
            if (hwPayOrderInfo2 == null || hwPayOrderInfo2.getProductType() != HwProductType.CONSUMED.getType()) {
                return;
            }
            repairConsumeProduct(activity, true);
        }
    }

    public final void pay(@k final ComponentActivity activity, @k String orderInfo) {
        Object m6308constructorimpl;
        Object m6308constructorimpl2;
        l2 f11;
        g0.p(activity, "activity");
        g0.p(orderInfo, "orderInfo");
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl((HwPayOrderInfo) new com.google.gson.d().n(orderInfo, HwPayOrderInfo.class));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        if (Result.m6315isSuccessimpl(m6308constructorimpl)) {
            HwPayOrderInfo hwPayOrderInfo = (HwPayOrderInfo) m6308constructorimpl;
            qb.c.b(TAG, "orderInfo:" + hwPayOrderInfo, new Object[0]);
            curOrderInfo = hwPayOrderInfo;
            try {
                Result.a aVar3 = Result.Companion;
                f11 = c40.k.f(LifecycleOwnerKt.getLifecycleScope(activity), h1.c(), null, new HwPayManager$pay$2$1$1(hwPayOrderInfo, null), 2, null);
                m6308constructorimpl2 = Result.m6308constructorimpl(f11);
            } catch (Throwable th3) {
                Result.a aVar4 = Result.Companion;
                m6308constructorimpl2 = Result.m6308constructorimpl(kotlin.e.a(th3));
            }
            if (Result.m6311exceptionOrNullimpl(m6308constructorimpl2) != null) {
                INSTANCE.onPayFailure();
            } else {
                PurchaseIntentReq purchaseIntentReq = new PurchaseIntentReq();
                purchaseIntentReq.setProductId(hwPayOrderInfo.getProductId());
                purchaseIntentReq.setPriceType(hwPayOrderInfo.getProductType());
                Iap.getIapClient((Activity) activity).createPurchaseIntent(purchaseIntentReq).addOnSuccessListener(new fr.i() { // from class: com.baicizhan.client.business.webview.hwpay.c
                    @Override // fr.i
                    public final void onSuccess(Object obj) {
                        HwPayManager.pay$lambda$1$3(ComponentActivity.this, (PurchaseIntentResult) obj);
                    }
                }).addOnFailureListener(new fr.h() { // from class: com.baicizhan.client.business.webview.hwpay.d
                    @Override // fr.h
                    public final void onFailure(Exception exc) {
                        HwPayManager.pay$lambda$1$4(exc);
                    }
                });
            }
        }
        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m6308constructorimpl);
        if (m6311exceptionOrNullimpl != null) {
            qb.c.d(TAG, "pay error:" + m6311exceptionOrNullimpl.getMessage(), new Object[0]);
            INSTANCE.onPayFailure();
        }
    }

    public final void setHwPayEnvReady(boolean z11) {
        isHwPayEnvReady = z11;
    }

    public final void setOnPayListener(@l PayManager.IPayListener iPayListener) {
        onPayListener = iPayListener;
    }
}
