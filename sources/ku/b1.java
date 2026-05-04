package ku;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public enum b1 {
    UNRESOLVED,
    RESOLVED;

    public static final b1 a(boolean z11) {
        return z11 ? RESOLVED : UNRESOLVED;
    }

    public static final b1 b(Collection<? extends d> collection) {
        Iterator<? extends d> it = collection.iterator();
        while (it.hasNext()) {
            b1 N0 = it.next().N0();
            b1 b1Var = UNRESOLVED;
            if (N0 == b1Var) {
                return b1Var;
            }
        }
        return RESOLVED;
    }
}
