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
public final class WeekDay {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ WeekDay[] $VALUES;

    @k
    public static final a Companion;

    @k
    private final String value;
    public static final WeekDay MONDAY = new WeekDay("MONDAY", 0, "Mon");
    public static final WeekDay TUESDAY = new WeekDay("TUESDAY", 1, "Tue");
    public static final WeekDay WEDNESDAY = new WeekDay("WEDNESDAY", 2, "Wed");
    public static final WeekDay THURSDAY = new WeekDay("THURSDAY", 3, "Thu");
    public static final WeekDay FRIDAY = new WeekDay("FRIDAY", 4, "Fri");
    public static final WeekDay SATURDAY = new WeekDay("SATURDAY", 5, "Sat");
    public static final WeekDay SUNDAY = new WeekDay("SUNDAY", 6, "Sun");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Date.kt\nio/ktor/util/date/WeekDay$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @k
        public final WeekDay a(int i11) {
            return (WeekDay) WeekDay.getEntries().get(i11);
        }

        @k
        public final WeekDay b(@k String value) {
            Object obj;
            g0.p(value, "value");
            Iterator<E> it = WeekDay.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (g0.g(((WeekDay) obj).getValue(), value)) {
                    break;
                }
            }
            WeekDay weekDay = (WeekDay) obj;
            if (weekDay != null) {
                return weekDay;
            }
            throw new IllegalStateException(("Invalid day of week: " + value).toString());
        }

        public a() {
        }
    }

    private static final /* synthetic */ WeekDay[] $values() {
        return new WeekDay[]{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    }

    static {
        WeekDay[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private WeekDay(String str, int i11, String str2) {
        this.value = str2;
    }

    @k
    public static m00.a<WeekDay> getEntries() {
        return $ENTRIES;
    }

    public static WeekDay valueOf(String str) {
        return (WeekDay) Enum.valueOf(WeekDay.class, str);
    }

    public static WeekDay[] values() {
        return (WeekDay[]) $VALUES.clone();
    }

    @k
    public final String getValue() {
        return this.value;
    }
}
