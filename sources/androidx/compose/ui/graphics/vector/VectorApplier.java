package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorApplier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
/* loaded from: classes.dex */
public final class VectorApplier extends AbstractApplier<VNode> {
    public static final int $stable = 0;

    public VectorApplier(@k VNode vNode) {
        super(vNode);
    }

    private final GroupComponent asGroup(VNode vNode) {
        if (vNode instanceof GroupComponent) {
            return (GroupComponent) vNode;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group");
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i11, @k VNode vNode) {
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i11, int i12, int i13) {
        asGroup(getCurrent()).move(i11, i12, i13);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public void onClear() {
        GroupComponent asGroup = asGroup(getRoot());
        asGroup.remove(0, asGroup.getNumChildren());
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i11, int i12) {
        asGroup(getCurrent()).remove(i11, i12);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i11, @k VNode vNode) {
        asGroup(getCurrent()).insertAt(i11, vNode);
    }
}
