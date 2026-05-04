package q40;

import c40.a1;
import c40.a2;
import c40.r0;
import c40.v3;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import kotlinx.coroutines.flow.i;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {
    public static final long a(Duration duration) {
        Duration duration2;
        int compareTo;
        ChronoUnit chronoUnit;
        Duration duration3;
        int compareTo2;
        long seconds;
        long millis;
        long seconds2;
        int nano;
        duration2 = Duration.ZERO;
        compareTo = duration.compareTo(duration2);
        if (compareTo <= 0) {
            return 0L;
        }
        chronoUnit = ChronoUnit.MILLIS;
        duration3 = chronoUnit.getDuration();
        compareTo2 = duration.compareTo(duration3);
        if (compareTo2 <= 0) {
            return 1L;
        }
        seconds = duration.getSeconds();
        if (seconds >= 9223372036854775L) {
            seconds2 = duration.getSeconds();
            if (seconds2 != 9223372036854775L) {
                return Long.MAX_VALUE;
            }
            nano = duration.getNano();
            if (nano >= 807000000) {
                return Long.MAX_VALUE;
            }
        }
        millis = duration.toMillis();
        return millis;
    }

    @a2
    @k
    public static final <T> i<T> b(@k i<? extends T> iVar, @k Duration duration) {
        return kotlinx.coroutines.flow.k.c0(iVar, a(duration));
    }

    @l
    public static final Object c(@k Duration duration, @k j00.c<? super g2> cVar) {
        Object b11 = a1.b(a(duration), cVar);
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    public static final <R> void d(@k k40.d<? super R> dVar, @k Duration duration, @k x00.l<? super j00.c<? super R>, ? extends Object> lVar) {
        k40.c.a(dVar, a(duration), lVar);
    }

    @a2
    @k
    public static final <T> i<T> e(@k i<? extends T> iVar, @k Duration duration) {
        return kotlinx.coroutines.flow.k.D1(iVar, a(duration));
    }

    @l
    public static final <T> Object f(@k Duration duration, @k p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, @k j00.c<? super T> cVar) {
        return v3.c(a(duration), pVar, cVar);
    }

    @l
    public static final <T> Object g(@k Duration duration, @k p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, @k j00.c<? super T> cVar) {
        return v3.e(a(duration), pVar, cVar);
    }
}
