package coil.size;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class Scale {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Scale[] $VALUES;
    public static final Scale FILL = new Scale("FILL", 0);
    public static final Scale FIT = new Scale("FIT", 1);

    private static final /* synthetic */ Scale[] $values() {
        return new Scale[]{FILL, FIT};
    }

    static {
        Scale[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private Scale(String str, int i11) {
    }

    @k
    public static a<Scale> getEntries() {
        return $ENTRIES;
    }

    public static Scale valueOf(String str) {
        return (Scale) Enum.valueOf(Scale.class, str);
    }

    public static Scale[] values() {
        return (Scale[]) $VALUES.clone();
    }
}
