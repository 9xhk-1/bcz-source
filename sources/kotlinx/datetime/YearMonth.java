package kotlinx.datetime;

import f50.a0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import kotlin.jvm.internal.u0;
import s40.e0;
import s40.g0;
import s40.l3;
import s40.o3;
import x40.z0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0(with = z0.class)
/* loaded from: classes8.dex */
public final class YearMonth implements Comparable<YearMonth>, Serializable {

    @m80.k
    public static final a Companion = new a(null);
    private static final long serialVersionUID = 0;

    @m80.k
    private final java.time.YearMonth value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nYearMonthJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YearMonthJvm.kt\nkotlinx/datetime/YearMonth$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ YearMonth c(a aVar, CharSequence charSequence, e0 e0Var, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                e0Var = b.f68489a.a();
            }
            return aVar.b(charSequence, e0Var);
        }

        @m80.k
        public final e0<YearMonth> a(@m80.k x00.l<? super g0.f, g2> block) {
            kotlin.jvm.internal.g0.p(block, "block");
            return l3.f87729c.a(block);
        }

        @m80.k
        public final YearMonth b(@m80.k CharSequence input, @m80.k e0<YearMonth> format) {
            java.time.YearMonth parse;
            kotlin.jvm.internal.g0.p(input, "input");
            kotlin.jvm.internal.g0.p(format, "format");
            if (format != b.f68489a.a()) {
                return format.d(input);
            }
            try {
                parse = java.time.YearMonth.parse(t40.h.g(input.toString()));
                return new YearMonth(parse);
            } catch (DateTimeParseException e11) {
                throw new DateTimeFormatException(e11);
            }
        }

        @m80.k
        public final f50.i<YearMonth> serializer() {
            return z0.f97479a;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f68489a = new b();

        @m80.k
        public final e0<YearMonth> a() {
            return o3.g();
        }
    }

    public YearMonth(@m80.k java.time.YearMonth value) {
        kotlin.jvm.internal.g0.p(value, "value");
        this.value = value;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("kotlinx.datetime.YearMonth must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new Ser(11, this);
    }

    public boolean equals(@m80.l Object obj) {
        if (this != obj) {
            return (obj instanceof YearMonth) && kotlin.jvm.internal.g0.g(this.value, ((YearMonth) obj).value);
        }
        return true;
    }

    @m80.k
    public final l getDays() {
        return getFirstDay().rangeTo(getLastDay());
    }

    @m80.k
    public final LocalDate getFirstDay() {
        java.time.LocalDate atDay;
        atDay = this.value.atDay(1);
        kotlin.jvm.internal.g0.o(atDay, "atDay(...)");
        return new LocalDate(atDay);
    }

    @m80.k
    public final LocalDate getLastDay() {
        java.time.LocalDate atEndOfMonth;
        atEndOfMonth = this.value.atEndOfMonth();
        kotlin.jvm.internal.g0.o(atEndOfMonth, "atEndOfMonth(...)");
        return new LocalDate(atEndOfMonth);
    }

    @m80.k
    public final Month getMonth() {
        java.time.Month month;
        month = this.value.getMonth();
        kotlin.jvm.internal.g0.o(month, "getMonth(...)");
        return kotlinx.datetime.a.q(month);
    }

    public final int getMonthNumber$kotlinx_datetime() {
        int monthValue;
        monthValue = this.value.getMonthValue();
        return monthValue;
    }

    public final int getNumberOfDays() {
        int lengthOfMonth;
        lengthOfMonth = this.value.lengthOfMonth();
        return lengthOfMonth;
    }

    @m80.k
    public final java.time.YearMonth getValue$kotlinx_datetime() {
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
    public final x rangeTo(@m80.k YearMonth that) {
        kotlin.jvm.internal.g0.p(that, "that");
        return x.f68535e.a(this, that);
    }

    @m80.k
    public final x rangeUntil(@m80.k YearMonth that) {
        kotlin.jvm.internal.g0.p(that, "that");
        return x.f68535e.b(this, that);
    }

    @m80.k
    public String toString() {
        DateTimeFormatter d11;
        String format;
        d11 = t.d();
        format = d11.format(vx.i.a(this.value));
        kotlin.jvm.internal.g0.o(format, "format(...)");
        return format;
    }

    @Override // java.lang.Comparable
    public int compareTo(@m80.k YearMonth other) {
        int compareTo;
        kotlin.jvm.internal.g0.p(other, "other");
        compareTo = this.value.compareTo(other.value);
        return compareTo;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public YearMonth(int r1, int r2) {
        /*
            r0 = this;
            java.time.YearMonth r1 = mc.c.a(r1, r2)     // Catch: java.time.DateTimeException -> Lb
            kotlin.jvm.internal.g0.m(r1)
            r0.<init>(r1)
            return
        Lb:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.datetime.YearMonth.<init>(int, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public YearMonth(int r2, @m80.k kotlinx.datetime.Month r3) {
        /*
            r1 = this;
            java.lang.String r0 = "month"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.time.Month r3 = kotlinx.datetime.a.e(r3)     // Catch: java.time.DateTimeException -> L14
            java.time.YearMonth r2 = r40.v3.a(r2, r3)     // Catch: java.time.DateTimeException -> L14
            kotlin.jvm.internal.g0.m(r2)
            r1.<init>(r2)
            return
        L14:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.datetime.YearMonth.<init>(int, kotlinx.datetime.Month):void");
    }
}
