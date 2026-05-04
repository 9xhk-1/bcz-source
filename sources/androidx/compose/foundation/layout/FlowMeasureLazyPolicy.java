package androidx.compose.foundation.layout;

import a00.r0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import x00.l;
import x00.p;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FlowMeasureLazyPolicy implements FlowLineMeasurePolicy {

    @m80.k
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;

    @m80.k
    private final r<Integer, FlowLineInfo, Composer, Integer, g2> getComposable;

    @m80.k
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final int itemCount;
    private final float mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;

    @m80.k
    private final FlowLayoutOverflowState overflow;

    @m80.k
    private final List<p<Composer, Integer, g2>> overflowComposables;

    @m80.k
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ FlowMeasureLazyPolicy(boolean z11, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f11, CrossAxisAlignment crossAxisAlignment, float f12, int i11, int i12, int i13, FlowLayoutOverflowState flowLayoutOverflowState, List list, r rVar, v vVar) {
        this(z11, horizontal, vertical, f11, crossAxisAlignment, f12, i11, i12, i13, flowLayoutOverflowState, list, rVar);
    }

    private final FlowLayoutOverflowState component10() {
        return this.overflow;
    }

    private final List<p<Composer, Integer, g2>> component11() {
        return this.overflowComposables;
    }

    private final r<Integer, FlowLineInfo, Composer, Integer, g2> component12() {
        return this.getComposable;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    private final float m663component4D9Ej5fM() {
        return this.mainAxisSpacing;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m664component6D9Ej5fM() {
        return this.crossAxisArrangementSpacing;
    }

    private final int component7() {
        return this.itemCount;
    }

    private final int component8() {
        return this.maxLines;
    }

    private final int component9() {
        return this.maxItemsInMainAxis;
    }

    /* renamed from: copy-E4Q9ldg$default, reason: not valid java name */
    public static /* synthetic */ FlowMeasureLazyPolicy m665copyE4Q9ldg$default(FlowMeasureLazyPolicy flowMeasureLazyPolicy, boolean z11, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f11, CrossAxisAlignment crossAxisAlignment, float f12, int i11, int i12, int i13, FlowLayoutOverflowState flowLayoutOverflowState, List list, r rVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z11 = flowMeasureLazyPolicy.isHorizontal;
        }
        if ((i14 & 2) != 0) {
            horizontal = flowMeasureLazyPolicy.horizontalArrangement;
        }
        if ((i14 & 4) != 0) {
            vertical = flowMeasureLazyPolicy.verticalArrangement;
        }
        if ((i14 & 8) != 0) {
            f11 = flowMeasureLazyPolicy.mainAxisSpacing;
        }
        if ((i14 & 16) != 0) {
            crossAxisAlignment = flowMeasureLazyPolicy.crossAxisAlignment;
        }
        if ((i14 & 32) != 0) {
            f12 = flowMeasureLazyPolicy.crossAxisArrangementSpacing;
        }
        if ((i14 & 64) != 0) {
            i11 = flowMeasureLazyPolicy.itemCount;
        }
        if ((i14 & 128) != 0) {
            i12 = flowMeasureLazyPolicy.maxLines;
        }
        if ((i14 & 256) != 0) {
            i13 = flowMeasureLazyPolicy.maxItemsInMainAxis;
        }
        if ((i14 & 512) != 0) {
            flowLayoutOverflowState = flowMeasureLazyPolicy.overflow;
        }
        if ((i14 & 1024) != 0) {
            list = flowMeasureLazyPolicy.overflowComposables;
        }
        if ((i14 & 2048) != 0) {
            rVar = flowMeasureLazyPolicy.getComposable;
        }
        List list2 = list;
        r rVar2 = rVar;
        int i15 = i13;
        FlowLayoutOverflowState flowLayoutOverflowState2 = flowLayoutOverflowState;
        int i16 = i11;
        int i17 = i12;
        CrossAxisAlignment crossAxisAlignment2 = crossAxisAlignment;
        float f13 = f12;
        return flowMeasureLazyPolicy.m667copyE4Q9ldg(z11, horizontal, vertical, f11, crossAxisAlignment2, f13, i16, i17, i15, flowLayoutOverflowState2, list2, rVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    public final MeasureResult m666measure0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, long j11) {
        if (this.itemCount <= 0 || this.maxLines == 0 || this.maxItemsInMainAxis == 0 || (Constraints.m5067getMaxHeightimpl(j11) == 0 && this.overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.layout$default(subcomposeMeasureScope, 0, 0, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$1
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
        ContextualFlowItemIterator contextualFlowItemIterator = new ContextualFlowItemIterator(this.itemCount, new p<Integer, FlowLineInfo, List<? extends Measurable>>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$measurablesIterator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ List<? extends Measurable> invoke(Integer num, FlowLineInfo flowLineInfo) {
                return invoke(num.intValue(), flowLineInfo);
            }

            public final List<Measurable> invoke(final int i11, final FlowLineInfo flowLineInfo) {
                SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeMeasureScope.this;
                Integer valueOf = Integer.valueOf(i11);
                final FlowMeasureLazyPolicy flowMeasureLazyPolicy = this;
                return subcomposeMeasureScope2.subcompose(valueOf, ComposableLambdaKt.composableLambdaInstance(-195060736, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$measurablesIterator$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // x00.p
                    public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return g2.f100423a;
                    }

                    @Composable
                    public final void invoke(Composer composer, int i12) {
                        r rVar;
                        if (!composer.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-195060736, i12, -1, "androidx.compose.foundation.layout.FlowMeasureLazyPolicy.measure.<anonymous>.<anonymous> (ContextualFlowLayout.kt:496)");
                        }
                        rVar = FlowMeasureLazyPolicy.this.getComposable;
                        rVar.invoke(Integer.valueOf(i11), flowLineInfo, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        });
        this.overflow.setItemCount$foundation_layout_release(this.itemCount);
        this.overflow.m656setOverflowMeasurablesVKLhPVY$foundation_layout_release(this, j11, new p<Boolean, Integer, Measurable>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Measurable invoke(Boolean bool, Integer num) {
                return invoke(bool.booleanValue(), num.intValue());
            }

            public final Measurable invoke(boolean z11, int i11) {
                List list;
                int i12;
                int i13 = !z11 ? 1 : 0;
                list = FlowMeasureLazyPolicy.this.overflowComposables;
                p<? super Composer, ? super Integer, g2> pVar = (p) r0.b3(list, i13);
                if (pVar == null) {
                    return null;
                }
                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                FlowMeasureLazyPolicy flowMeasureLazyPolicy = FlowMeasureLazyPolicy.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z11);
                i12 = flowMeasureLazyPolicy.itemCount;
                sb2.append(i12);
                sb2.append(i11);
                return (Measurable) r0.b3(subcomposeMeasureScope2.subcompose(sb2.toString(), pVar), 0);
            }
        });
        return FlowLayoutKt.m650breakDownItemsdi9J0FM(subcomposeMeasureScope, this, contextualFlowItemIterator, this.mainAxisSpacing, this.crossAxisArrangementSpacing, OrientationIndependentConstraints.m695constructorimpl(j11, isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final boolean component1() {
        return this.isHorizontal;
    }

    @m80.k
    public final Arrangement.Horizontal component2() {
        return this.horizontalArrangement;
    }

    @m80.k
    public final Arrangement.Vertical component3() {
        return this.verticalArrangement;
    }

    @m80.k
    public final CrossAxisAlignment component5() {
        return this.crossAxisAlignment;
    }

    @m80.k
    /* renamed from: copy-E4Q9ldg, reason: not valid java name */
    public final FlowMeasureLazyPolicy m667copyE4Q9ldg(boolean z11, @m80.k Arrangement.Horizontal horizontal, @m80.k Arrangement.Vertical vertical, float f11, @m80.k CrossAxisAlignment crossAxisAlignment, float f12, int i11, int i12, int i13, @m80.k FlowLayoutOverflowState flowLayoutOverflowState, @m80.k List<? extends p<? super Composer, ? super Integer, g2>> list, @m80.k r<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, g2> rVar) {
        return new FlowMeasureLazyPolicy(z11, horizontal, vertical, f11, crossAxisAlignment, f12, i11, i12, i13, flowLayoutOverflowState, list, rVar, null);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasureLazyPolicy)) {
            return false;
        }
        FlowMeasureLazyPolicy flowMeasureLazyPolicy = (FlowMeasureLazyPolicy) obj;
        return this.isHorizontal == flowMeasureLazyPolicy.isHorizontal && g0.g(this.horizontalArrangement, flowMeasureLazyPolicy.horizontalArrangement) && g0.g(this.verticalArrangement, flowMeasureLazyPolicy.verticalArrangement) && Dp.m5120equalsimpl0(this.mainAxisSpacing, flowMeasureLazyPolicy.mainAxisSpacing) && g0.g(this.crossAxisAlignment, flowMeasureLazyPolicy.crossAxisAlignment) && Dp.m5120equalsimpl0(this.crossAxisArrangementSpacing, flowMeasureLazyPolicy.crossAxisArrangementSpacing) && this.itemCount == flowMeasureLazyPolicy.itemCount && this.maxLines == flowMeasureLazyPolicy.maxLines && this.maxItemsInMainAxis == flowMeasureLazyPolicy.maxItemsInMainAxis && g0.g(this.overflow, flowMeasureLazyPolicy.overflow) && g0.g(this.overflowComposables, flowMeasureLazyPolicy.overflowComposables) && g0.g(this.getComposable, flowMeasureLazyPolicy.getComposable);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    @m80.k
    public CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    @m80.k
    public Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @m80.k
    public final p<SubcomposeMeasureScope, Constraints, MeasureResult> getMeasurePolicy() {
        return new p<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$getMeasurePolicy$1
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                return m668invoke0kLqBqw(subcomposeMeasureScope, constraints.m5074unboximpl());
            }

            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
            public final MeasureResult m668invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j11) {
                MeasureResult m666measure0kLqBqw;
                m666measure0kLqBqw = FlowMeasureLazyPolicy.this.m666measure0kLqBqw(subcomposeMeasureScope, j11);
                return m666measure0kLqBqw;
            }
        };
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    @m80.k
    public Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public int hashCode() {
        return (((((((((((((((((((((Boolean.hashCode(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + Dp.m5121hashCodeimpl(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + Dp.m5121hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.itemCount)) * 31) + Integer.hashCode(this.maxLines)) * 31) + Integer.hashCode(this.maxItemsInMainAxis)) * 31) + this.overflow.hashCode()) * 31) + this.overflowComposables.hashCode()) * 31) + this.getComposable.hashCode();
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public boolean isHorizontal() {
        return this.isHorizontal;
    }

    @m80.k
    public String toString() {
        return "FlowMeasureLazyPolicy(isHorizontal=" + this.isHorizontal + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisSpacing=" + ((Object) Dp.m5126toStringimpl(this.mainAxisSpacing)) + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) Dp.m5126toStringimpl(this.crossAxisArrangementSpacing)) + ", itemCount=" + this.itemCount + ", maxLines=" + this.maxLines + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ", overflow=" + this.overflow + ", overflowComposables=" + this.overflowComposables + ", getComposable=" + this.getComposable + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FlowMeasureLazyPolicy(boolean z11, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f11, CrossAxisAlignment crossAxisAlignment, float f12, int i11, int i12, int i13, FlowLayoutOverflowState flowLayoutOverflowState, List<? extends p<? super Composer, ? super Integer, g2>> list, r<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, g2> rVar) {
        this.isHorizontal = z11;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisSpacing = f11;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f12;
        this.itemCount = i11;
        this.maxLines = i12;
        this.maxItemsInMainAxis = i13;
        this.overflow = flowLayoutOverflowState;
        this.overflowComposables = list;
        this.getComposable = rVar;
    }
}
