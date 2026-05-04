package kotlinx.coroutines.selects;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class TrySelectDetailedResult {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TrySelectDetailedResult[] $VALUES;
    public static final TrySelectDetailedResult SUCCESSFUL = new TrySelectDetailedResult("SUCCESSFUL", 0);
    public static final TrySelectDetailedResult REREGISTER = new TrySelectDetailedResult("REREGISTER", 1);
    public static final TrySelectDetailedResult CANCELLED = new TrySelectDetailedResult("CANCELLED", 2);
    public static final TrySelectDetailedResult ALREADY_SELECTED = new TrySelectDetailedResult("ALREADY_SELECTED", 3);

    private static final /* synthetic */ TrySelectDetailedResult[] $values() {
        return new TrySelectDetailedResult[]{SUCCESSFUL, REREGISTER, CANCELLED, ALREADY_SELECTED};
    }

    static {
        TrySelectDetailedResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private TrySelectDetailedResult(String str, int i11) {
    }

    @k
    public static a<TrySelectDetailedResult> getEntries() {
        return $ENTRIES;
    }

    public static TrySelectDetailedResult valueOf(String str) {
        return (TrySelectDetailedResult) Enum.valueOf(TrySelectDetailedResult.class, str);
    }

    public static TrySelectDetailedResult[] values() {
        return (TrySelectDetailedResult[]) $VALUES.clone();
    }
}
