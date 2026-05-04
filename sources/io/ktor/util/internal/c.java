package io.ktor.util.internal;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {
    public static final void a(@k Throwable th2, @k Throwable cause) {
        g0.p(th2, "<this>");
        g0.p(cause, "cause");
        th2.initCause(cause);
    }
}
