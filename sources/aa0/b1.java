package aa0;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b1 implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<Class<?>, Function<String, ?>> f2481a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(ku.f.a(), new Function() { // from class: aa0.r0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Duration parse;
                parse = Duration.parse((String) obj);
                return parse;
            }
        });
        hashMap.put(b0.a(), new Function() { // from class: aa0.z0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Instant parse;
                parse = Instant.parse((String) obj);
                return parse;
            }
        });
        hashMap.put(e90.s.a(), new Function() { // from class: aa0.a1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                LocalDate parse;
                parse = LocalDate.parse((String) obj);
                return parse;
            }
        });
        hashMap.put(e90.u.a(), new Function() { // from class: aa0.n0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                LocalDateTime parse;
                parse = LocalDateTime.parse((String) obj);
                return parse;
            }
        });
        hashMap.put(e90.w.a(), new Function() { // from class: aa0.o0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                LocalTime parse;
                parse = LocalTime.parse((String) obj);
                return parse;
            }
        });
        hashMap.put(z.a(), new Function() { // from class: aa0.p0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                MonthDay parse;
                parse = MonthDay.parse((String) obj);
                return parse;
            }
        });
        hashMap.put(e90.y.a(), new Function() { // from class: aa0.q0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                OffsetDateTime parse;
                parse = OffsetDateTime.parse((String) obj);
                return parse;
            }
        });
        hashMap.put(e90.a0.a(), new Function() { // from class: aa0.s0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                OffsetTime parse;
                parse = OffsetTime.parse((String) obj);
                return parse;
            }
        });
        hashMap.put(h0.a(), new Function() { // from class: aa0.t0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Period parse;
                parse = Period.parse((String) obj);
                return parse;
            }
        });
        hashMap.put(e90.g.a(), new Function() { // from class: aa0.u0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Year parse;
                parse = Year.parse((String) obj);
                return parse;
            }
        });
        hashMap.put(e90.i.a(), new Function() { // from class: aa0.v0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                YearMonth parse;
                parse = YearMonth.parse((String) obj);
                return parse;
            }
        });
        hashMap.put(e90.l.a(), new Function() { // from class: aa0.w0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ZonedDateTime parse;
                parse = ZonedDateTime.parse((String) obj);
                return parse;
            }
        });
        hashMap.put(m0.a(), new Function() { // from class: aa0.x0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ZoneId of2;
                of2 = ZoneId.of((String) obj);
                return of2;
            }
        });
        hashMap.put(a0.a(), new Function() { // from class: aa0.y0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ZoneOffset of2;
                of2 = ZoneOffset.of((String) obj);
                return of2;
            }
        });
        f2481a = Collections.unmodifiableMap(hashMap);
    }

    @Override // aa0.l1
    public boolean a(Class<?> targetType) {
        return f2481a.containsKey(targetType);
    }

    @Override // aa0.l1
    public Object c(String source, Class<?> targetType) throws Exception {
        return f2481a.get(targetType).apply(source);
    }
}
