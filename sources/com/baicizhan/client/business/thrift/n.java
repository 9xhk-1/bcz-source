package com.baicizhan.client.business.thrift;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.thrift.TServiceClient;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class n<Client extends TServiceClient, T> extends ThriftRequest<Client, T> implements Future<T> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16664a;

    /* renamed from: b, reason: collision with root package name */
    public T f16665b;

    /* renamed from: c, reason: collision with root package name */
    public Exception f16666c;

    public n(String domain) {
        super(domain);
        this.f16664a = false;
        this.f16666c = null;
    }

    public final synchronized T a(Long timeoutMs) throws InterruptedException, ExecutionException, TimeoutException {
        if (this.f16666c != null) {
            throw new ExecutionException(this.f16666c);
        }
        if (this.f16664a) {
            return this.f16665b;
        }
        if (timeoutMs == null) {
            qb.c.b("leijie", "wait", new Object[0]);
            wait();
        } else if (timeoutMs.longValue() > 0) {
            wait(timeoutMs.longValue());
        }
        qb.c.b("leijie", "wait over " + this.f16666c + j2.O + this.f16664a + j2.O + this.f16664a, new Object[0]);
        if (this.f16666c != null) {
            throw new ExecutionException(this.f16666c);
        }
        if (!this.f16664a) {
            throw new TimeoutException();
        }
        return this.f16665b;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        cancel();
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        try {
            return a(null);
        } catch (TimeoutException e11) {
            throw new AssertionError(e11);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    @Override // com.baicizhan.client.business.thrift.ThriftRequest
    public void onError(Exception exception) {
        synchronized (this) {
            this.f16666c = exception;
            notifyAll();
        }
    }

    @Override // com.baicizhan.client.business.thrift.ThriftRequest
    public void onResult(T t11) {
        synchronized (this) {
            this.f16664a = true;
            this.f16665b = t11;
            notifyAll();
        }
    }

    @Override // java.util.concurrent.Future
    public T get(long timeout, @NonNull TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return a(Long.valueOf(TimeUnit.MILLISECONDS.convert(timeout, unit)));
    }
}
