package xy;

import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class w {
    @m80.k
    public static final <T> Set<T> a(@m80.k Set<? extends T> set) {
        kotlin.jvm.internal.g0.p(set, "<this>");
        Set<T> unmodifiableSet = Collections.unmodifiableSet(set);
        kotlin.jvm.internal.g0.o(unmodifiableSet, "unmodifiableSet(...)");
        return unmodifiableSet;
    }
}
