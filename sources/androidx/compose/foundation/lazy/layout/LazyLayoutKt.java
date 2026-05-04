package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyLayoutKt {
    private static final int MaxItemsToRetainForReuse = 7;

    @Composable
    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable:[androidx.compose.ui.UiComposable]]]")
    public static final void LazyLayout(@k final x00.a<? extends LazyLayoutItemProvider> aVar, @l final Modifier modifier, @l final LazyLayoutPrefetchState lazyLayoutPrefetchState, @k final p<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> pVar, @l Composer composer, final int i11, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(2002163445);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changedInstance(aVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changed(lazyLayoutPrefetchState) ? 256 : 128;
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
            if (i15 != 0) {
                lazyLayoutPrefetchState = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2002163445, i13, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
            }
            final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, startRestartGroup, i13 & 14);
            LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.rememberComposableLambda(-1488997347, true, new q<SaveableStateHolder, Composer, Integer, g2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // x00.q
                public /* bridge */ /* synthetic */ g2 invoke(SaveableStateHolder saveableStateHolder, Composer composer2, Integer num) {
                    invoke(saveableStateHolder, composer2, num.intValue());
                    return g2.f100423a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(SaveableStateHolder saveableStateHolder, Composer composer2, int i16) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1488997347, i16, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:56)");
                    }
                    final State<x00.a<LazyLayoutItemProvider>> state = rememberUpdatedState;
                    Object rememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new x00.a<LazyLayoutItemProvider>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // x00.a
                            public final LazyLayoutItemProvider invoke() {
                                return state.getValue().invoke();
                            }
                        });
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) rememberedValue;
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    final SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) rememberedValue2;
                    if (LazyLayoutPrefetchState.this != null) {
                        composer2.startReplaceGroup(204281539);
                        final PrefetchScheduler prefetchScheduler$foundation_release = LazyLayoutPrefetchState.this.getPrefetchScheduler$foundation_release();
                        if (prefetchScheduler$foundation_release == null) {
                            composer2.startReplaceGroup(6591363);
                            prefetchScheduler$foundation_release = PrefetchScheduler_androidKt.rememberDefaultPrefetchScheduler(composer2, 0);
                        } else {
                            composer2.startReplaceGroup(6590278);
                        }
                        composer2.endReplaceGroup();
                        Object obj = LazyLayoutPrefetchState.this;
                        Object[] objArr = {obj, lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler$foundation_release};
                        boolean changed = composer2.changed(obj) | composer2.changedInstance(lazyLayoutItemContentFactory) | composer2.changedInstance(subcomposeLayoutState) | composer2.changedInstance(prefetchScheduler$foundation_release);
                        final LazyLayoutPrefetchState lazyLayoutPrefetchState2 = LazyLayoutPrefetchState.this;
                        Object rememberedValue3 = composer2.rememberedValue();
                        if (changed || rememberedValue3 == companion.getEmpty()) {
                            rememberedValue3 = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // x00.l
                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                    LazyLayoutPrefetchState.this.setPrefetchHandleProvider$foundation_release(new PrefetchHandleProvider(lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler$foundation_release));
                                    final LazyLayoutPrefetchState lazyLayoutPrefetchState3 = LazyLayoutPrefetchState.this;
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$1$1$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            LazyLayoutPrefetchState.this.setPrefetchHandleProvider$foundation_release(null);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        EffectsKt.DisposableEffect(objArr, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue3, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(204710145);
                        composer2.endReplaceGroup();
                    }
                    Modifier traversablePrefetchState = LazyLayoutPrefetchStateKt.traversablePrefetchState(modifier, LazyLayoutPrefetchState.this);
                    boolean changed2 = composer2.changed(lazyLayoutItemContentFactory) | composer2.changed(pVar);
                    final p<LazyLayoutMeasureScope, Constraints, MeasureResult> pVar2 = pVar;
                    Object rememberedValue4 = composer2.rememberedValue();
                    if (changed2 || rememberedValue4 == companion.getEmpty()) {
                        rememberedValue4 = new p<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // x00.p
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m899invoke0kLqBqw(subcomposeMeasureScope, constraints.m5074unboximpl());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m899invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j11) {
                                return pVar2.invoke(new LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory.this, subcomposeMeasureScope), Constraints.m5055boximpl(j11));
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, traversablePrefetchState, (p) rememberedValue4, composer2, SubcomposeLayoutState.$stable, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final LazyLayoutPrefetchState lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2
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
                    LazyLayoutKt.LazyLayout(aVar, modifier2, lazyLayoutPrefetchState2, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }
}
