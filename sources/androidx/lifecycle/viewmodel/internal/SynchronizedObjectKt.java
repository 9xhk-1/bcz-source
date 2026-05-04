package androidx.lifecycle.viewmodel.internal;

import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSynchronizedObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 2 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n*L\n1#1,57:1\n23#2:58\n*S KotlinDebug\n*F\n+ 1 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n*L\n37#1:58\n*E\n"})
/* loaded from: classes2.dex */
public final class SynchronizedObjectKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m5614synchronized(@k SynchronizedObject lock, @k a<? extends T> action) {
        T invoke;
        g0.p(lock, "lock");
        g0.p(action, "action");
        synchronized (lock) {
            try {
                invoke = action.invoke();
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
