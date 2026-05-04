package com.alipay.android.phone.mrpc.core;

import org.apache.http.HttpResponse;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e extends DefaultRedirectHandler {

    /* renamed from: a, reason: collision with root package name */
    public int f10278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f10279b;

    public e(d dVar) {
        this.f10279b = dVar;
    }

    @Override // org.apache.http.impl.client.DefaultRedirectHandler, org.apache.http.client.RedirectHandler
    public final boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
        int statusCode;
        this.f10278a++;
        boolean isRedirectRequested = super.isRedirectRequested(httpResponse, httpContext);
        if (isRedirectRequested || this.f10278a >= 5 || !((statusCode = httpResponse.n().getStatusCode()) == 301 || statusCode == 302)) {
            return isRedirectRequested;
        }
        return true;
    }
}
