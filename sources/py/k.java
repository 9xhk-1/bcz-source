package py;

import a00.l1;
import io.ktor.http.CookieEncoding;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import m80.l;
import yz.c0;
import yz.e0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final d f81333a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final zy.d<Pair<CookieEncoding, String>, String> f81334b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c0 f81335c;

    public k(@m80.k d request) {
        g0.p(request, "request");
        this.f81333a = request;
        this.f81334b = new zy.d<>(0, 1, null);
        this.f81335c = e0.c(new x00.a() { // from class: py.i
            @Override // x00.a
            public final Object invoke() {
                Map i11;
                i11 = k.i(k.this);
                return i11;
            }
        });
    }

    public static /* synthetic */ String e(k kVar, String str, CookieEncoding cookieEncoding, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        if ((i11 & 2) != 0) {
            cookieEncoding = CookieEncoding.URI_ENCODING;
        }
        return kVar.d(str, cookieEncoding);
    }

    public static final String f(String str, CookieEncoding cookieEncoding) {
        return ix.c0.i(str, cookieEncoding);
    }

    public static final Map i(k kVar) {
        return kVar.c();
    }

    @m80.k
    public Map<String, String> c() {
        List<String> a11 = this.f81333a.a().a("Cookie");
        if (a11 == null) {
            return l1.z();
        }
        HashMap hashMap = new HashMap(a11.size());
        Iterator<String> it = a11.iterator();
        while (it.hasNext()) {
            hashMap.putAll(ix.c0.l(it.next(), false, 2, null));
        }
        return hashMap;
    }

    @l
    public final String d(@m80.k String name, @m80.k final CookieEncoding encoding) {
        g0.p(name, "name");
        g0.p(encoding, "encoding");
        final String str = g().get(name);
        if (str == null) {
            return null;
        }
        return this.f81334b.g(h1.a(encoding, name), new x00.a() { // from class: py.j
            @Override // x00.a
            public final Object invoke() {
                String f11;
                f11 = k.f(str, encoding);
                return f11;
            }
        });
    }

    @m80.k
    public final Map<String, String> g() {
        return (Map) this.f81335c.getValue();
    }

    @m80.k
    public final d h() {
        return this.f81333a;
    }
}
