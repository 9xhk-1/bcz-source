package com.huawei.hms.support.api;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.gentyref.GenericTypeReflector;
import com.huawei.hms.support.log.HMSLog;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ErrorResultImpl<R extends Result> extends PendingResult<R> {

    /* renamed from: a, reason: collision with root package name */
    private R f36259a = null;

    /* renamed from: b, reason: collision with root package name */
    private int f36260b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ResultCallback f36261a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ErrorResultImpl f36262b;

        public a(ResultCallback resultCallback, ErrorResultImpl errorResultImpl) {
            this.f36261a = resultCallback;
            this.f36262b = errorResultImpl;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultCallback resultCallback = this.f36261a;
            ErrorResultImpl errorResultImpl = ErrorResultImpl.this;
            resultCallback.onResult(errorResultImpl.a(errorResultImpl.f36260b, this.f36262b));
        }
    }

    public ErrorResultImpl(int i11) {
        this.f36260b = i11;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
        return await(0L, null);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public boolean isCanceled() {
        return false;
    }

    public void postRunnable(Looper looper, ResultCallback<R> resultCallback, ErrorResultImpl errorResultImpl) {
        if (looper == null) {
            looper = Looper.myLooper();
        }
        new Handler(looper).post(new a(resultCallback, errorResultImpl));
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(ResultCallback<R> resultCallback) {
        setResultCallback(Looper.getMainLooper(), resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j11, TimeUnit timeUnit) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return a(this.f36260b, this);
        }
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public R a(int i11, ErrorResultImpl errorResultImpl) {
        Type genericSuperclass = errorResultImpl.getClass().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        try {
            R r11 = (R) GenericTypeReflector.getType(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]).newInstance();
            this.f36259a = r11;
            r11.setStatus(new Status(i11));
        } catch (IllegalAccessException unused) {
            HMSLog.e("ErrorResultImpl", "IllegalAccessException");
        } catch (InstantiationException unused2) {
            HMSLog.e("ErrorResultImpl", "InstantiationException");
        }
        return this.f36259a;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void setResultCallback(ResultCallback<R> resultCallback, long j11, TimeUnit timeUnit) {
        setResultCallback(resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
        postRunnable(looper, resultCallback, this);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void cancel() {
    }
}
