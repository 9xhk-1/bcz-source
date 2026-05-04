package androidx.compose.foundation;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@ExperimentalFoundationApi
@n(message = "Providing `OverscrollConfiguration` through `LocalOverscrollConfiguration` to disable / configure overscroll has been replaced with `LocalOverscrollFactory` and `rememberPlatformOverscrollFactory`. To disable overscroll, instead of `LocalOverscrollConfiguration provides null`, use `LocalOverscrollFactory provides null`. To change the glow color / padding, instead of `LocalOverscrollConfiguration provides OverscrollConfiguration(myColor, myPadding)`, use `LocalOverscrollFactory provides rememberPlatformOverscrollFactory(myColor, myPadding)`")
/* loaded from: classes.dex */
public final class OverscrollConfiguration {
    public static final int $stable = 0;

    @m80.k
    private final PaddingValues drawPadding;
    private final long glowColor;

    public /* synthetic */ OverscrollConfiguration(long j11, PaddingValues paddingValues, v vVar) {
        this(j11, paddingValues);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g0.g(OverscrollConfiguration.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        g0.n(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) obj;
        return Color.m2510equalsimpl0(this.glowColor, overscrollConfiguration.glowColor) && g0.g(this.drawPadding, overscrollConfiguration.drawPadding);
    }

    @m80.k
    public final PaddingValues getDrawPadding() {
        return this.drawPadding;
    }

    /* renamed from: getGlowColor-0d7_KjU, reason: not valid java name */
    public final long m324getGlowColor0d7_KjU() {
        return this.glowColor;
    }

    public int hashCode() {
        return (Color.m2516hashCodeimpl(this.glowColor) * 31) + this.drawPadding.hashCode();
    }

    @m80.k
    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) Color.m2517toStringimpl(this.glowColor)) + ", drawPadding=" + this.drawPadding + ')';
    }

    private OverscrollConfiguration(long j11, PaddingValues paddingValues) {
        this.glowColor = j11;
        this.drawPadding = paddingValues;
    }

    public /* synthetic */ OverscrollConfiguration(long j11, PaddingValues paddingValues, int i11, v vVar) {
        this((i11 & 1) != 0 ? ColorKt.Color(4284900966L) : j11, (i11 & 2) != 0 ? PaddingKt.m721PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null) : paddingValues, null);
    }
}
