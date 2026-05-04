package e90;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.jupiter.params.converter.ArgumentConversionException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class n0 extends a<o0> {

    /* renamed from: b, reason: collision with root package name */
    public static final Map<Class<?>, TemporalQuery<?>> f49611b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(f.a(), new TemporalQuery() { // from class: e90.g0
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                ChronoLocalDate from;
                from = ChronoLocalDate.from(temporalAccessor);
                return from;
            }
        });
        linkedHashMap.put(n.a(), new TemporalQuery() { // from class: e90.l0
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                ChronoLocalDateTime from;
                from = ChronoLocalDateTime.from(temporalAccessor);
                return from;
            }
        });
        linkedHashMap.put(p.a(), new TemporalQuery() { // from class: e90.m0
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                ChronoZonedDateTime from;
                from = ChronoZonedDateTime.from(temporalAccessor);
                return from;
            }
        });
        linkedHashMap.put(s.a(), new TemporalQuery() { // from class: e90.c0
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                LocalDate from;
                from = LocalDate.from(temporalAccessor);
                return from;
            }
        });
        linkedHashMap.put(u.a(), new TemporalQuery() { // from class: e90.d0
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                LocalDateTime from;
                from = LocalDateTime.from(temporalAccessor);
                return from;
            }
        });
        linkedHashMap.put(w.a(), new TemporalQuery() { // from class: e90.e0
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                LocalTime from;
                from = LocalTime.from(temporalAccessor);
                return from;
            }
        });
        linkedHashMap.put(y.a(), new TemporalQuery() { // from class: e90.f0
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                OffsetDateTime from;
                from = OffsetDateTime.from(temporalAccessor);
                return from;
            }
        });
        linkedHashMap.put(a0.a(), new TemporalQuery() { // from class: e90.h0
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                OffsetTime from;
                from = OffsetTime.from(temporalAccessor);
                return from;
            }
        });
        linkedHashMap.put(g.a(), new TemporalQuery() { // from class: e90.i0
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                Year from;
                from = Year.from(temporalAccessor);
                return from;
            }
        });
        linkedHashMap.put(i.a(), new TemporalQuery() { // from class: e90.j0
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                YearMonth from;
                from = YearMonth.from(temporalAccessor);
                return from;
            }
        });
        linkedHashMap.put(l.a(), new TemporalQuery() { // from class: e90.k0
            @Override // java.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                ZonedDateTime from;
                from = ZonedDateTime.from(temporalAccessor);
                return from;
            }
        });
        f49611b = Collections.unmodifiableMap(linkedHashMap);
    }

    @Override // e90.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(Object input, Class<?> targetClass, o0 annotation) {
        DateTimeFormatter ofPattern;
        Object parse;
        if (input == null) {
            throw new ArgumentConversionException("Cannot convert null to " + targetClass.getName());
        }
        TemporalQuery a11 = t.a(f49611b.get(targetClass));
        if (a11 != null) {
            ofPattern = DateTimeFormatter.ofPattern(annotation.value());
            parse = ofPattern.parse(input.toString(), (TemporalQuery<Object>) a11);
            return parse;
        }
        throw new ArgumentConversionException("Cannot convert to " + targetClass.getName() + ": " + input);
    }
}
