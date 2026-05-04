package zg;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final int f102660i = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f102661a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Drawable f102662b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f102663c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f102664d;

    /* renamed from: e, reason: collision with root package name */
    public final int f102665e;

    /* renamed from: f, reason: collision with root package name */
    public final int f102666f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f102667g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f102668h;

    public g(@k String aid, @l Drawable drawable, @k String imgUrl, boolean z11, int i11, int i12, boolean z12, @k String name) {
        g0.p(aid, "aid");
        g0.p(imgUrl, "imgUrl");
        g0.p(name, "name");
        this.f102661a = aid;
        this.f102662b = drawable;
        this.f102663c = imgUrl;
        this.f102664d = z11;
        this.f102665e = i11;
        this.f102666f = i12;
        this.f102667g = z12;
        this.f102668h = name;
    }

    public static /* synthetic */ g j(g gVar, String str, Drawable drawable, String str2, boolean z11, int i11, int i12, boolean z12, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = gVar.f102661a;
        }
        if ((i13 & 2) != 0) {
            drawable = gVar.f102662b;
        }
        if ((i13 & 4) != 0) {
            str2 = gVar.f102663c;
        }
        if ((i13 & 8) != 0) {
            z11 = gVar.f102664d;
        }
        if ((i13 & 16) != 0) {
            i11 = gVar.f102665e;
        }
        if ((i13 & 32) != 0) {
            i12 = gVar.f102666f;
        }
        if ((i13 & 64) != 0) {
            z12 = gVar.f102667g;
        }
        if ((i13 & 128) != 0) {
            str3 = gVar.f102668h;
        }
        boolean z13 = z12;
        String str4 = str3;
        int i14 = i11;
        int i15 = i12;
        return gVar.i(str, drawable, str2, z11, i14, i15, z13, str4);
    }

    @k
    public final String a() {
        return this.f102661a;
    }

    @l
    public final Drawable b() {
        return this.f102662b;
    }

    @k
    public final String c() {
        return this.f102663c;
    }

    public final boolean d() {
        return this.f102664d;
    }

    public final int e() {
        return this.f102665e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return g0.g(this.f102661a, gVar.f102661a) && g0.g(this.f102662b, gVar.f102662b) && g0.g(this.f102663c, gVar.f102663c) && this.f102664d == gVar.f102664d && this.f102665e == gVar.f102665e && this.f102666f == gVar.f102666f && this.f102667g == gVar.f102667g && g0.g(this.f102668h, gVar.f102668h);
    }

    public final int f() {
        return this.f102666f;
    }

    public final boolean g() {
        return this.f102667g;
    }

    @k
    public final String h() {
        return this.f102668h;
    }

    public int hashCode() {
        int hashCode = this.f102661a.hashCode() * 31;
        Drawable drawable = this.f102662b;
        return ((((((((((((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.f102663c.hashCode()) * 31) + Boolean.hashCode(this.f102664d)) * 31) + Integer.hashCode(this.f102665e)) * 31) + Integer.hashCode(this.f102666f)) * 31) + Boolean.hashCode(this.f102667g)) * 31) + this.f102668h.hashCode();
    }

    @k
    public final g i(@k String aid, @l Drawable drawable, @k String imgUrl, boolean z11, int i11, int i12, boolean z12, @k String name) {
        g0.p(aid, "aid");
        g0.p(imgUrl, "imgUrl");
        g0.p(name, "name");
        return new g(aid, drawable, imgUrl, z11, i11, i12, z12, name);
    }

    @k
    public final String k() {
        return this.f102661a;
    }

    public final int l() {
        return this.f102666f;
    }

    @l
    public final Drawable m() {
        return this.f102662b;
    }

    @k
    public final String n() {
        return this.f102663c;
    }

    @k
    public final String o() {
        return this.f102668h;
    }

    public final int p() {
        return this.f102665e;
    }

    public final boolean q() {
        return this.f102664d;
    }

    public final boolean r() {
        return this.f102667g;
    }

    @k
    public String toString() {
        return "TabItemSimple(aid=" + this.f102661a + ", iconDrawable=" + this.f102662b + ", imgUrl=" + this.f102663c + ", supportTaoBao=" + this.f102664d + ", serverRecommend=" + this.f102665e + ", attempt=" + this.f102666f + ", useOriginalDrawable=" + this.f102667g + ", name=" + this.f102668h + j.f81007d;
    }
}
