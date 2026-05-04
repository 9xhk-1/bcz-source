package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class IntrinsicSize {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ IntrinsicSize[] $VALUES;
    public static final IntrinsicSize Min = new IntrinsicSize("Min", 0);
    public static final IntrinsicSize Max = new IntrinsicSize("Max", 1);

    private static final /* synthetic */ IntrinsicSize[] $values() {
        return new IntrinsicSize[]{Min, Max};
    }

    static {
        IntrinsicSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private IntrinsicSize(String str, int i11) {
    }

    @m80.k
    public static m00.a<IntrinsicSize> getEntries() {
        return $ENTRIES;
    }

    public static IntrinsicSize valueOf(String str) {
        return (IntrinsicSize) Enum.valueOf(IntrinsicSize.class, str);
    }

    public static IntrinsicSize[] values() {
        return (IntrinsicSize[]) $VALUES.clone();
    }
}
