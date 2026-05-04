package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {
    private final int requestCode;

    @k
    private final Fragment targetFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTargetFragmentUsageViolation(@k Fragment fragment, @k Fragment targetFragment, int i11) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i11 + " for fragment " + fragment);
        g0.p(fragment, "fragment");
        g0.p(targetFragment, "targetFragment");
        this.targetFragment = targetFragment;
        this.requestCode = i11;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    @k
    public final Fragment getTargetFragment() {
        return this.targetFragment;
    }
}
