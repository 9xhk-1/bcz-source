package com.mob.tools.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class HttpConnectionImpl23 implements HttpConnection {

    /* renamed from: a, reason: collision with root package name */
    private HttpURLConnection f41317a;

    public HttpConnectionImpl23(HttpURLConnection httpURLConnection) {
        this.f41317a = httpURLConnection;
    }

    @Override // com.mob.tools.network.HttpConnection
    public InputStream getErrorStream() throws IOException {
        return this.f41317a.getErrorStream();
    }

    @Override // com.mob.tools.network.HttpConnection
    public Map<String, List<String>> getHeaderFields() throws IOException {
        return this.f41317a.getHeaderFields();
    }

    @Override // com.mob.tools.network.HttpConnection
    public InputStream getInputStream() throws IOException {
        return this.f41317a.getInputStream();
    }

    @Override // com.mob.tools.network.HttpConnection
    public int getResponseCode() throws IOException {
        return this.f41317a.getResponseCode();
    }
}
