package io.ktor.server.engine;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {
    public static final void a(@m80.k a aVar, long j11, long j12, @m80.k TimeUnit timeUnit) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(timeUnit, "timeUnit");
        aVar.d(timeUnit.toMillis(j11), timeUnit.toMillis(j12));
    }
}
