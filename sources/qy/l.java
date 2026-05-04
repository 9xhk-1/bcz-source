package qy;

import io.ktor.http.CacheControl;
import io.ktor.http.RangeUnits;
import ix.r0;
import ix.y0;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l {
    public static final void a(@m80.k r0 r0Var, @m80.k CacheControl value) {
        g0.p(r0Var, "<this>");
        g0.p(value, "value");
        r0Var.d(y0.f63006a.u(), value.toString());
    }

    public static final void b(@m80.k a aVar, @m80.k CacheControl value) {
        g0.p(aVar, "<this>");
        g0.p(value, "value");
        l(aVar, y0.f63006a.u(), value.toString());
    }

    public static final void c(@m80.k r0 r0Var, @m80.l g10.o oVar, @m80.l Long l11, @m80.k String unit) {
        g0.p(r0Var, "<this>");
        g0.p(unit, "unit");
        r0Var.k(y0.f63006a.B(), ix.j.b(oVar, l11, unit));
    }

    public static final void d(@m80.k a aVar, @m80.l g10.o oVar, @m80.l Long l11, @m80.k RangeUnits unit) {
        g0.p(aVar, "<this>");
        g0.p(unit, "unit");
        e(aVar, oVar, l11, unit.getUnitToken());
    }

    public static final void e(@m80.k a aVar, @m80.l g10.o oVar, @m80.l Long l11, @m80.k String unit) {
        g0.p(aVar, "<this>");
        g0.p(unit, "unit");
        l(aVar, y0.f63006a.B(), ix.j.b(oVar, l11, unit));
    }

    public static /* synthetic */ void f(r0 r0Var, g10.o oVar, Long l11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l11 = null;
        }
        if ((i11 & 4) != 0) {
            str = RangeUnits.Bytes.getUnitToken();
        }
        c(r0Var, oVar, l11, str);
    }

    public static /* synthetic */ void g(a aVar, g10.o oVar, Long l11, RangeUnits rangeUnits, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l11 = null;
        }
        d(aVar, oVar, l11, rangeUnits);
    }

    public static /* synthetic */ void h(a aVar, g10.o oVar, Long l11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l11 = null;
        }
        if ((i11 & 4) != 0) {
            str = RangeUnits.Bytes.getUnitToken();
        }
        e(aVar, oVar, l11, str);
    }

    public static final void i(@m80.k a aVar, @m80.k String value) {
        g0.p(aVar, "<this>");
        g0.p(value, "value");
        l(aVar, y0.f63006a.J(), value);
    }

    public static final void j(@m80.k a aVar, @m80.k String name, int i11) {
        g0.p(aVar, "<this>");
        g0.p(name, "name");
        q.c(aVar.a(), name, String.valueOf(i11), false, 4, null);
    }

    public static final void k(@m80.k a aVar, @m80.k String name, long j11) {
        g0.p(aVar, "<this>");
        g0.p(name, "name");
        q.c(aVar.a(), name, String.valueOf(j11), false, 4, null);
    }

    public static final void l(@m80.k a aVar, @m80.k String name, @m80.k String value) {
        g0.p(aVar, "<this>");
        g0.p(name, "name");
        g0.p(value, "value");
        q.c(aVar.a(), name, value, false, 4, null);
    }
}
