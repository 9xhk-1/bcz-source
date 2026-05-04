package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SetUserVisibleHintViolation extends Violation {
    private final boolean isVisibleToUser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetUserVisibleHintViolation(@k Fragment fragment, boolean z11) {
        super(fragment, "Attempting to set user visible hint to " + z11 + " for fragment " + fragment);
        g0.p(fragment, "fragment");
        this.isVisibleToUser = z11;
    }

    public final boolean isVisibleToUser() {
        return this.isVisibleToUser;
    }
}
