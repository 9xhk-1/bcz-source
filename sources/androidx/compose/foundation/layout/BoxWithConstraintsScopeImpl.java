package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
/* loaded from: classes.dex */
final class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {
    private final /* synthetic */ BoxScopeInstance $$delegate_0;
    private final long constraints;

    @m80.k
    private final Density density;

    public /* synthetic */ BoxWithConstraintsScopeImpl(Density density, long j11, v vVar) {
        this(density, j11);
    }

    private final Density component1() {
        return this.density;
    }

    /* renamed from: copy-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ BoxWithConstraintsScopeImpl m636copy0kLqBqw$default(BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, Density density, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            density = boxWithConstraintsScopeImpl.density;
        }
        if ((i11 & 2) != 0) {
            j11 = boxWithConstraintsScopeImpl.constraints;
        }
        return boxWithConstraintsScopeImpl.m638copy0kLqBqw(density, j11);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    @m80.k
    public Modifier align(@m80.k Modifier modifier, @m80.k Alignment alignment) {
        return this.$$delegate_0.align(modifier, alignment);
    }

    /* renamed from: component2-msEJaDk, reason: not valid java name */
    public final long m637component2msEJaDk() {
        return this.constraints;
    }

    @m80.k
    /* renamed from: copy-0kLqBqw, reason: not valid java name */
    public final BoxWithConstraintsScopeImpl m638copy0kLqBqw(@m80.k Density density, long j11) {
        return new BoxWithConstraintsScopeImpl(density, j11, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
        return g0.g(this.density, boxWithConstraintsScopeImpl.density) && Constraints.m5061equalsimpl0(this.constraints, boxWithConstraintsScopeImpl.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getConstraints-msEJaDk */
    public long mo631getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxHeight-D9Ej5fM */
    public float mo632getMaxHeightD9Ej5fM() {
        return Constraints.m5063getHasBoundedHeightimpl(mo631getConstraintsmsEJaDk()) ? this.density.mo374toDpu2uoSUM(Constraints.m5067getMaxHeightimpl(mo631getConstraintsmsEJaDk())) : Dp.Companion.m5134getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxWidth-D9Ej5fM */
    public float mo633getMaxWidthD9Ej5fM() {
        return Constraints.m5064getHasBoundedWidthimpl(mo631getConstraintsmsEJaDk()) ? this.density.mo374toDpu2uoSUM(Constraints.m5068getMaxWidthimpl(mo631getConstraintsmsEJaDk())) : Dp.Companion.m5134getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinHeight-D9Ej5fM */
    public float mo634getMinHeightD9Ej5fM() {
        return this.density.mo374toDpu2uoSUM(Constraints.m5069getMinHeightimpl(mo631getConstraintsmsEJaDk()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinWidth-D9Ej5fM */
    public float mo635getMinWidthD9Ej5fM() {
        return this.density.mo374toDpu2uoSUM(Constraints.m5070getMinWidthimpl(mo631getConstraintsmsEJaDk()));
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + Constraints.m5071hashCodeimpl(this.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    @m80.k
    public Modifier matchParentSize(@m80.k Modifier modifier) {
        return this.$$delegate_0.matchParentSize(modifier);
    }

    @m80.k
    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) Constraints.m5073toStringimpl(this.constraints)) + ')';
    }

    private BoxWithConstraintsScopeImpl(Density density, long j11) {
        this.density = density;
        this.constraints = j11;
        this.$$delegate_0 = BoxScopeInstance.INSTANCE;
    }
}
