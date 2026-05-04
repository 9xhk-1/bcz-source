package o0;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import coil.request.ImageRequest;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class m extends g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Drawable f75481a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final ImageRequest f75482b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final DataSource f75483c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final MemoryCache.Key f75484d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final String f75485e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f75486f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f75487g;

    public /* synthetic */ m(Drawable drawable, ImageRequest imageRequest, DataSource dataSource, MemoryCache.Key key, String str, boolean z11, boolean z12, int i11, v vVar) {
        this(drawable, imageRequest, dataSource, (i11 & 8) != 0 ? null : key, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? false : z12);
    }

    public static /* synthetic */ m d(m mVar, Drawable drawable, ImageRequest imageRequest, DataSource dataSource, MemoryCache.Key key, String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            drawable = mVar.a();
        }
        if ((i11 & 2) != 0) {
            imageRequest = mVar.b();
        }
        if ((i11 & 4) != 0) {
            dataSource = mVar.f75483c;
        }
        if ((i11 & 8) != 0) {
            key = mVar.f75484d;
        }
        if ((i11 & 16) != 0) {
            str = mVar.f75485e;
        }
        if ((i11 & 32) != 0) {
            z11 = mVar.f75486f;
        }
        if ((i11 & 64) != 0) {
            z12 = mVar.f75487g;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        String str2 = str;
        DataSource dataSource2 = dataSource;
        return mVar.c(drawable, imageRequest, dataSource2, key, str2, z13, z14);
    }

    @Override // o0.g
    @m80.k
    public Drawable a() {
        return this.f75481a;
    }

    @Override // o0.g
    @m80.k
    public ImageRequest b() {
        return this.f75482b;
    }

    @m80.k
    public final m c(@m80.k Drawable drawable, @m80.k ImageRequest imageRequest, @m80.k DataSource dataSource, @m80.l MemoryCache.Key key, @m80.l String str, boolean z11, boolean z12) {
        return new m(drawable, imageRequest, dataSource, key, str, z11, z12);
    }

    @m80.k
    public final DataSource e() {
        return this.f75483c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return g0.g(a(), mVar.a()) && g0.g(b(), mVar.b()) && this.f75483c == mVar.f75483c && g0.g(this.f75484d, mVar.f75484d) && g0.g(this.f75485e, mVar.f75485e) && this.f75486f == mVar.f75486f && this.f75487g == mVar.f75487g;
    }

    @m80.l
    public final String f() {
        return this.f75485e;
    }

    @m80.l
    public final MemoryCache.Key g() {
        return this.f75484d;
    }

    public final boolean h() {
        return this.f75487g;
    }

    public int hashCode() {
        int hashCode = ((((a().hashCode() * 31) + b().hashCode()) * 31) + this.f75483c.hashCode()) * 31;
        MemoryCache.Key key = this.f75484d;
        int hashCode2 = (hashCode + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f75485e;
        return ((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f75486f)) * 31) + Boolean.hashCode(this.f75487g);
    }

    public final boolean i() {
        return this.f75486f;
    }

    public m(@m80.k Drawable drawable, @m80.k ImageRequest imageRequest, @m80.k DataSource dataSource, @m80.l MemoryCache.Key key, @m80.l String str, boolean z11, boolean z12) {
        super(null);
        this.f75481a = drawable;
        this.f75482b = imageRequest;
        this.f75483c = dataSource;
        this.f75484d = key;
        this.f75485e = str;
        this.f75486f = z11;
        this.f75487g = z12;
    }
}
