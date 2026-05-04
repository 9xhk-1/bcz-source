package gn;

import androidx.compose.material.Colors;
import androidx.compose.material.Shapes;
import androidx.compose.material.Typography;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@n(message = "\n     compose-theme-adapter is deprecated.\n     The API has moved to accompanist/themeadapter/material.\n     For more information, please visit https://google.github.io/accompanist/themeadapter-material\n    ")
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final int f53970d = 0;

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Colors f53971a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Typography f53972b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Shapes f53973c;

    public b(@l Colors colors, @l Typography typography, @l Shapes shapes) {
        this.f53971a = colors;
        this.f53972b = typography;
        this.f53973c = shapes;
    }

    public static /* synthetic */ b e(b bVar, Colors colors, Typography typography, Shapes shapes, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            colors = bVar.f53971a;
        }
        if ((i11 & 2) != 0) {
            typography = bVar.f53972b;
        }
        if ((i11 & 4) != 0) {
            shapes = bVar.f53973c;
        }
        return bVar.d(colors, typography, shapes);
    }

    @l
    public final Colors a() {
        return this.f53971a;
    }

    @l
    public final Typography b() {
        return this.f53972b;
    }

    @l
    public final Shapes c() {
        return this.f53973c;
    }

    @k
    public final b d(@l Colors colors, @l Typography typography, @l Shapes shapes) {
        return new b(colors, typography, shapes);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g0.g(this.f53971a, bVar.f53971a) && g0.g(this.f53972b, bVar.f53972b) && g0.g(this.f53973c, bVar.f53973c);
    }

    @l
    public final Colors f() {
        return this.f53971a;
    }

    @l
    public final Shapes g() {
        return this.f53973c;
    }

    @l
    public final Typography h() {
        return this.f53972b;
    }

    public int hashCode() {
        Colors colors = this.f53971a;
        int hashCode = (colors == null ? 0 : colors.hashCode()) * 31;
        Typography typography = this.f53972b;
        int hashCode2 = (hashCode + (typography == null ? 0 : typography.hashCode())) * 31;
        Shapes shapes = this.f53973c;
        return hashCode2 + (shapes != null ? shapes.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ThemeParameters(colors=" + this.f53971a + ", typography=" + this.f53972b + ", shapes=" + this.f53973c + ')';
    }
}
