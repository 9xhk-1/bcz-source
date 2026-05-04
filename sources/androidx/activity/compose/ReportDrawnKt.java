package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import j00.c;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,153:1\n1225#2,6:154\n1225#2,6:160\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt\n*L\n119#1:154,6\n151#1:160,6\n*E\n"})
/* loaded from: classes.dex */
public final class ReportDrawnKt {
    @Composable
    public static final void ReportDrawn(@l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1357012904);
        if (i11 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1357012904, i11, -1, "androidx.activity.compose.ReportDrawn (ReportDrawn.kt:135)");
            }
            ReportDrawnWhen(new x00.a<Boolean>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawn$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            }, startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawn$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i12) {
                    ReportDrawnKt.ReportDrawn(composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @Composable
    public static final void ReportDrawnAfter(@k final x00.l<? super c<? super g2>, ? extends Object> lVar, @l Composer composer, final int i11) {
        int i12;
        FullyDrawnReporter fullyDrawnReporter;
        Composer startRestartGroup = composer.startRestartGroup(945311272);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(lVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(945311272, i12, -1, "androidx.activity.compose.ReportDrawnAfter (ReportDrawn.kt:148)");
            }
            FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1
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
                            ReportDrawnKt.ReportDrawnAfter(lVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                        }
                    });
                    return;
                }
                return;
            }
            boolean changedInstance = startRestartGroup.changedInstance(fullyDrawnReporter) | startRestartGroup.changedInstance(lVar);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ReportDrawnKt$ReportDrawnAfter$1$1(fullyDrawnReporter, lVar, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EffectsKt.LaunchedEffect(lVar, fullyDrawnReporter, (p) rememberedValue, startRestartGroup, i12 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$2
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
                    ReportDrawnKt.ReportDrawnAfter(lVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @Composable
    public static final void ReportDrawnWhen(@k final x00.a<Boolean> aVar, @l Composer composer, final int i11) {
        int i12;
        final FullyDrawnReporter fullyDrawnReporter;
        Composer startRestartGroup = composer.startRestartGroup(-2047119994);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2047119994, i12, -1, "androidx.activity.compose.ReportDrawnWhen (ReportDrawn.kt:116)");
            }
            FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1
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
                            ReportDrawnKt.ReportDrawnWhen(aVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                        }
                    });
                    return;
                }
                return;
            }
            boolean changedInstance = startRestartGroup.changedInstance(fullyDrawnReporter) | ((i12 & 14) == 4);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        if (FullyDrawnReporter.this.isFullyDrawnReported()) {
                            return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                }
                            };
                        }
                        final ReportDrawnComposition reportDrawnComposition = new ReportDrawnComposition(FullyDrawnReporter.this, aVar);
                        return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$2
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                ReportDrawnComposition.this.removeReporter();
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EffectsKt.DisposableEffect(fullyDrawnReporter, aVar, (x00.l) rememberedValue, startRestartGroup, (i12 << 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$2
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
                    ReportDrawnKt.ReportDrawnWhen(aVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }
}
