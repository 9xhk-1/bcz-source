package kotlinx.datetime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class DayOfWeek {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ DayOfWeek[] $VALUES;
    public static final DayOfWeek MONDAY = new DayOfWeek("MONDAY", 0);
    public static final DayOfWeek TUESDAY = new DayOfWeek("TUESDAY", 1);
    public static final DayOfWeek WEDNESDAY = new DayOfWeek("WEDNESDAY", 2);
    public static final DayOfWeek THURSDAY = new DayOfWeek("THURSDAY", 3);
    public static final DayOfWeek FRIDAY = new DayOfWeek("FRIDAY", 4);
    public static final DayOfWeek SATURDAY = new DayOfWeek("SATURDAY", 5);
    public static final DayOfWeek SUNDAY = new DayOfWeek("SUNDAY", 6);

    private static final /* synthetic */ DayOfWeek[] $values() {
        return new DayOfWeek[]{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    }

    static {
        DayOfWeek[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private DayOfWeek(String str, int i11) {
    }

    @m80.k
    public static m00.a<DayOfWeek> getEntries() {
        return $ENTRIES;
    }

    public static DayOfWeek valueOf(String str) {
        return (DayOfWeek) Enum.valueOf(DayOfWeek.class, str);
    }

    public static DayOfWeek[] values() {
        return (DayOfWeek[]) $VALUES.clone();
    }
}
