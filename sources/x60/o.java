package x60;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class o implements org.apache.http.k {

    /* renamed from: f, reason: collision with root package name */
    public static final String f97650f = "http.request-count";

    /* renamed from: g, reason: collision with root package name */
    public static final String f97651g = "http.response-count";

    /* renamed from: h, reason: collision with root package name */
    public static final String f97652h = "http.sent-bytes-count";

    /* renamed from: i, reason: collision with root package name */
    public static final String f97653i = "http.received-bytes-count";

    /* renamed from: a, reason: collision with root package name */
    public final k70.g f97654a;

    /* renamed from: b, reason: collision with root package name */
    public final k70.g f97655b;

    /* renamed from: c, reason: collision with root package name */
    public long f97656c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f97657d = 0;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, Object> f97658e;

    public o(k70.g gVar, k70.g gVar2) {
        this.f97654a = gVar;
        this.f97655b = gVar2;
    }

    @Override // org.apache.http.k
    public long a() {
        return this.f97656c;
    }

    @Override // org.apache.http.k
    public Object b(String str) {
        Map<String, Object> map = this.f97658e;
        Object obj = map != null ? map.get(str) : null;
        if (obj == null) {
            if (f97650f.equals(str)) {
                return Long.valueOf(this.f97656c);
            }
            if (f97651g.equals(str)) {
                return Long.valueOf(this.f97657d);
            }
            if (f97653i.equals(str)) {
                k70.g gVar = this.f97654a;
                if (gVar != null) {
                    return Long.valueOf(gVar.a());
                }
                return null;
            }
            if (f97652h.equals(str)) {
                k70.g gVar2 = this.f97655b;
                if (gVar2 != null) {
                    return Long.valueOf(gVar2.a());
                }
                return null;
            }
        }
        return obj;
    }

    @Override // org.apache.http.k
    public long c() {
        k70.g gVar = this.f97654a;
        if (gVar != null) {
            return gVar.a();
        }
        return -1L;
    }

    @Override // org.apache.http.k
    public long d() {
        k70.g gVar = this.f97655b;
        if (gVar != null) {
            return gVar.a();
        }
        return -1L;
    }

    @Override // org.apache.http.k
    public long e() {
        return this.f97657d;
    }

    public void f() {
        this.f97656c++;
    }

    public void g() {
        this.f97657d++;
    }

    public void h(String str, Object obj) {
        if (this.f97658e == null) {
            this.f97658e = new HashMap();
        }
        this.f97658e.put(str, obj);
    }

    @Override // org.apache.http.k
    public void reset() {
        k70.g gVar = this.f97655b;
        if (gVar != null) {
            gVar.reset();
        }
        k70.g gVar2 = this.f97654a;
        if (gVar2 != null) {
            gVar2.reset();
        }
        this.f97656c = 0L;
        this.f97657d = 0L;
        this.f97658e = null;
    }
}
