package i0;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Drawable f60023a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f60024b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final DataSource f60025c;

    public g(@m80.k Drawable drawable, boolean z11, @m80.k DataSource dataSource) {
        super(null);
        this.f60023a = drawable;
        this.f60024b = z11;
        this.f60025c = dataSource;
    }

    public static /* synthetic */ g b(g gVar, Drawable drawable, boolean z11, DataSource dataSource, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            drawable = gVar.f60023a;
        }
        if ((i11 & 2) != 0) {
            z11 = gVar.f60024b;
        }
        if ((i11 & 4) != 0) {
            dataSource = gVar.f60025c;
        }
        return gVar.a(drawable, z11, dataSource);
    }

    @m80.k
    public final g a(@m80.k Drawable drawable, boolean z11, @m80.k DataSource dataSource) {
        return new g(drawable, z11, dataSource);
    }

    @m80.k
    public final DataSource c() {
        return this.f60025c;
    }

    @m80.k
    public final Drawable d() {
        return this.f60023a;
    }

    public final boolean e() {
        return this.f60024b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return g0.g(this.f60023a, gVar.f60023a) && this.f60024b == gVar.f60024b && this.f60025c == gVar.f60025c;
    }

    public int hashCode() {
        return (((this.f60023a.hashCode() * 31) + Boolean.hashCode(this.f60024b)) * 31) + this.f60025c.hashCode();
    }
}
