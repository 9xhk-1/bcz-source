package com.getui.gtc.base.http;

import com.getui.gtc.base.http.Interceptor;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;

/* loaded from: classes6.dex */
public class RealInterceptorChain implements Interceptor.Chain {
    private final HttpURLConnection connection;
    private final int index;
    private final List<Interceptor> interceptors;
    private final Request request;

    public RealInterceptorChain(List<Interceptor> list, HttpURLConnection httpURLConnection, int i11, Request request) {
        this.interceptors = list;
        this.connection = httpURLConnection;
        this.index = i11;
        this.request = request;
    }

    @Override // com.getui.gtc.base.http.Interceptor.Chain
    public HttpURLConnection connection() {
        return this.connection;
    }

    @Override // com.getui.gtc.base.http.Interceptor.Chain
    public Response proceed(Request request) throws IOException {
        return proceed(request, this.connection);
    }

    @Override // com.getui.gtc.base.http.Interceptor.Chain
    public Request request() {
        return this.request;
    }

    public Response proceed(Request request, HttpURLConnection httpURLConnection) throws IOException {
        if (this.index >= this.interceptors.size()) {
            throw new AssertionError();
        }
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.interceptors, httpURLConnection, this.index + 1, request);
        Interceptor interceptor = this.interceptors.get(this.index);
        Response intercept = interceptor.intercept(realInterceptorChain);
        if (intercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (intercept.body() != null) {
            return intercept;
        }
        throw new IllegalStateException("interceptor " + interceptor + " returned a response with no body");
    }
}
