package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import c10.d;
import c40.r0;
import j00.c;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,423:1\n1247#2,6:424\n1247#2,6:432\n1247#2,6:439\n1247#2,6:445\n1247#2,6:451\n1247#2,6:494\n1247#2,6:504\n1247#2,6:510\n1247#2,6:516\n1247#2,6:525\n75#3:430\n75#3:438\n75#3:457\n75#3:522\n75#3:523\n1#4:431\n71#5:458\n68#5,6:459\n74#5:493\n78#5:503\n79#6,6:465\n86#6,4:480\n90#6,2:490\n94#6:502\n368#7,9:471\n377#7:492\n378#7,2:500\n4034#8,6:484\n51#9:524\n57#9:544\n85#10:531\n113#10,2:532\n85#10:534\n85#10:535\n85#10:536\n85#10:537\n85#10:538\n149#11:539\n149#11:540\n149#11:541\n149#11:542\n149#11:543\n149#11:545\n149#11:546\n149#11:547\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n*L\n103#1:424,6\n110#1:432,6\n113#1:439,6\n128#1:445,6\n137#1:451,6\n183#1:494,6\n222#1:504,6\n224#1:510,6\n245#1:516,6\n261#1:525,6\n105#1:430\n111#1:438\n142#1:457\n249#1:522\n250#1:523\n157#1:458\n157#1:459,6\n157#1:493\n157#1:503\n157#1:465,6\n157#1:480,4\n157#1:490,2\n157#1:502\n157#1:471,9\n157#1:492\n157#1:500,2\n157#1:484,6\n250#1:524\n292#1:544\n110#1:531\n110#1:532,2\n126#1:534\n127#1:535\n244#1:536\n248#1:537\n252#1:538\n283#1:539\n284#1:540\n285#1:541\n287#1:542\n289#1:543\n296#1:545\n297#1:546\n422#1:547\n*E\n"})
/* loaded from: classes.dex */
public final class SwitchKt {

    @k
    private static final TweenSpec<Float> AnimationSpec;
    private static final float DefaultSwitchPadding;
    private static final float SwitchHeight;
    private static final float SwitchPositionalThreshold = 0.7f;
    private static final float SwitchVelocityThreshold;
    private static final float SwitchWidth;
    private static final float ThumbDefaultElevation;
    private static final float ThumbDiameter;
    private static final float ThumbPathLength;
    private static final float ThumbPressedElevation;
    private static final float ThumbRippleRadius;
    private static final float TrackStrokeWidth;
    private static final float TrackWidth;

    static {
        float m5115constructorimpl = Dp.m5115constructorimpl(34);
        TrackWidth = m5115constructorimpl;
        TrackStrokeWidth = Dp.m5115constructorimpl(14);
        float m5115constructorimpl2 = Dp.m5115constructorimpl(20);
        ThumbDiameter = m5115constructorimpl2;
        ThumbRippleRadius = Dp.m5115constructorimpl(24);
        DefaultSwitchPadding = Dp.m5115constructorimpl(2);
        SwitchWidth = m5115constructorimpl;
        SwitchHeight = m5115constructorimpl2;
        ThumbPathLength = Dp.m5115constructorimpl(m5115constructorimpl - m5115constructorimpl2);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
        ThumbDefaultElevation = Dp.m5115constructorimpl(1);
        ThumbPressedElevation = Dp.m5115constructorimpl(6);
        SwitchVelocityThreshold = Dp.m5115constructorimpl(125);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03cf  */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Switch(final boolean r36, @m80.l final x00.l<? super java.lang.Boolean, yz.g2> r37, @m80.l androidx.compose.ui.Modifier r38, boolean r39, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r40, @m80.l androidx.compose.material.SwitchColors r41, @m80.l androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwitchKt.Switch(boolean, x00.l, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SwitchColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Switch$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Switch$lambda$4(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l<Boolean, g2> Switch$lambda$7(State<? extends l<? super Boolean, g2>> state) {
        return (l) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Switch$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SwitchImpl(final BoxScope boxScope, final boolean z11, final boolean z12, final SwitchColors switchColors, final a<Float> aVar, final InteractionSource interactionSource, Composer composer, final int i11) {
        int i12;
        Modifier.Companion companion;
        boolean z13;
        long SwitchImpl$lambda$17;
        Composer startRestartGroup = composer.startRestartGroup(70908914);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(z12) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= startRestartGroup.changed(interactionSource) ? 131072 : 65536;
        }
        int i13 = i12;
        if (startRestartGroup.shouldExecute((74899 & i13) != 74898, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70908914, i13, -1, "androidx.compose.material.SwitchImpl (Switch.kt:220)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue == companion2.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            boolean z14 = (458752 & i13) == 131072;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z14 || rememberedValue2 == companion2.getEmpty()) {
                rememberedValue2 = new SwitchKt$SwitchImpl$1$1(interactionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            EffectsKt.LaunchedEffect(interactionSource, (p<? super r0, ? super c<? super g2>, ? extends Object>) rememberedValue2, startRestartGroup, (i13 >> 15) & 14);
            float f11 = !snapshotStateList.isEmpty() ? ThumbPressedElevation : ThumbDefaultElevation;
            int i14 = ((i13 >> 6) & 14) | (i13 & 112) | ((i13 >> 3) & 896);
            final State<Color> trackColor = switchColors.trackColor(z12, z11, startRestartGroup, i14);
            Modifier.Companion companion3 = Modifier.Companion;
            Alignment.Companion companion4 = Alignment.Companion;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(boxScope.align(companion3, companion4.getCenter()), 0.0f, 1, null);
            boolean changed = startRestartGroup.changed(trackColor);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == companion2.getEmpty()) {
                rememberedValue3 = new l<DrawScope, g2>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$2$1
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
                        long SwitchImpl$lambda$15;
                        SwitchImpl$lambda$15 = SwitchKt.SwitchImpl$lambda$15(trackColor);
                        SwitchKt.m1798drawTrackRPmYEkk(drawScope, SwitchImpl$lambda$15, drawScope.mo377toPx0680j_4(SwitchKt.getTrackWidth()), drawScope.mo377toPx0680j_4(SwitchKt.getTrackStrokeWidth()));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            CanvasKt.Canvas(fillMaxSize$default, (l) rememberedValue3, startRestartGroup, 0);
            State<Color> thumbColor = switchColors.thumbColor(z12, z11, startRestartGroup, i14);
            ElevationOverlay elevationOverlay = (ElevationOverlay) startRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
            float m5115constructorimpl = Dp.m5115constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m5129unboximpl() + f11);
            if (!Color.m2510equalsimpl0(SwitchImpl$lambda$17(thumbColor), MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1604getSurface0d7_KjU()) || elevationOverlay == null) {
                companion = companion3;
                z13 = true;
                startRestartGroup.startReplaceGroup(1478584670);
                startRestartGroup.endReplaceGroup();
                SwitchImpl$lambda$17 = SwitchImpl$lambda$17(thumbColor);
            } else {
                startRestartGroup.startReplaceGroup(1478495731);
                companion = companion3;
                z13 = true;
                SwitchImpl$lambda$17 = elevationOverlay.mo1641apply7g2Lkgo(SwitchImpl$lambda$17(thumbColor), m5115constructorimpl, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            State<Color> m113animateColorAsStateeuL9pac = SingleValueAnimationKt.m113animateColorAsStateeuL9pac(SwitchImpl$lambda$17, null, null, null, startRestartGroup, 0, 14);
            startRestartGroup = startRestartGroup;
            Modifier align = boxScope.align(companion, companion4.getCenterStart());
            boolean z15 = (i13 & 57344) == 16384 ? z13 : false;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z15 || rememberedValue4 == companion2.getEmpty()) {
                rememberedValue4 = new l<Density, IntOffset>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                        return IntOffset.m5234boximpl(m1799invokeBjo55l4(density));
                    }

                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m1799invokeBjo55l4(Density density) {
                        return IntOffsetKt.IntOffset(d.L0(aVar.invoke().floatValue()), 0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            SpacerKt.Spacer(BackgroundKt.m234backgroundbw27NRU(ShadowKt.m2144shadows4CzXII$default(SizeKt.m765requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(align, (l) rememberedValue4), interactionSource, RippleKt.m1748rippleH2RKhps$default(false, ThumbRippleRadius, 0L, 4, null)), ThumbDiameter), f11, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), SwitchImpl$lambda$18(m113animateColorAsStateeuL9pac), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i15) {
                    SwitchKt.SwitchImpl(BoxScope.this, z11, z12, switchColors, aVar, interactionSource, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long SwitchImpl$lambda$15(State<Color> state) {
        return state.getValue().m2519unboximpl();
    }

    private static final long SwitchImpl$lambda$17(State<Color> state) {
        return state.getValue().m2519unboximpl();
    }

    private static final long SwitchImpl$lambda$18(State<Color> state) {
        return state.getValue().m2519unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawTrack-RPmYEkk, reason: not valid java name */
    public static final void m1798drawTrackRPmYEkk(DrawScope drawScope, long j11, float f11, float f12) {
        float f13 = f12 / 2;
        DrawScope.m3046drawLineNGM6Ib0$default(drawScope, j11, androidx.compose.ui.geometry.OffsetKt.Offset(f13, Offset.m2269getYimpl(drawScope.mo3059getCenterF1C5BW0())), androidx.compose.ui.geometry.OffsetKt.Offset(f11 - f13, Offset.m2269getYimpl(drawScope.mo3059getCenterF1C5BW0())), f12, StrokeCap.Companion.m2863getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getTrackStrokeWidth() {
        return TrackStrokeWidth;
    }

    public static final float getTrackWidth() {
        return TrackWidth;
    }
}
