package com.huawei.hms.update.http;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
public class HttpRequestHelper implements IHttpRequestHelper {

    /* renamed from: a, reason: collision with root package name */
    private HttpsURLConnection f36476a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f36477b = -1;

    private void a(String str, Context context) throws IOException {
        if (this.f36477b == 0) {
            HMSLog.e("HttpRequestHelper", "Not allowed to repeat open http(s) connection.");
        }
        URLConnection openConnection = new URL(str).openConnection();
        if (openConnection == null) {
            HMSLog.i("HttpRequestHelper", "urlConnection is null");
            return;
        }
        if (!(openConnection instanceof HttpsURLConnection)) {
            HMSLog.i("HttpRequestHelper", "current request is http not allow connection");
            this.f36476a = null;
            return;
        }
        this.f36476a = (HttpsURLConnection) openConnection;
        try {
            h g11 = h.g(context);
            if (g11 != null) {
                this.f36476a.setSSLSocketFactory(g11);
            }
            this.f36476a.setSSLSocketFactory(g11);
            this.f36476a.setHostnameVerifier(new b());
            this.f36476a.setConnectTimeout(30000);
            this.f36476a.setReadTimeout(30000);
            this.f36476a.setDoInput(true);
            this.f36476a.setDoOutput(true);
            this.f36476a.setUseCaches(false);
            this.f36476a.setInstanceFollowRedirects(true);
            this.f36477b = 0;
        } catch (IOException e11) {
            e = e11;
            HMSLog.e("HttpRequestHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
            throw new IOException("Failed to create SSLSocketFactory.");
        } catch (IllegalAccessException e12) {
            e = e12;
            HMSLog.e("HttpRequestHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
            throw new IOException("Failed to create SSLSocketFactory.");
        } catch (IllegalArgumentException e13) {
            e = e13;
            HMSLog.e("HttpRequestHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
            throw new IOException("Failed to create SSLSocketFactory.");
        } catch (KeyManagementException e14) {
            e = e14;
            HMSLog.e("HttpRequestHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
            throw new IOException("Failed to create SSLSocketFactory.");
        } catch (KeyStoreException e15) {
            e = e15;
            HMSLog.e("HttpRequestHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
            throw new IOException("Failed to create SSLSocketFactory.");
        } catch (NoSuchAlgorithmException e16) {
            e = e16;
            HMSLog.e("HttpRequestHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
            throw new IOException("Failed to create SSLSocketFactory.");
        } catch (CertificateException e17) {
            e = e17;
            HMSLog.e("HttpRequestHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
            throw new IOException("Failed to create SSLSocketFactory.");
        }
    }

    @Override // com.huawei.hms.update.http.IHttpRequestHelper
    public void cancel() {
        this.f36477b = 1;
    }

    @Override // com.huawei.hms.update.http.IHttpRequestHelper
    public void close() {
        this.f36477b = -1;
        HttpsURLConnection httpsURLConnection = this.f36476a;
        if (httpsURLConnection != null) {
            httpsURLConnection.disconnect();
        }
    }

    @Override // com.huawei.hms.update.http.IHttpRequestHelper
    public int get(String str, OutputStream outputStream, Context context) throws IOException, CanceledException {
        return get(str, outputStream, 0, 0, context);
    }

    @Override // com.huawei.hms.update.http.IHttpRequestHelper
    public int post(String str, InputStream inputStream, OutputStream outputStream, Context context) throws IOException, CanceledException {
        InputStream inputStream2;
        OutputStream outputStream2 = null;
        r0 = null;
        r0 = null;
        InputStream inputStream3 = null;
        try {
            a(str, context);
            HttpsURLConnection httpsURLConnection = this.f36476a;
            if (httpsURLConnection == null) {
                HMSLog.i("HttpRequestHelper", "mConnection is null");
                IOUtils.closeQuietly((InputStream) null);
                IOUtils.closeQuietly((OutputStream) null);
                return -1;
            }
            httpsURLConnection.setRequestMethod("POST");
            OutputStream outputStream3 = this.f36476a.getOutputStream();
            try {
                a(inputStream, outputStream3);
                outputStream3.flush();
                int responseCode = this.f36476a.getResponseCode();
                if (responseCode == 200 && outputStream != null) {
                    inputStream3 = this.f36476a.getInputStream();
                    a(new BufferedInputStream(inputStream3, 4096), outputStream);
                    outputStream.flush();
                }
                IOUtils.closeQuietly(inputStream3);
                IOUtils.closeQuietly(outputStream3);
                return responseCode;
            } catch (Throwable th2) {
                InputStream inputStream4 = inputStream3;
                outputStream2 = outputStream3;
                th = th2;
                inputStream2 = inputStream4;
                IOUtils.closeQuietly(inputStream2);
                IOUtils.closeQuietly(outputStream2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = null;
        }
    }

    @Override // com.huawei.hms.update.http.IHttpRequestHelper
    public int get(String str, OutputStream outputStream, int i11, int i12, Context context) throws IOException, CanceledException {
        InputStream inputStream = null;
        try {
            a(str, context);
            HttpsURLConnection httpsURLConnection = this.f36476a;
            if (httpsURLConnection == null) {
                HMSLog.i("HttpRequestHelper", "mConnection is null");
                IOUtils.closeQuietly((InputStream) null);
                return -1;
            }
            httpsURLConnection.setRequestMethod("GET");
            if (i11 > 0) {
                this.f36476a.addRequestProperty("Range", "bytes=" + i11 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i12);
            }
            int responseCode = this.f36476a.getResponseCode();
            if ((i11 > 0 && responseCode == 206) || (i11 <= 0 && responseCode == 200)) {
                inputStream = this.f36476a.getInputStream();
                a(new BufferedInputStream(inputStream, 4096), outputStream);
                if (outputStream != null) {
                    outputStream.flush();
                }
            }
            return responseCode;
        } finally {
            IOUtils.closeQuietly((InputStream) null);
        }
    }

    private void a(InputStream inputStream, OutputStream outputStream) throws IOException, CanceledException {
        if (inputStream != null && outputStream != null) {
            byte[] bArr = new byte[4096];
            do {
                int read = inputStream.read(bArr);
                if (-1 == read) {
                    return;
                } else {
                    outputStream.write(bArr, 0, read);
                }
            } while (this.f36477b != 1);
            throw new CanceledException("HTTP(s) request was canceled.");
        }
        HMSLog.w("HttpRequestHelper", "input or output is null");
    }
}
