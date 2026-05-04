package kotlin.time;

import androidx.media3.common.C;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.DeprecationLevel;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.time.e;
import yz.w0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "2.1")
@u0({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/Instant\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Instant.kt\nkotlin/time/InstantKt\n+ 4 Duration.kt\nkotlin/time/Duration\n*L\n1#1,864:1\n1#2:865\n803#3,14:866\n786#3,6:880\n803#3,14:886\n786#3,6:900\n786#3,6:907\n548#4:906\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlin/time/Instant\n*L\n150#1:866,14\n153#1:880,6\n161#1:886,14\n164#1:900,6\n188#1:907,6\n184#1:906\n*E\n"})
@w30.h
/* loaded from: classes8.dex */
public final class Instant implements Comparable<Instant>, Serializable {
    private final long epochSeconds;
    private final int nanosecondsOfSecond;

    @m80.k
    public static final a Companion = new a(null);

    @m80.k
    private static final Instant MIN = new Instant(g.f67768c, 0);

    @m80.k
    private static final Instant MAX = new Instant(g.f67769d, 999999999);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/Instant$Companion\n+ 2 Instant.kt\nkotlin/time/InstantKt\n*L\n1#1,864:1\n786#2,6:865\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlin/time/Instant$Companion\n*L\n312#1:865,6\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ Instant d(a aVar, long j11, long j12, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j12 = 0;
            }
            return aVar.c(j11, j12);
        }

        @m80.k
        public final Instant a(long j11) {
            long j12 = j11 / 1000;
            if ((j11 ^ 1000) < 0 && j12 * 1000 != j11) {
                j12--;
            }
            long j13 = j11 % 1000;
            return j12 < g.f67768c ? h() : j12 > g.f67769d ? g() : b(j12, (int) ((j13 + (1000 & (((j13 ^ 1000) & ((-j13) | j13)) >> 63))) * 1000000));
        }

        @m80.k
        public final Instant b(long j11, int i11) {
            return c(j11, i11);
        }

        @m80.k
        public final Instant c(long j11, long j12) {
            long j13 = j12 / C.NANOS_PER_SECOND;
            if ((j12 ^ C.NANOS_PER_SECOND) < 0 && j13 * C.NANOS_PER_SECOND != j12) {
                j13--;
            }
            long j14 = j11 + j13;
            if ((j11 ^ j14) < 0 && (j13 ^ j11) >= 0) {
                return j11 > 0 ? Instant.Companion.g() : Instant.Companion.h();
            }
            if (j14 < g.f67768c) {
                return h();
            }
            if (j14 > g.f67769d) {
                return g();
            }
            long j15 = j12 % C.NANOS_PER_SECOND;
            return new Instant(j14, (int) (j15 + ((((j15 ^ C.NANOS_PER_SECOND) & ((-j15) | j15)) >> 63) & C.NANOS_PER_SECOND)));
        }

        @m80.k
        public final Instant e() {
            return b(3093527980800L, 0);
        }

        @m80.k
        public final Instant f() {
            return b(-3217862419201L, 999999999);
        }

        @m80.k
        public final Instant g() {
            return Instant.MAX;
        }

        @m80.k
        public final Instant h() {
            return Instant.MIN;
        }

        @yz.n(level = DeprecationLevel.ERROR, message = "Use Clock.System.now() instead", replaceWith = @w0(expression = "Clock.System.now()", imports = {"kotlin.time.Clock"}))
        @m80.k
        public final Instant i() {
            throw new NotImplementedError(null, 1, null);
        }

        @m80.k
        public final Instant j(@m80.k CharSequence input) {
            h r11;
            g0.p(input, "input");
            r11 = g.r(input);
            return r11.toInstant();
        }

        @m80.l
        @y0(version = "2.2")
        public final Instant k(@m80.k CharSequence input) {
            h r11;
            g0.p(input, "input");
            r11 = g.r(input);
            return r11.a();
        }

        public a() {
        }
    }

    public Instant(long j11, int i11) {
        this.epochSeconds = j11;
        this.nanosecondsOfSecond = i11;
        if (g.f67768c > j11 || j11 >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return w30.j.b(this);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.epochSeconds == instant.epochSeconds && this.nanosecondsOfSecond == instant.nanosecondsOfSecond;
    }

    public final long getEpochSeconds() {
        return this.epochSeconds;
    }

    public final int getNanosecondsOfSecond() {
        return this.nanosecondsOfSecond;
    }

    public int hashCode() {
        return Long.hashCode(this.epochSeconds) + (this.nanosecondsOfSecond * 51);
    }

    @m80.k
    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public final Instant m6319minusLRDsOJo(long j11) {
        return m6321plusLRDsOJo(e.j0(j11));
    }

    /* renamed from: minus-UwyO8pc, reason: not valid java name */
    public final long m6320minusUwyO8pc(@m80.k Instant other) {
        g0.p(other, "other");
        e.a aVar = e.f67757b;
        return e.T(f.x(this.epochSeconds - other.epochSeconds, DurationUnit.SECONDS), f.w(this.nanosecondsOfSecond - other.nanosecondsOfSecond, DurationUnit.NANOSECONDS));
    }

    @m80.k
    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public final Instant m6321plusLRDsOJo(long j11) {
        long A = e.A(j11);
        int E = e.E(j11);
        if (A == 0 && E == 0) {
            return this;
        }
        long j12 = this.epochSeconds;
        long j13 = j12 + A;
        if ((j12 ^ j13) >= 0 || (A ^ j12) < 0) {
            return Companion.b(j13, this.nanosecondsOfSecond + E);
        }
        return e.R(j11) ? MAX : MIN;
    }

    public final long toEpochMilliseconds() {
        long j11 = this.epochSeconds;
        long j12 = 1000;
        if (j11 >= 0) {
            if (j11 != 1) {
                if (j11 != 0) {
                    long j13 = j11 * 1000;
                    if (j13 / 1000 != j11) {
                        return Long.MAX_VALUE;
                    }
                    j12 = j13;
                } else {
                    j12 = 0;
                }
            }
            long j14 = this.nanosecondsOfSecond / 1000000;
            long j15 = j12 + j14;
            if ((j12 ^ j15) >= 0 || (j14 ^ j12) < 0) {
                return j15;
            }
            return Long.MAX_VALUE;
        }
        long j16 = j11 + 1;
        if (j16 != 1) {
            if (j16 != 0) {
                long j17 = j16 * 1000;
                if (j17 / 1000 != j16) {
                    return Long.MIN_VALUE;
                }
                j12 = j17;
            } else {
                j12 = 0;
            }
        }
        long j18 = (this.nanosecondsOfSecond / 1000000) - 1000;
        long j19 = j12 + j18;
        if ((j12 ^ j19) >= 0 || (j18 ^ j12) < 0) {
            return j19;
        }
        return Long.MIN_VALUE;
    }

    @m80.k
    public String toString() {
        String j11;
        j11 = g.j(this);
        return j11;
    }

    @Override // java.lang.Comparable
    public int compareTo(@m80.k Instant other) {
        g0.p(other, "other");
        int u11 = g0.u(this.epochSeconds, other.epochSeconds);
        return u11 != 0 ? u11 : g0.t(this.nanosecondsOfSecond, other.nanosecondsOfSecond);
    }
}
