package na;

import com.baicizhan.client.business.thrift.e;
import com.baicizhan.client.business.thrift.i;
import com.baicizhan.client.business.thrift.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.apache.thrift.transport.TTransportFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends TTransport {

    /* renamed from: k, reason: collision with root package name */
    public static final String f74996k = "Cookie";

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f74997l = true;

    /* renamed from: m, reason: collision with root package name */
    public static final int f74998m = 256;

    /* renamed from: a, reason: collision with root package name */
    public String f74999a;

    /* renamed from: b, reason: collision with root package name */
    public d f75000b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteArrayOutputStream f75001c;

    /* renamed from: d, reason: collision with root package name */
    public InputStream f75002d;

    /* renamed from: e, reason: collision with root package name */
    public int f75003e;

    /* renamed from: f, reason: collision with root package name */
    public int f75004f;

    /* renamed from: g, reason: collision with root package name */
    public i f75005g;

    /* renamed from: h, reason: collision with root package name */
    public e f75006h;

    /* renamed from: i, reason: collision with root package name */
    public Map<String, String> f75007i;

    /* renamed from: j, reason: collision with root package name */
    public int f75008j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: na.a$a, reason: collision with other inner class name */
    public static class C0908a extends TTransportFactory {

        /* renamed from: a, reason: collision with root package name */
        public final String f75009a;

        public C0908a(String url) {
            this.f75009a = url;
        }

        @Override // org.apache.thrift.transport.TTransportFactory
        public TTransport getTransport(TTransport trans) {
            try {
                return new k(this.f75009a);
            } catch (TTransportException unused) {
                return null;
            }
        }
    }

    public a(String url) throws TTransportException {
        this.f74999a = null;
        this.f75000b = null;
        this.f75001c = new ByteArrayOutputStream();
        this.f75002d = null;
        this.f75003e = 5000;
        this.f75004f = 10000;
        this.f75005g = null;
        this.f75006h = null;
        this.f75007i = null;
        this.f75008j = 1;
        this.f74999a = url;
    }

    private int a(int retryCount) {
        i iVar = this.f75005g;
        return iVar != null ? iVar.a(retryCount, this.f75008j) : this.f75003e;
    }

    private int c(int retryCount) {
        i iVar = this.f75005g;
        return iVar != null ? iVar.b(retryCount, this.f75008j) : this.f75004f;
    }

    @Override // org.apache.thrift.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.f75002d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            this.f75002d = null;
        }
    }

    public final URL e() throws TTransportException {
        try {
            return this.f75000b != null ? new URL(this.f75000b.b()) : new URL(this.f74999a);
        } catch (MalformedURLException e11) {
            throw new TTransportException(e11);
        }
    }

    public void f(e cookieInflator) {
        this.f75006h = cookieInflator;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.apache.thrift.transport.TTransport
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void flush() throws org.apache.thrift.transport.TTransportException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: na.a.flush():void");
    }

    public void i(int maxRetryCount) {
        this.f75008j = maxRetryCount;
    }

    @Override // org.apache.thrift.transport.TTransport
    public boolean isOpen() {
        return true;
    }

    public void j(i retryPolicy) {
        this.f75005g = retryPolicy;
    }

    @Override // org.apache.thrift.transport.TTransport
    public int read(byte[] buf, int off, int len) throws TTransportException {
        InputStream inputStream = this.f75002d;
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
        this.f75003e = timeout;
    }

    public void setCustomHeader(String key, String value) {
        if (this.f75007i == null) {
            this.f75007i = new HashMap();
        }
        this.f75007i.put(key, value);
    }

    public void setCustomHeaders(Map<String, String> headers) {
        this.f75007i = headers;
    }

    @Override // org.apache.thrift.transport.TTransport
    public void setMethodName(String name) throws TTransportException {
        d dVar = this.f75000b;
        if (dVar != null) {
            dVar.c(name);
        }
    }

    public void setReadTimeout(int timeout) {
        this.f75004f = timeout;
    }

    @Override // org.apache.thrift.transport.TTransport
    public void write(byte[] buf, int off, int len) {
        this.f75001c.write(buf, off, len);
    }

    public a(d urlPolicy) throws TTransportException {
        this.f74999a = null;
        this.f75000b = null;
        this.f75001c = new ByteArrayOutputStream();
        this.f75002d = null;
        this.f75003e = 5000;
        this.f75004f = 10000;
        this.f75005g = null;
        this.f75006h = null;
        this.f75007i = null;
        this.f75008j = 1;
        this.f75000b = urlPolicy;
    }

    @Override // org.apache.thrift.transport.TTransport
    public void open() {
    }
}
