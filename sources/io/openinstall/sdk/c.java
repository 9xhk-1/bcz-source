package io.openinstall.sdk;

import io.openinstall.sdk.az;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONException;

/* loaded from: classes8.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public SSLSocketFactory f62599a;

    /* renamed from: b, reason: collision with root package name */
    public HostnameVerifier f62600b;

    public az a(String str, String str2, byte[] bArr, HashMap hashMap) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str + "?" + str2).openConnection();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
        try {
            if (httpURLConnection instanceof HttpsURLConnection) {
                SSLSocketFactory sSLSocketFactory = this.f62599a;
                if (sSLSocketFactory != null) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
                }
                HostnameVerifier hostnameVerifier = this.f62600b;
                if (hostnameVerifier != null) {
                    ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(hostnameVerifier);
                }
            }
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            for (Map.Entry entry : hashMap.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Connection", "close");
            System.currentTimeMillis();
            httpURLConnection.connect();
            c(httpURLConnection, bArr);
            az b11 = b(httpURLConnection);
            httpURLConnection.disconnect();
            return b11;
        } catch (Exception e12) {
            e = e12;
            httpURLConnection2 = httpURLConnection;
            az azVar = new az(az.a.FAIL, -1);
            azVar.f(e.toString());
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            return azVar;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    public final az b(HttpURLConnection httpURLConnection) throws IOException, JSONException {
        if (httpURLConnection.getResponseCode() != 200) {
            int responseCode = httpURLConnection.getResponseCode();
            String responseMessage = httpURLConnection.getResponseMessage();
            az azVar = new az(az.a.FAIL, -1);
            azVar.f(responseCode + " - " + responseMessage);
            return azVar;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                String sb3 = sb2.toString();
                bufferedReader.close();
                return az.b(sb3);
            }
            sb2.append(readLine);
        }
    }

    public final void c(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
}
