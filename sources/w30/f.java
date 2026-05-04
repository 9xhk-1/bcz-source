package w30;

import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.time.DurationUnit;
import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94775a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f94775a = iArr;
        }
    }

    @y0(version = "1.3")
    public static final double a(double d11, @m80.k DurationUnit sourceUnit, @m80.k DurationUnit targetUnit) {
        g0.p(sourceUnit, "sourceUnit");
        g0.p(targetUnit, "targetUnit");
        long convert = targetUnit.getTimeUnit$kotlin_stdlib().convert(1L, sourceUnit.getTimeUnit$kotlin_stdlib());
        return convert > 0 ? d11 * convert : d11 / sourceUnit.getTimeUnit$kotlin_stdlib().convert(1L, targetUnit.getTimeUnit$kotlin_stdlib());
    }

    @y0(version = "1.5")
    public static final long b(long j11, @m80.k DurationUnit sourceUnit, @m80.k DurationUnit targetUnit) {
        g0.p(sourceUnit, "sourceUnit");
        g0.p(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j11, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    @y0(version = "1.5")
    public static final long c(long j11, @m80.k DurationUnit sourceUnit, @m80.k DurationUnit targetUnit) {
        g0.p(sourceUnit, "sourceUnit");
        g0.p(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j11, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    @y0(version = "1.8")
    @m80.k
    @j2(markerClass = {h.class})
    public static final DurationUnit d(@m80.k TimeUnit timeUnit) {
        g0.p(timeUnit, "<this>");
        switch (a.f94775a[timeUnit.ordinal()]) {
            case 1:
                return DurationUnit.NANOSECONDS;
            case 2:
                return DurationUnit.MICROSECONDS;
            case 3:
                return DurationUnit.MILLISECONDS;
            case 4:
                return DurationUnit.SECONDS;
            case 5:
                return DurationUnit.MINUTES;
            case 6:
                return DurationUnit.HOURS;
            case 7:
                return DurationUnit.DAYS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @y0(version = "1.8")
    @m80.k
    @j2(markerClass = {h.class})
    public static TimeUnit e(@m80.k DurationUnit durationUnit) {
        g0.p(durationUnit, "<this>");
        return durationUnit.getTimeUnit$kotlin_stdlib();
    }
}
