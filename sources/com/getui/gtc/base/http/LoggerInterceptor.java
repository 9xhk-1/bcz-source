package com.getui.gtc.base.http;

import androidx.collection.SieveCacheKt;
import com.getui.gtc.base.http.Interceptor;
import com.getui.gtc.base.http.Request;
import com.getui.gtc.base.http.Response;
import com.getui.gtc.base.log.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class LoggerInterceptor implements Interceptor {
    public static final int BASIC = 1;
    public static final int BODY = 4;
    static final int FLAG_UNSET = -1;
    public static final int HEADER = 2;
    private final int flags;
    private final Logger logger;

    public LoggerInterceptor(Logger logger) {
        this(logger, 5);
    }

    @Override // com.getui.gtc.base.http.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        long j11;
        Map<String, List<String>> headers;
        Map<String, String> headers2;
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        int logFlags = request.logFlags();
        if (logFlags == -1) {
            logFlags = this.flags;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = logFlags & 1;
        if (i11 == 1) {
            sb2.append(request.method() + " " + request.url().toString() + " " + request.tag() + "\n");
        }
        int i12 = logFlags & 2;
        if (i12 == 2 && (headers2 = request.headers()) != null && headers2.size() > 0) {
            for (Map.Entry<String, String> entry : headers2.entrySet()) {
                sb2.append(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        }
        int i13 = logFlags & 4;
        if (i13 != 4 || request.body() == null || request.body().contentType().charset() == null) {
            j11 = 2147483647L;
        } else if (request.body().contentLength() > SieveCacheKt.NodeLinkMask) {
            j11 = 2147483647L;
            sb2.append("request body content length: " + request.body().contentLength() + "\n");
        } else {
            j11 = 2147483647L;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            request.body().writeTo(byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            sb2.append(new String(byteArray, request.body().contentType().charset()) + "\n");
            newBuilder.body(RequestBody.create(request.body().contentType(), byteArray));
        }
        this.logger.d(sb2.toString());
        Response proceed = chain.proceed(newBuilder.build());
        Response.Builder newBuilder2 = proceed.newBuilder();
        StringBuilder sb3 = new StringBuilder();
        if (i11 == 1) {
            sb3.append(proceed.code() + " " + proceed.message() + " " + request.url().toString() + " " + request.tag() + "\n");
        }
        if (i12 == 2 && (headers = proceed.headers()) != null && headers.size() > 0) {
            for (Map.Entry<String, List<String>> entry2 : headers.entrySet()) {
                if (entry2.getValue() != null && entry2.getValue().size() > 0) {
                    StringBuilder sb4 = new StringBuilder();
                    for (int i14 = 0; i14 < entry2.getValue().size(); i14++) {
                        sb4.append(entry2.getValue().get(i14));
                        if (i14 < entry2.getValue().size() - 1) {
                            sb4.append("; ");
                        }
                    }
                    sb3.append(entry2.getKey() + ": " + sb4.toString() + "\n");
                }
            }
        }
        if (i13 == 4 && proceed.body() != null && proceed.body().contentType().charset() != null) {
            if (proceed.body().contentLength() > j11) {
                sb3.append("response body content length: " + proceed.body().contentLength() + "\n");
            } else {
                byte[] bytes = proceed.body().bytes();
                sb3.append(new String(bytes, proceed.body().charset()) + "\n");
                newBuilder2.body(ResponseBody.create(proceed.body().contentType(), bytes));
            }
        }
        this.logger.d(sb3.toString());
        return newBuilder2.build();
    }

    public LoggerInterceptor(Logger logger, int i11) {
        this.logger = logger;
        this.flags = i11;
    }
}
