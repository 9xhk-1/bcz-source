package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class UiApplier extends AbstractApplier<LayoutNode> {
    public static final int $stable = 0;

    public UiApplier(@k LayoutNode layoutNode) {
        super(layoutNode);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i11, @k LayoutNode layoutNode) {
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i11, int i12, int i13) {
        getCurrent().move$ui_release(i11, i12, i13);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public void onClear() {
        getRoot().removeAll$ui_release();
    }

    @Override // androidx.compose.runtime.Applier
    public void onEndChanges() {
        super.onEndChanges();
        Owner owner$ui_release = getRoot().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onEndApplyChanges();
        }
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i11, int i12) {
        getCurrent().removeAt$ui_release(i11, i12);
    }

    @Override // androidx.compose.runtime.Applier
    public void reuse() {
        getCurrent().onReuse();
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i11, @k LayoutNode layoutNode) {
        getCurrent().insertAt$ui_release(i11, layoutNode);
    }
}
