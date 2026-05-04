package com.huawei.hms.iap.task;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iapfull.IIapFullAPIVer4;
import com.huawei.hms.iapfull.IapFullAPIFactory;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import fr.h;
import fr.i;
import fr.k;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public abstract class BaseIapFullTask<V extends Result, E> extends k<V> {
    protected boolean mIsCompleted;
    protected boolean mIsSuccessful;
    protected h mOnFailureListener;
    protected i<V> mOnSuccessListener;
    protected V mResult;

    public BaseIapFullTask(Context context, E e11) {
        setResult();
        if (context != null) {
            handleRequest(e11, IapFullAPIFactory.createIapFullAPIVer4(context));
            return;
        }
        HMSLog.e("BaseIapFullTask", "context is null.");
        this.mResult.setStatus(new Status(60001, "param is error"));
        this.mIsSuccessful = false;
        this.mIsCompleted = true;
    }

    @Override // fr.k
    public k<V> addOnFailureListener(Activity activity, h hVar) {
        addOnFailureListener(hVar);
        return this;
    }

    @Override // fr.k
    public k<V> addOnSuccessListener(Activity activity, i<V> iVar) {
        addOnSuccessListener(iVar);
        return this;
    }

    @Override // fr.k
    public Exception getException() {
        return null;
    }

    @Override // fr.k
    public V getResult() {
        return this.mResult;
    }

    @Override // fr.k
    public <E extends Throwable> V getResultThrowException(Class<E> cls) throws Throwable {
        return null;
    }

    public abstract void handleRequest(E e11, @NonNull IIapFullAPIVer4 iIapFullAPIVer4);

    public void handleRequestFailed(int i11, String str) {
        this.mIsSuccessful = false;
        this.mIsCompleted = true;
        h hVar = this.mOnFailureListener;
        if (hVar != null) {
            hVar.onFailure(new IapApiException(new Status(i11, str)));
        }
    }

    public void handleRequestSuccess() {
        this.mIsSuccessful = true;
        this.mIsCompleted = true;
        i<V> iVar = this.mOnSuccessListener;
        if (iVar != null) {
            iVar.onSuccess(this.mResult);
        }
    }

    @Override // fr.k
    public boolean isCanceled() {
        return false;
    }

    @Override // fr.k
    public boolean isComplete() {
        return this.mIsCompleted;
    }

    @Override // fr.k
    public boolean isSuccessful() {
        return this.mIsSuccessful;
    }

    public abstract void setResult();

    @Override // fr.k
    public k<V> addOnFailureListener(h hVar) {
        if (hVar != null) {
            if (isComplete() && !isSuccessful()) {
                hVar.onFailure(new IapApiException(this.mResult.getStatus()));
                return this;
            }
            this.mOnFailureListener = hVar;
        }
        return this;
    }

    @Override // fr.k
    public k<V> addOnSuccessListener(i<V> iVar) {
        if (iVar != null) {
            if (isComplete() && isSuccessful()) {
                iVar.onSuccess(this.mResult);
                return this;
            }
            this.mOnSuccessListener = iVar;
        }
        return this;
    }

    @Override // fr.k
    public k<V> addOnFailureListener(Executor executor, h hVar) {
        addOnFailureListener(hVar);
        return this;
    }

    @Override // fr.k
    public k<V> addOnSuccessListener(Executor executor, i<V> iVar) {
        addOnSuccessListener(iVar);
        return this;
    }
}
