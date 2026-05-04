package androidx.compose.ui.contentcapture;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ContentCaptureEventType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ ContentCaptureEventType[] $VALUES;
    public static final ContentCaptureEventType VIEW_APPEAR = new ContentCaptureEventType("VIEW_APPEAR", 0);
    public static final ContentCaptureEventType VIEW_DISAPPEAR = new ContentCaptureEventType("VIEW_DISAPPEAR", 1);

    private static final /* synthetic */ ContentCaptureEventType[] $values() {
        return new ContentCaptureEventType[]{VIEW_APPEAR, VIEW_DISAPPEAR};
    }

    static {
        ContentCaptureEventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private ContentCaptureEventType(String str, int i11) {
    }

    @m80.k
    public static m00.a<ContentCaptureEventType> getEntries() {
        return $ENTRIES;
    }

    public static ContentCaptureEventType valueOf(String str) {
        return (ContentCaptureEventType) Enum.valueOf(ContentCaptureEventType.class, str);
    }

    public static ContentCaptureEventType[] values() {
        return (ContentCaptureEventType[]) $VALUES.clone();
    }
}
