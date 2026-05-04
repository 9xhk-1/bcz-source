package a60;

import com.badlogic.gdx.Net;
import kotlin.jvm.internal.g0;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final f f2007a = new f();

    @o
    public static final boolean b(@m80.k String method) {
        g0.p(method, "method");
        return (g0.g(method, "GET") || g0.g(method, Net.a.f11462a)) ? false : true;
    }

    @o
    public static final boolean e(@m80.k String method) {
        g0.p(method, "method");
        return g0.g(method, "POST") || g0.g(method, Net.a.f11465d) || g0.g(method, "PATCH") || g0.g(method, "PROPPATCH") || g0.g(method, "REPORT");
    }

    public final boolean a(@m80.k String method) {
        g0.p(method, "method");
        return g0.g(method, "POST") || g0.g(method, "PATCH") || g0.g(method, Net.a.f11465d) || g0.g(method, Net.a.f11467f) || g0.g(method, "MOVE");
    }

    public final boolean c(@m80.k String method) {
        g0.p(method, "method");
        return !g0.g(method, "PROPFIND");
    }

    public final boolean d(@m80.k String method) {
        g0.p(method, "method");
        return g0.g(method, "PROPFIND");
    }
}
