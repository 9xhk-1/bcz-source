package c70;

import c80.j;
import h70.i;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import javax.net.ssl.SSLContext;
import m70.m;
import org.apache.http.q;
import org.apache.http.r;
import org.apache.http.s;
import w70.v;
import w70.w;
import y70.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f8267a;

    /* renamed from: b, reason: collision with root package name */
    public InetAddress f8268b;

    /* renamed from: c, reason: collision with root package name */
    public i f8269c;

    /* renamed from: d, reason: collision with root package name */
    public v60.a f8270d;

    /* renamed from: e, reason: collision with root package name */
    public LinkedList<q> f8271e;

    /* renamed from: f, reason: collision with root package name */
    public LinkedList<q> f8272f;

    /* renamed from: g, reason: collision with root package name */
    public LinkedList<s> f8273g;

    /* renamed from: h, reason: collision with root package name */
    public LinkedList<s> f8274h;

    /* renamed from: i, reason: collision with root package name */
    public String f8275i;

    /* renamed from: j, reason: collision with root package name */
    public j f8276j;

    /* renamed from: k, reason: collision with root package name */
    public org.apache.http.a f8277k;

    /* renamed from: l, reason: collision with root package name */
    public r f8278l;

    /* renamed from: m, reason: collision with root package name */
    public w f8279m;

    /* renamed from: n, reason: collision with root package name */
    public Map<String, v<?>> f8280n;

    /* renamed from: o, reason: collision with root package name */
    public w70.r f8281o;

    /* renamed from: p, reason: collision with root package name */
    public SSLContext f8282p;

    /* renamed from: q, reason: collision with root package name */
    public f f8283q;

    /* renamed from: r, reason: collision with root package name */
    public m<? extends b70.f> f8284r;

    /* renamed from: s, reason: collision with root package name */
    public org.apache.http.c f8285s;

    public static b e() {
        return new b();
    }

    public final b a(q qVar) {
        if (qVar == null) {
            return this;
        }
        if (this.f8271e == null) {
            this.f8271e = new LinkedList<>();
        }
        this.f8271e.addFirst(qVar);
        return this;
    }

    public final b b(s sVar) {
        if (sVar == null) {
            return this;
        }
        if (this.f8273g == null) {
            this.f8273g = new LinkedList<>();
        }
        this.f8273g.addFirst(sVar);
        return this;
    }

    public final b c(q qVar) {
        if (qVar == null) {
            return this;
        }
        if (this.f8272f == null) {
            this.f8272f = new LinkedList<>();
        }
        this.f8272f.addLast(qVar);
        return this;
    }

    public final b d(s sVar) {
        if (sVar == null) {
            return this;
        }
        if (this.f8274h == null) {
            this.f8274h = new LinkedList<>();
        }
        this.f8274h.addLast(sVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARN: Type inference failed for: r0v17, types: [w70.u0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [w70.w] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c70.a f() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c70.b.f():c70.a");
    }

    public final b g(String str, v<?> vVar) {
        if (str != null && vVar != null) {
            if (this.f8280n == null) {
                this.f8280n = new HashMap();
            }
            this.f8280n.put(str, vVar);
        }
        return this;
    }

    public final b h(v60.a aVar) {
        this.f8270d = aVar;
        return this;
    }

    public final b i(m<? extends b70.f> mVar) {
        this.f8284r = mVar;
        return this;
    }

    public final b j(org.apache.http.a aVar) {
        this.f8277k = aVar;
        return this;
    }

    public final b k(org.apache.http.c cVar) {
        this.f8285s = cVar;
        return this;
    }

    public final b l(w70.r rVar) {
        this.f8281o = rVar;
        return this;
    }

    public final b m(w wVar) {
        this.f8279m = wVar;
        return this;
    }

    public final b n(j jVar) {
        this.f8276j = jVar;
        return this;
    }

    public final b o(i iVar) {
        this.f8269c = iVar;
        return this;
    }

    public final b p(int i11) {
        this.f8267a = i11;
        return this;
    }

    public final b q(InetAddress inetAddress) {
        this.f8268b = inetAddress;
        return this;
    }

    public final b r(r rVar) {
        this.f8278l = rVar;
        return this;
    }

    public final b s(String str) {
        this.f8275i = str;
        return this;
    }

    public final b t(SSLContext sSLContext) {
        this.f8282p = sSLContext;
        return this;
    }

    public b u(f fVar) {
        this.f8283q = fVar;
        return this;
    }
}
