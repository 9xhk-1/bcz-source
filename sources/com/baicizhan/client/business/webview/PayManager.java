package com.baicizhan.client.business.webview;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.alipay.sdk.app.PayTask;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.client.business.webview.hwpay.HwPayManager;
import com.baicizhan.client.business.webview.hwpay.HwPayResponse;
import com.huawei.hms.aggrpay.entity.PayResult;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.tencent.connect.common.Constants;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tencent.mobileqq.openpay.api.IOpenApi;
import com.tencent.mobileqq.openpay.api.OpenApiFactory;
import com.tencent.mobileqq.openpay.constants.OpenConstants;
import com.tencent.mobileqq.openpay.data.base.BaseResponse;
import com.tencent.mobileqq.openpay.data.pay.PayApi;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class PayManager {
    public static final String PAY_SUPPORT_KEY = "Pay-Support";
    public static final String TAG = "PayManager";
    private static final PayManager sInstance = new PayManager();
    private IPayListener payListener;
    private ec0.b subscriptions;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface IPayListener {
        void onAliPayResponse(String result);

        void onHuaweiPayResponse(HwPayResponse response);

        void onHwAggrResponse(PayResult result);

        void onQQPayResponse(BaseResponse response);

        void onWeixinPayResponse(BaseResp resp);
    }

    private PayManager() {
    }

    public static PayManager getInstance() {
        return sInstance;
    }

    public static void putPayHeader(@NonNull Context context, @NonNull Map<String, String> headers, boolean isPrivateAgree) {
        String str = "alipay_mob_client;";
        if (isPrivateAgree && c9.a.f(context)) {
            str = "alipay_mob_client;weixin_app;";
        }
        IOpenApi openApiFactory = OpenApiFactory.getInstance(context, b9.a.f6456e);
        if (isPrivateAgree && openApiFactory.isMobileQQSupportApi(OpenConstants.API_NAME_PAY)) {
            str = str + "qq_app;";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("header,is huawei ready:");
        HwPayManager hwPayManager = HwPayManager.INSTANCE;
        sb2.append(hwPayManager.isHwPayEnvReady());
        qb.c.b(TAG, sb2.toString(), new Object[0]);
        if (isPrivateAgree && DeviceUtil.isHuawei() && hwPayManager.isHwPayEnvReady()) {
            str = str + "huawei_app;";
        }
        qb.c.b(TAG, "header,is huawei aggr ready:" + hwPayManager.isHwPayEnvReady(), new Object[0]);
        if (isPrivateAgree && DeviceUtil.isHuawei()) {
            str = str + "huawei_aggr;";
        }
        headers.put(PAY_SUPPORT_KEY, str);
    }

    public void aliPay(final Activity activity, final String orderInfo) {
        this.subscriptions.a(rx.c.z2(new Callable<String>() { // from class: com.baicizhan.client.business.webview.PayManager.2
            @Override // java.util.concurrent.Callable
            public String call() throws Exception {
                PayTask payTask = new PayTask(activity);
                qb.c.i(PayManager.TAG, "ali %s", orderInfo);
                return payTask.pay(orderInfo, true).replace("\\", "\\\\").replace("'", "\\'");
            }
        }).w5(bc0.c.a()).I3(tb0.a.a()).r5(new qb0.g<String>() { // from class: com.baicizhan.client.business.webview.PayManager.1
            @Override // qb0.c
            public void onError(Throwable e11) {
                va.g.i("支付失败", 0);
            }

            @Override // qb0.c
            public void onNext(String result) {
                qb.c.i(PayManager.TAG, "ali result %s", result);
                if (PayManager.this.payListener != null) {
                    PayManager.this.payListener.onAliPayResponse(result);
                }
            }

            @Override // qb0.c
            public void onCompleted() {
            }
        }));
    }

    public void destroy() {
        this.payListener = null;
        ec0.b bVar = this.subscriptions;
        if (bVar != null) {
            bVar.unsubscribe();
        }
    }

    public void init(IPayListener listener) {
        this.payListener = listener;
        this.subscriptions = new ec0.b();
    }

    public void postQQPayResult(BaseResponse response) {
        qb.c.i(TAG, "postQQPayResult", new Object[0]);
        IPayListener iPayListener = this.payListener;
        if (iPayListener != null) {
            iPayListener.onQQPayResponse(response);
        }
    }

    public void postWeixinPayResult(BaseResp resp) {
        qb.c.i(TAG, "postWeixinPayResult", new Object[0]);
        IPayListener iPayListener = this.payListener;
        if (iPayListener != null) {
            iPayListener.onWeixinPayResponse(resp);
        }
    }

    public void qqPay(String payJson) {
        IOpenApi openApiFactory = OpenApiFactory.getInstance(pb.a.a(), b9.a.f6456e);
        PayApi payApi = new PayApi();
        payApi.appId = b9.a.f6456e;
        payApi.callbackScheme = "qwallet100344605";
        try {
            JSONObject jSONObject = (JSONObject) new JSONTokener(payJson).nextValue();
            payApi.bargainorId = jSONObject.getString("bargainorId");
            payApi.tokenId = jSONObject.getString("tokenId");
            payApi.serialNumber = jSONObject.getString("tokenId");
            payApi.nonce = jSONObject.getString(Constants.NONCE);
            payApi.sig = jSONObject.getString("sig");
            payApi.sigType = jSONObject.getString("sigType");
            payApi.timeStamp = jSONObject.getLong("timeStamp");
            if (payApi.checkParams()) {
                openApiFactory.execApi(payApi);
                qb.c.i(TAG, "qqPay %s", payJson);
            } else {
                va.g.i("参数错误", 0);
                qb.c.d(TAG, "qqPay params error", new Object[0]);
            }
        } catch (JSONException e11) {
            qb.c.c(TAG, "", e11);
            va.g.i("服务器错误", 0);
        }
    }

    public void wexinPay(String payJson) {
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(pb.a.a(), b9.a.f6458g);
        PayReq payReq = new PayReq();
        payReq.appId = b9.a.f6458g;
        try {
            JSONObject jSONObject = (JSONObject) new JSONTokener(payJson).nextValue();
            payReq.partnerId = jSONObject.getString("partnerid");
            payReq.prepayId = jSONObject.getString("prepayid");
            payReq.packageValue = jSONObject.getString("package");
            payReq.nonceStr = jSONObject.getString("noncestr");
            payReq.timeStamp = jSONObject.getString(com.alipay.sdk.m.t.a.f11034k);
            payReq.sign = jSONObject.getString(HwPayConstant.KEY_SIGN);
            createWXAPI.sendReq(payReq);
            qb.c.i(TAG, "wexinPay %s", payJson);
        } catch (JSONException e11) {
            va.g.i("服务器错误", 0);
            qb.c.c(TAG, "", e11);
        }
    }
}
