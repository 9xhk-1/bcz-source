package io.ktor.client.engine.cio;

import java.net.SocketTimeoutException;
import kotlin.jvm.internal.g0;
import rw.f1;
import xy.f2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x {
    @m80.k
    public static final Throwable a(@m80.k Throwable th2, @m80.k cx.z request) {
        g0.p(th2, "<this>");
        g0.p(request, "request");
        Throwable cause = th2.getCause();
        Throwable h11 = (cause != null ? f2.a(cause) : null) instanceof SocketTimeoutException ? f1.h(request, th2.getCause()) : th2.getCause();
        return h11 == null ? th2 : h11;
    }
}
