package z;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class l {
    @m80.l
    public static final <T> T a(@m80.k ThreadLocal<T> threadLocal) {
        g0.p(threadLocal, "<this>");
        return threadLocal.get();
    }

    public static final <T> void b(@m80.k ThreadLocal<T> threadLocal, @m80.l T t11) {
        g0.p(threadLocal, "<this>");
        threadLocal.set(t11);
    }
}
