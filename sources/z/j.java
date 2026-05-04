package z;

import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class j {
    public static final <R> R a(@m80.k Object obj, @m80.k x00.a<? extends R> block) {
        R invoke;
        g0.p(obj, "<this>");
        g0.p(block, "block");
        synchronized (obj) {
            try {
                invoke = block.invoke();
                d0.d(1);
            } catch (Throwable th2) {
                d0.d(1);
                d0.c(1);
                throw th2;
            }
        }
        d0.c(1);
        return invoke;
    }
}
