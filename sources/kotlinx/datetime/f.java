package kotlinx.datetime;

import kotlin.time.Instant;
import kotlinx.datetime.b;
import s40.e0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final long f68508a = -3217862419201L;

    /* renamed from: b, reason: collision with root package name */
    public static final long f68509b = 3093527980800L;

    public static final int a(@m80.k Instant instant, @m80.k Instant instant2, @m80.k q qVar) {
        return g.b(instant, instant2, qVar);
    }

    @m80.k
    public static final String b(@m80.k Instant instant, @m80.k e0<s40.l> e0Var, @m80.k UtcOffset utcOffset) {
        return g.c(instant, e0Var, utcOffset);
    }

    public static final long d(@m80.k Instant instant, @m80.k Instant instant2, @m80.k b.e eVar) {
        return g.f(instant, instant2, eVar);
    }

    public static final long e(@m80.k Instant instant, @m80.k Instant instant2, @m80.k b bVar, @m80.k q qVar) {
        return g.g(instant, instant2, bVar, qVar);
    }

    @m80.k
    public static final Instant f(@m80.k Instant instant, int i11, @m80.k b.e eVar) {
        return g.h(instant, i11, eVar);
    }

    @m80.k
    public static final Instant g(@m80.k Instant instant, long j11, @m80.k b.e eVar) {
        return g.i(instant, j11, eVar);
    }

    @m80.k
    public static final Instant h(@m80.k Instant instant, long j11, @m80.k b bVar, @m80.k q qVar) {
        return g.j(instant, j11, bVar, qVar);
    }

    @yz.n(message = "Use the minus overload with an explicit number of units", replaceWith = @w0(expression = "this.minus(1, unit)", imports = {}))
    @m80.k
    public static final Instant i(@m80.k Instant instant, @m80.k b.e eVar) {
        return g.k(instant, eVar);
    }

    @yz.n(message = "Use the minus overload with an explicit number of units", replaceWith = @w0(expression = "this.minus(1, unit, timeZone)", imports = {}))
    @m80.k
    public static final Instant j(@m80.k Instant instant, @m80.k b bVar, @m80.k q qVar) {
        return g.l(instant, bVar, qVar);
    }

    @m80.k
    public static final Instant k(@m80.k Instant instant, @m80.k r40.l lVar, @m80.k q qVar) {
        return g.m(instant, lVar, qVar);
    }

    @m80.k
    public static final r40.l l(@m80.k Instant instant, @m80.k Instant instant2, @m80.k q qVar) {
        return g.n(instant, instant2, qVar);
    }

    public static final int m(@m80.k Instant instant, @m80.k Instant instant2, @m80.k q qVar) {
        return g.o(instant, instant2, qVar);
    }

    @m80.k
    public static final Instant n(@m80.k Instant.a aVar, @m80.k CharSequence charSequence, @m80.k e0<s40.l> e0Var) {
        return g.p(aVar, charSequence, e0Var);
    }

    @m80.k
    public static final Instant o(@m80.k Instant instant, int i11, @m80.k b.e eVar) {
        return g.q(instant, i11, eVar);
    }

    @yz.n(message = "Use the plus overload with an explicit number of units", replaceWith = @w0(expression = "this.plus(1, unit)", imports = {}))
    @m80.k
    public static final Instant p(@m80.k Instant instant, @m80.k b.e eVar) {
        return g.r(instant, eVar);
    }

    public static final long q(@m80.k Instant instant, @m80.k Instant instant2, @m80.k b.e eVar) {
        return g.s(instant, instant2, eVar);
    }

    public static final int r(@m80.k Instant instant, @m80.k Instant instant2, @m80.k q qVar) {
        return g.t(instant, instant2, qVar);
    }
}
