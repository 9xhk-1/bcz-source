package androidx.compose.foundation.text;

import androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import c40.r0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nContextMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,216:1\n1247#2,6:217\n1247#2,3:230\n1250#2,3:234\n1247#2,6:237\n1247#2,6:243\n1247#2,6:249\n1247#2,6:255\n1247#2,3:268\n1250#2,3:272\n1247#2,6:275\n1247#2,6:281\n1247#2,6:287\n1247#2,6:293\n1247#2,6:299\n1247#2,6:305\n557#3:223\n554#3,6:224\n557#3:261\n554#3,6:262\n555#4:233\n555#4:271\n*S KotlinDebug\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n*L\n45#1:217,6\n46#1:230,3\n46#1:234,3\n47#1:237,6\n51#1:243,6\n54#1:249,6\n69#1:255,6\n70#1:268,3\n70#1:272,3\n71#1:275,6\n76#1:281,6\n91#1:287,6\n94#1:293,6\n105#1:299,6\n108#1:305,6\n46#1:223\n46#1:224,6\n70#1:261\n70#1:262,6\n46#1:233\n70#1:271\n*E\n"})
/* loaded from: classes.dex */
public final class ContextMenu_androidKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextMenuArea(@k final TextFieldSelectionManager textFieldSelectionManager, @k p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i11) {
        int i12;
        final p<? super Composer, ? super Integer, g2> pVar2;
        Composer startRestartGroup = composer.startRestartGroup(-1985516685);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985516685, i12, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:43)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new ContextMenuState(null, 1, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final r0 r0Var = (r0) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MenuItemsAvailability.m1108boximpl(MenuItemsAvailability.Companion.m1121getNoneJKCFgKw()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState = (MutableState) rememberedValue3;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new x00.a<g2>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$1$1
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
                        ContextMenuState_androidKt.close(ContextMenuState.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            x00.a aVar = (x00.a) rememberedValue4;
            x00.l<ContextMenuScope, g2> contextMenuBuilder = TextFieldSelectionManager_androidKt.contextMenuBuilder(textFieldSelectionManager, contextMenuState, mutableState);
            boolean enabled = textFieldSelectionManager.getEnabled();
            boolean changedInstance = startRestartGroup.changedInstance(r0Var) | startRestartGroup.changedInstance(textFieldSelectionManager);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new x00.a<g2>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1

                    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                    @d(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1", f = "ContextMenu.android.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
                        final /* synthetic */ TextFieldSelectionManager $manager;
                        final /* synthetic */ MutableState<MenuItemsAvailability> $menuItemsAvailability;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(MutableState<MenuItemsAvailability> mutableState, TextFieldSelectionManager textFieldSelectionManager, j00.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$menuItemsAvailability = mutableState;
                            this.$manager = textFieldSelectionManager;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                            return new AnonymousClass1(this.$menuItemsAvailability, this.$manager, cVar);
                        }

                        @Override // x00.p
                        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            MutableState mutableState;
                            Object l11 = kotlin.coroutines.intrinsics.b.l();
                            int i11 = this.label;
                            if (i11 == 0) {
                                e.n(obj);
                                MutableState<MenuItemsAvailability> mutableState2 = this.$menuItemsAvailability;
                                TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                                this.L$0 = mutableState2;
                                this.label = 1;
                                Object contextMenuItemsAvailability = ContextMenu_androidKt.getContextMenuItemsAvailability(textFieldSelectionManager, this);
                                if (contextMenuItemsAvailability == l11) {
                                    return l11;
                                }
                                mutableState = mutableState2;
                                obj = contextMenuItemsAvailability;
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutableState = (MutableState) this.L$0;
                                e.n(obj);
                            }
                            mutableState.setValue(obj);
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
                        c40.k.f(r0.this, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(mutableState, textFieldSelectionManager, null), 1, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            pVar2 = pVar;
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState, aVar, contextMenuBuilder, null, enabled, (x00.a) rememberedValue5, pVar2, startRestartGroup, ((i12 << 15) & 3670016) | 54, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            pVar2 = pVar;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$3
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
                    ContextMenu_androidKt.ContextMenuArea(TextFieldSelectionManager.this, pVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    public static final void TextItem(@k ContextMenuScope contextMenuScope, @k final ContextMenuState contextMenuState, @k TextContextMenuItems textContextMenuItems, boolean z11, @k final x00.a<g2> aVar) {
        if (z11) {
            ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems), null, false, null, new x00.a<g2>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$2
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
                    aVar.invoke();
                    ContextMenuState_androidKt.close(contextMenuState);
                }
            }, 14, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object getContextMenuItemsAvailability(@m80.k androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r5, @m80.k j00.c<? super androidx.compose.foundation.text.MenuItemsAvailability> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1 r0 = (androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1 r0 = new androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r5 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.e.n(r6)
            goto L4f
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.e.n(r6)
            boolean r6 = r5.canCopy()
            r0.L$0 = r5
            r0.Z$0 = r6
            r0.label = r3
            java.lang.Object r0 = r5.canPaste(r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L4f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            boolean r1 = r0.canCut()
            boolean r2 = r0.canSelectAll()
            boolean r0 = r0.canAutofill()
            int r5 = androidx.compose.foundation.text.MenuItemsAvailability.m1110constructorimpl(r5, r6, r1, r2, r0)
            androidx.compose.foundation.text.MenuItemsAvailability r5 = androidx.compose.foundation.text.MenuItemsAvailability.m1108boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt.getContextMenuItemsAvailability(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object getContextMenuItemsAvailability(@m80.k androidx.compose.foundation.text.selection.TextFieldSelectionManager r7, @m80.k j00.c<? super androidx.compose.foundation.text.MenuItemsAvailability> r8) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt.getContextMenuItemsAvailability(androidx.compose.foundation.text.selection.TextFieldSelectionManager, j00.c):java.lang.Object");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextMenuArea(@k final TextFieldSelectionState textFieldSelectionState, boolean z11, @k p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i11) {
        int i12;
        final boolean z12;
        final p<? super Composer, ? super Integer, g2> pVar2;
        Composer startRestartGroup = composer.startRestartGroup(2103477555);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2103477555, i12, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:67)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new ContextMenuState(null, 1, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final r0 r0Var = (r0) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MenuItemsAvailability.m1108boximpl(MenuItemsAvailability.Companion.m1121getNoneJKCFgKw()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState = (MutableState) rememberedValue3;
            boolean changedInstance = startRestartGroup.changedInstance(r0Var);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new p<TextFieldSelectionState, TextContextMenuItems, g2>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1

                    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                    @d(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1", f = "ContextMenu.android.kt", i = {}, l = {79, 80, 81}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
                        final /* synthetic */ TextContextMenuItems $item;
                        final /* synthetic */ TextFieldSelectionState $this_contextMenuBuilder;
                        int label;

                        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                        /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[TextContextMenuItems.values().length];
                                try {
                                    iArr[TextContextMenuItems.Cut.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[TextContextMenuItems.Copy.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[TextContextMenuItems.Paste.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                try {
                                    iArr[TextContextMenuItems.SelectAll.ordinal()] = 4;
                                } catch (NoSuchFieldError unused4) {
                                }
                                try {
                                    iArr[TextContextMenuItems.Autofill.ordinal()] = 5;
                                } catch (NoSuchFieldError unused5) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(TextContextMenuItems textContextMenuItems, TextFieldSelectionState textFieldSelectionState, j00.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$item = textContextMenuItems;
                            this.$this_contextMenuBuilder = textFieldSelectionState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                            return new AnonymousClass1(this.$item, this.$this_contextMenuBuilder, cVar);
                        }

                        @Override // x00.p
                        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
                        
                            if (r6.paste(r5) == r0) goto L29;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
                        
                            return r0;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
                        
                            if (r6.copy(false, r5) == r0) goto L29;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
                        
                            if (r6.cut(r5) == r0) goto L29;
                         */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                            /*
                                r5 = this;
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                                int r1 = r5.label
                                r2 = 3
                                r3 = 2
                                r4 = 1
                                if (r1 == 0) goto L1d
                                if (r1 == r4) goto L11
                                if (r1 == r3) goto L11
                                if (r1 != r2) goto L15
                            L11:
                                kotlin.e.n(r6)
                                goto L65
                            L15:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r0)
                                throw r6
                            L1d:
                                kotlin.e.n(r6)
                                androidx.compose.foundation.text.TextContextMenuItems r6 = r5.$item
                                int[] r1 = androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0
                                int r6 = r6.ordinal()
                                r6 = r1[r6]
                                if (r6 == r4) goto L5a
                                if (r6 == r3) goto L4e
                                if (r6 == r2) goto L43
                                r0 = 4
                                if (r6 == r0) goto L3d
                                r0 = 5
                                if (r6 == r0) goto L37
                                goto L65
                            L37:
                                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
                                r6.autofill()
                                goto L65
                            L3d:
                                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
                                r6.selectAll()
                                goto L65
                            L43:
                                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
                                r5.label = r2
                                java.lang.Object r6 = r6.paste(r5)
                                if (r6 != r0) goto L65
                                goto L64
                            L4e:
                                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
                                r5.label = r3
                                r1 = 0
                                java.lang.Object r6 = r6.copy(r1, r5)
                                if (r6 != r0) goto L65
                                goto L64
                            L5a:
                                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
                                r5.label = r4
                                java.lang.Object r6 = r6.cut(r5)
                                if (r6 != r0) goto L65
                            L64:
                                return r0
                            L65:
                                yz.g2 r6 = yz.g2.f100423a
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    {
                        super(2);
                    }

                    @Override // x00.p
                    public /* bridge */ /* synthetic */ g2 invoke(TextFieldSelectionState textFieldSelectionState2, TextContextMenuItems textContextMenuItems) {
                        invoke2(textFieldSelectionState2, textContextMenuItems);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextFieldSelectionState textFieldSelectionState2, TextContextMenuItems textContextMenuItems) {
                        c40.k.f(r0.this, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(textContextMenuItems, textFieldSelectionState2, null), 1, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            x00.l<ContextMenuScope, g2> contextMenuBuilder = TextFieldSelectionState_androidKt.contextMenuBuilder(textFieldSelectionState, contextMenuState, mutableState, (p) rememberedValue4);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new x00.a<g2>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$4$1
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
                        ContextMenuState_androidKt.close(ContextMenuState.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            x00.a aVar = (x00.a) rememberedValue5;
            boolean changedInstance2 = startRestartGroup.changedInstance(r0Var) | startRestartGroup.changedInstance(textFieldSelectionState);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new x00.a<g2>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1

                    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                    @d(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1$1", f = "ContextMenu.android.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
                        final /* synthetic */ MutableState<MenuItemsAvailability> $menuItemsAvailability;
                        final /* synthetic */ TextFieldSelectionState $selectionState;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(MutableState<MenuItemsAvailability> mutableState, TextFieldSelectionState textFieldSelectionState, j00.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$menuItemsAvailability = mutableState;
                            this.$selectionState = textFieldSelectionState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                            return new AnonymousClass1(this.$menuItemsAvailability, this.$selectionState, cVar);
                        }

                        @Override // x00.p
                        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            MutableState mutableState;
                            Object l11 = kotlin.coroutines.intrinsics.b.l();
                            int i11 = this.label;
                            if (i11 == 0) {
                                e.n(obj);
                                MutableState<MenuItemsAvailability> mutableState2 = this.$menuItemsAvailability;
                                TextFieldSelectionState textFieldSelectionState = this.$selectionState;
                                this.L$0 = mutableState2;
                                this.label = 1;
                                Object contextMenuItemsAvailability = ContextMenu_androidKt.getContextMenuItemsAvailability(textFieldSelectionState, this);
                                if (contextMenuItemsAvailability == l11) {
                                    return l11;
                                }
                                mutableState = mutableState2;
                                obj = contextMenuItemsAvailability;
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutableState = (MutableState) this.L$0;
                                e.n(obj);
                            }
                            mutableState.setValue(obj);
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
                        c40.k.f(r0.this, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(mutableState, textFieldSelectionState, null), 1, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            pVar2 = pVar;
            z12 = z11;
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState, aVar, contextMenuBuilder, null, z12, (x00.a) rememberedValue6, pVar2, startRestartGroup, ((i12 << 9) & 57344) | 54 | ((i12 << 12) & 3670016), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            z12 = z11;
            pVar2 = pVar;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$6
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
                    ContextMenu_androidKt.ContextMenuArea(TextFieldSelectionState.this, z12, pVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextMenuArea(@k final SelectionManager selectionManager, @k p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i11) {
        int i12;
        final p<? super Composer, ? super Integer, g2> pVar2;
        Composer startRestartGroup = composer.startRestartGroup(605522716);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(selectionManager) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(605522716, i12, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:103)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new ContextMenuState(null, 1, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.a<g2>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$7$1
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
                        ContextMenuState_androidKt.close(ContextMenuState.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            pVar2 = pVar;
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState, (x00.a) rememberedValue2, SelectionManager_androidKt.contextMenuBuilder(selectionManager, contextMenuState), null, false, null, pVar2, startRestartGroup, ((i12 << 15) & 3670016) | 54, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            pVar2 = pVar;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$8
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
                    ContextMenu_androidKt.ContextMenuArea(SelectionManager.this, pVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }
}
