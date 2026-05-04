package io.ktor.serialization.kotlinx;

import a00.r0;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final List<e> f61188a;

    static {
        ServiceLoader load = ServiceLoader.load(e.class, e.class.getClassLoader());
        g0.o(load, "load(...)");
        f61188a = r0.a6(load);
    }

    @k
    public static final List<e> a() {
        return f61188a;
    }
}
