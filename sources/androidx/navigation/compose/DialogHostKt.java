package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.DialogNavigator;
import j00.c;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,137:1\n1225#2,6:138\n1225#2,6:145\n1225#2,6:152\n1225#2,6:160\n1225#2,3:168\n1228#2,3:174\n1855#3:144\n1856#3:151\n1855#3:159\n1856#3:166\n766#3:171\n857#3,2:172\n77#4:158\n77#4:167\n81#5:177\n81#5:178\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt\n*L\n48#1:138,6\n53#1:145,6\n74#1:152,6\n92#1:160,6\n123#1:168,3\n123#1:174,3\n50#1:144\n50#1:151\n91#1:159\n91#1:166\n126#1:171\n126#1:172,2\n90#1:158\n122#1:167\n43#1:177\n47#1:178\n*E\n"})
/* loaded from: classes3.dex */
public final class DialogHostKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DialogHost(@k final DialogNavigator dialogNavigator, @l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(294589392);
        int i12 = (i11 & 6) == 0 ? (startRestartGroup.changed(dialogNavigator) ? 4 : 2) | i11 : i11;
        if ((i12 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(294589392, i12, -1, "androidx.navigation.compose.DialogHost (DialogHost.kt:40)");
            }
            final SaveableStateHolder rememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
            c cVar = null;
            boolean z11 = true;
            State collectAsState = SnapshotStateKt.collectAsState(dialogNavigator.getBackStack$navigation_compose_release(), null, startRestartGroup, 0, 1);
            SnapshotStateList<NavBackStackEntry> rememberVisibleList = rememberVisibleList(DialogHost$lambda$0(collectAsState), startRestartGroup, 0);
            PopulateVisibleList(rememberVisibleList, DialogHost$lambda$0(collectAsState), startRestartGroup, 0);
            State collectAsState2 = SnapshotStateKt.collectAsState(dialogNavigator.getTransitionInProgress$navigation_compose_release(), null, startRestartGroup, 0, 1);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            startRestartGroup.startReplaceGroup(1361037007);
            for (final NavBackStackEntry navBackStackEntry : rememberVisibleList) {
                NavDestination destination = navBackStackEntry.getDestination();
                g0.n(destination, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                final DialogNavigator.Destination destination2 = (DialogNavigator.Destination) destination;
                boolean changedInstance = ((i12 & 14) == 4 ? z11 : false) | startRestartGroup.changedInstance(navBackStackEntry);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new x00.a<g2>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$1$1
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
                            DialogNavigator.this.dismiss$navigation_compose_release(navBackStackEntry);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                AndroidDialog_androidKt.Dialog((x00.a) rememberedValue2, destination2.getDialogProperties$navigation_compose_release(), ComposableLambdaKt.rememberComposableLambda(1129586364, z11, new p<Composer, Integer, g2>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        if ((i13 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1129586364, i13, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
                        }
                        NavBackStackEntry navBackStackEntry2 = NavBackStackEntry.this;
                        boolean changedInstance2 = composer2.changedInstance(navBackStackEntry2) | composer2.changed(dialogNavigator);
                        final SnapshotStateList<NavBackStackEntry> snapshotStateList2 = snapshotStateList;
                        final NavBackStackEntry navBackStackEntry3 = NavBackStackEntry.this;
                        final DialogNavigator dialogNavigator2 = dialogNavigator;
                        Object rememberedValue3 = composer2.rememberedValue();
                        if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                            rememberedValue3 = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // x00.l
                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                    snapshotStateList2.add(navBackStackEntry3);
                                    final DialogNavigator dialogNavigator3 = dialogNavigator2;
                                    final NavBackStackEntry navBackStackEntry4 = navBackStackEntry3;
                                    final SnapshotStateList<NavBackStackEntry> snapshotStateList3 = snapshotStateList2;
                                    return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$1$1$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            DialogNavigator.this.onTransitionComplete$navigation_compose_release(navBackStackEntry4);
                                            snapshotStateList3.remove(navBackStackEntry4);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        EffectsKt.DisposableEffect(navBackStackEntry2, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue3, composer2, 0);
                        final NavBackStackEntry navBackStackEntry4 = NavBackStackEntry.this;
                        SaveableStateHolder saveableStateHolder = rememberSaveableStateHolder;
                        final DialogNavigator.Destination destination3 = destination2;
                        NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry4, saveableStateHolder, ComposableLambdaKt.rememberComposableLambda(-497631156, true, new p<Composer, Integer, g2>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            public final void invoke(Composer composer3, int i14) {
                                if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-497631156, i14, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:66)");
                                }
                                DialogNavigator.Destination.this.getContent$navigation_compose_release().invoke(navBackStackEntry4, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, 384, 0);
                collectAsState2 = collectAsState2;
                cVar = cVar;
                z11 = z11;
            }
            c cVar2 = cVar;
            boolean z12 = z11;
            State state = collectAsState2;
            startRestartGroup.endReplaceGroup();
            Set<NavBackStackEntry> DialogHost$lambda$1 = DialogHost$lambda$1(state);
            boolean changed = startRestartGroup.changed(state) | ((i12 & 14) == 4 ? z12 : false);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new DialogHostKt$DialogHost$2$1(state, dialogNavigator, snapshotStateList, cVar2);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            EffectsKt.LaunchedEffect(DialogHost$lambda$1, snapshotStateList, (p) rememberedValue3, startRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    DialogHostKt.DialogHost(DialogNavigator.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    private static final List<NavBackStackEntry> DialogHost$lambda$0(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<NavBackStackEntry> DialogHost$lambda$1(State<? extends Set<NavBackStackEntry>> state) {
        return state.getValue();
    }

    @Composable
    public static final void PopulateVisibleList(@k final List<NavBackStackEntry> list, @k final Collection<NavBackStackEntry> collection, @l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1537894851);
        int i12 = (i11 & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(collection) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1537894851, i12, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:88)");
            }
            boolean booleanValue = ((Boolean) startRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            for (NavBackStackEntry navBackStackEntry : collection) {
                Lifecycle lifecycle = navBackStackEntry.getLifecycle();
                boolean changed = startRestartGroup.changed(booleanValue) | startRestartGroup.changedInstance(list) | startRestartGroup.changedInstance(navBackStackEntry);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new DialogHostKt$PopulateVisibleList$1$1$1(navBackStackEntry, booleanValue, list);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                EffectsKt.DisposableEffect(lifecycle, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue, startRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    DialogHostKt.PopulateVisibleList(list, collection, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L9;
     */
    @androidx.compose.runtime.Composable
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.navigation.NavBackStackEntry> rememberVisibleList(@m80.k java.util.Collection<androidx.navigation.NavBackStackEntry> r5, @m80.l androidx.compose.runtime.Composer r6, int r7) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)"
            r2 = 467378629(0x1bdba1c5, float:3.6335052E-22)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r7, r0, r1)
        Lf:
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.InspectionModeKt.getLocalInspectionMode()
            java.lang.Object r7 = r6.consume(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            boolean r0 = r6.changed(r5)
            java.lang.Object r1 = r6.rememberedValue()
            if (r0 != 0) goto L2f
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L69
        L2f:
            androidx.compose.runtime.snapshots.SnapshotStateList r1 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L3e:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r5.next()
            r3 = r2
            androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
            if (r7 == 0) goto L4f
            r3 = 1
            goto L5d
        L4f:
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r3 = r3.getCurrentState()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r3 = r3.isAtLeast(r4)
        L5d:
            if (r3 == 0) goto L3e
            r0.add(r2)
            goto L3e
        L63:
            r1.addAll(r0)
            r6.updateRememberedValue(r1)
        L69:
            androidx.compose.runtime.snapshots.SnapshotStateList r1 = (androidx.compose.runtime.snapshots.SnapshotStateList) r1
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L74
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.DialogHostKt.rememberVisibleList(java.util.Collection, androidx.compose.runtime.Composer, int):androidx.compose.runtime.snapshots.SnapshotStateList");
    }
}
