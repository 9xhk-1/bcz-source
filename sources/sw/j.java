package sw;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final a<T> f88961a;

    /* renamed from: b, reason: collision with root package name */
    public final T f88962b;

    public j(@m80.k a<T> hook, T t11) {
        g0.p(hook, "hook");
        this.f88961a = hook;
        this.f88962b = t11;
    }

    public final void a(@m80.k lw.c client) {
        g0.p(client, "client");
        this.f88961a.a(client, this.f88962b);
    }
}
