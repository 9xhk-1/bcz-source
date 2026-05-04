package io.ktor.websocket;

import c40.q0;
import io.ktor.websocket.CloseReason;
import kotlin.jvm.internal.u0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import org.slf4j.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDefaultWebSocketSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultWebSocketSession.kt\nio/ktor/websocket/DefaultWebSocketSessionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n1#2:373\n*E\n"})
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final long f62375b = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Logger f62374a = ez.a.a("io.ktor.websocket.WebSocket");

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final q0 f62376c = new q0("ws-incoming-processor");

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final q0 f62377d = new q0("ws-outgoing-processor");

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final CloseReason f62378e = new CloseReason(CloseReason.Codes.NORMAL, "OK");

    @m80.k
    public static final a a(@m80.k j0 session, long j11, long j12) {
        kotlin.jvm.internal.g0.p(session, "session");
        if (session instanceof a) {
            throw new IllegalArgumentException("Cannot wrap other DefaultWebSocketSession");
        }
        return new b(session, j11, j12);
    }

    public static /* synthetic */ a b(j0 j0Var, long j11, long j12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        if ((i11 & 4) != 0) {
            j12 = 15000;
        }
        return a(j0Var, j11, j12);
    }

    @m80.k
    public static final Logger f() {
        return f62374a;
    }

    @m80.l
    public static final kotlin.time.e g(@m80.k a aVar) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        Long valueOf = Long.valueOf(aVar.x0());
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        e.a aVar2 = kotlin.time.e.f67757b;
        return kotlin.time.e.f(kotlin.time.f.x(valueOf.longValue(), DurationUnit.MILLISECONDS));
    }

    public static final long h(@m80.k a aVar) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        e.a aVar2 = kotlin.time.e.f67757b;
        return kotlin.time.f.x(aVar.a0(), DurationUnit.MILLISECONDS);
    }

    public static final void i(@m80.k a pingInterval, @m80.l kotlin.time.e eVar) {
        kotlin.jvm.internal.g0.p(pingInterval, "$this$pingInterval");
        pingInterval.L0(eVar != null ? kotlin.time.e.x(eVar.k0()) : 0L);
    }

    public static final void j(@m80.k a timeout, long j11) {
        kotlin.jvm.internal.g0.p(timeout, "$this$timeout");
        timeout.k0(kotlin.time.e.x(j11));
    }
}
