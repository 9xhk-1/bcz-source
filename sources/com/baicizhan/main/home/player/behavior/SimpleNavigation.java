package com.baicizhan.main.home.player.behavior;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class SimpleNavigation {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SimpleNavigation[] $VALUES;
    public static final SimpleNavigation WINNING = new SimpleNavigation("WINNING", 0);
    public static final SimpleNavigation WINNING_RANK = new SimpleNavigation("WINNING_RANK", 1);
    public static final SimpleNavigation WINNING_TASKS = new SimpleNavigation("WINNING_TASKS", 2);
    public static final SimpleNavigation SEARCH = new SimpleNavigation("SEARCH", 3);
    public static final SimpleNavigation FAVORITE_BOOKS = new SimpleNavigation("FAVORITE_BOOKS", 4);
    public static final SimpleNavigation PUNCH_CARD = new SimpleNavigation("PUNCH_CARD", 5);
    public static final SimpleNavigation WORDS_LIST = new SimpleNavigation("WORDS_LIST", 6);
    public static final SimpleNavigation PLAN_EDIT = new SimpleNavigation("PLAN_EDIT", 7);
    public static final SimpleNavigation SCAN = new SimpleNavigation("SCAN", 8);
    public static final SimpleNavigation MINE_USER_CENTER = new SimpleNavigation("MINE_USER_CENTER", 9);
    public static final SimpleNavigation MINE_USER_GRADE_EDIT = new SimpleNavigation("MINE_USER_GRADE_EDIT", 10);
    public static final SimpleNavigation MINE_VOCABULARY_LISTENING_TEST = new SimpleNavigation("MINE_VOCABULARY_LISTENING_TEST", 11);
    public static final SimpleNavigation MINE_VOCABULARY_READING_TEST = new SimpleNavigation("MINE_VOCABULARY_READING_TEST", 12);
    public static final SimpleNavigation NOTIFICATION = new SimpleNavigation("NOTIFICATION", 13);
    public static final SimpleNavigation LEARNING_CONFIGURATION = new SimpleNavigation("LEARNING_CONFIGURATION", 14);
    public static final SimpleNavigation FEEDBACK = new SimpleNavigation("FEEDBACK", 15);
    public static final SimpleNavigation ABOUT = new SimpleNavigation("ABOUT", 16);

    private static final /* synthetic */ SimpleNavigation[] $values() {
        return new SimpleNavigation[]{WINNING, WINNING_RANK, WINNING_TASKS, SEARCH, FAVORITE_BOOKS, PUNCH_CARD, WORDS_LIST, PLAN_EDIT, SCAN, MINE_USER_CENTER, MINE_USER_GRADE_EDIT, MINE_VOCABULARY_LISTENING_TEST, MINE_VOCABULARY_READING_TEST, NOTIFICATION, LEARNING_CONFIGURATION, FEEDBACK, ABOUT};
    }

    static {
        SimpleNavigation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private SimpleNavigation(String str, int i11) {
    }

    @k
    public static a<SimpleNavigation> getEntries() {
        return $ENTRIES;
    }

    public static SimpleNavigation valueOf(String str) {
        return (SimpleNavigation) Enum.valueOf(SimpleNavigation.class, str);
    }

    public static SimpleNavigation[] values() {
        return (SimpleNavigation[]) $VALUES.clone();
    }
}
