package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AndroidEdgeEffectOverscrollFactory implements OverscrollFactory {

    @m80.k
    private final Context context;

    @m80.k
    private final Density density;
    private final long glowColor;

    @m80.k
    private final PaddingValues glowDrawPadding;

    public /* synthetic */ AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j11, PaddingValues paddingValues, v vVar) {
        this(context, density, j11, paddingValues);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    @m80.k
    public OverscrollEffect createOverscrollEffect() {
        return new AndroidEdgeEffectOverscrollEffect(this.context, this.density, this.glowColor, this.glowDrawPadding, null);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g0.g(AndroidEdgeEffectOverscrollFactory.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        g0.n(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        AndroidEdgeEffectOverscrollFactory androidEdgeEffectOverscrollFactory = (AndroidEdgeEffectOverscrollFactory) obj;
        return g0.g(this.context, androidEdgeEffectOverscrollFactory.context) && g0.g(this.density, androidEdgeEffectOverscrollFactory.density) && Color.m2510equalsimpl0(this.glowColor, androidEdgeEffectOverscrollFactory.glowColor) && g0.g(this.glowDrawPadding, androidEdgeEffectOverscrollFactory.glowDrawPadding);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public int hashCode() {
        return (((((this.context.hashCode() * 31) + this.density.hashCode()) * 31) + Color.m2516hashCodeimpl(this.glowColor)) * 31) + this.glowDrawPadding.hashCode();
    }

    private AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j11, PaddingValues paddingValues) {
        this.context = context;
        this.density = density;
        this.glowColor = j11;
        this.glowDrawPadding = paddingValues;
    }

    public /* synthetic */ AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j11, PaddingValues paddingValues, int i11, v vVar) {
        this(context, density, (i11 & 4) != 0 ? AndroidOverscroll_androidKt.DefaultGlowColor : j11, (i11 & 8) != 0 ? AndroidOverscroll_androidKt.DefaultGlowPaddingValues : paddingValues, null);
    }
}
