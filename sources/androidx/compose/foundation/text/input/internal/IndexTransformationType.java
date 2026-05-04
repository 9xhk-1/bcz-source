package androidx.compose.foundation.text.input.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class IndexTransformationType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ IndexTransformationType[] $VALUES;
    public static final IndexTransformationType Untransformed = new IndexTransformationType("Untransformed", 0);
    public static final IndexTransformationType Insertion = new IndexTransformationType("Insertion", 1);
    public static final IndexTransformationType Replacement = new IndexTransformationType("Replacement", 2);
    public static final IndexTransformationType Deletion = new IndexTransformationType("Deletion", 3);

    private static final /* synthetic */ IndexTransformationType[] $values() {
        return new IndexTransformationType[]{Untransformed, Insertion, Replacement, Deletion};
    }

    static {
        IndexTransformationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private IndexTransformationType(String str, int i11) {
    }

    @m80.k
    public static m00.a<IndexTransformationType> getEntries() {
        return $ENTRIES;
    }

    public static IndexTransformationType valueOf(String str) {
        return (IndexTransformationType) Enum.valueOf(IndexTransformationType.class, str);
    }

    public static IndexTransformationType[] values() {
        return (IndexTransformationType[]) $VALUES.clone();
    }
}
