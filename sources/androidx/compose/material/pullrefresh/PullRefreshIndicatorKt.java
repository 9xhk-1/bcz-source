package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 11 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,232:1\n1247#2,6:233\n1247#2,3:281\n1250#2,3:285\n1247#2,6:288\n1247#2,6:294\n75#3:239\n149#4:240\n149#4:337\n159#4:338\n159#4:339\n149#4:340\n149#4:341\n149#4:342\n71#5:241\n68#5,6:242\n74#5:276\n78#5:280\n79#6,6:248\n86#6,4:263\n90#6,2:273\n94#6:279\n368#7,9:254\n377#7:275\n378#7,2:277\n4034#8,6:267\n1#9:284\n71#10,16:300\n147#11,5:316\n272#11,14:321\n85#12:335\n85#12:336\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n*L\n84#1:233,6\n130#1:281,3\n130#1:285,3\n133#1:288,6\n138#1:294,6\n89#1:239\n98#1:240\n220#1:337\n222#1:338\n223#1:339\n224#1:340\n225#1:341\n226#1:342\n93#1:241\n93#1:242,6\n93#1:276\n93#1:280\n93#1:248,6\n93#1:263,4\n93#1:273,2\n93#1:279\n93#1:254,9\n93#1:275\n93#1:277,2\n93#1:267,6\n180#1:300,16\n214#1:316,5\n214#1:321,14\n84#1:335\n133#1:336\n*E\n"})
/* loaded from: classes.dex */
public final class PullRefreshIndicatorKt {
    private static final int CrossfadeDurationMs = 100;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final float IndicatorSize = Dp.m5115constructorimpl(40);

    @k
    private static final RoundedCornerShape SpinnerShape = RoundedCornerShapeKt.getCircleShape();
    private static final float ArcRadius = Dp.m5115constructorimpl((float) 7.5d);
    private static final float StrokeWidth = Dp.m5115constructorimpl((float) 2.5d);
    private static final float ArrowWidth = Dp.m5115constructorimpl(10);
    private static final float ArrowHeight = Dp.m5115constructorimpl(5);
    private static final float Elevation = Dp.m5115constructorimpl(6);

    @k
    private static final TweenSpec<Float> AlphaTween = AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrowValues ArrowValues(float f11) {
        float max = (Math.max(Math.min(1.0f, f11) - 0.4f, 0.0f) * 5) / 3;
        float abs = Math.abs(f11) - 1.0f;
        float f12 = abs >= 0.0f ? abs : 0.0f;
        if (f12 > 2.0f) {
            f12 = 2.0f;
        }
        float pow = (((0.4f * max) - 0.25f) + (f12 - (((float) Math.pow(f12, 2)) / 4))) * 0.5f;
        float f13 = 360;
        return new ArrowValues(pow, pow * f13, ((0.8f * max) + pow) * f13, Math.min(1.0f, max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    /* renamed from: CircularArrowIndicator-iJQMabo, reason: not valid java name */
    public static final void m1859CircularArrowIndicatoriJQMabo(final PullRefreshState pullRefreshState, final long j11, final Modifier modifier, Composer composer, final int i11) {
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-486016981);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(pullRefreshState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(j11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-486016981, i12, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:128)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            Object obj = rememberedValue;
            if (rememberedValue == companion.getEmpty()) {
                Path Path = AndroidPath_androidKt.Path();
                Path.mo2402setFillTypeoQ8Xj4U(PathFillType.Companion.m2791getEvenOddRgk1Os());
                startRestartGroup.updateRememberedValue(Path);
                obj = Path;
            }
            final Path path = (Path) obj;
            boolean changed = startRestartGroup.changed(pullRefreshState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt.derivedStateOf(new a<Float>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.a
                    public final Float invoke() {
                        return Float.valueOf(PullRefreshState.this.getProgress() < 1.0f ? 0.3f : 1.0f);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            boolean z11 = true;
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(CircularArrowIndicator_iJQMabo$lambda$6((State) rememberedValue2), AlphaTween, 0.0f, null, null, startRestartGroup, 48, 28);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, new l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return g2.f100423a;
                }
            }, 1, null);
            boolean changedInstance = startRestartGroup.changedInstance(pullRefreshState) | startRestartGroup.changed(animateFloatAsState);
            if ((i12 & 112) != 32) {
                z11 = false;
            }
            boolean changedInstance2 = changedInstance | z11 | startRestartGroup.changedInstance(path);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == companion.getEmpty()) {
                i13 = 0;
                l<DrawScope, g2> lVar = new l<DrawScope, g2>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$2$1
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
                        ArrowValues ArrowValues;
                        DrawContext drawContext;
                        long j12;
                        float f11;
                        float f12;
                        float f13;
                        ArrowValues = PullRefreshIndicatorKt.ArrowValues(PullRefreshState.this.getProgress());
                        float floatValue = animateFloatAsState.getValue().floatValue();
                        float rotation = ArrowValues.getRotation();
                        long j13 = j11;
                        Path path2 = path;
                        long mo3059getCenterF1C5BW0 = drawScope.mo3059getCenterF1C5BW0();
                        DrawContext drawContext2 = drawScope.getDrawContext();
                        long mo2981getSizeNHjbRc = drawContext2.mo2981getSizeNHjbRc();
                        drawContext2.getCanvas().save();
                        try {
                            drawContext2.getTransform().mo2987rotateUv8p0NA(rotation, mo3059getCenterF1C5BW0);
                            f11 = PullRefreshIndicatorKt.ArcRadius;
                            float mo377toPx0680j_4 = drawScope.mo377toPx0680j_4(f11);
                            f12 = PullRefreshIndicatorKt.StrokeWidth;
                            float mo377toPx0680j_42 = mo377toPx0680j_4 + (drawScope.mo377toPx0680j_4(f12) / 2.0f);
                            Rect rect = new Rect(Offset.m2268getXimpl(SizeKt.m2347getCenteruvyYCjk(drawScope.mo3060getSizeNHjbRc())) - mo377toPx0680j_42, Offset.m2269getYimpl(SizeKt.m2347getCenteruvyYCjk(drawScope.mo3060getSizeNHjbRc())) - mo377toPx0680j_42, Offset.m2268getXimpl(SizeKt.m2347getCenteruvyYCjk(drawScope.mo3060getSizeNHjbRc())) + mo377toPx0680j_42, Offset.m2269getYimpl(SizeKt.m2347getCenteruvyYCjk(drawScope.mo3060getSizeNHjbRc())) + mo377toPx0680j_42);
                            float startAngle = ArrowValues.getStartAngle();
                            float endAngle = ArrowValues.getEndAngle() - ArrowValues.getStartAngle();
                            long m2303getTopLeftF1C5BW0 = rect.m2303getTopLeftF1C5BW0();
                            try {
                                long m2301getSizeNHjbRc = rect.m2301getSizeNHjbRc();
                                f13 = PullRefreshIndicatorKt.StrokeWidth;
                                try {
                                    DrawScope.m3039drawArcyD3GUKo$default(drawScope, j13, startAngle, endAngle, false, m2303getTopLeftF1C5BW0, m2301getSizeNHjbRc, floatValue, new Stroke(drawScope.mo377toPx0680j_4(f13), 0.0f, StrokeCap.Companion.m2864getSquareKaPHkGw(), 0, null, 26, null), null, 0, 768, null);
                                    PullRefreshIndicatorKt.m1863drawArrowBx497Mc(drawScope, path2, rect, j13, floatValue, ArrowValues);
                                    drawContext2.getCanvas().restore();
                                    drawContext2.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                                } catch (Throwable th2) {
                                    th = th2;
                                    drawContext = drawContext2;
                                    j12 = mo2981getSizeNHjbRc;
                                    drawContext.getCanvas().restore();
                                    drawContext.mo2982setSizeuvyYCjk(j12);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                j12 = mo2981getSizeNHjbRc;
                                drawContext = drawContext2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            drawContext = drawContext2;
                            j12 = mo2981getSizeNHjbRc;
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(lVar);
                rememberedValue3 = lVar;
            } else {
                i13 = 0;
            }
            CanvasKt.Canvas(semantics$default, (l) rememberedValue3, startRestartGroup, i13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i14) {
                    PullRefreshIndicatorKt.m1859CircularArrowIndicatoriJQMabo(PullRefreshState.this, j11, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    private static final float CircularArrowIndicator_iJQMabo$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: PullRefreshIndicator-jB83MbM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1860PullRefreshIndicatorjB83MbM(final boolean r32, @m80.k final androidx.compose.material.pullrefresh.PullRefreshState r33, @m80.l androidx.compose.ui.Modifier r34, long r35, long r37, boolean r39, @m80.l androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt.m1860PullRefreshIndicatorjB83MbM(boolean, androidx.compose.material.pullrefresh.PullRefreshState, androidx.compose.ui.Modifier, long, long, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean PullRefreshIndicator_jB83MbM$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawArrow-Bx497Mc, reason: not valid java name */
    public static final void m1863drawArrowBx497Mc(DrawScope drawScope, Path path, Rect rect, long j11, float f11, ArrowValues arrowValues) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f12 = ArrowWidth;
        path.lineTo(drawScope.mo377toPx0680j_4(f12) * arrowValues.getScale(), 0.0f);
        path.lineTo((drawScope.mo377toPx0680j_4(f12) * arrowValues.getScale()) / 2, drawScope.mo377toPx0680j_4(ArrowHeight) * arrowValues.getScale());
        path.mo2404translatek4lQ0M(OffsetKt.Offset(((Math.min(rect.getWidth(), rect.getHeight()) / 2.0f) + Offset.m2268getXimpl(rect.m2298getCenterF1C5BW0())) - ((drawScope.mo377toPx0680j_4(f12) * arrowValues.getScale()) / 2.0f), Offset.m2269getYimpl(rect.m2298getCenterF1C5BW0()) + (drawScope.mo377toPx0680j_4(StrokeWidth) / 2.0f)));
        path.close();
        float endAngle = arrowValues.getEndAngle();
        long mo3059getCenterF1C5BW0 = drawScope.mo3059getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2987rotateUv8p0NA(endAngle, mo3059getCenterF1C5BW0);
            DrawScope.m3050drawPathLG529CI$default(drawScope, path, j11, f11, null, null, 0, 56, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
        }
    }
}
