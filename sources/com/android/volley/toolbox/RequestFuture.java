package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class RequestFuture<T> implements Future<T>, Response.Listener<T>, Response.ErrorListener {
    private VolleyError mException;
    private Request<?> mRequest;
    private T mResult;
    private boolean mResultReceived = false;

    private RequestFuture() {
    }

    private synchronized T doGet(Long l11) throws InterruptedException, ExecutionException, TimeoutException {
        if (this.mException != null) {
            throw new ExecutionException(this.mException);
        }
        if (this.mResultReceived) {
            return this.mResult;
        }
        if (l11 == null) {
            while (!isDone()) {
                wait(0L);
            }
        } else if (l11.longValue() > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long longValue = l11.longValue() + uptimeMillis;
            while (!isDone() && uptimeMillis < longValue) {
                wait(longValue - uptimeMillis);
                uptimeMillis = SystemClock.uptimeMillis();
            }
        }
        if (this.mException != null) {
            throw new ExecutionException(this.mException);
        }
        if (!this.mResultReceived) {
            throw new TimeoutException();
        }
        return this.mResult;
    }

    public static <E> RequestFuture<E> newFuture() {
        return new RequestFuture<>();
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z11) {
        if (this.mRequest == null) {
            return false;
        }
        if (isDone()) {
            return false;
        }
        this.mRequest.cancel();
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        try {
            return doGet(null);
        } catch (TimeoutException e11) {
            throw new AssertionError(e11);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Request<?> request = this.mRequest;
        if (request == null) {
            return false;
        }
        return request.isCanceled();
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z11;
        if (!this.mResultReceived && this.mException == null) {
            z11 = isCancelled();
        }
        return z11;
    }

    @Override // com.android.volley.Response.ErrorListener
    public synchronized void onErrorResponse(VolleyError volleyError) {
        this.mException = volleyError;
        notifyAll();
    }

    @Override // com.android.volley.Response.Listener
    public synchronized void onResponse(T t11) {
        this.mResultReceived = true;
        this.mResult = t11;
        notifyAll();
    }

    public void setRequest(Request<?> request) {
        this.mRequest = request;
    }

    @Override // java.util.concurrent.Future
    public T get(long j11, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return doGet(Long.valueOf(TimeUnit.MILLISECONDS.convert(j11, timeUnit)));
    }
}
