package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRenderEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderEffect.kt\nandroidx/compose/ui/graphics/RenderEffectKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,78:1\n30#2:79\n53#3,3:80\n*S KotlinDebug\n*F\n+ 1 RenderEffect.kt\nandroidx/compose/ui/graphics/RenderEffectKt\n*L\n71#1:79\n71#1:80,3\n*E\n"})
/* loaded from: classes.dex */
public final class RenderEffectKt {
    @Stable
    @m80.k
    /* renamed from: BlurEffect-3YTHUZs, reason: not valid java name */
    public static final BlurEffect m2817BlurEffect3YTHUZs(float f11, float f12, int i11) {
        return new BlurEffect(null, f11, f12, i11, null);
    }

    /* renamed from: BlurEffect-3YTHUZs$default, reason: not valid java name */
    public static /* synthetic */ BlurEffect m2818BlurEffect3YTHUZs$default(float f11, float f12, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = TileMode.Companion.m2882getClamp3opZhB0();
        }
        return m2817BlurEffect3YTHUZs(f11, f12, i11);
    }

    @Stable
    @m80.k
    public static final OffsetEffect OffsetEffect(float f11, float f12) {
        return new OffsetEffect(null, Offset.m2260constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32)), null);
    }
}
