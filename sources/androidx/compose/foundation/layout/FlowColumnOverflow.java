package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalLayoutApi
@n(message = "FlowLayout overflow is no longer maintained")
/* loaded from: classes.dex */
public final class FlowColumnOverflow extends FlowLayoutOverflow {
    public static final int $stable = 0;

    @m80.k
    private static final FlowColumnOverflow Clip;

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private static final FlowColumnOverflow Visible;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @ExperimentalLayoutApi
    @u0({"SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowColumnOverflow$Companion\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,869:1\n113#2:870\n75#3:871\n1#4:872\n1247#5,6:873\n*S KotlinDebug\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowColumnOverflow$Companion\n*L\n278#1:870\n281#1:871\n282#1:873,6\n*E\n"})
    @n(message = "FlowLayout overflow is no longer maintained")
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @ExperimentalLayoutApi
        @m80.k
        public final FlowColumnOverflow expandIndicator(@m80.k final q<? super FlowColumnOverflowScope, ? super Composer, ? super Integer, g2> qVar) {
            return new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.ExpandIndicator, 0, 0, new l<FlowLayoutOverflowState, p<? super Composer, ? super Integer, ? extends g2>>() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$expandIndicator$seeMoreGetter$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public final p<Composer, Integer, g2> invoke(final FlowLayoutOverflowState flowLayoutOverflowState) {
                    final q<FlowColumnOverflowScope, Composer, Integer, g2> qVar2 = qVar;
                    return ComposableLambdaKt.composableLambdaInstance(19371081, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$expandIndicator$seeMoreGetter$1.1
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
                                ComposerKt.traceEventStart(19371081, i11, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandIndicator.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:242)");
                            }
                            qVar2.invoke(new FlowColumnOverflowScopeImpl(FlowLayoutOverflowState.this), composer, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                }
            }, null, 22, null);
        }

        @Composable
        @ExperimentalLayoutApi
        @m80.k
        /* renamed from: expandOrCollapseIndicator--jt2gSs, reason: not valid java name */
        public final FlowColumnOverflow m647expandOrCollapseIndicatorjt2gSs(@m80.k final q<? super FlowColumnOverflowScope, ? super Composer, ? super Integer, g2> qVar, @m80.k final q<? super FlowColumnOverflowScope, ? super Composer, ? super Integer, g2> qVar2, int i11, float f11, @m80.l Composer composer, int i12, int i13) {
            boolean z11 = true;
            int i14 = (i13 & 4) != 0 ? 1 : i11;
            float m5115constructorimpl = (i13 & 8) != 0 ? Dp.m5115constructorimpl(0) : f11;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(972645562, i12, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandOrCollapseIndicator (FlowLayoutOverflow.kt:278)");
            }
            int mo371roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo371roundToPx0680j_4(m5115constructorimpl);
            boolean changed = ((((i12 & 896) ^ 384) > 256 && composer.changed(i14)) || (i12 & 384) == 256) | composer.changed(mo371roundToPx0680j_4) | ((((i12 & 14) ^ 6) > 4 && composer.changed(qVar)) || (i12 & 6) == 4);
            if ((((i12 & 112) ^ 48) <= 32 || !composer.changed(qVar2)) && (i12 & 48) != 32) {
                z11 = false;
            }
            boolean z12 = changed | z11;
            Object rememberedValue = composer.rememberedValue();
            if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
                FlowColumnOverflow flowColumnOverflow = new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator, i14, mo371roundToPx0680j_4, new l<FlowLayoutOverflowState, p<? super Composer, ? super Integer, ? extends g2>>() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$expandOrCollapseIndicator$1$seeMoreGetter$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final p<Composer, Integer, g2> invoke(final FlowLayoutOverflowState flowLayoutOverflowState) {
                        final q<FlowColumnOverflowScope, Composer, Integer, g2> qVar3 = qVar;
                        return ComposableLambdaKt.composableLambdaInstance(617878374, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$expandOrCollapseIndicator$1$seeMoreGetter$1.1
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
                            public final void invoke(Composer composer2, int i15) {
                                if (!composer2.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(617878374, i15, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:289)");
                                }
                                qVar3.invoke(new FlowColumnOverflowScopeImpl(FlowLayoutOverflowState.this), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    }
                }, new l<FlowLayoutOverflowState, p<? super Composer, ? super Integer, ? extends g2>>() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final p<Composer, Integer, g2> invoke(final FlowLayoutOverflowState flowLayoutOverflowState) {
                        final q<FlowColumnOverflowScope, Composer, Integer, g2> qVar3 = qVar2;
                        return ComposableLambdaKt.composableLambdaInstance(1004384103, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1.1
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
                            public final void invoke(Composer composer2, int i15) {
                                if (!composer2.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1004384103, i15, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:296)");
                                }
                                qVar3.invoke(new FlowColumnOverflowScopeImpl(FlowLayoutOverflowState.this), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    }
                }, null);
                composer.updateRememberedValue(flowColumnOverflow);
                rememberedValue = flowColumnOverflow;
            }
            FlowColumnOverflow flowColumnOverflow2 = (FlowColumnOverflow) rememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return flowColumnOverflow2;
        }

        @ExperimentalLayoutApi
        @m80.k
        public final FlowColumnOverflow getClip() {
            return FlowColumnOverflow.Clip;
        }

        @ExperimentalLayoutApi
        @m80.k
        public final FlowColumnOverflow getVisible() {
            return FlowColumnOverflow.Visible;
        }

        private Companion() {
        }

        @ExperimentalLayoutApi
        public static /* synthetic */ void getClip$annotations() {
        }

        @ExperimentalLayoutApi
        public static /* synthetic */ void getVisible$annotations() {
        }
    }

    static {
        int i11 = 0;
        l lVar = null;
        Visible = new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.Visible, 0, i11, null, lVar, 30, null);
        Clip = new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.Clip, i11, 0, lVar, null, 30, null);
    }

    public /* synthetic */ FlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i11, int i12, l lVar, l lVar2, v vVar) {
        this(overflowType, i11, i12, lVar, lVar2);
    }

    public /* synthetic */ FlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i11, int i12, l lVar, l lVar2, int i13, v vVar) {
        this(overflowType, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? null : lVar, (i13 & 16) != 0 ? null : lVar2);
    }

    private FlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i11, int i12, l<? super FlowLayoutOverflowState, ? extends p<? super Composer, ? super Integer, g2>> lVar, l<? super FlowLayoutOverflowState, ? extends p<? super Composer, ? super Integer, g2>> lVar2) {
        super(overflowType, i11, i12, lVar, lVar2, null);
    }
}
