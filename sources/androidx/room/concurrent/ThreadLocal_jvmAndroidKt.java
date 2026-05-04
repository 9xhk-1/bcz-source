package androidx.room.concurrent;

import c40.n3;
import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ThreadLocal_jvmAndroidKt {
    @k
    public static final <T> d.b asContextElement(@k ThreadLocal<T> threadLocal, T t11) {
        g0.p(threadLocal, "<this>");
        return n3.a(threadLocal, t11);
    }

    public static final long currentThreadId() {
        return Thread.currentThread().getId();
    }

    public static /* synthetic */ void ThreadLocal$annotations() {
    }
}
