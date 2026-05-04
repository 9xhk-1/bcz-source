package com.baicizhan.main.home.experiment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class SimpleNavigation {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ SimpleNavigation[] $VALUES;
    public static final SimpleNavigation WINNING = new SimpleNavigation("WINNING", 0);
    public static final SimpleNavigation WINNING_RANK = new SimpleNavigation("WINNING_RANK", 1);
    public static final SimpleNavigation WINNING_TASKS = new SimpleNavigation("WINNING_TASKS", 2);
    public static final SimpleNavigation WORDS_TRAINING = new SimpleNavigation("WORDS_TRAINING", 3);
    public static final SimpleNavigation FAVORITE_BOOKS = new SimpleNavigation("FAVORITE_BOOKS", 4);
    public static final SimpleNavigation SEARCH = new SimpleNavigation("SEARCH", 5);
    public static final SimpleNavigation PUNCH_CARD = new SimpleNavigation("PUNCH_CARD", 6);
    public static final SimpleNavigation WORDS_LIST = new SimpleNavigation("WORDS_LIST", 7);
    public static final SimpleNavigation PLAN_EDIT = new SimpleNavigation("PLAN_EDIT", 8);

    private static final /* synthetic */ SimpleNavigation[] $values() {
        return new SimpleNavigation[]{WINNING, WINNING_RANK, WINNING_TASKS, WORDS_TRAINING, FAVORITE_BOOKS, SEARCH, PUNCH_CARD, WORDS_LIST, PLAN_EDIT};
    }

    static {
        SimpleNavigation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private SimpleNavigation(String str, int i11) {
    }

    @m80.k
    public static m00.a<SimpleNavigation> getEntries() {
        return $ENTRIES;
    }

    public static SimpleNavigation valueOf(String str) {
        return (SimpleNavigation) Enum.valueOf(SimpleNavigation.class, str);
    }

    public static SimpleNavigation[] values() {
        return (SimpleNavigation[]) $VALUES.clone();
    }
}
