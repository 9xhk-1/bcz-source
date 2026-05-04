package kotlinx.datetime;

import kotlin.time.Instant;
import kotlinx.datetime.b;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {
    @m80.k
    public static final Instant a(@m80.k Instant instant, int i11, @m80.k b bVar, @m80.k q qVar) {
        return e.b(instant, i11, bVar, qVar);
    }

    @m80.k
    public static final r40.l b(@m80.k Instant instant, @m80.k Instant instant2, @m80.k q qVar) {
        return e.c(instant, instant2, qVar);
    }

    @m80.k
    public static final Instant c(@m80.k Instant instant, int i11, @m80.k b bVar, @m80.k q qVar) {
        return e.d(instant, i11, bVar, qVar);
    }

    @m80.k
    public static final Instant d(@m80.k Instant instant, long j11, @m80.k b.e eVar) {
        return e.e(instant, j11, eVar);
    }

    @m80.k
    public static final Instant e(@m80.k Instant instant, long j11, @m80.k b bVar, @m80.k q qVar) {
        return e.f(instant, j11, bVar, qVar);
    }

    @yz.n(message = "Use the plus overload with an explicit number of units", replaceWith = @w0(expression = "this.plus(1, unit, timeZone)", imports = {}))
    @m80.k
    public static final Instant f(@m80.k Instant instant, @m80.k b bVar, @m80.k q qVar) {
        return e.g(instant, bVar, qVar);
    }

    @m80.k
    public static final Instant g(@m80.k Instant instant, @m80.k r40.l lVar, @m80.k q qVar) {
        return e.h(instant, lVar, qVar);
    }

    public static final long h(@m80.k Instant instant, @m80.k Instant instant2, @m80.k b bVar, @m80.k q qVar) {
        return e.i(instant, instant2, bVar, qVar);
    }
}
