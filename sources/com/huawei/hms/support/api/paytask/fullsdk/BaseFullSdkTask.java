package com.huawei.hms.support.api.paytask.fullsdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iapfull.bean.PayRequest;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.pay.internal.BaseReq;
import com.huawei.hms.support.api.pay.PayResult;
import fr.h;
import fr.i;
import fr.k;
import java.lang.reflect.Field;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public abstract class BaseFullSdkTask<T extends BaseReq> extends k<PayResult> {

    /* renamed from: b, reason: collision with root package name */
    private boolean f36341b;
    protected Context mContext;
    protected T mRequest;
    protected Intent mIntent = getFullSdkIntent();

    /* renamed from: a, reason: collision with root package name */
    private PayResult f36340a = new PayResult();

    public BaseFullSdkTask(Context context, T t11) {
        this.mContext = context;
        this.mRequest = t11;
        this.f36340a.setStatus(this.mIntent == null ? new Status(30001, "param is error") : new Status(0, "success", this.mIntent));
        this.f36341b = true;
    }

    @Override // fr.k
    public k<PayResult> addOnFailureListener(Activity activity, h hVar) {
        addOnFailureListener(hVar);
        return this;
    }

    @Override // fr.k
    public k<PayResult> addOnSuccessListener(Activity activity, i<PayResult> iVar) {
        addOnSuccessListener(iVar);
        return this;
    }

    public boolean checkFieldExist(Object obj, String str) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            for (Field field : obj.getClass().getDeclaredFields()) {
                if (field.getName().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract PayRequest createRequestParams();

    @Override // fr.k
    public Exception getException() {
        return null;
    }

    public abstract Intent getFullSdkIntent();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // fr.k
    public PayResult getResult() {
        return this.f36340a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // fr.k
    public <E extends Throwable> PayResult getResultThrowException(Class<E> cls) throws Throwable {
        return null;
    }

    @Override // fr.k
    public boolean isCanceled() {
        return false;
    }

    @Override // fr.k
    public boolean isComplete() {
        return this.f36341b;
    }

    @Override // fr.k
    public boolean isSuccessful() {
        return this.mIntent != null;
    }

    @Override // fr.k
    public k<PayResult> addOnFailureListener(h hVar) {
        if (hVar != null && !isSuccessful()) {
            hVar.onFailure(new IapApiException(this.f36340a.getStatus()));
        }
        return this;
    }

    @Override // fr.k
    public k<PayResult> addOnSuccessListener(i<PayResult> iVar) {
        if (iVar != null && isSuccessful()) {
            iVar.onSuccess(this.f36340a);
        }
        return this;
    }

    @Override // fr.k
    public k<PayResult> addOnFailureListener(Executor executor, h hVar) {
        addOnFailureListener(hVar);
        return this;
    }

    @Override // fr.k
    public k<PayResult> addOnSuccessListener(Executor executor, i<PayResult> iVar) {
        addOnSuccessListener(iVar);
        return this;
    }
}
