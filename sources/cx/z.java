package cx;

import a00.w1;
import c40.l2;
import ix.e1;
import ix.q0;
import ix.t2;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final t2 f46934a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final e1 f46935b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final q0 f46936c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final mx.v f46937d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final l2 f46938e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final xy.b f46939f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final Set<ow.h<?>> f46940g;

    @io.ktor.utils.io.b0
    public z(@m80.k t2 url, @m80.k e1 method, @m80.k q0 headers, @m80.k mx.v body, @m80.k l2 executionContext, @m80.k xy.b attributes) {
        Set<ow.h<?>> keySet;
        kotlin.jvm.internal.g0.p(url, "url");
        kotlin.jvm.internal.g0.p(method, "method");
        kotlin.jvm.internal.g0.p(headers, "headers");
        kotlin.jvm.internal.g0.p(body, "body");
        kotlin.jvm.internal.g0.p(executionContext, "executionContext");
        kotlin.jvm.internal.g0.p(attributes, "attributes");
        this.f46934a = url;
        this.f46935b = method;
        this.f46936c = headers;
        this.f46937d = body;
        this.f46938e = executionContext;
        this.f46939f = attributes;
        Map map = (Map) attributes.a(ow.i.b());
        this.f46940g = (map == null || (keySet = map.keySet()) == null) ? w1.k() : keySet;
    }

    @m80.k
    public final xy.b a() {
        return this.f46939f;
    }

    @m80.k
    public final mx.v b() {
        return this.f46937d;
    }

    @m80.l
    public final <T> T c(@m80.k ow.h<T> key) {
        kotlin.jvm.internal.g0.p(key, "key");
        Map map = (Map) this.f46939f.a(ow.i.b());
        if (map != null) {
            return (T) map.get(key);
        }
        return null;
    }

    @m80.k
    public final l2 d() {
        return this.f46938e;
    }

    @m80.k
    public final q0 e() {
        return this.f46936c;
    }

    @m80.k
    public final e1 f() {
        return this.f46935b;
    }

    @m80.k
    public final Set<ow.h<?>> g() {
        return this.f46940g;
    }

    @m80.k
    public final t2 h() {
        return this.f46934a;
    }

    @m80.k
    public String toString() {
        return "HttpRequestData(url=" + this.f46934a + ", method=" + this.f46935b + ')';
    }
}
