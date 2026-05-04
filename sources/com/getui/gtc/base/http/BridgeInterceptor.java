package com.getui.gtc.base.http;

import android.net.Network;
import android.util.Log;
import c80.f;
import com.getui.gtc.base.http.Interceptor;
import com.getui.gtc.base.http.Request;
import com.getui.gtc.base.http.Response;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/* loaded from: classes6.dex */
public class BridgeInterceptor implements Interceptor {
    @Override // com.getui.gtc.base.http.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        URLConnection openConnection;
        boolean z11;
        Request request = chain.request();
        Request.Builder builder = new Request.Builder(request);
        Network network = request.network();
        if (network != null) {
            Log.d("GTC", "gtc h use n");
            openConnection = network.openConnection(request.url());
        } else {
            openConnection = request.url().openConnection();
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        RequestBody body = request.body();
        if (body != null) {
            MediaType contentType = body.contentType();
            if (contentType != null) {
                builder.addHeader("Content-Type", contentType.toString());
            }
            long contentLength = body.contentLength();
            if (contentLength != -1) {
                builder.addHeader("Content-Length", Long.toString(contentLength)).removeHeader("Transfer-Encoding");
            } else {
                builder.addHeader("Transfer-Encoding", f.f8329r).removeHeader("Content-Length");
            }
        }
        if (request.header("Host") == null) {
            builder.addHeader("Host", request.url().getHost());
        }
        if (request.header("Connection") == null) {
            builder.addHeader("Connection", "Keep-Alive");
        }
        if (request.header("Accept-Encoding") == null && request.header("Range") == null) {
            builder.addHeader("Accept-Encoding", "gzip");
            z11 = true;
        } else {
            z11 = false;
        }
        Response proceed = ((RealInterceptorChain) chain).proceed(builder.build(), httpURLConnection);
        Response.Builder request2 = new Response.Builder(proceed).request(request);
        if (z11 && "gzip".equalsIgnoreCase(proceed.header("Content-Encoding")) && proceed.body() != null) {
            request2.body(ResponseBody.create(proceed.body().contentType(), -1L, new GZIPInputStream(proceed.body().byteStream()))).removeHeader("Content-Encoding").removeHeader("Content-Length");
        }
        return request2.build();
    }
}
