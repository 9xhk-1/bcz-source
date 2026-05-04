package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import c40.r0;
import c40.s0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,390:1\n557#2:391\n554#2,6:392\n557#2:453\n554#2,6:454\n1247#3,3:398\n1250#3,3:402\n1247#3,6:447\n1247#3,3:460\n1250#3,3:464\n1247#3,6:508\n1247#3,6:514\n555#4:401\n555#4:463\n70#5:405\n66#5,10:406\n77#5:446\n70#5:467\n67#5,9:468\n77#5:507\n79#6,6:416\n86#6,3:431\n89#6,2:440\n93#6:445\n79#6,6:477\n86#6,3:492\n89#6,2:501\n93#6:506\n347#7,9:422\n356#7,3:442\n347#7,9:483\n356#7,3:503\n4206#8,6:434\n4206#8,6:495\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n*L\n83#1:391\n83#1:392,6\n114#1:453\n114#1:454,6\n83#1:398,3\n83#1:402,3\n103#1:447,6\n114#1:460,3\n114#1:464,3\n138#1:508,6\n246#1:514,6\n83#1:401\n114#1:463\n84#1:405\n84#1:406,10\n84#1:446\n116#1:467\n116#1:468,9\n116#1:507\n84#1:416,6\n84#1:431,3\n84#1:440,2\n84#1:445\n116#1:477,6\n116#1:492,3\n116#1:501,2\n116#1:506\n84#1:422,9\n84#1:442,3\n116#1:483,9\n116#1:503,3\n84#1:434,6\n116#1:495,6\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTooltipKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0081  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTooltipBox(@m80.k final androidx.compose.ui.window.PopupPositionProvider r20, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r21, @m80.k androidx.compose.foundation.BasicTooltipState r22, @m80.l androidx.compose.ui.Modifier r23, boolean r24, boolean r25, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r26, @m80.l androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt.BasicTooltipBox(androidx.compose.ui.window.PopupPositionProvider, x00.p, androidx.compose.foundation.BasicTooltipState, androidx.compose.ui.Modifier, boolean, boolean, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    @Stable
    @ExperimentalFoundationApi
    @m80.k
    public static final BasicTooltipState BasicTooltipState(boolean z11, boolean z12, @m80.k MutatorMutex mutatorMutex) {
        return new BasicTooltipStateImpl(z11, z12, mutatorMutex);
    }

    public static /* synthetic */ BasicTooltipState BasicTooltipState$default(boolean z11, boolean z12, MutatorMutex mutatorMutex, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return BasicTooltipState(z11, z12, mutatorMutex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TooltipPopup(final PopupPositionProvider popupPositionProvider, final BasicTooltipState basicTooltipState, final r0 r0Var, final boolean z11, final p<? super Composer, ? super Integer, g2> pVar, Composer composer, final int i11) {
        PopupPositionProvider popupPositionProvider2;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-487341126);
        if ((i11 & 6) == 0) {
            popupPositionProvider2 = popupPositionProvider;
            i12 = (startRestartGroup.changed(popupPositionProvider2) ? 4 : 2) | i11;
        } else {
            popupPositionProvider2 = popupPositionProvider;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(basicTooltipState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(r0Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changed(z11) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-487341126, i12, -1, "androidx.compose.foundation.TooltipPopup (BasicTooltip.kt:133)");
            }
            final String description = BasicTooltipStrings.INSTANCE.description(startRestartGroup, 6);
            boolean changedInstance = startRestartGroup.changedInstance(r0Var) | ((i12 & 112) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a<g2>() { // from class: androidx.compose.foundation.BasicTooltipKt$TooltipPopup$1$1

                    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                    @l00.d(c = "androidx.compose.foundation.BasicTooltipKt$TooltipPopup$1$1$1", f = "BasicTooltip.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$TooltipPopup$1$1$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(BasicTooltipState basicTooltipState, j00.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$state = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                            return new AnonymousClass1(this.$state, cVar);
                        }

                        @Override // x00.p
                        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            kotlin.coroutines.intrinsics.b.l();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.e.n(obj);
                            this.$state.dismiss();
                            return g2.f100423a;
                        }
                    }

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
                        if (BasicTooltipState.this.isVisible()) {
                            c40.k.f(r0Var, null, null, new AnonymousClass1(BasicTooltipState.this, null), 3, null);
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AndroidPopup_androidKt.Popup(popupPositionProvider2, (x00.a) rememberedValue, new PopupProperties(z11, false, false, false, 14, (v) null), ComposableLambdaKt.rememberComposableLambda(-2085908648, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.BasicTooltipKt$TooltipPopup$2
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
                public final void invoke(Composer composer2, int i13) {
                    if (!composer2.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2085908648, i13, -1, "androidx.compose.foundation.TooltipPopup.<anonymous> (BasicTooltip.kt:144)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    boolean changed = composer2.changed(description);
                    final String str = description;
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.foundation.BasicTooltipKt$TooltipPopup$2$1$1
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
                                SemanticsPropertiesKt.m4341setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m4314getAssertive0phEisY());
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (l) rememberedValue2, 1, null);
                    p<Composer, Integer, g2> pVar2 = pVar;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, semantics$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    pVar2.invoke(composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, (i12 & 14) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.BasicTooltipKt$TooltipPopup$3
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

                public final void invoke(Composer composer2, int i13) {
                    BasicTooltipKt.TooltipPopup(PopupPositionProvider.this, basicTooltipState, r0Var, z11, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void WrappedAnchor(final boolean z11, final BasicTooltipState basicTooltipState, Modifier modifier, final p<? super Composer, ? super Integer, g2> pVar, Composer composer, final int i11, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-111661630);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(basicTooltipState) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i13 & 1171) != 1170, i13 & 1)) {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-111661630, i13, -1, "androidx.compose.foundation.WrappedAnchor (BasicTooltip.kt:112)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier anchorSemantics = anchorSemantics(handleGestures(modifier, z11, basicTooltipState), BasicTooltipStrings.INSTANCE.label(startRestartGroup, 6), z11, basicTooltipState, (r0) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, anchorSemantics);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(startRestartGroup, Integer.valueOf((i13 >> 9) & 14));
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
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.BasicTooltipKt$WrappedAnchor$2
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

                public final void invoke(Composer composer2, int i15) {
                    BasicTooltipKt.WrappedAnchor(z11, basicTooltipState, modifier2, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }

    private static final Modifier anchorSemantics(Modifier modifier, final String str, boolean z11, final BasicTooltipState basicTooltipState, final r0 r0Var) {
        return z11 ? SemanticsModifierKt.semantics(modifier, true, new l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1
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
                String str2 = str;
                final r0 r0Var2 = r0Var;
                final BasicTooltipState basicTooltipState2 = basicTooltipState;
                SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, str2, new x00.a<Boolean>() { // from class: androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1.1

                    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                    @l00.d(c = "androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1$1$1", f = "BasicTooltip.kt", i = {}, l = {com.jiongji.andriod.card.R.styleable.Theme_drawable_share}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C00421 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00421(BasicTooltipState basicTooltipState, j00.c<? super C00421> cVar) {
                            super(2, cVar);
                            this.$state = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                            return new C00421(this.$state, cVar);
                        }

                        @Override // x00.p
                        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                            return ((C00421) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object l11 = kotlin.coroutines.intrinsics.b.l();
                            int i11 = this.label;
                            if (i11 == 0) {
                                kotlin.e.n(obj);
                                BasicTooltipState basicTooltipState = this.$state;
                                this.label = 1;
                                if (BasicTooltipState.show$default(basicTooltipState, null, this, 1, null) == l11) {
                                    return l11;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.e.n(obj);
                            }
                            return g2.f100423a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.a
                    public final Boolean invoke() {
                        c40.k.f(r0.this, null, null, new C00421(basicTooltipState2, null), 3, null);
                        return Boolean.TRUE;
                    }
                });
            }
        }) : modifier;
    }

    private static final Modifier handleGestures(Modifier modifier, boolean z11, final BasicTooltipState basicTooltipState) {
        return z11 ? SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(modifier, basicTooltipState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.BasicTooltipKt$handleGestures$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
                final /* synthetic */ BasicTooltipState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @l00.d(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", i = {0, 0, 1, 1}, l = {166, 169, 175}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "pass", "$this$awaitEachGesture", "pass"}, s = {"L$0", "L$1", "L$0", "L$1"})
                /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00431 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, j00.c<? super g2>, Object> {
                    final /* synthetic */ r0 $$this$coroutineScope;
                    final /* synthetic */ BasicTooltipState $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                    @l00.d(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C00441 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00441(BasicTooltipState basicTooltipState, j00.c<? super C00441> cVar) {
                            super(2, cVar);
                            this.$state = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                            return new C00441(this.$state, cVar);
                        }

                        @Override // x00.p
                        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                            return ((C00441) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object l11 = kotlin.coroutines.intrinsics.b.l();
                            int i11 = this.label;
                            if (i11 == 0) {
                                kotlin.e.n(obj);
                                BasicTooltipState basicTooltipState = this.$state;
                                MutatePriority mutatePriority = MutatePriority.UserInput;
                                this.label = 1;
                                if (basicTooltipState.show(mutatePriority, this) == l11) {
                                    return l11;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.e.n(obj);
                            }
                            return g2.f100423a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00431(r0 r0Var, BasicTooltipState basicTooltipState, j00.c<? super C00431> cVar) {
                        super(2, cVar);
                        this.$$this$coroutineScope = r0Var;
                        this.$state = basicTooltipState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                        C00431 c00431 = new C00431(this.$$this$coroutineScope, this.$state, cVar);
                        c00431.L$0 = obj;
                        return c00431;
                    }

                    @Override // x00.p
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, j00.c<? super g2> cVar) {
                        return ((C00431) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
                    
                        if (r1 == r0) goto L28;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
                        /*
                            r15 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                            int r1 = r15.label
                            r2 = 3
                            r3 = 2
                            r4 = 1
                            if (r1 == 0) goto L3e
                            if (r1 == r4) goto L2f
                            if (r1 == r3) goto L20
                            if (r1 != r2) goto L18
                            kotlin.e.n(r16)
                            r1 = r16
                            goto La8
                        L18:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                            r0.<init>(r1)
                            throw r0
                        L20:
                            java.lang.Object r1 = r15.L$1
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                            java.lang.Object r3 = r15.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                            kotlin.e.n(r16)
                            r7 = r1
                            r1 = r16
                            goto L84
                        L2f:
                            java.lang.Object r1 = r15.L$1
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                            java.lang.Object r4 = r15.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                            kotlin.e.n(r16)
                            r7 = r1
                            r1 = r16
                            goto L5a
                        L3e:
                            kotlin.e.n(r16)
                            java.lang.Object r1 = r15.L$0
                            r5 = r1
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                            androidx.compose.ui.input.pointer.PointerEventPass r7 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                            r15.L$0 = r5
                            r15.L$1 = r7
                            r15.label = r4
                            r6 = 0
                            r9 = 1
                            r10 = 0
                            r8 = r15
                            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                            if (r1 != r0) goto L59
                            goto La7
                        L59:
                            r4 = r5
                        L5a:
                            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                            int r1 = r1.m3735getTypeT8wyACA()
                            androidx.compose.ui.input.pointer.PointerType$Companion r5 = androidx.compose.ui.input.pointer.PointerType.Companion
                            int r6 = r5.m3810getTouchT8wyACA()
                            boolean r6 = androidx.compose.ui.input.pointer.PointerType.m3803equalsimpl0(r1, r6)
                            if (r6 != 0) goto L76
                            int r5 = r5.m3809getStylusT8wyACA()
                            boolean r1 = androidx.compose.ui.input.pointer.PointerType.m3803equalsimpl0(r1, r5)
                            if (r1 == 0) goto Lc1
                        L76:
                            r15.L$0 = r4
                            r15.L$1 = r7
                            r15.label = r3
                            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForLongPress(r4, r7, r15)
                            if (r1 != r0) goto L83
                            goto La7
                        L83:
                            r3 = r4
                        L84:
                            androidx.compose.foundation.gestures.LongPressResult r1 = (androidx.compose.foundation.gestures.LongPressResult) r1
                            boolean r1 = r1 instanceof androidx.compose.foundation.gestures.LongPressResult.Success
                            if (r1 == 0) goto Lc1
                            c40.r0 r9 = r15.$$this$coroutineScope
                            androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1 r12 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1
                            androidx.compose.foundation.BasicTooltipState r1 = r15.$state
                            r4 = 0
                            r12.<init>(r1, r4)
                            r13 = 3
                            r14 = 0
                            r10 = 0
                            r11 = 0
                            c40.i.e(r9, r10, r11, r12, r13, r14)
                            r15.L$0 = r4
                            r15.L$1 = r4
                            r15.label = r2
                            java.lang.Object r1 = r3.awaitPointerEvent(r7, r15)
                            if (r1 != r0) goto La8
                        La7:
                            return r0
                        La8:
                            androidx.compose.ui.input.pointer.PointerEvent r1 = (androidx.compose.ui.input.pointer.PointerEvent) r1
                            java.util.List r0 = r1.getChanges()
                            int r1 = r0.size()
                            r2 = 0
                        Lb3:
                            if (r2 >= r1) goto Lc1
                            java.lang.Object r3 = r0.get(r2)
                            androidx.compose.ui.input.pointer.PointerInputChange r3 = (androidx.compose.ui.input.pointer.PointerInputChange) r3
                            r3.consume()
                            int r2 = r2 + 1
                            goto Lb3
                        Lc1:
                            yz.g2 r0 = yz.g2.f100423a
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00431.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PointerInputScope pointerInputScope, BasicTooltipState basicTooltipState, j00.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = basicTooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$state, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // x00.p
                public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                    return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object l11 = kotlin.coroutines.intrinsics.b.l();
                    int i11 = this.label;
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        r0 r0Var = (r0) this.L$0;
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C00431 c00431 = new C00431(r0Var, this.$state, null);
                        this.label = 1;
                        if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c00431, this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    return g2.f100423a;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
                Object g11 = s0.g(new AnonymousClass1(pointerInputScope, BasicTooltipState.this, null), cVar);
                return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
            }
        }), basicTooltipState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.BasicTooltipKt$handleGestures$2

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
                final /* synthetic */ BasicTooltipState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @l00.d(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", i = {0, 0}, l = {190}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "pass"}, s = {"L$0", "L$1"})
                /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00451 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, j00.c<? super g2>, Object> {
                    final /* synthetic */ r0 $$this$coroutineScope;
                    final /* synthetic */ BasicTooltipState $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                    @l00.d(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C00461 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00461(BasicTooltipState basicTooltipState, j00.c<? super C00461> cVar) {
                            super(2, cVar);
                            this.$state = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                            return new C00461(this.$state, cVar);
                        }

                        @Override // x00.p
                        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                            return ((C00461) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object l11 = kotlin.coroutines.intrinsics.b.l();
                            int i11 = this.label;
                            if (i11 == 0) {
                                kotlin.e.n(obj);
                                BasicTooltipState basicTooltipState = this.$state;
                                MutatePriority mutatePriority = MutatePriority.UserInput;
                                this.label = 1;
                                if (basicTooltipState.show(mutatePriority, this) == l11) {
                                    return l11;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.e.n(obj);
                            }
                            return g2.f100423a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00451(r0 r0Var, BasicTooltipState basicTooltipState, j00.c<? super C00451> cVar) {
                        super(2, cVar);
                        this.$$this$coroutineScope = r0Var;
                        this.$state = basicTooltipState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                        C00451 c00451 = new C00451(this.$$this$coroutineScope, this.$state, cVar);
                        c00451.L$0 = obj;
                        return c00451;
                    }

                    @Override // x00.p
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, j00.c<? super g2> cVar) {
                        return ((C00451) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
                    }

                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
                    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[RETURN] */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                        /*
                            r12 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                            int r1 = r12.label
                            r2 = 1
                            if (r1 == 0) goto L1f
                            if (r1 != r2) goto L17
                            java.lang.Object r1 = r12.L$1
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                            java.lang.Object r3 = r12.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                            kotlin.e.n(r13)
                            goto L36
                        L17:
                            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r13.<init>(r0)
                            throw r13
                        L1f:
                            kotlin.e.n(r13)
                            java.lang.Object r13 = r12.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                            r3 = r13
                        L29:
                            r12.L$0 = r3
                            r12.L$1 = r1
                            r12.label = r2
                            java.lang.Object r13 = r3.awaitPointerEvent(r1, r12)
                            if (r13 != r0) goto L36
                            return r0
                        L36:
                            androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
                            java.util.List r4 = r13.getChanges()
                            r5 = 0
                            java.lang.Object r4 = r4.get(r5)
                            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                            int r4 = r4.m3735getTypeT8wyACA()
                            androidx.compose.ui.input.pointer.PointerType$Companion r5 = androidx.compose.ui.input.pointer.PointerType.Companion
                            int r5 = r5.m3808getMouseT8wyACA()
                            boolean r4 = androidx.compose.ui.input.pointer.PointerType.m3803equalsimpl0(r4, r5)
                            if (r4 == 0) goto L29
                            int r13 = r13.m3674getType7fucELk()
                            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.ui.input.pointer.PointerEventType.Companion
                            int r5 = r4.m3685getEnter7fucELk()
                            boolean r5 = androidx.compose.ui.input.pointer.PointerEventType.m3681equalsimpl0(r13, r5)
                            if (r5 == 0) goto L75
                            c40.r0 r6 = r12.$$this$coroutineScope
                            androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1 r9 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1
                            androidx.compose.foundation.BasicTooltipState r13 = r12.$state
                            r4 = 0
                            r9.<init>(r13, r4)
                            r10 = 3
                            r11 = 0
                            r7 = 0
                            r8 = 0
                            c40.i.e(r6, r7, r8, r9, r10, r11)
                            goto L29
                        L75:
                            int r4 = r4.m3686getExit7fucELk()
                            boolean r13 = androidx.compose.ui.input.pointer.PointerEventType.m3681equalsimpl0(r13, r4)
                            if (r13 == 0) goto L29
                            androidx.compose.foundation.BasicTooltipState r13 = r12.$state
                            r13.dismiss()
                            goto L29
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00451.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PointerInputScope pointerInputScope, BasicTooltipState basicTooltipState, j00.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = basicTooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$state, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // x00.p
                public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                    return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object l11 = kotlin.coroutines.intrinsics.b.l();
                    int i11 = this.label;
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        r0 r0Var = (r0) this.L$0;
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C00451 c00451 = new C00451(r0Var, this.$state, null);
                        this.label = 1;
                        if (pointerInputScope.awaitPointerEventScope(c00451, this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    return g2.f100423a;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
                Object g11 = s0.g(new AnonymousClass1(pointerInputScope, BasicTooltipState.this, null), cVar);
                return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
            }
        }) : modifier;
    }

    @Composable
    @ExperimentalFoundationApi
    @m80.k
    public static final BasicTooltipState rememberBasicTooltipState(boolean z11, boolean z12, @m80.l MutatorMutex mutatorMutex, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            z11 = false;
        }
        if ((i12 & 2) != 0) {
            z12 = true;
        }
        if ((i12 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1123859613, i11, -1, "androidx.compose.foundation.rememberBasicTooltipState (BasicTooltip.kt:245)");
        }
        boolean z13 = ((((i11 & 112) ^ 48) > 32 && composer.changed(z12)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && composer.changed(mutatorMutex)) || (i11 & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z13 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new BasicTooltipStateImpl(z11, z12, mutatorMutex);
            composer.updateRememberedValue(rememberedValue);
        }
        BasicTooltipStateImpl basicTooltipStateImpl = (BasicTooltipStateImpl) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return basicTooltipStateImpl;
    }
}
