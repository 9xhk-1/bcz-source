package androidx.compose.foundation.text.selection;

import a00.h0;
import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import c40.r0;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,181:1\n1247#2,6:182\n1247#2,6:188\n1247#2,6:194\n1247#2,3:208\n1250#2,3:212\n1247#2,6:216\n1247#2,6:223\n75#3:200\n75#3:215\n75#3:222\n557#4:201\n554#4,6:202\n555#5:211\n85#6:229\n113#6,2:230\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n*L\n54#1:182,6\n58#1:188,6\n94#1:194,6\n97#1:208,3\n97#1:212,3\n100#1:216,6\n174#1:223,6\n96#1:200\n98#1:215\n107#1:222\n97#1:201\n97#1:202,6\n97#1:211\n54#1:229\n54#1:230,2\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionContainerKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void DisableSelection(@k final p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(336063542);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(336063542, i12, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:69)");
            }
            CompositionLocalKt.CompositionLocalProvider(SelectionRegistrarKt.getLocalSelectionRegistrar().provides(null), pVar, startRestartGroup, ((i12 << 3) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$DisableSelection$1
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
                    SelectionContainerKt.DisableSelection(pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SelectionContainer(@l final Modifier modifier, @k p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i11, final int i12) {
        int i13;
        final p<? super Composer, ? super Integer, g2> pVar2;
        Composer startRestartGroup = composer.startRestartGroup(-1075498320);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1075498320, i13, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:52)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            int i15 = i13;
            Selection SelectionContainer$lambda$1 = SelectionContainer$lambda$1(mutableState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.l<Selection, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Selection selection) {
                        invoke2(selection);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Selection selection) {
                        mutableState.setValue(selection);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            int i16 = (i15 & 14) | 384 | ((i15 << 6) & 7168);
            Modifier modifier2 = modifier;
            pVar2 = pVar;
            SelectionContainer(modifier2, SelectionContainer$lambda$1, (x00.l) rememberedValue2, pVar2, startRestartGroup, i16, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            pVar2 = pVar;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$2
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
                    SelectionContainerKt.SelectionContainer(Modifier.this, pVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }

    private static final Selection SelectionContainer$lambda$1(MutableState<Selection> mutableState) {
        return mutableState.getValue();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SelectionContainer(@l Modifier modifier, @l final Selection selection, @k final x00.l<? super Selection, g2> lVar, @k final p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i11, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(2078139907);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(selection) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(lVar) ? 256 : 128;
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
                ComposerKt.traceEventStart(2078139907, i13, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:89)");
            }
            final SelectionRegistrarImpl selectionRegistrarImpl = (SelectionRegistrarImpl) RememberSaveableKt.m2066rememberSaveable(new Object[0], (Saver) SelectionRegistrarImpl.Companion.getSaver(), (String) null, (x00.a) new x00.a<SelectionRegistrarImpl>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$registrarImpl$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final SelectionRegistrarImpl invoke() {
                    return new SelectionRegistrarImpl();
                }
            }, startRestartGroup, 3072, 4);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new SelectionManager(selectionRegistrarImpl);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final SelectionManager selectionManager = (SelectionManager) rememberedValue;
            final Clipboard clipboard = (Clipboard) startRestartGroup.consume(CompositionLocalsKt.getLocalClipboard());
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final r0 r0Var = (r0) rememberedValue2;
            selectionManager.setHapticFeedBack((HapticFeedback) startRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
            boolean changed = startRestartGroup.changed(r0Var) | startRestartGroup.changed(clipboard);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.l<AnnotatedString, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1

                    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                    @l00.d(c = "androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1", f = "SelectionContainer.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
                        final /* synthetic */ Clipboard $clipboard;
                        final /* synthetic */ AnnotatedString $textToCopy;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(Clipboard clipboard, AnnotatedString annotatedString, j00.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$clipboard = clipboard;
                            this.$textToCopy = annotatedString;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                            return new AnonymousClass1(this.$clipboard, this.$textToCopy, cVar);
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
                                Clipboard clipboard = this.$clipboard;
                                ClipEntry clipEntry = ClipboardUtils_androidKt.toClipEntry(this.$textToCopy);
                                this.label = 1;
                                if (clipboard.setClipEntry(clipEntry, this) == l11) {
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
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(AnnotatedString annotatedString) {
                        invoke2(annotatedString);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AnnotatedString annotatedString) {
                        c40.k.f(r0.this, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(clipboard, annotatedString, null), 1, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            selectionManager.setOnCopyHandler((x00.l) rememberedValue3);
            selectionManager.setTextToolbar((TextToolbar) startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
            selectionManager.setOnSelectionChange(lVar);
            selectionManager.setSelection(selection);
            SimpleLayoutKt.SimpleLayout(modifier.then(selectionManager.getModifier()), ComposableLambdaKt.rememberComposableLambda(-1869667463, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4
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
                public final void invoke(Composer composer2, int i15) {
                    if (!composer2.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1869667463, i15, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous> (SelectionContainer.kt:118)");
                    }
                    final SelectionManager selectionManager2 = SelectionManager.this;
                    final SelectionRegistrarImpl selectionRegistrarImpl2 = selectionRegistrarImpl;
                    final p<Composer, Integer, g2> pVar2 = pVar;
                    ContextMenu_androidKt.ContextMenuArea(selectionManager2, ComposableLambdaKt.rememberComposableLambda(577209674, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // x00.p
                        public /* bridge */ /* synthetic */ g2 invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return g2.f100423a;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(Composer composer3, int i16) {
                            if (!composer3.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(577209674, i16, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:119)");
                            }
                            ProvidedValue<SelectionRegistrar> provides = SelectionRegistrarKt.getLocalSelectionRegistrar().provides(SelectionRegistrarImpl.this);
                            final p<Composer, Integer, g2> pVar3 = pVar2;
                            final SelectionManager selectionManager3 = selectionManager2;
                            CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(-272381430, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer.4.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // x00.p
                                public /* bridge */ /* synthetic */ g2 invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return g2.f100423a;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(Composer composer4, int i17) {
                                    if (!composer4.shouldExecute((i17 & 3) != 2, i17 & 1)) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-272381430, i17, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:120)");
                                    }
                                    pVar3.invoke(composer4, 0);
                                    if (selectionManager3.isInTouchMode() && selectionManager3.getHasFocus() && !selectionManager3.isTriviallyCollapsedSelection$foundation_release()) {
                                        composer4.startReplaceGroup(-881553831);
                                        Selection selection2 = selectionManager3.getSelection();
                                        if (selection2 == null) {
                                            composer4.startReplaceGroup(-881514989);
                                        } else {
                                            composer4.startReplaceGroup(-881514988);
                                            final SelectionManager selectionManager4 = selectionManager3;
                                            composer4.startReplaceGroup(1495586214);
                                            List Q = h0.Q(Boolean.TRUE, Boolean.FALSE);
                                            int size = Q.size();
                                            int i18 = 0;
                                            while (i18 < size) {
                                                boolean booleanValue = ((Boolean) Q.get(i18)).booleanValue();
                                                boolean changed2 = composer4.changed(booleanValue);
                                                Object rememberedValue4 = composer4.rememberedValue();
                                                if (changed2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                                                    rememberedValue4 = selectionManager4.handleDragObserver(booleanValue);
                                                    composer4.updateRememberedValue(rememberedValue4);
                                                }
                                                final TextDragObserver textDragObserver = (TextDragObserver) rememberedValue4;
                                                boolean changed3 = composer4.changed(booleanValue);
                                                Object rememberedValue5 = composer4.rememberedValue();
                                                if (changed3 || rememberedValue5 == Composer.Companion.getEmpty()) {
                                                    rememberedValue5 = booleanValue ? new x00.a<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4$1$1$1$1$positionProvider$1$1
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // x00.a
                                                        public /* bridge */ /* synthetic */ Offset invoke() {
                                                            return Offset.m2257boximpl(m1442invokeF1C5BW0());
                                                        }

                                                        /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                                                        public final long m1442invokeF1C5BW0() {
                                                            Offset m1477getStartHandlePosition_m7T9E = SelectionManager.this.m1477getStartHandlePosition_m7T9E();
                                                            return m1477getStartHandlePosition_m7T9E != null ? m1477getStartHandlePosition_m7T9E.m2278unboximpl() : Offset.Companion.m2283getUnspecifiedF1C5BW0();
                                                        }
                                                    } : new x00.a<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4$1$1$1$1$positionProvider$1$2
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // x00.a
                                                        public /* bridge */ /* synthetic */ Offset invoke() {
                                                            return Offset.m2257boximpl(m1443invokeF1C5BW0());
                                                        }

                                                        /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                                                        public final long m1443invokeF1C5BW0() {
                                                            Offset m1476getEndHandlePosition_m7T9E = SelectionManager.this.m1476getEndHandlePosition_m7T9E();
                                                            return m1476getEndHandlePosition_m7T9E != null ? m1476getEndHandlePosition_m7T9E.m2278unboximpl() : Offset.Companion.m2283getUnspecifiedF1C5BW0();
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(rememberedValue5);
                                                }
                                                x00.a aVar = (x00.a) rememberedValue5;
                                                ResolvedTextDirection direction = booleanValue ? selection2.getStart().getDirection() : selection2.getEnd().getDirection();
                                                float startHandleLineHeight = booleanValue ? selectionManager4.getStartHandleLineHeight() : selectionManager4.getEndHandleLineHeight();
                                                int i19 = i18;
                                                SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 selectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 = new SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(aVar);
                                                boolean handlesCrossed = selection2.getHandlesCrossed();
                                                Modifier.Companion companion2 = Modifier.Companion;
                                                boolean changedInstance = composer4.changedInstance(textDragObserver);
                                                Object rememberedValue6 = composer4.rememberedValue();
                                                if (changedInstance || rememberedValue6 == Composer.Companion.getEmpty()) {
                                                    rememberedValue6 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4$1$1$1$1$1$1
                                                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                                                        public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
                                                            Object detectDownAndDragGesturesWithObserver = LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, TextDragObserver.this, cVar);
                                                            return detectDownAndDragGesturesWithObserver == kotlin.coroutines.intrinsics.b.l() ? detectDownAndDragGesturesWithObserver : g2.f100423a;
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(rememberedValue6);
                                                }
                                                AndroidSelectionHandles_androidKt.m1430SelectionHandlewLIcFTc(selectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0, booleanValue, direction, handlesCrossed, 0L, startHandleLineHeight, SuspendingPointerInputFilterKt.pointerInput(companion2, textDragObserver, (PointerInputEventHandler) rememberedValue6), composer4, 0, 16);
                                                i18 = i19 + 1;
                                            }
                                            composer4.endReplaceGroup();
                                        }
                                        composer4.endReplaceGroup();
                                        composer4.endReplaceGroup();
                                    } else {
                                        composer4.startReplaceGroup(-879541497);
                                        composer4.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 48, 0);
            boolean changedInstance = startRestartGroup.changedInstance(selectionManager);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$5$1
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final SelectionManager selectionManager2 = SelectionManager.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$5$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                SelectionManager.this.onRelease();
                                SelectionManager.this.setHasFocus(false);
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            EffectsKt.DisposableEffect(selectionManager, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue4, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$6
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
                    SelectionContainerKt.SelectionContainer(Modifier.this, selection, lVar, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }
}
