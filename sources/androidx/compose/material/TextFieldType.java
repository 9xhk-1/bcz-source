package androidx.compose.material;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TextFieldType[] $VALUES;
    public static final TextFieldType Filled = new TextFieldType("Filled", 0);
    public static final TextFieldType Outlined = new TextFieldType("Outlined", 1);

    private static final /* synthetic */ TextFieldType[] $values() {
        return new TextFieldType[]{Filled, Outlined};
    }

    static {
        TextFieldType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private TextFieldType(String str, int i11) {
    }

    @k
    public static a<TextFieldType> getEntries() {
        return $ENTRIES;
    }

    public static TextFieldType valueOf(String str) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, str);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) $VALUES.clone();
    }
}
