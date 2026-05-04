package qy;

import ix.r0;
import ix.y0;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k {
    public static final void a(@m80.k r0 r0Var, @m80.k LocalDateTime expires) {
        g0.p(r0Var, "<this>");
        g0.p(expires, "expires");
        r0Var.d(y0.f63006a.L(), gy.d.b(j.a(expires)));
    }

    public static final void b(@m80.k a aVar, @m80.k LocalDateTime value) {
        g0.p(aVar, "<this>");
        g0.p(value, "value");
        c(aVar, y0.f63006a.L(), j.a(value));
    }

    public static final void c(@m80.k a aVar, @m80.k String name, @m80.k Temporal date) {
        g0.p(aVar, "<this>");
        g0.p(name, "name");
        g0.p(date, "date");
        q.c(aVar.a(), name, gy.d.b(date), false, 4, null);
    }

    public static final void d(@m80.k r0 r0Var, @m80.k ZonedDateTime dateTime) {
        g0.p(r0Var, "<this>");
        g0.p(dateTime, "dateTime");
        r0Var.d(y0.f63006a.X(), gy.d.b(j.a(dateTime)));
    }

    public static final void e(@m80.k a aVar, @m80.k ZonedDateTime dateTime) {
        g0.p(aVar, "<this>");
        g0.p(dateTime, "dateTime");
        c(aVar, y0.f63006a.X(), j.a(dateTime));
    }
}
