package t3;

import com.baicizhan.app.biz.base.cache.CacheStrategy;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b<T> {

    /* renamed from: a, reason: collision with root package name */
    public String f89213a;

    /* renamed from: b, reason: collision with root package name */
    public e f89214b;

    /* renamed from: c, reason: collision with root package name */
    public CacheStrategy f89215c;

    /* renamed from: d, reason: collision with root package name */
    public n f89216d;

    /* renamed from: e, reason: collision with root package name */
    public x00.l<? super j00.c<? super T>, ? extends Object> f89217e;

    @m80.k
    public final String a() {
        String str = this.f89213a;
        if (str != null) {
            return str;
        }
        g0.S("cacheKey");
        return null;
    }

    @m80.k
    public final CacheStrategy b() {
        CacheStrategy cacheStrategy = this.f89215c;
        if (cacheStrategy != null) {
            return cacheStrategy;
        }
        g0.S("cacheStrategy");
        return null;
    }

    @m80.k
    public final e c() {
        e eVar = this.f89214b;
        if (eVar != null) {
            return eVar;
        }
        g0.S("cacheType");
        return null;
    }

    @m80.k
    public final n d() {
        n nVar = this.f89216d;
        if (nVar != null) {
            return nVar;
        }
        g0.S("invalidation");
        return null;
    }

    @m80.k
    public final x00.l<j00.c<? super T>, Object> e() {
        x00.l<? super j00.c<? super T>, ? extends Object> lVar = this.f89217e;
        if (lVar != null) {
            return lVar;
        }
        g0.S("network");
        return null;
    }

    public final void f(@m80.k String str) {
        g0.p(str, "<set-?>");
        this.f89213a = str;
    }

    public final void g(@m80.k CacheStrategy cacheStrategy) {
        g0.p(cacheStrategy, "<set-?>");
        this.f89215c = cacheStrategy;
    }

    public final void h(@m80.k e eVar) {
        g0.p(eVar, "<set-?>");
        this.f89214b = eVar;
    }

    public final void i(@m80.k n nVar) {
        g0.p(nVar, "<set-?>");
        this.f89216d = nVar;
    }

    public final void j(@m80.k x00.l<? super j00.c<? super T>, ? extends Object> lVar) {
        g0.p(lVar, "<set-?>");
        this.f89217e = lVar;
    }
}
