package hn;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@n(message = "\n     compose-theme-adapter-core is deprecated.\n     The API has moved to accompanist/themeadapter/core.\n     For more information, please visit https://google.github.io/accompanist/themeadapter-core\n    ")
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f59507c = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final FontFamily f59508a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final FontWeight f59509b;

    public a(@k FontFamily fontFamily, @k FontWeight weight) {
        g0.p(fontFamily, "fontFamily");
        g0.p(weight, "weight");
        this.f59508a = fontFamily;
        this.f59509b = weight;
    }

    public static /* synthetic */ a d(a aVar, FontFamily fontFamily, FontWeight fontWeight, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fontFamily = aVar.f59508a;
        }
        if ((i11 & 2) != 0) {
            fontWeight = aVar.f59509b;
        }
        return aVar.c(fontFamily, fontWeight);
    }

    @k
    public final FontFamily a() {
        return this.f59508a;
    }

    @k
    public final FontWeight b() {
        return this.f59509b;
    }

    @k
    public final a c(@k FontFamily fontFamily, @k FontWeight weight) {
        g0.p(fontFamily, "fontFamily");
        g0.p(weight, "weight");
        return new a(fontFamily, weight);
    }

    @k
    public final FontFamily e() {
        return this.f59508a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f59508a, aVar.f59508a) && g0.g(this.f59509b, aVar.f59509b);
    }

    @k
    public final FontWeight f() {
        return this.f59509b;
    }

    public int hashCode() {
        return (this.f59508a.hashCode() * 31) + this.f59509b.hashCode();
    }

    @k
    public String toString() {
        return "FontFamilyWithWeight(fontFamily=" + this.f59508a + ", weight=" + this.f59509b + ')';
    }

    public /* synthetic */ a(FontFamily fontFamily, FontWeight fontWeight, int i11, v vVar) {
        this(fontFamily, (i11 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight);
    }
}
