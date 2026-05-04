package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class OffsetEffect extends RenderEffect {
    private final long offset;

    @m80.l
    private final RenderEffect renderEffect;

    public /* synthetic */ OffsetEffect(RenderEffect renderEffect, long j11, kotlin.jvm.internal.v vVar) {
        this(renderEffect, j11);
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    @RequiresApi(31)
    @m80.k
    public android.graphics.RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m2820createOffsetEffectUv8p0NA(this.renderEffect, this.offset);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetEffect)) {
            return false;
        }
        OffsetEffect offsetEffect = (OffsetEffect) obj;
        return kotlin.jvm.internal.g0.g(this.renderEffect, offsetEffect.renderEffect) && Offset.m2265equalsimpl0(this.offset, offsetEffect.offset);
    }

    public int hashCode() {
        RenderEffect renderEffect = this.renderEffect;
        return ((renderEffect != null ? renderEffect.hashCode() : 0) * 31) + Offset.m2270hashCodeimpl(this.offset);
    }

    @m80.k
    public String toString() {
        return "OffsetEffect(renderEffect=" + this.renderEffect + ", offset=" + ((Object) Offset.m2276toStringimpl(this.offset)) + ')';
    }

    private OffsetEffect(RenderEffect renderEffect, long j11) {
        super(null);
        this.renderEffect = renderEffect;
        this.offset = j11;
    }
}
