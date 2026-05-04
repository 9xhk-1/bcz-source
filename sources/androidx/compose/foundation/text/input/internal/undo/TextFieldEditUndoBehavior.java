package androidx.compose.foundation.text.input.internal.undo;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldEditUndoBehavior {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TextFieldEditUndoBehavior[] $VALUES;
    public static final TextFieldEditUndoBehavior MergeIfPossible = new TextFieldEditUndoBehavior("MergeIfPossible", 0);
    public static final TextFieldEditUndoBehavior ClearHistory = new TextFieldEditUndoBehavior("ClearHistory", 1);
    public static final TextFieldEditUndoBehavior NeverMerge = new TextFieldEditUndoBehavior("NeverMerge", 2);

    private static final /* synthetic */ TextFieldEditUndoBehavior[] $values() {
        return new TextFieldEditUndoBehavior[]{MergeIfPossible, ClearHistory, NeverMerge};
    }

    static {
        TextFieldEditUndoBehavior[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private TextFieldEditUndoBehavior(String str, int i11) {
    }

    @k
    public static a<TextFieldEditUndoBehavior> getEntries() {
        return $ENTRIES;
    }

    public static TextFieldEditUndoBehavior valueOf(String str) {
        return (TextFieldEditUndoBehavior) Enum.valueOf(TextFieldEditUndoBehavior.class, str);
    }

    public static TextFieldEditUndoBehavior[] values() {
        return (TextFieldEditUndoBehavior[]) $VALUES.clone();
    }
}
