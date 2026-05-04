package w3;

import c4.j;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.time.Instant;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.h;
import kotlinx.datetime.i;
import kotlinx.datetime.q;
import m80.k;
import r40.j2;
import r40.t2;
import s40.g0;
import u30.k0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTimeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeUtils.kt\ncom/baicizhan/app/biz/base/time/TimeUtilsKt\n+ 2 Koin.kt\norg/koin/core/Koin\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,186:1\n124#2,4:187\n142#3:191\n*S KotlinDebug\n*F\n+ 1 TimeUtils.kt\ncom/baicizhan/app/biz/base/time/TimeUtilsKt\n*L\n27#1:187,4\n27#1:191\n*E\n"})
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f94766a = 86400000;

    public static final long b(long j11) {
        return k(d(j11));
    }

    @k
    public static final LocalDate c(int i11) {
        return d(i11);
    }

    @k
    public static final LocalDate d(long j11) {
        LocalDate.a aVar = LocalDate.Companion;
        return aVar.f(String.valueOf(j11), aVar.a(new l() { // from class: w3.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 e11;
                e11 = g.e((g0.a) obj);
                return e11;
            }
        }));
    }

    public static final g2 e(g0.a Format) {
        kotlin.jvm.internal.g0.p(Format, "$this$Format");
        g0.f.P0(Format, null, 1, null);
        Padding padding = Padding.ZERO;
        Format.b(padding);
        Format.j(padding);
        return g2.f100423a;
    }

    public static final int f(int i11, int i12, int i13) {
        int i14 = (i11 + 4800) - ((14 - i12) / 12);
        return (((((i13 + (((((i12 + (r0 * 12)) - 3) * 153) + 2) / 5)) + (i14 * 365)) + (i14 / 4)) - (i14 / 100)) + (i14 / 400)) - 32045;
    }

    public static final int g(int i11, int i12) {
        LocalDate k11;
        LocalDate c11 = c(i11);
        if (i12 >= 0) {
            k11 = h.j(c11, new r40.k(0, 0, i12, 3, null));
        } else {
            k11 = i.k(c11, new r40.k(0, 0, -i12, 3, null));
        }
        return Integer.parseInt(k11.getYear() + k0.m4(String.valueOf(j2.d(k11.m6324getMonth())), 2, '0') + k0.m4(String.valueOf(k11.getDay()), 2, '0'));
    }

    public static final long h(long j11, long j12) {
        return g((int) j11, (int) j12);
    }

    public static final int i(long j11, long j12) {
        return j(j11, j12);
    }

    public static final int j(long j11, long j12) {
        long j13 = 10000;
        long j14 = 100;
        return f((int) (j12 / j13), (int) ((j12 % j13) / j14), (int) (j12 % j14)) - f((int) (j11 / j13), (int) ((j11 % j13) / j14), (int) (j11 % j14));
    }

    public static final int k(@k LocalDate target) {
        kotlin.jvm.internal.g0.p(target, "target");
        return h.b(t2.i(Instant.Companion.a(n()), q.Companion.a()).getDate(), target);
    }

    public static final long l() {
        LocalDateTime i11 = t2.i(Instant.Companion.a(n()), q.Companion.a());
        return Long.parseLong(i11.getYear() + k0.m4(String.valueOf(j2.d(i11.m6327getMonth())), 2, '0') + k0.m4(String.valueOf(i11.getDay()), 2, '0'));
    }

    @k
    public static final String m() {
        LocalDateTime i11 = t2.i(Instant.Companion.a(n()), q.Companion.a());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11.getYear());
        sb2.append('-');
        sb2.append(i11.getMonthNumber());
        sb2.append('-');
        sb2.append(i11.getDayOfMonth());
        return sb2.toString();
    }

    public static final long n() {
        return ((e) j.f7801a.a().P().h().i(o0.d(e.class), null, null)).currentTimeMillis();
    }
}
