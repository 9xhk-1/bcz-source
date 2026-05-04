package com.igexin.push.f.a;

import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.http.Call;
import com.getui.gtc.base.http.GtHttpClient;
import com.getui.gtc.base.http.Interceptor;
import com.getui.gtc.base.http.LoggerInterceptor;
import com.getui.gtc.base.http.MediaType;
import com.getui.gtc.base.http.Request;
import com.getui.gtc.base.http.RequestBody;
import com.getui.gtc.base.http.Response;
import com.getui.gtc.base.http.crypt.GtRASCryptoInterceptor;
import com.getui.gtc.base.util.NetworkUtil;
import java.io.IOException;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static GtHttpClient f38526a = new GtHttpClient.Builder().addInterceptor(new LoggerInterceptor(com.igexin.c.a.c.a.a().f37180a)).addInterceptor(new Interceptor() { // from class: com.igexin.push.f.a.c.1
        @Override // com.getui.gtc.base.http.Interceptor
        public final Response intercept(Interceptor.Chain chain) throws IOException {
            if (GtcProvider.context() == null || NetworkUtil.isNetWorkAvailable(GtcProvider.context())) {
                return chain.proceed(chain.request());
            }
            throw new IllegalStateException("network is not available");
        }
    }).build();

    /* renamed from: b, reason: collision with root package name */
    private static String f38527b = "c";

    public static void a(String str, byte[] bArr, Call.Callback callback) {
        try {
            f38526a.newCall(new Request.Builder().url(str).method("POST").cryptInterceptor(new GtRASCryptoInterceptor(com.igexin.push.a.f37298j, com.igexin.push.a.f37299k)).body(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), bArr)).build()).enqueue(callback);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }
}
