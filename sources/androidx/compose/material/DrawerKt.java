package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,842:1\n1247#2,6:843\n1247#2,6:850\n1247#2,3:863\n1250#2,3:867\n1247#2,3:877\n1250#2,3:881\n1247#2,6:901\n1247#2,6:907\n1247#2,6:913\n1247#2,6:919\n1247#2,6:925\n1247#2,6:931\n75#3:849\n557#4:856\n554#4,6:857\n557#4:870\n554#4,6:871\n555#5:866\n555#5:880\n71#6,16:884\n696#7:900\n85#8:937\n149#9:938\n149#9:939\n149#9:940\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n*L\n396#1:843,6\n419#1:850,6\n467#1:863,3\n467#1:867,3\n594#1:877,3\n594#1:881,3\n737#1:901,6\n738#1:907,6\n749#1:913,6\n760#1:919,6\n761#1:925,6\n772#1:931,6\n415#1:849\n467#1:856\n467#1:857,6\n594#1:870\n594#1:871,6\n467#1:866\n594#1:880\n727#1:884,16\n731#1:900\n733#1:937\n775#1:938\n776#1:939\n777#1:940\n*E\n"})
/* loaded from: classes.dex */
public final class DrawerKt {
    private static final float BottomDrawerOpenFraction = 0.5f;
    private static final float DrawerPositionalThreshold;
    private static final float EndDrawerPadding;
    private static final float DrawerVelocityThreshold = Dp.m5115constructorimpl(400);

    @k
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    static {
        float f11 = 56;
        EndDrawerPadding = Dp.m5115constructorimpl(f11);
        DrawerPositionalThreshold = Dp.m5115constructorimpl(f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02aa  */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomDrawer-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1649BottomDrawerGs3lGvM(@m80.k final x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r31, @m80.l androidx.compose.ui.Modifier r32, @m80.l androidx.compose.material.BottomDrawerState r33, boolean r34, @m80.l androidx.compose.ui.graphics.Shape r35, float r36, long r37, long r39, long r41, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r43, @m80.l androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m1649BottomDrawerGs3lGvM(x00.q, androidx.compose.ui.Modifier, androidx.compose.material.BottomDrawerState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: BottomDrawerScrim-3J-VO9M, reason: not valid java name */
    public static final void m1650BottomDrawerScrim3JVO9M(final long j11, final a<g2> aVar, final boolean z11, Composer composer, final int i11) {
        int i12;
        Modifier modifier;
        Modifier then;
        Composer startRestartGroup = composer.startRestartGroup(-513067266);
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
                ComposerKt.traceEventStart(-513067266, i12, -1, "androidx.compose.material.BottomDrawerScrim (Drawer.kt:729)");
            }
            if (j11 != 16) {
                startRestartGroup.startReplaceGroup(1552573422);
                int i13 = i12;
                final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z11 ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                final String m1783getString4foXLRw = Strings_androidKt.m1783getString4foXLRw(Strings.Companion.m1775getCloseDrawerUdPEhr4(), startRestartGroup, 6);
                if (z11) {
                    startRestartGroup.startReplaceGroup(1552793770);
                    Modifier.Companion companion = Modifier.Companion;
                    int i14 = i13 & 112;
                    boolean z12 = i14 == 32;
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(aVar, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    then = companion.then(new SuspendPointerInputElement(aVar, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((p) rememberedValue), 6, null));
                    boolean changed = (i14 == 32) | startRestartGroup.changed(m1783getString4foXLRw);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$2$1
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
                                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new a<Boolean>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$2$1.1
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
                    startRestartGroup.startReplaceGroup(1553158454);
                    startRestartGroup.endReplaceGroup();
                    modifier = Modifier.Companion;
                }
                Modifier then2 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier);
                boolean changed2 = startRestartGroup.changed(animateFloatAsState) | ((i13 & 14) == 4);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new l<DrawScope, g2>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$1$1
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
                            float BottomDrawerScrim_3J_VO9M$lambda$2;
                            long j12 = j11;
                            BottomDrawerScrim_3J_VO9M$lambda$2 = DrawerKt.BottomDrawerScrim_3J_VO9M$lambda$2(animateFloatAsState);
                            DrawScope.m3054drawRectnJ9OG0$default(drawScope, j12, 0L, 0L, BottomDrawerScrim_3J_VO9M$lambda$2, null, null, 0, 118, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                CanvasKt.Canvas(then2, (l) rememberedValue3, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1553326846);
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
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$2
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
                    DrawerKt.m1650BottomDrawerScrim3JVO9M(j11, aVar, z11, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BottomDrawerScrim_3J_VO9M$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState) {
        return new DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0278  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalDrawer-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1651ModalDrawerGs3lGvM(@m80.k final x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r31, @m80.l androidx.compose.ui.Modifier r32, @m80.l androidx.compose.material.DrawerState r33, boolean r34, @m80.l androidx.compose.ui.graphics.Shape r35, float r36, long r37, long r39, long r41, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r43, @m80.l androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m1651ModalDrawerGs3lGvM(x00.q, androidx.compose.ui.Modifier, androidx.compose.material.DrawerState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-Bx497Mc, reason: not valid java name */
    public static final void m1652ScrimBx497Mc(final boolean z11, final a<g2> aVar, final a<Float> aVar2, final long j11, Composer composer, final int i11) {
        int i12;
        Modifier modifier;
        Modifier then;
        Composer startRestartGroup = composer.startRestartGroup(1983403750);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changed(j11) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1983403750, i12, -1, "androidx.compose.material.Scrim (Drawer.kt:755)");
            }
            final String m1783getString4foXLRw = Strings_androidKt.m1783getString4foXLRw(Strings.Companion.m1775getCloseDrawerUdPEhr4(), startRestartGroup, 6);
            if (z11) {
                startRestartGroup.startReplaceGroup(487534424);
                Modifier.Companion companion = Modifier.Companion;
                int i13 = i12 & 112;
                boolean z12 = i13 == 32;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new DrawerKt$Scrim$dismissDrawer$1$1(aVar, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                then = companion.then(new SuspendPointerInputElement(aVar, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((p) rememberedValue), 6, null));
                boolean changed = (i13 == 32) | startRestartGroup.changed(m1783getString4foXLRw);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1
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
                            final a<g2> aVar3 = aVar;
                            SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new a<Boolean>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // x00.a
                                public final Boolean invoke() {
                                    aVar3.invoke();
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
                startRestartGroup.startReplaceGroup(487858498);
                startRestartGroup.endReplaceGroup();
                modifier = Modifier.Companion;
            }
            Modifier then2 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier);
            boolean z13 = ((i12 & 7168) == 2048) | ((i12 & 896) == 256);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z13 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new l<DrawScope, g2>() { // from class: androidx.compose.material.DrawerKt$Scrim$1$1
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
                        DrawScope.m3054drawRectnJ9OG0$default(drawScope, j11, 0L, 0L, aVar2.invoke().floatValue(), null, null, 0, 118, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            CanvasKt.Canvas(then2, (l) rememberedValue3, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.DrawerKt$Scrim$2
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
                    DrawerKt.m1652ScrimBx497Mc(z11, aVar, aVar2, j11, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateFraction(float f11, float f12, float f13) {
        float f14 = (f13 - f11) / (f12 - f11);
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 1.0f) {
            return 1.0f;
        }
        return f14;
    }

    @Composable
    @k
    public static final BottomDrawerState rememberBottomDrawerState(@k final BottomDrawerValue bottomDrawerValue, @m80.l final l<? super BottomDrawerValue, Boolean> lVar, @m80.l final AnimationSpec<Float> animationSpec, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            lVar = new l<BottomDrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerKt$rememberBottomDrawerState$1
                @Override // x00.l
                public final Boolean invoke(BottomDrawerValue bottomDrawerValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if ((i12 & 4) != 0) {
            animationSpec = DrawerDefaults.INSTANCE.getAnimationSpec();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1477366969, i11, -1, "androidx.compose.material.rememberBottomDrawerState (Drawer.kt:413)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {density};
        Saver<BottomDrawerState, BottomDrawerValue> Saver = BottomDrawerState.Companion.Saver(density, lVar, animationSpec);
        boolean changed = ((((i11 & 14) ^ 6) > 4 && composer.changed(bottomDrawerValue)) || (i11 & 6) == 4) | composer.changed(density) | ((((i11 & 112) ^ 48) > 32 && composer.changed(lVar)) || (i11 & 48) == 32) | composer.changedInstance(animationSpec);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a<BottomDrawerState>() { // from class: androidx.compose.material.DrawerKt$rememberBottomDrawerState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final BottomDrawerState invoke() {
                    return new BottomDrawerState(BottomDrawerValue.this, density, lVar, animationSpec);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        BottomDrawerState bottomDrawerState = (BottomDrawerState) RememberSaveableKt.m2066rememberSaveable(objArr, (Saver) Saver, (String) null, (a) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomDrawerState;
    }

    @Composable
    @k
    public static final DrawerState rememberDrawerState(@k final DrawerValue drawerValue, @m80.l final l<? super DrawerValue, Boolean> lVar, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            lVar = new l<DrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$1
                @Override // x00.l
                public final Boolean invoke(DrawerValue drawerValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1435874229, i11, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:394)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.Companion.Saver(lVar);
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && composer.changed(drawerValue)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(lVar)) || (i11 & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a<DrawerState>() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final DrawerState invoke() {
                    return new DrawerState(DrawerValue.this, lVar);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m2066rememberSaveable(objArr, (Saver) Saver, (String) null, (a) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return drawerState;
    }
}
