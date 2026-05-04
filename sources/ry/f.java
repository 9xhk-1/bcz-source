package ry;

import c40.l2;
import io.ktor.server.testing.TestApplication;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f extends ow.j {

    /* renamed from: e, reason: collision with root package name */
    public x00.a<TestApplication> f86930e;

    /* renamed from: f, reason: collision with root package name */
    public l2 f86931f;

    @m80.k
    public final l2 j() {
        l2 l2Var = this.f86931f;
        if (l2Var != null) {
            return l2Var;
        }
        g0.S("parentJob");
        return null;
    }

    @m80.k
    public final x00.a<TestApplication> k() {
        x00.a<TestApplication> aVar = this.f86930e;
        if (aVar != null) {
            return aVar;
        }
        g0.S("testApplicationProvder");
        return null;
    }

    public final void l(@m80.k l2 l2Var) {
        g0.p(l2Var, "<set-?>");
        this.f86931f = l2Var;
    }

    public final void m(@m80.k x00.a<TestApplication> aVar) {
        g0.p(aVar, "<set-?>");
        this.f86930e = aVar;
    }
}
