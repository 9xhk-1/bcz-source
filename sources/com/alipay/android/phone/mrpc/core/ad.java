package com.alipay.android.phone.mrpc.core;

import java.io.IOException;
import java.net.SocketException;
import javax.net.ssl.SSLException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ad implements HttpRequestRetryHandler {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10267a = ad.class.getSimpleName();

    @Override // org.apache.http.client.HttpRequestRetryHandler
    public boolean retryRequest(IOException iOException, int i11, HttpContext httpContext) {
        if (i11 >= 3) {
            return false;
        }
        if (iOException instanceof NoHttpResponseException) {
            return true;
        }
        return ((iOException instanceof SocketException) || (iOException instanceof SSLException)) && iOException.getMessage() != null && iOException.getMessage().contains("Broken pipe");
    }
}
