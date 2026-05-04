package o30;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {
    public static final boolean a(@m80.k Throwable th2) {
        g0.p(th2, "<this>");
        Class<?> cls = th2.getClass();
        while (!g0.g(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    @m80.k
    public static final RuntimeException b(@m80.k Throwable e11) {
        g0.p(e11, "e");
        throw e11;
    }
}
