package androidx.collection.internal;

import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Lock {
    public final <T> T synchronizedImpl(@k a<? extends T> block) {
        T invoke;
        g0.p(block, "block");
        synchronized (this) {
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
