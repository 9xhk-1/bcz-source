package r40;

import java.time.DateTimeException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.UtcOffset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nUtcOffsetJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtcOffsetJvm.kt\nkotlinx/datetime/UtcOffsetJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
/* loaded from: classes8.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f83066a = yz.e0.c(new x00.a() { // from class: r40.n3
        @Override // x00.a
        public final Object invoke() {
            DateTimeFormatter o11;
            o11 = r3.o();
            return o11;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f83067b = yz.e0.c(new x00.a() { // from class: r40.o3
        @Override // x00.a
        public final Object invoke() {
            DateTimeFormatter n11;
            n11 = r3.n();
            return n11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f83068c = yz.e0.c(new x00.a() { // from class: r40.p3
        @Override // x00.a
        public final Object invoke() {
            DateTimeFormatter j11;
            j11 = r3.j();
            return j11;
        }
    });

    @m80.k
    public static final UtcOffset d(@m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3) {
        ZoneOffset ofTotalSeconds;
        ZoneOffset ofHoursMinutesSeconds;
        ZoneOffset ofHoursMinutesSeconds2;
        try {
            if (num != null) {
                ofHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(num.intValue(), num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0);
                kotlin.jvm.internal.g0.o(ofHoursMinutesSeconds2, "ofHoursMinutesSeconds(...)");
                return new UtcOffset(ofHoursMinutesSeconds2);
            }
            if (num2 != null) {
                ofHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(num2.intValue() / 60, num2.intValue() % 60, num3 != null ? num3.intValue() : 0);
                kotlin.jvm.internal.g0.o(ofHoursMinutesSeconds, "ofHoursMinutesSeconds(...)");
                return new UtcOffset(ofHoursMinutesSeconds);
            }
            ofTotalSeconds = ZoneOffset.ofTotalSeconds(num3 != null ? num3.intValue() : 0);
            kotlin.jvm.internal.g0.o(ofTotalSeconds, "ofTotalSeconds(...)");
            return new UtcOffset(ofTotalSeconds);
        } catch (DateTimeException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public static /* synthetic */ UtcOffset e(Integer num, Integer num2, Integer num3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            num2 = null;
        }
        if ((i11 & 4) != 0) {
            num3 = null;
        }
        return d(num, num2, num3);
    }

    public static final DateTimeFormatter j() {
        DateTimeFormatterBuilder parseCaseInsensitive;
        DateTimeFormatterBuilder appendOffset;
        DateTimeFormatter formatter;
        parseCaseInsensitive = m3.a().parseCaseInsensitive();
        appendOffset = parseCaseInsensitive.appendOffset("+HHMM", "+0000");
        formatter = appendOffset.toFormatter();
        return formatter;
    }

    public static final DateTimeFormatter k() {
        return g3.a(f83068c.getValue());
    }

    public static final DateTimeFormatter l() {
        return g3.a(f83067b.getValue());
    }

    public static final DateTimeFormatter m() {
        return g3.a(f83066a.getValue());
    }

    public static final DateTimeFormatter n() {
        DateTimeFormatterBuilder parseCaseInsensitive;
        DateTimeFormatterBuilder appendOffset;
        DateTimeFormatter formatter;
        parseCaseInsensitive = m3.a().parseCaseInsensitive();
        appendOffset = parseCaseInsensitive.appendOffset("+HHmmss", "Z");
        formatter = appendOffset.toFormatter();
        return formatter;
    }

    public static final DateTimeFormatter o() {
        DateTimeFormatterBuilder parseCaseInsensitive;
        DateTimeFormatterBuilder appendOffsetId;
        DateTimeFormatter formatter;
        parseCaseInsensitive = m3.a().parseCaseInsensitive();
        appendOffsetId = parseCaseInsensitive.appendOffsetId();
        formatter = appendOffsetId.toFormatter();
        return formatter;
    }

    public static final UtcOffset p(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Object parse;
        try {
            parse = dateTimeFormatter.parse(charSequence, (TemporalQuery<Object>) new TemporalQuery() { // from class: r40.q3
                @Override // java.time.temporal.TemporalQuery
                public final Object queryFrom(TemporalAccessor temporalAccessor) {
                    ZoneOffset from;
                    from = ZoneOffset.from(temporalAccessor);
                    return from;
                }
            });
            return new UtcOffset(r2.a(parse));
        } catch (DateTimeException e11) {
            throw new DateTimeFormatException(e11);
        }
    }
}
