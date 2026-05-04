package com.baicizhan.client.business.thrift;

import java.lang.ref.WeakReference;
import org.apache.thrift.TServiceClient;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class d<C, Client extends TServiceClient, Result> extends ThriftRequest<Client, Result> {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<C> f16596a;

    public d(String domain, C context) {
        super(domain);
        this.f16596a = new WeakReference<>(context);
    }

    public abstract Result a(C context, Client client) throws Exception;

    public abstract void b(C context, Exception exception);

    public abstract void c(C context, Result result);

    @Override // com.baicizhan.client.business.thrift.ThriftRequest
    public void cancel() {
        super.cancel();
        this.f16596a.clear();
    }

    @Override // com.baicizhan.client.business.thrift.ThriftRequest
    public final Result doInBackground(Client client) throws Exception {
        C c11 = this.f16596a.get();
        if (c11 == null) {
            return null;
        }
        return a(c11, client);
    }

    @Override // com.baicizhan.client.business.thrift.ThriftRequest
    public final void onError(Exception exception) {
        C c11 = this.f16596a.get();
        if (c11 == null) {
            return;
        }
        b(c11, exception);
    }

    @Override // com.baicizhan.client.business.thrift.ThriftRequest
    public final void onResult(Result result) {
        C c11 = this.f16596a.get();
        if (c11 == null) {
            return;
        }
        c(c11, result);
    }
}
