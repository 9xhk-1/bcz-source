package com.baicizhan.client.business.thrift;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class q implements Comparable<q> {

    /* renamed from: a, reason: collision with root package name */
    public ThriftRequest<?, ?> f16669a;

    public q(ThriftRequest<?, ?> request) {
        this.f16669a = request;
    }

    public synchronized void a() {
        ThriftRequest<?, ?> thriftRequest = this.f16669a;
        if (thriftRequest != null) {
            thriftRequest.cancel();
            this.f16669a = null;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull q another) {
        ThriftRequest<?, ?> thriftRequest = this.f16669a;
        if (thriftRequest == null || another.f16669a == null) {
            return 0;
        }
        return thriftRequest.getPriority().ordinal() - another.f16669a.getPriority().ordinal();
    }

    public String c() {
        ThriftRequest<?, ?> thriftRequest = this.f16669a;
        if (thriftRequest == null) {
            return null;
        }
        return thriftRequest.getTag();
    }

    public synchronized boolean d() {
        return this.f16669a == null;
    }

    public void e(Thread thread, r proxy) {
        ThriftRequest<?, ?> thriftRequest;
        synchronized (this) {
            thriftRequest = this.f16669a;
        }
        if (thriftRequest != null) {
            thriftRequest.thread = thread;
            thriftRequest.execute(proxy);
            thriftRequest.thread = null;
            proxy.f(this);
        }
    }
}
