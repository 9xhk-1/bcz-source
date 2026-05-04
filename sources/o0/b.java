package o0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import c40.h1;
import c40.m0;
import coil.request.CachePolicy;
import coil.size.Precision;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import t0.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m0 f75426a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final m0 f75427b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final m0 f75428c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final m0 f75429d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final c.a f75430e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final Precision f75431f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final Bitmap.Config f75432g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f75433h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f75434i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public final Drawable f75435j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public final Drawable f75436k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    public final Drawable f75437l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final CachePolicy f75438m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final CachePolicy f75439n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final CachePolicy f75440o;

    public b() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);
    }

    @m80.k
    public final b a(@m80.k m0 m0Var, @m80.k m0 m0Var2, @m80.k m0 m0Var3, @m80.k m0 m0Var4, @m80.k c.a aVar, @m80.k Precision precision, @m80.k Bitmap.Config config, boolean z11, boolean z12, @m80.l Drawable drawable, @m80.l Drawable drawable2, @m80.l Drawable drawable3, @m80.k CachePolicy cachePolicy, @m80.k CachePolicy cachePolicy2, @m80.k CachePolicy cachePolicy3) {
        return new b(m0Var, m0Var2, m0Var3, m0Var4, aVar, precision, config, z11, z12, drawable, drawable2, drawable3, cachePolicy, cachePolicy2, cachePolicy3);
    }

    public final boolean c() {
        return this.f75433h;
    }

    public final boolean d() {
        return this.f75434i;
    }

    @m80.k
    public final Bitmap.Config e() {
        return this.f75432g;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g0.g(this.f75426a, bVar.f75426a) && g0.g(this.f75427b, bVar.f75427b) && g0.g(this.f75428c, bVar.f75428c) && g0.g(this.f75429d, bVar.f75429d) && g0.g(this.f75430e, bVar.f75430e) && this.f75431f == bVar.f75431f && this.f75432g == bVar.f75432g && this.f75433h == bVar.f75433h && this.f75434i == bVar.f75434i && g0.g(this.f75435j, bVar.f75435j) && g0.g(this.f75436k, bVar.f75436k) && g0.g(this.f75437l, bVar.f75437l) && this.f75438m == bVar.f75438m && this.f75439n == bVar.f75439n && this.f75440o == bVar.f75440o;
    }

    @m80.k
    public final m0 f() {
        return this.f75428c;
    }

    @m80.k
    public final CachePolicy g() {
        return this.f75439n;
    }

    @m80.l
    public final Drawable h() {
        return this.f75436k;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f75426a.hashCode() * 31) + this.f75427b.hashCode()) * 31) + this.f75428c.hashCode()) * 31) + this.f75429d.hashCode()) * 31) + this.f75430e.hashCode()) * 31) + this.f75431f.hashCode()) * 31) + this.f75432g.hashCode()) * 31) + Boolean.hashCode(this.f75433h)) * 31) + Boolean.hashCode(this.f75434i)) * 31;
        Drawable drawable = this.f75435j;
        int hashCode2 = (hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f75436k;
        int hashCode3 = (hashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f75437l;
        return ((((((hashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.f75438m.hashCode()) * 31) + this.f75439n.hashCode()) * 31) + this.f75440o.hashCode();
    }

    @m80.l
    public final Drawable i() {
        return this.f75437l;
    }

    @m80.k
    public final m0 j() {
        return this.f75427b;
    }

    @m80.k
    public final m0 k() {
        return this.f75426a;
    }

    @m80.k
    public final CachePolicy l() {
        return this.f75438m;
    }

    @m80.k
    public final CachePolicy m() {
        return this.f75440o;
    }

    @m80.l
    public final Drawable n() {
        return this.f75435j;
    }

    @m80.k
    public final Precision o() {
        return this.f75431f;
    }

    @m80.k
    public final m0 p() {
        return this.f75429d;
    }

    @m80.k
    public final c.a q() {
        return this.f75430e;
    }

    public b(@m80.k m0 m0Var, @m80.k m0 m0Var2, @m80.k m0 m0Var3, @m80.k m0 m0Var4, @m80.k c.a aVar, @m80.k Precision precision, @m80.k Bitmap.Config config, boolean z11, boolean z12, @m80.l Drawable drawable, @m80.l Drawable drawable2, @m80.l Drawable drawable3, @m80.k CachePolicy cachePolicy, @m80.k CachePolicy cachePolicy2, @m80.k CachePolicy cachePolicy3) {
        this.f75426a = m0Var;
        this.f75427b = m0Var2;
        this.f75428c = m0Var3;
        this.f75429d = m0Var4;
        this.f75430e = aVar;
        this.f75431f = precision;
        this.f75432g = config;
        this.f75433h = z11;
        this.f75434i = z12;
        this.f75435j = drawable;
        this.f75436k = drawable2;
        this.f75437l = drawable3;
        this.f75438m = cachePolicy;
        this.f75439n = cachePolicy2;
        this.f75440o = cachePolicy3;
    }

    public /* synthetic */ b(m0 m0Var, m0 m0Var2, m0 m0Var3, m0 m0Var4, c.a aVar, Precision precision, Bitmap.Config config, boolean z11, boolean z12, Drawable drawable, Drawable drawable2, Drawable drawable3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, int i11, v vVar) {
        this((i11 & 1) != 0 ? h1.e().q() : m0Var, (i11 & 2) != 0 ? h1.c() : m0Var2, (i11 & 4) != 0 ? h1.c() : m0Var3, (i11 & 8) != 0 ? h1.c() : m0Var4, (i11 & 16) != 0 ? c.a.f89103b : aVar, (i11 & 32) != 0 ? Precision.AUTOMATIC : precision, (i11 & 64) != 0 ? u0.l.j() : config, (i11 & 128) != 0 ? true : z11, (i11 & 256) != 0 ? false : z12, (i11 & 512) != 0 ? null : drawable, (i11 & 1024) != 0 ? null : drawable2, (i11 & 2048) == 0 ? drawable3 : null, (i11 & 4096) != 0 ? CachePolicy.ENABLED : cachePolicy, (i11 & 8192) != 0 ? CachePolicy.ENABLED : cachePolicy2, (i11 & 16384) != 0 ? CachePolicy.ENABLED : cachePolicy3);
    }
}
