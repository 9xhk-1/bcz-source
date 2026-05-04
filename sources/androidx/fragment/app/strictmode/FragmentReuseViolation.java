package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FragmentReuseViolation extends Violation {

    @k
    private final String previousFragmentId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(@k Fragment fragment, @k String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        g0.p(fragment, "fragment");
        g0.p(previousFragmentId, "previousFragmentId");
        this.previousFragmentId = previousFragmentId;
    }

    @k
    public final String getPreviousFragmentId() {
        return this.previousFragmentId;
    }
}
