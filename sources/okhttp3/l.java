package okhttp3;

import a00.h0;
import a00.l1;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.badlogic.gdx.Net;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import okhttp3.h;
import okhttp3.i;
import org.junit.jupiter.api.j2;
import u30.f0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1864#2,3:299\n*S KotlinDebug\n*F\n+ 1 Request.kt\nokhttp3/Request\n*L\n119#1:299,3\n*E\n"})
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final i f77476a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f77477b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final h f77478c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final m f77479d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Map<Class<?>, Object> f77480e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public c f77481f;

    public l(@m80.k i url, @m80.k String method, @m80.k h headers, @m80.l m mVar, @m80.k Map<Class<?>, ? extends Object> tags) {
        g0.p(url, "url");
        g0.p(method, "method");
        g0.p(headers, "headers");
        g0.p(tags, "tags");
        this.f77476a = url;
        this.f77477b = method;
        this.f77478c = headers;
        this.f77479d = mVar;
        this.f77480e = tags;
    }

    @m80.l
    @w00.j(name = "-deprecated_body")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = TtmlNode.TAG_BODY, imports = {}))
    public final m a() {
        return this.f77479d;
    }

    @w00.j(name = "-deprecated_cacheControl")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "cacheControl", imports = {}))
    @m80.k
    public final c b() {
        return g();
    }

    @w00.j(name = "-deprecated_headers")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "headers", imports = {}))
    @m80.k
    public final h c() {
        return this.f77478c;
    }

    @w00.j(name = "-deprecated_method")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "method", imports = {}))
    @m80.k
    public final String d() {
        return this.f77477b;
    }

    @w00.j(name = "-deprecated_url")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "url", imports = {}))
    @m80.k
    public final i e() {
        return this.f77476a;
    }

    @m80.l
    @w00.j(name = TtmlNode.TAG_BODY)
    public final m f() {
        return this.f77479d;
    }

    @w00.j(name = "cacheControl")
    @m80.k
    public final c g() {
        c cVar = this.f77481f;
        if (cVar != null) {
            return cVar;
        }
        c c11 = c.f77156n.c(this.f77478c);
        this.f77481f = c11;
        return c11;
    }

    @m80.k
    public final Map<Class<?>, Object> h() {
        return this.f77480e;
    }

    @m80.l
    public final String i(@m80.k String name) {
        g0.p(name, "name");
        return this.f77478c.d(name);
    }

    @m80.k
    public final List<String> j(@m80.k String name) {
        g0.p(name, "name");
        return this.f77478c.p(name);
    }

    @w00.j(name = "headers")
    @m80.k
    public final h k() {
        return this.f77478c;
    }

    public final boolean l() {
        return this.f77476a.G();
    }

    @w00.j(name = "method")
    @m80.k
    public final String m() {
        return this.f77477b;
    }

    @m80.k
    public final a n() {
        return new a(this);
    }

    @m80.l
    public final Object o() {
        return p(Object.class);
    }

    @m80.l
    public final <T> T p(@m80.k Class<? extends T> type) {
        g0.p(type, "type");
        return type.cast(this.f77480e.get(type));
    }

    @w00.j(name = "url")
    @m80.k
    public final i q() {
        return this.f77476a;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f77477b);
        sb2.append(", url=");
        sb2.append(this.f77476a);
        if (this.f77478c.size() != 0) {
            sb2.append(", headers=[");
            int i11 = 0;
            for (Pair<? extends String, ? extends String> pair : this.f77478c) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    h0.b0();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String component1 = pair2.component1();
                String component2 = pair2.component2();
                if (i11 > 0) {
                    sb2.append(j2.O);
                }
                sb2.append(component1);
                sb2.append(':');
                sb2.append(component2);
                i11 = i12;
            }
            sb2.append(l50.b.f69930l);
        }
        if (!this.f77480e.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f77480e);
        }
        sb2.append(l50.b.f69928j);
        String sb3 = sb2.toString();
        g0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public i f77482a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public String f77483b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public h.a f77484c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public m f77485d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public Map<Class<?>, Object> f77486e;

        public a() {
            this.f77486e = new LinkedHashMap();
            this.f77483b = "GET";
            this.f77484c = new h.a();
        }

        public static /* synthetic */ a f(a aVar, m mVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i11 & 1) != 0) {
                mVar = u50.f.f91849d;
            }
            return aVar.e(mVar);
        }

        @m80.k
        public a A(@m80.l Object obj) {
            return z(Object.class, obj);
        }

        @m80.k
        public a B(@m80.k String url) {
            g0.p(url, "url");
            if (f0.H2(url, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String substring = url.substring(3);
                g0.o(substring, "this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                url = sb2.toString();
            } else if (f0.H2(url, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https:");
                String substring2 = url.substring(4);
                g0.o(substring2, "this as java.lang.String).substring(startIndex)");
                sb3.append(substring2);
                url = sb3.toString();
            }
            return D(i.f77284k.h(url));
        }

        @m80.k
        public a C(@m80.k URL url) {
            g0.p(url, "url");
            i.b bVar = i.f77284k;
            String url2 = url.toString();
            g0.o(url2, "url.toString()");
            return D(bVar.h(url2));
        }

        @m80.k
        public a D(@m80.k i url) {
            g0.p(url, "url");
            this.f77482a = url;
            return this;
        }

        @m80.k
        public a a(@m80.k String name, @m80.k String value) {
            g0.p(name, "name");
            g0.p(value, "value");
            this.f77484c.b(name, value);
            return this;
        }

        @m80.k
        public l b() {
            i iVar = this.f77482a;
            if (iVar != null) {
                return new l(iVar, this.f77483b, this.f77484c.i(), this.f77485d, u50.f.i0(this.f77486e));
            }
            throw new IllegalStateException("url == null");
        }

        @m80.k
        public a c(@m80.k c cacheControl) {
            g0.p(cacheControl, "cacheControl");
            String cVar = cacheControl.toString();
            return cVar.length() == 0 ? t("Cache-Control") : n("Cache-Control", cVar);
        }

        @w00.k
        @m80.k
        public final a d() {
            return f(this, null, 1, null);
        }

        @w00.k
        @m80.k
        public a e(@m80.l m mVar) {
            return p(Net.a.f11467f, mVar);
        }

        @m80.k
        public a g() {
            return p("GET", null);
        }

        @m80.l
        public final m h() {
            return this.f77485d;
        }

        @m80.k
        public final h.a i() {
            return this.f77484c;
        }

        @m80.k
        public final String j() {
            return this.f77483b;
        }

        @m80.k
        public final Map<Class<?>, Object> k() {
            return this.f77486e;
        }

        @m80.l
        public final i l() {
            return this.f77482a;
        }

        @m80.k
        public a m() {
            return p(Net.a.f11462a, null);
        }

        @m80.k
        public a n(@m80.k String name, @m80.k String value) {
            g0.p(name, "name");
            g0.p(value, "value");
            this.f77484c.m(name, value);
            return this;
        }

        @m80.k
        public a o(@m80.k h headers) {
            g0.p(headers, "headers");
            this.f77484c = headers.k();
            return this;
        }

        @m80.k
        public a p(@m80.k String method, @m80.l m mVar) {
            g0.p(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (mVar == null) {
                if (a60.f.e(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!a60.f.b(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f77483b = method;
            this.f77485d = mVar;
            return this;
        }

        @m80.k
        public a q(@m80.k m body) {
            g0.p(body, "body");
            return p("PATCH", body);
        }

        @m80.k
        public a r(@m80.k m body) {
            g0.p(body, "body");
            return p("POST", body);
        }

        @m80.k
        public a s(@m80.k m body) {
            g0.p(body, "body");
            return p(Net.a.f11465d, body);
        }

        @m80.k
        public a t(@m80.k String name) {
            g0.p(name, "name");
            this.f77484c.l(name);
            return this;
        }

        public final void u(@m80.l m mVar) {
            this.f77485d = mVar;
        }

        public final void v(@m80.k h.a aVar) {
            g0.p(aVar, "<set-?>");
            this.f77484c = aVar;
        }

        public final void w(@m80.k String str) {
            g0.p(str, "<set-?>");
            this.f77483b = str;
        }

        public final void x(@m80.k Map<Class<?>, Object> map) {
            g0.p(map, "<set-?>");
            this.f77486e = map;
        }

        public final void y(@m80.l i iVar) {
            this.f77482a = iVar;
        }

        @m80.k
        public <T> a z(@m80.k Class<? super T> type, @m80.l T t11) {
            g0.p(type, "type");
            if (t11 == null) {
                this.f77486e.remove(type);
                return this;
            }
            if (this.f77486e.isEmpty()) {
                this.f77486e = new LinkedHashMap();
            }
            Map<Class<?>, Object> map = this.f77486e;
            T cast = type.cast(t11);
            g0.m(cast);
            map.put(type, cast);
            return this;
        }

        public a(@m80.k l request) {
            Map<Class<?>, Object> J0;
            g0.p(request, "request");
            this.f77486e = new LinkedHashMap();
            this.f77482a = request.q();
            this.f77483b = request.m();
            this.f77485d = request.f();
            if (request.h().isEmpty()) {
                J0 = new LinkedHashMap<>();
            } else {
                J0 = l1.J0(request.h());
            }
            this.f77486e = J0;
            this.f77484c = request.k().k();
        }
    }
}
