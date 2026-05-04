package kotlinx.datetime;

import f50.a0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeParseException;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import r40.j2;
import r40.q1;
import s40.c1;
import s40.e0;
import s40.g0;
import s40.h1;
import x40.g0;
import yz.g2;
import yz.v0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0(with = g0.class)
/* loaded from: classes8.dex */
public final class LocalDateTime implements Comparable<LocalDateTime>, Serializable {

    @m80.k
    public static final a Companion = new a(null);

    @m80.k
    private static final LocalDateTime MAX;

    @m80.k
    private static final LocalDateTime MIN;
    private static final long serialVersionUID = 0;

    @m80.k
    private final java.time.LocalDateTime value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLocalDateTimeJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalDateTimeJvm.kt\nkotlinx/datetime/LocalDateTime$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LocalDateTime f(a aVar, CharSequence charSequence, e0 e0Var, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                e0Var = q1.h();
            }
            return aVar.d(charSequence, e0Var);
        }

        @m80.k
        public final e0<LocalDateTime> a(@m80.k x00.l<? super g0.b, g2> builder) {
            kotlin.jvm.internal.g0.p(builder, "builder");
            return c1.f87583c.a(builder);
        }

        @m80.k
        public final LocalDateTime b() {
            return LocalDateTime.MAX;
        }

        @m80.k
        public final LocalDateTime c() {
            return LocalDateTime.MIN;
        }

        @m80.k
        public final LocalDateTime d(@m80.k CharSequence input, @m80.k e0<LocalDateTime> format) {
            java.time.LocalDateTime parse;
            kotlin.jvm.internal.g0.p(input, "input");
            kotlin.jvm.internal.g0.p(format, "format");
            if (format != b.f68485a.a()) {
                return format.d(input);
            }
            try {
                parse = java.time.LocalDateTime.parse(t40.h.f(input.toString()));
                return new LocalDateTime(parse);
            } catch (DateTimeParseException e11) {
                throw new DateTimeFormatException(e11);
            }
        }

        @yz.n(level = DeprecationLevel.HIDDEN, message = "This overload is only kept for binary compatibility")
        public final /* synthetic */ LocalDateTime e(String isoString) {
            kotlin.jvm.internal.g0.p(isoString, "isoString");
            return f(this, isoString, null, 2, null);
        }

        @m80.k
        public final f50.i<LocalDateTime> serializer() {
            return x40.g0.f97431a;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f68485a = new b();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final e0<LocalDateTime> f68486b = h1.j();

        @m80.k
        public final e0<LocalDateTime> a() {
            return f68486b;
        }
    }

    static {
        java.time.LocalDateTime MIN2;
        java.time.LocalDateTime MAX2;
        MIN2 = java.time.LocalDateTime.MIN;
        kotlin.jvm.internal.g0.o(MIN2, "MIN");
        MIN = new LocalDateTime(MIN2);
        MAX2 = java.time.LocalDateTime.MAX;
        kotlin.jvm.internal.g0.o(MAX2, "MAX");
        MAX = new LocalDateTime(MAX2);
    }

    public LocalDateTime(@m80.k java.time.LocalDateTime value) {
        kotlin.jvm.internal.g0.p(value, "value");
        this.value = value;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("kotlinx.datetime.LocalDateTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new Ser(4, this);
    }

    public boolean equals(@m80.l Object obj) {
        if (this != obj) {
            return (obj instanceof LocalDateTime) && kotlin.jvm.internal.g0.g(this.value, ((LocalDateTime) obj).value);
        }
        return true;
    }

    @m80.k
    public final LocalDate getDate() {
        java.time.LocalDate localDate;
        localDate = this.value.toLocalDate();
        kotlin.jvm.internal.g0.o(localDate, "toLocalDate(...)");
        return new LocalDate(localDate);
    }

    public final int getDay() {
        int dayOfMonth;
        dayOfMonth = this.value.getDayOfMonth();
        return dayOfMonth;
    }

    public final int getDayOfMonth() {
        int dayOfMonth;
        dayOfMonth = this.value.getDayOfMonth();
        return dayOfMonth;
    }

    @m80.k
    /* renamed from: getDayOfWeek, reason: collision with other method in class */
    public final DayOfWeek m6326getDayOfWeek() {
        java.time.DayOfWeek dayOfWeek;
        dayOfWeek = this.value.getDayOfWeek();
        kotlin.jvm.internal.g0.o(dayOfWeek, "getDayOfWeek(...)");
        return kotlinx.datetime.a.l(dayOfWeek);
    }

    public final int getDayOfYear() {
        int dayOfYear;
        dayOfYear = this.value.getDayOfYear();
        return dayOfYear;
    }

    public final int getHour() {
        int hour;
        hour = this.value.getHour();
        return hour;
    }

    public final int getMinute() {
        int minute;
        minute = this.value.getMinute();
        return minute;
    }

    @m80.k
    /* renamed from: getMonth, reason: collision with other method in class */
    public final Month m6327getMonth() {
        java.time.Month month;
        month = this.value.getMonth();
        kotlin.jvm.internal.g0.o(month, "getMonth(...)");
        return kotlinx.datetime.a.q(month);
    }

    public final int getMonthNumber() {
        int monthValue;
        monthValue = this.value.getMonthValue();
        return monthValue;
    }

    public final int getNanosecond() {
        int nano;
        nano = this.value.getNano();
        return nano;
    }

    public final int getSecond() {
        int second;
        second = this.value.getSecond();
        return second;
    }

    @m80.k
    public final LocalTime getTime() {
        java.time.LocalTime localTime;
        localTime = this.value.toLocalTime();
        kotlin.jvm.internal.g0.o(localTime, "toLocalTime(...)");
        return new LocalTime(localTime);
    }

    @m80.k
    public final java.time.LocalDateTime getValue$kotlinx_datetime() {
        return this.value;
    }

    public final int getYear() {
        int year;
        year = this.value.getYear();
        return year;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.value.hashCode();
        return hashCode;
    }

    @m80.k
    public String toString() {
        String localDateTime;
        localDateTime = this.value.toString();
        kotlin.jvm.internal.g0.o(localDateTime, "toString(...)");
        return localDateTime;
    }

    @Override // java.lang.Comparable
    public int compareTo(@m80.k LocalDateTime other) {
        int compareTo;
        kotlin.jvm.internal.g0.p(other, "other");
        compareTo = this.value.compareTo((ChronoLocalDateTime<?>) r40.c1.a(other.value));
        return compareTo;
    }

    @v0
    @m80.k
    public final java.time.DayOfWeek getDayOfWeek() {
        java.time.DayOfWeek dayOfWeek;
        dayOfWeek = this.value.getDayOfWeek();
        kotlin.jvm.internal.g0.o(dayOfWeek, "getDayOfWeek(...)");
        return dayOfWeek;
    }

    @v0
    @m80.k
    public final java.time.Month getMonth() {
        java.time.Month month;
        month = this.value.getMonth();
        kotlin.jvm.internal.g0.o(month, "getMonth(...)");
        return month;
    }

    public /* synthetic */ LocalDateTime(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, kotlin.jvm.internal.v vVar) {
        this(i11, i12, i13, i14, i15, (i18 & 32) != 0 ? 0 : i16, (i18 & 64) != 0 ? 0 : i17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LocalDateTime(int r2, int r3, int r4, int r5, int r6, int r7, int r8) {
        /*
            r1 = this;
            java.time.LocalDateTime r2 = r40.b1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.time.DateTimeException -> Lb
            kotlin.jvm.internal.g0.m(r2)
            r1.<init>(r2)
            return
        Lb:
            r0 = move-exception
            r2 = r0
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.datetime.LocalDateTime.<init>(int, int, int, int, int, int, int):void");
    }

    public /* synthetic */ LocalDateTime(int i11, Month month, int i12, int i13, int i14, int i15, int i16, int i17, kotlin.jvm.internal.v vVar) {
        this(i11, month, i12, i13, i14, (i17 & 32) != 0 ? 0 : i15, (i17 & 64) != 0 ? 0 : i16);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalDateTime(int i11, @m80.k Month month, int i12, int i13, int i14, int i15, int i16) {
        this(i11, j2.d(month), i12, i13, i14, i15, i16);
        kotlin.jvm.internal.g0.p(month, "month");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LocalDateTime(@m80.k kotlinx.datetime.LocalDate r2, @m80.k kotlinx.datetime.LocalTime r3) {
        /*
            r1 = this;
            java.lang.String r0 = "date"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "time"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.time.LocalDate r2 = r2.getValue$kotlinx_datetime()
            java.time.LocalTime r3 = r3.getValue$kotlinx_datetime()
            java.time.LocalDateTime r2 = r40.o1.a(r2, r3)
            java.lang.String r3 = "of(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.datetime.LocalDateTime.<init>(kotlinx.datetime.LocalDate, kotlinx.datetime.LocalTime):void");
    }

    public /* synthetic */ LocalDateTime(int i11, java.time.Month month, int i12, int i13, int i14, int i15, int i16, int i17, kotlin.jvm.internal.v vVar) {
        this(i11, month, i12, i13, i14, (i17 & 32) != 0 ? 0 : i15, (i17 & 64) != 0 ? 0 : i16);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yz.n(message = "Use kotlinx.datetime.Month", replaceWith = @w0(expression = "LocalDateTime(year, month.toKotlinMonth(), dayOfMonth, hour, minute, second, nanosecond)", imports = {}))
    public LocalDateTime(int i11, @m80.k java.time.Month month, int i12, int i13, int i14, int i15, int i16) {
        this(i11, kotlinx.datetime.a.q(month), i12, i13, i14, i15, i16);
        kotlin.jvm.internal.g0.p(month, "month");
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Use the 'day' property instead", replaceWith = @w0(expression = "this.day", imports = {}))
    public static /* synthetic */ void getDayOfMonth$annotations() {
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Use the 'month' property instead", replaceWith = @w0(expression = "this.month.number", imports = {}))
    public static /* synthetic */ void getMonthNumber$annotations() {
    }
}
