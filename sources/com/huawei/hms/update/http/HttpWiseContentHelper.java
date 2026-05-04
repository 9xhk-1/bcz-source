package com.huawei.hms.update.http;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.HttpsURLConnection;
import wr.h;
import xr.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HttpWiseContentHelper {
    private static String a(Context context, String str) throws IOException {
        HttpsURLConnection b11 = b(context, str);
        if (b11 == null) {
            HMSLog.e("HttpWiseContentHelper", "<internalGetContent> connection is null");
            return "";
        }
        b11.setRequestMethod("GET");
        int responseCode = b11.getResponseCode();
        if (responseCode == 206 || responseCode == 200) {
            InputStream inputStream = b11.getInputStream();
            byte[] a11 = a(inputStream);
            inputStream.close();
            return new String(a11, "UTF-8");
        }
        HMSLog.e("HttpWiseContentHelper", "<internalGetContent> error statusCode: " + responseCode);
        return "";
    }

    private static HttpsURLConnection b(Context context, String str) throws IOException {
        URLConnection openConnection = new URL(str).openConnection();
        if (openConnection == null) {
            HMSLog.i("HttpWiseContentHelper", "urlConnection is null");
            return null;
        }
        if (!(openConnection instanceof HttpsURLConnection)) {
            HMSLog.i("HttpWiseContentHelper", "current request is http not allow connection");
            return null;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
        try {
            h g11 = h.g(context);
            if (g11 != null) {
                httpsURLConnection.setSSLSocketFactory(g11);
            }
            httpsURLConnection.setSSLSocketFactory(g11);
            httpsURLConnection.setHostnameVerifier(new b());
            httpsURLConnection.setConnectTimeout(30000);
            httpsURLConnection.setReadTimeout(30000);
            return httpsURLConnection;
        } catch (IOException e11) {
            e = e11;
            HMSLog.e("HttpWiseContentHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
            throw new IOException("Failed to create SSLSocketFactory.");
        } catch (IllegalAccessException e12) {
            e = e12;
            HMSLog.e("HttpWiseContentHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
            throw new IOException("Failed to create SSLSocketFactory.");
        } catch (IllegalArgumentException e13) {
            e = e13;
            HMSLog.e("HttpWiseContentHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
            throw new IOException("Failed to create SSLSocketFactory.");
        } catch (KeyManagementException e14) {
            e = e14;
            HMSLog.e("HttpWiseContentHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
            throw new IOException("Failed to create SSLSocketFactory.");
        } catch (KeyStoreException e15) {
            e = e15;
            HMSLog.e("HttpWiseContentHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
            throw new IOException("Failed to create SSLSocketFactory.");
        } catch (NoSuchAlgorithmException e16) {
            e = e16;
            HMSLog.e("HttpWiseContentHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
            throw new IOException("Failed to create SSLSocketFactory.");
        } catch (CertificateException e17) {
            e = e17;
            HMSLog.e("HttpWiseContentHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
            throw new IOException("Failed to create SSLSocketFactory.");
        }
    }

    public static String syncGetContent(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            HMSLog.e("HttpWiseContentHelper", "<syncGetContent> context or url is null.");
            return "";
        }
        try {
            return a(context, str);
        } catch (IOException unused) {
            HMSLog.e("HttpWiseContentHelper", "<syncGetContent> IOException failed ");
            return "";
        } catch (RuntimeException unused2) {
            HMSLog.e("HttpWiseContentHelper", "<syncGetContent> RuntimeException failed");
            return "";
        }
    }

    private static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
