package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import g10.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import x00.p;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,590:1\n75#2:591\n1247#3,6:592\n1247#3,3:605\n1250#3,3:609\n1247#3,6:684\n1247#3,6:694\n1247#3,6:700\n1247#3,6:711\n1247#3,6:717\n1247#3,6:723\n557#4:598\n554#4,6:599\n555#5:608\n71#6:612\n68#6,6:613\n74#6:647\n71#6:648\n68#6,6:649\n74#6:683\n78#6:693\n78#6:709\n79#7,6:619\n86#7,4:634\n90#7,2:644\n79#7,6:655\n86#7,4:670\n90#7,2:680\n94#7:692\n94#7:708\n368#8,9:625\n377#8:646\n368#8,9:661\n377#8:682\n378#8,2:690\n378#8,2:706\n4034#9,6:638\n4034#9,6:674\n696#10:710\n85#11:729\n149#12:730\n149#12:731\n149#12:732\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n*L\n279#1:591\n297#1:592,6\n354#1:605,3\n354#1:609,3\n361#1:684,6\n376#1:694,6\n395#1:700,6\n497#1:711,6\n498#1:717,6\n509#1:723,6\n354#1:598\n354#1:599,6\n354#1:608\n356#1:612\n356#1:613,6\n356#1:647\n357#1:648\n357#1:649,6\n357#1:683\n357#1:693\n356#1:709\n356#1:619,6\n356#1:634,4\n356#1:644,2\n357#1:655,6\n357#1:670,4\n357#1:680,2\n357#1:692\n356#1:708\n356#1:625,9\n356#1:646\n357#1:661,9\n357#1:682\n357#1:690,2\n356#1:706,2\n356#1:638,6\n357#1:674,6\n491#1:710\n493#1:729\n587#1:730\n588#1:731\n589#1:732\n*E\n"})
/* loaded from: classes.dex */
public final class ModalBottomSheetKt {
    private static final float ModalBottomSheetPositionalThreshold = Dp.m5115constructorimpl(56);
    private static final float ModalBottomSheetVelocityThreshold = Dp.m5115constructorimpl(125);
    private static final float MaxModalBottomSheetWidth = Dp.m5115constructorimpl(640);

    private static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0241  */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalBottomSheetLayout-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1702ModalBottomSheetLayoutGs3lGvM(@m80.k final x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r31, @m80.l androidx.compose.ui.Modifier r32, @m80.l androidx.compose.material.ModalBottomSheetState r33, boolean r34, @m80.l androidx.compose.ui.graphics.Shape r35, float r36, long r37, long r39, long r41, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r43, @m80.l androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt.m1702ModalBottomSheetLayoutGs3lGvM(x00.q, androidx.compose.ui.Modifier, androidx.compose.material.ModalBottomSheetState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1703Scrim3JVO9M(final long j11, final a<g2> aVar, final boolean z11, Composer composer, final int i11) {
        int i12;
        Modifier modifier;
        Modifier then;
        Composer startRestartGroup = composer.startRestartGroup(-526532668);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(z11) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-526532668, i12, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:489)");
            }
            if (j11 != 16) {
                startRestartGroup.startReplaceGroup(477792612);
                int i13 = i12;
                final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z11 ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                final String m1783getString4foXLRw = Strings_androidKt.m1783getString4foXLRw(Strings.Companion.m1776getCloseSheetUdPEhr4(), startRestartGroup, 6);
                if (z11) {
                    startRestartGroup.startReplaceGroup(478010511);
                    Modifier.Companion companion = Modifier.Companion;
                    int i14 = i13 & 112;
                    boolean z12 = i14 == 32;
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(aVar, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    then = companion.then(new SuspendPointerInputElement(aVar, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((p) rememberedValue), 6, null));
                    boolean changed = (i14 == 32) | startRestartGroup.changed(m1783getString4foXLRw);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // x00.l
                            public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return g2.f100423a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m1783getString4foXLRw);
                                final a<g2> aVar2 = aVar;
                                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new a<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // x00.a
                                    public final Boolean invoke() {
                                        aVar2.invoke();
                                        return Boolean.TRUE;
                                    }
                                }, 1, null);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    modifier = SemanticsModifierKt.semantics(then, true, (l) rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(478374234);
                    startRestartGroup.endReplaceGroup();
                    modifier = Modifier.Companion;
                }
                Modifier then2 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier);
                boolean changed2 = startRestartGroup.changed(animateFloatAsState) | ((i13 & 14) == 4);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new l<DrawScope, g2>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$1$1
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
                            float Scrim_3J_VO9M$lambda$6;
                            long j12 = j11;
                            Scrim_3J_VO9M$lambda$6 = ModalBottomSheetKt.Scrim_3J_VO9M$lambda$6(animateFloatAsState);
                            DrawScope.m3054drawRectnJ9OG0$default(drawScope, j12, 0L, 0L, u.H(Scrim_3J_VO9M$lambda$6, 0.0f, 1.0f), null, null, 0, 118, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                CanvasKt.Canvas(then2, (l) rememberedValue3, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(478559490);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$2
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
                    ModalBottomSheetKt.m1703Scrim3JVO9M(j11, aVar, z11, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final Modifier modalBottomSheetAnchors(Modifier modifier, final ModalBottomSheetState modalBottomSheetState) {
        return AnchoredDraggableKt.draggableAnchors(modifier, modalBottomSheetState.getAnchoredDraggableState$material_release(), Orientation.Vertical, new p<IntSize, Constraints, Pair<? extends DraggableAnchors<ModalBottomSheetValue>, ? extends ModalBottomSheetValue>>() { // from class: androidx.compose.material.ModalBottomSheetKt$modalBottomSheetAnchors$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ModalBottomSheetValue.values().length];
                    try {
                        iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ModalBottomSheetValue.HalfExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ModalBottomSheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<ModalBottomSheetValue>, ? extends ModalBottomSheetValue> invoke(IntSize intSize, Constraints constraints) {
                return m1706invokeGpV2Q24(intSize.m5290unboximpl(), constraints.m5074unboximpl());
            }

            /* renamed from: invoke-GpV2Q24, reason: not valid java name */
            public final Pair<DraggableAnchors<ModalBottomSheetValue>, ModalBottomSheetValue> m1706invokeGpV2Q24(final long j11, long j12) {
                final float m5067getMaxHeightimpl = Constraints.m5067getMaxHeightimpl(j12);
                final ModalBottomSheetState modalBottomSheetState2 = ModalBottomSheetState.this;
                DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new l<DraggableAnchorsConfig<ModalBottomSheetValue>, g2>() { // from class: androidx.compose.material.ModalBottomSheetKt$modalBottomSheetAnchors$1$newAnchors$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(DraggableAnchorsConfig<ModalBottomSheetValue> draggableAnchorsConfig) {
                        invoke2(draggableAnchorsConfig);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DraggableAnchorsConfig<ModalBottomSheetValue> draggableAnchorsConfig) {
                        draggableAnchorsConfig.at(ModalBottomSheetValue.Hidden, m5067getMaxHeightimpl);
                        float f11 = m5067getMaxHeightimpl / 2.0f;
                        if (!modalBottomSheetState2.isSkipHalfExpanded$material_release() && IntSize.m5285getHeightimpl(j11) > f11) {
                            draggableAnchorsConfig.at(ModalBottomSheetValue.HalfExpanded, f11);
                        }
                        if (IntSize.m5285getHeightimpl(j11) != 0) {
                            draggableAnchorsConfig.at(ModalBottomSheetValue.Expanded, Math.max(0.0f, m5067getMaxHeightimpl - IntSize.m5285getHeightimpl(j11)));
                        }
                    }
                });
                boolean z11 = ModalBottomSheetState.this.getAnchoredDraggableState$material_release().getAnchors().getSize() > 0;
                ModalBottomSheetValue currentValue = ModalBottomSheetState.this.getCurrentValue();
                if (z11 || !DraggableAnchors.hasAnchorFor(currentValue)) {
                    int i11 = WhenMappings.$EnumSwitchMapping$0[ModalBottomSheetState.this.getTargetValue().ordinal()];
                    if (i11 == 1) {
                        currentValue = ModalBottomSheetValue.Hidden;
                    } else {
                        if (i11 != 2 && i11 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.HalfExpanded;
                        if (!DraggableAnchors.hasAnchorFor(modalBottomSheetValue)) {
                            modalBottomSheetValue = ModalBottomSheetValue.Expanded;
                            if (!DraggableAnchors.hasAnchorFor(modalBottomSheetValue)) {
                                modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                            }
                        }
                        currentValue = modalBottomSheetValue;
                    }
                }
                return h1.a(DraggableAnchors, currentValue);
            }
        });
    }

    @Composable
    @k
    public static final ModalBottomSheetState rememberModalBottomSheetState(@k final ModalBottomSheetValue modalBottomSheetValue, @m80.l AnimationSpec<Float> animationSpec, @m80.l l<? super ModalBottomSheetValue, Boolean> lVar, boolean z11, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = ModalBottomSheetDefaults.INSTANCE.getAnimationSpec();
        }
        final AnimationSpec<Float> animationSpec2 = animationSpec;
        final l<? super ModalBottomSheetValue, Boolean> lVar2 = (i12 & 4) != 0 ? new l<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$1
            @Override // x00.l
            public final Boolean invoke(ModalBottomSheetValue modalBottomSheetValue2) {
                return Boolean.TRUE;
            }
        } : lVar;
        final boolean z12 = (i12 & 8) != 0 ? false : z11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-126412120, i11, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:277)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startMovableGroup(976451635, modalBottomSheetValue);
        Object[] objArr = {modalBottomSheetValue, animationSpec2, Boolean.valueOf(z12), lVar2, density};
        Saver<ModalBottomSheetState, ?> Saver = ModalBottomSheetState.Companion.Saver(animationSpec2, lVar2, z12, density);
        boolean changed = ((((i11 & 14) ^ 6) > 4 && composer.changed(modalBottomSheetValue)) || (i11 & 6) == 4) | composer.changed(density) | ((((i11 & 896) ^ 384) > 256 && composer.changed(lVar2)) || (i11 & 384) == 256) | composer.changedInstance(animationSpec2) | ((((i11 & 7168) ^ 3072) > 2048 && composer.changed(z12)) || (i11 & 3072) == 2048);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            Object obj = new a<ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final ModalBottomSheetState invoke() {
                    return new ModalBottomSheetState(ModalBottomSheetValue.this, density, lVar2, animationSpec2, z12);
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue = obj;
        }
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.m2066rememberSaveable(objArr, (Saver) Saver, (String) null, (a) rememberedValue, composer, 0, 4);
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modalBottomSheetState;
    }
}
