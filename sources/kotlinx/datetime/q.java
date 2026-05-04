package kotlinx.datetime;

import f50.a0;
import java.time.ZoneId;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.time.Instant;
import r40.q2;
import r40.r2;
import r40.t2;
import x40.t0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0(with = t0.class)
/* loaded from: classes8.dex */
public class q {

    @m80.k
    public static final a Companion = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final c f68527b;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ZoneId f68528a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final q a() {
            ZoneId systemDefault;
            systemDefault = ZoneId.systemDefault();
            g0.o(systemDefault, "systemDefault(...)");
            return e(systemDefault);
        }

        @m80.k
        public final Set<String> b() {
            Set<String> availableZoneIds;
            availableZoneIds = ZoneId.getAvailableZoneIds();
            g0.o(availableZoneIds, "getAvailableZoneIds(...)");
            return availableZoneIds;
        }

        @m80.k
        public final c c() {
            return q.f68527b;
        }

        @m80.k
        public final q d(@m80.k String zoneId) {
            ZoneId of2;
            g0.p(zoneId, "zoneId");
            try {
                if (g0.g(zoneId, "z")) {
                    zoneId = "Z";
                }
                of2 = ZoneId.of(zoneId);
                g0.o(of2, "of(...)");
                return e(of2);
            } catch (Exception e11) {
                if (r40.w.a(e11)) {
                    throw new IllegalTimeZoneException(e11);
                }
                throw e11;
            }
        }

        @m80.k
        public final q e(@m80.k ZoneId zoneId) {
            boolean d11;
            ZoneId normalized;
            g0.p(zoneId, "zoneId");
            if (q2.a(zoneId)) {
                return new c(new UtcOffset(r2.a(zoneId)));
            }
            d11 = r.d(zoneId);
            if (!d11) {
                return new q(zoneId);
            }
            normalized = zoneId.normalized();
            g0.n(normalized, "null cannot be cast to non-null type java.time.ZoneOffset");
            return new c(new UtcOffset(r2.a(normalized)), zoneId);
        }

        @m80.k
        public final f50.i<q> serializer() {
            return t0.f97463a;
        }

        public a() {
        }
    }

    static {
        ZoneId of2;
        UtcOffset b11 = UtcOffset.Companion.b();
        of2 = ZoneId.of("UTC");
        g0.o(of2, "of(...)");
        f68527b = new c(b11, of2);
    }

    public q(@m80.k ZoneId zoneId) {
        g0.p(zoneId, "zoneId");
        this.f68528a = zoneId;
    }

    public static /* synthetic */ Instant e(q qVar, LocalDateTime localDateTime, p pVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toInstant");
        }
        if ((i11 & 1) != 0) {
            pVar = p.f68525a.a();
        }
        return qVar.d(localDateTime, pVar);
    }

    @m80.k
    public final String b() {
        String id2;
        id2 = this.f68528a.getId();
        g0.o(id2, "getId(...)");
        return id2;
    }

    @m80.k
    public final ZoneId c() {
        return this.f68528a;
    }

    @m80.k
    public final Instant d(@m80.k LocalDateTime localDateTime, @m80.k p youShallNotPass) {
        Instant h11;
        g0.p(localDateTime, "<this>");
        g0.p(youShallNotPass, "youShallNotPass");
        h11 = r.h(localDateTime, this, null, 2, null);
        return h11;
    }

    public boolean equals(@m80.l Object obj) {
        if (this != obj) {
            return (obj instanceof q) && g0.g(this.f68528a, ((q) obj).f68528a);
        }
        return true;
    }

    @m80.k
    public final LocalDateTime f(@m80.k Instant instant) {
        g0.p(instant, "<this>");
        return t2.i(instant, this);
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.f68528a.hashCode();
        return hashCode;
    }

    @m80.k
    public String toString() {
        String zoneId;
        zoneId = this.f68528a.toString();
        g0.o(zoneId, "toString(...)");
        return zoneId;
    }
}
