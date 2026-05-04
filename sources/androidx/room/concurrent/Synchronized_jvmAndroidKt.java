package androidx.room.concurrent;

import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class Synchronized_jvmAndroidKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m5617synchronized(@k Object lock, @k a<? extends T> block) {
        T invoke;
        g0.p(lock, "lock");
        g0.p(block, "block");
        synchronized (lock) {
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
