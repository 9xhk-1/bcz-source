package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class RetainInstanceUsageViolation extends Violation {
    public /* synthetic */ RetainInstanceUsageViolation(Fragment fragment, String str, int i11, v vVar) {
        this(fragment, (i11 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetainInstanceUsageViolation(@k Fragment fragment, @l String str) {
        super(fragment, str);
        g0.p(fragment, "fragment");
    }
}
