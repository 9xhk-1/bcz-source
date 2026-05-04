package androidx.compose.material;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class RippleConfiguration {
    public static final int $stable = 0;
    private final long color;

    @l
    private final RippleAlpha rippleAlpha;

    public /* synthetic */ RippleConfiguration(long j11, RippleAlpha rippleAlpha, v vVar) {
        this(j11, rippleAlpha);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleConfiguration)) {
            return false;
        }
        RippleConfiguration rippleConfiguration = (RippleConfiguration) obj;
        return Color.m2510equalsimpl0(this.color, rippleConfiguration.color) && g0.g(this.rippleAlpha, rippleConfiguration.rippleAlpha);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m1744getColor0d7_KjU() {
        return this.color;
    }

    @l
    public final RippleAlpha getRippleAlpha() {
        return this.rippleAlpha;
    }

    public int hashCode() {
        int m2516hashCodeimpl = Color.m2516hashCodeimpl(this.color) * 31;
        RippleAlpha rippleAlpha = this.rippleAlpha;
        return m2516hashCodeimpl + (rippleAlpha != null ? rippleAlpha.hashCode() : 0);
    }

    @k
    public String toString() {
        return "RippleConfiguration(color=" + ((Object) Color.m2517toStringimpl(this.color)) + ", rippleAlpha=" + this.rippleAlpha + ')';
    }

    private RippleConfiguration(long j11, RippleAlpha rippleAlpha) {
        this.color = j11;
        this.rippleAlpha = rippleAlpha;
    }

    public /* synthetic */ RippleConfiguration(long j11, RippleAlpha rippleAlpha, int i11, v vVar) {
        this((i11 & 1) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : j11, (i11 & 2) != 0 ? null : rippleAlpha, null);
    }
}
