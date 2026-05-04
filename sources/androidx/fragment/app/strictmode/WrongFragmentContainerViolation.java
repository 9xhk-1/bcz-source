package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class WrongFragmentContainerViolation extends Violation {

    @k
    private final ViewGroup container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongFragmentContainerViolation(@k Fragment fragment, @k ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        g0.p(fragment, "fragment");
        g0.p(container, "container");
        this.container = container;
    }

    @k
    public final ViewGroup getContainer() {
        return this.container;
    }
}
