package com.baicizhan.main.wikiv2.studyv2.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class EntryPage {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ EntryPage[] $VALUES;

    @m80.k
    private final String page;
    public static final EntryPage RECITE_PAGE = new EntryPage("RECITE_PAGE", 0, "recite_page");
    public static final EntryPage WORD_SEARCH_RESULT = new EntryPage("WORD_SEARCH_RESULT", 1, "word_search_result");
    public static final EntryPage MY_WORD_BOOK_LIST = new EntryPage("MY_WORD_BOOK_LIST", 2, "my_word_book_list");
    public static final EntryPage WORD_LIST = new EntryPage("WORD_LIST", 3, "word_list");
    public static final EntryPage SELF_TEST = new EntryPage("SELF_TEST", 4, "selftest");
    public static final EntryPage SELF_TRAINING = new EntryPage("SELF_TRAINING", 5, "selftraining");
    public static final EntryPage WALKMAN = new EntryPage("WALKMAN", 6, "walkman");
    public static final EntryPage OTHER_WIKI = new EntryPage("OTHER_WIKI", 7, "other_wiki");
    public static final EntryPage H5_PAGE = new EntryPage("H5_PAGE", 8, "h5");
    public static final EntryPage PAST_EXAM_HELPER_COLLECT_PAGE = new EntryPage("PAST_EXAM_HELPER_COLLECT_PAGE", 9, "pastexam_helper_collect_page");

    private static final /* synthetic */ EntryPage[] $values() {
        return new EntryPage[]{RECITE_PAGE, WORD_SEARCH_RESULT, MY_WORD_BOOK_LIST, WORD_LIST, SELF_TEST, SELF_TRAINING, WALKMAN, OTHER_WIKI, H5_PAGE, PAST_EXAM_HELPER_COLLECT_PAGE};
    }

    static {
        EntryPage[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private EntryPage(String str, int i11, String str2) {
        this.page = str2;
    }

    @m80.k
    public static m00.a<EntryPage> getEntries() {
        return $ENTRIES;
    }

    public static EntryPage valueOf(String str) {
        return (EntryPage) Enum.valueOf(EntryPage.class, str);
    }

    public static EntryPage[] values() {
        return (EntryPage[]) $VALUES.clone();
    }

    @m80.k
    public final String getPage() {
        return this.page;
    }
}
