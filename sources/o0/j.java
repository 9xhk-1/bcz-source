package o0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import coil.request.CachePolicy;
import coil.size.Scale;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Context f75463a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Bitmap.Config f75464b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final ColorSpace f75465c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final q0.g f75466d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Scale f75467e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f75468f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f75469g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f75470h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public final String f75471i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final okhttp3.h f75472j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final coil.request.c f75473k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final coil.request.b f75474l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final CachePolicy f75475m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final CachePolicy f75476n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final CachePolicy f75477o;

    public j(@m80.k Context context, @m80.k Bitmap.Config config, @m80.l ColorSpace colorSpace, @m80.k q0.g gVar, @m80.k Scale scale, boolean z11, boolean z12, boolean z13, @m80.l String str, @m80.k okhttp3.h hVar, @m80.k coil.request.c cVar, @m80.k coil.request.b bVar, @m80.k CachePolicy cachePolicy, @m80.k CachePolicy cachePolicy2, @m80.k CachePolicy cachePolicy3) {
        this.f75463a = context;
        this.f75464b = config;
        this.f75465c = colorSpace;
        this.f75466d = gVar;
        this.f75467e = scale;
        this.f75468f = z11;
        this.f75469g = z12;
        this.f75470h = z13;
        this.f75471i = str;
        this.f75472j = hVar;
        this.f75473k = cVar;
        this.f75474l = bVar;
        this.f75475m = cachePolicy;
        this.f75476n = cachePolicy2;
        this.f75477o = cachePolicy3;
    }

    @m80.k
    public final j a(@m80.k Context context, @m80.k Bitmap.Config config, @m80.l ColorSpace colorSpace, @m80.k q0.g gVar, @m80.k Scale scale, boolean z11, boolean z12, boolean z13, @m80.l String str, @m80.k okhttp3.h hVar, @m80.k coil.request.c cVar, @m80.k coil.request.b bVar, @m80.k CachePolicy cachePolicy, @m80.k CachePolicy cachePolicy2, @m80.k CachePolicy cachePolicy3) {
        return new j(context, config, colorSpace, gVar, scale, z11, z12, z13, str, hVar, cVar, bVar, cachePolicy, cachePolicy2, cachePolicy3);
    }

    public final boolean c() {
        return this.f75468f;
    }

    public final boolean d() {
        return this.f75469g;
    }

    @m80.l
    public final ColorSpace e() {
        return this.f75465c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (g0.g(this.f75463a, jVar.f75463a) && this.f75464b == jVar.f75464b) {
            return (Build.VERSION.SDK_INT < 26 || g0.g(this.f75465c, jVar.f75465c)) && g0.g(this.f75466d, jVar.f75466d) && this.f75467e == jVar.f75467e && this.f75468f == jVar.f75468f && this.f75469g == jVar.f75469g && this.f75470h == jVar.f75470h && g0.g(this.f75471i, jVar.f75471i) && g0.g(this.f75472j, jVar.f75472j) && g0.g(this.f75473k, jVar.f75473k) && g0.g(this.f75474l, jVar.f75474l) && this.f75475m == jVar.f75475m && this.f75476n == jVar.f75476n && this.f75477o == jVar.f75477o;
        }
        return false;
    }

    @m80.k
    public final Bitmap.Config f() {
        return this.f75464b;
    }

    @m80.k
    public final Context g() {
        return this.f75463a;
    }

    @m80.l
    public final String h() {
        return this.f75471i;
    }

    public int hashCode() {
        int hashCode = ((this.f75463a.hashCode() * 31) + this.f75464b.hashCode()) * 31;
        ColorSpace colorSpace = this.f75465c;
        int hashCode2 = (((((((((((hashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.f75466d.hashCode()) * 31) + this.f75467e.hashCode()) * 31) + Boolean.hashCode(this.f75468f)) * 31) + Boolean.hashCode(this.f75469g)) * 31) + Boolean.hashCode(this.f75470h)) * 31;
        String str = this.f75471i;
        return ((((((((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f75472j.hashCode()) * 31) + this.f75473k.hashCode()) * 31) + this.f75474l.hashCode()) * 31) + this.f75475m.hashCode()) * 31) + this.f75476n.hashCode()) * 31) + this.f75477o.hashCode();
    }

    @m80.k
    public final CachePolicy i() {
        return this.f75476n;
    }

    @m80.k
    public final okhttp3.h j() {
        return this.f75472j;
    }

    @m80.k
    public final CachePolicy k() {
        return this.f75475m;
    }

    @m80.k
    public final CachePolicy l() {
        return this.f75477o;
    }

    @m80.k
    public final coil.request.b m() {
        return this.f75474l;
    }

    public final boolean n() {
        return this.f75470h;
    }

    @m80.k
    public final Scale o() {
        return this.f75467e;
    }

    @m80.k
    public final q0.g p() {
        return this.f75466d;
    }

    @m80.k
    public final coil.request.c q() {
        return this.f75473k;
    }

    public /* synthetic */ j(Context context, Bitmap.Config config, ColorSpace colorSpace, q0.g gVar, Scale scale, boolean z11, boolean z12, boolean z13, String str, okhttp3.h hVar, coil.request.c cVar, coil.request.b bVar, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, int i11, v vVar) {
        this(context, (i11 & 2) != 0 ? Bitmap.Config.ARGB_8888 : config, (i11 & 4) != 0 ? u0.l.r() : colorSpace, (i11 & 8) != 0 ? q0.g.f81365d : gVar, (i11 & 16) != 0 ? Scale.FIT : scale, (i11 & 32) != 0 ? false : z11, (i11 & 64) == 0 ? z12 : false, (i11 & 128) != 0 ? true : z13, (i11 & 256) != 0 ? null : str, (i11 & 512) != 0 ? u0.l.k() : hVar, (i11 & 1024) != 0 ? coil.request.c.f9804c : cVar, (i11 & 2048) != 0 ? coil.request.b.f9798c : bVar, (i11 & 4096) != 0 ? CachePolicy.ENABLED : cachePolicy, (i11 & 8192) != 0 ? CachePolicy.ENABLED : cachePolicy2, (i11 & 16384) != 0 ? CachePolicy.ENABLED : cachePolicy3);
    }
}
