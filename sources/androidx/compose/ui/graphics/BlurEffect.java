package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class BlurEffect extends RenderEffect {
    private final int edgeTreatment;
    private final float radiusX;
    private final float radiusY;

    @m80.l
    private final RenderEffect renderEffect;

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f11, float f12, int i11, kotlin.jvm.internal.v vVar) {
        this(renderEffect, f11, f12, i11);
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    @RequiresApi(31)
    @m80.k
    public android.graphics.RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m2819createBlurEffect8A3gB4(this.renderEffect, this.radiusX, this.radiusY, this.edgeTreatment);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) obj;
        return this.radiusX == blurEffect.radiusX && this.radiusY == blurEffect.radiusY && TileMode.m2878equalsimpl0(this.edgeTreatment, blurEffect.edgeTreatment) && kotlin.jvm.internal.g0.g(this.renderEffect, blurEffect.renderEffect);
    }

    public int hashCode() {
        RenderEffect renderEffect = this.renderEffect;
        return ((((((renderEffect != null ? renderEffect.hashCode() : 0) * 31) + Float.hashCode(this.radiusX)) * 31) + Float.hashCode(this.radiusY)) * 31) + TileMode.m2879hashCodeimpl(this.edgeTreatment);
    }

    @m80.k
    public String toString() {
        return "BlurEffect(renderEffect=" + this.renderEffect + ", radiusX=" + this.radiusX + ", radiusY=" + this.radiusY + ", edgeTreatment=" + ((Object) TileMode.m2880toStringimpl(this.edgeTreatment)) + ')';
    }

    private BlurEffect(RenderEffect renderEffect, float f11, float f12, int i11) {
        super(null);
        this.renderEffect = renderEffect;
        this.radiusX = f11;
        this.radiusY = f12;
        this.edgeTreatment = i11;
    }

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f11, float f12, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(renderEffect, f11, (i12 & 4) != 0 ? f11 : f12, (i12 & 8) != 0 ? TileMode.Companion.m2882getClamp3opZhB0() : i11, null);
    }
}
