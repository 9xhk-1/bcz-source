package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import x00.a;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,445:1\n1247#2,6:446\n1247#2,6:483\n79#3,6:452\n86#3,4:467\n90#3,2:477\n94#3:482\n79#3,6:489\n86#3,4:504\n90#3,2:514\n94#3:519\n368#4,9:458\n377#4,3:479\n368#4,9:495\n377#4,3:516\n4034#5,6:471\n4034#5,6:508\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt\n*L\n367#1:446,6\n406#1:483,6\n367#1:452,6\n367#1:467,4\n367#1:477,2\n367#1:482\n406#1:489,6\n406#1:504,4\n406#1:514,2\n406#1:519\n367#1:458,9\n367#1:479,3\n406#1:495,9\n406#1:516,3\n367#1:471,6\n406#1:508,6\n*E\n"})
/* loaded from: classes.dex */
public final class ListItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BaselinesOffsetColumn(final List<Dp> list, Modifier modifier, final p<? super Composer, ? super Integer, g2> pVar, Composer composer, final int i11, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1631148337);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1631148337, i13, -1, "androidx.compose.material.BaselinesOffsetColumn (ListItem.kt:365)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(list);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list2, long j11) {
                        int i15;
                        long m5058copyZbe2FdA$default = Constraints.m5058copyZbe2FdA$default(j11, 0, 0, 0, Integer.MAX_VALUE, 3, null);
                        final ArrayList arrayList = new ArrayList(list2.size());
                        int size = list2.size();
                        for (int i16 = 0; i16 < size; i16++) {
                            arrayList.add(list2.get(i16).mo3857measureBRTryo0(m5058copyZbe2FdA$default));
                        }
                        Integer num = 0;
                        int size2 = arrayList.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            num = Integer.valueOf(Math.max(num.intValue(), ((Placeable) arrayList.get(i17)).getWidth()));
                        }
                        int intValue = num.intValue();
                        final int[] iArr = new int[arrayList.size()];
                        List<Dp> list3 = list;
                        int size3 = arrayList.size();
                        int i18 = 0;
                        for (int i19 = 0; i19 < size3; i19++) {
                            Placeable placeable = (Placeable) arrayList.get(i19);
                            if (i19 > 0) {
                                int i21 = i19 - 1;
                                i15 = ((Placeable) arrayList.get(i21)).getHeight() - ((Placeable) arrayList.get(i21)).get(AlignmentLineKt.getLastBaseline());
                            } else {
                                i15 = 0;
                            }
                            int max = Math.max(0, (measureScope.mo371roundToPx0680j_4(list3.get(i19).m5129unboximpl()) - placeable.get(AlignmentLineKt.getFirstBaseline())) - i15);
                            iArr[i19] = max + i18;
                            i18 += max + placeable.getHeight();
                        }
                        return MeasureScope.layout$default(measureScope, intValue, i18, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$1.2
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
                                List<Placeable> list4 = arrayList;
                                int[] iArr2 = iArr;
                                int size4 = list4.size();
                                for (int i22 = 0; i22 < size4; i22++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list4.get(i22), 0, iArr2[i22], 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            int i15 = ((i13 >> 6) & 14) | (i13 & 112);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion.getConstructor();
            int i16 = ((i15 << 6) & 896) | 6;
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
            Updater.m1958setimpl(m1951constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            pVar.invoke(startRestartGroup, Integer.valueOf((i16 >> 6) & 14));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$2
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

                public final void invoke(Composer composer2, int i17) {
                    ListItemKt.BaselinesOffsetColumn(list, modifier2, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x006a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][_][_][_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ListItem(@m80.l androidx.compose.ui.Modifier r19, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r20, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r21, boolean r22, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r23, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r24, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r25, @m80.l androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ListItemKt.ListItem(androidx.compose.ui.Modifier, x00.p, x00.p, boolean, x00.p, x00.p, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: OffsetToBaselineOrCenter-Kz89ssw, reason: not valid java name */
    public static final void m1694OffsetToBaselineOrCenterKz89ssw(final float f11, Modifier modifier, final p<? super Composer, ? super Integer, g2> pVar, Composer composer, final int i11, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1062692685);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(f11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1062692685, i13, -1, "androidx.compose.material.OffsetToBaselineOrCenter (ListItem.kt:404)");
            }
            boolean z11 = (i13 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j11) {
                        int max;
                        final int m5244getYimpl;
                        final Placeable mo3857measureBRTryo0 = list.get(0).mo3857measureBRTryo0(Constraints.m5058copyZbe2FdA$default(j11, 0, 0, 0, 0, 11, null));
                        int i15 = mo3857measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                        if (i15 != Integer.MIN_VALUE) {
                            m5244getYimpl = measureScope.mo371roundToPx0680j_4(f11) - i15;
                            max = Math.max(Constraints.m5069getMinHeightimpl(j11), mo3857measureBRTryo0.getHeight() + m5244getYimpl);
                        } else {
                            max = Math.max(Constraints.m5069getMinHeightimpl(j11), mo3857measureBRTryo0.getHeight());
                            m5244getYimpl = IntOffset.m5244getYimpl(Alignment.Companion.getCenter().mo2085alignKFBX0sM(IntSize.Companion.m5291getZeroYbymL2g(), IntSizeKt.IntSize(0, max - mo3857measureBRTryo0.getHeight()), measureScope.getLayoutDirection()));
                        }
                        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), max, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$1.1
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
                                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, 0, m5244getYimpl, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion.getConstructor();
            int i15 = ((((i13 & 112) | ((i13 >> 6) & 14)) << 6) & 896) | 6;
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
            Updater.m1958setimpl(m1951constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            pVar.invoke(startRestartGroup, Integer.valueOf((i15 >> 6) & 14));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$2
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

                public final void invoke(Composer composer2, int i16) {
                    ListItemKt.m1694OffsetToBaselineOrCenterKz89ssw(f11, modifier2, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }

    private static final p<Composer, Integer, g2> applyTextStyle(final TextStyle textStyle, final float f11, final p<? super Composer, ? super Integer, g2> pVar) {
        if (pVar == null) {
            return null;
        }
        final LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.Alignment.Companion.m4946getProportionalPIaL0Z0(), LineHeightStyle.Trim.Companion.m4966getBothEVpEnUU(), (v) null);
        return ComposableLambdaKt.composableLambdaInstance(-830176860, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.ListItemKt$applyTextStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(Composer composer, int i11) {
                if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-830176860, i11, -1, "androidx.compose.material.applyTextStyle.<anonymous> (ListItem.kt:439)");
                }
                ProvidedValue<Float> provides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(f11));
                final TextStyle textStyle2 = textStyle;
                final LineHeightStyle lineHeightStyle2 = lineHeightStyle;
                final p<Composer, Integer, g2> pVar2 = pVar;
                CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(1665877604, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.ListItemKt$applyTextStyle$1.1
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

                    @Composable
                    public final void invoke(Composer composer2, int i12) {
                        if (!composer2.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1665877604, i12, -1, "androidx.compose.material.applyTextStyle.<anonymous>.<anonymous> (ListItem.kt:440)");
                        }
                        TextKt.ProvideTextStyle(TextStyle.m4572copyp1EtxEg$default(TextStyle.this, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, lineHeightStyle2, 0, 0, null, 15728639, null), pVar2, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }
}
