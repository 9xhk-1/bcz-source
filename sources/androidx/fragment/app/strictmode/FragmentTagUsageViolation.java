package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FragmentTagUsageViolation extends Violation {

    @l
    private final ViewGroup parentContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentTagUsageViolation(@k Fragment fragment, @l ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        g0.p(fragment, "fragment");
        this.parentContainer = viewGroup;
    }

    @l
    public final ViewGroup getParentContainer() {
        return this.parentContainer;
    }
}
