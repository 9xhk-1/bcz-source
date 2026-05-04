package kotlin.text;

import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import u30.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class RegexOption implements g {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ RegexOption[] $VALUES;
    private final int mask;
    private final int value;
    public static final RegexOption IGNORE_CASE = new RegexOption("IGNORE_CASE", 0, 2, 0, 2, null);
    public static final RegexOption MULTILINE = new RegexOption("MULTILINE", 1, 8, 0, 2, null);
    public static final RegexOption LITERAL = new RegexOption("LITERAL", 2, 16, 0, 2, null);
    public static final RegexOption UNIX_LINES = new RegexOption("UNIX_LINES", 3, 1, 0, 2, null);
    public static final RegexOption COMMENTS = new RegexOption("COMMENTS", 4, 4, 0, 2, null);
    public static final RegexOption DOT_MATCHES_ALL = new RegexOption("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
    public static final RegexOption CANON_EQ = new RegexOption("CANON_EQ", 6, 128, 0, 2, null);

    private static final /* synthetic */ RegexOption[] $values() {
        return new RegexOption[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    static {
        RegexOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private RegexOption(String str, int i11, int i12, int i13) {
        this.value = i12;
        this.mask = i13;
    }

    @k
    public static m00.a<RegexOption> getEntries() {
        return $ENTRIES;
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) $VALUES.clone();
    }

    @Override // u30.g
    public int getMask() {
        return this.mask;
    }

    @Override // u30.g
    public int getValue() {
        return this.value;
    }

    public /* synthetic */ RegexOption(String str, int i11, int i12, int i13, int i14, v vVar) {
        this(str, i11, i12, (i14 & 2) != 0 ? i12 : i13);
    }
}
