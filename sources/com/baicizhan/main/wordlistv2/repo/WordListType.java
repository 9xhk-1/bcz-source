package com.baicizhan.main.wordlistv2.repo;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class WordListType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ WordListType[] $VALUES;
    public static final WordListType KILLED;
    public static final WordListType LEARNING;
    public static final WordListType MASTERED;
    public static final WordListType TODAY;
    public static final WordListType TO_STUDY;

    @m80.k
    private final EditAction editAction;

    @m80.k
    private final List<OrderType> orderOptionList;

    @m80.k
    private final String pageDesc;
    private final int type;

    private static final /* synthetic */ WordListType[] $values() {
        return new WordListType[]{TODAY, TO_STUDY, LEARNING, MASTERED, KILLED};
    }

    static {
        EditAction editAction = EditAction.KILL;
        TODAY = new WordListType("TODAY", 0, 0, editAction, k.e(), "today");
        TO_STUDY = new WordListType("TO_STUDY", 1, 1, editAction, k.d(), "unlearned");
        LEARNING = new WordListType("LEARNING", 2, 2, editAction, k.b(), "learning");
        MASTERED = new WordListType("MASTERED", 3, 3, EditAction.RELEARN, k.c(), "learned");
        KILLED = new WordListType("KILLED", 4, 4, EditAction.UNKILL, k.a(), "hashed");
        WordListType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private WordListType(String str, int i11, int i12, EditAction editAction, List list, String str2) {
        this.type = i12;
        this.editAction = editAction;
        this.orderOptionList = list;
        this.pageDesc = str2;
    }

    @m80.k
    public static m00.a<WordListType> getEntries() {
        return $ENTRIES;
    }

    public static WordListType valueOf(String str) {
        return (WordListType) Enum.valueOf(WordListType.class, str);
    }

    public static WordListType[] values() {
        return (WordListType[]) $VALUES.clone();
    }

    @m80.k
    public final EditAction getEditAction() {
        return this.editAction;
    }

    @m80.k
    public final List<OrderType> getOrderOptionList() {
        return this.orderOptionList;
    }

    @m80.k
    public final String getPageDesc() {
        return this.pageDesc;
    }

    public final int getType() {
        return this.type;
    }
}
