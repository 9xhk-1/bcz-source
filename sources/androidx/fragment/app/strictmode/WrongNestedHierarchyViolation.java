package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class WrongNestedHierarchyViolation extends Violation {
    private final int containerId;

    @k
    private final Fragment expectedParentFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongNestedHierarchyViolation(@k Fragment fragment, @k Fragment expectedParentFragment, int i11) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + expectedParentFragment + " via container with ID " + i11 + " without using parent's childFragmentManager");
        g0.p(fragment, "fragment");
        g0.p(expectedParentFragment, "expectedParentFragment");
        this.expectedParentFragment = expectedParentFragment;
        this.containerId = i11;
    }

    public final int getContainerId() {
        return this.containerId;
    }

    @k
    public final Fragment getExpectedParentFragment() {
        return this.expectedParentFragment;
    }
}
