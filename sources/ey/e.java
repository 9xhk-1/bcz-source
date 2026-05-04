package ey;

import a00.h0;
import a00.r0;
import io.ktor.server.engine.x1;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final List<d> f50230a;

    static {
        ServiceLoader load = ServiceLoader.load(d.class, d.class.getClassLoader());
        g0.o(load, "load(...)");
        f50230a = r0.a6(load);
    }

    @m80.k
    public static final List<String> a() {
        return h0.S(x1.h("config.file"), x1.h("config.resource"), x1.h("config.url"));
    }

    @m80.k
    public static final List<d> b() {
        return f50230a;
    }
}
