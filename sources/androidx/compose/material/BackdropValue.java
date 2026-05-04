package androidx.compose.material;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class BackdropValue {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BackdropValue[] $VALUES;
    public static final BackdropValue Concealed = new BackdropValue("Concealed", 0);
    public static final BackdropValue Revealed = new BackdropValue("Revealed", 1);

    private static final /* synthetic */ BackdropValue[] $values() {
        return new BackdropValue[]{Concealed, Revealed};
    }

    static {
        BackdropValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private BackdropValue(String str, int i11) {
    }

    @k
    public static a<BackdropValue> getEntries() {
        return $ENTRIES;
    }

    public static BackdropValue valueOf(String str) {
        return (BackdropValue) Enum.valueOf(BackdropValue.class, str);
    }

    public static BackdropValue[] values() {
        return (BackdropValue[]) $VALUES.clone();
    }
}
