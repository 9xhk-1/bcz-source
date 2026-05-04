package a90;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.junit.jupiter.api.Timeout;
import org.junit.platform.commons.JUnitException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2402a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeUnit f2403b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2404a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f2404a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2404a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2404a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2404a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2404a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2404a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2404a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public k2(final long value, TimeUnit unit) {
        ba0.c2.f(value > 0, new Supplier() { // from class: a90.j2
            @Override // java.util.function.Supplier
            public final Object get() {
                return k2.a(value);
            }
        });
        this.f2402a = value;
        this.f2403b = (TimeUnit) ba0.c2.r(unit, "timeout unit must not be null");
    }

    public static /* synthetic */ String a(long j11) {
        return "timeout duration must be a positive number: " + j11;
    }

    public static k2 b(Timeout timeout) {
        return new k2(timeout.value(), timeout.unit());
    }

    public TimeUnit c() {
        return this.f2403b;
    }

    public long d() {
        return this.f2402a;
    }

    public final ChronoUnit e() {
        ChronoUnit chronoUnit;
        ChronoUnit chronoUnit2;
        ChronoUnit chronoUnit3;
        ChronoUnit chronoUnit4;
        ChronoUnit chronoUnit5;
        ChronoUnit chronoUnit6;
        ChronoUnit chronoUnit7;
        switch (a.f2404a[this.f2403b.ordinal()]) {
            case 1:
                chronoUnit = ChronoUnit.NANOS;
                return chronoUnit;
            case 2:
                chronoUnit2 = ChronoUnit.MICROS;
                return chronoUnit2;
            case 3:
                chronoUnit3 = ChronoUnit.MILLIS;
                return chronoUnit3;
            case 4:
                chronoUnit4 = ChronoUnit.SECONDS;
                return chronoUnit4;
            case 5:
                chronoUnit5 = ChronoUnit.MINUTES;
                return chronoUnit5;
            case 6:
                chronoUnit6 = ChronoUnit.HOURS;
                return chronoUnit6;
            case 7:
                chronoUnit7 = ChronoUnit.DAYS;
                return chronoUnit7;
            default:
                throw new JUnitException("Could not map TimeUnit " + this.f2403b + " to ChronoUnit");
        }
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 != null && getClass() == o11.getClass()) {
            k2 k2Var = (k2) o11;
            if (this.f2402a == k2Var.f2402a && this.f2403b == k2Var.f2403b) {
                return true;
            }
        }
        return false;
    }

    public Duration f() {
        Duration of2;
        of2 = Duration.of(this.f2402a, e());
        return of2;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f2402a), this.f2403b);
    }

    public String toString() {
        String lowerCase = this.f2403b.name().toLowerCase();
        if (this.f2402a == 1 && lowerCase.endsWith("s")) {
            lowerCase = lowerCase.substring(0, lowerCase.length() - 1);
        }
        return this.f2402a + " " + lowerCase;
    }
}
