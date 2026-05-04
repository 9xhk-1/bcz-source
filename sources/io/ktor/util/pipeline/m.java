package io.ktor.util.pipeline;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.o0;
import xy.q1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m implements l00.c, j00.c<?> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final m f62064a = new m();

    @Override // l00.c
    @m80.l
    public l00.c getCallerFrame() {
        return null;
    }

    @Override // j00.c
    @m80.k
    public kotlin.coroutines.d getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // l00.c
    @m80.k
    public StackTraceElement getStackTraceElement() {
        h10.d d11 = o0.d(l.class);
        l lVar = l.f62063a;
        return q1.c(d11, "failedToCaptureStackFrame", "StackWalkingFailed.kt", 8);
    }

    @Override // j00.c
    public void resumeWith(@m80.k Object obj) {
        l.f62063a.a();
    }
}
