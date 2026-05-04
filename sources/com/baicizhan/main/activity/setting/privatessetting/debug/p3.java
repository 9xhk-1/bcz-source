package com.baicizhan.main.activity.setting.privatessetting.debug;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLightEffectTest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightEffectTest.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/LightEffectTestKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,107:1\n1247#2,6:108\n85#3:114\n57#4:115\n57#4:118\n60#5:116\n60#5:119\n53#5,3:122\n53#5,3:126\n22#6:117\n22#6:120\n30#7:121\n30#7:125\n*S KotlinDebug\n*F\n+ 1 LightEffectTest.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/LightEffectTestKt\n*L\n58#1:108,6\n41#1:114\n59#1:115\n63#1:118\n59#1:116\n63#1:119\n66#1:122,3\n71#1:126,3\n59#1:117\n63#1:120\n66#1:121\n71#1:125\n*E\n"})
/* loaded from: classes4.dex */
public final class p3 {
    @m80.k
    public static final Modifier d(@m80.k Modifier sweepLight, boolean z11, final int i11, final float f11, final long j11, final float f12, @m80.k final RepeatMode repeatMode, final int i12, int i13) {
        kotlin.jvm.internal.g0.p(sweepLight, "$this$sweepLight");
        kotlin.jvm.internal.g0.p(repeatMode, "repeatMode");
        return !z11 ? sweepLight : ComposedModifierKt.composed$default(sweepLight, null, new x00.q() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.n3
            @Override // x00.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Modifier f13;
                f13 = p3.f(i11, repeatMode, i12, f11, j11, f12, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return f13;
            }
        }, 1, null);
    }

    public static /* synthetic */ Modifier e(Modifier modifier, boolean z11, int i11, float f11, long j11, float f12, RepeatMode repeatMode, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z11 = true;
        }
        if ((i14 & 2) != 0) {
            i11 = 500;
        }
        if ((i14 & 4) != 0) {
            f11 = 0.3f;
        }
        if ((i14 & 8) != 0) {
            j11 = Color.Companion.m2546getWhite0d7_KjU();
        }
        if ((i14 & 16) != 0) {
            f12 = 1.0f;
        }
        if ((i14 & 32) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i14 & 64) != 0) {
            i12 = -15;
        }
        if ((i14 & 128) != 0) {
            i13 = 3000;
        }
        long j12 = j11;
        float f13 = f11;
        return d(modifier, z11, i11, f13, j12, f12, repeatMode, i12, i13);
    }

    @Composable
    public static final Modifier f(int i11, RepeatMode repeatMode, int i12, final float f11, final long j11, final float f12, Modifier composed, Composer composer, int i13) {
        kotlin.jvm.internal.g0.p(composed, "$this$composed");
        composer.startReplaceGroup(-502385674);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-502385674, i13, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.sweepLight.<anonymous> (LightEffectTest.kt:38)");
        }
        final State<Float> animateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composer, 0, 1), -0.3f, 1.0f, AnimationSpecKt.m136infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(i11, 0, EasingKt.getLinearEasing(), 2, null), repeatMode, 0L, 4, null), null, composer, InfiniteTransition.$stable | 384 | (InfiniteRepeatableSpec.$stable << 9), 8);
        qb.c.i("LightEffectTest", "progress: " + g(animateFloat), new Object[0]);
        final float tan = (float) Math.tan((double) ((float) Math.toRadians((double) i12)));
        boolean changed = composer.changed(f11) | composer.changed(animateFloat) | composer.changed(tan) | composer.changed(j11) | composer.changed(f12);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            Object obj = new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.m3
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    DrawResult h11;
                    h11 = p3.h(f11, tan, j11, f12, animateFloat, (CacheDrawScope) obj2);
                    return h11;
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue = obj;
        }
        Modifier drawWithCache = DrawModifierKt.drawWithCache(composed, (x00.l) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return drawWithCache;
    }

    public static final float g(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final DrawResult h(float f11, float f12, long j11, float f13, State state, CacheDrawScope drawWithCache) {
        kotlin.jvm.internal.g0.p(drawWithCache, "$this$drawWithCache");
        float intBitsToFloat = Float.intBitsToFloat((int) (drawWithCache.m2129getSizeNHjbRc() >> 32)) * f11;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawWithCache.m2129getSizeNHjbRc() >> 32)) * g(state) * f12;
        float f14 = (intBitsToFloat / 2) * f12;
        final Brush m2460linearGradientmHitzGk$default = Brush.Companion.m2460linearGradientmHitzGk$default(Brush.Companion, a00.h0.Q(Color.m2499boximpl(Color.m2508copywmQWz5c$default(j11, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m2499boximpl(Color.m2508copywmQWz5c$default(j11, f13, 0.0f, 0.0f, 0.0f, 14, null)), Color.m2499boximpl(Color.m2508copywmQWz5c$default(j11, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), Offset.m2260constructorimpl((Float.floatToRawIntBits(r2 - r1) << 32) | (Float.floatToRawIntBits(intBitsToFloat2 - f14) & 4294967295L)), Offset.m2260constructorimpl((Float.floatToRawIntBits(r2 + r1) << 32) | (Float.floatToRawIntBits(intBitsToFloat2 + f14) & 4294967295L)), 0, 8, (Object) null);
        return drawWithCache.onDrawWithContent(new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.o3
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 i11;
                i11 = p3.i(Brush.this, (ContentDrawScope) obj);
                return i11;
            }
        });
    }

    public static final yz.g2 i(Brush brush, ContentDrawScope onDrawWithContent) {
        kotlin.jvm.internal.g0.p(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        DrawScope.m3053drawRectAsUm42w$default(onDrawWithContent, brush, 0L, 0L, 0.0f, null, null, BlendMode.Companion.m2448getSrcAtop0nO6VwU(), 62, null);
        return yz.g2.f100423a;
    }
}
