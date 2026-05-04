package kotlinx.datetime;

import f50.a0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.format.DateTimeParseException;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import r40.h2;
import s40.e0;
import s40.g0;
import s40.i1;
import s40.o1;
import x40.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0(with = k0.class)
/* loaded from: classes8.dex */
public final class LocalTime implements Comparable<LocalTime>, Serializable {

    @m80.k
    public static final a Companion = new a(null);

    @m80.k
    private static final LocalTime MAX;

    @m80.k
    private static final LocalTime MIN;
    private static final long serialVersionUID = 0;

    @m80.k
    private final java.time.LocalTime value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLocalTimeJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalTimeJvm.kt\nkotlinx/datetime/LocalTime$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LocalTime i(a aVar, CharSequence charSequence, e0 e0Var, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                e0Var = h2.m();
            }
            return aVar.g(charSequence, e0Var);
        }

        @m80.k
        public final e0<LocalTime> a(@m80.k x00.l<? super g0.d, g2> builder) {
            kotlin.jvm.internal.g0.p(builder, "builder");
            return i1.f87685c.a(builder);
        }

        @m80.k
        public final LocalTime b(int i11) {
            java.time.LocalTime ofNanoOfDay;
            try {
                ofNanoOfDay = java.time.LocalTime.ofNanoOfDay(i11 * 1000000);
                return new LocalTime(ofNanoOfDay);
            } catch (Throwable th2) {
                throw new IllegalArgumentException(th2);
            }
        }

        @m80.k
        public final LocalTime c(long j11) {
            java.time.LocalTime ofNanoOfDay;
            try {
                ofNanoOfDay = java.time.LocalTime.ofNanoOfDay(j11);
                return new LocalTime(ofNanoOfDay);
            } catch (DateTimeException e11) {
                throw new IllegalArgumentException(e11);
            }
        }

        @m80.k
        public final LocalTime d(int i11) {
            java.time.LocalTime ofSecondOfDay;
            try {
                ofSecondOfDay = java.time.LocalTime.ofSecondOfDay(i11);
                return new LocalTime(ofSecondOfDay);
            } catch (DateTimeException e11) {
                throw new IllegalArgumentException(e11);
            }
        }

        @m80.k
        public final LocalTime e() {
            return LocalTime.MAX;
        }

        @m80.k
        public final LocalTime f() {
            return LocalTime.MIN;
        }

        @m80.k
        public final LocalTime g(@m80.k CharSequence input, @m80.k e0<LocalTime> format) {
            java.time.LocalTime parse;
            kotlin.jvm.internal.g0.p(input, "input");
            kotlin.jvm.internal.g0.p(format, "format");
            if (format != b.f68487a.a()) {
                return format.d(input);
            }
            try {
                parse = java.time.LocalTime.parse(input);
                return new LocalTime(parse);
            } catch (DateTimeParseException e11) {
                throw new DateTimeFormatException(e11);
            }
        }

        @yz.n(level = DeprecationLevel.HIDDEN, message = "This overload is only kept for binary compatibility")
        public final /* synthetic */ LocalTime h(String isoString) {
            kotlin.jvm.internal.g0.p(isoString, "isoString");
            return i(this, isoString, null, 2, null);
        }

        @m80.k
        public final f50.i<LocalTime> serializer() {
            return k0.f97444a;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f68487a = new b();

        @m80.k
        public final e0<LocalTime> a() {
            return o1.l();
        }
    }

    static {
        java.time.LocalTime MIN2;
        java.time.LocalTime MAX2;
        MIN2 = java.time.LocalTime.MIN;
        kotlin.jvm.internal.g0.o(MIN2, "MIN");
        MIN = new LocalTime(MIN2);
        MAX2 = java.time.LocalTime.MAX;
        kotlin.jvm.internal.g0.o(MAX2, "MAX");
        MAX = new LocalTime(MAX2);
    }

    public LocalTime(@m80.k java.time.LocalTime value) {
        kotlin.jvm.internal.g0.p(value, "value");
        this.value = value;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("kotlinx.datetime.LocalTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new Ser(3, this);
    }

    public boolean equals(@m80.l Object obj) {
        if (this != obj) {
            return (obj instanceof LocalTime) && kotlin.jvm.internal.g0.g(this.value, ((LocalTime) obj).value);
        }
        return true;
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
    public final java.time.LocalTime getValue$kotlinx_datetime() {
        return this.value;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.value.hashCode();
        return hashCode;
    }

    public final int toMillisecondOfDay() {
        long nanoOfDay;
        nanoOfDay = this.value.toNanoOfDay();
        return (int) (nanoOfDay / 1000000);
    }

    public final long toNanosecondOfDay() {
        long nanoOfDay;
        nanoOfDay = this.value.toNanoOfDay();
        return nanoOfDay;
    }

    public final int toSecondOfDay() {
        int secondOfDay;
        secondOfDay = this.value.toSecondOfDay();
        return secondOfDay;
    }

    @m80.k
    public String toString() {
        String localTime;
        localTime = this.value.toString();
        kotlin.jvm.internal.g0.o(localTime, "toString(...)");
        return localTime;
    }

    @Override // java.lang.Comparable
    public int compareTo(@m80.k LocalTime other) {
        int compareTo;
        kotlin.jvm.internal.g0.p(other, "other");
        compareTo = this.value.compareTo(other.value);
        return compareTo;
    }

    public /* synthetic */ LocalTime(int i11, int i12, int i13, int i14, int i15, kotlin.jvm.internal.v vVar) {
        this(i11, i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LocalTime(int r1, int r2, int r3, int r4) {
        /*
            r0 = this;
            java.time.LocalTime r1 = r40.t1.a(r1, r2, r3, r4)     // Catch: java.time.DateTimeException -> Lb
            kotlin.jvm.internal.g0.m(r1)
            r0.<init>(r1)
            return
        Lb:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.datetime.LocalTime.<init>(int, int, int, int):void");
    }
}
