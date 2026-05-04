package com.zx.a.I8b7;

import com.zx.a.I8b7.n0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class o implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final o2 f46629a;

    public o(o2 o2Var) {
        this.f46629a = o2Var;
    }

    @Override // com.zx.a.I8b7.n0
    public t1 a(n0.a aVar) throws IOException {
        j1 j1Var = (j1) aVar;
        q1 q1Var = j1Var.f46552c;
        HttpURLConnection httpURLConnection = j1Var.f46553d;
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(q1Var.f46662d != null);
        httpURLConnection.setConnectTimeout(this.f46629a.f46637f);
        httpURLConnection.setReadTimeout(this.f46629a.f46638g);
        httpURLConnection.setInstanceFollowRedirects(this.f46629a.f46636e);
        this.f46629a.getClass();
        httpURLConnection.setUseCaches(false);
        if ("https".equalsIgnoreCase(q1Var.f46659a.getProtocol())) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            SSLSocketFactory sSLSocketFactory = this.f46629a.f46634c;
            if (sSLSocketFactory != null) {
                httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
            }
            HostnameVerifier hostnameVerifier = this.f46629a.f46635d;
            if (hostnameVerifier != null) {
                httpsURLConnection.setHostnameVerifier(hostnameVerifier);
            }
        }
        Map<String, String> map = q1Var.f46661c;
        if (map != null && map.size() > 0) {
            for (String str : map.keySet()) {
                httpURLConnection.setRequestProperty(str, map.get(str));
            }
        }
        httpURLConnection.connect();
        return j1Var.a(q1Var, httpURLConnection);
    }
}
