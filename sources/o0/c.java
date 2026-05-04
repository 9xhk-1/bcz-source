package o0;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import c40.m0;
import coil.request.CachePolicy;
import coil.size.Precision;
import coil.size.Scale;
import kotlin.jvm.internal.g0;
import t0.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final Lifecycle f75441a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final q0.h f75442b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Scale f75443c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final m0 f75444d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final m0 f75445e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final m0 f75446f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final m0 f75447g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final c.a f75448h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public final Precision f75449i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public final Bitmap.Config f75450j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public final Boolean f75451k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    public final Boolean f75452l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    public final CachePolicy f75453m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    public final CachePolicy f75454n;

    /* renamed from: o, reason: collision with root package name */
    @m80.l
    public final CachePolicy f75455o;

    public c(@m80.l Lifecycle lifecycle, @m80.l q0.h hVar, @m80.l Scale scale, @m80.l m0 m0Var, @m80.l m0 m0Var2, @m80.l m0 m0Var3, @m80.l m0 m0Var4, @m80.l c.a aVar, @m80.l Precision precision, @m80.l Bitmap.Config config, @m80.l Boolean bool, @m80.l Boolean bool2, @m80.l CachePolicy cachePolicy, @m80.l CachePolicy cachePolicy2, @m80.l CachePolicy cachePolicy3) {
        this.f75441a = lifecycle;
        this.f75442b = hVar;
        this.f75443c = scale;
        this.f75444d = m0Var;
        this.f75445e = m0Var2;
        this.f75446f = m0Var3;
        this.f75447g = m0Var4;
        this.f75448h = aVar;
        this.f75449i = precision;
        this.f75450j = config;
        this.f75451k = bool;
        this.f75452l = bool2;
        this.f75453m = cachePolicy;
        this.f75454n = cachePolicy2;
        this.f75455o = cachePolicy3;
    }

    @m80.k
    public final c a(@m80.l Lifecycle lifecycle, @m80.l q0.h hVar, @m80.l Scale scale, @m80.l m0 m0Var, @m80.l m0 m0Var2, @m80.l m0 m0Var3, @m80.l m0 m0Var4, @m80.l c.a aVar, @m80.l Precision precision, @m80.l Bitmap.Config config, @m80.l Boolean bool, @m80.l Boolean bool2, @m80.l CachePolicy cachePolicy, @m80.l CachePolicy cachePolicy2, @m80.l CachePolicy cachePolicy3) {
        return new c(lifecycle, hVar, scale, m0Var, m0Var2, m0Var3, m0Var4, aVar, precision, config, bool, bool2, cachePolicy, cachePolicy2, cachePolicy3);
    }

    @m80.l
    public final Boolean c() {
        return this.f75451k;
    }

    @m80.l
    public final Boolean d() {
        return this.f75452l;
    }

    @m80.l
    public final Bitmap.Config e() {
        return this.f75450j;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return g0.g(this.f75441a, cVar.f75441a) && g0.g(this.f75442b, cVar.f75442b) && this.f75443c == cVar.f75443c && g0.g(this.f75444d, cVar.f75444d) && g0.g(this.f75445e, cVar.f75445e) && g0.g(this.f75446f, cVar.f75446f) && g0.g(this.f75447g, cVar.f75447g) && g0.g(this.f75448h, cVar.f75448h) && this.f75449i == cVar.f75449i && this.f75450j == cVar.f75450j && g0.g(this.f75451k, cVar.f75451k) && g0.g(this.f75452l, cVar.f75452l) && this.f75453m == cVar.f75453m && this.f75454n == cVar.f75454n && this.f75455o == cVar.f75455o;
    }

    @m80.l
    public final m0 f() {
        return this.f75446f;
    }

    @m80.l
    public final CachePolicy g() {
        return this.f75454n;
    }

    @m80.l
    public final m0 h() {
        return this.f75445e;
    }

    public int hashCode() {
        Lifecycle lifecycle = this.f75441a;
        int hashCode = (lifecycle != null ? lifecycle.hashCode() : 0) * 31;
        q0.h hVar = this.f75442b;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        Scale scale = this.f75443c;
        int hashCode3 = (hashCode2 + (scale != null ? scale.hashCode() : 0)) * 31;
        m0 m0Var = this.f75444d;
        int hashCode4 = (hashCode3 + (m0Var != null ? m0Var.hashCode() : 0)) * 31;
        m0 m0Var2 = this.f75445e;
        int hashCode5 = (hashCode4 + (m0Var2 != null ? m0Var2.hashCode() : 0)) * 31;
        m0 m0Var3 = this.f75446f;
        int hashCode6 = (hashCode5 + (m0Var3 != null ? m0Var3.hashCode() : 0)) * 31;
        m0 m0Var4 = this.f75447g;
        int hashCode7 = (hashCode6 + (m0Var4 != null ? m0Var4.hashCode() : 0)) * 31;
        c.a aVar = this.f75448h;
        int hashCode8 = (hashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Precision precision = this.f75449i;
        int hashCode9 = (hashCode8 + (precision != null ? precision.hashCode() : 0)) * 31;
        Bitmap.Config config = this.f75450j;
        int hashCode10 = (hashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f75451k;
        int hashCode11 = (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f75452l;
        int hashCode12 = (hashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        CachePolicy cachePolicy = this.f75453m;
        int hashCode13 = (hashCode12 + (cachePolicy != null ? cachePolicy.hashCode() : 0)) * 31;
        CachePolicy cachePolicy2 = this.f75454n;
        int hashCode14 = (hashCode13 + (cachePolicy2 != null ? cachePolicy2.hashCode() : 0)) * 31;
        CachePolicy cachePolicy3 = this.f75455o;
        return hashCode14 + (cachePolicy3 != null ? cachePolicy3.hashCode() : 0);
    }

    @m80.l
    public final m0 i() {
        return this.f75444d;
    }

    @m80.l
    public final Lifecycle j() {
        return this.f75441a;
    }

    @m80.l
    public final CachePolicy k() {
        return this.f75453m;
    }

    @m80.l
    public final CachePolicy l() {
        return this.f75455o;
    }

    @m80.l
    public final Precision m() {
        return this.f75449i;
    }

    @m80.l
    public final Scale n() {
        return this.f75443c;
    }

    @m80.l
    public final q0.h o() {
        return this.f75442b;
    }

    @m80.l
    public final m0 p() {
        return this.f75447g;
    }

    @m80.l
    public final c.a q() {
        return this.f75448h;
    }
}
