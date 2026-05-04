package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class MethodCallsLogger {

    @k
    private final Map<String, Integer> calledMethods = new HashMap();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean approveCall(@k String name, int i11) {
        g0.p(name, "name");
        Integer num = this.calledMethods.get(name);
        int intValue = num != null ? num.intValue() : 0;
        boolean z11 = (intValue & i11) != 0;
        this.calledMethods.put(name, Integer.valueOf(i11 | intValue));
        return !z11;
    }
}
