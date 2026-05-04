package androidx.compose.ui.text;

import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class AnnotationType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ AnnotationType[] $VALUES;
    public static final AnnotationType Paragraph = new AnnotationType("Paragraph", 0);
    public static final AnnotationType Span = new AnnotationType("Span", 1);
    public static final AnnotationType VerbatimTts = new AnnotationType("VerbatimTts", 2);
    public static final AnnotationType Url = new AnnotationType("Url", 3);
    public static final AnnotationType Link = new AnnotationType("Link", 4);
    public static final AnnotationType Clickable = new AnnotationType("Clickable", 5);
    public static final AnnotationType String = new AnnotationType("String", 6);

    private static final /* synthetic */ AnnotationType[] $values() {
        return new AnnotationType[]{Paragraph, Span, VerbatimTts, Url, Link, Clickable, String};
    }

    static {
        AnnotationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private AnnotationType(String str, int i11) {
    }

    @k
    public static m00.a<AnnotationType> getEntries() {
        return $ENTRIES;
    }

    public static AnnotationType valueOf(String str) {
        return (AnnotationType) Enum.valueOf(AnnotationType.class, str);
    }

    public static AnnotationType[] values() {
        return (AnnotationType[]) $VALUES.clone();
    }
}
