package bz;

import kotlin.jvm.internal.g0;
import kotlin.time.e;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    @k
    public static final b a(@k b bVar, long j11) {
        g0.p(bVar, "<this>");
        return io.ktor.util.date.a.b(Long.valueOf(bVar.z() - j11));
    }

    @k
    public static final b b(@k b minus, long j11) {
        g0.p(minus, "$this$minus");
        return io.ktor.util.date.a.b(Long.valueOf(minus.z() - e.x(j11)));
    }

    @k
    public static final b c(@k b bVar, long j11) {
        g0.p(bVar, "<this>");
        return io.ktor.util.date.a.b(Long.valueOf(bVar.z() + j11));
    }

    @k
    public static final b d(@k b plus, long j11) {
        g0.p(plus, "$this$plus");
        return io.ktor.util.date.a.b(Long.valueOf(plus.z() + e.x(j11)));
    }

    @k
    public static final b e(@k b bVar) {
        g0.p(bVar, "<this>");
        return io.ktor.util.date.a.a(bVar.y(), bVar.w(), bVar.v(), bVar.s(), bVar.x(), bVar.A());
    }
}
