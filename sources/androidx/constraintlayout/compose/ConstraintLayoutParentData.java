package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.layout.LayoutIdParentData;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes2.dex */
final class ConstraintLayoutParentData implements LayoutIdParentData {

    @k
    private final l<ConstrainScope, g2> constrain;

    @k
    private final Object layoutId;

    @k
    private final ConstrainedLayoutReference ref;

    /* JADX WARN: Multi-variable type inference failed */
    public ConstraintLayoutParentData(@k ConstrainedLayoutReference constrainedLayoutReference, @k l<? super ConstrainScope, g2> lVar) {
        this.ref = constrainedLayoutReference;
        this.constrain = lVar;
        this.layoutId = constrainedLayoutReference.getId$constraintlayout_compose_release();
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof ConstraintLayoutParentData)) {
            return false;
        }
        ConstraintLayoutParentData constraintLayoutParentData = (ConstraintLayoutParentData) obj;
        return g0.g(this.ref.getId$constraintlayout_compose_release(), constraintLayoutParentData.ref.getId$constraintlayout_compose_release()) && this.constrain == constraintLayoutParentData.constrain;
    }

    @k
    public final l<ConstrainScope, g2> getConstrain() {
        return this.constrain;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    @k
    public Object getLayoutId() {
        return this.layoutId;
    }

    @k
    public final ConstrainedLayoutReference getRef() {
        return this.ref;
    }

    public int hashCode() {
        return (this.ref.getId$constraintlayout_compose_release().hashCode() * 31) + this.constrain.hashCode();
    }
}
