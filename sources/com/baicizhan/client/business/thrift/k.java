package com.baicizhan.client.business.thrift;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.apache.thrift.transport.TTransportFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class k extends TTransport {

    /* renamed from: l, reason: collision with root package name */
    public static final String f16634l = "Cookie";

    /* renamed from: m, reason: collision with root package name */
    public static final Map<String, t50.q> f16635m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public String f16636a;

    /* renamed from: b, reason: collision with root package name */
    public t f16637b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteArrayOutputStream f16638c;

    /* renamed from: d, reason: collision with root package name */
    public InputStream f16639d;

    /* renamed from: e, reason: collision with root package name */
    public int f16640e;

    /* renamed from: f, reason: collision with root package name */
    public int f16641f;

    /* renamed from: g, reason: collision with root package name */
    public i f16642g;

    /* renamed from: h, reason: collision with root package name */
    public e f16643h;

    /* renamed from: i, reason: collision with root package name */
    public Map<String, String> f16644i;

    /* renamed from: j, reason: collision with root package name */
    public t50.q f16645j;

    /* renamed from: k, reason: collision with root package name */
    public int f16646k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends okhttp3.m {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f16647b;

        public a(final byte[] val$requestByteData) {
            this.f16647b = val$requestByteData;
        }

        @Override // okhttp3.m
        public okhttp3.j b() {
            return okhttp3.j.j("application/x-thrift");
        }

        @Override // okhttp3.m
        public void r(l60.l sink) throws IOException {
            sink.write(this.f16647b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends TTransportFactory {

        /* renamed from: a, reason: collision with root package name */
        public final String f16649a;

        public b(String url) {
            this.f16649a = url;
        }

        @Override // org.apache.thrift.transport.TTransportFactory
        public TTransport getTransport(TTransport trans) {
            try {
                return new k(this.f16649a);
            } catch (TTransportException unused) {
                return null;
            }
        }
    }

    public k(String url) throws TTransportException {
        this.f16636a = null;
        this.f16637b = null;
        this.f16638c = new ByteArrayOutputStream();
        this.f16639d = null;
        this.f16640e = 3000;
        this.f16641f = 10000;
        this.f16642g = null;
        this.f16643h = null;
        this.f16644i = null;
        this.f16645j = null;
        this.f16646k = 1;
        this.f16636a = url;
    }

    public static synchronized t50.q a(int cTime, int rTime) {
        t50.q qVar;
        synchronized (k.class) {
            try {
                String str = cTime + "_" + rTime;
                Map<String, t50.q> map = f16635m;
                qVar = map.get(str);
                if (qVar == null) {
                    qb.c.i("TEnhancedHttpClient", "client not hit %s", str);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    qVar = rb.e.b().a().c(new f()).k(cTime, timeUnit).j0(rTime, timeUnit).f();
                }
                map.put(cTime + "_" + rTime, qVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public final int c(int retryCount) {
        i iVar = this.f16642g;
        return iVar != null ? iVar.a(retryCount, this.f16646k) : this.f16640e;
    }

    @Override // org.apache.thrift.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.f16639d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            this.f16639d = null;
        }
    }

    public final int e(int retryCount) {
        i iVar = this.f16642g;
        return iVar != null ? iVar.b(retryCount, this.f16646k) : this.f16641f;
    }

    public final URL f(int retryCount) throws TTransportException {
        try {
            return this.f16637b != null ? new URL(this.f16637b.a(retryCount, this.f16646k)) : new URL(this.f16636a);
        } catch (MalformedURLException e11) {
            throw new TTransportException(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f8, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0104, code lost:
    
        throw new org.apache.thrift.transport.TTransportException(r1.getMessage());
     */
    @Override // org.apache.thrift.transport.TTransport
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void flush() throws org.apache.thrift.transport.TTransportException {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.thrift.k.flush():void");
    }

    public void i(e cookieInflator) {
        this.f16643h = cookieInflator;
    }

    @Override // org.apache.thrift.transport.TTransport
    public boolean isOpen() {
        return true;
    }

    public void j(int maxRetryCount) {
        this.f16646k = maxRetryCount;
    }

    public void k(i retryPolicy) {
        this.f16642g = retryPolicy;
    }

    @Override // org.apache.thrift.transport.TTransport
    public void open() {
        this.f16645j = a(this.f16640e, this.f16641f);
    }

    @Override // org.apache.thrift.transport.TTransport
    public int read(byte[] buf, int off, int len) throws TTransportException {
        InputStream inputStream = this.f16639d;
        if (inputStream == null) {
            throw new TTransportException("Response buffer is empty, no request.");
        }
        try {
            int read = inputStream.read(buf, off, len);
            if (read != -1) {
                return read;
            }
            throw new TTransportException("No more data available.");
        } catch (IOException e11) {
            throw new TTransportException(e11);
        }
    }

    public void setConnectTimeout(int timeout) {
        this.f16640e = timeout;
    }

    public void setCustomHeader(String key, String value) {
        if (this.f16644i == null) {
            this.f16644i = new HashMap();
        }
        this.f16644i.put(key, value);
    }

    public void setCustomHeaders(Map<String, String> headers) {
        this.f16644i = headers;
    }

    @Override // org.apache.thrift.transport.TTransport
    public void setMethodName(String name) throws TTransportException {
        t tVar = this.f16637b;
        if (tVar == null || !(tVar instanceof com.baicizhan.client.business.thrift.a)) {
            return;
        }
        ((com.baicizhan.client.business.thrift.a) tVar).c(name);
    }

    public void setReadTimeout(int timeout) {
        this.f16641f = timeout;
    }

    @Override // org.apache.thrift.transport.TTransport
    public void write(byte[] buf, int off, int len) {
        this.f16638c.write(buf, off, len);
    }

    public k(t urlPolicy) throws TTransportException {
        this.f16636a = null;
        this.f16637b = null;
        this.f16638c = new ByteArrayOutputStream();
        this.f16639d = null;
        this.f16640e = 3000;
        this.f16641f = 10000;
        this.f16642g = null;
        this.f16643h = null;
        this.f16644i = null;
        this.f16645j = null;
        this.f16646k = 1;
        this.f16637b = urlPolicy;
    }
}
