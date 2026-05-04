package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class q implements Callable<u> {

    /* renamed from: e, reason: collision with root package name */
    public static final HttpRequestRetryHandler f10314e = new ad();

    /* renamed from: a, reason: collision with root package name */
    public l f10315a;

    /* renamed from: b, reason: collision with root package name */
    public Context f10316b;

    /* renamed from: c, reason: collision with root package name */
    public o f10317c;

    /* renamed from: d, reason: collision with root package name */
    public String f10318d;

    /* renamed from: f, reason: collision with root package name */
    public HttpUriRequest f10319f;

    /* renamed from: i, reason: collision with root package name */
    public CookieManager f10322i;

    /* renamed from: j, reason: collision with root package name */
    public w60.a f10323j;

    /* renamed from: k, reason: collision with root package name */
    public HttpHost f10324k;

    /* renamed from: l, reason: collision with root package name */
    public URL f10325l;

    /* renamed from: q, reason: collision with root package name */
    public String f10330q;

    /* renamed from: g, reason: collision with root package name */
    public HttpContext f10320g = new c80.a();

    /* renamed from: h, reason: collision with root package name */
    public CookieStore f10321h = new BasicCookieStore();

    /* renamed from: m, reason: collision with root package name */
    public int f10326m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10327n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10328o = false;

    /* renamed from: p, reason: collision with root package name */
    public String f10329p = null;

    public q(l lVar, o oVar) {
        this.f10315a = lVar;
        this.f10316b = lVar.f10292a;
        this.f10317c = oVar;
    }

    public static long a(String[] strArr) {
        String str;
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (fx.d.f52395b.equalsIgnoreCase(strArr[i11]) && (str = strArr[i11 + 1]) != null) {
                try {
                    return Long.parseLong(str);
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return 0L;
    }

    public static long b(HttpResponse httpResponse) {
        org.apache.http.e w11 = httpResponse.w("Cache-Control");
        if (w11 != null) {
            String[] split = w11.getValue().split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (split.length >= 2) {
                try {
                    return a(split);
                } catch (NumberFormatException unused) {
                }
            }
        }
        org.apache.http.e w12 = httpResponse.w("Expires");
        if (w12 != null) {
            return b.b(w12.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    private HttpUriRequest c() {
        HttpUriRequest httpUriRequest = this.f10319f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        if (this.f10323j == null) {
            byte[] b11 = this.f10317c.b();
            String b12 = this.f10317c.b("gzip");
            if (b11 != null) {
                if (TextUtils.equals(b12, n6.m.f74525c)) {
                    this.f10323j = b.a(b11);
                } else {
                    this.f10323j = new w60.d(b11);
                }
                this.f10323j.i(this.f10317c.c());
            }
        }
        w60.a aVar = this.f10323j;
        if (aVar != null) {
            HttpPost httpPost = new HttpPost(b());
            httpPost.setEntity(aVar);
            this.f10319f = httpPost;
        } else {
            this.f10319f = new HttpGet(b());
        }
        return this.f10319f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0143 A[Catch: Exception -> 0x005e, NullPointerException -> 0x0061, IOException -> 0x0064, UnknownHostException -> 0x0067, HttpHostConnectException -> 0x006a, NoHttpResponseException -> 0x006d, SocketTimeoutException -> 0x0070, ConnectTimeoutException -> 0x0073, ConnectionPoolTimeoutException -> 0x0076, SSLException -> 0x0079, SSLPeerUnverifiedException -> 0x007c, SSLHandshakeException -> 0x007f, URISyntaxException -> 0x0082, HttpException -> 0x0085, TryCatch #3 {HttpException -> 0x0085, NullPointerException -> 0x0061, SocketTimeoutException -> 0x0070, URISyntaxException -> 0x0082, UnknownHostException -> 0x0067, SSLHandshakeException -> 0x007f, SSLPeerUnverifiedException -> 0x007c, SSLException -> 0x0079, NoHttpResponseException -> 0x006d, ConnectionPoolTimeoutException -> 0x0076, ConnectTimeoutException -> 0x0073, HttpHostConnectException -> 0x006a, IOException -> 0x0064, Exception -> 0x005e, blocks: (B:3:0x0016, B:5:0x0024, B:7:0x0028, B:9:0x002c, B:11:0x0032, B:14:0x0038, B:16:0x0040, B:18:0x0046, B:19:0x004a, B:21:0x0050, B:23:0x0088, B:25:0x009c, B:27:0x00b1, B:29:0x00dd, B:31:0x00ec, B:33:0x00f2, B:35:0x00fc, B:37:0x0105, B:39:0x0111, B:42:0x011b, B:45:0x013b, B:47:0x0143, B:48:0x0150, B:50:0x0176, B:51:0x017d, B:53:0x0183, B:54:0x0187, B:56:0x018d, B:59:0x0199, B:62:0x01c8, B:68:0x01e4, B:73:0x01fd, B:74:0x0216, B:76:0x0217, B:78:0x021f, B:80:0x0225, B:83:0x0231, B:85:0x0235, B:90:0x0245, B:92:0x024d, B:94:0x0257, B:97:0x0123, B:101:0x025b, B:105:0x025f, B:106:0x026b), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0176 A[Catch: Exception -> 0x005e, NullPointerException -> 0x0061, IOException -> 0x0064, UnknownHostException -> 0x0067, HttpHostConnectException -> 0x006a, NoHttpResponseException -> 0x006d, SocketTimeoutException -> 0x0070, ConnectTimeoutException -> 0x0073, ConnectionPoolTimeoutException -> 0x0076, SSLException -> 0x0079, SSLPeerUnverifiedException -> 0x007c, SSLHandshakeException -> 0x007f, URISyntaxException -> 0x0082, HttpException -> 0x0085, TryCatch #3 {HttpException -> 0x0085, NullPointerException -> 0x0061, SocketTimeoutException -> 0x0070, URISyntaxException -> 0x0082, UnknownHostException -> 0x0067, SSLHandshakeException -> 0x007f, SSLPeerUnverifiedException -> 0x007c, SSLException -> 0x0079, NoHttpResponseException -> 0x006d, ConnectionPoolTimeoutException -> 0x0076, ConnectTimeoutException -> 0x0073, HttpHostConnectException -> 0x006a, IOException -> 0x0064, Exception -> 0x005e, blocks: (B:3:0x0016, B:5:0x0024, B:7:0x0028, B:9:0x002c, B:11:0x0032, B:14:0x0038, B:16:0x0040, B:18:0x0046, B:19:0x004a, B:21:0x0050, B:23:0x0088, B:25:0x009c, B:27:0x00b1, B:29:0x00dd, B:31:0x00ec, B:33:0x00f2, B:35:0x00fc, B:37:0x0105, B:39:0x0111, B:42:0x011b, B:45:0x013b, B:47:0x0143, B:48:0x0150, B:50:0x0176, B:51:0x017d, B:53:0x0183, B:54:0x0187, B:56:0x018d, B:59:0x0199, B:62:0x01c8, B:68:0x01e4, B:73:0x01fd, B:74:0x0216, B:76:0x0217, B:78:0x021f, B:80:0x0225, B:83:0x0231, B:85:0x0235, B:90:0x0245, B:92:0x024d, B:94:0x0257, B:97:0x0123, B:101:0x025b, B:105:0x025f, B:106:0x026b), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0183 A[Catch: Exception -> 0x005e, NullPointerException -> 0x0061, IOException -> 0x0064, UnknownHostException -> 0x0067, HttpHostConnectException -> 0x006a, NoHttpResponseException -> 0x006d, SocketTimeoutException -> 0x0070, ConnectTimeoutException -> 0x0073, ConnectionPoolTimeoutException -> 0x0076, SSLException -> 0x0079, SSLPeerUnverifiedException -> 0x007c, SSLHandshakeException -> 0x007f, URISyntaxException -> 0x0082, HttpException -> 0x0085, TryCatch #3 {HttpException -> 0x0085, NullPointerException -> 0x0061, SocketTimeoutException -> 0x0070, URISyntaxException -> 0x0082, UnknownHostException -> 0x0067, SSLHandshakeException -> 0x007f, SSLPeerUnverifiedException -> 0x007c, SSLException -> 0x0079, NoHttpResponseException -> 0x006d, ConnectionPoolTimeoutException -> 0x0076, ConnectTimeoutException -> 0x0073, HttpHostConnectException -> 0x006a, IOException -> 0x0064, Exception -> 0x005e, blocks: (B:3:0x0016, B:5:0x0024, B:7:0x0028, B:9:0x002c, B:11:0x0032, B:14:0x0038, B:16:0x0040, B:18:0x0046, B:19:0x004a, B:21:0x0050, B:23:0x0088, B:25:0x009c, B:27:0x00b1, B:29:0x00dd, B:31:0x00ec, B:33:0x00f2, B:35:0x00fc, B:37:0x0105, B:39:0x0111, B:42:0x011b, B:45:0x013b, B:47:0x0143, B:48:0x0150, B:50:0x0176, B:51:0x017d, B:53:0x0183, B:54:0x0187, B:56:0x018d, B:59:0x0199, B:62:0x01c8, B:68:0x01e4, B:73:0x01fd, B:74:0x0216, B:76:0x0217, B:78:0x021f, B:80:0x0225, B:83:0x0231, B:85:0x0235, B:90:0x0245, B:92:0x024d, B:94:0x0257, B:97:0x0123, B:101:0x025b, B:105:0x025f, B:106:0x026b), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123 A[Catch: Exception -> 0x005e, NullPointerException -> 0x0061, IOException -> 0x0064, UnknownHostException -> 0x0067, HttpHostConnectException -> 0x006a, NoHttpResponseException -> 0x006d, SocketTimeoutException -> 0x0070, ConnectTimeoutException -> 0x0073, ConnectionPoolTimeoutException -> 0x0076, SSLException -> 0x0079, SSLPeerUnverifiedException -> 0x007c, SSLHandshakeException -> 0x007f, URISyntaxException -> 0x0082, HttpException -> 0x0085, TryCatch #3 {HttpException -> 0x0085, NullPointerException -> 0x0061, SocketTimeoutException -> 0x0070, URISyntaxException -> 0x0082, UnknownHostException -> 0x0067, SSLHandshakeException -> 0x007f, SSLPeerUnverifiedException -> 0x007c, SSLException -> 0x0079, NoHttpResponseException -> 0x006d, ConnectionPoolTimeoutException -> 0x0076, ConnectTimeoutException -> 0x0073, HttpHostConnectException -> 0x006a, IOException -> 0x0064, Exception -> 0x005e, blocks: (B:3:0x0016, B:5:0x0024, B:7:0x0028, B:9:0x002c, B:11:0x0032, B:14:0x0038, B:16:0x0040, B:18:0x0046, B:19:0x004a, B:21:0x0050, B:23:0x0088, B:25:0x009c, B:27:0x00b1, B:29:0x00dd, B:31:0x00ec, B:33:0x00f2, B:35:0x00fc, B:37:0x0105, B:39:0x0111, B:42:0x011b, B:45:0x013b, B:47:0x0143, B:48:0x0150, B:50:0x0176, B:51:0x017d, B:53:0x0183, B:54:0x0187, B:56:0x018d, B:59:0x0199, B:62:0x01c8, B:68:0x01e4, B:73:0x01fd, B:74:0x0216, B:76:0x0217, B:78:0x021f, B:80:0x0225, B:83:0x0231, B:85:0x0235, B:90:0x0245, B:92:0x024d, B:94:0x0257, B:97:0x0123, B:101:0x025b, B:105:0x025f, B:106:0x026b), top: B:2:0x0016 }] */
    @Override // java.util.concurrent.Callable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.alipay.android.phone.mrpc.core.u call() {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mrpc.core.q.call():com.alipay.android.phone.mrpc.core.u");
    }

    private void e() {
        HttpUriRequest httpUriRequest = this.f10319f;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    private String f() {
        if (!TextUtils.isEmpty(this.f10330q)) {
            return this.f10330q;
        }
        String b11 = this.f10317c.b("operationType");
        this.f10330q = b11;
        return b11;
    }

    private int g() {
        URL h11 = h();
        return h11.getPort() == -1 ? h11.getDefaultPort() : h11.getPort();
    }

    private URL h() {
        URL url = this.f10325l;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.f10317c.a());
        this.f10325l = url2;
        return url2;
    }

    private CookieManager i() {
        CookieManager cookieManager = this.f10322i;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        this.f10322i = cookieManager2;
        return cookieManager2;
    }

    public static HttpUrlHeader a(HttpResponse httpResponse) {
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (org.apache.http.e eVar : httpResponse.x()) {
            httpUrlHeader.setHead(eVar.getName(), eVar.getValue());
        }
        return httpUrlHeader;
    }

    private URI b() {
        String a11 = this.f10317c.a();
        String str = this.f10318d;
        if (str != null) {
            a11 = str;
        }
        if (a11 != null) {
            return new URI(a11);
        }
        throw new RuntimeException("url should not be null");
    }

    public final o a() {
        return this.f10317c;
    }

    private u a(HttpResponse httpResponse, int i11, String str) {
        String str2;
        Thread.currentThread().getId();
        HttpEntity entity = httpResponse.getEntity();
        ByteArrayOutputStream byteArrayOutputStream = null;
        String str3 = null;
        if (entity == null || httpResponse.n().getStatusCode() != 200) {
            if (entity == null) {
                httpResponse.n().getStatusCode();
            }
            return null;
        }
        Thread.currentThread().getId();
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                a(entity, byteArrayOutputStream2);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                this.f10328o = false;
                this.f10315a.c(System.currentTimeMillis() - currentTimeMillis);
                this.f10315a.a(byteArray.length);
                p pVar = new p(a(httpResponse), i11, str, byteArray);
                long b11 = b(httpResponse);
                org.apache.http.e contentType = httpResponse.getEntity().getContentType();
                if (contentType != null) {
                    HashMap<String, String> a11 = a(contentType.getValue());
                    str3 = a11.get("charset");
                    str2 = a11.get("Content-Type");
                } else {
                    str2 = null;
                }
                pVar.b(str2);
                pVar.a(str3);
                pVar.a(System.currentTimeMillis());
                pVar.b(b11);
                try {
                    byteArrayOutputStream2.close();
                    return pVar;
                } catch (IOException e11) {
                    throw new RuntimeException("ArrayOutputStream close error!", e11.getCause());
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e12) {
                        throw new RuntimeException("ArrayOutputStream close error!", e12.getCause());
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static HashMap<String, String> a(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split(com.alipay.sdk.m.u.i.f11097b)) {
            String[] split = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
            hashMap.put(split[0], split[1]);
        }
        return hashMap;
    }

    private void a(HttpEntity httpEntity, OutputStream outputStream) {
        InputStream a11 = b.a(httpEntity);
        httpEntity.c0();
        try {
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = a11.read(bArr);
                    if (read == -1 || this.f10317c.h()) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    this.f10317c.f();
                }
                outputStream.flush();
                r.a(a11);
            } catch (Exception e11) {
                e11.getCause();
                throw new IOException("HttpWorker Request Error!" + e11.getLocalizedMessage());
            }
        } catch (Throwable th2) {
            r.a(a11);
            throw th2;
        }
    }
}
