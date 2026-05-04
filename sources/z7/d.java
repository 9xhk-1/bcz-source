package z7;

import kotlin.jvm.internal.g0;
import m80.k;
import w30.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public String f101066a = "";

    @k
    public final String a(@k String host) {
        g0.p(host, "host");
        return host + '/' + this.f101066a + '/' + b.C1273b.f94770b.a().toEpochMilliseconds();
    }

    public final void b(@k String name) {
        g0.p(name, "name");
        this.f101066a = name;
    }
}
