package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import g10.f;
import g10.t;
import g10.u;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,629:1\n149#2:630\n149#2:705\n149#2:706\n71#3,16:631\n71#3,16:659\n1247#4,6:647\n1247#4,6:653\n1247#4,6:677\n1247#4,6:684\n75#5:675\n75#5:683\n1#6:676\n72#7,7:690\n85#8:697\n85#8:698\n85#8:699\n85#8:700\n85#8:701\n85#8:702\n85#8:703\n85#8:704\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n*L\n58#1:630\n572#1:705\n576#1:706\n110#1:631,16\n340#1:659,16\n116#1:647,6\n207#1:653,6\n342#1:677,6\n430#1:684,6\n341#1:675\n376#1:683\n554#1:690,7\n151#1:697\n164#1:698\n177#1:699\n190#1:700\n381#1:701\n395#1:702\n404#1:703\n418#1:704\n*E\n"})
/* loaded from: classes.dex */
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    private static final float StartAngleOffset = -90.0f;
    private static final float LinearIndicatorHeight = ProgressIndicatorDefaults.INSTANCE.m1722getStrokeWidthD9Ej5fM();
    private static final float LinearIndicatorWidth = Dp.m5115constructorimpl(240);
    private static final float CircularIndicatorDiameter = Dp.m5115constructorimpl(40);

    @k
    private static final CubicBezierEasing FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);

    @k
    private static final CubicBezierEasing FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    @k
    private static final CubicBezierEasing SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);

    @k
    private static final CubicBezierEasing SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);

    @k
    private static final CubicBezierEasing CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX WARN: Removed duplicated region for block: B:106:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x007c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1723CircularProgressIndicatorDUhRLBM(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) final float r26, @m80.l androidx.compose.ui.Modifier r27, long r28, float r30, long r31, int r33, @m80.l androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1723CircularProgressIndicatorDUhRLBM(float, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x009f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1724CircularProgressIndicatorLxG7B9w(@m80.l androidx.compose.ui.Modifier r30, long r31, float r33, long r34, int r36, @m80.l androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1724CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m1725CircularProgressIndicatorMBs18nI(final float r18, androidx.compose.ui.Modifier r19, long r20, float r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1725CircularProgressIndicatorMBs18nI(float, androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0065  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m1726CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier r16, long r17, float r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1726CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$12(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CircularProgressIndicator_LxG7B9w$lambda$9(State<Integer> state) {
        return state.getValue().intValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    public static final void m1727LinearProgressIndicator2cYBFYY(@l Modifier modifier, long j11, long j12, int i11, @l Composer composer, final int i12, final int i13) {
        Modifier modifier2;
        int i14;
        long j13;
        long j14;
        int i15;
        final Modifier modifier3;
        final int i16;
        final long j15;
        final long j16;
        Modifier modifier4;
        long j17;
        int i17;
        long j18;
        long j19;
        final long j21;
        final int i18;
        final long j22;
        int i19;
        Composer startRestartGroup = composer.startRestartGroup(1501635280);
        int i21 = i13 & 1;
        if (i21 != 0) {
            i14 = i12 | 6;
            modifier2 = modifier;
        } else if ((i12 & 6) == 0) {
            modifier2 = modifier;
            i14 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i12;
        } else {
            modifier2 = modifier;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            j13 = j11;
            i14 |= ((i13 & 2) == 0 && startRestartGroup.changed(j13)) ? 32 : 16;
        } else {
            j13 = j11;
        }
        if ((i12 & 384) == 0) {
            j14 = j12;
            i14 |= ((i13 & 4) == 0 && startRestartGroup.changed(j14)) ? 256 : 128;
        } else {
            j14 = j12;
        }
        if ((i12 & 3072) == 0) {
            if ((i13 & 8) == 0) {
                i15 = i11;
                if (startRestartGroup.changed(i15)) {
                    i19 = 2048;
                    i14 |= i19;
                }
            } else {
                i15 = i11;
            }
            i19 = 1024;
            i14 |= i19;
        } else {
            i15 = i11;
        }
        if (startRestartGroup.shouldExecute((i14 & 1171) != 1170, i14 & 1)) {
            startRestartGroup.startDefaults();
            if ((i12 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                modifier4 = i21 != 0 ? Modifier.Companion : modifier2;
                if ((i13 & 2) != 0) {
                    j13 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1600getPrimary0d7_KjU();
                    i14 &= -113;
                }
                long j23 = j13;
                if ((i13 & 4) != 0) {
                    j17 = Color.m2508copywmQWz5c$default(j23, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    i14 &= -897;
                } else {
                    j17 = j14;
                }
                if ((i13 & 8) != 0) {
                    i14 &= -7169;
                    i15 = StrokeCap.Companion.m2862getButtKaPHkGw();
                }
                long j24 = j17;
                i17 = i14;
                j18 = j23;
                j19 = j24;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i13 & 2) != 0) {
                    i14 &= -113;
                }
                if ((i13 & 4) != 0) {
                    i14 &= -897;
                }
                if ((i13 & 8) != 0) {
                    i14 &= -7169;
                }
                modifier4 = modifier2;
                j19 = j14;
                long j25 = j13;
                i17 = i14;
                j18 = j25;
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1501635280, i17, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:144)");
            }
            InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
            InfiniteRepeatableSpec m136infiniteRepeatable9IiC70o$default = AnimationSpecKt.m136infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new x00.l<KeyframesSpec.KeyframesSpecConfig<Float>, g2>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2
                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    CubicBezierEasing cubicBezierEasing;
                    keyframesSpecConfig.setDurationMillis(rn.l.f84410k);
                    KeyframesSpec.KeyframeEntity<Float> at2 = keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 0);
                    cubicBezierEasing = ProgressIndicatorKt.FirstLineHeadEasing;
                    keyframesSpecConfig.using(at2, cubicBezierEasing);
                    keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 750);
                }
            }), null, 0L, 6, null);
            int i22 = InfiniteTransition.$stable;
            int i23 = InfiniteRepeatableSpec.$stable;
            int i24 = i17;
            Modifier modifier5 = modifier4;
            long j26 = j19;
            final State<Float> animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, m136infiniteRepeatable9IiC70o$default, null, startRestartGroup, (i23 << 9) | i22 | 432, 8);
            final State<Float> animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m136infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new x00.l<KeyframesSpec.KeyframesSpecConfig<Float>, g2>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2
                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    CubicBezierEasing cubicBezierEasing;
                    keyframesSpecConfig.setDurationMillis(rn.l.f84410k);
                    KeyframesSpec.KeyframeEntity<Float> at2 = keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 333);
                    cubicBezierEasing = ProgressIndicatorKt.FirstLineTailEasing;
                    keyframesSpecConfig.using(at2, cubicBezierEasing);
                    keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1183);
                }
            }), null, 0L, 6, null), null, startRestartGroup, i22 | 432 | (i23 << 9), 8);
            final State<Float> animateFloat3 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m136infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new x00.l<KeyframesSpec.KeyframesSpecConfig<Float>, g2>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2
                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    CubicBezierEasing cubicBezierEasing;
                    keyframesSpecConfig.setDurationMillis(rn.l.f84410k);
                    KeyframesSpec.KeyframeEntity<Float> at2 = keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 1000);
                    cubicBezierEasing = ProgressIndicatorKt.SecondLineHeadEasing;
                    keyframesSpecConfig.using(at2, cubicBezierEasing);
                    keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1567);
                }
            }), null, 0L, 6, null), null, startRestartGroup, i22 | 432 | (i23 << 9), 8);
            final State<Float> animateFloat4 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m136infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new x00.l<KeyframesSpec.KeyframesSpecConfig<Float>, g2>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2
                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    CubicBezierEasing cubicBezierEasing;
                    keyframesSpecConfig.setDurationMillis(rn.l.f84410k);
                    KeyframesSpec.KeyframeEntity<Float> at2 = keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 1267);
                    cubicBezierEasing = ProgressIndicatorKt.SecondLineTailEasing;
                    keyframesSpecConfig.using(at2, cubicBezierEasing);
                    keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), rn.l.f84410k);
                }
            }), null, 0L, 6, null), null, startRestartGroup, i22 | 432 | (i23 << 9), 8);
            Modifier m775sizeVpY3zN4 = SizeKt.m775sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(increaseSemanticsBounds(modifier5)), LinearIndicatorWidth, LinearIndicatorHeight);
            boolean changed = ((((i24 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(i15)) || (i24 & 3072) == 2048) | ((((i24 & 896) ^ 384) > 256 && startRestartGroup.changed(j26)) || (i24 & 384) == 256) | startRestartGroup.changed(animateFloat) | startRestartGroup.changed(animateFloat2) | ((((i24 & 112) ^ 48) > 32 && startRestartGroup.changed(j18)) || (i24 & 48) == 32) | startRestartGroup.changed(animateFloat3) | startRestartGroup.changed(animateFloat4);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                j21 = j18;
                i18 = i15;
                j22 = j26;
                rememberedValue = new x00.l<DrawScope, g2>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float LinearProgressIndicator_2cYBFYY$lambda$1;
                        float LinearProgressIndicator_2cYBFYY$lambda$2;
                        DrawScope drawScope2;
                        float LinearProgressIndicator_2cYBFYY$lambda$3;
                        float LinearProgressIndicator_2cYBFYY$lambda$4;
                        float LinearProgressIndicator_2cYBFYY$lambda$32;
                        float LinearProgressIndicator_2cYBFYY$lambda$42;
                        float LinearProgressIndicator_2cYBFYY$lambda$12;
                        float LinearProgressIndicator_2cYBFYY$lambda$22;
                        float m2334getHeightimpl = Size.m2334getHeightimpl(drawScope.mo3060getSizeNHjbRc());
                        ProgressIndicatorKt.m1741drawLinearIndicatorBackgroundAZGd3zU(drawScope, j22, m2334getHeightimpl, i18);
                        LinearProgressIndicator_2cYBFYY$lambda$1 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(animateFloat);
                        LinearProgressIndicator_2cYBFYY$lambda$2 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(animateFloat2);
                        if (LinearProgressIndicator_2cYBFYY$lambda$1 - LinearProgressIndicator_2cYBFYY$lambda$2 > 0.0f) {
                            LinearProgressIndicator_2cYBFYY$lambda$12 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(animateFloat);
                            LinearProgressIndicator_2cYBFYY$lambda$22 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(animateFloat2);
                            drawScope2 = drawScope;
                            ProgressIndicatorKt.m1740drawLinearIndicatorqYKTg0g(drawScope2, LinearProgressIndicator_2cYBFYY$lambda$12, LinearProgressIndicator_2cYBFYY$lambda$22, j21, m2334getHeightimpl, i18);
                        } else {
                            drawScope2 = drawScope;
                        }
                        LinearProgressIndicator_2cYBFYY$lambda$3 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(animateFloat3);
                        LinearProgressIndicator_2cYBFYY$lambda$4 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(animateFloat4);
                        if (LinearProgressIndicator_2cYBFYY$lambda$3 - LinearProgressIndicator_2cYBFYY$lambda$4 > 0.0f) {
                            LinearProgressIndicator_2cYBFYY$lambda$32 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(animateFloat3);
                            LinearProgressIndicator_2cYBFYY$lambda$42 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(animateFloat4);
                            ProgressIndicatorKt.m1740drawLinearIndicatorqYKTg0g(drawScope2, LinearProgressIndicator_2cYBFYY$lambda$32, LinearProgressIndicator_2cYBFYY$lambda$42, j21, m2334getHeightimpl, i18);
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                j21 = j18;
                i18 = i15;
                j22 = j26;
            }
            CanvasKt.Canvas(m775sizeVpY3zN4, (x00.l) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
            j16 = j22;
            i16 = i18;
            j15 = j21;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            i16 = i15;
            j15 = j13;
            j16 = j14;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i25) {
                    ProgressIndicatorKt.m1727LinearProgressIndicator2cYBFYY(Modifier.this, j15, j16, i16, composer2, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m1728LinearProgressIndicatorRIQooxk(Modifier modifier, long j11, long j12, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        long j13;
        long j14;
        final Modifier modifier3;
        final long j15;
        final long j16;
        long j17;
        long j18;
        Modifier modifier4;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-819397058);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                j13 = j11;
                if (startRestartGroup.changed(j13)) {
                    i15 = 32;
                    i13 |= i15;
                }
            } else {
                j13 = j11;
            }
            i15 = 16;
            i13 |= i15;
        } else {
            j13 = j11;
        }
        if ((i11 & 384) == 0) {
            if ((i12 & 4) == 0) {
                j14 = j12;
                if (startRestartGroup.changed(j14)) {
                    i14 = 256;
                    i13 |= i14;
                }
            } else {
                j14 = j12;
            }
            i14 = 128;
            i13 |= i14;
        } else {
            j14 = j12;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            startRestartGroup.startDefaults();
            if ((i11 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                Modifier modifier5 = i16 != 0 ? Modifier.Companion : modifier2;
                if ((i12 & 2) != 0) {
                    j13 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1600getPrimary0d7_KjU();
                    i13 &= -113;
                }
                long j19 = j13;
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                    modifier4 = modifier5;
                    j17 = Color.m2508copywmQWz5c$default(j19, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    j18 = j19;
                } else {
                    j17 = j14;
                    j18 = j19;
                    modifier4 = modifier5;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
                j17 = j14;
                modifier4 = modifier2;
                j18 = j13;
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-819397058, i13, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:253)");
            }
            m1727LinearProgressIndicator2cYBFYY(modifier4, j18, j17, StrokeCap.Companion.m2862getButtKaPHkGw(), startRestartGroup, i13 & 1022, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            j15 = j18;
            j16 = j17;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j15 = j13;
            j16 = j14;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i17) {
                    ProgressIndicatorKt.m1728LinearProgressIndicatorRIQooxk(Modifier.this, j15, j16, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1729LinearProgressIndicator_5eSRE(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) final float r25, @m80.l androidx.compose.ui.Modifier r26, long r27, long r29, int r31, @m80.l androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1729LinearProgressIndicator_5eSRE(float, androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m1730LinearProgressIndicatoreaDK9VM(final float r24, androidx.compose.ui.Modifier r25, long r26, long r28, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1730LinearProgressIndicatoreaDK9VM(float, androidx.compose.ui.Modifier, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m1736drawCircularIndicator42QJj7c(DrawScope drawScope, float f11, float f12, long j11, Stroke stroke) {
        float f13 = 2;
        float width = stroke.getWidth() / f13;
        float m2337getWidthimpl = Size.m2337getWidthimpl(drawScope.mo3060getSizeNHjbRc()) - (f13 * width);
        DrawScope.m3039drawArcyD3GUKo$default(drawScope, j11, f11, f12, false, OffsetKt.Offset(width, width), androidx.compose.ui.geometry.SizeKt.Size(m2337getWidthimpl, m2337getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicatorBackground-bw27NRU, reason: not valid java name */
    public static final void m1737drawCircularIndicatorBackgroundbw27NRU(DrawScope drawScope, long j11, Stroke stroke) {
        m1736drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j11, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m1738drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f11, float f12, long j11, Stroke stroke) {
        m1736drawCircularIndicator42QJj7c(drawScope, f11, f12, j11, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m1739drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f11, float f12, float f13, long j11, Stroke stroke) {
        m1736drawCircularIndicator42QJj7c(drawScope, f11 + (StrokeCap.m2858equalsimpl0(stroke.m3129getCapKaPHkGw(), StrokeCap.Companion.m2862getButtKaPHkGw()) ? 0.0f : ((f12 / Dp.m5115constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f13, 0.1f), j11, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    public static final void m1740drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f11, float f12, long j11, float f13, int i11) {
        float m2337getWidthimpl = Size.m2337getWidthimpl(drawScope.mo3060getSizeNHjbRc());
        float m2334getHeightimpl = Size.m2334getHeightimpl(drawScope.mo3060getSizeNHjbRc());
        float f14 = 2;
        float f15 = m2334getHeightimpl / f14;
        boolean z11 = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f16 = (z11 ? f11 : 1.0f - f12) * m2337getWidthimpl;
        float f17 = (z11 ? f12 : 1.0f - f11) * m2337getWidthimpl;
        if (StrokeCap.m2858equalsimpl0(i11, StrokeCap.Companion.m2862getButtKaPHkGw()) || m2334getHeightimpl > m2337getWidthimpl) {
            DrawScope.m3046drawLineNGM6Ib0$default(drawScope, j11, OffsetKt.Offset(f16, f15), OffsetKt.Offset(f17, f15), f13, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f18 = f13 / f14;
        f<Float> e11 = t.e(f18, m2337getWidthimpl - f18);
        float floatValue = ((Number) u.M(Float.valueOf(f16), e11)).floatValue();
        float floatValue2 = ((Number) u.M(Float.valueOf(f17), e11)).floatValue();
        if (Math.abs(f12 - f11) > 0.0f) {
            DrawScope.m3046drawLineNGM6Ib0$default(drawScope, j11, OffsetKt.Offset(floatValue, f15), OffsetKt.Offset(floatValue2, f15), f13, i11, null, 0.0f, null, 0, 480, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicatorBackground-AZGd3zU, reason: not valid java name */
    public static final void m1741drawLinearIndicatorBackgroundAZGd3zU(DrawScope drawScope, long j11, float f11, int i11) {
        m1740drawLinearIndicatorqYKTg0g(drawScope, 0.0f, 1.0f, j11, f11, i11);
    }

    @k
    public static final Modifier increaseSemanticsBounds(@k Modifier modifier) {
        final float m5115constructorimpl = Dp.m5115constructorimpl(10);
        return PaddingKt.m728paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(modifier, new q<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material.ProgressIndicatorKt$increaseSemanticsBounds$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m1742invoke3p2s80s(measureScope, measurable, constraints.m5074unboximpl());
            }

            /* renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m1742invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j11) {
                final int mo371roundToPx0680j_4 = measureScope.mo371roundToPx0680j_4(m5115constructorimpl);
                int i11 = mo371roundToPx0680j_4 * 2;
                final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(ConstraintsKt.m5087offsetNN6EwU(j11, 0, i11));
                return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight() - i11, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.ProgressIndicatorKt$increaseSemanticsBounds$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, -mo371roundToPx0680j_4, 0.0f, 4, null);
                    }
                }, 4, null);
            }
        }), true, new x00.l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.material.ProgressIndicatorKt$increaseSemanticsBounds$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return g2.f100423a;
            }
        }), 0.0f, m5115constructorimpl, 1, null);
    }
}
