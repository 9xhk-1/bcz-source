package androidx.collection.internal;

import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLockExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 2 Lock.jvm.kt\nandroidx/collection/internal/Lock\n*L\n1#1,29:1\n26#2:30\n*S KotlinDebug\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n*L\n27#1:30\n*E\n"})
/* loaded from: classes.dex */
public final class LockExtKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m28synchronized(@k Lock lock, @k a<? extends T> block) {
        T invoke;
        g0.p(lock, "<this>");
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
