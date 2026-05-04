package com.baicizhan.main.word_book.list;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class FavoriteAddingMode {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ FavoriteAddingMode[] $VALUES;
    public static final FavoriteAddingMode DESCRIPTION = new FavoriteAddingMode("DESCRIPTION", 0);
    public static final FavoriteAddingMode DESCRIPTION_AND_CAM = new FavoriteAddingMode("DESCRIPTION_AND_CAM", 1);
    public static final FavoriteAddingMode CAM_OCR = new FavoriteAddingMode("CAM_OCR", 2);

    private static final /* synthetic */ FavoriteAddingMode[] $values() {
        return new FavoriteAddingMode[]{DESCRIPTION, DESCRIPTION_AND_CAM, CAM_OCR};
    }

    static {
        FavoriteAddingMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private FavoriteAddingMode(String str, int i11) {
    }

    @m80.k
    public static m00.a<FavoriteAddingMode> getEntries() {
        return $ENTRIES;
    }

    public static FavoriteAddingMode valueOf(String str) {
        return (FavoriteAddingMode) Enum.valueOf(FavoriteAddingMode.class, str);
    }

    public static FavoriteAddingMode[] values() {
        return (FavoriteAddingMode[]) $VALUES.clone();
    }
}
