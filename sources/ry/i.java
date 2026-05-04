package ry;

import io.ktor.server.testing.TestApplicationEngine;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i extends ow.j {

    /* renamed from: e, reason: collision with root package name */
    public TestApplicationEngine f86937e;

    @m80.k
    public final TestApplicationEngine j() {
        TestApplicationEngine testApplicationEngine = this.f86937e;
        if (testApplicationEngine != null) {
            return testApplicationEngine;
        }
        g0.S("app");
        return null;
    }

    public final void k(@m80.k TestApplicationEngine testApplicationEngine) {
        g0.p(testApplicationEngine, "<set-?>");
        this.f86937e = testApplicationEngine;
    }
}
