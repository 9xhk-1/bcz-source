package androidx.compose.material.internal;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import c10.d;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,459:1\n75#2:460\n75#2:461\n75#2:462\n75#2:463\n1247#3,6:464\n1247#3,6:470\n1247#3,6:476\n1247#3,6:482\n1247#3,6:488\n1247#3,6:494\n79#4,6:500\n86#4,4:515\n90#4,2:525\n94#4:530\n79#4,6:531\n86#4,4:546\n90#4,2:556\n94#4:561\n368#5,9:506\n377#5,3:527\n368#5,9:537\n377#5,3:558\n4034#6,6:519\n4034#6,6:550\n85#7:562\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt\n*L\n82#1:460\n83#1:461\n84#1:462\n85#1:463\n89#1:464,6\n115#1:470,6\n129#1:476,6\n137#1:482,6\n149#1:488,6\n160#1:494,6\n146#1:500,6\n146#1:515,4\n146#1:525,2\n146#1:530\n176#1:531,6\n176#1:546,4\n176#1:556,2\n176#1:561\n146#1:506,9\n146#1:527,3\n176#1:537,9\n176#1:558,3\n146#1:519,6\n176#1:550,6\n87#1:562\n*E\n"})
/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopup_androidKt {

    @k
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, new a<String>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$LocalPopupTestTag$1
        @Override // x00.a
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }, 1, null);

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ExposedDropdownMenuPopup(@l a<g2> aVar, @k PopupPositionProvider popupPositionProvider, @k final p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i11, final int i12) {
        a<g2> aVar2;
        int i13;
        final a<g2> aVar3;
        int i14;
        int i15;
        final PopupPositionProvider popupPositionProvider2 = popupPositionProvider;
        Composer startRestartGroup = composer.startRestartGroup(-707851182);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
            aVar2 = aVar;
        } else if ((i11 & 6) == 0) {
            aVar2 = aVar;
            i13 = (startRestartGroup.changedInstance(aVar2) ? 4 : 2) | i11;
        } else {
            aVar2 = aVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(popupPositionProvider2) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            aVar3 = i16 != 0 ? null : aVar2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-707851182, i13, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.android.kt:80)");
            }
            View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            final String str = (String) startRestartGroup.consume(LocalPopupTestTag);
            final LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(pVar, startRestartGroup, (i13 >> 6) & 14);
            boolean z11 = true;
            UUID uuid = (UUID) RememberSaveableKt.m2066rememberSaveable(new Object[0], (Saver) null, (String) null, (a) new a<UUID>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupId$1
                @Override // x00.a
                public final UUID invoke() {
                    return UUID.randomUUID();
                }
            }, startRestartGroup, 3072, 6);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                i14 = 4;
                i15 = i13;
                final PopupLayout popupLayout = new PopupLayout(aVar3, str, view, density, popupPositionProvider2, uuid);
                str = str;
                popupPositionProvider2 = popupPositionProvider2;
                popupLayout.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(580081703, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(Composer composer2, int i17) {
                        p ExposedDropdownMenuPopup$lambda$0;
                        if (!composer2.shouldExecute((i17 & 3) != 2, i17 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(580081703, i17, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.android.kt:99)");
                        }
                        Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, new x00.l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1.1
                            @Override // x00.l
                            public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return g2.f100423a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.popup(semanticsPropertyReceiver);
                            }
                        }, 1, null);
                        boolean changedInstance = composer2.changedInstance(PopupLayout.this);
                        final PopupLayout popupLayout2 = PopupLayout.this;
                        Object rememberedValue2 = composer2.rememberedValue();
                        if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                            rememberedValue2 = new x00.l<IntSize, g2>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1$2$1
                                {
                                    super(1);
                                }

                                @Override // x00.l
                                public /* bridge */ /* synthetic */ g2 invoke(IntSize intSize) {
                                    m1851invokeozmzZPI(intSize.m5290unboximpl());
                                    return g2.f100423a;
                                }

                                /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                public final void m1851invokeozmzZPI(long j11) {
                                    PopupLayout.this.m1855setPopupContentSizefhxjrPA(IntSize.m5278boximpl(j11));
                                    PopupLayout.this.updatePosition();
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        Modifier alpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(semantics$default, (x00.l) rememberedValue2), PopupLayout.this.getCanCalculatePosition() ? 1.0f : 0.0f);
                        ExposedDropdownMenuPopup$lambda$0 = ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup$lambda$0(rememberUpdatedState);
                        ExposedDropdownMenuPopup_androidKt$SimpleStack$1 exposedDropdownMenuPopup_androidKt$SimpleStack$1 = ExposedDropdownMenuPopup_androidKt$SimpleStack$1.INSTANCE;
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, alpha);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        a<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m1951constructorimpl = Updater.m1951constructorimpl(composer2);
                        Updater.m1958setimpl(m1951constructorimpl, exposedDropdownMenuPopup_androidKt$SimpleStack$1, companion2.getSetMeasurePolicy());
                        Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
                        ExposedDropdownMenuPopup$lambda$0.invoke(composer2, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                startRestartGroup.updateRememberedValue(popupLayout);
                rememberedValue = popupLayout;
            } else {
                i14 = 4;
                i15 = i13;
            }
            final PopupLayout popupLayout2 = (PopupLayout) rememberedValue;
            int i17 = i15 & 14;
            boolean changedInstance = startRestartGroup.changedInstance(popupLayout2) | (i17 == i14) | startRestartGroup.changed(str) | startRestartGroup.changed(layoutDirection);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        PopupLayout.this.show();
                        PopupLayout.this.updateParameters(aVar3, str, layoutDirection);
                        final PopupLayout popupLayout3 = PopupLayout.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                PopupLayout.this.disposeComposition();
                                PopupLayout.this.dismiss();
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            EffectsKt.DisposableEffect(popupLayout2, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
            boolean changedInstance2 = startRestartGroup.changedInstance(popupLayout2) | (i17 == i14) | startRestartGroup.changed(str) | startRestartGroup.changed(layoutDirection);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new a<g2>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // x00.a
                    public /* bridge */ /* synthetic */ g2 invoke() {
                        invoke2();
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        PopupLayout.this.updateParameters(aVar3, str, layoutDirection);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            EffectsKt.SideEffect((a) rememberedValue3, startRestartGroup, 0);
            boolean changedInstance3 = startRestartGroup.changedInstance(popupLayout2);
            if ((i15 & 112) != 32) {
                z11 = false;
            }
            boolean z12 = changedInstance3 | z11;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z12 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        PopupLayout.this.setPositionProvider(popupPositionProvider2);
                        PopupLayout.this.updatePosition();
                        return new DisposableEffectResult() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$3$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            EffectsKt.DisposableEffect(popupPositionProvider2, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue4, startRestartGroup, (i15 >> 3) & 14);
            Modifier.Companion companion2 = Modifier.Companion;
            boolean changedInstance4 = startRestartGroup.changedInstance(popupLayout2);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance4 || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new x00.l<LayoutCoordinates, g2>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$5$1
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LayoutCoordinates layoutCoordinates) {
                        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
                        g0.m(parentLayoutCoordinates);
                        long mo3865getSizeYbymL2g = parentLayoutCoordinates.mo3865getSizeYbymL2g();
                        long positionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
                        PopupLayout.this.setParentBounds(IntRectKt.m5276IntRectVbeCjmY(IntOffsetKt.IntOffset(d.L0(Offset.m2268getXimpl(positionInWindow)), d.L0(Offset.m2269getYimpl(positionInWindow))), mo3865getSizeYbymL2g));
                        PopupLayout.this.updatePosition();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (x00.l) rememberedValue5);
            boolean changedInstance5 = startRestartGroup.changedInstance(popupLayout2) | startRestartGroup.changed(layoutDirection);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance5 || rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new MeasurePolicy() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j11) {
                        PopupLayout.this.setParentLayoutDirection(layoutDirection);
                        return MeasureScope.layout$default(measureScope, 0, 0, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1.1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                            }

                            @Override // x00.l
                            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return g2.f100423a;
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue6;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, measurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            aVar3 = aVar2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$7
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

                public final void invoke(Composer composer2, int i18) {
                    ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup(aVar3, popupPositionProvider2, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<Composer, Integer, g2> ExposedDropdownMenuPopup$lambda$0(State<? extends p<? super Composer, ? super Integer, g2>> state) {
        return (p) state.getValue();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void SimpleStack(Modifier modifier, p<? super Composer, ? super Integer, g2> pVar, Composer composer, int i11) {
        ExposedDropdownMenuPopup_androidKt$SimpleStack$1 exposedDropdownMenuPopup_androidKt$SimpleStack$1 = ExposedDropdownMenuPopup_androidKt$SimpleStack$1.INSTANCE;
        int i12 = ((i11 << 3) & 112) | ((i11 >> 3) & 14) | 384;
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        a<ComposeUiNode> constructor = companion.getConstructor();
        int i13 = ((i12 << 6) & 896) | 6;
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
        Updater.m1958setimpl(m1951constructorimpl, exposedDropdownMenuPopup_androidKt$SimpleStack$1, companion.getSetMeasurePolicy());
        Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
        pVar.invoke(composer, Integer.valueOf((i13 >> 6) & 14));
        composer.endNode();
    }

    @k
    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }
}
