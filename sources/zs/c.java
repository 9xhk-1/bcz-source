package zs;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpTransport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpTransport.kt\ncom/microsoft/thrifty/transport/HttpTransport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
/* loaded from: classes7.dex */
public class c implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final URL f102871a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public e f102872b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Integer f102873c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Integer f102874d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Map<String, String> f102875e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ByteArrayOutputStream f102876f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InputStream f102877a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f102878b;

        public a(@k c cVar, InputStream inputStream) {
            g0.p(inputStream, "inputStream");
            this.f102878b = cVar;
            this.f102877a = inputStream;
        }

        @k
        public final InputStream a() {
            return this.f102877a;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f102877a.close();
        }

        @Override // zs.e
        @l
        public Object g(@k j00.c<? super g2> cVar) {
            throw new ProtocolException("currently in reading state");
        }

        @Override // zs.e
        public int read(@k byte[] buffer, int i11, int i12) {
            g0.p(buffer, "buffer");
            int read = this.f102877a.read(buffer, i11, i12);
            if (read != -1) {
                return read;
            }
            throw new ProtocolException("No more data available.");
        }

        @Override // zs.e
        public void write(@k byte[] buffer, int i11, int i12) {
            g0.p(buffer, "buffer");
            throw new ProtocolException("currently in reading state");
        }
    }

    public c(@k String url) {
        g0.p(url, "url");
        this.f102871a = new URL(url);
        this.f102872b = new b();
        this.f102875e = new LinkedHashMap();
        this.f102876f = new ByteArrayOutputStream();
    }

    public static /* synthetic */ Object c(c cVar, j00.c<? super g2> cVar2) {
        Object g11 = cVar.f102872b.g(cVar2);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f102872b.close();
    }

    public void e(@k HttpURLConnection connection) {
        g0.p(connection, "connection");
        Integer num = this.f102873c;
        if (num != null) {
            connection.setConnectTimeout(num.intValue());
        }
        Integer num2 = this.f102874d;
        if (num2 != null) {
            connection.setReadTimeout(num2.intValue());
        }
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-thrift");
        connection.setRequestProperty("Accept", "application/x-thrift");
        connection.setRequestProperty("User-Agent", "Java/THttpClient");
        for (Map.Entry<String, String> entry : this.f102875e.entrySet()) {
            connection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        connection.setDoOutput(true);
    }

    public final void f(@k byte[] data) {
        g0.p(data, "data");
        URLConnection openConnection = this.f102871a.openConnection();
        g0.n(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        e(httpURLConnection);
        httpURLConnection.connect();
        httpURLConnection.getOutputStream().write(data);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            g0.o(inputStream, "getInputStream(...)");
            this.f102872b = new a(this, inputStream);
        } else {
            throw new ProtocolException("HTTP Response code: " + responseCode);
        }
    }

    @Override // zs.e
    @l
    public Object g(@k j00.c<? super g2> cVar) {
        return c(this, cVar);
    }

    public final void i(int i11) {
        this.f102873c = Integer.valueOf(i11);
    }

    public final void j(@k String key, @k String value) {
        g0.p(key, "key");
        g0.p(value, "value");
        this.f102875e.put(key, value);
    }

    public final void k(@k Map<String, String> headers) {
        g0.p(headers, "headers");
        this.f102875e.clear();
        this.f102875e.putAll(headers);
    }

    public final void q(int i11) {
        this.f102874d = Integer.valueOf(i11);
    }

    @Override // zs.e
    public int read(@k byte[] buffer, int i11, int i12) {
        g0.p(buffer, "buffer");
        return this.f102872b.read(buffer, i11, i12);
    }

    @Override // zs.e
    public void write(@k byte[] buffer, int i11, int i12) {
        g0.p(buffer, "buffer");
        e eVar = this.f102872b;
        if (eVar instanceof a) {
            eVar.close();
            this.f102872b = new b();
        }
        this.f102872b.write(buffer, i11, i12);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b implements e {
        public b() {
        }

        @Override // zs.e
        @l
        public Object g(@k j00.c<? super g2> cVar) {
            byte[] byteArray = c.this.f102876f.toByteArray();
            c.this.f102876f.reset();
            c cVar2 = c.this;
            g0.m(byteArray);
            cVar2.f(byteArray);
            return g2.f100423a;
        }

        @Override // zs.e
        public int read(@k byte[] buffer, int i11, int i12) {
            g0.p(buffer, "buffer");
            throw new ProtocolException("Currently in writing state");
        }

        @Override // zs.e
        public void write(@k byte[] buffer, int i11, int i12) {
            g0.p(buffer, "buffer");
            c.this.f102876f.write(buffer, i11, i12);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
