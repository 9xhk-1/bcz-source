package com.alipay.android.phone.mrpc.core;

import com.alipay.android.phone.mrpc.core.b;
import org.apache.http.client.RedirectHandler;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d extends DefaultHttpClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f10277a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        super(clientConnectionManager, httpParams);
        this.f10277a = bVar;
    }

    @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
    public final ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
        return new f(this);
    }

    @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
    public final HttpContext createHttpContext() {
        c80.a aVar = new c80.a();
        aVar.b("http.authscheme-registry", getAuthSchemes());
        aVar.b("http.cookiespec-registry", getCookieSpecs());
        aVar.b("http.auth.credentials-provider", getCredentialsProvider());
        return aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c80.b, org.apache.http.protocol.BasicHttpProcessor] */
    @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
    public final c80.b createHttpProcessor() {
        org.apache.http.q qVar;
        ?? createHttpProcessor = super.createHttpProcessor();
        qVar = b.f10270c;
        createHttpProcessor.o(qVar);
        createHttpProcessor.o(new b.a(this.f10277a, (byte) 0));
        return createHttpProcessor;
    }

    @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
    public final RedirectHandler createRedirectHandler() {
        return new e(this);
    }
}
