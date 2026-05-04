package kotlinx.datetime;

import f50.a0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.format.DateTimeParseException;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import r40.j2;
import r40.p0;
import s40.b1;
import s40.e0;
import s40.g0;
import s40.w0;
import x40.b0;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0(with = b0.class)
/* loaded from: classes8.dex */
public final class LocalDate implements Comparable<LocalDate>, Serializable {

    @m80.k
    public static final a Companion = new a(null);

    @m80.k
    private static final LocalDate MAX;

    @m80.k
    private static final LocalDate MIN;
    private static final long serialVersionUID = 0;

    @m80.k
    private final java.time.LocalDate value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLocalDate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalDate.kt\nkotlinx/datetime/LocalDate$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LocalDate h(a aVar, CharSequence charSequence, e0 e0Var, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                e0Var = i.g();
            }
            return aVar.f(charSequence, e0Var);
        }

        @m80.k
        public final e0<LocalDate> a(@m80.k x00.l<? super g0.a, g2> block) {
            kotlin.jvm.internal.g0.p(block, "block");
            return w0.f87800c.a(block);
        }

        @m80.k
        public final LocalDate b(int i11) {
            return c(i11);
        }

        @m80.k
        public final LocalDate c(long j11) {
            java.time.LocalDate ofEpochDay;
            try {
                ofEpochDay = java.time.LocalDate.ofEpochDay(j11);
                kotlin.jvm.internal.g0.o(ofEpochDay, "ofEpochDay(...)");
                return new LocalDate(ofEpochDay);
            } catch (DateTimeException e11) {
                throw new IllegalArgumentException(e11);
            }
        }

        @m80.k
        public final LocalDate d() {
            return LocalDate.MAX;
        }

        @m80.k
        public final LocalDate e() {
            return LocalDate.MIN;
        }

        @m80.k
        public final LocalDate f(@m80.k CharSequence input, @m80.k e0<LocalDate> format) {
            java.time.LocalDate parse;
            kotlin.jvm.internal.g0.p(input, "input");
            kotlin.jvm.internal.g0.p(format, "format");
            if (format != b.f68483a.a()) {
                return format.d(input);
            }
            try {
                parse = java.time.LocalDate.parse(t40.h.e(input.toString()));
                return new LocalDate(parse);
            } catch (DateTimeParseException e11) {
                throw new DateTimeFormatException(e11);
            }
        }

        @yz.n(level = DeprecationLevel.HIDDEN, message = "This overload is only kept for binary compatibility")
        public final /* synthetic */ LocalDate g(String isoString) {
            kotlin.jvm.internal.g0.p(isoString, "isoString");
            return h(this, isoString, null, 2, null);
        }

        @m80.k
        public final f50.i<LocalDate> serializer() {
            return b0.f97415a;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f68483a = new b();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final e0<LocalDate> f68484b = b1.l();

        @m80.k
        public final e0<LocalDate> a() {
            return b1.k();
        }

        @m80.k
        public final e0<LocalDate> b() {
            return f68484b;
        }
    }

    static {
        java.time.LocalDate MIN2;
        java.time.LocalDate MAX2;
        MIN2 = java.time.LocalDate.MIN;
        kotlin.jvm.internal.g0.o(MIN2, "MIN");
        MIN = new LocalDate(MIN2);
        MAX2 = java.time.LocalDate.MAX;
        kotlin.jvm.internal.g0.o(MAX2, "MAX");
        MAX = new LocalDate(MAX2);
    }

    public LocalDate(@m80.k java.time.LocalDate value) {
        kotlin.jvm.internal.g0.p(value, "value");
        this.value = value;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("kotlinx.datetime.LocalDate must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new Ser(2, this);
    }

    public boolean equals(@m80.l Object obj) {
        if (this != obj) {
            return (obj instanceof LocalDate) && kotlin.jvm.internal.g0.g(this.value, ((LocalDate) obj).value);
        }
        return true;
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
    public final DayOfWeek m6323getDayOfWeek() {
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

    @m80.k
    /* renamed from: getMonth, reason: collision with other method in class */
    public final Month m6324getMonth() {
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

    @m80.k
    public final java.time.LocalDate getValue$kotlinx_datetime() {
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
    public final l rangeTo(@m80.k LocalDate that) {
        kotlin.jvm.internal.g0.p(that, "that");
        return l.f68523e.a(this, that);
    }

    @m80.k
    public final l rangeUntil(@m80.k LocalDate that) {
        kotlin.jvm.internal.g0.p(that, "that");
        return l.f68523e.b(this, that);
    }

    /* renamed from: toEpochDays, reason: collision with other method in class */
    public final long m6325toEpochDays() {
        long epochDay;
        epochDay = this.value.toEpochDay();
        return epochDay;
    }

    @m80.k
    public String toString() {
        String localDate;
        localDate = this.value.toString();
        kotlin.jvm.internal.g0.o(localDate, "toString(...)");
        return localDate;
    }

    @Override // java.lang.Comparable
    public int compareTo(@m80.k LocalDate other) {
        int compareTo;
        kotlin.jvm.internal.g0.p(other, "other");
        compareTo = this.value.compareTo(p0.a(other.value));
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

    @w00.j(name = "toEpochDays")
    @v0
    public final int toEpochDays() {
        long epochDay;
        epochDay = this.value.toEpochDay();
        return t40.f.a(epochDay);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LocalDate(int r1, int r2, int r3) {
        /*
            r0 = this;
            java.time.LocalDate r1 = r40.k0.a(r1, r2, r3)     // Catch: java.time.DateTimeException -> Lb
            kotlin.jvm.internal.g0.m(r1)
            r0.<init>(r1)
            return
        Lb:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.datetime.LocalDate.<init>(int, int, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalDate(int i11, @m80.k Month month, int i12) {
        this(i11, j2.d(month), i12);
        kotlin.jvm.internal.g0.p(month, "month");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yz.n(message = "Use kotlinx.datetime.Month", replaceWith = @yz.w0(expression = "LocalDate(year, month.toKotlinMonth(), dayOfMonth)", imports = {}))
    public LocalDate(int i11, @m80.k java.time.Month month, int i12) {
        this(i11, kotlinx.datetime.a.q(month), i12);
        kotlin.jvm.internal.g0.p(month, "month");
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Use the 'day' property instead", replaceWith = @yz.w0(expression = "this.day", imports = {}))
    public static /* synthetic */ void getDayOfMonth$annotations() {
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Use the 'month' property instead", replaceWith = @yz.w0(expression = "this.month.number", imports = {}))
    public static /* synthetic */ void getMonthNumber$annotations() {
    }
}
