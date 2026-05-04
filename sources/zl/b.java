package zl;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b {
    public static final <T> boolean a(@l T t11, @k T[] array) {
        g0.q(array, "array");
        if (t11 == null) {
            return false;
        }
        for (T t12 : array) {
            if (g0.g(t11, t12)) {
                return true;
            }
        }
        return false;
    }

    @k
    public static final <T> String b(@k T TAG) {
        g0.q(TAG, "$this$TAG");
        String simpleName = TAG.getClass().getSimpleName();
        g0.h(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
