package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nMultiContentMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiContentMeasurePolicy.kt\nandroidx/compose/ui/layout/MultiContentMeasurePolicyImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
/* loaded from: classes.dex */
public final class MultiContentMeasurePolicyImpl implements MeasurePolicy {
    public static final int $stable = 0;

    @k
    private final MultiContentMeasurePolicy measurePolicy;

    public MultiContentMeasurePolicyImpl(@k MultiContentMeasurePolicy multiContentMeasurePolicy) {
        this.measurePolicy = multiContentMeasurePolicy;
    }

    public static /* synthetic */ MultiContentMeasurePolicyImpl copy$default(MultiContentMeasurePolicyImpl multiContentMeasurePolicyImpl, MultiContentMeasurePolicy multiContentMeasurePolicy, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            multiContentMeasurePolicy = multiContentMeasurePolicyImpl.measurePolicy;
        }
        return multiContentMeasurePolicyImpl.copy(multiContentMeasurePolicy);
    }

    @k
    public final MultiContentMeasurePolicy component1() {
        return this.measurePolicy;
    }

    @k
    public final MultiContentMeasurePolicyImpl copy(@k MultiContentMeasurePolicy multiContentMeasurePolicy) {
        return new MultiContentMeasurePolicyImpl(multiContentMeasurePolicy);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultiContentMeasurePolicyImpl) && g0.g(this.measurePolicy, ((MultiContentMeasurePolicyImpl) obj).measurePolicy);
    }

    @k
    public final MultiContentMeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    public int hashCode() {
        return this.measurePolicy.hashCode();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        return this.measurePolicy.maxIntrinsicHeight(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i11);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        return this.measurePolicy.maxIntrinsicWidth(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i11);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(@k MeasureScope measureScope, @k List<? extends Measurable> list, long j11) {
        return this.measurePolicy.mo673measure3p2s80s(measureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(measureScope), j11);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        return this.measurePolicy.minIntrinsicHeight(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i11);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
        return this.measurePolicy.minIntrinsicWidth(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i11);
    }

    @k
    public String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.measurePolicy + ')';
    }
}
