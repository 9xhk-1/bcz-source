package com.baicizhan.main.wikiv2.studyv2.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class WikiStyle {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ WikiStyle[] $VALUES;
    public static final WikiStyle SEARCH_WIKI = new WikiStyle("SEARCH_WIKI", 0, "search_wiki");
    public static final WikiStyle STUDY_WIKI = new WikiStyle("STUDY_WIKI", 1, "study_wiki");
    public static final WikiStyle TEST_GUIDE_WIKI = new WikiStyle("TEST_GUIDE_WIKI", 2, "testguide_wiki");

    @m80.k
    private final String style;

    private static final /* synthetic */ WikiStyle[] $values() {
        return new WikiStyle[]{SEARCH_WIKI, STUDY_WIKI, TEST_GUIDE_WIKI};
    }

    static {
        WikiStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private WikiStyle(String str, int i11, String str2) {
        this.style = str2;
    }

    @m80.k
    public static m00.a<WikiStyle> getEntries() {
        return $ENTRIES;
    }

    public static WikiStyle valueOf(String str) {
        return (WikiStyle) Enum.valueOf(WikiStyle.class, str);
    }

    public static WikiStyle[] values() {
        return (WikiStyle[]) $VALUES.clone();
    }

    @m80.k
    public final String getStyle() {
        return this.style;
    }
}
