package androidx.compose.foundation.text.input.internal.undo;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextDeleteType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TextDeleteType[] $VALUES;
    public static final TextDeleteType Start = new TextDeleteType("Start", 0);
    public static final TextDeleteType End = new TextDeleteType("End", 1);
    public static final TextDeleteType Inner = new TextDeleteType("Inner", 2);
    public static final TextDeleteType NotByUser = new TextDeleteType("NotByUser", 3);

    private static final /* synthetic */ TextDeleteType[] $values() {
        return new TextDeleteType[]{Start, End, Inner, NotByUser};
    }

    static {
        TextDeleteType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private TextDeleteType(String str, int i11) {
    }

    @k
    public static a<TextDeleteType> getEntries() {
        return $ENTRIES;
    }

    public static TextDeleteType valueOf(String str) {
        return (TextDeleteType) Enum.valueOf(TextDeleteType.class, str);
    }

    public static TextDeleteType[] values() {
        return (TextDeleteType[]) $VALUES.clone();
    }
}
