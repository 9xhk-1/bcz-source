package kotlinx.coroutines.channels;

import c40.a3;
import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a3
/* loaded from: classes8.dex */
public final class TickerMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TickerMode[] $VALUES;
    public static final TickerMode FIXED_PERIOD = new TickerMode("FIXED_PERIOD", 0);
    public static final TickerMode FIXED_DELAY = new TickerMode("FIXED_DELAY", 1);

    private static final /* synthetic */ TickerMode[] $values() {
        return new TickerMode[]{FIXED_PERIOD, FIXED_DELAY};
    }

    static {
        TickerMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private TickerMode(String str, int i11) {
    }

    @k
    public static a<TickerMode> getEntries() {
        return $ENTRIES;
    }

    public static TickerMode valueOf(String str) {
        return (TickerMode) Enum.valueOf(TickerMode.class, str);
    }

    public static TickerMode[] values() {
        return (TickerMode[]) $VALUES.clone();
    }
}
