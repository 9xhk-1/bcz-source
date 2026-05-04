package io.ktor.util.pipeline;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStackTraceRecover.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecover.kt\nio/ktor/util/pipeline/StackTraceRecoverKt\n+ 2 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,23:1\n57#2,2:24\n*S KotlinDebug\n*F\n+ 1 StackTraceRecover.kt\nio/ktor/util/pipeline/StackTraceRecoverKt\n*L\n17#1:24,2\n*E\n"})
/* loaded from: classes8.dex */
public final class k {
    @m80.k
    public static final Throwable a(@m80.k Throwable exception, @m80.k j00.c<?> continuation) {
        g0.p(exception, "exception");
        g0.p(continuation, "continuation");
        try {
            return j.a(exception, exception.getCause());
        } catch (Throwable unused) {
            return exception;
        }
    }
}
