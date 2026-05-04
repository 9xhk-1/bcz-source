package kotlinx.datetime.format;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class AmPmMarker {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AmPmMarker[] $VALUES;
    public static final AmPmMarker AM = new AmPmMarker("AM", 0);
    public static final AmPmMarker PM = new AmPmMarker("PM", 1);

    private static final /* synthetic */ AmPmMarker[] $values() {
        return new AmPmMarker[]{AM, PM};
    }

    static {
        AmPmMarker[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private AmPmMarker(String str, int i11) {
    }

    @k
    public static a<AmPmMarker> getEntries() {
        return $ENTRIES;
    }

    public static AmPmMarker valueOf(String str) {
        return (AmPmMarker) Enum.valueOf(AmPmMarker.class, str);
    }

    public static AmPmMarker[] values() {
        return (AmPmMarker[]) $VALUES.clone();
    }
}
