package u40;

import a00.r0;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class w {
    @m80.k
    public static final <T> v<T> a(@m80.k List<? extends v<? super T>> predicates) {
        g0.p(predicates, "predicates");
        return predicates.isEmpty() ? c0.f91774a : predicates.size() == 1 ? (v) r0.m5(predicates) : new i(predicates);
    }
}
