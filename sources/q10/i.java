package q10;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {
    @m80.k
    public static final g a(@m80.k g first, @m80.k g second) {
        g0.p(first, "first");
        g0.p(second, "second");
        return first.isEmpty() ? second : second.isEmpty() ? first : new n(first, second);
    }
}
