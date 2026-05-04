package com.huawei.hms.iap.task;

import android.app.Activity;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;
import fr.h;
import fr.i;
import fr.k;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public class IapFailureTask<T extends Result> extends k<T> {

    /* renamed from: a, reason: collision with root package name */
    private int f36024a;

    /* renamed from: b, reason: collision with root package name */
    private String f36025b;

    public IapFailureTask() {
        this(-1, "context weak ref is recycled");
    }

    @Override // fr.k
    public k<T> addOnFailureListener(Activity activity, h hVar) {
        addOnFailureListener(hVar);
        return this;
    }

    @Override // fr.k
    public k<T> addOnSuccessListener(Activity activity, i<T> iVar) {
        addOnSuccessListener(iVar);
        return this;
    }

    @Override // fr.k
    public Exception getException() {
        return null;
    }

    @Override // fr.k
    public T getResult() {
        return null;
    }

    @Override // fr.k
    public <E extends Throwable> T getResultThrowException(Class<E> cls) throws Throwable {
        return null;
    }

    @Override // fr.k
    public boolean isCanceled() {
        return false;
    }

    @Override // fr.k
    public boolean isComplete() {
        return true;
    }

    @Override // fr.k
    public boolean isSuccessful() {
        return false;
    }

    public IapFailureTask(int i11, String str) {
        this.f36024a = i11;
        this.f36025b = str;
    }

    @Override // fr.k
    public k<T> addOnFailureListener(h hVar) {
        if (hVar == null) {
            return this;
        }
        hVar.onFailure(new IapApiException(new Status(this.f36024a, this.f36025b)));
        return this;
    }

    @Override // fr.k
    public k<T> addOnSuccessListener(i<T> iVar) {
        return this;
    }

    @Override // fr.k
    public k<T> addOnFailureListener(Executor executor, h hVar) {
        addOnFailureListener(hVar);
        return this;
    }

    @Override // fr.k
    public k<T> addOnSuccessListener(Executor executor, i<T> iVar) {
        addOnSuccessListener(iVar);
        return this;
    }
}
