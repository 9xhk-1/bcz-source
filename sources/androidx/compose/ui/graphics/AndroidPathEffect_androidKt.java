package androidx.compose.ui.graphics;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect;
import androidx.compose.ui.graphics.StampedPathEffectStyle;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAndroidPathEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,65:1\n36#2,5:66\n*S KotlinDebug\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n*L\n51#1:66,5\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidPathEffect_androidKt {
    @m80.k
    public static final PathEffect actualChainPathEffect(@m80.k PathEffect pathEffect, @m80.k PathEffect pathEffect2) {
        kotlin.jvm.internal.g0.n(pathEffect, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        android.graphics.PathEffect nativePathEffect = ((AndroidPathEffect) pathEffect).getNativePathEffect();
        kotlin.jvm.internal.g0.n(pathEffect2, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return new AndroidPathEffect(new ComposePathEffect(nativePathEffect, ((AndroidPathEffect) pathEffect2).getNativePathEffect()));
    }

    @m80.k
    public static final PathEffect actualCornerPathEffect(float f11) {
        return new AndroidPathEffect(new CornerPathEffect(f11));
    }

    @m80.k
    public static final PathEffect actualDashPathEffect(@m80.k float[] fArr, float f11) {
        return new AndroidPathEffect(new DashPathEffect(fArr, f11));
    }

    @m80.k
    /* renamed from: actualStampedPathEffect-7aD1DOk, reason: not valid java name */
    public static final PathEffect m2405actualStampedPathEffect7aD1DOk(@m80.k Path path, float f11, float f12, int i11) {
        if (path instanceof AndroidPath) {
            return new AndroidPathEffect(new PathDashPathEffect(((AndroidPath) path).getInternalPath(), f11, f12, m2406toAndroidPathDashPathEffectStyleoQv6xUo(i11)));
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @m80.k
    public static final android.graphics.PathEffect asAndroidPathEffect(@m80.k PathEffect pathEffect) {
        kotlin.jvm.internal.g0.n(pathEffect, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((AndroidPathEffect) pathEffect).getNativePathEffect();
    }

    @m80.k
    /* renamed from: toAndroidPathDashPathEffectStyle-oQv6xUo, reason: not valid java name */
    public static final PathDashPathEffect.Style m2406toAndroidPathDashPathEffectStyleoQv6xUo(int i11) {
        StampedPathEffectStyle.Companion companion = StampedPathEffectStyle.Companion;
        return StampedPathEffectStyle.m2848equalsimpl0(i11, companion.m2852getMorphYpspkwk()) ? PathDashPathEffect.Style.MORPH : StampedPathEffectStyle.m2848equalsimpl0(i11, companion.m2853getRotateYpspkwk()) ? PathDashPathEffect.Style.ROTATE : StampedPathEffectStyle.m2848equalsimpl0(i11, companion.m2854getTranslateYpspkwk()) ? PathDashPathEffect.Style.TRANSLATE : PathDashPathEffect.Style.TRANSLATE;
    }

    @m80.k
    public static final PathEffect toComposePathEffect(@m80.k android.graphics.PathEffect pathEffect) {
        return new AndroidPathEffect(pathEffect);
    }
}
