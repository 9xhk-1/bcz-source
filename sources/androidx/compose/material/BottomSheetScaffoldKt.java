package androidx.compose.material;

import a00.h0;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material.FabPosition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import c10.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,601:1\n75#2:602\n75#2:635\n1247#3,6:603\n1247#3,6:609\n1247#3,6:615\n1247#3,3:628\n1250#3,3:632\n1247#3,6:637\n1247#3,6:643\n1247#3,6:649\n1225#3,6:663\n557#4:621\n554#4,6:622\n555#5:631\n1#6:636\n171#7:655\n169#7,7:656\n79#7,6:669\n86#7,4:684\n90#7,2:694\n94#7:699\n177#7:700\n368#8,9:675\n377#8,3:696\n4034#9,6:688\n149#10:701\n149#10:702\n149#10:703\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt\n*L\n226#1:602\n390#1:635\n235#1:603,6\n266#1:609,6\n268#1:615,6\n389#1:628,3\n389#1:632,3\n393#1:637,6\n416#1:643,6\n480#1:649,6\n471#1:663,6\n389#1:621\n389#1:622,6\n389#1:631\n471#1:655\n471#1:656,7\n471#1:669,6\n471#1:684,4\n471#1:694,2\n471#1:699\n471#1:700\n471#1:675,9\n471#1:696,3\n471#1:688,6\n598#1:701\n599#1:702\n600#1:703\n*E\n"})
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {
    private static final float FabSpacing = Dp.m5115constructorimpl(16);
    private static final float BottomSheetScaffoldPositionalThreshold = Dp.m5115constructorimpl(56);
    private static final float BottomSheetScaffoldVelocityThreshold = Dp.m5115constructorimpl(125);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a0  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomSheet-dAqlCkY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1560BottomSheetdAqlCkY(final androidx.compose.material.BottomSheetState r27, final boolean r28, final androidx.compose.ui.graphics.Shape r29, final float r30, final long r31, final long r33, final float r35, androidx.compose.ui.Modifier r36, final x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.m1560BottomSheetdAqlCkY(androidx.compose.material.BottomSheetState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, float, androidx.compose.ui.Modifier, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0202  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomSheetScaffold-HnlDQGw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1561BottomSheetScaffoldHnlDQGw(@m80.k final x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r37, @m80.l androidx.compose.ui.Modifier r38, @m80.l androidx.compose.material.BottomSheetScaffoldState r39, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r40, @m80.l x00.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r41, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r42, int r43, boolean r44, @m80.l androidx.compose.ui.graphics.Shape r45, float r46, long r47, long r49, float r51, long r52, long r54, @m80.k final x00.q<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r56, @m80.l androidx.compose.runtime.Composer r57, final int r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.m1561BottomSheetScaffoldHnlDQGw(x00.q, androidx.compose.ui.Modifier, androidx.compose.material.BottomSheetScaffoldState, x00.p, x00.q, x00.p, int, boolean, androidx.compose.ui.graphics.Shape, float, long, long, float, long, long, x00.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* renamed from: BottomSheetScaffoldLayout-HJHHjMs, reason: not valid java name */
    public static final void m1562BottomSheetScaffoldLayoutHJHHjMs(final p<? super Composer, ? super Integer, g2> pVar, final p<? super Composer, ? super Integer, g2> pVar2, final p<? super Composer, ? super Integer, g2> pVar3, final p<? super Composer, ? super Integer, g2> pVar4, final p<? super Composer, ? super Integer, g2> pVar5, final float f11, final a<Float> aVar, final int i11, final BottomSheetState bottomSheetState, Composer composer, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1411837005);
        if ((i12 & 6) == 0) {
            i13 = (startRestartGroup.changedInstance(pVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar3) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar4) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar5) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i13 |= startRestartGroup.changed(f11) ? 131072 : 65536;
        }
        if ((1572864 & i12) == 0) {
            i13 |= startRestartGroup.changedInstance(aVar) ? 1048576 : 524288;
        }
        if ((12582912 & i12) == 0) {
            i13 |= startRestartGroup.changed(i11) ? 8388608 : 4194304;
        }
        if ((100663296 & i12) == 0) {
            i13 |= startRestartGroup.changed(bottomSheetState) ? 67108864 : 33554432;
        }
        if (startRestartGroup.shouldExecute((38347923 & i13) != 38347922, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1411837005, i13, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:469)");
            }
            List Q = h0.Q(pVar == null ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1627getLambda2$material_release() : pVar, pVar2, pVar3, pVar4 == null ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1628getLambda3$material_release() : pVar4, pVar5);
            boolean z11 = ((3670016 & i13) == 1048576) | ((29360128 & i13) == 8388608) | ((458752 & i13) == 131072) | ((i13 & 234881024) == 67108864);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MultiContentMeasurePolicy() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1
                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo673measure3p2s80s(final MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j11) {
                        Object obj;
                        Object obj2;
                        Object obj3;
                        Object obj4;
                        int i14;
                        Object obj5;
                        List<? extends Measurable> list2 = list.get(0);
                        List<? extends Measurable> list3 = list.get(1);
                        List<? extends Measurable> list4 = list.get(2);
                        List<? extends Measurable> list5 = list.get(3);
                        List<? extends Measurable> list6 = list.get(4);
                        final int m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
                        final int m5067getMaxHeightimpl = Constraints.m5067getMaxHeightimpl(j11);
                        long m5058copyZbe2FdA$default = Constraints.m5058copyZbe2FdA$default(j11, 0, 0, 0, 0, 10, null);
                        final ArrayList arrayList = new ArrayList(list4.size());
                        int size = list4.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            arrayList.add(list4.get(i15).mo3857measureBRTryo0(m5058copyZbe2FdA$default));
                        }
                        final ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            arrayList2.add(list2.get(i16).mo3857measureBRTryo0(m5058copyZbe2FdA$default));
                        }
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            obj = arrayList2.get(0);
                            int height = ((Placeable) obj).getHeight();
                            int L = h0.L(arrayList2);
                            if (1 <= L) {
                                int i17 = 1;
                                while (true) {
                                    Object obj6 = arrayList2.get(i17);
                                    int height2 = ((Placeable) obj6).getHeight();
                                    if (height < height2) {
                                        height = height2;
                                        obj = obj6;
                                    }
                                    if (i17 == L) {
                                        break;
                                    }
                                    i17++;
                                }
                            }
                        }
                        Placeable placeable = (Placeable) obj;
                        final int height3 = placeable != null ? placeable.getHeight() : 0;
                        long m5058copyZbe2FdA$default2 = Constraints.m5058copyZbe2FdA$default(m5058copyZbe2FdA$default, 0, 0, 0, m5067getMaxHeightimpl - height3, 7, null);
                        final ArrayList arrayList3 = new ArrayList(list3.size());
                        int size3 = list3.size();
                        for (int i18 = 0; i18 < size3; i18++) {
                            arrayList3.add(list3.get(i18).mo3857measureBRTryo0(m5058copyZbe2FdA$default2));
                        }
                        final ArrayList arrayList4 = new ArrayList(list5.size());
                        int size4 = list5.size();
                        for (int i19 = 0; i19 < size4; i19++) {
                            arrayList4.add(list5.get(i19).mo3857measureBRTryo0(m5058copyZbe2FdA$default));
                        }
                        if (arrayList4.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList4.get(0);
                            int width = ((Placeable) obj2).getWidth();
                            int L2 = h0.L(arrayList4);
                            if (1 <= L2) {
                                int i21 = 1;
                                while (true) {
                                    Object obj7 = arrayList4.get(i21);
                                    int width2 = ((Placeable) obj7).getWidth();
                                    if (width < width2) {
                                        obj2 = obj7;
                                        width = width2;
                                    }
                                    if (i21 == L2) {
                                        break;
                                    }
                                    i21++;
                                }
                            }
                        }
                        Placeable placeable2 = (Placeable) obj2;
                        int width3 = placeable2 != null ? placeable2.getWidth() : 0;
                        if (arrayList4.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList4.get(0);
                            int height4 = ((Placeable) obj3).getHeight();
                            int L3 = h0.L(arrayList4);
                            if (1 <= L3) {
                                int i22 = 1;
                                while (true) {
                                    Object obj8 = arrayList4.get(i22);
                                    int height5 = ((Placeable) obj8).getHeight();
                                    if (height4 < height5) {
                                        height4 = height5;
                                        obj3 = obj8;
                                    }
                                    if (i22 == L3) {
                                        break;
                                    }
                                    i22++;
                                }
                            }
                        }
                        Placeable placeable3 = (Placeable) obj3;
                        final int height6 = placeable3 != null ? placeable3.getHeight() : 0;
                        final ArrayList arrayList5 = new ArrayList(list6.size());
                        int size5 = list6.size();
                        for (int i23 = 0; i23 < size5; i23++) {
                            arrayList5.add(list6.get(i23).mo3857measureBRTryo0(m5058copyZbe2FdA$default));
                        }
                        if (arrayList5.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList5.get(0);
                            int width4 = ((Placeable) obj4).getWidth();
                            int L4 = h0.L(arrayList5);
                            if (1 <= L4) {
                                int i24 = 1;
                                while (true) {
                                    Object obj9 = arrayList5.get(i24);
                                    int width5 = ((Placeable) obj9).getWidth();
                                    if (width4 < width5) {
                                        obj4 = obj9;
                                        width4 = width5;
                                    }
                                    if (i24 == L4) {
                                        break;
                                    }
                                    i24++;
                                }
                            }
                        }
                        Placeable placeable4 = (Placeable) obj4;
                        final int width6 = placeable4 != null ? placeable4.getWidth() : 0;
                        if (arrayList5.isEmpty()) {
                            i14 = 0;
                            obj5 = null;
                        } else {
                            i14 = 0;
                            Object obj10 = arrayList5.get(0);
                            int height7 = ((Placeable) obj10).getHeight();
                            int L5 = h0.L(arrayList5);
                            int i25 = 1;
                            if (1 <= L5) {
                                while (true) {
                                    Object obj11 = arrayList5.get(i25);
                                    int height8 = ((Placeable) obj11).getHeight();
                                    if (height7 < height8) {
                                        obj10 = obj11;
                                        height7 = height8;
                                    }
                                    if (i25 == L5) {
                                        break;
                                    }
                                    i25++;
                                }
                            }
                            obj5 = obj10;
                        }
                        Placeable placeable5 = (Placeable) obj5;
                        if (placeable5 != null) {
                            i14 = placeable5.getHeight();
                        }
                        final int i26 = i14;
                        final a<Float> aVar2 = aVar;
                        final int i27 = i11;
                        final float f12 = f11;
                        final BottomSheetState bottomSheetState2 = bottomSheetState;
                        final int i28 = width3;
                        return MeasureScope.layout$default(measureScope, m5068getMaxWidthimpl, m5067getMaxHeightimpl, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.1

                            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                            /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[BottomSheetValue.values().length];
                                    try {
                                        iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[BottomSheetValue.Expanded.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                float f13;
                                int mo371roundToPx0680j_4;
                                int i29;
                                int i31;
                                float f14;
                                float f15;
                                int L0 = d.L0(aVar2.invoke().floatValue());
                                int i32 = i27;
                                FabPosition.Companion companion = FabPosition.Companion;
                                if (FabPosition.m1674equalsimpl0(i32, companion.m1680getStart5ygKITE())) {
                                    MeasureScope measureScope2 = measureScope;
                                    f15 = BottomSheetScaffoldKt.FabSpacing;
                                    mo371roundToPx0680j_4 = measureScope2.mo371roundToPx0680j_4(f15);
                                } else if (FabPosition.m1674equalsimpl0(i32, companion.m1678getCenter5ygKITE())) {
                                    mo371roundToPx0680j_4 = (m5068getMaxWidthimpl - i28) / 2;
                                } else {
                                    int i33 = m5068getMaxWidthimpl - i28;
                                    MeasureScope measureScope3 = measureScope;
                                    f13 = BottomSheetScaffoldKt.FabSpacing;
                                    mo371roundToPx0680j_4 = i33 - measureScope3.mo371roundToPx0680j_4(f13);
                                }
                                int i34 = mo371roundToPx0680j_4;
                                float mo377toPx0680j_4 = measureScope.mo377toPx0680j_4(f12);
                                int i35 = height6;
                                if (mo377toPx0680j_4 < i35 / 2) {
                                    int i36 = L0 - i35;
                                    MeasureScope measureScope4 = measureScope;
                                    f14 = BottomSheetScaffoldKt.FabSpacing;
                                    i29 = i36 - measureScope4.mo371roundToPx0680j_4(f14);
                                } else {
                                    i29 = L0 - (i35 / 2);
                                }
                                int i37 = i29;
                                int i38 = (m5068getMaxWidthimpl - width6) / 2;
                                int i39 = WhenMappings.$EnumSwitchMapping$0[bottomSheetState2.getCurrentValue().ordinal()];
                                if (i39 == 1) {
                                    i31 = i37 - i26;
                                } else {
                                    if (i39 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i31 = m5067getMaxHeightimpl - i26;
                                }
                                int i41 = i31;
                                List<Placeable> list7 = arrayList3;
                                int i42 = height3;
                                int size6 = list7.size();
                                for (int i43 = 0; i43 < size6; i43++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list7.get(i43), 0, i42, 0.0f, 4, null);
                                }
                                List<Placeable> list8 = arrayList2;
                                int size7 = list8.size();
                                for (int i44 = 0; i44 < size7; i44++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list8.get(i44), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list9 = arrayList;
                                int size8 = list9.size();
                                for (int i45 = 0; i45 < size8; i45++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list9.get(i45), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list10 = arrayList4;
                                int size9 = list10.size();
                                for (int i46 = 0; i46 < size9; i46++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list10.get(i46), i34, i37, 0.0f, 4, null);
                                }
                                List<Placeable> list11 = arrayList5;
                                int size10 = list11.size();
                                for (int i47 = 0; i47 < size10; i47++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list11.get(i47), i38, i41, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) rememberedValue;
            Modifier.Companion companion = Modifier.Companion;
            p<Composer, Integer, g2> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(Q);
            boolean changed = startRestartGroup.changed(multiContentMeasurePolicy);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion2.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            combineAsVirtualLayouts.invoke(startRestartGroup, 0);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i14) {
                    BottomSheetScaffoldKt.m1562BottomSheetScaffoldLayoutHJHHjMs(pVar, pVar2, pVar3, pVar4, pVar5, f11, aVar, i11, bottomSheetState, composer2, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    @Composable
    @k
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(@m80.l BottomSheetState bottomSheetState, @m80.l SnackbarHostState snackbarHostState, @m80.l Composer composer, int i11, int i12) {
        Composer composer2;
        if ((i12 & 1) != 0) {
            composer2 = composer;
            bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer2, 6, 6);
        } else {
            composer2 = composer;
        }
        if ((i12 & 2) != 0) {
            Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer2.updateRememberedValue(rememberedValue);
            }
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1022285988, i11, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:266)");
        }
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && composer2.changed(bottomSheetState)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer2.changed(snackbarHostState)) || (i11 & 48) == 32);
        Object rememberedValue2 = composer2.rememberedValue();
        if (z11 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new BottomSheetScaffoldState(bottomSheetState, snackbarHostState);
            composer2.updateRememberedValue(rememberedValue2);
        }
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomSheetScaffoldState;
    }

    @Composable
    @k
    public static final BottomSheetState rememberBottomSheetState(@k final BottomSheetValue bottomSheetValue, @m80.l final AnimationSpec<Float> animationSpec, @m80.l final l<? super BottomSheetValue, Boolean> lVar, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = BottomSheetScaffoldDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i12 & 4) != 0) {
            lVar = new l<BottomSheetValue, Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$1
                @Override // x00.l
                public final Boolean invoke(BottomSheetValue bottomSheetValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1808153344, i11, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:224)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {animationSpec};
        Saver<BottomSheetState, ?> Saver = BottomSheetState.Companion.Saver(animationSpec, lVar, density);
        boolean changed = ((((i11 & 14) ^ 6) > 4 && composer.changed(bottomSheetValue)) || (i11 & 6) == 4) | composer.changed(density) | composer.changedInstance(animationSpec) | ((((i11 & 896) ^ 384) > 256 && composer.changed(lVar)) || (i11 & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a<BottomSheetState>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final BottomSheetState invoke() {
                    return new BottomSheetState(BottomSheetValue.this, density, animationSpec, lVar);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m2066rememberSaveable(objArr, (Saver) Saver, (String) null, (a) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomSheetState;
    }
}
