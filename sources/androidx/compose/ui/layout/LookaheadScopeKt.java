package androidx.compose.ui.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLookaheadScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,280:1\n1247#2,6:281\n347#3,12:287\n150#4:299\n*S KotlinDebug\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt\n*L\n50#1:281,6\n51#1:287,12\n252#1:299\n*E\n"})
/* loaded from: classes.dex */
public final class LookaheadScopeKt {

    @k
    private static final p<Placeable.PlacementScope, LayoutCoordinates, Boolean> defaultPlacementApproachInProgress = new p<Placeable.PlacementScope, LayoutCoordinates, Boolean>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$defaultPlacementApproachInProgress$1
        @Override // x00.p
        public final Boolean invoke(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
            return Boolean.FALSE;
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @UiComposable
    public static final void LookaheadScope(@k final q<? super LookaheadScope, ? super Composer, ? super Integer, g2> qVar, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1078066484);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(qVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = 1;
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1078066484, i12, -1, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:48)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LookaheadScopeImpl(null, i13, 0 == true ? 1 : 0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            LookaheadScopeImpl lookaheadScopeImpl = (LookaheadScopeImpl) rememberedValue;
            LookaheadScopeKt$LookaheadScope$1 lookaheadScopeKt$LookaheadScope$1 = new a<LayoutNode>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final LayoutNode invoke() {
                    return new LayoutNode(true, 0, 2, null);
                }
            };
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(lookaheadScopeKt$LookaheadScope$1);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1955initimpl(m1951constructorimpl, new x00.l<LayoutNode, g2>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1
                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode) {
                    invoke2(layoutNode);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutNode layoutNode) {
                    layoutNode.setVirtualLookaheadRoot$ui_release(true);
                }
            });
            Updater.m1958setimpl(m1951constructorimpl, lookaheadScopeImpl, new p<LayoutNode, LookaheadScopeImpl, g2>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2
                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode, LookaheadScopeImpl lookaheadScopeImpl2) {
                    invoke2(layoutNode, lookaheadScopeImpl2);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(final LayoutNode layoutNode, LookaheadScopeImpl lookaheadScopeImpl2) {
                    lookaheadScopeImpl2.setScopeCoordinates(new a<LayoutCoordinates>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2.1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // x00.a
                        public final LayoutCoordinates invoke() {
                            LayoutNode parent$ui_release = LayoutNode.this.getParent$ui_release();
                            g0.m(parent$ui_release);
                            return parent$ui_release.getInnerCoordinator$ui_release().getCoordinates();
                        }
                    });
                }
            });
            qVar.invoke(lookaheadScopeImpl, startRestartGroup, Integer.valueOf((i12 << 3) & 112));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$4
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
                    LookaheadScopeKt.LookaheadScope(qVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @k
    public static final Modifier approachLayout(@k Modifier modifier, @k x00.l<? super IntSize, Boolean> lVar, @k p<? super Placeable.PlacementScope, ? super LayoutCoordinates, Boolean> pVar, @k q<? super ApproachMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        return modifier.then(new ApproachLayoutElement(qVar, lVar, pVar));
    }

    public static /* synthetic */ Modifier approachLayout$default(Modifier modifier, x00.l lVar, p pVar, q qVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pVar = defaultPlacementApproachInProgress;
        }
        return approachLayout(modifier, lVar, pVar, qVar);
    }

    /* renamed from: localLookaheadPositionOf-Fgt4K4Q, reason: not valid java name */
    public static final long m3886localLookaheadPositionOfFgt4K4Q(@k LookaheadScope lookaheadScope, @k LayoutCoordinates layoutCoordinates, @k LayoutCoordinates layoutCoordinates2, long j11, boolean z11) {
        LayoutCoordinates lookaheadCoordinates = lookaheadScope.toLookaheadCoordinates(layoutCoordinates);
        LayoutCoordinates lookaheadCoordinates2 = lookaheadScope.toLookaheadCoordinates(layoutCoordinates2);
        return lookaheadCoordinates instanceof LookaheadLayoutCoordinates ? lookaheadCoordinates.mo3867localPositionOfS_NoaFU(lookaheadCoordinates2, j11, z11) : lookaheadCoordinates2 instanceof LookaheadLayoutCoordinates ? Offset.m2260constructorimpl(lookaheadCoordinates2.mo3867localPositionOfS_NoaFU(lookaheadCoordinates, j11, z11) ^ (-9223372034707292160L)) : lookaheadCoordinates.mo3867localPositionOfS_NoaFU(lookaheadCoordinates, j11, z11);
    }
}
