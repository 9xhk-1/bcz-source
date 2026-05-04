package io.ktor.websocket;

import io.ktor.websocket.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f62574a = "server_max_window_bits";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f62575b = "client_no_context_takeover";

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f62576c = "server_no_context_takeover";

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f62577d = "client_max_window_bits";

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f62578e = "permessage-deflate";

    /* renamed from: f, reason: collision with root package name */
    public static final int f62579f = 15;

    /* renamed from: g, reason: collision with root package name */
    public static final int f62580g = 8;

    public static final boolean b(d dVar) {
        if (dVar.h()) {
            return (dVar instanceof d.f) || (dVar instanceof d.a);
        }
        return false;
    }
}
