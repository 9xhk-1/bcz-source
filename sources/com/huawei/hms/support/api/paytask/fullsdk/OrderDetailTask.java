package com.huawei.hms.support.api.paytask.fullsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iapfull.IapFullAPIFactory;
import com.huawei.hms.iapfull.bean.WebOrderRequest;
import com.huawei.hms.iapfull.webpay.callback.WebPayCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.pay.OrderRequest;
import com.huawei.hms.support.api.entity.pay.OrderResp;
import com.huawei.hms.support.api.pay.OrderResult;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import fr.h;
import fr.i;
import fr.k;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public class OrderDetailTask extends k<OrderResult> {

    /* renamed from: a, reason: collision with root package name */
    private boolean f36344a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f36345b;

    /* renamed from: c, reason: collision with root package name */
    private OrderResult f36346c = new OrderResult();

    /* renamed from: d, reason: collision with root package name */
    private i<OrderResult> f36347d;

    /* renamed from: e, reason: collision with root package name */
    private h f36348e;

    public OrderDetailTask(Context context, OrderRequest orderRequest) {
        if (context != null) {
            IapFullAPIFactory.createIapFullAPI(context).getOrderDetail(a(orderRequest), new WebPayCallback() { // from class: com.huawei.hms.support.api.paytask.fullsdk.OrderDetailTask.1
                public void onFailure(int i11, String str) {
                    OrderResp orderResp = new OrderResp();
                    orderResp.setCommonStatus(new Status(i11, str));
                    OrderDetailTask.this.f36345b = false;
                    OrderDetailTask.this.f36346c = new OrderResult(orderResp);
                    OrderDetailTask.this.f36344a = true;
                    if (OrderDetailTask.this.f36348e != null) {
                        OrderDetailTask.this.f36348e.onFailure(new IapApiException(OrderDetailTask.this.f36346c.getStatus()));
                    }
                }

                public void onSuccess(String str) {
                    OrderResp orderResp = new OrderResp();
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            JsonUtil.jsonToEntity(str, orderResp);
                        } catch (IllegalArgumentException e11) {
                            HMSLog.e("ProductDetailTask", "OrderResp jsonToEntity " + e11.getMessage());
                        }
                    }
                    OrderResult orderResult = new OrderResult(orderResp);
                    OrderDetailTask.this.f36345b = true;
                    OrderDetailTask.this.f36346c = orderResult;
                    OrderDetailTask.this.f36344a = true;
                    if (OrderDetailTask.this.f36347d != null) {
                        OrderDetailTask.this.f36347d.onSuccess(OrderDetailTask.this.f36346c);
                    }
                }
            });
            return;
        }
        this.f36346c.setStatus(new Status(30001, "param is error"));
        this.f36345b = false;
        this.f36344a = true;
    }

    private WebOrderRequest a(OrderRequest orderRequest) {
        WebOrderRequest webOrderRequest = new WebOrderRequest();
        webOrderRequest.setMerchantId(orderRequest.getMerchantId());
        webOrderRequest.setRequestId(orderRequest.getRequestId());
        webOrderRequest.setKeyType(orderRequest.getKeyType());
        webOrderRequest.setTime(orderRequest.getTime());
        webOrderRequest.setReservedInfor(orderRequest.getReservedInfor());
        webOrderRequest.setSign(orderRequest.getSign());
        webOrderRequest.setSignatureAlgorithm(orderRequest.getSignatureAlgorithm());
        return webOrderRequest;
    }

    @Override // fr.k
    public k<OrderResult> addOnFailureListener(Activity activity, h hVar) {
        addOnFailureListener(hVar);
        return this;
    }

    @Override // fr.k
    public k<OrderResult> addOnSuccessListener(Activity activity, i<OrderResult> iVar) {
        addOnSuccessListener(iVar);
        return this;
    }

    @Override // fr.k
    public Exception getException() {
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // fr.k
    public OrderResult getResult() {
        return this.f36346c;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // fr.k
    public <E extends Throwable> OrderResult getResultThrowException(Class<E> cls) throws Throwable {
        return null;
    }

    @Override // fr.k
    public boolean isCanceled() {
        return false;
    }

    @Override // fr.k
    public boolean isComplete() {
        return this.f36344a;
    }

    @Override // fr.k
    public boolean isSuccessful() {
        return this.f36345b;
    }

    @Override // fr.k
    public k<OrderResult> addOnFailureListener(h hVar) {
        if (hVar != null) {
            if (isComplete()) {
                hVar.onFailure(new IapApiException(this.f36346c.getStatus()));
                return this;
            }
            this.f36348e = hVar;
        }
        return this;
    }

    @Override // fr.k
    public k<OrderResult> addOnSuccessListener(i<OrderResult> iVar) {
        if (iVar != null) {
            this.f36347d = iVar;
        }
        return this;
    }

    @Override // fr.k
    public k<OrderResult> addOnFailureListener(Executor executor, h hVar) {
        addOnFailureListener(hVar);
        return this;
    }

    @Override // fr.k
    public k<OrderResult> addOnSuccessListener(Executor executor, i<OrderResult> iVar) {
        addOnSuccessListener(iVar);
        return this;
    }
}
