package io.ktor.util.date;

import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class Month {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ Month[] $VALUES;

    @k
    public static final a Companion;

    @k
    private final String value;
    public static final Month JANUARY = new Month("JANUARY", 0, "Jan");
    public static final Month FEBRUARY = new Month("FEBRUARY", 1, "Feb");
    public static final Month MARCH = new Month("MARCH", 2, "Mar");
    public static final Month APRIL = new Month("APRIL", 3, "Apr");
    public static final Month MAY = new Month("MAY", 4, "May");
    public static final Month JUNE = new Month("JUNE", 5, "Jun");
    public static final Month JULY = new Month("JULY", 6, "Jul");
    public static final Month AUGUST = new Month("AUGUST", 7, "Aug");
    public static final Month SEPTEMBER = new Month("SEPTEMBER", 8, "Sep");
    public static final Month OCTOBER = new Month("OCTOBER", 9, "Oct");
    public static final Month NOVEMBER = new Month("NOVEMBER", 10, "Nov");
    public static final Month DECEMBER = new Month("DECEMBER", 11, "Dec");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Date.kt\nio/ktor/util/date/Month$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @k
        public final Month a(int i11) {
            return (Month) Month.getEntries().get(i11);
        }

        @k
        public final Month b(@k String value) {
            Object obj;
            g0.p(value, "value");
            Iterator<E> it = Month.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (g0.g(((Month) obj).getValue(), value)) {
                    break;
                }
            }
            Month month = (Month) obj;
            if (month != null) {
                return month;
            }
            throw new IllegalStateException(("Invalid month: " + value).toString());
        }

        public a() {
        }
    }

    private static final /* synthetic */ Month[] $values() {
        return new Month[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
    }

    static {
        Month[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private Month(String str, int i11, String str2) {
        this.value = str2;
    }

    @k
    public static m00.a<Month> getEntries() {
        return $ENTRIES;
    }

    public static Month valueOf(String str) {
        return (Month) Enum.valueOf(Month.class, str);
    }

    public static Month[] values() {
        return (Month[]) $VALUES.clone();
    }

    @k
    public final String getValue() {
        return this.value;
    }
}
