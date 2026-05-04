package z50;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.g0;
import m80.k;
import t50.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Set<r> f101020a = new LinkedHashSet();

    public final synchronized void a(@k r route) {
        g0.p(route, "route");
        this.f101020a.remove(route);
    }

    public final synchronized void b(@k r failedRoute) {
        g0.p(failedRoute, "failedRoute");
        this.f101020a.add(failedRoute);
    }

    public final synchronized boolean c(@k r route) {
        g0.p(route, "route");
        return this.f101020a.contains(route);
    }
}
