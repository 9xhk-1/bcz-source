package d70;

import java.nio.ByteBuffer;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import w70.b0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final long f47434a;

    /* renamed from: b, reason: collision with root package name */
    public final w70.z f47435b;

    /* renamed from: c, reason: collision with root package name */
    public final b0<?> f47436c;

    /* renamed from: d, reason: collision with root package name */
    public final HttpClientContext f47437d;

    /* renamed from: e, reason: collision with root package name */
    public HttpRequestWrapper f47438e;

    /* renamed from: f, reason: collision with root package name */
    public HttpResponse f47439f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f47440g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f47441h;

    /* renamed from: i, reason: collision with root package name */
    public int f47442i;

    /* renamed from: j, reason: collision with root package name */
    public int f47443j;

    /* renamed from: k, reason: collision with root package name */
    public HttpUriRequest f47444k;

    public t(long j11, w70.z zVar, b0<?> b0Var, HttpClientContext httpClientContext) {
        this.f47434a = j11;
        this.f47435b = zVar;
        this.f47436c = b0Var;
        this.f47437d = httpClientContext;
    }

    public int a() {
        return this.f47442i;
    }

    public HttpResponse b() {
        return this.f47439f;
    }

    public long c() {
        return this.f47434a;
    }

    public HttpClientContext d() {
        return this.f47437d;
    }

    public HttpRequestWrapper e() {
        return this.f47438e;
    }

    public HttpUriRequest f() {
        return this.f47444k;
    }

    public int g() {
        return this.f47443j;
    }

    public w70.z h() {
        return this.f47435b;
    }

    public b0<?> i() {
        return this.f47436c;
    }

    public ByteBuffer j() {
        if (this.f47440g == null) {
            this.f47440g = ByteBuffer.allocate(4096);
        }
        return this.f47440g;
    }

    public void k() {
        this.f47442i++;
    }

    public void l() {
        this.f47443j++;
    }

    public boolean m() {
        return this.f47441h;
    }

    public void n(HttpResponse httpResponse) {
        this.f47439f = httpResponse;
    }

    public void o(HttpRequestWrapper httpRequestWrapper) {
        this.f47438e = httpRequestWrapper;
    }

    public void p(HttpUriRequest httpUriRequest) {
        this.f47444k = httpUriRequest;
    }

    public void q() {
        this.f47441h = true;
    }

    public String toString() {
        return Long.toString(this.f47434a);
    }
}
